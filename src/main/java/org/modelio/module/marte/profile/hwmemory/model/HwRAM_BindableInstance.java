package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("68b3be01-4075-4b87-b9bd-29dc29edd3c6")
public class HwRAM_BindableInstance extends HwMemory_BindableInstance {
    @objid ("894baf72-07c2-453b-a6e9-accd050b671d")
    public HwRAM_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWRAM_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwRAM_BindableInstance"));
    }

    @objid ("de1a6cda-3d4e-43f7-b3cc-caa99052d776")
    public HwRAM_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("35346784-0180-416e-8408-307a85198202")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ORGANIZATION, this.element);
    }

    @objid ("d3cc5419-a413-43fb-8ca9-60d755d71444")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ORGANIZATION, value);
    }

    @objid ("0d19f499-e332-4e16-8d81-82aaaca00796")
    public String getrepl_Policy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_REPL_POLICY, this.element);
    }

    @objid ("3dd8ba08-1ae0-4aeb-85a4-705fb5cc220d")
    public void setrepl_Policy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_REPL_POLICY, value);
    }

    @objid ("82d0139a-e142-48c4-9d19-418f0b020207")
    public String getwritePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_WRITEPOLICY, this.element);
    }

    @objid ("7276cf9d-5225-4709-b81f-31a7b3be2360")
    public void setwritePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_WRITEPOLICY, value);
    }

    @objid ("b05c0404-d680-4d04-a1e3-72996581ac7c")
    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISSYNCHRONOUS, this.element);
    }

    @objid ("42db710c-8064-439a-b31d-ad09b46be20e")
    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISSYNCHRONOUS,value);
    }

    @objid ("688d1d63-20f2-40c8-8b30-61e4a8019ec5")
    public boolean isisStatic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISSTATIC, this.element);
    }

    @objid ("c942b1fa-8bea-45cb-95c5-d154cca414a1")
    public void isisStatic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISSTATIC,value);
    }

    @objid ("ae377459-7802-4609-8d0f-2033f2962e66")
    public boolean isisNonVolatile() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISNONVOLATILE, this.element);
    }

    @objid ("c1749207-a46b-48c5-8a20-f4b29d5fcc18")
    public void isisNonVolatile(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISNONVOLATILE,value);
    }

}
