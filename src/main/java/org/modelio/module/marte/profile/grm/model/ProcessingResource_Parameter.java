package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ProcessingResource_Parameter extends Resource_Parameter {
    public ProcessingResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PROCESSINGRESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("ProcessingResource_Parameter"));
    }

    public ProcessingResource_Parameter(final Parameter element) {
        super(element);
    }

    public String getspeedFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_PARAMETER_PROCESSINGRESOURCE_PARAMETER_SPEEDFACTOR, this.element);
    }

    public void setspeedFactor(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_PARAMETER_PROCESSINGRESOURCE_PARAMETER_SPEEDFACTOR, value);
    }

    public String getmainScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_PARAMETER_PROCESSINGRESOURCE_PARAMETER_MAINSCHEDULER, this.element);
    }

    public void setmainScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_PARAMETER_PROCESSINGRESOURCE_PARAMETER_MAINSCHEDULER, value);
    }

}
