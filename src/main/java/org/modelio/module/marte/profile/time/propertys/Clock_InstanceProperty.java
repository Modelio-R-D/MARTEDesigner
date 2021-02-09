package org.modelio.module.marte.profile.time.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Clock_InstanceProperty implements IPropertyContent {
    private static List<ModelElement> listType = null;

    private static List<ModelElement> listUnit = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_STANDARD, value);
        }
        else if(row == 2){
            if (value.equals("")) {
                ModelUtils.removeTaggedValue(MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_TYPE, elt);
                ((Instance) elt).setBase(null);
            }else  {
                 for (ModelElement temp : listType){
                     if (ModelUtils.getMARTEName(temp).equals(value) && (temp instanceof NameSpace)){
                         ((Instance) elt).setBase((NameSpace) temp);
        //                         ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_TYPE, value);
                     }
                 }
            }
        }
        else if(row == 3){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listUnit, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_UNIT_CLOCK_UNIT, 
        //                                                MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_UNIT,
                                                value );
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        /*
         * standard initialization
         */
        
        // General Positioning System, Local Time, Sidereal Time, International Atomic Time, Barycentric Coordinate Time
        // Geocentric Coordinate Time, Barycentric Dynamical Time, Terrestrial Time, Universal Time 0, Universal Time 1
        // Coordinated Universal Time
        String[] tabStandard = new String[] {"GPS", "Local", "Sidereal", "TAI", "TCB", "TCG", "TDB", "TT", "UT0", "UT1", "UTC"};
        String value_standard = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_STANDARD, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_STANDARD),value_standard, tabStandard);
        
        
        /*
         * type initialization
         */
        listType = ModelUtils.searchElementStereotyped(Class.class, MARTEDesignerStereotypes.CLOCKTYPE_CLASS);
        String[] type = ModelUtils.createListString(listType);
        String value_type = "";
        if (elt instanceof Instance) {
            NameSpace base = ((Instance) elt).getBase();
            if (base != null) {
                value_type = ModelUtils.getMARTEName(base);
            }
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_TYPE),value_type, type);
        
        /*
         * unit initialization
         */
        
        listUnit = ModelUtils.searchElementStereotyped(EnumerationLiteral.class, MARTEDesignerStereotypes.UNIT_ENUMERATIONLITERAL);
        String[] tabUnit = ModelUtils.createListString(listUnit);    
        String value_Unit = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_UNIT_CLOCK_UNIT, elt);        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_UNIT),value_Unit, tabUnit);
    }

}
