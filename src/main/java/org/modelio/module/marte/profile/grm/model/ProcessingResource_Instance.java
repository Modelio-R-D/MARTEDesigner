package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ProcessingResource_Instance extends Resource_Instance {
    public ProcessingResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PROCESSINGRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("ProcessingResource_Instance"));
    }

    public ProcessingResource_Instance(final Instance element) {
        super(element);
    }

    public String getspeedFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_INSTANCE_PROCESSINGRESOURCE_INSTANCE_SPEEDFACTOR, this.element);
    }

    public void setspeedFactor(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_INSTANCE_PROCESSINGRESOURCE_INSTANCE_SPEEDFACTOR, value);
    }

}
