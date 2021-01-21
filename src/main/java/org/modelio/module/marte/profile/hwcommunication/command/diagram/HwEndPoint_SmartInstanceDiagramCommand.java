package org.modelio.module.marte.profile.hwcommunication.command.diagram;

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
import org.modelio.module.marte.profile.hwcommunication.model.HwEndPoint_BindableInstance;
import org.modelio.module.marte.profile.hwcommunication.model.HwEndPoint_Instance;

@objid ("25ebaeb4-d00b-4949-80f8-7a55736b4835")
public class HwEndPoint_SmartInstanceDiagramCommand extends DefaultBoxTool {
    @objid ("8b8d5b2f-6c03-4fc4-9c52-f8ee7b307d21")
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

    @objid ("a7de0669-abaf-444c-9393-ede38166ea3a")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("HwEndPoint_BindableInstanceCommand")){
        
        
        
            ModelElement parent = null;
        
             if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
            ModelElement elt = null;
        
            if(parent instanceof Instance){
                HwEndPoint_BindableInstance proxy = new HwEndPoint_BindableInstance();
                proxy.setParent((BindableInstance) parent);
                elt =  proxy.getElement();
            }
            else if(parent instanceof Classifier){
                HwEndPoint_BindableInstance proxy = new HwEndPoint_BindableInstance();
                proxy.setParent((Classifier) parent);
                elt =  proxy.getElement();
            }
            else if(parent instanceof NameSpace){
                HwEndPoint_Instance proxy = new HwEndPoint_Instance();
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
