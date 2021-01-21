package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d8ab2adf-c00a-46de-bdb4-8eb21d8d1f97")
public class SchedulableResource_Lifeline extends Resource_Lifeline {
    @objid ("e5b2c1c7-b674-417a-89a1-4cecb94896d2")
    public SchedulableResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULABLERESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("SchedulableResource_Lifeline"));
    }

    @objid ("0e638da6-e8bd-43c6-997c-0eafc1803b55")
    public SchedulableResource_Lifeline(final Lifeline element) {
        super(element);
    }

    @objid ("7a1047dd-463b-4655-b076-bdb445f38353")
    public String getschedParams() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS, this.element);
    }

    @objid ("1ebc93bb-86b3-4718-b7b6-8240ed57f7f4")
    public void setschedParams(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS, value);
    }

    @objid ("caaa7531-79bc-4478-8721-b3ebaa3a331c")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDULABLERESOURCE_LIFELINE_HOST, this.element);
    }

    @objid ("cffe8602-52b7-4cee-85d8-e11b8c6ea583")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDULABLERESOURCE_LIFELINE_HOST, value);
    }

    @objid ("775df504-3900-4d71-a524-4ad885fcdd0e")
    public String getdependentScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER, this.element);
    }

    @objid ("b344bcb9-a6da-4bd1-ab5d-999e11f6fa29")
    public void setdependentScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER, value);
    }

}
