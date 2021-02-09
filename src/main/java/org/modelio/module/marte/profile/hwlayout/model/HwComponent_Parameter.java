package org.modelio.module.marte.profile.hwlayout.model;

import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwComponent_Parameter {
    protected Parameter element;

    public HwComponent_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPONENT_PARAMETER);
        this.element.setName(MARTEResourceManager.getName("HwComponent_Parameter"));
    }

    public HwComponent_Parameter(Parameter element) {
        this.element = element;
    }

    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_KIND, this.element);
    }

    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_KIND, value);
    }

    public String getdimensions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_DIMENSIONS, this.element);
    }

    public void setParent(Operation parent) {
        this.element.setComposed(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public void setdimensions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_DIMENSIONS, value);
    }

    public String getarea() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_AREA, this.element);
    }

    public void setarea(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_AREA, value);
    }

    public String getposition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_POSITION, this.element);
    }

    public void setposition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_POSITION, value);
    }

    public String getgrid() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_GRID, this.element);
    }

    public void setgrid(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_GRID, value);
    }

    public String getnbPins() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_NBPINS, this.element);
    }

    public void setnbPins(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_NBPINS, value);
    }

    public String getweight() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_WEIGHT, this.element);
    }

    public void setweight(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_WEIGHT, value);
    }

    public String getprice() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_PRICE, this.element);
    }

    public void setprice(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_PRICE, value);
    }

    public String getr_Conditions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_R_CONDITIONS, this.element);
    }

    public void setr_Conditions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_R_CONDITIONS, value);
    }

    public String getpoweredServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_POWEREDSERVICES, this.element);
    }

    public void setpoweredServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_POWEREDSERVICES, value);
    }

    public String getstaticConsumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_STATICCONSUMPTION, this.element);
    }

    public void setstaticConsumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_STATICCONSUMPTION, value);
    }

    public String getstaticDissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_STATICDISSIPATION, this.element);
    }

    public void setstaticDissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_STATICDISSIPATION, value);
    }

    public String getsubComponents() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_SUBCOMPONENTS, this.element);
    }

    public void setsubComponents(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_SUBCOMPONENTS, value);
    }

    public Parameter getElement() {
        return this.element;
    }

}
