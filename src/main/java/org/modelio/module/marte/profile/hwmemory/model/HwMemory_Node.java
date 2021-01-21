package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.StorageResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ed6de629-039a-46ed-b285-9cdcd456cb1f")
public class HwMemory_Node extends StorageResource_Node {
    @objid ("154f5c2a-f5bc-4d83-8340-779239659830")
    public HwMemory_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEMORY_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWMEMORY_CLASSIFIER));
    }

    @objid ("67ba1765-688c-4395-83e5-af73a584dc53")
    public HwMemory_Node(Node element) {
        super(element);
    }

    @objid ("6f9cb739-d3eb-4963-9438-de8a0d6fb8d9")
    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_MEMORYSIZE, this.element);
    }

    @objid ("2c5ca00a-424c-4e12-8387-5928a042cb40")
    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_MEMORYSIZE, value);
    }

    @objid ("5331e5c4-7956-4571-b859-336266fa71c8")
    public String getadressSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ADRESSSIZE, this.element);
    }

    @objid ("29f3d585-9968-47c9-b100-0056d0f39a42")
    public void setadressSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ADRESSSIZE, value);
    }

    @objid ("31b4c016-2e4b-461e-a5db-1a6b01eadc42")
    public String gettimings() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_TIMINGS, this.element);
    }

    @objid ("f894de3d-4a4c-42b0-b0cc-bb1f286dd783")
    public void settimings(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_TIMINGS, value);
    }

    @objid ("6fc61598-6f83-4b5f-ab90-24856a3e6f77")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_THROUGHPUT, this.element);
    }

    @objid ("9b0eadfa-1a62-430b-8878-1af60e3a6052")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_THROUGHPUT, value);
    }

    @objid ("bd4a3f09-65a0-4c4c-b263-7c7b01c04ac3")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_DESCRIPTION, this.element);
    }

    @objid ("c0064445-88d6-41b2-aaec-0b0d73beb7e6")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_DESCRIPTION, value);
    }

    @objid ("e81e1965-1da1-4281-80ec-85dad8e03b68")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_P_HW_SERVICES, this.element);
    }

    @objid ("399ff625-895a-41a9-9bc3-6491eebe371e")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_P_HW_SERVICES, value);
    }

    @objid ("00ff1cd2-1a4d-4b4d-b6af-66330b549526")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_R_HW_SERVICES, this.element);
    }

    @objid ("392fa4c0-e676-468c-818a-44f0fb40e283")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_R_HW_SERVICES, value);
    }

    @objid ("0d69d0a4-139d-4bed-b654-92064e5de62c")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_OWNEDHW, this.element);
    }

    @objid ("437e53fd-cddc-4a70-8f58-3bf5991b58ab")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_OWNEDHW, value);
    }

    @objid ("88da367a-4380-440f-8a9c-20283eefa60c")
    public String getfrenquency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_FREQUENCY, this.element);
    }

    @objid ("e9b31e8d-de89-43a5-b8ef-d3c0f627caa3")
    public void setfrenquency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_FREQUENCY, value);
    }

    @objid ("1454dc9b-fcdc-4057-9f70-7bbca000df3d")
    public String getendpoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ENDPOINTS, this.element);
    }

    @objid ("2a96a01c-d367-4cd3-8769-02ed2038b897")
    public void setendpoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ENDPOINTS, value);
    }

}
