package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("91a5e80c-c486-4931-970f-599761132137")
public class MutualExclusionResource_Attribute extends Resource_Attribute {
    @objid ("a22a5939-bb3a-450f-8115-727de19394df")
    public MutualExclusionResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("MutualExclusionResource_Attribute"));
    }

    @objid ("6cf55a29-ff1e-4f2f-8bfa-46e9aa70537e")
    public MutualExclusionResource_Attribute(final Attribute element) {
        super(element);
    }

    @objid ("f880dfab-6aa5-4be3-9209-574c70f23e0a")
    public String getprotectKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND, this.element);
    }

    @objid ("0ff92be8-dc8e-4d0e-9f3e-b20eab58aff3")
    public void setprotectKind(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND, value);
    }

    @objid ("c84a108f-4342-4435-955c-c34d23689ae3")
    public String getceiling() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING, this.element);
    }

    @objid ("c4454c58-69c4-4d03-ac2b-a61b4e924fb4")
    public void setceiling(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING, value);
    }

    @objid ("603b0d12-8653-4856-a002-6b93698dbc4e")
    public String getotherProtectProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL, this.element);
    }

    @objid ("3cd76b8f-8c74-4180-8595-10fd621e834b")
    public void setotherProtectProtocol(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL, value);
    }

    @objid ("40be9d9b-d4d6-4e55-ae42-a47edf03f0b9")
    public String getscheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER, this.element);
    }

    @objid ("870b5dc8-3df1-41dc-931e-6f57bc483383")
    public void setscheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER, value);
    }

}
