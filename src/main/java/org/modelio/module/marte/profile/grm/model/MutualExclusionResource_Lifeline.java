package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("33aaa85b-80f0-4b46-9a3e-6963c5114d0d")
public class MutualExclusionResource_Lifeline extends Resource_Lifeline {
    @objid ("973bd65c-be53-4379-b84a-2ad126757345")
    public MutualExclusionResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("MutualExclusionResource_Lifeline"));
    }

    @objid ("fd8fddc9-63c0-4400-8106-3d67b76d7195")
    public MutualExclusionResource_Lifeline(final Lifeline element) {
        super(element);
    }

    @objid ("7f045708-cbd5-40b4-883b-5ca4263133d7")
    public String getprotectKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND, this.element);
    }

    @objid ("c6d0464f-58e5-4a7b-a733-647b7af90460")
    public void setprotectKind(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND, value);
    }

    @objid ("54aaacfd-fbc7-4bd0-b5b6-152366d9bb2d")
    public String getceiling() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING, this.element);
    }

    @objid ("0f936f16-4408-4c46-8f01-c7126651d33c")
    public void setceiling(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING, value);
    }

    @objid ("818fea6f-d558-492b-bdd9-099ede2591e6")
    public String getotherProtectProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL, this.element);
    }

    @objid ("3cd5bc29-a7b4-4128-814c-4333b87c4f6f")
    public void setotherProtectProtocol(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL, value);
    }

    @objid ("d1e00dbf-95c4-4b0f-a95f-718230b57741")
    public String getscheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER, this.element);
    }

    @objid ("f3f208e7-a719-4eba-a0b9-04394343d381")
    public void setscheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER, value);
    }

}
