package org.modelio.module.marte.profile.nfps.propertys;

import java.util.List;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.ErrorMessageBox;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Unit_EnumerationLiteralProperty implements IPropertyContent {
    private static List<ModelElement> listBaseUnit = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageSingleOrientedLink(elt,
                    listBaseUnit,
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BASEUNIT_UNIT_UNIT,
                    value );
        }
        else if(row == 2){
            if (isParseable(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_CONVFACTOR, value);
            }
        }
        else if(row == 3){
            if (isParseable(value)) {
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_OFFSETFACTOR, value);
            }
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Unit
        //
        
        /*
         * baseUnit tagged value getting
         */
        
        listBaseUnit = ModelUtils.searchElementStereotyped(EnumerationLiteral.class, MARTEDesignerStereotypes.UNIT_ENUMERATIONLITERAL);
        String[] tabBaseUnit = ModelUtils.createListString(listBaseUnit);
        String value_baseUnit = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BASEUNIT_UNIT_UNIT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_BASEUNIT),value_baseUnit, tabBaseUnit);
        
        
        String value_convFactor = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_CONVFACTOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_CONVFACTOR),value_convFactor);
        
        
        String value_offsetFactor = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_OFFSETFACTOR, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_OFFSETFACTOR),value_offsetFactor);
    }

    /**
     * isParseable allows us to check the parsing of the different getting values
     * @param values are the different getting values
     * 
     * @return a boolean which gives the parsing of the different getting values
     */
    public boolean isParseable(String value) {
        boolean result = false;
        
        try {
            Double.parseDouble(value);
            result = true;
        }
        catch (Exception e) {
            new ErrorMessageBox(Display.getDefault().getActiveShell()
                    ,"The value "+value+" is not parseable to in real.\n You will have to enter another value.");
            result = false;
        }
        return result;
    }

}
