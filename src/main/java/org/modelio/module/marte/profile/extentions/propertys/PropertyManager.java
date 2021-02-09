package org.modelio.module.marte.profile.extentions.propertys;

import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.profile.editors.IPropertyContent;

public class PropertyManager {
    public static IPropertyContent getPalette(Stereotype ste) {
        return new DefaultProperty();
    }

}
