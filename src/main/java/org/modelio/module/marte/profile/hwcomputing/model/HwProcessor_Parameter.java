package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("594bf7a6-ef47-46cb-ae06-b76cf6f01366")
public class HwProcessor_Parameter extends HwComputingResource_Parameter {
    @objid ("f1702a31-9a4e-466c-a29b-4e4e5568acb8")
    public HwProcessor_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPROCESSOR_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwProcessor_Parameter"));
    }

    @objid ("bd118e72-d4ff-48a5-be05-d98c342b5e4c")
    public HwProcessor_Parameter(Parameter element) {
        super(element);
    }

    @objid ("ce9877f7-ccfc-47f4-a5f4-96b5bfcfe50f")
    public String getarchitecture() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_ARCHITECTURE, this.element);
    }

    @objid ("a506afa2-33f8-4eab-a28d-6985ce5c42ee")
    public void setarchitecture(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_ARCHITECTURE, value);
    }

    @objid ("26c177e1-aa33-4d6e-8b14-58f071bcc4c7")
    public String getmips() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_MIPS, this.element);
    }

    @objid ("fe0aa5f6-157d-4d93-8625-903c02d616ff")
    public void setmips(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_MIPS, value);
    }

    @objid ("c9fbb80c-9023-47cb-9edc-38faed63cbf5")
    public String getipc() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_IPC, this.element);
    }

    @objid ("db6c7900-60c8-4f5d-82ce-c8c4421eaae9")
    public void setipc(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_IPC, value);
    }

    @objid ("755af3e3-09d7-4cee-9ffa-c39c864f96dc")
    public String getnbCores() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBCORES, this.element);
    }

    @objid ("a21ee7a5-4d00-458b-954a-5481165514e7")
    public void setnbCores(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBCORES, value);
    }

    @objid ("caf94b49-c667-4e28-8b73-838dae4c8677")
    public String getnbPipelines() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBPIPELINES, this.element);
    }

    @objid ("97a98022-1cef-46d3-b47d-6fcd68bbdab2")
    public void setnbPipelines(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBPIPELINES, value);
    }

    @objid ("016a9d3d-abb4-4f56-bc11-864be184298c")
    public String getnbStages() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBSTAGES, this.element);
    }

    @objid ("2e046810-fe58-43a6-a98d-857533f591aa")
    public void setnbStages(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBSTAGES, value);
    }

    @objid ("6f020eba-10ac-496b-ba7f-525be6ba73b3")
    public String getnbALUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBALUS, this.element);
    }

    @objid ("5f0eff41-94f2-4358-a7d4-ddaadcc46c4d")
    public void setnbALUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBALUS, value);
    }

    @objid ("f8f31c26-4a67-4276-8cd2-42ceeb17d39f")
    public String getnbFPUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBFPUS, this.element);
    }

    @objid ("b4a30c1a-2e0f-4355-9145-d0fb5be6a42c")
    public void setnbFPUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_NBFPUS, value);
    }

    @objid ("48d6fb94-9c8e-472e-b601-14d95d852571")
    public String getownedISAs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_OWNEDISAS, this.element);
    }

    @objid ("0bc58e5d-8034-46b4-980e-df726a6daccd")
    public void setownedISAs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_OWNEDISAS, value);
    }

    @objid ("2a3dce8a-07e7-4a8f-8111-bdcb576cd10d")
    public String getpredictors() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_PREDICTORS, this.element);
    }

    @objid ("29ffc92b-781a-41a6-bbdb-c7399a25fff2")
    public void setpredictors(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_PREDICTORS, value);
    }

    @objid ("88deb12f-8cd3-475b-b3e1-e11610bcfce5")
    public String getcaches() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_CACHES, this.element);
    }

    @objid ("d39c8c5d-89eb-49f3-a1a5-cdd0228e49d8")
    public void setcaches(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_CACHES, value);
    }

    @objid ("d1b50c8c-bfb8-4484-95c4-6aa6a5d82693")
    public String getownedMMUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_OWNEDMMUS, this.element);
    }

    @objid ("7ad23ab2-6530-4648-9ad9-a818d5270ccd")
    public void setownedMMUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_PARAMETER_HWPROCESSOR_PARAMETER_OWNEDMMUS, value);
    }

}
