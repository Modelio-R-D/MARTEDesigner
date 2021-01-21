package org.modelio.module.marte.profile.grm.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.TimerResource_BindableInstance;
import org.modelio.module.marte.profile.grm.model.TimerResource_Instance;

@objid ("a855e6e1-ccf5-4b72-8541-ef74816c4e30")
public class TimerResource_SmartInstanceDiagramCommand extends DefaultBoxTool {
    @objid ("3d94e9a9-c76b-4c88-be4a-149b1c767570")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        
        if(owner instanceof Classifier){
            return true;
        }  
        if(owner instanceof Instance){
            return true;
        }  
        
        if(owner instanceof NameSpace){
            return true;
        }
        return false;
    }

    @objid ("2ffecbcd-b7ac-48ab-ba21-69ad3243ce43")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TimerResource_BindableInstance")){
        
        
        
            ModelElement parent = null;
        
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            Element elt = null;
        
            if(parent instanceof Classifier){
                TimerResource_BindableInstance proxy = new TimerResource_BindableInstance();
                proxy.setParent((Classifier) parent);
                elt = proxy.getElement();
            }else if(parent instanceof Instance){
                TimerResource_BindableInstance proxy = new TimerResource_BindableInstance();
                proxy.setParent((Instance) parent);
                elt = proxy.getElement();
            }else if(parent instanceof NameSpace){
                TimerResource_Instance proxy = new TimerResource_Instance();
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
