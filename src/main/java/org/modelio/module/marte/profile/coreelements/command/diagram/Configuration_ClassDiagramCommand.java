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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.coreelements.model.Configuration_Class;

@objid ("89473954-ee53-4f05-a86c-7cdfe4d9369a")
public class Configuration_ClassDiagramCommand extends DefaultBoxTool {
    @objid ("57255aa3-1fe3-4bc4-b883-6e6a304e7640")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        /* Audit constraints adding */
        if (owner instanceof Enumeration || owner instanceof Node || owner instanceof Collaboration || owner instanceof Actor || owner instanceof UseCase || owner instanceof Signal) {
            return false;
        }
        
        if(owner instanceof ModelTree || owner instanceof TemplateParameter){
            return true;
        }
        return false;
    }

    @objid ("90e11b9a-b92e-4297-ac5c-293389d49ade")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try( ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Configuration_ClassDiagramCommand")){
        
            ModelElement parent = null;
        
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            Configuration_Class proxy = new Configuration_Class();
        
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
