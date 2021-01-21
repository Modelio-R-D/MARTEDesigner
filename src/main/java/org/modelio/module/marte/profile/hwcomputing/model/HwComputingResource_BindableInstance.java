package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2bd973f6-9de2-4b61-84dd-c12934f51a3f")
public class HwComputingResource_BindableInstance extends ComputingResource_BindableInstance {
    @objid ("0a0d653c-4f73-4ea4-917a-d3de23dd4797")
    public HwComputingResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwComputingResource_BindableInstance"));
    }

    @objid ("9c25dded-6a0d-49a8-a3ea-c1135ca72935")
    public HwComputingResource_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("a028121a-2941-4438-845c-4448c12952ff")
    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_OP_FREQUENCIES, this.element);
    }

    @objid ("78c926d8-e4b6-406b-b0c2-6f694f134fa6")
    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_OP_FREQUENCIES, value);
    }

    @objid ("f66608bc-5f88-47df-950b-51845a822642")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_DESCRIPTION, this.element);
    }

    @objid ("72f4f091-9bb0-4b83-9017-e8f7b4f067e3")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_DESCRIPTION, value);
    }

    @objid ("be59b3eb-8336-4c1e-80e8-3e3869355103")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_P_HW_SERVICES, this.element);
    }

    @objid ("378b6651-2ec4-4a57-8fa8-560171132398")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_P_HW_SERVICES, value);
    }

    @objid ("8f2c6891-da4a-48db-b170-170a3bf13b42")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_R_HW_SERVICES, this.element);
    }

    @objid ("4ef32372-160c-446d-9986-a093536c57a1")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_R_HW_SERVICES, value);
    }

    @objid ("61691dcb-57e3-4478-bb5d-88a17fe1c69e")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_OWNEDHW, this.element);
    }

    @objid ("2949c4ab-edd1-45d3-846a-98ca3dd82851")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_OWNEDHW, value);
    }

    @objid ("63f6a11a-ae3f-4abb-8cc8-c93d6d0691d0")
    public String getfrequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_FREQUENCY, this.element);
    }

    @objid ("574bfa8d-800e-418d-bc34-8a0b6ed041f7")
    public void setfrequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_FREQUENCY, value);
    }

    @objid ("a5f4c377-0bc6-47f6-9507-c7631c6f230c")
    public String getendPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_ENDPOINTS, this.element);
    }

    @objid ("28bca75e-5aeb-4190-a674-eaeeca185ef1")
    public void setendPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_INSTANCE_HWCOMPUTINGRESOURCE_INSTANCE_ENDPOINTS, value);
    }

}
