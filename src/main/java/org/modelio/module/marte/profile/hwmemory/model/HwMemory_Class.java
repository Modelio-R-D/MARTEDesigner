package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.StorageResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("03f19c87-defb-4c72-bdc2-5bc8bfbea6b7")
public class HwMemory_Class extends StorageResource_Class {
    @objid ("bd17f67c-7834-4dba-870c-c2117b75ace9")
    public HwMemory_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEMORY_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWMEMORY_CLASSIFIER));
    }

    @objid ("5e608509-b357-4d3c-8ef3-9424fdf44e85")
    public HwMemory_Class(Class element) {
        super(element);
    }

    @objid ("ba2be4f5-ec85-4a4a-8023-d8fa504aacce")
    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_MEMORYSIZE, this.element);
    }

    @objid ("cbc9d17f-b463-4f28-9976-58f94ba71e72")
    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_MEMORYSIZE, value);
    }

    @objid ("f8084d58-b845-4921-835d-be7720238a17")
    public String getadressSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ADRESSSIZE, this.element);
    }

    @objid ("0d258796-a28e-4043-9ae9-dc133736925e")
    public void setadressSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ADRESSSIZE, value);
    }

    @objid ("655ad17b-5529-4cdb-a612-c81adf7f846d")
    public String gettimings() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_TIMINGS, this.element);
    }

    @objid ("75c109af-cee4-4b79-9f30-916d9a005a6f")
    public void settimings(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_TIMINGS, value);
    }

    @objid ("f25dcf59-b9f7-41a9-be30-37d9cefbc0ee")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_THROUGHPUT, this.element);
    }

    @objid ("88e179e7-6c88-4713-8cc3-795ea93a6b4f")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_THROUGHPUT, value);
    }

    @objid ("c7cb5ec6-9308-4768-9a6b-244e39127d5c")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_DESCRIPTION, this.element);
    }

    @objid ("d7dd211c-6521-47b2-8d55-7f7734ee6a70")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_DESCRIPTION, value);
    }

    @objid ("2f524138-e9fd-4b3e-b43a-e3fb5fd6bdd0")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_P_HW_SERVICES, this.element);
    }

    @objid ("724eed4f-7290-4f9f-bc00-4d1e73f27575")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_P_HW_SERVICES, value);
    }

    @objid ("5643985a-9a26-4a1f-9a00-3e22aaff7b81")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_R_HW_SERVICES, this.element);
    }

    @objid ("3f2c4afc-e179-4bca-83f3-fdbea11cf4ef")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_R_HW_SERVICES, value);
    }

    @objid ("8b158f0f-7aa7-4bc5-a2e5-403ceaf63f74")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_OWNEDHW, this.element);
    }

    @objid ("279ac523-3460-4047-96ec-2d6c888a1911")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_OWNEDHW, value);
    }

    @objid ("7b172298-3b37-4cc1-9aa8-d8c87fdb009d")
    public String getfrenquency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_FREQUENCY, this.element);
    }

    @objid ("3b701c26-2564-4beb-a867-0829fbdb70a3")
    public void setfrenquency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_FREQUENCY, value);
    }

    @objid ("3221b3e4-555c-4a9f-a73f-613c31aa941e")
    public String getendpoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ENDPOINTS, this.element);
    }

    @objid ("a37cb619-12c7-40ae-8670-004d544048a5")
    public void setendpoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ENDPOINTS, value);
    }

}
