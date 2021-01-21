package org.modelio.module.marte.profile.grm.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.MutualExclusionResource_BindableInstance;
import org.modelio.module.marte.profile.grm.model.MutualExclusionResource_Instance;

@objid ("6225aae0-428d-4d04-8d1f-def5879a5e3c")
public class MutualExclusionResource_SmartInstanceDiagramCommand extends DefaultBoxTool {
    @objid ("e2028392-0285-4a17-9091-1f7e03942d39")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        if(owner instanceof TemplateParameter || owner instanceof Signal || owner instanceof Enumeration){
            return false;
        }
        if(owner instanceof Instance){
            return true;
        }  
        if(owner instanceof Classifier){
            return true;
        }  
        if(owner instanceof NameSpace){
            return true;
        }
        return false;
    }

    @objid ("a5981d59-15a1-48de-821b-1b8786090c8f")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("MutualExclusionResource_BindableInstanceCommand")){
        
        
        
            ModelElement parent = null;
        
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
        
            ModelElement elt = null;
        
            if(parent instanceof Instance){
                MutualExclusionResource_BindableInstance proxy = new MutualExclusionResource_BindableInstance();
                proxy.setParent((Instance) parent);
                elt = proxy.getElement();
            }else if(parent instanceof Classifier){
                MutualExclusionResource_BindableInstance proxy = new MutualExclusionResource_BindableInstance();
                proxy.setParent((Classifier) parent);
                elt = proxy.getElement();
            }else if(parent instanceof Package){
                MutualExclusionResource_Instance proxy = new MutualExclusionResource_Instance();
                proxy.setParent((NameSpace) parent);
                elt = proxy.getElement();
            }
        
            if (elt != null){
                
                MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(elt, elt.getName());
        
                diagramHandle.unmask(elt, rec.x, rec.y);
                diagramHandle.save();
                diagramHandle.close();
                tr.commit();
            }
        
        }
    }

}
