package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.StorageResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("51ed2fd2-aac2-4988-a14f-df9721b54078")
public class HwMemory_Instance extends StorageResource_Instance {
    @objid ("729db4ae-cefd-4c9b-80e2-fcc8bff7d2c2")
    public HwMemory_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEMORY_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwMemory_Instance"));
    }

    @objid ("295bf89f-d760-44e1-8b25-2175ca0259c4")
    public HwMemory_Instance(Instance element) {
        super(element);
    }

    @objid ("39adf8d4-f9ff-40f2-869d-6514f86d82fa")
    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_MEMORYSIZE, this.element);
    }

    @objid ("9adb5cdc-53a6-4cbd-b1a2-1c2a1d7b07a3")
    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_MEMORYSIZE, value);
    }

    @objid ("96277a82-5a2e-4a82-bed9-718eea7d4f44")
    public String getadressSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ADRESSSIZE, this.element);
    }

    @objid ("a6ca4532-4b77-489e-95ec-a78ea58256c5")
    public void setadressSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ADRESSSIZE, value);
    }

    @objid ("3a9d36b4-ed5e-4c36-9c28-50386c902b50")
    public String gettimings() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_TIMINGS, this.element);
    }

    @objid ("9d9fe7f2-511a-459f-b86d-a2e79f47ff0f")
    public void settimings(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_TIMINGS, value);
    }

    @objid ("8078203d-133b-465e-997d-d752424adb1a")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_THROUGHPUT, this.element);
    }

    @objid ("6513590b-2c64-4871-9037-03eac79c6b3e")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_THROUGHPUT, value);
    }

    @objid ("74259918-7034-47be-a8a9-f033c2a4438d")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_DESCRIPTION, this.element);
    }

    @objid ("9777229e-f56e-4523-9db5-101ef3eaebf5")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_DESCRIPTION, value);
    }

    @objid ("6b090c33-6a10-4adf-80a5-5a717a963eee")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_P_HW_SERVICES, this.element);
    }

    @objid ("f3dfc76c-2c65-4379-a1b2-4abc310ff66d")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_P_HW_SERVICES, value);
    }

    @objid ("b626a760-ea33-4745-8b11-03b5f007d94d")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_R_HW_SERVICES, this.element);
    }

    @objid ("029034d9-bed5-477f-83c4-ddefdfc69cee")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_R_HW_SERVICES, value);
    }

    @objid ("3dc83370-9033-42bc-a4b0-6b2dd43556b5")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_OWNEDHW, this.element);
    }

    @objid ("5134cb32-7a26-40d6-bb0b-ec8d537ea8ae")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_OWNEDHW, value);
    }

    @objid ("7f1fe1eb-533a-4f12-b89f-15594d58cb09")
    public String getHwMemory_Instance_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_FREQUENCY, this.element);
    }

    @objid ("a77a0df5-5085-460a-b3e3-34ae33750ce2")
    public void setHwMemory_Instance_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_FREQUENCY, value);
    }

    @objid ("6b16ac37-5063-43df-97d5-5c872de8289e")
    public String getHwMemory_Instance_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ENDPOINTS, this.element);
    }

    @objid ("2ec2afe0-3b5d-454e-87a6-63d42c147ecd")
    public void setHwMemory_Instance_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ENDPOINTS, value);
    }

}
