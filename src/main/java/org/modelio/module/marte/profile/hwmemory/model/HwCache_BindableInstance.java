package org.modelio.module.marte.profile.hwmemory.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwCache_BindableInstance extends HwMemory_BindableInstance {
    public HwCache_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCACHE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwCache_BindableInstance"));
    }

    public HwCache_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String getlevel() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_LEVEL, this.element);
    }

    public void setlevel(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_LEVEL, value);
    }

    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_TYPE, this.element);
    }

    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_TYPE, value);
    }

    public String getstructure() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_STRUCTURE, this.element);
    }

    public void setstructure(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_STRUCTURE, value);
    }

    public String getrepl_Policy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_REPL_POLICY, this.element);
    }

    public void setrepl_Policy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_REPL_POLICY, value);
    }

    public String getwritePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_WRITEPOLICY, this.element);
    }

    public void setwritePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_WRITEPOLICY, value);
    }

}
