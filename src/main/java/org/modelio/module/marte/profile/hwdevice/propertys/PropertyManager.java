package org.modelio.module.marte.profile.hwdevice.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.hwcommunication.propertys.DefaultProperty;

@objid ("43a29b3c-1913-4b4d-8d75-87b059aa97c8")
public class PropertyManager {
    @objid ("e447b6b4-af7f-4ee3-ab75-6de394fe234f")
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
