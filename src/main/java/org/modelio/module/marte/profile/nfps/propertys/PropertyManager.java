package org.modelio.module.marte.profile.nfps.propertys;

import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
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
