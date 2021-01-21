package org.modelio.module.marte.profile.hwcomputing.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2e13918e-5ffe-4b87-bce3-4d45b7576f0e")
public class HwISA_AssociationProperty implements IPropertyContent {
    @objid ("0db8de72-2c8a-4375-943e-3fd2e07172de")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_FAMILY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_INST_WIDTH, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_TYPE, value);
        }
    }

    @objid ("4482bea5-3520-4c43-8e13-843250b24ede")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_family = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_FAMILY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName("HwISA_Association_family"),value_family);
        
        String value_inst_Width = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATION_HWISA_ASSOCIATION_INST_WIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName("HwISA_Association_inst_Width"),value_inst_Width);
               
        
        String[] ISA_Type = MARTEEnumerationUtils.getISA_Type();
        String value_isaType = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_TYPE, elt);
        if(!(MARTEEnumerationUtils.isISA_Type(value_isaType))){
            value_isaType = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_TYPE),value_isaType, ISA_Type);
    }

}
