package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("83e012ac-9110-4b05-97fb-ff85f4422e41")
public class HwISA_Instance extends HwResource_Instance {
    @objid ("dd4caf46-55a4-457a-9c80-b953e8ce8dbe")
    public HwISA_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWISA_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwISA_Instance"));
    }

    @objid ("51047f97-7d19-4be2-ad9a-9af1eb964d22")
    public HwISA_Instance(Instance element) {
        super(element);
    }

    @objid ("9d727460-8ce1-4bc6-b950-d18047595055")
    public String getfamily() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_INSTANCE_HWISA_INSTANCE_FAMILY, this.element);
    }

    @objid ("24b5a6d3-7d8e-43e8-abc2-2b68df3f1a98")
    public void setfamily(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_INSTANCE_HWISA_INSTANCE_FAMILY, value);
    }

    @objid ("515c1647-e270-4d38-9dd7-02f689d07cef")
    public String getinst_Width() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_INSTANCE_HWISA_INSTANCE_INST_WIDTH, this.element);
    }

    @objid ("0c79e688-4583-4584-becb-5da7c1624a90")
    public void setinst_Width(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_INSTANCE_HWISA_INSTANCE_INST_WIDTH, value);
    }

    @objid ("424426ec-d042-4f5f-8d1f-d1ca35abaa47")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_INSTANCE_HWISA_INSTANCE_TYPE, this.element);
    }

    @objid ("7677febb-8822-4e38-8d4f-6b8db3e67974")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_INSTANCE_HWISA_INSTANCE_TYPE, value);
    }

    @objid ("09394079-eff7-4c0f-8e07-933d51c8e668")
    public enum ISA_Type {
        RISC,
        CISC,
        VLIW,
        SIMD,
        other,
        undef;
    }

}
