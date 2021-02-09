package org.modelio.module.marte.profile.hwmemory.model;

import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwCache_Class extends HwMemory_Class {
    public HwCache_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCACHE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCACHE_CLASSIFIER));
    }

    public HwCache_Class(Class element) {
        super(element);
    }

    public String getlevel() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_LEVEL, this.element);
    }

    public void setlevel(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_LEVEL, value);
    }

    public String getrepl_Policy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_REPL_POLICY, this.element);
    }

    public void setrepl_Policy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_REPL_POLICY, value);
    }

    public String getstructure() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_STRUCTURE, this.element);
    }

    public void setstructure(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_STRUCTURE, value);
    }

    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_TYPE, this.element);
    }

    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_TYPE, value);
    }

    public String getwritePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_WRITEPOLICY, this.element);
    }

    public void setwritePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_WRITEPOLICY, value);
    }

    public enum Repl_Policy {
        LRU,
        NFU,
        FIFO,
        random,
        other,
        undef;
    }

    public enum CacheType {
        data,
        instruction,
        unified,
        other,
        undef;
    }

    public enum WritePolicy {
        writeBack,
        writeThrough,
        other,
        undef;
    }

}
