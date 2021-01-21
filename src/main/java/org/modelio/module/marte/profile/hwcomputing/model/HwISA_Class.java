package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b31246cc-87c8-4a68-b48d-f7d9f6561913")
public class HwISA_Class extends HwResource_Class {
    @objid ("535ba359-12fe-41da-a811-880c748ba81f")
    public HwISA_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWISA_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWISA_CLASSIFIER));
    }

    @objid ("6267a604-63ce-4fc8-bf3c-36e987f981be")
    public HwISA_Class(Class element) {
        super(element);
    }

    @objid ("01b0b667-770a-4b3d-bdf1-c54b1a1d6c0d")
    public String getfamily() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_FAMILY, this.element);
    }

    @objid ("d3ef43f1-c224-461e-a45e-3fc4f8c7e670")
    public void setfamily(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_FAMILY, value);
    }

    @objid ("1bee45eb-ae3b-46ad-b33f-0ba2d7305f02")
    public String getinst_Width() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_INST_WIDTH, this.element);
    }

    @objid ("f0768c96-35a0-42c8-8d10-90a8949a460d")
    public void setinst_Width(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_INST_WIDTH, value);
    }

    @objid ("15978c7e-2bb5-4359-ae08-6347502caaa5")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_TYPE, this.element);
    }

    @objid ("2f97f6da-1ebd-493f-a66c-f132a1f1206f")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_TYPE, value);
    }

    @objid ("95c0006e-11f9-45ed-97e3-b45e3df94ed0")
    public enum ISA_Type {
        RISC,
        CISC,
        VLIW,
        SIMD,
        other,
        undef;
    }

}
