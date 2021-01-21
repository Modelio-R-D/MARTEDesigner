package org.modelio.module.marte.profile.time.command.diagram;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.tools.DefaultMultiLinkTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.UmlModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.time.model.TimedConstraint_Constraint;

/**
 * @author ebrosse
 */
@objid ("ad45af1b-90e5-441b-8cdd-33efba5f91b3")
public class TimedConstraint_ConstraintDiagramCommand extends DefaultMultiLinkTool {
    @objid ("a0a67b91-3a48-4cd8-bc4d-0fd125f4c21f")
    @Override
    public boolean acceptAdditionalElement(IDiagramHandle arg0, List<IDiagramGraphic> arg1, IDiagramGraphic arg2) {
        return ((arg2 != null) &&
                                                                (arg2.getElement() instanceof ModelElement));
    }

    @objid ("82beefd2-00a2-41ad-ba35-26fcd25e13a7")
    @Override
    public boolean acceptFirstElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        return ((arg1 != null) &&
                                                                (arg1.getElement() instanceof ModelElement));
    }

    @objid ("84bb43a7-08d6-4b2d-9644-7646f8aa52db")
    @Override
    public boolean acceptLastElement(IDiagramHandle arg0, List<IDiagramGraphic> arg1, IDiagramGraphic arg2) {
        return ((arg1 != null) &&
                                                                (arg2.getElement() instanceof AbstractDiagram));
    }

    @objid ("4ccb716b-581c-4d3a-b474-3482f96a0f05")
    @Override
    public void actionPerformed(IDiagramHandle diagramHandle, IDiagramGraphic arg1, List<IDiagramGraphic> arg2, List<LinkRouterKind> arg3, List<ILinkPath> arg4, Rectangle rectangle) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("TimedConstraint_ConstraintCommand")){
        
        
        
            TimedConstraint_Constraint proxy = new TimedConstraint_Constraint();
            for (IDiagramGraphic node : arg2){
                if(node.getElement() instanceof ModelElement){
                    proxy.setParent((UmlModelElement) node.getElement());
                }
            }
        
        
            diagramHandle.unmask(proxy.getElement(), rectangle.x, rectangle.y);
        
        
            diagramHandle.save();
            diagramHandle.close();
           tr.commit();
            
              
         
            
        
           
                
        }
    }

}
