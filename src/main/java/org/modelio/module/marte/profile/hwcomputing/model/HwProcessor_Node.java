package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("dc639a08-310d-4d04-9eea-15c4335c1da9")
public class HwProcessor_Node extends HwComputingResource_Node {
    @objid ("dd0e7037-c718-498f-b6c9-c7b0842d9560")
    public HwProcessor_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPROCESSOR_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWPROCESSOR_CLASSIFIER));
    }

    @objid ("fafe3f66-e737-4924-a44f-a6fabfb94f4e")
    public HwProcessor_Node(Node element) {
        super(element);
    }

    @objid ("b5b64946-77dd-47cd-8307-81d386c099e6")
    public String getarchitecture() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_ARCHITECTURE, this.element);
    }

    @objid ("28c3b5b8-ac1d-49b7-9b40-54cf690da584")
    public void setarchitecture(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_ARCHITECTURE, value);
    }

    @objid ("7a95384d-ca0b-4b1d-b488-1ea04d071410")
    public String getmips() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_MIPS, this.element);
    }

    @objid ("3a6f2ded-29f1-4258-8852-dc75345c31e8")
    public void setmips(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_MIPS, value);
    }

    @objid ("21a1083c-670e-4d46-8a9a-5ec93e221583")
    public String getipc() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_IPC, this.element);
    }

    @objid ("3f764ae9-d40e-41ec-a121-a75353f91ac1")
    public void setipc(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_IPC, value);
    }

    @objid ("071a12a6-88ca-497f-bec2-1024f686ff7c")
    public String getnbCores() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBCORES, this.element);
    }

    @objid ("f10e205e-7599-4975-8cb3-fd076a7d0727")
    public void setnbCores(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBCORES, value);
    }

    @objid ("d9198bf1-7e36-499b-a6ee-da5808eea893")
    public String getnbPipelines() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBPIPELINES, this.element);
    }

    @objid ("49b12959-7b9f-4dc9-8588-24dbc7aa30ce")
    public void setnbPipelines(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBPIPELINES, value);
    }

    @objid ("20d4494b-6d6e-4392-892f-bb46b4b952d5")
    public String getnbStages() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBSTAGES, this.element);
    }

    @objid ("cfae80fb-c3d5-4f76-ad57-cca71c0ef713")
    public void setnbStages(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBSTAGES, value);
    }

    @objid ("311e707b-e688-467b-8459-b9d92227f887")
    public String getnbALUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBALUS, this.element);
    }

    @objid ("c140f197-fa1a-446b-9f91-be1c1e5793d2")
    public void setnbALUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBALUS, value);
    }

    @objid ("a79af735-d00f-4781-ae58-8ddbb3a3d8e9")
    public String getnbFPUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBFPUS, this.element);
    }

    @objid ("c749562d-68d4-4b4b-b11a-7360ed98ac6a")
    public void setnbFPUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBFPUS, value);
    }

}
