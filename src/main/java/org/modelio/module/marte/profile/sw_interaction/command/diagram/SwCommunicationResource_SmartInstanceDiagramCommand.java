package org.modelio.module.marte.profile.sw_interaction.command.diagram;

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
import org.modelio.module.marte.profile.sw_interaction.model.SwCommunicationResource_BindableInstance;
import org.modelio.module.marte.profile.sw_interaction.model.SwCommunicationResource_Instance;

@objid ("6e2a3753-7d7c-44b8-890d-f17a65402cb7")
public class SwCommunicationResource_SmartInstanceDiagramCommand extends DefaultBoxTool {
    @objid ("696d9a19-97ee-4792-8065-2b6e4c969b4d")
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

    @objid ("2256db94-af24-4bb5-8879-2ba73822ed18")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("SwCommunicationResource_BindableInstanceCommand")){
        
        
            
              ModelElement parent = null;
            
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
            
        ModelElement elt = null;
            
            if(parent instanceof Instance){
                SwCommunicationResource_BindableInstance proxy = new SwCommunicationResource_BindableInstance();
                proxy.setParent((BindableInstance) parent);
                elt =  proxy.getElement();
            }
            else if(parent instanceof Classifier){
                SwCommunicationResource_BindableInstance proxy = new SwCommunicationResource_BindableInstance();
                proxy.setParent((Classifier) parent);
                elt =  proxy.getElement();
            }
            else if(parent instanceof NameSpace){
                SwCommunicationResource_Instance proxy = new SwCommunicationResource_Instance();
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
