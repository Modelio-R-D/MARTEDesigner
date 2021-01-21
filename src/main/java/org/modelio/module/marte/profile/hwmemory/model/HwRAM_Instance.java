package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("48eae9b8-58c3-4694-a9b6-fbdaafbd3847")
public class HwRAM_Instance extends HwMemory_Instance {
    @objid ("d8f7d3fb-8b99-4d97-8a5d-145926bfe188")
    public HwRAM_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWRAM_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwRAM_Instance"));
    }

    @objid ("e80e9482-ef61-42f7-b3ed-8d1fa974ba8a")
    public HwRAM_Instance(Instance element) {
        super(element);
    }

    @objid ("832f8623-9a5e-4e04-8a57-9425b8ab8c18")
    public boolean isisNonVolatile() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISNONVOLATILE, this.element);
    }

    @objid ("e77ae6a7-da4f-4be4-9055-e87ab7114379")
    public void isisNonVolatile(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISNONVOLATILE,value);
    }

    @objid ("ae2d4727-a21d-4a5c-aad2-f84a278f30ee")
    public boolean isisStatic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISSTATIC, this.element);
    }

    @objid ("ea33bdc3-6a04-459d-8832-069f6009973a")
    public void isisStatic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISSTATIC,value);
    }

    @objid ("fa44bd20-b10a-4147-83b1-1f54191b45b6")
    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISSYNCHRONOUS, this.element);
    }

    @objid ("c5d8e9e7-88fc-409a-b97e-9f12d6ee464f")
    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ISSYNCHRONOUS,value);
    }

    @objid ("5e094060-c029-4269-aafe-f22d4b1a7789")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ORGANIZATION, this.element);
    }

    @objid ("3742ba23-fc8a-498f-9f2b-41ec7a5482dc")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_ORGANIZATION, value);
    }

    @objid ("03833e9d-1533-4c2c-a6b9-a44ab71634d3")
    public String getrepl_Policy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_REPL_POLICY, this.element);
    }

    @objid ("55603ae5-d2c2-423a-a8f7-dd488f233f38")
    public void setrepl_Policy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_REPL_POLICY, value);
    }

    @objid ("ec3474d9-502d-4d7c-b297-264eff61e552")
    public String getwritePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_WRITEPOLICY, this.element);
    }

    @objid ("a19497dc-3f0b-4174-bd6e-af2bb1048928")
    public void setwritePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRAM_INSTANCE_HWRAM_INSTANCE_WRITEPOLICY, value);
    }

    @objid ("1c8b7c94-ef75-41a8-a072-853424d2bb8d")
    public enum Repl_Policy {
        LRU,
        NFU,
        FIFO,
        random,
        other,
        undef;
    }

    @objid ("e2d47ef4-66f7-4e5d-99bc-55c252086026")
    public enum WritePolicy {
        writeBack,
        writeThrough,
        other,
        undef;
    }

}
