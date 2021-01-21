package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b4464fd5-f9bd-4d1c-a0aa-108aee6a710e")
public class SchedulableResource_Attribute extends Resource_Attribute {
    @objid ("d1dcc12b-b8d2-434a-b2fa-06c5a1b0d943")
    public SchedulableResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("SchedulableResource_Attribute"));
    }

    @objid ("2066f8ae-1b52-4d95-afa9-9bda0adaa964")
    public SchedulableResource_Attribute(final Attribute element) {
        super(element);
    }

    @objid ("fb92a64e-8559-4110-9a40-92a7f9f7db83")
    public String getschedParams() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS, this.element);
    }

    @objid ("58f0d050-cb94-4189-a0b4-414506d349e9")
    public void setschedParams(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDPARAMS, value);
    }

    @objid ("d231eb6c-c1ce-4f1c-a366-05a859159577")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULABLERESOURCE_ATTRIBUTE_HOST, this.element);
    }

    @objid ("2428b388-230b-4a29-9f4f-5b530c0e3f44")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULABLERESOURCE_ATTRIBUTE_HOST, value);
    }

    @objid ("7ef5a1c7-d7bc-49bd-98b5-b351adef2546")
    public String getdependentScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER, this.element);
    }

    @objid ("c0520215-e85b-4a87-b1a5-cc26bdc00e7e")
    public void setdependentScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULABLERESOURCE_ATTRIBUTE_DEPENDENTSCHEDULER, value);
    }

}
