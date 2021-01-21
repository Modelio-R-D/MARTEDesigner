package org.modelio.module.marte.profile.hwlayout.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("bcec5c33-b142-4bd0-9c8f-929d96853f4a")
public class HwComponent_Parameter {
    @objid ("9794bd34-b0ad-40c4-b851-c6792865da52")
    protected Parameter element;

    @objid ("aa4defdf-7746-4d93-9c24-540307818bce")
    public HwComponent_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPONENT_PARAMETER);
        this.element.setName(MARTEResourceManager.getName("HwComponent_Parameter"));
    }

    @objid ("d97ac5eb-5b3d-4bb1-a9a8-ba66cee29e85")
    public HwComponent_Parameter(Parameter element) {
        this.element = element;
    }

    @objid ("9417f695-237f-44fa-80c3-d6f22119d386")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_KIND, this.element);
    }

    @objid ("8a26ce7b-57ae-4c12-83ba-36854d563c3c")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_KIND, value);
    }

    @objid ("d120ed54-85ac-4a04-b7e7-d2a52efb037c")
    public String getdimensions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_DIMENSIONS, this.element);
    }

    @objid ("b8fc2fdd-a39b-48ae-9187-1ae64af53e11")
    public void setParent(Operation parent) {
        this.element.setComposed(parent);
    }

    @objid ("f31bb0ba-38f6-4d6b-9abc-c057680c7697")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("dc233200-8009-48fb-a32c-ec61a4a4605f")
    public void setdimensions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_DIMENSIONS, value);
    }

    @objid ("265c6c44-a9bb-4988-be7e-f710c3493dd3")
    public String getarea() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_AREA, this.element);
    }

    @objid ("a101d50e-e24b-41ac-9c68-9daebbe8696e")
    public void setarea(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_AREA, value);
    }

    @objid ("5d7da2d4-786b-47b5-8a07-4e8b7c36de15")
    public String getposition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_POSITION, this.element);
    }

    @objid ("e6d2e1a6-3539-42e3-9e76-9c55763ba677")
    public void setposition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_POSITION, value);
    }

    @objid ("4ad22637-0936-4343-8859-677734bb5c19")
    public String getgrid() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_GRID, this.element);
    }

    @objid ("ed4b409d-631a-4a74-8891-c718797fc99b")
    public void setgrid(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_GRID, value);
    }

    @objid ("6404a76d-1ce6-4865-8d52-7e7f3a1d50b2")
    public String getnbPins() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_NBPINS, this.element);
    }

    @objid ("1b0e8451-5e35-47ff-bf5a-1eb01a901f0f")
    public void setnbPins(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_NBPINS, value);
    }

    @objid ("d1252562-6aaf-4f60-ba02-646b07a63829")
    public String getweight() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_WEIGHT, this.element);
    }

    @objid ("35bd6362-47ec-47de-b141-e133a2c8237b")
    public void setweight(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_WEIGHT, value);
    }

    @objid ("e8b2693a-b420-41c1-88f9-9e9a5a73014b")
    public String getprice() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_PRICE, this.element);
    }

    @objid ("e2cda2f5-8c4e-4acd-8869-029caf71b2b2")
    public void setprice(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_PRICE, value);
    }

    @objid ("68f30017-f518-4e2e-8ce8-1d1ef28ea688")
    public String getr_Conditions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_R_CONDITIONS, this.element);
    }

    @objid ("ca4c726c-10fa-4556-a66c-c9ede6fbe99f")
    public void setr_Conditions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_R_CONDITIONS, value);
    }

    @objid ("af7c05df-5b51-444a-96c5-6d58a2fbf8a5")
    public String getpoweredServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_POWEREDSERVICES, this.element);
    }

    @objid ("4f2ae6c9-8e97-4359-8a7d-deff2940cfb3")
    public void setpoweredServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_POWEREDSERVICES, value);
    }

    @objid ("c0cb8ed5-2322-4ddf-9d3d-be57c5ff8ec3")
    public String getstaticConsumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_STATICCONSUMPTION, this.element);
    }

    @objid ("74241d76-8413-4743-b487-9daed75f9389")
    public void setstaticConsumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_STATICCONSUMPTION, value);
    }

    @objid ("31265827-796c-4292-9ef7-e8e7d01de6ac")
    public String getstaticDissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_STATICDISSIPATION, this.element);
    }

    @objid ("bace72dc-5e40-49ef-a721-11bce997cc36")
    public void setstaticDissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_STATICDISSIPATION, value);
    }

    @objid ("51587329-5d69-4af9-8cad-b4c1b32e2457")
    public String getsubComponents() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_SUBCOMPONENTS, this.element);
    }

    @objid ("1929e136-36ef-4bf2-94f4-b643263a4c7d")
    public void setsubComponents(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_PARAMETER_HWCOMPONENT_PARAMETER_SUBCOMPONENTS, value);
    }

    @objid ("ac69e71e-3729-4630-b6dd-54ee226dd57b")
    public Parameter getElement() {
        return this.element;
    }

}
