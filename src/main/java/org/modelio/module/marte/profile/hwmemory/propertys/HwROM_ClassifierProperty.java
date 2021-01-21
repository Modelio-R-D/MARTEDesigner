package org.modelio.module.marte.profile.hwmemory.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ad08ec65-bcd2-4a33-bd67-e0581c87b199")
public class HwROM_ClassifierProperty implements IPropertyContent {
    @objid ("c31040a5-3f2c-45ed-9ed9-6c02d854abfb")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_TYPE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_ORGANIZATION, value);
        }
    }

    @objid ("06d30823-2c1c-4c67-9ca8-445f580f1da0")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw ROM
        //
        String[] type = MARTEEnumerationUtils.getROM_Type();
        String value_type = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_TYPE, elt);
        if(!(MARTEEnumerationUtils.isROM_Type(value_type))){
            value_type = "undefined";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_TYPE),value_type, type);
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_ORGANIZATION),value_organization);
    }

}
