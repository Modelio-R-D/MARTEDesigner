package org.modelio.module.marte.profile.sw_resourcecore.propertys;

import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION)){
            return new SwAccessService_ExecutionSpecificationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWACCESSSERVICE_OPERATION)){
            return new SwAccessService_OperationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWACCESSSERVICE_COLLABORATION)){
            return new SwAccessService_CollaborationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWACCESSSERVICE_COLLABORATIONUSE)){
            return new SwAccessService_CollaborationUseProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWRESOURCE_ASSOCIATIONEND)){
            return new SwResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWRESOURCE_ASSOCIATION)){
            return new SwResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWRESOURCE_ATTRIBUTE)){
            return new SwResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWRESOURCE_CLASSIFIER)){
            return new SwResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWRESOURCE_INSTANCE)){
            return new SwResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWRESOURCE_LIFELINE)){
            return new SwResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWRESOURCE_LINK)){
            return new SwResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWRESOURCE_PARAMETER)){
            return new SwResource_ParameterProperty();
        }
        return new DefaultProperty();
    }

}
