package org.modelio.module.marte.profile.hwlayout.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwComponent_Association {
    protected Association element;

    public HwComponent_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPONENT_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwComponent_Association"));
    }

    public HwComponent_Association(Association element) {
        this.element = element;
    }

    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    public Association getElement() {
        return this.element;
    }

    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_KIND, this.element);
    }

    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_KIND, value);
    }

    public String getdimensions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_DIMENSIONS, this.element);
    }

    public void setdimensions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_DIMENSIONS, value);
    }

    public String getarea() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_AREA, this.element);
    }

    public void setarea(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_AREA, value);
    }

    public String getposition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_POSITION, this.element);
    }

    public void setposition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_POSITION, value);
    }

    public String getgrid() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_GRID, this.element);
    }

    public void setgrid(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_GRID, value);
    }

    public String getnbPins() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_NBPINS, this.element);
    }

    public void setnbPins(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_NBPINS, value);
    }

    public String getweight() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_WEIGHT, this.element);
    }

    public void setweight(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_WEIGHT, value);
    }

    public String getprice() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_PRICE, this.element);
    }

    public void setprice(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_PRICE, value);
    }

    public String getr_Conditions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_R_CONDITIONS, this.element);
    }

    public void setr_Conditions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_R_CONDITIONS, value);
    }

    public String getpoweredServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_POWEREDSERVICES, this.element);
    }

    public void setpoweredServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_POWEREDSERVICES, value);
    }

    public String getstaticConsumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION, this.element);
    }

    public void setstaticConsumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_STATICCONSUMPTION, value);
    }

    public String getstaticDissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_STATICDISSIPATION, this.element);
    }

    public void setstaticDissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_STATICDISSIPATION, value);
    }

    public String getsubComponents() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS, this.element);
    }

    public void setsubComponents(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_ASSOCIATION_HWCOMPONENT_ASSOCIATION_SUBCOMPONENTS, value);
    }

}
