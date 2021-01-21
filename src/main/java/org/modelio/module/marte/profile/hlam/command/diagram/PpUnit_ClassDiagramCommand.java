package org.modelio.module.marte.profile.hlam.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hlam.model.PpUnit_Class;

@objid ("65e9c6cb-04f6-41b9-9168-7e84cb8e23ee")
public class PpUnit_ClassDiagramCommand extends DefaultBoxTool {
    @objid ("bacbb813-2c4c-408b-bc22-ec41b72df106")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
         if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        if (owner instanceof Enumeration || owner instanceof Node || owner instanceof Collaboration || owner instanceof Actor || owner instanceof UseCase || owner instanceof Signal) {
            return false;
        }
        
        if(owner instanceof NameSpace){
            return true;
        }
        return false;
    }

    @objid ("949e26e4-ef34-49c7-88cb-3d4d132ac253")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("PpUnit_ClassCommand")){
        
        
        
            ModelElement parent = null;
        
             if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            PpUnit_Class proxy = new PpUnit_Class();
        
            if(parent instanceof NameSpace){
                proxy.setParent((NameSpace) parent);
            }
            if(parent instanceof TemplateParameter){
                proxy.setParent((TemplateParameter) parent);
            }
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(), proxy.getElement().getName());
        
            
            diagramHandle.unmask(proxy.getElement(), rec.x, rec.y);
            
        
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
            
              
         
            
        
           
                
        }
    }

}
