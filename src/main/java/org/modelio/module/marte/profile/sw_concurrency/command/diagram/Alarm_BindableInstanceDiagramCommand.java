package org.modelio.module.marte.profile.sw_concurrency.command.diagram;

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
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_concurrency.model.Alarm_BindableInstance;

@objid ("2f1ce1ee-7086-4714-b8a6-ee49555391c2")
public class Alarm_BindableInstanceDiagramCommand extends DefaultBoxTool {
    @objid ("5b97928c-a0ce-4d84-bd1b-2fa41c7038cc")
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

    @objid ("0c45de8d-e30a-470a-abb8-174aebcedfb0")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Alarm_BindableInstanceCommand")){
        
        
        
            ModelElement parent = null;
        
             if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            Alarm_BindableInstance proxy = new Alarm_BindableInstance();
        
            if(parent instanceof Instance){
                proxy.setParent((Instance) parent);
            }
            if(parent instanceof Classifier){
                proxy.setParent((Classifier) parent);
            }
            if(parent instanceof NameSpace){
                proxy.setParent((NameSpace) parent);
            }
            if(parent instanceof TemplateParameter){
                proxy.setParent((TemplateParameter) parent);
            }
        
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
            
            diagramHandle.unmask(proxy.getElement(), rec.x, rec.y);
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
            
           
            
        
           
                
        }
    }

}
