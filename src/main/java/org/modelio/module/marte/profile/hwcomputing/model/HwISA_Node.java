package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwISA_Node extends HwResource_Node {
    public HwISA_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWISA_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWISA_CLASSIFIER));
    }

    public HwISA_Node(Node element) {
        super(element);
    }

    public String getfamily() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_FAMILY, this.element);
    }

    public void setfamily(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_FAMILY, value);
    }

    public String getinst_Width() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_INST_WIDTH, this.element);
    }

    public void setinst_Width(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_INST_WIDTH, value);
    }

    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_TYPE, this.element);
    }

    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_TYPE, value);
    }

    public enum ISA_Type {
        RISC,
        CISC,
        VLIW,
        SIMD,
        other,
        undef;
    }

}
