package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0b2fe8c1-dc49-4d9c-83a3-dd5f0eb2be34")
public class MutualExclusionResource_Node extends Resource_Node {
    @objid ("012fdff7-732e-403e-a5da-6862c963bee9")
    public MutualExclusionResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER));
    }

    @objid ("1a79e83e-3f8b-4382-822e-54a786d4c9a0")
    public MutualExclusionResource_Node(final Node element) {
        super(element);
    }

    @objid ("f6951488-b698-4cf6-ada1-7080828205be")
    public String getprotectKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND, this.element);
    }

    @objid ("0e435afa-dbb3-45d9-af26-9b3261560160")
    public void setprotectKind(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND, value);
    }

    @objid ("e53fd4e7-1571-438e-a21c-1fb6f651dd8d")
    public String getceiling() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING, this.element);
    }

    @objid ("af5b8d16-771b-4c7e-a1a8-7fc9e3cff29d")
    public void setceiling(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING, value);
    }

    @objid ("742008b9-21a6-4335-8a9c-e6b9236a35a8")
    public String getotherProtectProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL, this.element);
    }

    @objid ("7ac65cfd-3045-41f8-9692-89a50704923a")
    public void setotherProtectProtocol(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL, value);
    }

    @objid ("8cd556fa-c629-4f6b-9aa6-0d5c83e55811")
    public enum ProtectProtocolKind {
        FIFO,
        NoPreemption,
        PriorityCeiling,
        PriorityInheritance,
        StackBased,
        Undef,
        Other;
    }

}
