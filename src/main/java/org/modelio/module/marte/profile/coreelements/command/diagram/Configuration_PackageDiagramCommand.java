package org.modelio.module.marte.profile.coreelements.command.diagram;

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
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.coreelements.model.Configuration_Package;

@objid ("9646a3cf-b15b-4d4e-ac46-f42219a86eed")
public class Configuration_PackageDiagramCommand extends DefaultBoxTool {
    @objid ("57af10ad-c0f0-40b2-84c5-7323b19eef17")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        /* Audit Constraints Adding */
        if (owner instanceof Enumeration || owner instanceof Class || owner instanceof Node || owner instanceof Collaboration || owner instanceof Actor || owner instanceof UseCase || owner instanceof Signal || owner instanceof Interface) {
            return false;
        }
         if(owner instanceof ModelTree){
            return true;
        }  
         if(owner instanceof TemplateParameter){
            return true;
        }
        return false;
    }

    @objid ("322ad4ee-766f-4ff6-b813-14d849406eca")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try( ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Configuration_PackageDiagramCommand")){
            
              ModelElement parent = null;
            
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
            
            Configuration_Package proxy = new Configuration_Package();
        
        if(parent instanceof ModelTree){
            proxy.setParent((ModelTree) parent);
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
