package org.modelio.module.marte.profile.hwpower.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwlayout.model.HwComponent_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7dfaeea5-62fa-437c-95a4-188b71551aed")
public class HwCoolingSupply_Class extends HwComponent_Class {
    @objid ("8a9b5766-aede-4713-b5d9-c075e97234a6")
    public HwCoolingSupply_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOOLINGSUPPLY_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCOOLINGSUPPLY_CLASSIFIER));
    }

    @objid ("8fe3aff5-e9e2-4351-8fe4-40228cc8db69")
    public HwCoolingSupply_Class(Class element) {
        super(element);
    }

    @objid ("ce6d04f0-8e9a-4cb3-8f10-98b812ab27cb")
    public String getcoolingPower() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_CLASSIFIER_HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER, this.element);
    }

    @objid ("deaa54cd-f400-49ea-a45e-a5c01128a3a2")
    public void setcoolingPower(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOOLINGSUPPLY_CLASSIFIER_HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER, value);
    }

}
