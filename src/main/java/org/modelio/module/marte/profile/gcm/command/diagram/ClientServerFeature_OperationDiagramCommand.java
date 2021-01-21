package org.modelio.module.marte.profile.gcm.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.gcm.model.ClientServerFeature_Operation;

@objid ("e7422f52-c09f-4422-b60a-c6bbb0b20542")
public class ClientServerFeature_OperationDiagramCommand extends DefaultBoxTool {
    @objid ("4680fc8b-a07a-4acb-b120-a5265d9942d6")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        
        if(owner.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLIENTSERVERSPECIFICATION_INTERFACE)){
            return true;
        }
        return false;
    }

    @objid ("d344c17b-7d73-449e-a60f-8bf737c30aea")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode, Rectangle rec) {
        try (ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("ClientServerFeature_OperationCommand")){
        
            ModelElement parent = null;
        
            if(targetNode.getElement() instanceof AbstractDiagram){
                parent = diagramHandle.getDiagram().getOrigin();
            }else{
                parent = (ModelElement)targetNode.getElement();
            }
        
            ClientServerFeature_Operation proxy = new ClientServerFeature_Operation();
        
            if(parent instanceof Interface){
                proxy.setParent((Interface) parent);
            }  
        
            MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().getDefaultNameService().setDefaultName(proxy.getElement(),proxy.getElement().getName());
        
        
        
            diagramHandle.unmask(proxy.getElement(), rec.x, rec.y);
        
        
            diagramHandle.save();
            diagramHandle.close();
            tr.commit();
        
        }
    }

}
