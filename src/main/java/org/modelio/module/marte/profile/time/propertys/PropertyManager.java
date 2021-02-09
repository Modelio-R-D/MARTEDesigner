package org.modelio.module.marte.profile.time.propertys;

import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.CLOCK_INSTANCE)){
            return new Clock_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.CLOCK_EVENT)){
            return new Clock_EventProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.CLOCKTYPE_CLASS)){
            return new ClockType_ClassProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMEDEVENT_EVENT)){
            return new TimedEvent_EventProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.CLOCKCONSTRAINT_CONSTRAINT)){
            return new ClockConstraint_ConstraintProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMEDCONSTRAINT_CONSTRAINT)){
            return new TimedConstraint_ConstraintProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMEDDURATIONOBSERVATION_NOTE)){
            return new TimedDurationObservation_NoteProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMEDPROCESSING_ACTIVITYACTION)){
            return new TimedProcessing_ActivityActionProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMEDPROCESSING_BEHAVIOR)){
            return new TimedProcessing_BehaviorProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMEDPROCESSING_MESSAGE)){
            return new TimedProcessing_MessageProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMEDINSTANTOBSERVATION_NOTE)){
            return new TimedInstantObservation_NoteProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMEDVALUESPECIFICATION_TAGGEDVALUE)){
            return new TimedValueSpecification_TaggedValueProperty();
        }
        return new DefaultProperty();
    }

}
