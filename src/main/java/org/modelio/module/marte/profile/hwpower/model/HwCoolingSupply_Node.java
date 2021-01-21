package org.modelio.module.marte.profile.hwpower.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwlayout.model.HwComponent_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7b214133-d55e-4b51-95ea-c48c6aa81279")
public class HwCoolingSupply_Node extends HwComponent_Node {
    @objid ("0acbbc5f-78c4-4758-8bd3-f46952c08893")
    public HwCoolingSupply_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOOLINGSUPPLY_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCOOLINGSUPPLY_CLASSIFIER));
    }

    @objid ("3c8502be-79c2-45c5-bf11-5bcd33058271")
    public HwCoolingSupply_Node(Node element) {
        super(element);
    }

    @objid ("b5c96bef-87ef-4140-ad8a-eeb0a7513937")
    public String getcoolingPower() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_CLASSIFIER_HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER, this.element);
    }

    @objid ("77152f1f-319f-4ea0-a41a-a1fc63692ba5")
    public void setcoolingPower(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOOLINGSUPPLY_CLASSIFIER_HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER, value);
    }

}
