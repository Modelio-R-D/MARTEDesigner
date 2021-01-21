package org.modelio.module.marte.profile.hwlayout.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f361b0bc-1552-4183-ba70-d7df76719e12")
public class HwComponent_BindableInstance extends HwResource_BindableInstance {
    @objid ("77e8a74e-d327-425c-abd8-b0c95efaa92d")
    public HwComponent_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPONENT_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwComponent_BindableInstance"));
    }

    @objid ("80c064c5-a9d5-48e6-8058-9df79867a8a7")
    public HwComponent_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("e13a1e7c-56a6-4171-8179-27425ba06d3b")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_KIND, this.element);
    }

    @objid ("0d78f1e9-9786-4bc3-935b-a5d39712e94c")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_KIND, value);
    }

    @objid ("44b523d6-2386-48f6-a8a4-4f9f806b751b")
    public String getdimensions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_DIMENSIONS, this.element);
    }

    @objid ("3479243c-dace-49ea-ade6-38e096b46a30")
    public void setdimensions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_DIMENSIONS, value);
    }

    @objid ("5fed9dc7-59c1-438e-9dda-c228d1a7a5e8")
    public String getarea() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_AREA, this.element);
    }

    @objid ("5dad9bfb-2c9f-4601-91d2-d4fca220e6cf")
    public void setarea(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_AREA, value);
    }

    @objid ("6482c5f7-df40-4d5a-8dbe-88caa76a58f0")
    public String getposition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_POSITION, this.element);
    }

    @objid ("e0619a56-b99c-4dc0-8a75-3efc6bf61a12")
    public void setposition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_POSITION, value);
    }

    @objid ("10bb8918-3c38-4ad3-8e45-6c6424f16e4b")
    public String getgrid() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_GRID, this.element);
    }

    @objid ("5fa4c70e-1230-4362-ba38-08a892040585")
    public void setgrid(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_GRID, value);
    }

    @objid ("f4e04552-1477-4729-aa84-122fa08bf224")
    public String getnbPins() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_NBPINS, this.element);
    }

    @objid ("f30e673f-a74d-45e4-b53b-20d5bdfc02a1")
    public void setnbPins(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_NBPINS, value);
    }

    @objid ("80f6c038-e9ae-4055-8637-efa7dfc3240b")
    public String getweight() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_WEIGHT, this.element);
    }

    @objid ("d82342b0-bc26-45ee-b6c0-cee5e2cafd74")
    public void setweight(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_WEIGHT, value);
    }

    @objid ("860ab475-021c-4653-83a7-c87bb343e603")
    public String getprice() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_PRICE, this.element);
    }

    @objid ("d9b66c30-888e-47d3-a4b0-cf0f4dad671f")
    public void setprice(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_PRICE, value);
    }

    @objid ("e158094e-b406-4ce1-aca6-68eb4b39350c")
    public String getr_Conditions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_R_CONDITIONS, this.element);
    }

    @objid ("56c03a23-3ca3-45c8-91ae-17c4bc613ac5")
    public void setr_Conditions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_R_CONDITIONS, value);
    }

    @objid ("e3100ceb-d002-41a4-8c94-05beb95deda6")
    public String getpoweredServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_POWEREDSERVICES, this.element);
    }

    @objid ("b0f88217-b979-4acd-b297-9c795a9cd565")
    public void setpoweredServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_POWEREDSERVICES, value);
    }

    @objid ("63acf107-e349-42af-97a1-5ebbf5a08661")
    public String getstaticConsumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_STATICCONSUMPTION, this.element);
    }

    @objid ("662bdddf-3911-428a-8ecc-819dda961be9")
    public void setstaticConsumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_STATICCONSUMPTION, value);
    }

    @objid ("fa069436-4511-49cc-9fe1-39999646cb0a")
    public String getstaticDissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_STATICDISSIPATION, this.element);
    }

    @objid ("8d0f9f82-a868-4437-9521-815e2194aadf")
    public void setstaticDissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_STATICDISSIPATION, value);
    }

    @objid ("2192fbdc-3453-4dd4-8c2a-302959566c89")
    public String getsubComponents() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_SUBCOMPONENTS, this.element);
    }

    @objid ("6764d5fd-73ad-4e0a-869b-87dbc24b1aec")
    public void setsubComponents(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_SUBCOMPONENTS, value);
    }

}
