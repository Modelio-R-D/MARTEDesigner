package org.modelio.module.marte.profile.hwmemory.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwRAM_Node extends HwMemory_Node {
    public HwRAM_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWRAM_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWRAM_CLASSIFIER));
    }

    public HwRAM_Node(Node element) {
        super(element);
    }

    public boolean isisNonVolatile() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISNONVOLATILE, this.element);
    }

    public void isisNonVolatile(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISNONVOLATILE,value);
    }

    public boolean isisStatic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISSTATIC, this.element);
    }

    public void isisStatic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISSTATIC,value);
    }

    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISSYNCHRONOUS, this.element);
    }

    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISSYNCHRONOUS,value);
    }

    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ORGANIZATION, this.element);
    }

    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ORGANIZATION, value);
    }

    public String getrepl_Policy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_REPL_POLICY, this.element);
    }

    public void setrepl_Policy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_REPL_POLICY, value);
    }

    public String getwritePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_WRITEPOLICY, this.element);
    }

    public void setwritePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_WRITEPOLICY, value);
    }

    public enum Repl_Policy {
        LRU,
        NFU,
        FIFO,
        random,
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
