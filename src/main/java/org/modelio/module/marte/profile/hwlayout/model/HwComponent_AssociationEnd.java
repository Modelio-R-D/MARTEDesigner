package org.modelio.module.marte.profile.hwlayout.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwComponent_AssociationEnd {
    protected AssociationEnd element;

    public HwComponent_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPOWERSUPPLY_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName("HwPowerSupply_AssociationEnd"));
    }

    public HwComponent_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_KIND, this.element);
    }

    public void setParent(Classifier parent) {
        this.element.setSource(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_KIND, value);
    }

    public String getdimensions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_DIMENSIONS, this.element);
    }

    public void setdimensions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_DIMENSIONS, value);
    }

    public String getarea() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_AREA, this.element);
    }

    public void setarea(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_AREA, value);
    }

    public String getposition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_POSITION, this.element);
    }

    public void setposition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_POSITION, value);
    }

    public String getgrid() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_GRID, this.element);
    }

    public void setgrid(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_GRID, value);
    }

    public String getnbPins() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_NBPINS, this.element);
    }

    public void setnbPins(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_NBPINS, value);
    }

    public String getweight() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_WEIGHT, this.element);
    }

    public void setweight(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_WEIGHT, value);
    }

    public String getprice() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_PRICE, this.element);
    }

    public void setprice(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_PRICE, value);
    }

    public String getr_Conditions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_R_CONDITIONS, this.element);
    }

    public void setr_Conditions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_R_CONDITIONS, value);
    }

    public String getpoweredServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_POWEREDSERVICES, this.element);
    }

    public void setpoweredServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_POWEREDSERVICES, value);
    }

    public String getstaticConsumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_STATICCONSUMPTION, this.element);
    }

    public void setstaticConsumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_STATICCONSUMPTION, value);
    }

    public String getstaticDissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_STATICDISSIPATION, this.element);
    }

    public void setstaticDissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_STATICDISSIPATION, value);
    }

    public String getsubComponents() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_SUBCOMPONENTS, this.element);
    }

    public void setsubComponents(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATIONEND_HWCOMPONENT_ASSOCIATIONEND_SUBCOMPONENTS, value);
    }

    public AssociationEnd getElement() {
        return this.element;
    }

}
