package org.modelio.module.marte.profile.hwdevice.propertys;

import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.hwcommunication.propertys.DefaultProperty;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.HWDEVICE_ASSOCIATIONEND)){
            return new HwDevice_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDEVICE_ASSOCIATION)){
            return new HwDevice_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDEVICE_ATTRIBUTE)){
            return new HwDevice_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDEVICE_CLASSIFIER)){
            return new HwDevice_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDEVICE_INSTANCE)){
            return new HwDevice_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDEVICE_LIFELINE)){
            return new HwDevice_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDEVICE_LINK)){
            return new HwDevice_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDEVICE_PARAMETER)){
            return new HwDevice_ParameterProperty();
        }
        return new DefaultProperty();
    }

}
