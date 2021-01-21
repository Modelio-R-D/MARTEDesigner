package org.modelio.module.marte.profile.hwcomputing.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0ad5bd3d-d0a4-478f-aef3-f176e980c3f3")
public class HwISA_LifelineProperty implements IPropertyContent {
    @objid ("24687f1b-a66d-43a1-97f0-a8a7da35bcad")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_LIFELINE_HWISA_LIFELINE_FAMILY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_LIFELINE_HWISA_LIFELINE_INST_WIDTH, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_LIFELINE_HWISA_LIFELINE_TYPE, value);
        }
    }

    @objid ("4f5e4ed6-1e8a-404d-9a27-084c13c6d681")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_family = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_LIFELINE_HWISA_LIFELINE_FAMILY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_LIFELINE_HWISA_LIFELINE_FAMILY),value_family);
        
        String value_inst_Width = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_LIFELINE_HWISA_LIFELINE_INST_WIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_LIFELINE_HWISA_LIFELINE_INST_WIDTH),value_inst_Width);
               
        
        
        String[] ISA_Type = MARTEEnumerationUtils.getISA_Type();
        String value_isaType = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_TYPE, elt);
        if(!(MARTEEnumerationUtils.isISA_Type(value_isaType))){
            value_isaType = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_TYPE),value_isaType, ISA_Type);
    }

}
