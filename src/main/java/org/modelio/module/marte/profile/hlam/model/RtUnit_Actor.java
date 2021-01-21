package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3146c98a-c033-4885-9322-abc3716a3425")
public class RtUnit_Actor {
    @objid ("2e673d9b-eca0-475a-aeb0-4bd92cdbbaeb")
    protected Actor element;

    @objid ("eeae075a-e0df-4413-ab82-c1579c2b983c")
    public RtUnit_Actor() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createActor();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTUNIT_ACTOR);
        this.element.setName(MARTEResourceManager.getName("RtUnit_Actor"));
        this.isisDynamic(true);
    }

    @objid ("49f7f2fa-9ab0-4f77-8cbd-d9ccbd60628d")
    public RtUnit_Actor(Actor element) {
        this.element = element;
    }

    @objid ("0ad03f78-d986-4081-be13-f83b0f05b3f3")
    public Actor getElement() {
        return this.element;
    }

    @objid ("ba799277-ca3a-4e0c-bb02-c0f854c9a639")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("082869af-5107-4151-9672-ebe3f540b43f")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("99aca1ae-2e11-4227-812d-064b9282dc26")
    public boolean isisDynamic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_ISDYNAMIC, this.element);
    }

    @objid ("49ca7549-046e-4e43-9ca3-e5482b27aef7")
    public void isisDynamic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_ISDYNAMIC,value);
    }

    @objid ("9529791b-fbe9-4c42-aeec-2e5a2825946f")
    public boolean isisMain() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_ISMAIN, this.element);
    }

    @objid ("6e00159b-cb2f-4b04-b372-e58fac70cf63")
    public void isisMain(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_ISMAIN,value);
    }

    @objid ("259ce59b-3b75-4378-be3c-426476e05bdf")
    public String getsrPoolSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLSIZE, this.element);
    }

    @objid ("da6b2dbe-30f5-4a43-82f4-4c1594bf14c6")
    public void setsrPoolSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLSIZE, value);
    }

    @objid ("5b96164d-ec3d-44ec-adf3-1219ea4e127d")
    public String getsrPoolPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLPOLICY, this.element);
    }

    @objid ("7b4b2c57-bce1-48fd-8198-634e356f96bb")
    public void setsrPoolPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLPOLICY, value);
    }

    @objid ("aee316da-8756-4c11-917c-af9b035d0cae")
    public String getsrPoolWaitingTime() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLWAITINGTIME, this.element);
    }

    @objid ("dcab9956-d883-4b1f-8e30-16b6d891f310")
    public void setsrPoolWaitingTime(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLWAITINGTIME, value);
    }

    @objid ("4619b522-f3d1-49cc-8612-753f8c55e868")
    public String getoperationalMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_OPERATIONALMODE, this.element);
    }

    @objid ("a35ca0cf-d54e-4767-aa70-6578804c947b")
    public void setoperationalMode(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_OPERATIONALMODE, value);
    }

    @objid ("441916af-a47f-4b2a-9e35-a507cb508784")
    public String getmain() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MAIN, this.element);
    }

    @objid ("cb2f5b28-bb64-49df-890a-ab1c9f575bdf")
    public void setmain(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MAIN, value);
    }

    @objid ("d039a289-dc76-42f5-bae9-0269cd8e0d17")
    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MEMORYSIZE, this.element);
    }

    @objid ("3d42f6a5-446d-412a-b49f-e8f05eef7f36")
    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MEMORYSIZE, value);
    }

}
