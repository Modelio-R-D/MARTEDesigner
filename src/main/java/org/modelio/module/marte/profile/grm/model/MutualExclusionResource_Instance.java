package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6a219417-3058-4c1a-abaf-bd08a53b8662")
public class MutualExclusionResource_Instance extends Resource_Instance {
    @objid ("fe82af10-9526-4338-a1d3-a5a296decc88")
    public MutualExclusionResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("MutualExclusionResource_Instance"));
    }

    @objid ("25783ff2-0934-4534-842c-e694e5ae42ad")
    public MutualExclusionResource_Instance(final Instance element) {
        super(element);
    }

    @objid ("39d4e918-9726-48e6-8a7a-aa739b58eacd")
    public String getprotectKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND, this.element);
    }

    @objid ("88b7ddba-a9c9-497f-9905-4cf853c40fc1")
    public void setprotectKind(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND, value);
    }

    @objid ("fd883d75-c1f5-4d68-9bac-811fa4912d3a")
    public String getceiling() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING, this.element);
    }

    @objid ("54ecc4eb-01a0-46a3-861a-cf5dd829a401")
    public void setceiling(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING, value);
    }

    @objid ("21c906b6-9117-4946-b6d3-ef4cbe45e484")
    public String getotherProtectProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL, this.element);
    }

    @objid ("722344af-0331-43a6-a947-68dca69b9f58")
    public void setotherProtectProtocol(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL, value);
    }

    @objid ("680c011c-e26e-4f8e-8408-3c6feaca9f04")
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
