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
import org.modelio.module.marte.profile.grm.model.TimingResource_BindableInstance;
import org.modelio.module.marte.profile.grm.model.TimingResource_Instance;

@objid ("87a535fe-cd42-439a-8d1a-62c0f2daedbc")
public class TimingResource_SmartInstanceDiagramCommand extends DefaultBoxTool {
    @objid ("e5113caf-c9b2-4010-b0c8-a63d95b2a322")
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

    @objid ("1422f72f-ec30-4951-b1fb-2a21e5559d74")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TimingResource_BindableInstance")){
        
        
        
            ModelElement parent = null;
        
             if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            Element elt = null;
        
            if(parent instanceof Classifier){
                TimingResource_BindableInstance proxy = new TimingResource_BindableInstance();
                proxy.setParent((Classifier) parent);
                elt = proxy.getElement();
            }else if(parent instanceof Instance){
                TimingResource_BindableInstance proxy = new TimingResource_BindableInstance();
                proxy.setParent((Instance) parent);
                elt = proxy.getElement();
            }else if(parent instanceof NameSpace){
                TimingResource_Instance proxy = new TimingResource_Instance();
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
