package org.modelio.module.marte.profile.hwlayout.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("600e5b72-2013-4d75-9f6b-ef2f0b9b7111")
public class HwComponent_LifeLine {
    @objid ("5a03860e-f512-465e-a0a1-eb0c8e9bd698")
    protected Lifeline element;

    @objid ("384a3f78-8c73-4294-8fac-0a6119ce31c3")
    public HwComponent_LifeLine() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPONENT_LIFELINE);
        this.element.setName(MARTEResourceManager.getName("HwComponent_LifeLine"));
    }

    @objid ("bfa60e25-237a-4a93-9cee-83a27a74875f")
    public HwComponent_LifeLine(Lifeline element) {
        this.element = element;
    }

    @objid ("8dfb410f-b3f9-4f6e-8b0b-3b53aee48c3d")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_KIND, this.element);
    }

    @objid ("2461e258-2e5e-4190-995b-4118aa8784c8")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_KIND, value);
    }

    @objid ("815fe77d-c14f-4f11-ba31-af9d18d3a857")
    public String getdimensions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_DIMENSIONS, this.element);
    }

    @objid ("c60e0438-d1a2-4681-926d-0837478e80a3")
    public void setdimensions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_DIMENSIONS, value);
    }

    @objid ("559063aa-6a90-49e0-8434-7f24be098809")
    public String getarea() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_AREA, this.element);
    }

    @objid ("bc02ed0e-c8e1-4827-95e2-1ecc0bfe9a27")
    public void setarea(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_AREA, value);
    }

    @objid ("a66287e3-3afb-4cfd-bf23-8d2b0e7e900f")
    public String getposition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_POSITION, this.element);
    }

    @objid ("328b07a5-e2b0-4f63-8246-68997b27baf4")
    public void setposition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_POSITION, value);
    }

    @objid ("e99a6a3f-d400-44ab-a03b-2c8da34a6674")
    public String getgrid() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_GRID, this.element);
    }

    @objid ("d260954c-4e26-4453-8bd0-9014a62dc405")
    public void setgrid(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_GRID, value);
    }

    @objid ("2993e8e0-bd2a-484e-b3cf-38e23b4f2352")
    public String getnbPins() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_NBPINS, this.element);
    }

    @objid ("41101ed9-00f8-4fd3-8f7e-bfac7166afac")
    public void setnbPins(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_NBPINS, value);
    }

    @objid ("2b725961-d5bc-459c-8be5-b7c3ddaf9b9a")
    public String getweight() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_WEIGHT, this.element);
    }

    @objid ("2f9a451d-27f2-4b9b-8e76-8d4df350ce5c")
    public void setweight(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_WEIGHT, value);
    }

    @objid ("92f7ce40-b8d6-4097-bf57-bca662c9811a")
    public String getprice() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_PRICE, this.element);
    }

    @objid ("8c939fcd-894e-4c61-bd99-e0e633dc9814")
    public void setprice(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_PRICE, value);
    }

    @objid ("59e9327d-11d2-48c5-b8cd-c585653b067c")
    public String getr_Conditions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_R_CONDITIONS, this.element);
    }

    @objid ("c977c6cc-8875-4a43-bc58-a66ff0beeacc")
    public void setr_Conditions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_R_CONDITIONS, value);
    }

    @objid ("cab50dac-335c-46dc-b35c-dc22165a2605")
    public String getpoweredServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_POWEREDSERVICES, this.element);
    }

    @objid ("621b397a-cc2b-4d5a-8a98-7e5a1c122ab2")
    public void setpoweredServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_POWEREDSERVICES, value);
    }

    @objid ("61f7b75c-8080-4441-a662-895fc7dd3cb2")
    public String getstaticConsumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_STATICCONSUMPTION, this.element);
    }

    @objid ("76cc8326-d220-44c4-a802-37e048c87bb3")
    public void setstaticConsumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_STATICCONSUMPTION, value);
    }

    @objid ("52a96342-cf1d-4664-b036-a36dfe30298d")
    public String getstaticDissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_STATICDISSIPATION, this.element);
    }

    @objid ("f85d0688-9301-451a-9335-0ffd6fbd1308")
    public void setstaticDissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_STATICDISSIPATION, value);
    }

    @objid ("1f710e7c-0100-4b45-a350-6b982931d033")
    public String getsubComponents() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_SUBCOMPONENTS, this.element);
    }

    @objid ("54006264-9011-42b8-a2b9-6b37f0447d6e")
    public void setsubComponents(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LIFELINE_HWCOMPONENT_LIFELINE_SUBCOMPONENTS, value);
    }

    @objid ("ab0325cc-38e0-4131-860a-97100e7edc9d")
    public void setParent(Interaction parent) {
        this.element.setOwner(parent);
    }

    @objid ("c4c6a48d-7509-4361-8b30-5beaf28cd5ae")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("b5b7b5f0-a973-4c50-9698-ddbb9022ad28")
    public Lifeline getElement() {
        return this.element;
    }

}
