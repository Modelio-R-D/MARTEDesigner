package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("49c885a3-ec1f-479e-888d-f4a6d9c2f248")
public class SchedulableResource_Parameter extends Resource_Parameter {
    @objid ("271f026d-1893-46b5-ab81-3cb9e2cbeeed")
    public SchedulableResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULABLERESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("SchedulableResource_Parameter"));
    }

    @objid ("7b50f7b6-6bb2-4471-a35b-1469aee3bcc7")
    public SchedulableResource_Parameter(final Parameter element) {
        super(element);
    }

    @objid ("5ded45c7-5395-4f4e-9122-429e122015a3")
    public String getschedParams() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_PARAMETER_SCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS, this.element);
    }

    @objid ("afa47ba6-e8c5-4828-9b2d-79fba0ba4839")
    public void setschedParams(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_PARAMETER_SCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS, value);
    }

    @objid ("868b96ab-00ae-4a86-93da-2fcb9b850aef")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_PARAMETER_SCHEDULABLERESOURCE_PARAMETER_HOST, this.element);
    }

    @objid ("0bedd191-36ab-4a3e-b632-aa729a3e1b26")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_PARAMETER_SCHEDULABLERESOURCE_PARAMETER_HOST, value);
    }

    @objid ("84a9f896-0fa9-4286-817f-73633f9f4333")
    public String getdependentScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_PARAMETER_SCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER, this.element);
    }

    @objid ("9c106251-d620-4643-968b-eb2025cfb4c9")
    public void setdependentScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_PARAMETER_SCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER, value);
    }

}
