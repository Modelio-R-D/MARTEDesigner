package org.modelio.module.marte.profile.hwmemory.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e6fdc96d-0787-406d-ac61-1c2a0010895e")
public class HwROM_LinkProperty implements IPropertyContent {
    @objid ("52a39993-dc72-4a03-97e5-c62faeea18e8")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWROM_LINK_HWROM_LINK_TYPE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWROM_LINK_HWROM_LINK_ORGANIZATION, value);
        }
    }

    @objid ("a8c4a4f1-3cfe-4322-93a9-d8a40100165f")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw ROM
        //
        String[] type = MARTEEnumerationUtils.getROM_Type();
        String value_type = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_LINK_HWROM_LINK_TYPE, elt);
        if(!(MARTEEnumerationUtils.isROM_Type(value_type))){
            value_type = "undefined";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWROM_LINK_HWROM_LINK_TYPE),value_type, type);
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_LINK_HWROM_LINK_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWROM_LINK_HWROM_LINK_ORGANIZATION),value_organization);
    }

}
