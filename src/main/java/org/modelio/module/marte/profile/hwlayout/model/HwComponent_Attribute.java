package org.modelio.module.marte.profile.hwlayout.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwComponent_Attribute {
    protected Attribute element;

    public HwComponent_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPONENT_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("HwComponent_Attribute"));
    }

    public HwComponent_Attribute(Attribute element) {
        this.element = element;
    }

    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_KIND, this.element);
    }

    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_KIND, value);
    }

    public String getdimensions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_DIMENSIONS, this.element);
    }

    public void setdimensions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_DIMENSIONS, value);
    }

    public String getarea() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_AREA, this.element);
    }

    public void setarea(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_AREA, value);
    }

    public String getposition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_POSITION, this.element);
    }

    public void setposition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_POSITION, value);
    }

    public String getgrid() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_GRID, this.element);
    }

    public void setgrid(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_GRID, value);
    }

    public String getnbPins() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_NBPINS, this.element);
    }

    public void setnbPins(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_NBPINS, value);
    }

    public String getweight() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_WEIGHT, this.element);
    }

    public void setweight(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_WEIGHT, value);
    }

    public String getprice() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_PRICE, this.element);
    }

    public void setprice(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_PRICE, value);
    }

    public String getr_Conditions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_R_CONDITIONS, this.element);
    }

    public void setr_Conditions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_R_CONDITIONS, value);
    }

    public String getpoweredServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_POWEREDSERVICES, this.element);
    }

    public void setpoweredServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_POWEREDSERVICES, value);
    }

    public String getstaticConsumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_STATICCONSUMPTION, this.element);
    }

    public void setstaticConsumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_STATICCONSUMPTION, value);
    }

    public String getstaticDissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_STATICDISSIPATION, this.element);
    }

    public void setstaticDissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_STATICDISSIPATION, value);
    }

    public String getsubComponents() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_SUBCOMPONENTS, this.element);
    }

    public void setsubComponents(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ATTRIBUTE_HWCOMPONENT_ATTRIBUTE_SUBCOMPONENTS, value);
    }

    public Attribute getElement() {
        return this.element;
    }

}
