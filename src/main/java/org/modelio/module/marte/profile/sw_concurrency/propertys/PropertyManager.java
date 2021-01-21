package org.modelio.module.marte.profile.sw_concurrency.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("27dc79b4-87df-4fbf-aa3f-170e65f5a50e")
public class PropertyManager {
    @objid ("4e5a9f8d-c026-45c2-82ed-6b1949deb683")
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.ALARM_ASSOCIATIONEND)){
            return new Alarm_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.ALARM_ASSOCIATION)){
            return new Alarm_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.ALARM_ATTRIBUTE)){
            return new Alarm_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.ALARM_CLASSIFIER)){
            return new Alarm_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.ALARM_INSTANCE)){
            return new Alarm_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.ALARM_LIFELINE)){
            return new Alarm_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.ALARM_LINK)){
            return new Alarm_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.ALARM_PARAMETER)){
            return new Alarm_ParameterProperty();
        }


        else if(ste.getName().equals(MARTEDesignerStereotypes.ENTRYPOINT_DEPENDENCY)){
            return new EntryPoint_DependencyProperty();
        }


        else if(ste.getName().equals(MARTEDesignerStereotypes.INTERRUPTRESOURCE_ASSOCIATIONEND)){
            return new InterruptResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.INTERRUPTRESOURCE_ASSOCIATION)){
            return new InterruptResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.INTERRUPTRESOURCE_ATTRIBUTE)){
            return new InterruptResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.INTERRUPTRESOURCE_CLASSIFIER)){
            return new InterruptResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.INTERRUPTRESOURCE_INSTANCE)){
            return new InterruptResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.INTERRUPTRESOURCE_LIFELINE)){
            return new InterruptResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.INTERRUPTRESOURCE_LINK)){
            return new InterruptResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.INTERRUPTRESOURCE_PARAMETER)){
            return new InterruptResource_ParameterProperty();
        }

        else if(ste.getName().equals(MARTEDesignerStereotypes.MEMORYPARTITION_ASSOCIATIONEND)){
            return new MemoryPartition_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MEMORYPARTITION_ASSOCIATION)){
            return new MemoryPartition_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MEMORYPARTITION_ATTRIBUTE)){
            return new MemoryPartition_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MEMORYPARTITION_INSTANCE)){
            return new MemoryPartition_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MEMORYPARTITION_LIFELINE)){
            return new MemoryPartition_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MEMORYPARTITION_LINK)){
            return new MemoryPartition_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MEMORYPARTITION_PARAMETER)){
            return new MemoryPartition_ParameterProperty();
        }

        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND)){
            return new SwConcurrentResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_ASSOCIATION)){
            return new SwConcurrentResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_ATTRIBUTE)){
            return new SwConcurrentResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_CLASSIFIER)){
            return new SwConcurrentResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_INSTANCE)){
            return new SwConcurrentResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_LIFELINE)){
            return new SwConcurrentResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_LINK)){
            return new SwConcurrentResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_PARAMETER)){
            return new SwConcurrentResource_ParameterProperty();
        }

        else if(ste.getName().equals(MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND)){
            return new SwSchedulableResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_ASSOCIATION)){
            return new SwSchedulableResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_ATTRIBUTE)){
            return new SwSchedulableResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_CLASSIFIER)){
            return new SwSchedulableResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_INSTANCE)){
            return new SwSchedulableResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_LIFELINE)){
            return new SwSchedulableResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_LINK)){
            return new SwSchedulableResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_PARAMETER)){
            return new SwSchedulableResource_ParameterProperty();
        }

        else if(ste.getName().equals(MARTEDesignerStereotypes.SWTIMERRESOURCE_ASSOCIATIONEND)){
            return new SwTimerResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWTIMERRESOURCE_ASSOCIATION)){
            return new SwTimerResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWTIMERRESOURCE_ATTRIBUTE)){
            return new SwTimerResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWTIMERRESOURCE_CLASSIFIER)){
            return new SwTimerResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWTIMERRESOURCE_INSTANCE)){
            return new SwTimerResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWTIMERRESOURCE_LIFELINE)){
            return new SwTimerResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWTIMERRESOURCE_LINK)){
            return new SwTimerResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SWTIMERRESOURCE_PARAMETER)){
            return new SwTimerResource_ParameterProperty();
        }
        return new DefaultProperty();
    }

}
