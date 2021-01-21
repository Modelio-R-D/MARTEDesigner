package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3cee6908-3f98-4ed1-949b-f32b78bf5ee9")
public class HwISA_Node extends HwResource_Node {
    @objid ("31ce0f30-2da2-4d9c-b4e6-c0cd697d490a")
    public HwISA_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWISA_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWISA_CLASSIFIER));
    }

    @objid ("144d2bcd-1e98-4aa5-b63c-4f327f744c14")
    public HwISA_Node(Node element) {
        super(element);
    }

    @objid ("ed79f66a-13be-4e5e-bcb4-ae95956f586b")
    public String getfamily() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_FAMILY, this.element);
    }

    @objid ("baf0f9c1-0979-45cc-a262-7369270d37eb")
    public void setfamily(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_FAMILY, value);
    }

    @objid ("7a0299ef-a16d-4ad7-a947-89370e258909")
    public String getinst_Width() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_INST_WIDTH, this.element);
    }

    @objid ("1e58ca85-de71-4848-af86-62e9154210b9")
    public void setinst_Width(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_INST_WIDTH, value);
    }

    @objid ("eedca220-1db1-450a-bdaa-a0178d0b0ac8")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_TYPE, this.element);
    }

    @objid ("7f05d657-7ed7-44d0-8800-86d4b963fb27")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_CLASSIFIER_HWISA_CLASSIFIER_TYPE, value);
    }

    @objid ("0384b46d-49ec-4946-acf6-f9776a324d05")
    public enum ISA_Type {
        RISC,
        CISC,
        VLIW,
        SIMD,
        other,
        undef;
    }

}
