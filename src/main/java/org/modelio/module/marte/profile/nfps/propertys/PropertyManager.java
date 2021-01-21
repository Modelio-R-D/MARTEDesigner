package org.modelio.module.marte.profile.nfps.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("5ac01eba-8c9c-42c2-a434-5e1a6f64503a")
public class PropertyManager {
    @objid ("dc59474c-7d7c-4d89-9881-1d54292f9b59")
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.DIMENSION_ENUMERATION)){
            return new Dimension_EnumerationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.NFPCONSTRAINT_CONSTRAINT)){
            return new NfpConstraint_ConstraintProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.NFPTYPE_DATATYPE)){
            return new NfpType_DataTypeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.UNIT_ENUMERATIONLITERAL)){
            return new Unit_EnumerationLiteralProperty();
        }
        return new DefaultProperty();
    }

}
