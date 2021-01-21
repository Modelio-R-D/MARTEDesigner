package org.modelio.module.marte.profile.hwlayout.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("57ec65ce-30e1-4009-aff1-09b49e5459cb")
public class HwComponent_AssociationEnd {
    @objid ("33fff03b-0784-4e02-9dc4-07e2039da559")
    protected AssociationEnd element;

    @objid ("6e8e9075-cb21-4512-95c7-e5e38b9cfe3c")
    public HwComponent_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPOWERSUPPLY_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName("HwPowerSupply_AssociationEnd"));
    }

    @objid ("f4a94879-7357-43f6-8759-9bb8d1709a45")
    public HwComponent_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    @objid ("172cc712-56c2-428a-9ede-c488ede078c8")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_KIND, this.element);
    }

    @objid ("5afb82af-36d6-4701-8062-b159dbaeca13")
    public void setParent(Classifier parent) {
        this.element.setSource(parent);
    }

    @objid ("694f7509-8d93-4a1b-9371-c8577f2be653")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("2bd38a39-d0e3-4735-a8e5-8da9c62fd5d1")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_KIND, value);
    }

    @objid ("cf47df60-5a4e-4d49-8580-99eb4a1ceb18")
    public String getdimensions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_DIMENSIONS, this.element);
    }

    @objid ("da943897-9a6f-4b41-94e2-c9ca59e85b3f")
    public void setdimensions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_DIMENSIONS, value);
    }

    @objid ("b3c25de9-55de-4019-bc4f-24540fd02ef5")
    public String getarea() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_AREA, this.element);
    }

    @objid ("6af04407-4599-4408-9085-f7f796e6cf38")
    public void setarea(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_AREA, value);
    }

    @objid ("638cca97-ebd3-403a-aa06-0cd73a611042")
    public String getposition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_POSITION, this.element);
    }

    @objid ("1458b033-184a-4e8e-90f0-2eb8090795b8")
    public void setposition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_POSITION, value);
    }

    @objid ("009325e1-2deb-49f1-b2b3-c1f0b324b0d1")
    public String getgrid() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_GRID, this.element);
    }

    @objid ("5867a307-c544-4135-8f88-7837035d2a82")
    public void setgrid(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_GRID, value);
    }

    @objid ("7bbf83b1-ae00-4054-a061-b32ea68e3131")
    public String getnbPins() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_NBPINS, this.element);
    }

    @objid ("cf11c75f-e813-485a-af1f-d4b5c30b095f")
    public void setnbPins(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_NBPINS, value);
    }

    @objid ("ef7f4726-c74c-45a2-9d5c-ceb7ce867541")
    public String getweight() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_WEIGHT, this.element);
    }

    @objid ("6a8ea5d1-38d4-4655-953e-b1fd1fa12f1a")
    public void setweight(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_WEIGHT, value);
    }

    @objid ("149d2499-b50e-4afa-8671-6fc32c336a41")
    public String getprice() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_PRICE, this.element);
    }

    @objid ("6c2d209f-de6b-4216-a1c2-05f7c1901d07")
    public void setprice(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_PRICE, value);
    }

    @objid ("3c42465b-87ab-4a14-9192-796d2c874077")
    public String getr_Conditions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_R_CONDITIONS, this.element);
    }

    @objid ("99317e73-17ce-4179-80df-bd74ebdb768f")
    public void setr_Conditions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_R_CONDITIONS, value);
    }

    @objid ("78f80cea-a000-4acd-ad3d-22247944a4ea")
    public String getpoweredServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_POWEREDSERVICES, this.element);
    }

    @objid ("7701a3fc-9038-44db-890e-62356bf4ac90")
    public void setpoweredServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_POWEREDSERVICES, value);
    }

    @objid ("e7e01afe-d2e4-473b-b468-9b76bd76e086")
    public String getstaticConsumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_STATICCONSUMPTION, this.element);
    }

    @objid ("43840b4d-6ae1-4c5b-99f9-94a6696c7158")
    public void setstaticConsumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_STATICCONSUMPTION, value);
    }

    @objid ("d6844809-00e9-4069-8cda-34f9f30d3b53")
    public String getstaticDissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_STATICDISSIPATION, this.element);
    }

    @objid ("b1f2c9b9-2413-434b-aec7-6e2124f2c8ef")
    public void setstaticDissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_STATICDISSIPATION, value);
    }

    @objid ("a7ff8e10-100f-4762-820b-788d5084b980")
    public String getsubComponents() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_SUBCOMPONENTS, this.element);
    }

    @objid ("9dea8aa4-ecd0-45e4-bf0f-47c34ab0e65a")
    public void setsubComponents(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_SUBCOMPONENTS, value);
    }

    @objid ("27cfd82d-aad7-4ff2-994f-ae55ff4d7223")
    public AssociationEnd getElement() {
        return this.element;
    }

}
