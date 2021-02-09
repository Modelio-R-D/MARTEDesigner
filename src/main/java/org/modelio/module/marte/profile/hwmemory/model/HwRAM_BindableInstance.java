package org.modelio.module.marte.profile.hwmemory.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwRAM_BindableInstance extends HwMemory_BindableInstance {
    public HwRAM_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWRAM_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwRAM_BindableInstance"));
    }

    public HwRAM_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ORGANIZATION, this.element);
    }

    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ORGANIZATION, value);
    }

    public String getrepl_Policy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_REPL_POLICY, this.element);
    }

    public void setrepl_Policy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_REPL_POLICY, value);
    }

    public String getwritePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_WRITEPOLICY, this.element);
    }

    public void setwritePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_WRITEPOLICY, value);
    }

    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISSYNCHRONOUS, this.element);
    }

    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISSYNCHRONOUS,value);
    }

    public boolean isisStatic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISSTATIC, this.element);
    }

    public void isisStatic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISSTATIC,value);
    }

    public boolean isisNonVolatile() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISNONVOLATILE, this.element);
    }

    public void isisNonVolatile(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISNONVOLATILE,value);
    }

}
