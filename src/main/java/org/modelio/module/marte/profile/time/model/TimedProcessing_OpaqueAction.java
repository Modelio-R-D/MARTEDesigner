package org.modelio.module.marte.profile.time.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6181cb75-84d4-4495-ab01-271f92f2e289")
public class TimedProcessing_OpaqueAction {
    @objid ("56fb3fc0-121e-4182-a5ec-ad5afa691f41")
    protected OpaqueAction element;

    @objid ("4561b658-c872-4aea-93e0-23f28b8fef39")
    public TimedProcessing_OpaqueAction() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOpaqueAction();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMEDPROCESSING_ACTIVITYACTION);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.TIMEDPROCESSING_ACTIVITYACTION)+ModelUtils.getNbElement(ActivityAction.class, MARTEDesignerStereotypes.TIMEDPROCESSING_ACTIVITYACTION));
    }

    @objid ("b8b882cc-d599-469e-a16a-bfce334cae53")
    public TimedProcessing_OpaqueAction(OpaqueAction element) {
        this.element = element;
    }

    @objid ("56e6f7df-7b2e-441b-bff4-a477df23e888")
    public ActivityAction getElement() {
        return this.element;
    }

    @objid ("a4fbedda-1da0-4681-aa43-c4f378e9e2d9")
    public void setParent(Activity parent) {
        this.element.setOwner(parent);
    }

    @objid ("d3fda53d-7eac-45a3-a7e4-30031743c927")
    public void setParent(Clause parent) {
        this.element.setOwnerClause(parent);
    }

    @objid ("6c8b0974-faba-427f-b901-622f9e6d8d06")
    public void setParent(StructuredActivityNode parent) {
        this.element.setOwnerNode(parent);
    }

    @objid ("b4c7bb61-37ac-4f2b-94cc-362be4fdf7f6")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("f4c14b34-4444-4fc1-ac0c-4d1f49cce2ba")
    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_DURATION, this.element);
    }

    @objid ("c89817e4-7b75-48e0-b8ef-db49b0b0a751")
    public void setduration(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_DURATION, value);
    }

    @objid ("1e7940b6-d19f-4dad-aba5-68e193b5a497")
    public String getfinish() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_FINISH, this.element);
    }

    @objid ("ba78f428-b212-4adc-bd4a-114dff432e77")
    public void setfinish(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_FINISH, value);
    }

    @objid ("a5183a32-8303-4d46-a15e-6ce026aadc36")
    public String getstart() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_START, this.element);
    }

    @objid ("4d2e6990-3d64-498f-8aa8-73d0832fee6a")
    public void setstart(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_START, value);
    }

}
