package org.modelio.module.marte.profile.hwmemory.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.StorageResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwMemory_Node extends StorageResource_Node {
    public HwMemory_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEMORY_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWMEMORY_CLASSIFIER));
    }

    public HwMemory_Node(Node element) {
        super(element);
    }

    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_MEMORYSIZE, this.element);
    }

    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_MEMORYSIZE, value);
    }

    public String getadressSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ADRESSSIZE, this.element);
    }

    public void setadressSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ADRESSSIZE, value);
    }

    public String gettimings() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_TIMINGS, this.element);
    }

    public void settimings(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_TIMINGS, value);
    }

    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_THROUGHPUT, this.element);
    }

    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_THROUGHPUT, value);
    }

    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_DESCRIPTION, this.element);
    }

    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_DESCRIPTION, value);
    }

    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_P_HW_SERVICES, this.element);
    }

    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_P_HW_SERVICES, value);
    }

    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_R_HW_SERVICES, this.element);
    }

    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_R_HW_SERVICES, value);
    }

    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_OWNEDHW, this.element);
    }

    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_OWNEDHW, value);
    }

    public String getfrenquency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_FREQUENCY, this.element);
    }

    public void setfrenquency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_FREQUENCY, value);
    }

    public String getendpoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ENDPOINTS, this.element);
    }

    public void setendpoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ENDPOINTS, value);
    }

}
