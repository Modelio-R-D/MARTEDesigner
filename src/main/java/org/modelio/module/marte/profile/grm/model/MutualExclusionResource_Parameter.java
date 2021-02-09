package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class MutualExclusionResource_Parameter extends Resource_Parameter {
    public MutualExclusionResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("MutualExclusionResource_Parameter"));
    }

    public MutualExclusionResource_Parameter(final Parameter element) {
        super(element);
    }

    public String getprotectKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND, this.element);
    }

    public void setprotectKind(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND, value);
    }

    public String getceiling() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING, this.element);
    }

    public void setceiling(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING, value);
    }

    public String getotherProtectProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL, this.element);
    }

    public void setotherProtectProtocol(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL, value);
    }

    public String getscheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER, this.element);
    }

    public void setscheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER, value);
    }

}
