package org.modelio.module.marte.profile.nfps.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.ErrorMessageBox;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2db18e45-53be-4a96-96b2-69ca5f574ac8")
public class Dimension_EnumerationProperty implements IPropertyContent {
    @objid ("5df5a3b9-3423-4c56-b1f4-9251e7bbc46b")
    static int counter = 0;

    @objid ("591bba2d-035d-4e1f-826e-bddf4f316832")
    private static List<ModelElement> listBaseDimension = null;

    @objid ("8ca754a5-78e4-43f6-bf7f-40271e16fb34")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_SYMBOL, value);
        }
        else if(row == 2){

            ModelUtils.manageMultipleOrientedLink(elt,
                    listBaseDimension,
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BASEDIMENSION_DIMENSION_DIMENSION,
                    value );
        }
        else if(row == 3){
            String[] t = ModelUtils.parseValuesToStringTab(value);

            if(isParseable(t)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_BASEEXPONENT, value);
            }
        }
    }

    @objid ("ffd2fd6f-dfa7-4126-8278-43135a574586")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Dimension
        //
        String value_symbol = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_SYMBOL, elt);
        if(value_symbol.equals("")){
            value_symbol = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_SYMBOL),value_symbol);

        /*
         * baseDimension tagged value initialization
         */
        listBaseDimension = ModelUtils.searchElementStereotyped(Enumeration.class, MARTEDesignerStereotypes.DIMENSION_ENUMERATION);

        String[] tabBaseDimension = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BASEDIMENSION_DIMENSION_DIMENSION), listBaseDimension);
        String value_baseDimension = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BASEDIMENSION_DIMENSION_DIMENSION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_BASEDIMENSION),value_baseDimension, tabBaseDimension);

        /*
         * baseExponent tagged value initialization
         */
        String value_baseExponent = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_BASEEXPONENT, elt);
        if(value_baseExponent.equals("")){
            value_baseExponent = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_BASEEXPONENT),value_baseExponent);
    }

    /**
     * isParseable allows us to check the parsing of the different getting values
     *
     * @param values are the different getting values
     * @return a boolean which gives the parsing of the different getting values
     */
    @objid ("c4290c15-7d72-4c4d-9bfe-58c335ac8491")
    protected boolean isParseable(String[] values) {
        boolean result = false;

        for (String s : values) {

            try {
                Integer.parseInt(s);
                result = true;
            }
            catch (Exception e) {

                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,"The value "+s+" is not parseable to in integer.\n You will have to enter another value.");
                result = false;
                return result;
            }
        }
        return result;
    }

}
