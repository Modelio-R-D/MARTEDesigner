package org.modelio.module.marte.profile.hwmemory.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("12cfd613-bfdd-4ec1-8d54-4a19173d5988")
public class HwROM_AssociationEndProperty implements IPropertyContent {
    @objid ("a84bd5f4-e0fa-4d9f-9a05-454350b93692")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWROM_ASSOCIATIONEND_HWROM_ASSOCIATIONEND_TYPE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWROM_ASSOCIATIONEND_HWROM_ASSOCIATIONEND_ORGANIZATION, value);
        }
    }

    @objid ("18d8b99f-2f14-4eb8-aa6a-f4f3dd1be515")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw ROM
        //
        
        String[] type = MARTEEnumerationUtils.getROM_Type();
        String value_type = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_ASSOCIATIONEND_HWROM_ASSOCIATIONEND_TYPE, elt);
        if(!(MARTEEnumerationUtils.isROM_Type(value_type))){
            value_type = "undefined";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWROM_ASSOCIATIONEND_HWROM_ASSOCIATIONEND_TYPE),value_type, type);
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_ASSOCIATIONEND_HWROM_ASSOCIATIONEND_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWROM_ASSOCIATIONEND_HWROM_ASSOCIATIONEND_ORGANIZATION),value_organization);
    }

}
