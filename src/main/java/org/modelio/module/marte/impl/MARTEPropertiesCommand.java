package org.modelio.module.marte.impl;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.BodyTreePage;
import org.modelio.module.marte.profile.editors.TransformationDialog;
import org.modelio.module.marte.profile.grm.propertys.CommunicationMedia_BodyTreePage;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * MARTEPropertiesCommand provides a button for the complex properties
 * @author ehouziaux
 */
@objid ("0a699a93-6323-441b-8656-1cc3fc760ee8")
public class MARTEPropertiesCommand extends DefaultModuleCommandHandler {
    @objid ("c3f125eb-ff1b-4742-aeba-31f7a86e69ce")
    private static BodyTreePage btp;

    @objid ("27114ffd-fe17-4b97-a0ea-cda4da551fc8")
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        boolean result = false;
        if ((selectedElements != null)
                && (selectedElements.size() > 1)
                &&  (selectedElements.get(0) instanceof ModelElement) ){
            ModelElement elt = (ModelElement)selectedElements.get(0);
        
            for (Stereotype s : elt.getExtension()) {
                if (s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_ASSOCIATION)
                        || s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_ASSOCIATIONEND)
                        || s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_ATTRIBUTE)
                        || s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_CLASSIFIER)
                        || s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_INSTANCE)
                        || s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_LIFELINE)
                        || s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_LINK)
                        || s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_PARAMETER)) {
                    result = true;
                }
            }
        }
        return result;
    }

    @objid ("be3aa257-75df-42d8-a8bb-56b92870a5e2")
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        try (ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("BodyTree Page creation")){
        
            TransformationDialog dialog = new TransformationDialog(Display.getDefault().getActiveShell());
            ModelElement elt = (ModelElement) selectedElements.get(0);
        
            for (Stereotype s : elt.getExtension()) {
                if (s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_ASSOCIATION)
                        || s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_ASSOCIATIONEND)
                        || s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_ATTRIBUTE)
                        || s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_CLASSIFIER)
                        || s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_INSTANCE)
                        || s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_LIFELINE)
                        || s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_LINK)
                        || s.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_PARAMETER)) {
                    btp = new CommunicationMedia_BodyTreePage(dialog,(ModelElement)selectedElements.get(0));
                    btp.refresh();
                }
            }
        
        
            boolean result = dialog.open();
        
            if (result) {
               tr.commit();
            }
        
        
        } catch (Throwable e) {
            MARTEModule.getInstance().getModuleContext().getLogService().error(e);
        }
    }

}
