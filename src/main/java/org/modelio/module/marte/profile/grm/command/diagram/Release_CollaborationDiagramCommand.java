package org.modelio.module.marte.profile.grm.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.tools.DefaultLinkTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Release_Collaboration;

@objid ("6177232d-29ac-4b72-901c-5f40bef65448")
public class Release_CollaborationDiagramCommand extends DefaultLinkTool {
    @objid ("7e43a611-1796-44c9-983a-c3fd3279c646")
    @Override
    public boolean acceptFirstElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        
        if(owner instanceof Behavior){
            return true;
        }
        return false;
    }

    @objid ("62319635-8377-4ccf-be00-9553f7a67549")
    @Override
    public boolean acceptSecondElement(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode == null){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        
        if(owner instanceof DataFlow){
            return true;
        }
        return false;
    }

    @objid ("6adb24e8-565d-4955-b3fe-672222b62d9e")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind touterType, ILinkPath path) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Release_CollaborationCommand")){
        
            Behavior source = (Behavior)originNode.getElement();
        
            Release_Collaboration proxy = new Release_Collaboration();
            proxy.setParent(source);   
        
            diagramHandle.unmask(proxy.getElement(), 0, 0);
        
        
            diagramHandle.save();
            diagramHandle.close();
            tr.commit();
        
        }
    }

}
