package org.modelio.module.marte.profile.hwstoragemanager.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.HWDMA_ASSOCIATIONEND)){
            return new HwDMA_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDMA_ASSOCIATION)){
            return new HwDMA_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDMA_ATTRIBUTE)){
            return new HwDMA_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDMA_CLASSIFIER)){
            return new HwDMA_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDMA_INSTANCE)){
            return new HwDMA_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDMA_LIFELINE)){
            return new HwDMA_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDMA_LINK)){
            return new HwDMA_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWDMA_PARAMETER)){
            return new HwDMA_ParameterProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMMU_ASSOCIATIONEND)){
            return new HwMMU_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMMU_ASSOCIATION)){
            return new HwMMU_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMMU_ATTRIBUTE)){
            return new HwMMU_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMMU_CLASSIFIER)){
            return new HwMMU_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMMU_INSTANCE)){
            return new HwMMU_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMMU_LIFELINE)){
            return new HwMMU_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMMU_LINK)){
            return new HwMMU_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWMMU_PARAMETER)){
            return new HwMMU_ParameterProperty();
        }
        
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWSTORAGEMANAGER_ASSOCIATIONEND)){
            return new HwStorageManager_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWSTORAGEMANAGER_ASSOCIATION)){
            return new HwStorageManager_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWSTORAGEMANAGER_ATTRIBUTE)){
            return new HwStorageManager_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWSTORAGEMANAGER_CLASSIFIER)){
            return new HwStorageManager_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWSTORAGEMANAGER_INSTANCE)){
            return new HwStorageManager_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWSTORAGEMANAGER_LIFELINE)){
            return new HwStorageManager_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWSTORAGEMANAGER_LINK)){
            return new HwStorageManager_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.HWSTORAGEMANAGER_PARAMETER)){
            return new HwStorageManager_ParameterProperty();
        }
        return new DefaultProperty();
    }

    public static void changeProperty(ModelElement elt, Stereotype ste, int row, String value) {
    }

    public static void update(ModelElement elt, Stereotype ste, IModulePropertyTable table) {
    }

}
