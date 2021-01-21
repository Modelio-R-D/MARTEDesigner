package org.modelio.module.marte.profile.hwcomputing.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("57e04c30-a8e4-4b9b-9f91-90fe7da39a51")
public class HwISA_AssociationEndProperty implements IPropertyContent {
    @objid ("3961cdb3-83c7-4f54-a13a-730fb0ad8416")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_FAMILY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_INST_WIDTH, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_TYPE, value);
        }
    }

    @objid ("7f06dcd2-cbb5-4bc7-bef9-baf2eb3519c7")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw ISA
        //
        String value_family = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_FAMILY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_FAMILY),value_family);
        
        
        String value_inst_Width = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_INST_WIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_INST_WIDTH),value_inst_Width);
        
        
        String[] ISA_Type = MARTEEnumerationUtils.getISA_Type();
        String value_isaType = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_TYPE, elt);
        if(!(MARTEEnumerationUtils.isISA_Type(value_isaType))){
            value_isaType = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_TYPE),value_isaType, ISA_Type);
    }

}
