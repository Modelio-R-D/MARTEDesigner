package org.modelio.module.marte.profile.hwlayout.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("bc979366-2186-4c55-ac61-0549c481f7dc")
public class HwComponent_Attribute {
    @objid ("875f6382-3ed9-4a6e-9619-43e1cbea94c5")
    protected Attribute element;

    @objid ("a2523910-580c-4b3c-918d-b90fd8da0522")
    public HwComponent_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPONENT_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("HwComponent_Attribute"));
    }

    @objid ("9316699e-ee4a-42a9-8d1e-32158f197376")
    public HwComponent_Attribute(Attribute element) {
        this.element = element;
    }

    @objid ("50bfc4c5-4acc-4d21-a4e0-ddd932f3435f")
    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    @objid ("a7a55ee2-0548-4e52-8c35-cd90a1c9c5ab")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("d6f97698-756b-4900-96af-7f948eace6ac")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("aee2589f-3542-4bb2-a113-117008aa0cf9")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_KIND, this.element);
    }

    @objid ("5ff3a7ad-7a0d-4022-bdd0-a66a1d4fde59")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_KIND, value);
    }

    @objid ("832174ef-2e13-4a0d-bcce-fc1c88e8a0b4")
    public String getdimensions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_DIMENSIONS, this.element);
    }

    @objid ("7259029a-dff3-487e-89ef-73502dd08bc9")
    public void setdimensions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_DIMENSIONS, value);
    }

    @objid ("54c0565e-c44b-4e88-ae86-970ec5a385c5")
    public String getarea() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_AREA, this.element);
    }

    @objid ("2e6dc0ff-a933-47ca-933e-6fe56e1874cb")
    public void setarea(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_AREA, value);
    }

    @objid ("2ced8098-378a-4dcb-81f1-44131cbb6592")
    public String getposition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_POSITION, this.element);
    }

    @objid ("dcfa3648-477e-430a-b2d0-db78862336e0")
    public void setposition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_POSITION, value);
    }

    @objid ("70ce3140-3cfd-4f3c-89af-07d2dbb69af1")
    public String getgrid() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_GRID, this.element);
    }

    @objid ("333ee881-8022-4856-bc85-32a56a8fa3ba")
    public void setgrid(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_GRID, value);
    }

    @objid ("4af70608-94b6-48cd-8ae2-0a075a15a4b1")
    public String getnbPins() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_NBPINS, this.element);
    }

    @objid ("1a11f981-641e-4a7f-879c-be76f5020eaf")
    public void setnbPins(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_NBPINS, value);
    }

    @objid ("2506f018-ed40-4cf5-b05f-a7307681a5da")
    public String getweight() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_WEIGHT, this.element);
    }

    @objid ("55b9dfe3-f583-4992-a328-6748d6f010e0")
    public void setweight(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_WEIGHT, value);
    }

    @objid ("593c99fc-0b6d-4111-9993-9682f31bd0de")
    public String getprice() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_PRICE, this.element);
    }

    @objid ("80aa96b3-58f0-4618-b41d-c9f1a0cd5273")
    public void setprice(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_PRICE, value);
    }

    @objid ("056990dd-3656-440c-bc42-946c3c054890")
    public String getr_Conditions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_R_CONDITIONS, this.element);
    }

    @objid ("b07f3e71-af49-4cb7-9149-c25253bb778c")
    public void setr_Conditions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_R_CONDITIONS, value);
    }

    @objid ("1871f165-4c2e-46eb-a15c-61f4a2cf20c2")
    public String getpoweredServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_POWEREDSERVICES, this.element);
    }

    @objid ("06377992-8d4c-462c-8b68-cc3b55c496eb")
    public void setpoweredServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_POWEREDSERVICES, value);
    }

    @objid ("288dd7c4-7569-40f7-b1ec-5ff68f0fa7e8")
    public String getstaticConsumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_STATICCONSUMPTION, this.element);
    }

    @objid ("e7d8b415-8b62-4493-bb4a-b9ba8d7d234b")
    public void setstaticConsumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_STATICCONSUMPTION, value);
    }

    @objid ("783f156d-728d-43e8-9389-cfbc6ff47f9b")
    public String getstaticDissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_STATICDISSIPATION, this.element);
    }

    @objid ("8d540d94-a485-4634-b735-8dcc2c3a8d4e")
    public void setstaticDissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_STATICDISSIPATION, value);
    }

    @objid ("4a86a3d3-cd84-4fc8-b994-a4b34201e6ce")
    public String getsubComponents() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_SUBCOMPONENTS, this.element);
    }

    @objid ("207d9893-b158-407d-bd5b-560545a2cb1c")
    public void setsubComponents(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_SUBCOMPONENTS, value);
    }

    @objid ("7a5ec71f-15f7-4cb5-9be2-cec970f8ee3c")
    public Attribute getElement() {
        return this.element;
    }

}
