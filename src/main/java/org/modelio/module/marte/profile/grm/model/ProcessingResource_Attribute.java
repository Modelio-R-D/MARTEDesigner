package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ProcessingResource_Attribute extends Resource_Attribute {
    public ProcessingResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PROCESSINGRESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("ProcessingResource_Attribute"));
    }

    public ProcessingResource_Attribute(final Attribute element) {
        super(element);
    }

    public String getspeedFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ATTRIBUTE_PROCESSINGRESOURCE_ATTRIBUTE_SPEEDFACTOR, this.element);
    }

    public void setspeedFactor(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_ATTRIBUTE_PROCESSINGRESOURCE_ATTRIBUTE_SPEEDFACTOR, value);
    }

    public String getmainScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ATTRIBUTE_PROCESSINGRESOURCE_ATTRIBUTE_MAINSCHEDULER, this.element);
    }

    public void setmainScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_ATTRIBUTE_PROCESSINGRESOURCE_ATTRIBUTE_MAINSCHEDULER, value);
    }

}
