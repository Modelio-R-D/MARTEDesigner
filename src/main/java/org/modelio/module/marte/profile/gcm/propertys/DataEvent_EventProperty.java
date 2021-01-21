package org.modelio.module.marte.profile.gcm.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("dd7e5e25-5f81-4bc5-8058-8f9a773d55c4")
public class DataEvent_EventProperty implements IPropertyContent {
    @objid ("9fce4de3-3f8c-45d7-a751-590cf5a28bf2")
    private static List<ModelElement> _classifiers = null;

    @objid ("60b8ed5a-9ef9-4a6b-8393-99cc6a176133")
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

    @objid ("3d41383d-74ec-4b3a-b25b-29bbe503d8c4")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        _classifiers = MARTESearchUtils.searchClassifier();   
        String[] tab_classifiers = ModelUtils.createListString(_classifiers);      
        String value_classifiers = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CLASSIFIER_DATAEVENT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DATAEVENT_EVENT_DATAEVENT_EVENT_CLASSIFIER), value_classifiers, tab_classifiers);
    }

}
