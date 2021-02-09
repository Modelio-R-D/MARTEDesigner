package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ConcurrencyResource_Attribute extends Resource_Attribute {
    public ConcurrencyResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONCURRENCYRESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("ConcurrencyResource_Attribute"));
    }

    public ConcurrencyResource_Attribute(final Attribute element) {
        super(element);
    }

}
