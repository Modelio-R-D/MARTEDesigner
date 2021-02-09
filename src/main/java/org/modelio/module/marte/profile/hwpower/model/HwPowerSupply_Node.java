package org.modelio.module.marte.profile.hwpower.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwlayout.model.HwComponent_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwPowerSupply_Node extends HwComponent_Node {
    public HwPowerSupply_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPOWERSUPPLY_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWPOWERSUPPLY_CLASSIFIER));
    }

    public HwPowerSupply_Node(Node element) {
        super(element);
    }

    public String getsuppliedPower() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER, this.element);
    }

    public void setsuppliedPower(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER, value);
    }

    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_CAPACITY, this.element);
    }

    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_CAPACITY, value);
    }

}
