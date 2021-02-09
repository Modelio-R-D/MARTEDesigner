package org.modelio.module.marte.profile.hwlayout.propertys;

import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.alloc.propertys.DefaultProperty;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPONENT_ASSOCIATIONEND)){
            return new HwComponent_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPONENT_ASSOCIATION)){
            return new HwComponent_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPONENT_ATTRIBUTE)){
            return new HwComponent_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPONENT_CLASSIFIER)){
            return new HwComponent_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPONENT_INSTANCE)){
            return new HwComponent_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPONENT_LIFELINE)){
            return new HwComponent_LifeLineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPONENT_LINK)){
            return new HwComponent_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPONENT_PARAMETER)){
            return new HwComponent_ParameterProperty();
        }
        return new DefaultProperty();
    }

}
