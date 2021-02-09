package org.modelio.module.marte.profile.hwtiming.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.HWCLOCK_ASSOCIATIONEND)){
            return new HwClock_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCLOCK_ASSOCIATION)){
            return new HwClock_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCLOCK_ATTRIBUTE)){
            return new HwClock_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCLOCK_CLASSIFIER)){
            return new HwClock_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCLOCK_INSTANCE)){
            return new HwClock_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCLOCK_LIFELINE)){
            return new HwClock_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCLOCK_LINK)){
            return new HwClock_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCLOCK_PARAMETER)){
            return new HwClock_ParameterProperty();
        }
        
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMER_ASSOCIATIONEND)){
            return new HwTimer_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMER_ASSOCIATION)){
            return new HwTimer_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMER_ATTRIBUTE)){
            return new HwTimer_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMER_CLASSIFIER)){
            return new HwTimer_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMER_INSTANCE)){
            return new HwTimer_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMER_LIFELINE)){
            return new HwTimer_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMER_LINK)){
            return new HwTimer_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMER_PARAMETER)){
            return new HwTimer_ParameterProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMINGRESOURCE_ASSOCIATIONEND)){
            return new HwTimingResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMINGRESOURCE_ASSOCIATION)){
            return new HwTimingResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMINGRESOURCE_ATTRIBUTE)){
            return new HwTimingResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMINGRESOURCE_CLASSIFIER)){
            return new HwTimingResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMINGRESOURCE_INSTANCE)){
            return new HwTimingResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMINGRESOURCE_LIFELINE)){
            return new HwTimingResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMINGRESOURCE_LINK)){
            return new HwTimingResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWTIMINGRESOURCE_PARAMETER)){
            return new HwTimingResource_ParameterProperty();
        }
        return new DefaultProperty();
    }

    public static void changeProperty(ModelElement elt, Stereotype ste, int row, String value) {
    }

    public static void update(ModelElement elt, Stereotype ste, IModulePropertyTable table) {
    }

}
