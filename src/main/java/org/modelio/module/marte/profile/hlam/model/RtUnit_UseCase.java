package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("85ddc572-ae29-4cd8-ad8b-304b4cf85c68")
public class RtUnit_UseCase {
    @objid ("233b89bd-b91b-4409-a9a2-50a9bca34418")
    protected UseCase element;

    @objid ("a3113d5b-aee7-478b-b6fa-68e68ba86d08")
    public RtUnit_UseCase() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createUseCase();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTUNIT_USECASE);
        this.element.setName(MARTEResourceManager.getName("RtUnit_UseCase"));
        this.isisDynamic(true);
    }

    @objid ("a66adbe8-7de4-4411-921a-f7e340d2c1b7")
    public RtUnit_UseCase(UseCase element) {
        this.element = element;
    }

    @objid ("f939544d-2c88-4e69-85dd-9c368384de11")
    public UseCase getElement() {
        return this.element;
    }

    @objid ("a585e189-5258-45d4-b513-904b123ccd7e")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("d4a5989e-643e-4004-97d9-53ddc19ad6b2")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("ce7c6672-fb49-4c18-bb62-30f7a5351dec")
    public boolean isisDynamic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_ISDYNAMIC, this.element);
    }

    @objid ("922aeb21-2c5c-4731-a9c9-550ab43510fa")
    public void isisDynamic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_ISDYNAMIC,value);
    }

    @objid ("fe85e181-9259-44b6-a858-06ccc882cc65")
    public boolean isisMain() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_ISMAIN, this.element);
    }

    @objid ("cfb0a14a-d46d-47a9-9126-ecf633a3e4cd")
    public void isisMain(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_ISMAIN,value);
    }

    @objid ("6358d835-dc96-4325-8547-27ee8aaafa8a")
    public String getsrPoolSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_SRPOOLSIZE, this.element);
    }

    @objid ("43f4e5a0-9f7e-45e1-9375-3d76d06f28a9")
    public void setsrPoolSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_SRPOOLSIZE, value);
    }

    @objid ("d9fb6eb4-8d6c-4cc1-9239-071c50184cac")
    public String getsrPoolPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_SRPOOLPOLICY, this.element);
    }

    @objid ("1d7dfac1-d7a3-4345-a0b4-b28a3f738228")
    public void setsrPoolPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_SRPOOLPOLICY, value);
    }

    @objid ("c3978974-be5c-4f1f-b166-187b952ad085")
    public String getsrPoolWaitingTime() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_SRPOOLWAITINGTIME, this.element);
    }

    @objid ("0dbdaa6b-0ada-408a-b3de-cc107ac17309")
    public void setsrPoolWaitingTime(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_SRPOOLWAITINGTIME, value);
    }

    @objid ("e16b53f1-7b26-43e1-ae3f-a62ea3d966c4")
    public String getoperationalMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_OPERATIONALMODE, this.element);
    }

    @objid ("586918d2-8240-4391-b2bd-bae8b204e7da")
    public void setoperationalMode(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_OPERATIONALMODE, value);
    }

    @objid ("6c88a3ab-14e1-403b-8e16-cf072c81d059")
    public String getmain() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_MAIN, this.element);
    }

    @objid ("f47e539a-e12e-4d8b-b277-297e49538eb8")
    public void setmain(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_MAIN, value);
    }

    @objid ("8ef54e17-0820-41b1-8f29-4f50449a1151")
    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_MEMORYSIZE, this.element);
    }

    @objid ("74dd0b4f-0620-4b58-bc58-ae70ff48aaa9")
    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTUNIT_USECASE_RTUNIT_USECASE_MEMORYSIZE, value);
    }

}
