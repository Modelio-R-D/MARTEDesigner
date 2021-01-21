package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5c848524-1a41-4c3a-9b54-240c4fd211e7")
public class HwISA_BindableInstance extends HwResource_BindableInstance {
    @objid ("c9ad6272-ce21-4bce-99b6-7d8c312bf936")
    public HwISA_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWISA_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwISA_BindableInstance"));
    }

    @objid ("bd54879b-526e-4774-9815-d5e6df269678")
    public HwISA_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("94d77c74-830a-449b-a3c2-34f46dd665f6")
    public String getfamily() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_INSTANCE_HWISA_INSTANCE_FAMILY, this.element);
    }

    @objid ("235f3960-8035-47e0-a9f3-00f74ddeae4b")
    public void setfamily(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_INSTANCE_HWISA_INSTANCE_FAMILY, value);
    }

    @objid ("ddffd4c9-aaa3-4c42-9243-a39adba584b7")
    public String getinst_Width() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_INSTANCE_HWISA_INSTANCE_INST_WIDTH, this.element);
    }

    @objid ("2976fd4a-39d8-4971-b41b-879a5d84d1aa")
    public void setinst_Width(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_INSTANCE_HWISA_INSTANCE_INST_WIDTH, value);
    }

    @objid ("31c8f046-48dc-4e04-8260-09a6cdf3dd19")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_INSTANCE_HWISA_INSTANCE_TYPE, this.element);
    }

    @objid ("e36092ef-5891-4393-83c1-28cea060c703")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_INSTANCE_HWISA_INSTANCE_TYPE, value);
    }

}
