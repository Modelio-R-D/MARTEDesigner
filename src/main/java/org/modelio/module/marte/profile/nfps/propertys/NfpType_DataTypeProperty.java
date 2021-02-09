package org.modelio.module.marte.profile.nfps.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class NfpType_DataTypeProperty implements IPropertyContent {
    private static List<ModelElement> listValueAtt = null;

    private static List<ModelElement> listUnitAtt = null;

    private static List<ModelElement> listExprAtt = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageSingleOrientedLink(elt,
                    listExprAtt,
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_VALUEATTRIB_NFPTYPE_ATTRIBUTE,
                    value);
        }
        else if(row == 2){
            ModelUtils.manageSingleOrientedLink(elt,
                    listUnitAtt,
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_UNITATTRIB_NFPTYPE_ATTRIBUTE,
                    value);
        }
        else if(row == 3){
            ModelUtils.manageSingleOrientedLink(elt,
                    listValueAtt,
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_EXPRATTRIB_NFPTYPE_ATTRIBUTE,
                    value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        /*
         * Nfp Type
         */
        
        // valueAttrib tagged value
        listValueAtt = ModelUtils.searchElement(Attribute.class, elt);
        String[] tabValueAtt = ModelUtils.createListString(listValueAtt);
        String value_valueAttrib = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_VALUEATTRIB_NFPTYPE_ATTRIBUTE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_VALUEATTRIB),value_valueAttrib, tabValueAtt);
        
        // unitAttrib tagged value
        listUnitAtt = ModelUtils.searchElement(Attribute.class, elt);
        String[] tabUnitAtt = ModelUtils.createListString(listUnitAtt);
        String value_unitAttrib = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_UNITATTRIB_NFPTYPE_ATTRIBUTE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_UNITATTRIB), value_unitAttrib, tabUnitAtt);
        
        // exprAttrib tagged value
        listExprAtt = ModelUtils.searchElement(Attribute.class, elt);
        String[] tabExprAtt = ModelUtils.createListString(listExprAtt);
        String value_exprAttrib = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_EXPRATTRIB_NFPTYPE_ATTRIBUTE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_EXPRATTRIB), value_exprAttrib, tabExprAtt);
    }

}
