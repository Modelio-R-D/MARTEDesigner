package org.modelio.module.marte.profile.hwdevice.command.diagram;

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
import org.modelio.module.marte.profile.hwdevice.model.HwDevice_BindableInstance;
import org.modelio.module.marte.profile.hwdevice.model.HwDevice_Instance;

@objid ("de883dc6-6045-490c-9c8d-bd3cd283770b")
public class HwDevice_SmartInstanceDiagramCommand extends DefaultBoxTool {
    @objid ("4292cfd1-22a3-4e2f-ab76-faeea6dd6ace")
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

    @objid ("278a196a-6e0e-42e5-a55c-c09d62012f5d")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwDevice_BindableInstanceCommand")){
        
        
        
            ModelElement parent = null;
        
             if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            ModelElement elt = null;
        
            if(parent instanceof Instance){
                HwDevice_BindableInstance proxy = new HwDevice_BindableInstance();
                proxy.setParent((BindableInstance) parent);
                elt =  proxy.getElement();
            }
            else if(parent instanceof Classifier){
                HwDevice_BindableInstance proxy = new HwDevice_BindableInstance();
                proxy.setParent((Classifier) parent);
                elt =  proxy.getElement();
            }
            else if(parent instanceof NameSpace){
                HwDevice_Instance proxy = new HwDevice_Instance();
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