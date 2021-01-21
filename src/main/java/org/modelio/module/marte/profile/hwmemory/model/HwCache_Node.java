package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b6c603e6-8f2c-499a-9683-0d8d30de32ce")
public class HwCache_Node extends HwMemory_Node {
    @objid ("9948264a-39bb-4426-af6f-025b02b457ba")
    public HwCache_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCACHE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCACHE_CLASSIFIER));
    }

    @objid ("109fbcba-f27f-4add-915a-a65646859db5")
    public HwCache_Node(Node element) {
        super(element);
    }

    @objid ("eb52e7ac-0a1f-4ded-b827-d88b6af2b980")
    public String getlevel() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_LEVEL, this.element);
    }

    @objid ("110fcfbd-1191-45df-8864-4cf0c92f1af8")
    public void setlevel(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_LEVEL, value);
    }

    @objid ("d36a3924-0bbd-41e9-ab77-367dac897ad4")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_TYPE, this.element);
    }

    @objid ("649d5c9e-6ac5-4269-b5ec-7462b1b18827")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_TYPE, value);
    }

    @objid ("e2941fec-9787-4557-9c65-777f38b2106b")
    public String getstructure() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_STRUCTURE, this.element);
    }

    @objid ("647b6b20-b0f8-4711-9822-6bd947f60a56")
    public void setstructure(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_STRUCTURE, value);
    }

    @objid ("347d9795-3874-460e-85af-6154bd9d7449")
    public String getrepl_Policy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_REPL_POLICY, this.element);
    }

    @objid ("fadd67e0-13d2-4bc1-9591-d4dfdd7c23fd")
    public void setrepl_Policy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_REPL_POLICY, value);
    }

    @objid ("92413965-68e5-433e-84e5-4a7b433bdb74")
    public String getwritePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_WRITEPOLICY, this.element);
    }

    @objid ("d52cc1fa-189c-4cac-9627-c50dfb17a31b")
    public void setwritePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_WRITEPOLICY, value);
    }

    @objid ("1f397921-9629-473a-8c37-27e53eb35f4a")
    public enum CacheType {
        data,
        instruction,
        unified,
        other,
        undef;
    }

    @objid ("69469cd8-52de-4023-b57d-de94b8c97c40")
    public enum Repl_Policy {
        LRU,
        NFU,
        FIFO,
        random,
        other,
        undef;
    }

    @objid ("5dade8e5-db40-4cac-bd7f-57425dcfd973")
    public enum WritePolicy {
        writeBack,
        writeThrough,
        other,
        undef;
    }

}
