package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("72aaa2b3-d2ac-46f5-bc4e-f359e9560ead")
public class HwProcessor_BindableInstance extends HwComputingResource_BindableInstance {
    @objid ("b4e5cd28-8058-4dd4-bf18-4a845ea12ae0")
    public HwProcessor_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPROCESSOR_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwProcessor_BindableInstance"));
    }

    @objid ("a1d61c75-3ea4-408a-897a-52d4529bd9d1")
    public HwProcessor_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("3a8618e5-906f-45f5-adfe-e5a23b6416f3")
    public String getarchitecture() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_ARCHITECTURE, this.element);
    }

    @objid ("54dbb8a1-ecec-4d3d-8e5e-a5d6ebf0f37c")
    public void setarchitecture(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_ARCHITECTURE, value);
    }

    @objid ("061625fd-d6e4-4cdb-b3ef-a600499da741")
    public String getmips() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_MIPS, this.element);
    }

    @objid ("7838fa23-f614-4e07-9d98-59360b805066")
    public void setmips(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_MIPS, value);
    }

    @objid ("602e5830-b0f0-4c05-9f51-2ed738c1f81b")
    public String getipc() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_IPC, this.element);
    }

    @objid ("842ec9a0-c002-4202-a7f1-686d5c494a75")
    public void setipc(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_IPC, value);
    }

    @objid ("7d9ecf08-af25-41a6-82c9-c547f7ae632a")
    public String getnbCores() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBCORES, this.element);
    }

    @objid ("c4809b01-de7c-404c-89e2-2d252f321b46")
    public void setnbCores(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBCORES, value);
    }

    @objid ("43b1533d-6342-4d3c-a4be-72b0b1cc8339")
    public String getnbPipelines() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBPIPELINES, this.element);
    }

    @objid ("1414d8c3-2c25-44eb-ab6c-0ccdbaa78c8e")
    public void setnbPipelines(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBPIPELINES, value);
    }

    @objid ("ff037bb3-0813-4a5d-99d7-070e2671bb57")
    public String getnbStages() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBSTAGES, this.element);
    }

    @objid ("884d2723-ec77-4531-b290-1dcc20d7cfec")
    public void setnbStages(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBSTAGES, value);
    }

    @objid ("7865e8a4-c889-49f8-8a4e-f67bceedfadd")
    public String getnbALUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBALUS, this.element);
    }

    @objid ("882571b0-ab76-4ba4-aa47-f0ecd4eb51b7")
    public void setnbALUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBALUS, value);
    }

    @objid ("70df52a4-88aa-44c4-a88e-1dc71c8fe032")
    public String getnbFPUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBFPUS, this.element);
    }

    @objid ("326a009d-8b66-49c5-8e9d-7d25bd3a66c1")
    public void setnbFPUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_NBFPUS, value);
    }

    @objid ("8c4aeac5-d434-4cf6-b21c-c366c20afe3a")
    public String getownedISAs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_OWNEDISAS, this.element);
    }

    @objid ("f3355d0d-13be-4ddf-9f64-ed6c71c4148c")
    public void setownedISAs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_OWNEDISAS, value);
    }

    @objid ("312c3b7d-9eac-4411-b86d-c2ce4ace31b2")
    public String getpredictors() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_PREDICTORS, this.element);
    }

    @objid ("8d9ffa2c-3363-4d7c-9a49-3c5f8140ffeb")
    public void setpredictors(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_PREDICTORS, value);
    }

    @objid ("2ab1c273-a6bb-48de-b2bd-22a66422ca3f")
    public String getcaches() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_CACHES, this.element);
    }

    @objid ("80517da3-fd1d-4568-85ce-f3625bcb631b")
    public void setcaches(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_CACHES, value);
    }

    @objid ("cf3ad7e6-06e7-44c1-9b68-8a940445285d")
    public String getownedMMUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_OWNEDMMUS, this.element);
    }

    @objid ("f1dc23d0-46d4-4318-b378-486d351351a5")
    public void setownedMMUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_INSTANCE_HWPROCESSOR_INSTANCE_OWNEDMMUS, value);
    }

}
