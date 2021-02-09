package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ComputingResource_Attribute extends MutualExclusionResource_Attribute {
    public ComputingResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMPUTINGRESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("ComputingResource_Attribute"));
    }

    public ComputingResource_Attribute(final Attribute element) {
        super(element);
    }

}
