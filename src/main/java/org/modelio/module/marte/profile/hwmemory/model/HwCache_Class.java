package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("891b3375-751e-47f7-a5a2-61ccbc40047e")
public class HwCache_Class extends HwMemory_Class {
    @objid ("20d080e6-d422-4e25-9eca-c75620d7b043")
    public HwCache_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCACHE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCACHE_CLASSIFIER));
    }

    @objid ("f5b31e70-f661-40ef-90f6-37e13fd02bfc")
    public HwCache_Class(Class element) {
        super(element);
    }

    @objid ("e6d1ecb2-daa9-4428-a7c6-8ead4bded9b4")
    public String getlevel() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_LEVEL, this.element);
    }

    @objid ("e434f9f5-f311-4e27-bc1f-ad8748f4d78e")
    public void setlevel(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_LEVEL, value);
    }

    @objid ("eebad015-95f7-4c27-a655-597ac72eef97")
    public String getrepl_Policy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_REPL_POLICY, this.element);
    }

    @objid ("0f16a59e-5fe2-46e0-8813-48085f6824b2")
    public void setrepl_Policy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_REPL_POLICY, value);
    }

    @objid ("c892b92b-4a8d-44e8-aaf2-433871e461c6")
    public String getstructure() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_STRUCTURE, this.element);
    }

    @objid ("d571fe81-3dbc-420a-b88a-e3502ac2b564")
    public void setstructure(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_STRUCTURE, value);
    }

    @objid ("05cc8278-86c3-4404-be6e-9b1d7bd040b6")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_TYPE, this.element);
    }

    @objid ("aa76159f-93dd-4bf0-85fb-2da62bc683f9")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_TYPE, value);
    }

    @objid ("fb30161a-df96-4d7d-a924-0ab0a30b4361")
    public String getwritePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_WRITEPOLICY, this.element);
    }

    @objid ("281dad3d-5a9f-410b-996e-5b374c37c3a0")
    public void setwritePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_WRITEPOLICY, value);
    }

    @objid ("a5f24efc-ce6d-4cad-bf91-3ffc62ee0da1")
    public enum Repl_Policy {
        LRU,
        NFU,
        FIFO,
        random,
        other,
        undef;
    }

    @objid ("d20c68a2-464e-41b6-9afe-4da3d150a1db")
    public enum CacheType {
        data,
        instruction,
        unified,
        other,
        undef;
    }

    @objid ("05ba6d24-5867-406e-aff7-8c0075ff0633")
    public enum WritePolicy {
        writeBack,
        writeThrough,
        other,
        undef;
    }

}
