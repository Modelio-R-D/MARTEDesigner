package org.modelio.module.marte.profile.datatypes.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.coreelements.propertys.DefaultProperty;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("c10f5da0-2793-4342-8e5c-8c94b8732936")
public class PropertyManager {
    @objid ("835c7b3d-1466-4b6e-b35b-4e36375843d8")
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
