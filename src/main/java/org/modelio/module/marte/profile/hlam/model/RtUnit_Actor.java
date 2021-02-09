package org.modelio.module.marte.profile.hlam.model;

import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class RtUnit_Actor {
    protected Actor element;

    public RtUnit_Actor() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createActor();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTUNIT_ACTOR);
        this.element.setName(MARTEResourceManager.getName("RtUnit_Actor"));
        this.isisDynamic(true);
    }

    public RtUnit_Actor(Actor element) {
        this.element = element;
    }

    public Actor getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public boolean isisDynamic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_ISDYNAMIC, this.element);
    }

    public void isisDynamic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_ISDYNAMIC,value);
    }

    public boolean isisMain() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_ISMAIN, this.element);
    }

    public void isisMain(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_ISMAIN,value);
    }

    public String getsrPoolSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLSIZE, this.element);
    }

    public void setsrPoolSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLSIZE, value);
    }

    public String getsrPoolPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLPOLICY, this.element);
    }

    public void setsrPoolPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLPOLICY, value);
    }

    public String getsrPoolWaitingTime() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLWAITINGTIME, this.element);
    }

    public void setsrPoolWaitingTime(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_SRPOOLWAITINGTIME, value);
    }

    public String getoperationalMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_OPERATIONALMODE, this.element);
    }

    public void setoperationalMode(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_OPERATIONALMODE, value);
    }

    public String getmain() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MAIN, this.element);
    }

    public void setmain(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MAIN, value);
    }

    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MEMORYSIZE, this.element);
    }

    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_ACTOR_RTUNIT_ACTOR_MEMORYSIZE, value);
    }

}
