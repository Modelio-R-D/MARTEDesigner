package org.modelio.module.marte.profile.extentions.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("3fafdda6-d564-470c-a01c-bc91d2770bda")
public class PropertyManager {
    @objid ("caae8ef9-6a2c-4fcd-9314-73cce6c1d7b3")
    public static IPropertyContent getPalette(Stereotype ste) {
        return new DefaultProperty();
    }

}
