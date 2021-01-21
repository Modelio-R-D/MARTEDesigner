package org.modelio.module.marte.profile.hwgeneral.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("b7e385f5-c40a-4d2d-b0d4-c52720675cac")
public class PropertyManager {
    @objid ("215ed62f-71c4-4b47-ac0c-0073474d67b0")
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION)){
            return new HwResourceService_CollaborationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE)){
            return new HwResourceService_CollaborationUseProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION)){
            return new HwResourceService_ExecutionSpecificationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION)){
            return new HwResourceService_OperationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRESOURCE_ASSOCIATIONEND)){
            return new HwResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRESOURCE_ASSOCIATION)){
            return new HwResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRESOURCE_ATTRIBUTE)){
            return new HwResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRESOURCE_CLASSIFIER)){
            return new HwResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRESOURCE_INSTANCE)){
            return new HwResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRESOURCE_LIFELINE)){
            return new HwResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRESOURCE_LINK)){
            return new HwResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRESOURCE_PARAMETER)){
            return new HwResource_ParameterProperty();
        }
        return new DefaultProperty();
    }

}
