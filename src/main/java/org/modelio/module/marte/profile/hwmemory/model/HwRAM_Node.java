package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d603c182-6c2e-4488-bf89-6716db0507d6")
public class HwRAM_Node extends HwMemory_Node {
    @objid ("e8a0f78d-2438-49ef-8322-a5213a23f0f6")
    public HwRAM_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWRAM_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWRAM_CLASSIFIER));
    }

    @objid ("2daa6c20-2713-4f70-aace-70524db2e230")
    public HwRAM_Node(Node element) {
        super(element);
    }

    @objid ("3ca18dba-8ecf-4e8d-b9d9-96de0997d331")
    public boolean isisNonVolatile() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISNONVOLATILE, this.element);
    }

    @objid ("8e6bed47-66c9-4d93-9591-aa4b140c5d3f")
    public void isisNonVolatile(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISNONVOLATILE,value);
    }

    @objid ("763c2cf5-dd38-4027-802c-ec07e298da7a")
    public boolean isisStatic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISSTATIC, this.element);
    }

    @objid ("305a2d2e-30b2-4a58-8650-2a60aac8fe92")
    public void isisStatic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISSTATIC,value);
    }

    @objid ("d8733402-b83d-49e2-b601-5317d6516c4b")
    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISSYNCHRONOUS, this.element);
    }

    @objid ("1a59fbb3-10ea-46a8-bae1-44a723d0fe5f")
    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISSYNCHRONOUS,value);
    }

    @objid ("048ab8a4-5051-420d-94ff-e73004c09db7")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ORGANIZATION, this.element);
    }

    @objid ("bc182378-d0be-490d-9e9e-48f9b09c5d89")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ORGANIZATION, value);
    }

    @objid ("bb8682b5-2101-4725-8d5a-e1344865505d")
    public String getrepl_Policy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_REPL_POLICY, this.element);
    }

    @objid ("8b0ac8b2-9982-4e7e-ab6f-614e5f4007fe")
    public void setrepl_Policy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_REPL_POLICY, value);
    }

    @objid ("90923194-9764-46ac-83db-fd197811643e")
    public String getwritePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_WRITEPOLICY, this.element);
    }

    @objid ("6ddae379-8337-41d1-aa26-be0f04621138")
    public void setwritePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_WRITEPOLICY, value);
    }

    @objid ("75eef94c-041c-4f2f-967b-23fbdf46f1cb")
    public enum Repl_Policy {
        LRU,
        NFU,
        FIFO,
        random,
        other,
        undef;
    }

    @objid ("908184c3-f37c-4f45-9fa9-1d410d574e5b")
    public enum WritePolicy {
        writeBack,
        writeThrough,
        other,
        undef;
    }

}
