package org.modelio.module.marte.profile.gcm.propertys;

import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.CLIENTSERVERFEATURE_OPERATION)){
            return new ClientServerFeature_OperationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.CLIENTSERVERPORT_PORT)){
            return new ClientServerPort_PortProperty();
        }
               
        else if(ste.getName().equals(MARTEDesignerStereotypes.DATAEVENT_EVENT)){
            return new DataEvent_EventProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.DATAPOOL_ASSOCIATIONEND)){
            return new DataPool_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.DATAPOOL_ATTRIBUTE)){
            return new DataPool_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.FLOWPORT_PORT)){
            return new FlowPort_PortProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.FLOWPROPERTY_ASSOCIATIONEND)){
            return new FlowProperty_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.FLOWPROPERTY_ATTRIBUTE)){
            return new FlowProperty_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.FLOWPROPERTY_BINDABLEINSTANCE)){
            return new FlowProperty_BindableInstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GCMINVOCATIONACTION_ACTIVITYACTION)){
            return new GCMInvocationAction_ActivityActionProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GCMINVOCATINGBEHAVIOR_BEHAVIOR)){
            return new GCMInvocatingBehavior_BehaviorProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GCMTRIGGER_DEPENDENCY)){
            return new GCMTrigger_DependencyProperty();
        }
        return new DefaultProperty();
    }

}
