package org.modelio.module.marte.profile.hwcomputing.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("776bf274-7b48-475f-a8f4-43482c5f7c80")
public class HwISA_ParameterProperty implements IPropertyContent {
    @objid ("70da91b1-7c6c-491a-9228-3742bbaf3a9b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_FAMILY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_INST_WIDTH, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_TYPE, value);
        }
    }

    @objid ("500d7c41-da3a-4b77-84cf-b23f84fa3097")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_family = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_FAMILY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_FAMILY),value_family);
        
        String value_inst_Width = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_INST_WIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_INST_WIDTH),value_inst_Width);
        
        
        
        String[] ISA_Type = MARTEEnumerationUtils.getISA_Type();
        String value_isaType = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_TYPE, elt);
        if(!(MARTEEnumerationUtils.isISA_Type(value_isaType))){
            value_isaType = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_TYPE),value_isaType, ISA_Type);
    }

}
