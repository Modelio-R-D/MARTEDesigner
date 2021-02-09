package org.modelio.module.marte.profile.sw_brokering.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.DEVICEBROKER_ASSOCIATIONEND)){
            return new DeviceBroker_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.DEVICEBROKER_ASSOCIATION)){
            return new DeviceBroker_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.DEVICEBROKER_ATTRIBUTE)){
            return new DeviceBroker_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.DEVICEBROKER_CLASSIFIER)){
            return new DeviceBroker_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.DEVICEBROKER_INSTANCE)){
            return new DeviceBroker_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.DEVICEBROKER_LIFELINE)){
            return new DeviceBroker_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.DEVICEBROKER_LINK)){
            return new DeviceBroker_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.DEVICEBROKER_PARAMETER)){
            return new DeviceBroker_ParameterProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.MEMORYBROKER_ASSOCIATIONEND)){
            return new MemoryBroker_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MEMORYBROKER_ASSOCIATION)){
            return new MemoryBroker_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MEMORYBROKER_ATTRIBUTE)){
            return new MemoryBroker_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MEMORYBROKER_CLASSIFIER)){
            return new MemoryBroker_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MEMORYBROKER_INSTANCE)){
            return new MemoryBroker_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MEMORYBROKER_LIFELINE)){
            return new MemoryBroker_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MEMORYBROKER_LINK)){
            return new MemoryBroker_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MEMORYBROKER_PARAMETER)){
            return new MemoryBroker_ParameterProperty();
        }
        return new DefaultProperty();
    }

    public static void changeProperty(ModelElement elt, Stereotype ste, int row, String value) {
    }

    public static void update(ModelElement elt, Stereotype ste, IModulePropertyTable table) {
    }

}
