package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e70b61e9-b51d-4bb1-b8bd-ebf5e025f442")
public class HwBridge_Class extends HwMedia_Class {
    @objid ("6a96d1eb-20c5-4c59-8cbb-070cdea229cc")
    public HwBridge_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWBRIDGE_CLASSIFIER));
    }

    @objid ("3813f562-1387-42c2-bceb-7da106b23941")
    public HwBridge_Class(Class element) {
        super(element);
    }

    @objid ("817ab6ea-669f-4605-ad3b-c9362807e3d4")
    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_CLASSIFIER_HWBRIDGE_CLASSIFIER_SIDES, this.element);
    }

    @objid ("74d8f4c3-ad58-4a42-9bec-f04bba988dd6")
    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_CLASSIFIER_HWBRIDGE_CLASSIFIER_SIDES, value);
    }

}
