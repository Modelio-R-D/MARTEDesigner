package org.modelio.module.marte.impl;

import java.util.List;
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
public class MARTEPropertiesCommand extends DefaultModuleCommandHandler {
    private static BodyTreePage btp;

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
