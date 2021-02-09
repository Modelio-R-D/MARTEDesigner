package org.modelio.module.marte.profile.hlam.model;

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

public class RtUnit_Collaboration {
    protected Collaboration element;

    public RtUnit_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTUNIT_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("RtUnit_Collaboration"));
        this.isisDynamic(true);
    }

    public RtUnit_Collaboration(Collaboration element) {
        this.element = element;
    }

    public void setParent(final Behavior source) {
        this.element.setBRepresented(source);
    }

    public Collaboration getElement() {
        return this.element;
    }

    public boolean isisDynamic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_ISDYNAMIC, this.element);
    }

    public void isisDynamic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_ISDYNAMIC,value);
    }

    public boolean isisMain() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_ISMAIN, this.element);
    }

    public void isisMain(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_ISMAIN,value);
    }

    public String getsrPoolSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLSIZE, this.element);
    }

    public void setsrPoolSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLSIZE, value);
    }

    public String getsrPoolPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLPOLICY, this.element);
    }

    public void setsrPoolPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLPOLICY, value);
    }

    public String getsrPoolWaitingTime() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLWAITINGTIME, this.element);
    }

    public void setsrPoolWaitingTime(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_SRPOOLWAITINGTIME, value);
    }

    public String getoperationalMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_OPERATIONALMODE, this.element);
    }

    public void setoperationalMode(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_OPERATIONALMODE, value);
    }

    public String getmain() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MAIN, this.element);
    }

    public void setmain(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MAIN, value);
    }

    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MEMORYSIZE, this.element);
    }

    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_COLLABORATION_RTUNIT_COLLABORATION_MEMORYSIZE, value);
    }

    public void setParent(final Operation source) {
        this.element.setORepresented(source);
    }

    public void setParent(final ModelTree source) {
        this.element.setOwner(source);
    }

    public void setParent(final TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
