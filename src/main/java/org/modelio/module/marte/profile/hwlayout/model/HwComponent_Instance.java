package org.modelio.module.marte.profile.hwlayout.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("73108bf7-0a54-4a73-a14c-14bde1dc5871")
public class HwComponent_Instance extends HwResource_Instance {
    @objid ("df9ae09e-07ac-48f5-913c-51239c677df3")
    public HwComponent_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPONENT_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwComponent_Instance"));
    }

    @objid ("afb4efa2-cc00-49ac-a330-16e29d80528c")
    public HwComponent_Instance(Instance element) {
        super(element);
    }

    @objid ("8ca50d0a-3e76-419a-b5ac-bc0e27f28450")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_KIND, this.element);
    }

    @objid ("6ab7e82b-a6cb-4c01-880c-5b6ac2e3532a")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_KIND, value);
    }

    @objid ("c7193e89-696e-4c10-b40e-4cb6b2235606")
    public String getdimensions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_DIMENSIONS, this.element);
    }

    @objid ("6d4b475a-1ba3-4b15-88dc-1c7d67883089")
    public void setdimensions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_DIMENSIONS, value);
    }

    @objid ("c2e3692a-48b6-41bc-b04a-4246c7d72b55")
    public String getarea() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_AREA, this.element);
    }

    @objid ("711eb118-272a-48e1-a0ef-80b25930cddf")
    public void setarea(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_AREA, value);
    }

    @objid ("0af87789-2bac-4e27-be25-697aa79693bb")
    public String getposition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_POSITION, this.element);
    }

    @objid ("2ecb1639-556f-44f0-a9df-cfd39b217b6e")
    public void setposition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_POSITION, value);
    }

    @objid ("8f6a7950-aa6d-4938-a170-04f7074597e5")
    public String getgrid() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_GRID, this.element);
    }

    @objid ("dea5e736-2d6f-4e57-9aa4-491c0d1b08e9")
    public void setgrid(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_GRID, value);
    }

    @objid ("4d1d9240-9970-4372-85fd-ea86d2e40fc3")
    public String getnbPins() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_NBPINS, this.element);
    }

    @objid ("642960c6-af3b-4902-a9f7-fdc4761b8a2b")
    public void setnbPins(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_NBPINS, value);
    }

    @objid ("e90c97e6-bb23-4c61-8eeb-5fdf0c318610")
    public String getweight() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_WEIGHT, this.element);
    }

    @objid ("be80a086-752b-49be-8a45-0e48b3085b23")
    public void setweight(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_WEIGHT, value);
    }

    @objid ("116a79b3-6d18-4018-a64b-210a40ff8db8")
    public String getprice() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_PRICE, this.element);
    }

    @objid ("a7739cda-3eca-4156-8bf4-4e47139597ef")
    public void setprice(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_PRICE, value);
    }

    @objid ("32d173e0-3a0c-435b-a6cb-1efbb9da287d")
    public String getr_Conditions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_R_CONDITIONS, this.element);
    }

    @objid ("3913593b-18d6-4e6f-a7e3-6e62c80dbe46")
    public void setr_Conditions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_R_CONDITIONS, value);
    }

    @objid ("d29365c1-fe13-4fb0-b42b-74910fcce113")
    public String getpoweredServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_POWEREDSERVICES, this.element);
    }

    @objid ("9b606e3a-a6ba-4adc-9a9b-3710e9c50ad3")
    public void setpoweredServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_POWEREDSERVICES, value);
    }

    @objid ("e9e0ca04-3529-4d01-8916-a42c38d03992")
    public String getstaticConsumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_STATICCONSUMPTION, this.element);
    }

    @objid ("b8ccba0a-7973-4c8b-8718-2a0288333b59")
    public void setstaticConsumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_STATICCONSUMPTION, value);
    }

    @objid ("1e40fb1e-8860-48ad-b4e6-7f1e8f9b3fb7")
    public String getstaticDissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_STATICDISSIPATION, this.element);
    }

    @objid ("921f55c5-9176-4fac-a41e-c3c2118cdc1d")
    public void setstaticDissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_INSTANCE_HWCOMPONENT_INSTANCE_STATICDISSIPATION, value);
    }

    @objid ("9e763976-97a7-43b7-ae33-3cbb9379fc52")
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
