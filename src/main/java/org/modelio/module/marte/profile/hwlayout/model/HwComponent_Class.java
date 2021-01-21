package org.modelio.module.marte.profile.hwlayout.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b0f77ac8-87d4-4770-bebd-c9c13d26e02c")
public class HwComponent_Class extends HwResource_Class {
    @objid ("6890b29b-8256-4763-af3e-b25591764483")
    public HwComponent_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPONENT_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCOMPONENT_CLASSIFIER));
    }

    @objid ("5237a9ac-bcb1-496e-af74-0fd1b6f54e0e")
    public HwComponent_Class(Class element) {
        super(element);
    }

    @objid ("11cb85cc-2b3c-4afc-a210-08f84b3ff4f4")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_KIND, this.element);
    }

    @objid ("cdcdce4d-1b91-4951-896e-fa274b7577eb")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_KIND, value);
    }

    @objid ("c08f3e80-88f0-4920-a7f7-246766af64a1")
    public String getdimensions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_DIMENSIONS, this.element);
    }

    @objid ("5408502a-0fac-4c96-9a3b-6f4b71e6d737")
    public void setdimensions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_DIMENSIONS, value);
    }

    @objid ("cc129708-a1a5-436b-9eb3-21c16b492895")
    public String getarea() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_AREA, this.element);
    }

    @objid ("169a5af1-facc-4c60-8fb6-c38b5c2e8111")
    public void setarea(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_AREA, value);
    }

    @objid ("f2a1461a-26b5-4952-b66b-6e6c525a6349")
    public String getposition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_POSITION, this.element);
    }

    @objid ("478fad36-2474-4d5f-b7f8-09de19bd5401")
    public void setposition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_POSITION, value);
    }

    @objid ("6cc976a9-2568-428c-83a1-482767eab8c2")
    public String getgrid() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_GRID, this.element);
    }

    @objid ("4e96da6f-74bc-458e-a318-342fd045cbc8")
    public void setgrid(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_GRID, value);
    }

    @objid ("393de9cd-e95c-4ec8-858d-477c0f272f99")
    public String getnbPins() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_NBPINS, this.element);
    }

    @objid ("a88c59cd-31c7-4b7e-bde7-6a98f58a5201")
    public void setnbPins(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_NBPINS, value);
    }

    @objid ("a9cad616-988c-456d-8bec-e653dbfc0fd0")
    public String getweight() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_WEIGHT, this.element);
    }

    @objid ("a43181e4-9b5f-4e64-94b3-6b94032db492")
    public void setweight(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_WEIGHT, value);
    }

    @objid ("ba5fa718-a700-43e4-9eb2-c9db607a03bd")
    public String getprice() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_PRICE, this.element);
    }

    @objid ("925d657d-b364-4a38-8dce-4eee549ca3ac")
    public void setprice(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_PRICE, value);
    }

    @objid ("4ec96658-920a-4e20-bd8d-1a203734be6d")
    public String getr_Conditions() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_R_CONDITIONS, this.element);
    }

    @objid ("c0909434-a80b-40f8-a070-be173ae1a132")
    public void setr_Conditions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_R_CONDITIONS, value);
    }

    @objid ("2b4af67c-afd6-4017-8ac9-fca6a530b984")
    public String getpoweredServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_POWEREDSERVICES, this.element);
    }

    @objid ("33c8701f-eeba-45d1-96dc-e83e6542821d")
    public void setpoweredServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_POWEREDSERVICES, value);
    }

    @objid ("47033708-f12f-4bde-b27c-a43dc32baa7b")
    public String getstaticConsumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_STATICCONSUMPTION, this.element);
    }

    @objid ("bdb84d87-ab48-4842-a46a-f5a62a4bb285")
    public void setstaticConsumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_STATICCONSUMPTION, value);
    }

    @objid ("da052ead-70f5-4b9e-99f6-6ad1b6a7d58b")
    public String getstaticDissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_STATICDISSIPATION, this.element);
    }

    @objid ("e7c5acbd-cdaf-43ae-8bf9-e5fd9b8affcd")
    public void setstaticDissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPONENT_CLASSIFIER_HWCOMPONENT_CLASSIFIER_STATICDISSIPATION, value);
    }

    @objid ("39a109ce-f1c1-467d-81bf-42bde656746f")
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
