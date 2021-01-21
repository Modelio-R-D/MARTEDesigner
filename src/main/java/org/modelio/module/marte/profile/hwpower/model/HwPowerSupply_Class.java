package org.modelio.module.marte.profile.hwpower.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwlayout.model.HwComponent_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b2f02fb8-590f-40c2-9c08-0c170729abea")
public class HwPowerSupply_Class extends HwComponent_Class {
    @objid ("699fba34-d7eb-477f-97c8-84c35c6d7bfb")
    public HwPowerSupply_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPOWERSUPPLY_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWPOWERSUPPLY_CLASSIFIER));
    }

    @objid ("47df737e-5c71-4f71-aff2-938898337f7b")
    public HwPowerSupply_Class(Class element) {
        super(element);
    }

    @objid ("f91ca11e-0ce9-43b4-b791-90b479b68d13")
    public String getsuppliedPower() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER, this.element);
    }

    @objid ("af4234f8-780f-497a-8a32-2f3cbd8e44d6")
    public void setsuppliedPower(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER, value);
    }

    @objid ("5b7c9b32-fd0c-4163-bbd7-09474eb76376")
    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_CAPACITY, this.element);
    }

    @objid ("84f3fcd6-7f56-42f6-9f84-c90b131c4bc4")
    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_CAPACITY, value);
    }

}
