package org.modelio.module.marte.profile.hwpower.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwlayout.model.HwComponent_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e026f4f6-703b-4da3-8c27-4e3a0b312a07")
public class HwPowerSupply_Node extends HwComponent_Node {
    @objid ("57a63baf-3125-49d6-a627-716d39f0f3a9")
    public HwPowerSupply_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPOWERSUPPLY_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWPOWERSUPPLY_CLASSIFIER));
    }

    @objid ("79c9aa97-5f10-4dbd-8de6-1c71e86ba613")
    public HwPowerSupply_Node(Node element) {
        super(element);
    }

    @objid ("b703c3b8-d040-4a30-b000-24f250071f2e")
    public String getsuppliedPower() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER, this.element);
    }

    @objid ("6a9aee4e-49a6-49c1-8920-f9febb9cff4f")
    public void setsuppliedPower(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER, value);
    }

    @objid ("873e7c47-60cf-4720-9383-d70b7dd677b0")
    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_CAPACITY, this.element);
    }

    @objid ("21ad0539-c465-4a08-ae22-a4e393dec9ef")
    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_CAPACITY, value);
    }

}
