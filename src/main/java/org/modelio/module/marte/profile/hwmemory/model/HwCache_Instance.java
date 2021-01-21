package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a489f3b4-f385-42f3-a6c8-2c5c789e9c85")
public class HwCache_Instance extends HwMemory_Instance {
    @objid ("d3e7d613-fb7d-4e6d-b6dd-8380a0fd8f02")
    public HwCache_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCACHE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwCache_Instance"));
    }

    @objid ("b145c5d0-8aaf-4956-a7eb-2e874a3845f9")
    public HwCache_Instance(Instance element) {
        super(element);
    }

    @objid ("51d50058-1336-409e-a399-5061777e66ee")
    public String getlevel() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_LEVEL, this.element);
    }

    @objid ("8fe0396e-ad2a-4131-aa0f-481ddcbe6337")
    public void setlevel(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_LEVEL, value);
    }

    @objid ("f179f963-510d-4724-9928-2a2e26bf090a")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_TYPE, this.element);
    }

    @objid ("f9c27c54-1f7e-4d92-9b31-53a099677600")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_TYPE, value);
    }

    @objid ("7a0c1d86-6b6d-4279-8d75-cc8c1c3c2791")
    public String getstructure() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_STRUCTURE, this.element);
    }

    @objid ("0302471c-6e58-4156-88fa-13e55869933e")
    public void setstructure(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_STRUCTURE, value);
    }

    @objid ("7c21e758-e44c-4930-b2f0-80d3db50d46b")
    public String getrepl_Policy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_REPL_POLICY, this.element);
    }

    @objid ("c68a226e-8888-4566-acae-295817b61e20")
    public void setrepl_Policy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_REPL_POLICY, value);
    }

    @objid ("ec15e0b0-8b6d-43b3-97b3-c36f001e9fc3")
    public String getwritePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_WRITEPOLICY, this.element);
    }

    @objid ("0444bd8b-68ae-4e11-8714-d7394b01ecdf")
    public void setwritePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_WRITEPOLICY, value);
    }

    @objid ("e75c6ebe-9519-49ce-8c12-346fb6beab38")
    public enum CacheType {
        data,
        instruction,
        unified,
        other,
        undef;
    }

    @objid ("70d21fc6-cee7-496d-be49-09328b1ae291")
    public enum Repl_Policy {
        LRU,
        NFU,
        FIFO,
        random,
        other,
        undef;
    }

    @objid ("2ce614f6-310b-4658-a335-9b8b156fdabe")
    public enum WritePolicy {
        writeBack,
        writeThrough,
        other,
        undef;
    }

}
