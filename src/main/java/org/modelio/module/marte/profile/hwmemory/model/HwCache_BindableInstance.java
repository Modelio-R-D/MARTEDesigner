package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c68b6a6f-0fa0-4154-a528-4800b19b4f41")
public class HwCache_BindableInstance extends HwMemory_BindableInstance {
    @objid ("9909b142-ab30-4491-ade9-ed1d5d85fd6f")
    public HwCache_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCACHE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwCache_BindableInstance"));
    }

    @objid ("49675d25-69b6-446a-b530-497c4327c2f5")
    public HwCache_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("5c7aba46-4aa0-4152-9a1f-9acfca9aea50")
    public String getlevel() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_LEVEL, this.element);
    }

    @objid ("6b330835-4752-405a-8399-e49ca575ee08")
    public void setlevel(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_LEVEL, value);
    }

    @objid ("acd7b1fb-6170-420d-b14f-fb8db7052109")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_TYPE, this.element);
    }

    @objid ("70547b03-c4c5-4dd0-bae9-2fcb472b8341")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_TYPE, value);
    }

    @objid ("3e07e17d-4abc-474d-867e-2300ef26afd2")
    public String getstructure() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_STRUCTURE, this.element);
    }

    @objid ("1057af70-df26-4cf1-b113-cde2147387cb")
    public void setstructure(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_STRUCTURE, value);
    }

    @objid ("f30c5b49-b7f5-46f8-9320-9ab30c2582e0")
    public String getrepl_Policy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_REPL_POLICY, this.element);
    }

    @objid ("2d97ce86-2d4e-4384-8334-6c37887104c0")
    public void setrepl_Policy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_REPL_POLICY, value);
    }

    @objid ("edce6dd1-6a8f-42a0-b97f-a2c830809830")
    public String getwritePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_WRITEPOLICY, this.element);
    }

    @objid ("7adc3f48-f9ba-4d30-92f3-5440de86adab")
    public void setwritePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_WRITEPOLICY, value);
    }

}
