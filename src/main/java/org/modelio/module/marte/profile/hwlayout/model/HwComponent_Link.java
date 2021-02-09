package org.modelio.module.marte.profile.hwlayout.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwComponent_Link {
    protected Link element;

    public HwComponent_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPONENT_LINK);
        this.element.setName(MARTEResourceManager.getName("HwComponent_Link"));
    }

    public HwComponent_Link(Link element) {
        this.element = element;
    }

    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    public Link getElement() {
        return this.element;
    }

    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_KIND, this.element);
    }

    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_KIND, value);
    }

    public String getdimensions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_DIMENSIONS, this.element);
    }

    public void setdimensions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_DIMENSIONS, value);
    }

    public String getarea() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_AREA, this.element);
    }

    public void setarea(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_AREA, value);
    }

    public String getposition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_POSITION, this.element);
    }

    public void setposition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_POSITION, value);
    }

    public String getgrid() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_GRID, this.element);
    }

    public void setgrid(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_GRID, value);
    }

    public String getnbPins() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_NBPINS, this.element);
    }

    public void setnbPins(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_NBPINS, value);
    }

    public String getweight() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_WEIGHT, this.element);
    }

    public void setweight(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_WEIGHT, value);
    }

    public String getprice() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_PRICE, this.element);
    }

    public void setprice(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_PRICE, value);
    }

    public String getr_Conditions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_R_CONDITIONS, this.element);
    }

    public void setr_Conditions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_R_CONDITIONS, value);
    }

    public String getpoweredServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_POWEREDSERVICES, this.element);
    }

    public void setpoweredServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_POWEREDSERVICES, value);
    }

    public String getstaticConsumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_STATICCONSUMPTION, this.element);
    }

    public void setstaticConsumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_STATICCONSUMPTION, value);
    }

    public String getstaticDissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_STATICDISSIPATION, this.element);
    }

    public void setstaticDissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_STATICDISSIPATION, value);
    }

    public String getsubComponents() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_SUBCOMPONENTS, this.element);
    }

    public void setsubComponents(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_LINK_HWCOMPONENT_LINK_SUBCOMPONENTS, value);
    }

}
