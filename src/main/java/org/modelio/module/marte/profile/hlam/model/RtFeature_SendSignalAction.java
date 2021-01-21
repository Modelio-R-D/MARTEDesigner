package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("cba67d3e-4daf-4af4-b683-9e26e978655c")
public class RtFeature_SendSignalAction {
    @objid ("55cb7285-a727-4ebb-89cc-b247fb9b1ec4")
    protected SendSignalAction element;

    @objid ("40b1a1df-46cd-4f72-8b38-e0846d31003a")
    public RtFeature_SendSignalAction() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createSendSignalAction();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTFEATURE_SENDSIGNALACTION);
        this.element.setName(MARTEResourceManager.getName("RtFeature_SendSignalAction"));
    }

    @objid ("4ac338cf-8d7f-431e-a17e-d2dd907cb355")
    public RtFeature_SendSignalAction(SendSignalAction element) {
        this.element = element;
    }

    @objid ("7863b264-f5c1-43ad-b880-d7b166f114d5")
    public SendSignalAction getElement() {
        return this.element;
    }

    @objid ("2879d4e3-e1be-41cd-9feb-4e2909d3ef0f")
    public void setParent(Activity parent) {
        this.element.setOwner(parent);
    }

    @objid ("c71e54fa-57ca-465c-8085-9771842891ed")
    public void setParent(Clause parent) {
        this.element.setOwnerClause(parent);
    }

    @objid ("a8a2b29e-b76a-4793-8d30-a5ca19530241")
    public void setParent(StructuredActivityNode parent) {
        this.element.setOwnerNode(parent);
    }

    @objid ("3b04d687-1a4c-4eb3-9c12-57a5526a82e2")
    public void setParent(ActivityPartition parent) {
        this.element.setOwnerPartition(parent);
    }

    @objid ("7a8914f3-92c9-4d44-be2c-e5a97a8453eb")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
