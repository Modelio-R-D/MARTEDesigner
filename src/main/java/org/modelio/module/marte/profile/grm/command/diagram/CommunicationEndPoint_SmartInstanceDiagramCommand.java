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
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_BindableInstance;
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_Instance;

@objid ("a7214cf7-1ce3-4260-8264-7014825eaebb")
public class CommunicationEndPoint_SmartInstanceDiagramCommand extends DefaultBoxTool {
    @objid ("74fc1212-f742-480e-8b5f-2b603e6773b4")
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

    @objid ("9285a87d-7338-4010-b23b-96f96e7508e6")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("CommunicationEndPoint_BindableInstance")){
        
        
        
            ModelElement parent = null;
        
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            Element elt = null;
        
            if(parent instanceof Classifier){
                CommunicationEndPoint_BindableInstance proxy = new CommunicationEndPoint_BindableInstance();
                proxy.setParent((Classifier) parent);
                elt = proxy.getElement();
            }else if(parent instanceof Instance){
                CommunicationEndPoint_BindableInstance proxy = new CommunicationEndPoint_BindableInstance();
                proxy.setParent((Instance) parent);
                elt = proxy.getElement();
            }else if(parent instanceof NameSpace){
                CommunicationEndPoint_Instance proxy = new CommunicationEndPoint_Instance();
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
