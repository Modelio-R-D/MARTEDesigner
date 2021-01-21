package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5e82d98f-0051-471f-bcb5-12bf67e1aa3e")
public class RtAction_SendSignalAction {
    @objid ("27b2c1c8-a30a-4442-97e2-1eca0a23b8af")
    protected SendSignalAction element;

    @objid ("09a0ac3c-772d-4063-baaa-4023cdd5448f")
    public RtAction_SendSignalAction() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createSendSignalAction();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTACTION_SENDSIGNALACTION);
        this.element.setName(MARTEResourceManager.getName("RtAction_SendSignalAction"));
    }

    @objid ("677cd163-416e-497a-aa9c-c00828b9c8a5")
    public RtAction_SendSignalAction(SendSignalAction element) {
        this.element = element;
    }

    @objid ("230ddb25-f990-46b1-99e3-98086dbca69e")
    public SendSignalAction getElement() {
        return this.element;
    }

    @objid ("08088ec0-ddc1-40de-9909-0b60d5f9f6b3")
    public void setParent(Activity parent) {
        this.element.setOwner(parent);
    }

    @objid ("19c33bea-94fe-49a3-8026-24fce6642454")
    public void setParent(Clause parent) {
        this.element.setOwnerClause(parent);
    }

    @objid ("3d21116c-d89c-44c7-9af1-55520ffef435")
    public void setParent(StructuredActivityNode parent) {
        this.element.setOwnerNode(parent);
    }

    @objid ("a37a3e10-f3c7-4a32-a3c3-bab74db5aff5")
    public void setParent(ActivityPartition parent) {
        this.element.setOwnerPartition(parent);
    }

    @objid ("3d3c30a0-a051-4023-83ad-5c0b54163ea4")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("694d3ca3-7c38-48d6-9442-a47493ea4f2f")
    public String getRtAction_SendSignalAction_isAtomic() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_ISATOMIC, this.element);
    }

    @objid ("6ff0afa4-7359-4d52-b77e-5ec8420bc336")
    public void setRtAction_SendSignalAction_isAtomic(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_ISATOMIC, value);
    }

    @objid ("cf566d70-7ead-4c85-a546-1b6bd08293e4")
    public String getRtAction_SendSignalAction_synchKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_SYNCHKIND, this.element);
    }

    @objid ("324fa42c-4e0d-470a-8fb6-65f866be85b2")
    public void setRtAction_SendSignalAction_synchKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_SYNCHKIND, value);
    }

    @objid ("2feeb274-d354-479e-bd51-9a6439258320")
    public String getRtAction_SendSignalAction_msgSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_MSGSIZE, this.element);
    }

    @objid ("1057bce3-b3cd-406f-a41e-048f4172abe8")
    public void setRtAction_SendSignalAction_msgSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_MSGSIZE, value);
    }

}
