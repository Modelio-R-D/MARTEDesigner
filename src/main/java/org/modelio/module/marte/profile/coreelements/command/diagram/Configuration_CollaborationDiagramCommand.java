package org.modelio.module.marte.profile.coreelements.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.coreelements.model.Configuration_Collaboration;

@objid ("0077c33d-f9f6-4787-823d-1996f4bd1de6")
public class Configuration_CollaborationDiagramCommand extends DefaultBoxTool {
    @objid ("53cf2320-e606-4d69-b476-3b9ae0760d2e")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        /* Audit constraints adding */
        if (owner instanceof Enumeration || owner instanceof Class || owner instanceof Node || owner instanceof Collaboration) {
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

    @objid ("db5bde44-0e3f-46a5-a6ae-c212fcb188a8")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Configuration_CollaborationDiagramCommand")){
        
            ModelElement parent = null;
        
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            Configuration_Collaboration proxy = new Configuration_Collaboration();
        
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
