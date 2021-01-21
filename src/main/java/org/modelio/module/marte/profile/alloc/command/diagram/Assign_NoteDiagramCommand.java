package org.modelio.module.marte.profile.alloc.command.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("e9598752-8fb6-4df1-b5b2-aba3b7850ed6")
public class Assign_NoteDiagramCommand extends DefaultAttachedBoxTool {
    @objid ("da23a7a4-44ab-446e-847d-7e769f6cc896")
    @Override
    public String getTooltip() {
        return super.getTooltip();
    }

    @objid ("e61d1447-c877-490f-b0e8-53f376b353e6")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        MObject owner = null;
        
        if(targetNode != null){
            owner = targetNode.getElement();
        }
        return ((owner != null) && (owner instanceof ModelElement));
    }

    @objid ("b6a9dcae-cf2a-4c25-8c30-ac4d2d4f427d")
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

    @objid ("9c40f59c-fe8c-4948-8245-04c4d9e9e904")
    @Override
    public void actionPerformedInDiagram(IDiagramHandle arg0, org.eclipse.draw2d.geometry.Rectangle arg1) {
        // TODO Auto-generated method stub
    }

}
