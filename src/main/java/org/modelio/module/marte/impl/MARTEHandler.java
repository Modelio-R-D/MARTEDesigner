package org.modelio.module.marte.impl;

import java.util.List;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.event.IElementDeletedEvent;
import org.modelio.api.modelio.model.event.IModelChangeEvent;
import org.modelio.api.modelio.model.event.IModelChangeHandler;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerNoteTypes;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("f11684a5-dadb-47d3-b9cf-83d9e98b84b4")
public class MARTEHandler implements IModelChangeHandler {
    @objid ("5c86bfa8-dcc2-451e-8b3f-ca7478b66199")
    private void updateAllocated(ModelElement element) {
        Stereotype allocatedSter = MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions()
                .getStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.ALLOCATED_MODELELEMENT, element.getMClass());
        
        
        boolean findAllocation = false;
        
        for (Dependency deps : element.getDependsOnDependency()){
            if (deps.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.ALLOCATE_DEPENDENCY)){
                findAllocation = true;
                break;
            }
        }
        
        for (Dependency deps : element.getImpactedDependency()){
            if (deps.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.ALLOCATE_DEPENDENCY)){
                findAllocation = true;
                break;
            }
        }
        
        if ((findAllocation) && !(element.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.ALLOCATED_MODELELEMENT)))
            element.getExtension().add(allocatedSter);
        else if (!(findAllocation) && (element.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.ALLOCATED_MODELELEMENT)))
            element.getExtension().remove(allocatedSter);
    }

    @objid ("3fac9e34-1a4e-4f14-b471-b4566787677b")
    private void deleteAllocated(ModelElement element) {
        int allocations = 0;
        
        for (Dependency deps : element.getDependsOnDependency()){
            if (deps.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.ALLOCATE_DEPENDENCY)){
                allocations++;
            }
        }
        
        for (Dependency deps : element.getImpactedDependency()){
            if (deps.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.ALLOCATE_DEPENDENCY)){
                allocations++;
            }
        }
        
        if (allocations == 0){
            Stereotype allocatedSter = MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions()
                    .getStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.ALLOCATED_MODELELEMENT, element.getMClass());
            element.getExtension().remove(allocatedSter);
        }
    }

    @objid ("4a3dcd7d-81fe-41bc-af32-0fed1d76ba10")
    @Override
    public void handleModelChange(IModelingSession session, IModelChangeEvent event) {
        List<IElementDeletedEvent> deleted_elements =  event.getDeleteEvents();
        
        //deleted elements
        for (IElementDeletedEvent eltDel : deleted_elements) {
        
            MObject element = eltDel.getDeletedElement();
        
            if (element instanceof Dependency){
                Dependency dep = (Dependency) element;
        
                ModelElement source = dep.getDependsOn();
                if (source.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.ALLOCATED_MODELELEMENT)){
                    deleteAllocated(source);
                }
        
                ModelElement target = dep.getImpacted();
                if (target.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.ALLOCATED_MODELELEMENT)){
                    deleteAllocated(target);
                }
        
            }
        }
        
        //updated elements
        for (MObject elt : event.getUpdateEvents()) {
        
            if (elt instanceof Dependency){
                Dependency dep = (Dependency) elt;
        
                updateAllocated(dep.getDependsOn());
                updateAllocated(dep.getImpacted());
        
            }else if (elt instanceof ModelElement){
                updateAllocated((ModelElement)elt);
            }
        }
        
        
        //created elements
        Set<MObject> createdElements =  event.getCreationEvents();
        for (MObject createdElement : createdElements){
            if (createdElement instanceof Note ){
                Note createdNode = (Note) createdElement;
                String label = createdNode.getModel().getName();
        
                if (label.equals(MARTEDesignerNoteTypes.MODELELEMENT_TIMEDOBSERVATION) ){
                    createdNode.getExtension().add(MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions().getStereotype(
                            IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.TIMEDDURATIONOBSERVATION_NOTE, createdNode.getMClass()));
                }
                else if (label.equals(MARTEDesignerNoteTypes.MODELELEMENT_ASSIGN) ){
                    createdNode.getExtension().add(MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions().getStereotype(
                            IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.ASSIGN_NOTE, createdNode.getMClass()));
                }
                else if (label.equals(MARTEDesignerNoteTypes.RTFEATURE_CALLACTION_RTFEATURE_CALLACTION_SPECIFICATION)
                        || label.equals(MARTEDesignerNoteTypes.RTFEATURE_MESSAGE_RTFEATURE_MESSAGE_SPECIFICATION)
                        || label.equals(MARTEDesignerNoteTypes.RTFEATURE_OPAQUEACTION_RTFEATURE_OPAQUEACTION_SPECIFICATION)
                        || label.equals(MARTEDesignerNoteTypes.RTFEATURE_OPERATION_RTFEATURE_OPERATION_SPECIFICATION)
                        || label.equals(MARTEDesignerNoteTypes.RTFEATURE_PORT_RTFEATURE_PORT_SPECIFICATION)
                        || label.equals(MARTEDesignerNoteTypes.RTFEATURE_SENDSIGNALACTION_RTFEATURE_SENDSIGNALACTION_SPECIFICATION)
                        || label.equals(MARTEDesignerNoteTypes.RTFEATURE_SIGNAL_RTFEATURE_SIGNAL_SPECIFICATION)){
                    createdNode.getExtension().add(MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions().getStereotype(
                            IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.RTSPECIFICATION_NOTE, createdNode.getMClass()));
                }
        
            }else  if (createdElement instanceof Dependency){
                Dependency dep = (Dependency) createdElement;
        
                updateAllocated(dep.getDependsOn());
                updateAllocated(dep.getImpacted());
        
            }
        }
    }

}
