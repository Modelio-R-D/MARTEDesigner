package org.modelio.module.marte.profile.hwcomputing.command.diagram;

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
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcomputing.model.HwComputingResource_BindableInstance;
import org.modelio.module.marte.profile.hwcomputing.model.HwComputingResource_Instance;

@objid ("a1546cdf-079e-4cad-bb3d-b00a609ef2ff")
public class HwComputingResource_SmartInstanceDiagramCommand extends DefaultBoxTool {
    @objid ("6acbdfe5-2bec-4274-846e-8b3277968863")
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
        if((owner instanceof Instance) && !(owner instanceof Port)){
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

    @objid ("7a31d6a2-f234-4346-bc12-03f3169d0076")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwComputingResource_BindableInstanceCommand")){
        
        
        
            ModelElement parent = null;
        
             if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            ModelElement elt = null;
            
            if(parent instanceof Instance){
                HwComputingResource_BindableInstance proxy = new HwComputingResource_BindableInstance();
                proxy.setParent((BindableInstance) parent);
                elt =  proxy.getElement();
            }
            else if(parent instanceof Classifier){
                HwComputingResource_BindableInstance proxy = new HwComputingResource_BindableInstance();
                proxy.setParent((Classifier) parent);
                elt =  proxy.getElement();
            }
            else if(parent instanceof NameSpace){
                HwComputingResource_Instance proxy = new HwComputingResource_Instance();
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
