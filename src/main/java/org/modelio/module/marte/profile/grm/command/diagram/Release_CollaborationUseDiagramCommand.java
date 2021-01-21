package org.modelio.module.marte.profile.grm.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.tools.DefaultLinkTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Release_CollaborationUse;

@objid ("e9f31404-30a0-4e85-a1c2-339c70d982d7")
public class Release_CollaborationUseDiagramCommand extends DefaultLinkTool {
    @objid ("afcc13fd-3d58-4ab7-b2a9-0727de073394")
    @Override
    public boolean acceptFirstElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode.getElement() instanceof AbstractDiagram){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        
        if(owner instanceof NameSpace){
            return true;
        }
        return false;
    }

    @objid ("a9b2c184-6f71-41e3-a310-a12842fa88bb")
    @Override
    public boolean acceptSecondElement(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if(targetNode == null){
            owner = diagramHandle.getDiagram().getOrigin();
        }else{
            owner = (ModelElement)targetNode.getElement();
        }
        
        
        if(owner instanceof Collaboration){
            return true;
        }
        return false;
    }

    @objid ("136a40e6-042e-4242-9d1b-ebd934762c09")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind touterType, ILinkPath path) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Release_CollaborationUseCommand")){
        
        
        
            NameSpace source = (NameSpace)originNode.getElement();
            Collaboration target = (Collaboration)targetNode.getElement();
        
        
            Release_CollaborationUse proxy = new Release_CollaborationUse();
            proxy.setParent(source,target);   
        
            diagramHandle.unmask(proxy.getElement(), 0, 0);
        
        
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
