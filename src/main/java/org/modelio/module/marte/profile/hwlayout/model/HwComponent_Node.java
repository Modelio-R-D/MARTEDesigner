package org.modelio.module.marte.profile.hwlayout.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1e4d9a6b-b03b-4f23-aa8d-8e618851d609")
public class HwComponent_Node extends HwResource_Node {
    @objid ("5771fc48-ad37-42c5-9cb2-f20ea218cd5c")
    public HwComponent_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPONENT_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCOMPONENT_CLASSIFIER));
    }

    @objid ("9402c665-ce0f-4851-a620-3ad31cbbd5fd")
    public HwComponent_Node(Node element) {
        super(element);
    }

    @objid ("31b29cde-bf9e-401c-9c9c-aa8793960bda")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_KIND, this.element);
    }

    @objid ("7296fc12-dec4-4208-8de7-aefcd3c6d844")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_KIND, value);
    }

    @objid ("ddc52faa-293a-4c9a-9d9a-92a05084b65f")
    public String getdimensions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_DIMENSIONS, this.element);
    }

    @objid ("03f260e2-cc4b-4f7e-9b79-01da0596c7cc")
    public void setdimensions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_DIMENSIONS, value);
    }

    @objid ("ebac7f13-ce6a-443d-9f85-cec0423509d7")
    public String getarea() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_AREA, this.element);
    }

    @objid ("d9878192-a2d5-4b4d-9ac0-5e9a4811f701")
    public void setarea(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_AREA, value);
    }

    @objid ("9a354e76-b611-491d-ac7f-3e4b6dd414df")
    public String getposition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_POSITION, this.element);
    }

    @objid ("9d7e1dca-8920-472c-b354-82d70723e72a")
    public void setposition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_POSITION, value);
    }

    @objid ("2a4bc7fa-a03a-40d3-9581-78d6b369e8b2")
    public String getgrid() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_GRID, this.element);
    }

    @objid ("2e74c7cc-f425-4e0c-9e77-4bf53f60afa7")
    public void setgrid(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_GRID, value);
    }

    @objid ("04db9def-66eb-4f56-8774-11d213ef23b1")
    public String getnbPins() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_NBPINS, this.element);
    }

    @objid ("e8398acc-899a-4354-9d18-67ae51038737")
    public void setnbPins(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_NBPINS, value);
    }

    @objid ("fb029b20-91e0-4653-8687-506abb2978aa")
    public String getweight() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_WEIGHT, this.element);
    }

    @objid ("3a4d01bb-1b17-4064-a57c-2a87e4e119b0")
    public void setweight(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_WEIGHT, value);
    }

    @objid ("b675b68d-e3d9-4568-92d7-534be83099fc")
    public String getprice() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_PRICE, this.element);
    }

    @objid ("f089535b-7f1a-4979-b690-b669d872746b")
    public void setprice(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_PRICE, value);
    }

    @objid ("0c7e1af7-f89b-4325-bde9-6266196a3c5a")
    public String getr_Conditions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_R_CONDITIONS, this.element);
    }

    @objid ("a467fec2-12cd-4494-83e9-ab221fc8ec7e")
    public void setr_Conditions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_R_CONDITIONS, value);
    }

    @objid ("cf367064-f803-44d5-af03-af812d72a776")
    public String getpoweredServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_POWEREDSERVICES, this.element);
    }

    @objid ("02d199b6-de64-4393-b787-a9b5475d1662")
    public void setpoweredServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_POWEREDSERVICES, value);
    }

    @objid ("3ba10ece-7a9e-4d1a-a11f-f6ea79e7796f")
    public String getstaticConsumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_STATICCONSUMPTION, this.element);
    }

    @objid ("9ab9adc6-f413-4118-9f16-069d2c928b46")
    public void setstaticConsumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_STATICCONSUMPTION, value);
    }

    @objid ("a8dcb13c-777d-4257-b0ac-1349f3439073")
    public String getstaticDissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_STATICDISSIPATION, this.element);
    }

    @objid ("2baba019-e069-4aad-9598-0ca4b1084719")
    public void setstaticDissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_STATICDISSIPATION, value);
    }

    @objid ("943d436d-3aee-4843-a80a-0250a4efb7f6")
    public enum ComponentKind {
        card,
        channel,
        chip,
        port,
        unit,
        other,
        undef;
    }

}
