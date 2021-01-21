package org.modelio.module.marte.profile.hwmemory.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwmemory.model.HwROM_BindableInstance;
import org.modelio.module.marte.profile.hwmemory.model.HwROM_Instance;

@objid ("4f3ce226-03f2-4c34-a9c9-e7da6436819b")
public class HwROM_SmartInstanceDiagramCommand extends DefaultBoxTool {
    @objid ("6b72a8a8-e422-4cc9-83d1-ad383aba0640")
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

    @objid ("70eaf8ec-72de-4c8c-8b84-d0d6c00e7c63")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwROM_BindableInstanceCommand")){
        
        
        
            ModelElement parent = null;
        
             if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            ModelElement elt = null;
        
            if(parent instanceof Instance){
                HwROM_BindableInstance proxy = new HwROM_BindableInstance();
                proxy.setParent((BindableInstance) parent);
                elt =  proxy.getElement();
            }
            else if(parent instanceof Classifier){
                HwROM_BindableInstance proxy = new HwROM_BindableInstance();
                proxy.setParent((Classifier) parent);
                elt =  proxy.getElement();
            }
            else if(parent instanceof NameSpace){
                HwROM_Instance proxy = new HwROM_Instance();
                proxy.setParent((NameSpace) parent);
                elt =  proxy.getElement();
            }
        
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(elt, elt.getName());
        
            
            diagramHandle.unmask(elt, rec.x, rec.y);
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
            
              
         
            
        
           
                
        }
    }

}
