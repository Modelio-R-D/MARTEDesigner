package org.modelio.module.marte.profile.sw_interaction.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("43c28163-49e1-457a-9680-9cddccec318b")
public class PropertyManager {
    @objid ("f6aa8613-6918-4102-8bab-4e41498b5cbf")
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.MESSAGECOMRESOURCE_ASSOCIATIONEND)){
            return new MessageComResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MESSAGECOMRESOURCE_ASSOCIATION)){
            return new MessageComResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MESSAGECOMRESOURCE_ATTRIBUTE)){
            return new MessageComResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MESSAGECOMRESOURCE_CLASSIFIER)){
            return new MessageComResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MESSAGECOMRESOURCE_INSTANCE)){
            return new MessageComResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MESSAGECOMRESOURCE_LIFELINE)){
            return new MessageComResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MESSAGECOMRESOURCE_LINK)){
            return new MessageComResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MESSAGECOMRESOURCE_PARAMETER)){
            return new MessageComResource_ParameterProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_ASSOCIATIONEND)){
            return new NotificationResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_ASSOCIATION)){
            return new NotificationResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_ATTRIBUTE)){
            return new NotificationResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_CLASSIFIER)){
            return new NotificationResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_INSTANCE)){
            return new NotificationResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_LIFELINE)){
            return new NotificationResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_LINK)){
            return new NotificationResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_PARAMETER)){
            return new NotificationResource_ParameterProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_ASSOCIATIONEND)){
            return new SharedDataComResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_ASSOCIATION)){
            return new SharedDataComResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_ATTRIBUTE)){
            return new SharedDataComResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_CLASSIFIER)){
            return new SharedDataComResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_INSTANCE)){
            return new SharedDataComResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_LIFELINE)){
            return new SharedDataComResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_LINK)){
            return new SharedDataComResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_PARAMETER)){
            return new SharedDataComResource_ParameterProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_ASSOCIATIONEND)){
            return new SwCommunicationResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION)){
            return new SwCommunicationResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE)){
            return new SwCommunicationResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER)){
            return new SwCommunicationResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_INSTANCE)){
            return new SwCommunicationResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_LIFELINE)){
            return new SwCommunicationResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_LINK)){
            return new SwCommunicationResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_PARAMETER)){
            return new SwCommunicationResource_ParameterProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_ASSOCIATIONEND)){
            return new SwInteractionResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_ASSOCIATION)){
            return new SwInteractionResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_ATTRIBUTE)){
            return new SwInteractionResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_CLASSIFIER)){
            return new SwInteractionResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_INSTANCE)){
            return new SwInteractionResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_LIFELINE)){
            return new SwInteractionResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_LINK)){
            return new SwInteractionResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_PARAMETER)){
            return new SwInteractionResource_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND)){
            return new SwMutualExclusionResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION)){
            return new SwMutualExclusionResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE)){
            return new SwMutualExclusionResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER)){
            return new SwMutualExclusionResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE)){
            return new SwMutualExclusionResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE)){
            return new SwMutualExclusionResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_LINK)){
            return new SwMutualExclusionResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER)){
            return new SwMutualExclusionResource_ParameterProperty();
        }
        return new DefaultProperty();
    }

    @objid ("74e20129-1191-4264-a56b-13ea3521e5b8")
    public static void changeProperty(ModelElement elt, Stereotype ste, int row, String value) {
    }

    @objid ("23506874-80f8-43ff-ae41-260638773e12")
    public static void update(ModelElement elt, Stereotype ste, IModulePropertyTable table) {
    }

}
