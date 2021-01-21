package org.modelio.module.marte.profile.time.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("db758711-677b-4085-9b14-40d68ef18047")
public class Clock_InstanceProperty implements IPropertyContent {
    @objid ("965deaff-dcb3-4f4c-8ec8-5eb87c1d34c2")
    private static List<ModelElement> listType = null;

    @objid ("0f754c30-6511-4258-8b3b-ab189ae8e835")
    private static List<ModelElement> listUnit = null;

    @objid ("f6d20f2f-d495-41ab-87b6-93c0fdf05f16")
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

    @objid ("ad07eaf0-51c3-4c7e-8da3-83697afbd26a")
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
