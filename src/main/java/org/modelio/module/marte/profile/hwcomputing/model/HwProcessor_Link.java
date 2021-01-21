package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ecf6bf9e-5d98-4a7a-85ba-2d4a8bbab2bf")
public class HwProcessor_Link {
    @objid ("8c5d4927-7c3c-475a-b31f-412d36b671c8")
    protected Link element;

    @objid ("50ea06b6-b6ec-484d-b1b3-27276ef9d394")
    public HwProcessor_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPROCESSOR_LINK);
        this.element.setName(MARTEResourceManager.getName("HwProcessor_Link"));
    }

    @objid ("2763ee89-d4ad-40a4-8bb7-95bed62b7cb1")
    public HwProcessor_Link(Link element) {
        this.element = element;
    }

    @objid ("9c8f3453-7f4f-42fd-be85-c20f28376110")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("c797f225-566b-4a84-9dc3-9a3c402c8ba6")
    public Link getElement() {
        return this.element;
    }

    @objid ("57488297-8141-4feb-b37f-611ff0ba5d4b")
    public String getarchitecture() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_ARCHITECTURE, this.element);
    }

    @objid ("9fededd8-973f-4053-bbde-bf0c2a15a93a")
    public void setarchitecture(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_ARCHITECTURE, value);
    }

    @objid ("079025ce-a3a1-47a3-a18d-66a686a40731")
    public String getmips() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_MIPS, this.element);
    }

    @objid ("b152d9d5-83ea-4d26-91e3-5055ccb8a089")
    public void setmips(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_MIPS, value);
    }

    @objid ("22697d8e-8982-4f37-8128-a3eddbc0c6ac")
    public String getipc() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_IPC, this.element);
    }

    @objid ("b24ad2b9-eba8-4848-a30a-9e1f5059d4b3")
    public void setipc(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_IPC, value);
    }

    @objid ("dfdf9bab-e527-4d01-9f76-679e063c5243")
    public String getnbCores() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBCORES, this.element);
    }

    @objid ("9a565bef-db32-4d83-8086-0e06011cd30e")
    public void setnbCores(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBCORES, value);
    }

    @objid ("9ef651aa-28a5-4dfb-90ab-0e2c8258684d")
    public String getnbPipelines() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBPIPELINES, this.element);
    }

    @objid ("591261e3-457a-4c88-8fc3-051b538127f9")
    public void setnbPipelines(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBPIPELINES, value);
    }

    @objid ("6640712a-c6ac-4f0b-afc5-206ca192bcce")
    public String getnbStages() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBSTAGES, this.element);
    }

    @objid ("0829f9de-5e0e-4555-84fc-28966ab27160")
    public void setnbStages(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBSTAGES, value);
    }

    @objid ("7abb82eb-0fd7-4b77-9484-3a0078fd4d50")
    public String getnbALUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBALUS, this.element);
    }

    @objid ("66ac1b3d-10ab-42a0-ba03-37ae082b7ae5")
    public void setnbALUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBALUS, value);
    }

    @objid ("e1accf0c-d33c-49da-82a0-a36bc1e0ef67")
    public String getnbFPUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBFPUS, this.element);
    }

    @objid ("1840f3c7-922c-4365-82bd-0af092522c43")
    public void setnbFPUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBFPUS, value);
    }

    @objid ("98be508c-3819-4cc8-82db-ff335449d2ba")
    public String getownedISAs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_OWNEDISAS, this.element);
    }

    @objid ("808ef7f0-c404-421c-a8c6-dad47a6901f8")
    public void setownedISAs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_OWNEDISAS, value);
    }

    @objid ("44f42cf3-0dbe-4714-befb-3c1d8cf11193")
    public String getpredictors() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_PREDICTORS, this.element);
    }

    @objid ("1472e313-8934-4ad8-a97e-8c4a6a53fe3d")
    public void setpredictors(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_PREDICTORS, value);
    }

    @objid ("0927bdf9-5c3e-4b5b-816b-1ccf45df0ade")
    public String getcaches() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_CACHES, this.element);
    }

    @objid ("ea642e51-e98f-41be-8fcb-4443fddab828")
    public void setcaches(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_CACHES, value);
    }

    @objid ("82de961d-3810-4ee6-af91-c36dcd89cb34")
    public String getownedMMUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_OWNEDMMUS, this.element);
    }

    @objid ("b1c58b45-3f7a-4807-b2a0-42eb8f43ddac")
    public void setownedMMUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_OWNEDMMUS, value);
    }

}
