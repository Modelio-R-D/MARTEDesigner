package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("437d2e9f-f46c-479f-b189-097a4aeedda0")
public class RtUnit_Collaboration {
    @objid ("fd4fd8ae-6559-498f-a1a2-fcc9b231c43f")
    protected Collaboration element;

    @objid ("0bfbbd88-68c8-4fe6-8021-9989b1ca31d8")
    public RtUnit_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTUNIT_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("RtUnit_Collaboration"));
        this.isisDynamic(true);
    }

    @objid ("d10778f9-1757-46f2-9aed-10b28009bad6")
    public RtUnit_Collaboration(Collaboration element) {
        this.element = element;
    }

    @objid ("46aa6dd4-d00b-40b5-a628-10d7dd44a0af")
    public void setParent(final Behavior source) {
        this.element.setBRepresented(source);
    }

    @objid ("00d21488-39a5-489c-9483-f660c7715eb9")
    public Collaboration getElement() {
        return this.element;
    }

    @objid ("3e98edde-170c-438e-82c1-3747916cd60b")
    public boolean isisDynamic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_ISDYNAMIC, this.element);
    }

    @objid ("1494b42d-df74-49ff-b2da-0b56ef017def")
    public void isisDynamic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_ISDYNAMIC,value);
    }

    @objid ("847cd03a-066e-4c88-b42d-8133ccc08887")
    public boolean isisMain() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_ISMAIN, this.element);
    }

    @objid ("f49fd6ee-d79d-41c4-b352-dfec5fd4e10e")
    public void isisMain(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_ISMAIN,value);
    }

    @objid ("dd32f105-8385-4615-86af-ad8a360c8cfb")
    public String getsrPoolSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLSIZE, this.element);
    }

    @objid ("b5ad8cad-0406-4402-9ec0-99e9d1112c31")
    public void setsrPoolSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLSIZE, value);
    }

    @objid ("40a4a926-317e-4d36-b28e-04c25a198a6b")
    public String getsrPoolPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLPOLICY, this.element);
    }

    @objid ("1af1c6b9-099d-4c2d-a653-cf67f537241e")
    public void setsrPoolPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLPOLICY, value);
    }

    @objid ("5733383a-0c9f-4d36-aacb-58cb5d51e6b5")
    public String getsrPoolWaitingTime() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLWAITINGTIME, this.element);
    }

    @objid ("431322df-d2e3-4601-8917-f41fc3a3bdb6")
    public void setsrPoolWaitingTime(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLWAITINGTIME, value);
    }

    @objid ("157988ec-a5f3-4ff8-b6da-94e397f7edb2")
    public String getoperationalMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_OPERATIONALMODE, this.element);
    }

    @objid ("9d56e33d-17c2-4195-b4db-cd516c34e969")
    public void setoperationalMode(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_OPERATIONALMODE, value);
    }

    @objid ("ebf0a812-0052-4d4e-8e0a-9bdc3eee5579")
    public String getmain() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MAIN, this.element);
    }

    @objid ("8d23d3bf-35f1-4bf2-a510-67729494a5ea")
    public void setmain(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MAIN, value);
    }

    @objid ("e12ba850-2dcd-49da-ac60-353f9385c41b")
    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MEMORYSIZE, this.element);
    }

    @objid ("d209c8b6-0b0f-4e34-bb1f-f3e0096d34d5")
    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MEMORYSIZE, value);
    }

    @objid ("2a2e4aaf-04d2-46d5-8a09-59e70dcc6d3b")
    public void setParent(final Operation source) {
        this.element.setORepresented(source);
    }

    @objid ("2b2ce14a-c4e3-4790-8e2a-f20e483eccdb")
    public void setParent(final ModelTree source) {
        this.element.setOwner(source);
    }

    @objid ("18566101-da49-416c-a262-d9282a114904")
    public void setParent(final TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
