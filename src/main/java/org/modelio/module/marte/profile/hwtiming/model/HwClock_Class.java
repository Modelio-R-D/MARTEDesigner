package org.modelio.module.marte.profile.hwtiming.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f742b58e-ede5-4f88-9fdc-7179f3ad3c4b")
public class HwClock_Class extends HwTimingResource_Class {
    @objid ("78497476-c733-41e8-8c32-e28d9df43877")
    public HwClock_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCLOCK_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCLOCK_CLASSIFIER));
    }

    @objid ("6aad32c0-e7ae-4805-ad94-818d7373a962")
    public HwClock_Class(Class element) {
        super(element);
    }

    @objid ("d327ac6e-9aaf-4c67-9e1f-f34e34958063")
    public String getfrenquency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_CLASSIFIER_HWCLOCK_CLASSIFIER_FREQUENCY, this.element);
    }

    @objid ("23d43bf5-6645-42f2-99ad-dd14a95077a7")
    public void setfrenquency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCLOCK_CLASSIFIER_HWCLOCK_CLASSIFIER_FREQUENCY, value);
    }

}
