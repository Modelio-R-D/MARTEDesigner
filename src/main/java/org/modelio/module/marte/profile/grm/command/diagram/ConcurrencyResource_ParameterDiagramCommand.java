package org.modelio.module.marte.profile.grm.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ConcurrencyResource_Parameter;

@objid ("ff949964-aaf0-4c91-a792-f49f6bad0f8a")
public class ConcurrencyResource_ParameterDiagramCommand extends DefaultBoxTool {
    @objid ("bd25662d-5af4-4369-875e-c6eb491252b7")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        
         if(owner instanceof Operation){
            return true;
        }  
         if(owner instanceof Operation){
            return true;
        }  
         if(owner instanceof TemplateParameter){
            return true;
        }
        return false;
    }

    @objid ("27851960-e1d7-4dd8-89f3-80f87fe57119")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("ConcurrencyResource_ParameterCommand")){
        
        
            
              ModelElement parent = null;
            
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
            
            ConcurrencyResource_Parameter proxy = new ConcurrencyResource_Parameter();
        
        if(parent instanceof Operation){
            proxy.setParent((Operation) parent);
        }
        if(parent instanceof Operation){
            proxy.setParent((Operation) parent);
        }
        if(parent instanceof TemplateParameter){
            proxy.setParent((TemplateParameter) parent);
        }
            
            
            diagramHandle.unmask(proxy.getElement(), rec.x, rec.y);
            
            
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}