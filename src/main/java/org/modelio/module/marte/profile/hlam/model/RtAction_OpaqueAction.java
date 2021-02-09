package org.modelio.module.marte.profile.hlam.model;

import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class RtAction_OpaqueAction {
    protected OpaqueAction element;

    public RtAction_OpaqueAction() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOpaqueAction();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTACTION_OPAQUEACTION);
        this.element.setName(MARTEResourceManager.getName("RtAction_OpaqueAction"));
    }

    public RtAction_OpaqueAction(OpaqueAction element) {
        this.element = element;
    }

    public OpaqueAction getElement() {
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

    public String getRtAction_OpaqueAction_isAtomic() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_ISATOMIC, this.element);
    }

    public void setRtAction_OpaqueAction_isAtomic(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_ISATOMIC, value);
    }

    public String getRtAction_OpaqueAction_synchKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_SYNCHKIND, this.element);
    }

    public void setRtAction_OpaqueAction_synchKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_SYNCHKIND, value);
    }

    public String getRtAction_OpaqueAction_msgSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_MSGSIZE, this.element);
    }

    public void setRtAction_OpaqueAction_msgSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_MSGSIZE, value);
    }

}
