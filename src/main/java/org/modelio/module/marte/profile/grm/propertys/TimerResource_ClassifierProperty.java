package org.modelio.module.marte.profile.grm.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f3aa64ba-e516-4862-95cb-5f1aa176da16")
public class TimerResource_ClassifierProperty implements IPropertyContent {
    @objid ("5d8e6956-713e-4522-87f5-e0aaf410bc91")
    private static List<ModelElement> typedElement = null;

    @objid ("a6e80276-cfb7-4cfe-8999-13042126dfa0")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SWTIMERRESOURCE_CLASSIFIER)){
                ModelUtils.manageSingleOrientedLink(elt, 
                        typedElement, 
                        MARTEDesignerStereotypes.PROFILEASSOCIATION_DURATIONELEMENTS_SWTIMERRESOURCE, 
        //                        MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_DURATION, 
                        value);
            }else
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_DURATION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_ISPERIODIC, value);
        }
    }

    @objid ("b3e7b558-9a02-4d88-9bad-2d7f50b78ed8")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Timer Resource
        //
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SWTIMERRESOURCE_CLASSIFIER)){
            typedElement = MARTESearchUtils.searchTypedElement();          
            String[] tab_durationElements = ModelUtils.createListString(typedElement);      
            String value_durationElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DURATIONELEMENTS_SWTIMERRESOURCE, elt);
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_DURATION), value_durationElements, tab_durationElements);
        }else{
            String value_duration = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_DURATION, elt);
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_DURATION),value_duration);
        }
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_ISPERIODIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_ISPERIODIC, elt));
    }

}
