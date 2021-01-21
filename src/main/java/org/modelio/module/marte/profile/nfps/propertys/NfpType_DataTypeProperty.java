package org.modelio.module.marte.profile.nfps.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("89de9017-fcb1-40b4-9e7d-a12a7b5de0b4")
public class NfpType_DataTypeProperty implements IPropertyContent {
    @objid ("dd041e62-40a5-4690-b39a-aa13d906a744")
    private static List<ModelElement> listValueAtt = null;

    @objid ("91dc7453-67df-457d-8623-0f7a18a1e72a")
    private static List<ModelElement> listUnitAtt = null;

    @objid ("40c1f132-e497-488a-ab65-3fd6dab2eb4e")
    private static List<ModelElement> listExprAtt = null;

    @objid ("1b8065a8-3fee-4813-b5f6-cee2a9c7c119")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
         
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listExprAtt, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_VALUEATTRIB_NFPTYPE_ATTRIBUTE, 
        //                                                MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_VALUEATTRIB,
                                                value);
        }
        else if(row == 2){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listUnitAtt, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_UNITATTRIB_NFPTYPE_ATTRIBUTE, 
        //                                                MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_UNITATTRIB,
                                                value);
        }
        else if(row == 3){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listValueAtt, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_EXPRATTRIB_NFPTYPE_ATTRIBUTE, 
        //                                                MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_EXPRATTRIB,
                                                value);
        }
    }

    @objid ("fd409e1e-8360-45bc-abf2-9e6b3b140d50")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        /*
         * Nfp Type
         */
        
        // valueAttrib tagged value
        listValueAtt = ModelUtils.searchElement(Attribute.class, elt);
        String[] tabValueAtt = ModelUtils.createListString(listValueAtt);
        String value_valueAttrib = ModelUtils.getTargetDependencyNames(MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_VALUEATTRIB, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_VALUEATTRIB),value_valueAttrib, tabValueAtt);
         
        // unitAttrib tagged value
        listUnitAtt = ModelUtils.searchElement(Attribute.class, elt);
        String[] tabUnitAtt = ModelUtils.createListString(listUnitAtt);
        String value_unitAttrib = ModelUtils.getTargetDependencyNames(MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_UNITATTRIB, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_UNITATTRIB), value_unitAttrib, tabUnitAtt);
        
        // exprAttrib tagged value
        listExprAtt = ModelUtils.searchElement(Attribute.class, elt);
        String[] tabExprAtt = ModelUtils.createListString(listExprAtt);
        String value_exprAttrib = ModelUtils.getTargetDependencyNames(MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_EXPRATTRIB, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.NFPTYPE_DATATYPE_NFPTYPE_DATATYPE_EXPRATTRIB), value_exprAttrib, tabExprAtt);
    }

}
