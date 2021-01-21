package org.modelio.module.marte.profile.sam.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("77be80c8-f085-414a-abe0-8607d040e09a")
public class SaCommHost_ClassifierProperty implements IPropertyContent {
    @objid ("f4508162-c1c6-4b7d-b715-c9b9a450ace0")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMHOST_CLASSIFIER_SACOMMHOST_CLASSIFIER_ISSCHED, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SACOMMHOST_CLASSIFIER_SACOMMHOST_CLASSIFIER_SCHSLACK, value);
        }
    }

    @objid ("08463f6b-fe7a-493c-b65c-f034a996d0be")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMHOST_CLASSIFIER_SACOMMHOST_CLASSIFIER_ISSCHED)
                ,ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SACOMMHOST_CLASSIFIER_SACOMMHOST_CLASSIFIER_ISSCHED, elt));
        
        String value_schSlack = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SACOMMHOST_CLASSIFIER_SACOMMHOST_CLASSIFIER_SCHSLACK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SACOMMHOST_CLASSIFIER_SACOMMHOST_CLASSIFIER_SCHSLACK),value_schSlack);
    }

}
