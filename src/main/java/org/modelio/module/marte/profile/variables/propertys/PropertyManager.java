package org.modelio.module.marte.profile.variables.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("76be431e-5d1e-4950-852a-0cf7b1bed846")
public class PropertyManager {
    @objid ("eed9d22f-5b82-4085-8174-80e0e277870f")
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.VAR_ATTRIBUTE)){
            return new Var_AttributeProperty();
        }
        return new DefaultProperty();
    }

}
