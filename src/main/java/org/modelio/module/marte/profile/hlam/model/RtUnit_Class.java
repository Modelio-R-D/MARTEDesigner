package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4c8f93f7-2b43-4671-9947-24d209fb5abb")
public class RtUnit_Class {
    @objid ("cbad49e6-248c-4bd4-867f-e0785923754d")
    protected Class element;

    @objid ("d0e912c7-fb60-48d2-90f3-b178253ddcba")
    public RtUnit_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTUNIT_CLASS);
        this.element.setName(MARTEResourceManager.getName("RtUnit_Class"));
        this.isisDynamic(true);
    }

    @objid ("92e38a6f-065f-4219-8173-c79b4af63ddc")
    public RtUnit_Class(Class element) {
        this.element = element;
    }

    @objid ("67890efd-82f0-4bd8-a408-757253562bf1")
    public Class getElement() {
        return this.element;
    }

    @objid ("3eea65a0-ece4-4db3-ac4b-d305d26a2c23")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("fcf47ba1-4921-48cb-bbb1-0b126ab12f1f")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("4cab6c7e-be6c-4adc-9ab3-07dc91d295e7")
    public boolean isisDynamic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_ISDYNAMIC, this.element);
    }

    @objid ("40128642-afea-4169-892a-00dd402ee761")
    public void isisDynamic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_ISDYNAMIC,value);
    }

    @objid ("d3a887a4-0cfc-4605-ab94-d1f7eacffcad")
    public boolean isisMain() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_ISMAIN, this.element);
    }

    @objid ("9b6393d4-7b7b-445b-a1dc-e98494dcc209")
    public void isisMain(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_ISMAIN,value);
    }

    @objid ("ea021e59-a0aa-4d4c-a4e2-5eb315577a8d")
    public String getsrPoolSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_SRPOOLSIZE, this.element);
    }

    @objid ("b98199e6-d3ba-427d-840c-f63c584cd1c9")
    public void setsrPoolSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_SRPOOLSIZE, value);
    }

    @objid ("689cc411-cd24-4201-b76b-f985671d3e92")
    public String getsrPoolPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_SRPOOLPOLICY, this.element);
    }

    @objid ("7f6edfc8-c205-43f9-beea-a15ed04feb48")
    public void setsrPoolPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_SRPOOLPOLICY, value);
    }

    @objid ("88b5f8b8-272e-4d76-a8f7-63285633a1ba")
    public String getsrPoolWaitingTime() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_SRPOOLWAITINGTIME, this.element);
    }

    @objid ("047b748d-3eec-4745-b0fd-3037779c993d")
    public void setsrPoolWaitingTime(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_SRPOOLWAITINGTIME, value);
    }

    @objid ("20219fa1-26df-4b74-bd74-00faed7e2f74")
    public String getoperationalMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_OPERATIONALMODE, this.element);
    }

    @objid ("8b365b9d-7eb2-4a8c-99f7-104639f19b42")
    public void setoperationalMode(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_OPERATIONALMODE, value);
    }

    @objid ("0e790a09-477d-4868-b695-78747f6ae97b")
    public String getmain() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_MAIN, this.element);
    }

    @objid ("9260efac-644b-4e12-8141-8c425cfd169b")
    public void setmain(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_MAIN, value);
    }

    @objid ("2cda6f02-5984-4a0c-8d4f-b83ae1f4a097")
    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_MEMORYSIZE, this.element);
    }

    @objid ("82acd7ff-cb9c-42b2-811b-3e039d1f18e0")
    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_CLASS_RTUNIT_CLASS_MEMORYSIZE, value);
    }

}
