package org.modelio.module.marte.profile.hwcomputing.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3b47afa2-66b9-4d2e-935c-ac458ac3560f")
public class HwISA_ClassifierProperty implements IPropertyContent {
    @objid ("c4f7b467-7f6e-470d-a685-fd8ee63524cf")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_FAMILY, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_INST_WIDTH, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_TYPE, value);
        }
    }

    @objid ("a3d011ea-4639-4822-81de-675148d6fab3")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_family = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_FAMILY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_FAMILY),value_family);
        
        String value_inst_Width = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_INST_WIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_INST_WIDTH),value_inst_Width);
        
        
        
        String[] ISA_Type = MARTEEnumerationUtils.getISA_Type();
        String value_isaType = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_TYPE, elt);
        if(!(MARTEEnumerationUtils.isISA_Type(value_isaType))){
            value_isaType = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWISA_ASSOCIATIONEND_HWISA_ASSOCIATIONEND_TYPE),value_isaType, ISA_Type);
    }

}
