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
import org.modelio.module.marte.profile.grm.model.GrService_Collaboration;

@objid ("17632721-67b6-40d1-8b52-a504a2fabfa7")
public class GrService_CollaborationDiagramCommand extends DefaultLinkTool {
    @objid ("c9266349-d7c6-4584-88b4-f1fee4cf412e")
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

    @objid ("8e2e0219-a315-4d8f-9e6f-c7a79f526760")
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

    @objid ("b7015a23-9eb1-42b4-b4b7-2a9f78c90a35")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, IDiagramGraphic originNode, IDiagramGraphic targetNode, LinkRouterKind touterType, ILinkPath path) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("GrService_CollaborationCommand")){
        
            Behavior source = (Behavior)originNode.getElement();
        
        
            GrService_Collaboration proxy = new GrService_Collaboration();
            proxy.setParent(source);   
        
            diagramHandle.unmask(proxy.getElement(), 0, 0);
        
        
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
         
              
         
            
        
           
                
        }
    }

}
