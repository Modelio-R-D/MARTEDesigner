package org.modelio.module.marte.profile.hwmemory.propertys;

import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.HWCACHE_ASSOCIATIONEND)){
            return new HwCache_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCACHE_ASSOCIATION)){
            return new HwCache_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCACHE_ATTRIBUTE)){
            return new HwCache_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCACHE_CLASSIFIER)){
            return new HwCache_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCACHE_INSTANCE)){
            return new HwCache_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCACHE_LIFELINE)){
            return new HwCache_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCACHE_LINK)){
            return new HwCache_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWCACHE_PARAMETER)){
            return new HwCache_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDRIVE_ASSOCIATIONEND)){
            return new HwDrive_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDRIVE_ASSOCIATION)){
            return new HwDrive_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDRIVE_ATTRIBUTE)){
            return new HwDrive_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDRIVE_CLASSIFIER)){
            return new HwDrive_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDRIVE_INSTANCE)){
            return new HwDrive_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDRIVE_LIFELINE)){
            return new HwDrive_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDRIVE_LINK)){
            return new HwDrive_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDRIVE_PARAMETER)){
            return new HwDrive_ParameterProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEMORY_ASSOCIATIONEND)){
            return new HwMemory_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEMORY_ASSOCIATION)){
            return new HwMemory_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEMORY_ATTRIBUTE)){
            return new HwMemory_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEMORY_CLASSIFIER)){
            return new HwMemory_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEMORY_INSTANCE)){
            return new HwMemory_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEMORY_LIFELINE)){
            return new HwMemory_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEMORY_LINK)){
            return new HwMemory_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMEMORY_PARAMETER)){
            return new HwMemory_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRAM_ASSOCIATIONEND)){
            return new HwRAM_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRAM_ASSOCIATION)){
            return new HwRAM_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRAM_ATTRIBUTE)){
            return new HwRAM_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRAM_CLASSIFIER)){
            return new HwRAM_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRAM_INSTANCE)){
            return new HwRAM_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRAM_LIFELINE)){
            return new HwRAM_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRAM_LINK)){
            return new HwRAM_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWRAM_PARAMETER)){
            return new HwRAM_ParameterProperty();
        }        
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWROM_ASSOCIATIONEND)){
            return new HwROM_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWROM_ASSOCIATION)){
            return new HwROM_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWROM_ATTRIBUTE)){
            return new HwROM_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWROM_CLASSIFIER)){
            return new HwROM_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWROM_INSTANCE)){
            return new HwROM_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWROM_LIFELINE)){
            return new HwROM_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWROM_LINK)){
            return new HwROM_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWROM_PARAMETER)){
            return new HwROM_ParameterProperty();
        }
        return new DefaultProperty();
    }

}
