package org.modelio.module.marte.profile.grm.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Scheduler_BindableInstance;
import org.modelio.module.marte.profile.grm.model.Scheduler_Instance;

@objid ("a57540f1-0eea-493a-a583-a46c4bb6961c")
public class Scheduler_SmartInstanceDiagramCommand extends DefaultBoxTool {
    @objid ("cb5e10f4-59d1-43cf-b2e6-912ba3f10583")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
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

    @objid ("bbf62602-5e06-4f64-9a4f-e351ae858ea5")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Scheduler_BindableInstanceCommand")){
        
        
            
              ModelElement parent = null;
            
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
            
            ModelElement elt = null;
            
            if(parent instanceof Instance){
                Scheduler_BindableInstance proxy = new Scheduler_BindableInstance();
                proxy.setParent((Instance) parent);
                elt = proxy.getElement();
            }else if(parent instanceof Classifier){
                 Scheduler_BindableInstance proxy = new Scheduler_BindableInstance();
                proxy.setParent((Classifier) parent);
                elt = proxy.getElement();
            }else if(parent instanceof Package){
                Scheduler_Instance proxy = new Scheduler_Instance();
                proxy.setParent((NameSpace) parent);
                elt = proxy.getElement();
            }
            
            
            diagramHandle.unmask(elt, rec.x, rec.y);
            
            
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
