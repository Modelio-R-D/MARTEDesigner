package org.modelio.module.marte.profile.time.command.diagram;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.tools.DefaultMultiLinkTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.UmlModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.time.model.ClockConstraint_Constraint;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ClockConstraint_ConstraintDiagramCommand extends DefaultMultiLinkTool {
    @Override
    public void actionPerformed(IDiagramHandle diagramHandle, IDiagramGraphic lastNode, List<IDiagramGraphic> otherNodes, List<LinkRouterKind> routerKinds, List<ILinkPath> paths, Rectangle rectangle) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("ClockConstraint_ConstraintCommand")){
        
        
            ClockConstraint_Constraint proxy = new ClockConstraint_Constraint();
        
            for (IDiagramGraphic owner : otherNodes){
                proxy.setParent((UmlModelElement)owner.getElement());
            }
        
        
            List<ModelElement> listClocks = new ArrayList<>();
            for (IDiagramGraphic node : otherNodes){
                ModelElement elt = (ModelElement) node.getElement();
                if (MARTESearchUtils.isClock(elt))
                    listClocks.add(elt);
            }
            
            ModelUtils.addMultipleOrientedLink(proxy.getElement(), 
                    listClocks, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ON_TIMEDELEMENT_CLOCK, 
                    MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ON);
        
        
            
            diagramHandle.unmask(proxy.getElement(), rectangle.x, rectangle.y);
            
        
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
            
              
         
            
        
           
                
        }
    }

    @Override
    public boolean acceptAdditionalElement(IDiagramHandle diagramRepresentation, List<IDiagramGraphic> previousNodes, IDiagramGraphic targetNode) {
        if(targetNode != null){
        
            if ((targetNode.getElement() instanceof ModelElement) 
                    && MARTESearchUtils.isClockOrClockType((ModelElement) targetNode.getElement())){
                return true;
        
            } else{
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean acceptFirstElement(IDiagramHandle diagramRepresentation, IDiagramGraphic targetNode) {
        if(targetNode != null){
        
            if ((targetNode.getElement() instanceof ModelElement) 
                    && MARTESearchUtils.isClockOrClockType((ModelElement) targetNode.getElement())){
                return true;
            } else{
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean acceptLastElement(IDiagramHandle diagramRepresentation, List<IDiagramGraphic> otherNodes, IDiagramGraphic targetNode) {
        if( (targetNode == null) && (otherNodes.size() > 1 )) {
            return true;
        }
        return false;
    }

}
