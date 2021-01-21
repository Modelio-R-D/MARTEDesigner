package org.modelio.module.marte.profile.hwmemory.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("73436176-896f-41fb-a3e8-070e901f8f17")
public class HwROM_LifelineProperty implements IPropertyContent {
    @objid ("85f7f062-faa0-419d-bb55-7f96089af8e6")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWROM_LIFELINE_HWROM_LIFELINE_TYPE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWROM_LIFELINE_HWROM_LIFELINE_ORGANIZATION, value);
        }
    }

    @objid ("4b114586-0ffb-4c86-8dd9-cfe133442a40")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw ROM
        //
        String[] type = MARTEEnumerationUtils.getROM_Type();
        String value_type = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_LIFELINE_HWROM_LIFELINE_TYPE, elt);
        if(!(MARTEEnumerationUtils.isROM_Type(value_type))){
            value_type = "undefined";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWROM_LIFELINE_HWROM_LIFELINE_TYPE),value_type, type);
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_LIFELINE_HWROM_LIFELINE_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWROM_LIFELINE_HWROM_LIFELINE_ORGANIZATION),value_organization);
    }

}
