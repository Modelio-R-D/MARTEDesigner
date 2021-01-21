package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.StorageResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c22c0482-6e13-4266-9fbb-27dee40c16c9")
public class HwMemory_BindableInstance extends StorageResource_BindableInstance {
    @objid ("3cef52a0-4bc9-471f-bbe9-2d4f37bcdce9")
    public HwMemory_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEMORY_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwMemory_BindableInstance"));
    }

    @objid ("d1e4a8a5-7c48-4888-b723-973818d69908")
    public HwMemory_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("3623deb3-a6a0-45c1-8633-ea522d9f6d90")
    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_MEMORYSIZE, this.element);
    }

    @objid ("4a4ee513-c3ef-4721-a167-a6a3dc0cf969")
    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_MEMORYSIZE, value);
    }

    @objid ("ac2c9150-72c6-40c1-bbe1-1b2179d9307b")
    public String getadressSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ADRESSSIZE, this.element);
    }

    @objid ("ce484750-3bc6-4e0d-8c92-451a45b50bd4")
    public void setadressSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ADRESSSIZE, value);
    }

    @objid ("2562f9cc-900a-4314-9f7c-b0112233060a")
    public String gettimings() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_TIMINGS, this.element);
    }

    @objid ("483c58a3-ea36-4611-9678-0e855370c6d4")
    public void settimings(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_TIMINGS, value);
    }

    @objid ("9ecad90c-738a-414b-a73b-3f78ffa58769")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_THROUGHPUT, this.element);
    }

    @objid ("e4f44374-0e59-4760-a2e2-8cf145d08c06")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_THROUGHPUT, value);
    }

    @objid ("2cf855a0-1d2e-4ab4-b39c-daa817e2936f")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_DESCRIPTION, this.element);
    }

    @objid ("614d5da3-cf2c-4e49-9373-40ff1ee905c0")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_DESCRIPTION, value);
    }

    @objid ("2e507f21-3366-49d3-8930-736037f2cf1a")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_P_HW_SERVICES, this.element);
    }

    @objid ("6c69260a-a784-422b-a427-4cafdee4b8e0")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_P_HW_SERVICES, value);
    }

    @objid ("049cb450-f3da-4725-a4e2-54a7f7f80889")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_R_HW_SERVICES, this.element);
    }

    @objid ("a7010296-efd7-4656-9f47-9a1c4379d526")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_R_HW_SERVICES, value);
    }

    @objid ("54ce6187-eb33-48c3-9836-94f9222b870e")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_OWNEDHW, this.element);
    }

    @objid ("03e899f7-5fb4-424e-8388-959b692de47e")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_OWNEDHW, value);
    }

    @objid ("84fb187c-66d1-4c6d-9382-4fbf0f1c600d")
    public String getfrequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_FREQUENCY, this.element);
    }

    @objid ("a08efdf2-5617-4e6f-972b-ea455cfbe3e2")
    public void setfrequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_FREQUENCY, value);
    }

    @objid ("cebc5bf7-1c77-4f05-a457-76ac54382c0a")
    public String getendPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ENDPOINTS, this.element);
    }

    @objid ("4ef483d0-7e5a-428f-8c02-79f60553fe86")
    public void setendPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ENDPOINTS, value);
    }

}
