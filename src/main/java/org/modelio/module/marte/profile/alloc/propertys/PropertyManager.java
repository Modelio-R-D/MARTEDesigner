package org.modelio.module.marte.profile.alloc.propertys;

import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION)){
             return new AllocateActivityGroup_ActivityPartitionProperty();
         }
         else if(ste.getName().equals(MARTEDesignerStereotypes.ALLOCATE_DEPENDENCY)){
             return new Allocate_DependencyProperty();
         }
         else if(ste.getName().equals(MARTEDesignerStereotypes.ASSIGN_NOTE)){
             return new Assign_NoteProperty();
         }
         else if(ste.getName().equals(MARTEDesignerStereotypes.ALLOCATED_MODELELEMENT)){
             return new Allocated_ModelElementProperty();
         }
        return new DefaultProperty();
    }

}
