package org.modelio.module.marte.profile.hwmemory.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.StorageResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwMemory_BindableInstance extends StorageResource_BindableInstance {
    public HwMemory_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEMORY_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwMemory_BindableInstance"));
    }

    public HwMemory_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_MEMORYSIZE, this.element);
    }

    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_MEMORYSIZE, value);
    }

    public String getadressSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ADRESSSIZE, this.element);
    }

    public void setadressSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ADRESSSIZE, value);
    }

    public String gettimings() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_TIMINGS, this.element);
    }

    public void settimings(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_TIMINGS, value);
    }

    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_THROUGHPUT, this.element);
    }

    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_THROUGHPUT, value);
    }

    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_DESCRIPTION, this.element);
    }

    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_DESCRIPTION, value);
    }

    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_P_HW_SERVICES, this.element);
    }

    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_P_HW_SERVICES, value);
    }

    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_R_HW_SERVICES, this.element);
    }

    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_R_HW_SERVICES, value);
    }

    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_OWNEDHW, this.element);
    }

    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_OWNEDHW, value);
    }

    public String getfrequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_FREQUENCY, this.element);
    }

    public void setfrequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_FREQUENCY, value);
    }

    public String getendPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ENDPOINTS, this.element);
    }

    public void setendPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ENDPOINTS, value);
    }

}
