package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6035306b-d298-478e-99cb-be4612d2c1bc")
public class MutualExclusionResource_Parameter extends Resource_Parameter {
    @objid ("78374e22-a9ff-4275-88f9-522f133d1cd0")
    public MutualExclusionResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("MutualExclusionResource_Parameter"));
    }

    @objid ("7f9a28f3-38ca-4922-9182-4a9482438a8a")
    public MutualExclusionResource_Parameter(final Parameter element) {
        super(element);
    }

    @objid ("26e0eb16-0792-4af8-bcc5-adfde0b4ef29")
    public String getprotectKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND, this.element);
    }

    @objid ("ed4e1c02-cb8c-4410-a551-512ace3c5839")
    public void setprotectKind(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND, value);
    }

    @objid ("3a5eb40b-2177-4094-b425-03e314311341")
    public String getceiling() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING, this.element);
    }

    @objid ("99558680-6f21-47a6-a13f-8c3807c7af17")
    public void setceiling(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING, value);
    }

    @objid ("bc99810f-9023-498d-a650-1d95bb76fc84")
    public String getotherProtectProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL, this.element);
    }

    @objid ("72e74297-c793-4bdd-bad7-fd96baf45402")
    public void setotherProtectProtocol(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL, value);
    }

    @objid ("7c398f78-5ce0-4992-a044-d1ec0cd64bfa")
    public String getscheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER, this.element);
    }

    @objid ("cfc63489-01aa-46b5-ad8a-a8b58ec2d229")
    public void setscheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER, value);
    }

}
