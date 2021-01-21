package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("19b734b2-a33c-49e0-b7a2-aa2fd3db79d6")
public class HwProcessor_Association {
    @objid ("e8820a99-45cb-4670-9eb3-374b73864a10")
    protected Association element;

    @objid ("7fad767d-0434-463d-9606-db9f7a8c4d22")
    public HwProcessor_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPROCESSOR_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwProcessor_Association"));
    }

    @objid ("9e80b786-245d-4b3b-a8d8-9f8cd7bef457")
    public HwProcessor_Association(Association element) {
        this.element = element;
    }

    @objid ("814f891a-c11c-4edb-9b7c-cf8b3a682d1e")
    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("616cc0f5-2b0e-4681-b89f-f0ed78808915")
    public Association getElement() {
        return this.element;
    }

    @objid ("335cce13-8943-4bc4-ab7d-02a2aea83644")
    public String getarchitecture() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_ARCHITECTURE, this.element);
    }

    @objid ("fa046168-ff06-4c12-a1a3-086fbf8e9edb")
    public void setarchitecture(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_ARCHITECTURE, value);
    }

    @objid ("c13c1a7c-b592-4c05-b4d9-0ab858568a91")
    public String getmips() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_MIPS, this.element);
    }

    @objid ("eabb3e01-5012-4352-874c-05622ad11b0a")
    public void setmips(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_MIPS, value);
    }

    @objid ("8bc2d41d-c939-4688-a95c-2de46e64a603")
    public String getipc() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_IPC, this.element);
    }

    @objid ("76a4d3f7-7fc3-4511-a031-d0830d424754")
    public void setipc(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_IPC, value);
    }

    @objid ("bc1bd911-be9d-443e-b662-1ef567b93048")
    public String getnbCores() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBCORES, this.element);
    }

    @objid ("72a97ca8-5463-417b-aa23-0896b1331fc0")
    public void setnbCores(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBCORES, value);
    }

    @objid ("37019528-1884-499f-8400-c55e3a97feeb")
    public String getnbPipelines() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBPIPELINES, this.element);
    }

    @objid ("92fb3930-75a0-448a-9adb-31c38b7f41a0")
    public void setnbPipelines(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBPIPELINES, value);
    }

    @objid ("24ab6072-09fa-43df-a225-c555e8967ab1")
    public String getnbStages() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBSTAGES, this.element);
    }

    @objid ("deea356d-8dbf-4f4c-b5e7-4b48c689cec5")
    public void setnbStages(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBSTAGES, value);
    }

    @objid ("2888fad7-3e6a-4cd7-a661-838ff98e3aad")
    public String getnbALUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBALUS, this.element);
    }

    @objid ("df21cb25-ee41-439f-af5e-cf30151dfa21")
    public void setnbALUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBALUS, value);
    }

    @objid ("180a1f22-4349-4791-a42a-1f6021d20296")
    public String getnbFPUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBFPUS, this.element);
    }

    @objid ("b699ca35-c29b-425e-98f3-24bf649d854e")
    public void setnbFPUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBFPUS, value);
    }

    @objid ("5c1271f5-8283-42f9-845f-ea7a15f7008c")
    public String getownedISAs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_OWNEDISAS, this.element);
    }

    @objid ("3acf4841-a00d-4a49-8833-b4973207d885")
    public void setownedISAs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_OWNEDISAS, value);
    }

    @objid ("ad81ff1d-45c3-40ad-861a-d4aa3363c3a4")
    public String getpredictors() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_PREDICTORS, this.element);
    }

    @objid ("9c12b743-ea44-4aa6-8833-bcfdb3b86542")
    public void setpredictors(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_PREDICTORS, value);
    }

    @objid ("ca8f7a27-dce7-4212-87fe-0a3058f0a3e4")
    public String getcaches() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_CACHES, this.element);
    }

    @objid ("dc66ab5f-d31d-4dad-876b-533f7c700931")
    public void setcaches(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_CACHES, value);
    }

    @objid ("d2a6b7f3-2749-4c35-8004-a519a0d653eb")
    public String getownedMMUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_OWNEDMMUS, this.element);
    }

    @objid ("89b6da5b-75ae-4862-9dcf-c657e719f39c")
    public void setownedMMUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_OWNEDMMUS, value);
    }

}
