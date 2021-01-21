package org.modelio.module.marte.profile.alloc.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("fc03da5d-5102-4a4a-a814-629ea835dd10")
public class PropertyManager {
    @objid ("bcf1a0d5-188a-46c3-b6ac-61498ba5a69f")
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
