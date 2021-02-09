package org.modelio.module.marte.profile.hlam.model;

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

public class RtAction_SendSignalAction {
    protected SendSignalAction element;

    public RtAction_SendSignalAction() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createSendSignalAction();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTACTION_SENDSIGNALACTION);
        this.element.setName(MARTEResourceManager.getName("RtAction_SendSignalAction"));
    }

    public RtAction_SendSignalAction(SendSignalAction element) {
        this.element = element;
    }

    public SendSignalAction getElement() {
        return this.element;
    }

    public void setParent(Activity parent) {
        this.element.setOwner(parent);
    }

    public void setParent(Clause parent) {
        this.element.setOwnerClause(parent);
    }

    public void setParent(StructuredActivityNode parent) {
        this.element.setOwnerNode(parent);
    }

    public void setParent(ActivityPartition parent) {
        this.element.setOwnerPartition(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getRtAction_SendSignalAction_isAtomic() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_ISATOMIC, this.element);
    }

    public void setRtAction_SendSignalAction_isAtomic(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_ISATOMIC, value);
    }

    public String getRtAction_SendSignalAction_synchKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_SYNCHKIND, this.element);
    }

    public void setRtAction_SendSignalAction_synchKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_SYNCHKIND, value);
    }

    public String getRtAction_SendSignalAction_msgSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_MSGSIZE, this.element);
    }

    public void setRtAction_SendSignalAction_msgSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_SENDSIGNALACTION_RTACTION_SENDSIGNALACTION_MSGSIZE, value);
    }

}
