package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("47695469-aa05-4143-9ea5-e3b5a304a380")
public class RtAction_OpaqueAction {
    @objid ("06362687-67f0-45b9-ab90-61459c2f6854")
    protected OpaqueAction element;

    @objid ("5edfe7d3-8637-4719-b491-25fb852dc15f")
    public RtAction_OpaqueAction() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOpaqueAction();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTACTION_OPAQUEACTION);
        this.element.setName(MARTEResourceManager.getName("RtAction_OpaqueAction"));
    }

    @objid ("748332c9-e453-4189-8d04-4c22999ed9fc")
    public RtAction_OpaqueAction(OpaqueAction element) {
        this.element = element;
    }

    @objid ("9ff8f709-23c5-4fb4-a844-cda7aee8c14d")
    public OpaqueAction getElement() {
        return this.element;
    }

    @objid ("5ccd1cb0-ff39-444c-88db-051846bb0b17")
    public void setParent(Activity parent) {
        this.element.setOwner(parent);
    }

    @objid ("338d458a-129c-4d62-a3b0-88e596a3fe1c")
    public void setParent(Clause parent) {
        this.element.setOwnerClause(parent);
    }

    @objid ("b1d1fe32-d00e-4e54-add1-04f8065657ac")
    public void setParent(StructuredActivityNode parent) {
        this.element.setOwnerNode(parent);
    }

    @objid ("2d08719d-dd31-46b2-a211-5101c81c3d30")
    public void setParent(ActivityPartition parent) {
        this.element.setOwnerPartition(parent);
    }

    @objid ("6b445237-b771-4d4d-8648-9747b89219c8")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("23f900c2-4556-4134-aefa-14a4f86eccd9")
    public String getRtAction_OpaqueAction_isAtomic() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_ISATOMIC, this.element);
    }

    @objid ("faa829b3-9e9b-47f0-a617-82be46621760")
    public void setRtAction_OpaqueAction_isAtomic(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_ISATOMIC, value);
    }

    @objid ("38ef5055-4680-40bd-a502-e24593e23d66")
    public String getRtAction_OpaqueAction_synchKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_SYNCHKIND, this.element);
    }

    @objid ("158eb403-f5b1-4f32-9a94-8207b2017821")
    public void setRtAction_OpaqueAction_synchKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_SYNCHKIND, value);
    }

    @objid ("ae1b14ed-9283-4b5d-a4ec-36521daeb6bf")
    public String getRtAction_OpaqueAction_msgSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_MSGSIZE, this.element);
    }

    @objid ("8d5262fd-9bf9-4c95-af38-694623bd795c")
    public void setRtAction_OpaqueAction_msgSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_OPAQUEACTION_RTACTION_OPAQUEACTION_MSGSIZE, value);
    }

}
