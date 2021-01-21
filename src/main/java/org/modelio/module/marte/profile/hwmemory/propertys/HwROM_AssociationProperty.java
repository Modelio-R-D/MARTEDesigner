package org.modelio.module.marte.profile.hwmemory.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("01355665-c314-4dfb-a75f-54b174ec5307")
public class HwROM_AssociationProperty implements IPropertyContent {
    @objid ("274de5f7-eb42-4bcf-9a91-1b3acfb2a511")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWROM_ASSOCIATION_HWROM_ASSOCIATION_TYPE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWROM_ASSOCIATION_HWROM_ASSOCIATION_ORGANIZATION, value);
        }
    }

    @objid ("df49d6f8-264f-42aa-965a-f1abcc895b84")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw ROM
        //
        String[] type = MARTEEnumerationUtils.getROM_Type();
        String value_type = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_ASSOCIATION_HWROM_ASSOCIATION_TYPE, elt);
        if(!(MARTEEnumerationUtils.isROM_Type(value_type))){
            value_type = "undefined";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWROM_ASSOCIATION_HWROM_ASSOCIATION_TYPE),value_type, type);
        
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_ASSOCIATION_HWROM_ASSOCIATION_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWROM_ASSOCIATION_HWROM_ASSOCIATION_ORGANIZATION),value_organization);
    }

}
