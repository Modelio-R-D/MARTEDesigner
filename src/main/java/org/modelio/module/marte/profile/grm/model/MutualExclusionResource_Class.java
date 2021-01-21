package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("558cf067-a918-4d36-b334-c464698dc700")
public class MutualExclusionResource_Class extends Resource_Class {
    @objid ("41e30be7-8c51-497f-ac12-e9b5dec6887f")
    public MutualExclusionResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER));
    }

    @objid ("33ab2c79-e26c-43e6-a318-3781f27a9c42")
    public MutualExclusionResource_Class(final Class element) {
        super(element);
    }

    @objid ("97ccb83a-c668-43f2-b690-f57aa15b2355")
    public String getprotectKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND, this.element);
    }

    @objid ("0cca3f8b-2837-4c2a-8076-72d07370b12a")
    public void setprotectKind(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND, value);
    }

    @objid ("a49d475f-95fc-4470-8a25-2baf578cd064")
    public String getceiling() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING, this.element);
    }

    @objid ("25c16da2-2947-4b5e-83c5-f1980c324730")
    public void setceiling(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING, value);
    }

    @objid ("a28449bd-475a-4f0a-8907-f4bc8c5186d6")
    public String getotherProtectProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL, this.element);
    }

    @objid ("5dd5457a-b6fc-4695-b383-366018741dad")
    public void setotherProtectProtocol(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL, value);
    }

    @objid ("3629b569-ec10-4d66-92c9-700f022b78f2")
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
