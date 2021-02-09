package org.modelio.module.marte.profile.variables.propertys;

import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.VAR_ATTRIBUTE)){
            return new Var_AttributeProperty();
        }
        return new DefaultProperty();
    }

}
