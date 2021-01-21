package org.modelio.module.marte.profile.hwcomputing.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.hwcommunication.propertys.DefaultProperty;

@objid ("766fdd04-0de2-4df3-8a84-d69cc4db678e")
public class PropertyManager {
    @objid ("a489414e-0561-44a7-8e83-d61804b72544")
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND)){
            return new HwComputingResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_ASSOCIATION)){
            return new HwComputingResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_ATTRIBUTE)){
            return new HwComputingResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_CLASSIFIER)){
            return new HwComputingResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_INSTANCE)){
            return new HwComputingResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_LIFELINE)){
            return new HwComputingResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_LINK)){
            return new HwComputingResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_PARAMETER)){
            return new HwComputingResource_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWISA_ASSOCIATIONEND)){
            return new HwISA_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWISA_ASSOCIATION)){
            return new HwISA_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWISA_ATTRIBUTE)){
            return new HwISA_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWISA_CLASSIFIER)){
            return new HwISA_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWISA_INSTANCE)){
            return new HwISA_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWISA_LIFELINE)){
            return new HwISA_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWISA_LINK)){
            return new HwISA_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWISA_PARAMETER)){
            return new HwISA_ParameterProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPLD_ASSOCIATIONEND)){
            return new HwPLD_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPLD_ASSOCIATION)){
            return new HwPLD_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPLD_ATTRIBUTE)){
            return new HwPLD_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPLD_CLASSIFIER)){
            return new HwPLD_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPLD_INSTANCE)){
            return new HwPLD_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPLD_LIFELINE)){
            return new HwPLD_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPLD_LINK)){
            return new HwPLD_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPLD_PARAMETER)){
            return new HwPLD_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPROCESSOR_ASSOCIATIONEND)){
            return new HwProcessor_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPROCESSOR_ASSOCIATION)){
            return new HwProcessor_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPROCESSOR_ATTRIBUTE)){
            return new HwProcessor_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPROCESSOR_CLASSIFIER)){
            return new HwProcessor_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPROCESSOR_INSTANCE)){
            return new HwProcessor_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPROCESSOR_LIFELINE)){
            return new HwProcessor_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPROCESSOR_LINK)){
            return new HwProcessor_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWPROCESSOR_PARAMETER)){
            return new HwProcessor_ParameterProperty();
        }
        return new DefaultProperty();
    }

}
