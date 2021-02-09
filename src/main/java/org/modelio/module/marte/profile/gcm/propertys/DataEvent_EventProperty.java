package org.modelio.module.marte.profile.gcm.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class DataEvent_EventProperty implements IPropertyContent {
    private static List<ModelElement> _classifiers = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageSingleOrientedLink(elt, 
                    _classifiers, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CLASSIFIER_DATAEVENT, 
        //                    MARTEDesignerTagTypes.DATAEVENT_EVENT_DATAEVENT_EVENT_CLASSIFIER, 
                    value
            );
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        _classifiers = MARTESearchUtils.searchClassifier();   
        String[] tab_classifiers = ModelUtils.createListString(_classifiers);      
        String value_classifiers = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CLASSIFIER_DATAEVENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DATAEVENT_EVENT_DATAEVENT_EVENT_CLASSIFIER), value_classifiers, tab_classifiers);
    }

}
