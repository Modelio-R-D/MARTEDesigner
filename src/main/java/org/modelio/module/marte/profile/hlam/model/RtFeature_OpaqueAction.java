package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f6813111-d995-4b2b-a6da-00b33e682711")
public class RtFeature_OpaqueAction {
    @objid ("77592822-3a6d-47de-958c-6b8630285172")
    protected OpaqueAction element;

    @objid ("1db219fe-12be-4bd8-8979-28374f2dc51e")
    public RtFeature_OpaqueAction() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOpaqueAction();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTFEATURE_OPAQUEACTION);
        this.element.setName(MARTEResourceManager.getName("RtFeature_OpaqueAction"));
    }

    @objid ("f6ed1779-d66d-4404-b767-3b395233cc55")
    public RtFeature_OpaqueAction(OpaqueAction element) {
        this.element = element;
    }

    @objid ("bf15c985-698c-4eb5-a5d8-bc7fc1e502b0")
    public OpaqueAction getElement() {
        return this.element;
    }

    @objid ("1b92a8e4-0ef9-4dd1-ba50-ff37cc62392a")
    public void setParent(Activity parent) {
        this.element.setOwner(parent);
    }

    @objid ("59a60af7-4d4f-4940-9331-3173e5d7d1cd")
    public void setParent(Clause parent) {
        this.element.setOwnerClause(parent);
    }

    @objid ("d98b4388-56cf-49e8-9813-6c18f362d26b")
    public void setParent(StructuredActivityNode parent) {
        this.element.setOwnerNode(parent);
    }

    @objid ("50d5f7e9-90dc-4196-b91d-5d404d9efa67")
    public void setParent(ActivityPartition parent) {
        this.element.setOwnerPartition(parent);
    }

    @objid ("7e001dea-e9ac-428f-aa44-3e24fb6ed970")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
