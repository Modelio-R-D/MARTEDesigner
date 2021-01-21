package org.modelio.module.marte.profile.references.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.profile.editors.IPropertyContent;

@objid ("10df73e9-6d08-4891-a36c-d36aab77c79c")
public class PropertyManager {
    @objid ("8f6beef8-1292-4ee5-80ba-952d437b7d5d")
    public static IPropertyContent getPalette(Stereotype ste) {
        return new DefaultProperty();
    }

}
