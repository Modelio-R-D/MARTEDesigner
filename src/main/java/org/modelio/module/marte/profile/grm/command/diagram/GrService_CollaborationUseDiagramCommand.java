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
import org.modelio.module.marte.profile.grm.model.GrService_CollaborationUse;

@objid ("6c213f2f-7173-4481-a240-3665cb9c93c9")
public class GrService_CollaborationUseDiagramCommand extends DefaultLinkTool {
    @objid ("336e6abd-1402-431c-a021-9ebceba24f8a")
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

    @objid ("3afccf38-0ff2-4738-8826-5ec65382dcb2")
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

    @objid ("6c1a4ffe-b763-4852-9e12-e6f21823aa73")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind touterType, ILinkPath path) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("GrService_CollaborationUseCommand")){
        
        
        
            NameSpace source = (NameSpace)originNode.getElement();
            Collaboration target = (Collaboration)targetNode.getElement();
        
        
            GrService_CollaborationUse proxy = new GrService_CollaborationUse();
            proxy.setParent(source,target);   
        
            diagramHandle.unmask(proxy.getElement(), 0, 0);
        
        
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
