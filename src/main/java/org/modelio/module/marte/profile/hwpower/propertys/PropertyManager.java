package org.modelio.module.marte.profile.hwpower.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.HWCOOLINGSUPPLY_ASSOCIATIONEND)){
            return new HwCoolingSupply_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOOLINGSUPPLY_ASSOCIATION)){
            return new HwCoolingSupply_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOOLINGSUPPLY_ATTRIBUTE)){
            return new HwCoolingSupply_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOOLINGSUPPLY_CLASSIFIER)){
            return new HwCoolingSupply_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOOLINGSUPPLY_INSTANCE)){
            return new HwCoolingSupply_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOOLINGSUPPLY_LIFELINE)){
            return new HwCoolingSupply_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOOLINGSUPPLY_LINK)){
            return new HwCoolingSupply_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOOLINGSUPPLY_PARAMETER)){
            return new HwCoolingSupply_ParameterProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPOWERSUPPLY_ASSOCIATIONEND)){
            return new HwPowerSupply_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPOWERSUPPLY_ASSOCIATION)){
            return new HwPowerSupply_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPOWERSUPPLY_ATTRIBUTE)){
            return new HwPowerSupply_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPOWERSUPPLY_CLASSIFIER)){
            return new HwPowerSupply_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPOWERSUPPLY_INSTANCE)){
            return new HwPowerSupply_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPOWERSUPPLY_LIFELINE)){
            return new HwPowerSupply_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPOWERSUPPLY_LINK)){
            return new HwPowerSupply_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPOWERSUPPLY_PARAMETER)){
            return new HwPowerSupply_ParameterProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBATTERY_ASSOCIATIONEND)){
            return new HwBattery_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBATTERY_ASSOCIATION)){
            return new HwBattery_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBATTERY_ATTRIBUTE)){
            return new HwBattery_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBATTERY_CLASSIFIER)){
            return new HwBattery_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBATTERY_INSTANCE)){
            return new HwBattery_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBATTERY_LIFELINE)){
            return new HwBattery_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBATTERY_LINK)){
            return new HwBattery_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBATTERY_PARAMETER)){
            return new HwBattery_ParameterProperty();
        }
        return new DefaultProperty();
    }

    public static void changeProperty(ModelElement elt, Stereotype ste, int row, String value) {
    }

    public static void update(ModelElement elt, Stereotype ste, IModulePropertyTable table) {
    }

}
