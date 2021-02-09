package org.modelio.module.marte.profile.datatypes.propertys;

import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.coreelements.propertys.DefaultProperty;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.BOUNDEDSUBTYPE_DATATYPE)){
            return new BoundedSubtype_DataTypeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.CHOICETYPE_DATATYPE)){
            return new ChoiceType_DataTypeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.INTERVALTYPE_DATATYPE)){
            return new IntervalType_DataTypeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.COLLECTIONTYPE_DATATYPE)){
            return new CollectionType_DataTypeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TUPLETYPE_DATATYPE)){
            return new TupleType_DataTypeProperty();
        }
        return new DefaultProperty();
    }

}
