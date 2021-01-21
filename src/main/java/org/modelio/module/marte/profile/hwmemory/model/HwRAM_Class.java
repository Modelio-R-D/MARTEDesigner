package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c8a13439-0770-4bc0-b15a-d51e3f578180")
public class HwRAM_Class extends HwMemory_Class {
    @objid ("318ee70e-dcca-4d52-b2a0-05d2fdd0c202")
    public HwRAM_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWRAM_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWRAM_CLASSIFIER));
    }

    @objid ("c95fae3b-7fdd-4831-830e-29740ceedf17")
    public HwRAM_Class(Class element) {
        super(element);
    }

    @objid ("19afa226-4de2-4ab1-a9be-f5aac0f3c426")
    public boolean isisNonVolatile() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISNONVOLATILE, this.element);
    }

    @objid ("9a4fcadb-1762-43d7-be51-0b9860b789b2")
    public void isisNonVolatile(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISNONVOLATILE,value);
    }

    @objid ("7431ef50-1597-4261-af7f-0ac8f2468103")
    public boolean isisStatic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISSTATIC, this.element);
    }

    @objid ("4aa272c5-ec31-4318-971f-3dedff782b41")
    public void isisStatic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISSTATIC,value);
    }

    @objid ("30f6b689-a7bd-4677-ad87-3b32f216b6be")
    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISSYNCHRONOUS, this.element);
    }

    @objid ("aef07c34-3bba-4c1b-9aa6-836069ae0584")
    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ISSYNCHRONOUS,value);
    }

    @objid ("45ad3738-2cb7-4f87-87bf-86529e3364c8")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ORGANIZATION, this.element);
    }

    @objid ("a09cab87-72fd-454a-9186-56b8ecb16286")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_ORGANIZATION, value);
    }

    @objid ("ea0fbe1b-bb55-442a-be6a-2e09ca849830")
    public String getrepl_Policy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_REPL_POLICY, this.element);
    }

    @objid ("373d2f12-02ee-44e4-8870-703e615a9ab7")
    public void setrepl_Policy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_REPL_POLICY, value);
    }

    @objid ("7c96f21a-c229-4fac-8b52-ac45c17a8822")
    public String getwritePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_WRITEPOLICY, this.element);
    }

    @objid ("7253d9e2-e640-464d-b554-04d7be0cb0f6")
    public void setwritePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_CLASSIFIER_HWRAM_CLASSIFIER_WRITEPOLICY, value);
    }

    @objid ("54aa0602-f274-4855-a70e-d15937651ee8")
    public enum Repl_Policy {
        LRU,
        NFU,
        FIFO,
        random,
        other,
        undef;
    }

    @objid ("49e21c95-f34c-4b84-8973-6eb6f32c26a8")
    public enum WritePolicy {
        writeBack,
        writeThrough,
        other,
        undef;
    }

}
