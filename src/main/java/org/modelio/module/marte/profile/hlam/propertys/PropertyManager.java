package org.modelio.module.marte.profile.hlam.propertys;

import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.PPUNIT_ACTOR)){
            return new PpUnit_ActorProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PPUNIT_BEHAVIOR )){
            return new PpUnit_BehaviorProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PPUNIT_CLASS )){
            return new PpUnit_ClassProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PPUNIT_COLLABORATION)){
            return new PpUnit_CollaborationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PPUNIT_USECASE)){
            return new PpUnit_UseCaseProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTACTION_CALLACTION)){
            return new RtAction_CallActionProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTACTION_OPAQUEACTION)){
            return new RtAction_OpaqueActionProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTACTION_OPERATION)){
            return new RtAction_OperationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTACTION_SENDSIGNALACTION)){
            return new RtAction_SendSignalActionProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTFEATURE_CALLACTION)){
            return new RtFeature_CallActionProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTFEATURE_MESSAGE)){
            return new RtFeature_MessageProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTFEATURE_OPAQUEACTION)){
            return new RtFeature_OpaqueActionProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTFEATURE_OPERATION)){
            return new RtFeature_OperationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTFEATURE_PORT)){
            return new RtFeature_PortProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTFEATURE_SENDSIGNALACTION)){
            return new RtFeature_SendSignalActionProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTFEATURE_SIGNAL)){
            return new RtFeature_SignalProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTSERVICE_OPERATION)){
            return new RtService_OperationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTSPECIFICATION_NOTE)){
            return new RtSpecification_NoteProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTUNIT_ACTOR)){
            return new RtUnit_ActorProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTUNIT_BEHAVIOR)){
            return new RtUnit_BehaviorProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTUNIT_CLASS)){
            return new RtUnit_ClassProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTUNIT_COLLABORATION)){
            return new RtUnit_CollaborationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RTUNIT_USECASE)){
            return new RtUnit_UseCaseProperty();
        }
        return new DefaultProperty();
    }

}
