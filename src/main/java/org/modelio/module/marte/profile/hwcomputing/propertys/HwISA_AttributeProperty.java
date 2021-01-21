package org.modelio.module.marte.profile.hwcomputing.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("eac484f4-d8c9-43dc-87f6-fe025128063e")
public class HwISA_AttributeProperty implements IPropertyContent {
    @objid ("94e41549-d389-471b-993b-1b65e444ce90")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_FAMILY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_INST_WIDTH, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_TYPE, value);
        }
    }

    @objid ("8fdb2aa5-3a7a-4388-9306-a13d20714273")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_family = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_FAMILY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_FAMILY),value_family);
        
        String value_inst_Width = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_INST_WIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_INST_WIDTH),value_inst_Width);
        
        
        String[] ISA_Type = MARTEEnumerationUtils.getISA_Type();
        String value_isaType = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_TYPE, elt);
        if(!(MARTEEnumerationUtils.isISA_Type(value_isaType))){
            value_isaType = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_TYPE),value_isaType, ISA_Type);
    }

}
