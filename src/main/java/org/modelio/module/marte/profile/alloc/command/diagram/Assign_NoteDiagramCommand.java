package org.modelio.module.marte.profile.alloc.command.diagram;

import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.tools.DefaultAttachedBoxTool;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.alloc.model.Assign_Note;
import org.modelio.vcore.smkernel.mapi.MObject;

public class Assign_NoteDiagramCommand extends DefaultAttachedBoxTool {
    @Override
    public String getTooltip() {
        return super.getTooltip();
    }

    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        MObject owner = null;
        
        if(targetNode != null){
            owner = targetNode.getElement();
        }
        return ((owner != null) && (owner instanceof ModelElement));
    }

    @Override
    public void actionPerformed(IDiagramHandle diagramHandle, IDiagramGraphic arg1, LinkRouterKind arg2, ILinkPath arg3, org.eclipse.draw2d.geometry.Point arg4) {
        try(ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("Assign_NoteCommand")){
        
            MObject parent = arg1.getElement();
        
            Assign_Note proxy = new Assign_Note();
        
            if(parent instanceof ModelElement){
                proxy.setParent((ModelElement) parent);
            }
        
            diagramHandle.unmask(proxy.getElement(), 0, 0);
        
            diagramHandle.save();
            diagramHandle.close();
            tr.commit();          
        }
    }

    @Override
    public void actionPerformedInDiagram(IDiagramHandle arg0, org.eclipse.draw2d.geometry.Rectangle arg1) {
        // TODO Auto-generated method stub
    }

}
