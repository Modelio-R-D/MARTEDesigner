package org.modelio.module.marte.profile.time.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("44437eb9-1d24-4ba1-83aa-2260bcd53661")
public class Clock_EventProperty implements IPropertyContent {
    @objid ("2b96ab4c-c5dd-4050-90c1-6847eb53d7c4")
    private static List<ModelElement> listType = null;

    @objid ("cf349fb7-8456-406f-84b2-4200ae5b0e02")
    private static List<ModelElement> listUnit = null;

    @objid ("5053aaec-690f-49e9-af18-ba1df0d17f41")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.CLOCK_EVENT_CLOCK_EVENT_STANDARD, value);
        }
        else if(row == 2){
            if (value.equals("")) {
                ModelUtils.removeTaggedValue(MARTEDesignerTagTypes.CLOCK_EVENT_CLOCK_EVENT_TYPE, elt);
                
            }else  {
                for (ModelElement temp : listType){
                    if (ModelUtils.getMARTEName(temp).equals(value)){
                        ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.CLOCK_EVENT_CLOCK_EVENT_TYPE, value);
                    }
                }
            }
        }
        else if(row == 3){
            ModelUtils.manageSingleOrientedLink(elt, 
                                                listUnit, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_UNIT_CLOCK_UNIT, 
        //                                                MARTEDesignerTagTypes.CLOCK_EVENT_CLOCK_EVENT_UNIT,
                                                value );
        }
    }

    @objid ("57bdabce-fc1e-4f5f-b143-1b98aa664439")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        /*
         * standard initialization
         */
        
        // General Positioning System, Local Time, Sidereal Time, International Atomic Time, Barycentric Coordinate Time
        // Geocentric Coordinate Time, Barycentric Dynamical Time, Terrestrial Time, Universal Time 0, Universal Time 1
        // Coordinated Universal Time
        String[] tabStandard = new String[] {"GPS", "Local", "Sidereal", "TAI", "TCB", "TCG", "TDB", "TT", "UT0", "UT1", "UTC"};
        String value_standard = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCK_EVENT_CLOCK_EVENT_STANDARD, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCK_EVENT_CLOCK_EVENT_STANDARD),value_standard, tabStandard);
        
        
        /*
         * type initialization
         */
        listType = ModelUtils.searchElementStereotyped(Class.class, MARTEDesignerStereotypes.CLOCKTYPE_CLASS);
        String[] type = ModelUtils.createListString(listType);
        String value_type = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCK_EVENT_CLOCK_EVENT_TYPE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCK_EVENT_CLOCK_EVENT_TYPE),value_type, type);
        
        /*
         * unit initialization
         */
        
        listUnit = ModelUtils.searchElementStereotyped(EnumerationLiteral.class, MARTEDesignerStereotypes.UNIT_ENUMERATIONLITERAL);
        String[] tabUnit = ModelUtils.createListString(listUnit);    
        String value_Unit = ModelUtils.getTargetDependencyNames(MARTEDesignerTagTypes.CLOCK_EVENT_CLOCK_EVENT_UNIT, elt);        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.CLOCK_EVENT_CLOCK_EVENT_UNIT),value_Unit, tabUnit);
    }

}
