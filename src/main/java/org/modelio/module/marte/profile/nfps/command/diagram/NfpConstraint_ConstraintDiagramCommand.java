package org.modelio.module.marte.profile.nfps.command.diagram;

import java.util.List;
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
import org.modelio.module.marte.profile.nfps.model.NfpConstraint_Constraint;

/**
 * @author ebrosse
 */
public class NfpConstraint_ConstraintDiagramCommand extends DefaultMultiLinkTool {
    @Override
    public boolean acceptAdditionalElement(IDiagramHandle arg0, List<IDiagramGraphic> arg1, IDiagramGraphic arg2) {
        return ((arg2 != null) &&
                                                                (arg2.getElement() instanceof ModelElement));
    }

    @Override
    public boolean acceptFirstElement(IDiagramHandle arg0, IDiagramGraphic arg1) {
        return ((arg1 != null) &&
                                                                (arg1.getElement() instanceof ModelElement));
    }

    @Override
    public boolean acceptLastElement(IDiagramHandle arg0, List<IDiagramGraphic> arg1, IDiagramGraphic arg2) {
        return ((arg1 != null) &&
                                                                (arg2.getElement() instanceof AbstractDiagram));
    }

    @Override
    public void actionPerformed(IDiagramHandle diagramHandle, IDiagramGraphic arg1, List<IDiagramGraphic> arg2, List<LinkRouterKind> arg3, List<ILinkPath> arg4, Rectangle rectangle) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("NfpConstraint_ConstraintCommand")){
        
        
        
            NfpConstraint_Constraint proxy = new NfpConstraint_Constraint();
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
