package org.modelio.module.marte.profile.hwcommunication.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("48b83e2b-b1f0-41ac-9509-93aa938ae263")
public class PropertyManager {
    @objid ("269caccb-b49f-45b5-9919-bc1c3da898ea")
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.HWARBITER_ASSOCIATION)){
            return new HwArbiter_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWARBITER_ASSOCIATIONEND)){
            return new HwArbiter_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWARBITER_ATTRIBUTE)){
            return new HwArbiter_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWARBITER_CLASSIFIER)){
            return new HwArbiter_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWARBITER_INSTANCE)){
            return new HwArbiter_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWARBITER_LIFELINE)){
            return new HwArbiter_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWARBITER_LINK)){
            return new HwArbiter_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWARBITER_PARAMETER)){
            return new HwArbiter_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBRIDGE_ASSOCIATION)){
            return new HwBridge_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBRIDGE_ASSOCIATIONEND)){
            return new HwBridge_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBRIDGE_ATTRIBUTE)){
            return new HwBridge_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBRIDGE_CLASSIFIER)){
            return new HwBridge_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBRIDGE_INSTANCE)){
            return new HwBridge_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBRIDGE_LIFELINE)){
            return new HwBridge_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBRIDGE_LINK)){
            return new HwBridge_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBRIDGE_PARAMETER)){
            return new HwBridge_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBUS_ASSOCIATION)){
            return new HwBus_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBUS_ASSOCIATIONEND)){
            return new HwBus_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBUS_ATTRIBUTE)){
            return new HwBus_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBUS_CLASSIFIER)){
            return new HwBus_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBUS_INSTANCE)){
            return new HwBus_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBUS_LINK)){
            return new HwBus_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBUS_LIFELINE)){
            return new HwBus_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWBUS_PARAMETER)){
            return new HwBus_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWENDPOINT_ASSOCIATIONEND)){
            return new HwEndPoint_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWENDPOINT_ASSOCIATION)){
            return new HwEndPoint_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWENDPOINT_ATTRIBUTE)){
            return new HwEndPoint_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWENDPOINT_CLASSIFIER)){
            return new HwEndPoint_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWENDPOINT_LINKEND)){
            return new HwEndPoint_LinkEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWENDPOINT_LINK)){
            return new HwEndPoint_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWENDPOINT_PARAMETER)){
            return new HwEndPoint_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEDIA_ASSOCIATION)){
            return new HwMedia_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEDIA_ASSOCIATIONEND)){
            return new HwMedia_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEDIA_ATTRIBUTE)){
            return new HwMedia_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEDIA_CLASSIFIER)){
            return new HwMedia_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEDIA_INSTANCE)){
            return new HwMedia_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEDIA_LINK)){
            return new HwMedia_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEDIA_LIFELINE)){
            return new HwMedia_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEDIA_PARAMETER)){
            return new HwMedia_ParameterProperty();
        }
        return new DefaultProperty();
    }

}
