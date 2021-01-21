package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4d6c32fb-107e-42f5-ac0b-b0a6f1ad31d8")
public class HwProcessor_Lifeline extends HwComputingResource_Lifeline {
    @objid ("90d9bde6-a991-4e6e-8382-4a8dd6573c8b")
    public HwProcessor_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPROCESSOR_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwProcessor_Lifeline"));
    }

    @objid ("589ac627-7f09-469f-8273-a1eee8977731")
    public HwProcessor_Lifeline(Lifeline element) {
        super(element);
    }

    @objid ("c753f22a-b248-4870-9f16-b0faa05ea62f")
    public String getarchitecture() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_ARCHITECTURE, this.element);
    }

    @objid ("e46a20b5-e590-4415-9f4e-7a9c2bb826e8")
    public void setarchitecture(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_ARCHITECTURE, value);
    }

    @objid ("8e009c26-6088-4330-ac80-388b7ef38fad")
    public String getmips() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_MIPS, this.element);
    }

    @objid ("182200b8-202e-4816-bd68-4a149dfcaddd")
    public void setmips(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_MIPS, value);
    }

    @objid ("d9ed8781-1083-4473-9f2a-4a5dc08bfd2d")
    public String getipc() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_IPC, this.element);
    }

    @objid ("e2d65100-3606-48c5-b831-8b84ad0cbfeb")
    public void setipc(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_IPC, value);
    }

    @objid ("bcd4fe2a-5aa6-4233-8eec-34b6bf3362fa")
    public String getnbCores() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_NBCORES, this.element);
    }

    @objid ("56cc67d2-7eef-4749-a962-b5b4d75689aa")
    public void setnbCores(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_NBCORES, value);
    }

    @objid ("435ed99a-85bb-46d5-8c3f-ed2d734e7f09")
    public String getnbPipelines() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_NBPIPELINES, this.element);
    }

    @objid ("d117b6a0-bdad-4949-9fa7-11e51b97c576")
    public void setnbPipelines(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_NBPIPELINES, value);
    }

    @objid ("4fe1116b-f6ad-4570-90b9-1bc2cffc7a75")
    public String getnbStages() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_NBSTAGES, this.element);
    }

    @objid ("b9452a5a-639c-4bc9-a07b-c127550b827f")
    public void setnbStages(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_NBSTAGES, value);
    }

    @objid ("77a510b7-9fb7-4158-acdf-307c9782122a")
    public String getnbALUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_NBALUS, this.element);
    }

    @objid ("c7b172e4-1afa-490d-80d1-7f513bf52974")
    public void setnbALUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_NBALUS, value);
    }

    @objid ("2dcb4b4c-ca10-4bdf-b59b-15973e84dc15")
    public String getnbFPUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_NBFPUS, this.element);
    }

    @objid ("24f39533-dc85-4e79-b94f-48a27bde32f3")
    public void setnbFPUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_NBFPUS, value);
    }

    @objid ("bf154436-ec60-4635-a66f-a84b89b9011b")
    public String getownedISAs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_OWNEDISAS, this.element);
    }

    @objid ("ee4bfa2f-2e28-4833-b127-5d7d722f28dc")
    public void setownedISAs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_OWNEDISAS, value);
    }

    @objid ("87bbf47d-e74c-4b2f-907c-9fac134c680f")
    public String getpredictors() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_PREDICTORS, this.element);
    }

    @objid ("f67a4a71-040d-467d-9389-6985d639e4da")
    public void setpredictors(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_PREDICTORS, value);
    }

    @objid ("5acfce7e-d381-4600-97cb-446d7378d54b")
    public String getcaches() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_CACHES, this.element);
    }

    @objid ("f15d5ffa-c964-4304-ae70-ba06420abe61")
    public void setcaches(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_CACHES, value);
    }

    @objid ("f145ae6e-aef0-4412-a165-848e978057ba")
    public String getownedMMUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_OWNEDMMUS, this.element);
    }

    @objid ("c5dc73d6-63aa-4db4-b9a9-765ad2fddbdd")
    public void setownedMMUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LIFELINE_HWPROCESSOR_LIFELINE_OWNEDMMUS, value);
    }

}
