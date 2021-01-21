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
import org.modelio.module.marte.profile.grm.model.Acquire_CollaborationUse;

@objid ("5973b5e4-b96b-4509-a1bf-cd6ce03bfca3")
public class Acquire_CollaborationUseDiagramCommand extends DefaultLinkTool {
    @objid ("ea99ce44-00b7-46b6-9710-3a87856bf605")
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

    @objid ("ed9fc2f6-9de0-4125-9f5b-854da6f2a8dd")
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

    @objid ("8e5a069a-06ca-4c83-b66e-d4d5ee5aa03a")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind touterType, ILinkPath path) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Acquire_CollaborationUseCommand")){
        
        
        
            NameSpace source = (NameSpace)originNode.getElement();
            Collaboration target = (Collaboration)targetNode.getElement();
        
        
            Acquire_CollaborationUse proxy = new Acquire_CollaborationUse();
            proxy.setParent(source,target);   
        
            diagramHandle.unmask(proxy.getElement(), 0, 0);
        
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
