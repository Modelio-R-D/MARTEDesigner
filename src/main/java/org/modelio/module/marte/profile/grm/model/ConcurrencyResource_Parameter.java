package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ConcurrencyResource_Parameter extends Resource_Parameter {
    public ConcurrencyResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONCURRENCYRESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("ConcurrencyResource_Parameter"));
    }

    public ConcurrencyResource_Parameter(final Parameter element) {
        super(element);
    }

}
