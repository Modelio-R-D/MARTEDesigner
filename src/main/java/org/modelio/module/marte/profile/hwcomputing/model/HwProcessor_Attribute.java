package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1dfcae43-10cb-47e5-9bcb-65775b4277da")
public class HwProcessor_Attribute extends HwComputingResource_Attribute {
    @objid ("b11a2502-857a-444a-bf87-b57743293dab")
    public HwProcessor_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPROCESSOR_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwProcessor_Attribute"));
    }

    @objid ("ff4ae511-4858-4530-ba20-5dd74904359a")
    public HwProcessor_Attribute(Attribute element) {
        super(element);
    }

    @objid ("c8ac7a4e-7c0b-498e-8b44-167b2a9cc780")
    public String getarchitecture() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_ARCHITECTURE, this.element);
    }

    @objid ("584cd2ac-4385-45f8-92e1-d6a8c0691d18")
    public void setarchitecture(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_ARCHITECTURE, value);
    }

    @objid ("11702358-7db6-40fb-b5a7-ab8858c7da6a")
    public String getmips() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_MIPS, this.element);
    }

    @objid ("653f7c8c-8506-4484-8993-023eb1e8e18a")
    public void setmips(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_MIPS, value);
    }

    @objid ("609ff0ab-61bf-4677-9192-bc24832059ea")
    public String getipc() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_IPC, this.element);
    }

    @objid ("32bcd4a9-7743-413b-97f9-cf9afc0a73c8")
    public void setipc(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_IPC, value);
    }

    @objid ("e1f6c786-be4b-47fc-ac81-c82dc5659d26")
    public String getnbCores() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBCORES, this.element);
    }

    @objid ("1e2155d5-fd37-4f58-8e25-25c30112c94b")
    public void setnbCores(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBCORES, value);
    }

    @objid ("6745c11b-7cfb-4af8-a5b1-5c3483136dd0")
    public String getnbPipelines() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBPIPELINES, this.element);
    }

    @objid ("dc75d359-2991-4d68-bcc0-3be3290a17f2")
    public void setnbPipelines(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBPIPELINES, value);
    }

    @objid ("aadc6c6f-77b7-47c1-82ea-19ad0d490141")
    public String getnbStages() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBSTAGES, this.element);
    }

    @objid ("bad8a779-ede1-4cb3-9878-722bf7965944")
    public void setnbStages(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBSTAGES, value);
    }

    @objid ("33560762-49e6-4874-ad1b-aa8a0d881895")
    public String getnbALUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBALUS, this.element);
    }

    @objid ("88482186-087e-49a7-b5dd-518aa32a00a4")
    public void setnbALUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBALUS, value);
    }

    @objid ("e8885ce3-00c1-4273-a97c-6e46bcb70512")
    public String getnbFPUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBFPUS, this.element);
    }

    @objid ("039800dc-62f9-4213-8521-990aecae476c")
    public void setnbFPUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBFPUS, value);
    }

    @objid ("0328caf9-3450-4940-bda5-01d8b58ef3ed")
    public String getownedISAs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_OWNEDISAS, this.element);
    }

    @objid ("68cc817b-c020-4b89-8af6-86c885d5d339")
    public void setownedISAs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_OWNEDISAS, value);
    }

    @objid ("fe789342-a91c-4e54-90fc-473fa3ce35d0")
    public String getpredictors() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_PREDICTORS, this.element);
    }

    @objid ("eed7e5fa-e7ed-454a-bd85-b768ff7aa6d7")
    public void setpredictors(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_PREDICTORS, value);
    }

    @objid ("a23b7ada-404e-4e12-979a-df95756bc7d0")
    public String getcaches() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_CACHES, this.element);
    }

    @objid ("ca96f3f6-f144-43e1-8a4b-51a1677b6a72")
    public void setcaches(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_CACHES, value);
    }

    @objid ("c5970659-7892-4f57-a6bd-6cf9f4a2e446")
    public String getownedMMUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_OWNEDMMUS, this.element);
    }

    @objid ("1ee376df-66ae-441d-8540-5ffced2bc9e9")
    public void setownedMMUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_OWNEDMMUS, value);
    }

}
