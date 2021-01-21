package org.modelio.module.marte.profile.hwmemory.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2b245f77-5aa7-4c3b-95f3-5313a23051ad")
public class HwROM_ParameterProperty implements IPropertyContent {
    @objid ("90463803-401e-4c71-895a-61136b09282d")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWROM_PARAMETER_HWROM_PARAMETER_TYPE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWROM_PARAMETER_HWROM_PARAMETER_ORGANIZATION, value);
        }
    }

    @objid ("0ffee693-0681-4a6f-a10e-8feff4df3b40")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw ROM
        //
        String[] type = MARTEEnumerationUtils.getROM_Type();
        String value_type = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_PARAMETER_HWROM_PARAMETER_TYPE, elt);
        if(!(MARTEEnumerationUtils.isROM_Type(value_type))){
            value_type = "undefined";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWROM_PARAMETER_HWROM_PARAMETER_TYPE),value_type, type);
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_PARAMETER_HWROM_PARAMETER_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWROM_PARAMETER_HWROM_PARAMETER_ORGANIZATION),value_organization);
    }

}
