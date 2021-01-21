package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("bcd03add-1746-4699-892f-25cfdff60030")
public class Resource_Lifeline {
    @objid ("dd91160c-9760-4cd6-918b-90044787ab2c")
    protected Lifeline element;

    @objid ("838b8ab2-661e-4b8a-bd3c-65314bfbcb51")
    public Resource_Lifeline() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RESOURCE_LIFELINE);
        this.element.setName(MARTEResourceManager.getName("Resource_Lifeline"));
    }

    @objid ("1bf61adc-dbe6-4f29-97db-a828c6fba0c1")
    public Resource_Lifeline(final Lifeline element) {
        this.element = element;
    }

    @objid ("091f4a3e-670a-4f79-be9a-fd9964ee1c8e")
    public Lifeline getElement() {
        return this.element;
    }

    @objid ("f2d967a1-0248-4015-877d-907349026cb5")
    public void setParent(final Interaction parent) {
        this.element.setOwner(parent);
    }

    @objid ("1804958e-c34c-4892-bb22-2f857f3d4039")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("39b535db-23f9-4d89-bb3d-c4a4edc8f47c")
    public String getresMult() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_RESMULT, this.element);
    }

    @objid ("f7cce19f-42f1-4b53-b89c-aef3fc5a4297")
    public void setresMult(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_RESMULT, value);
    }

    @objid ("641d7bc9-f96e-44c3-b5cf-808fe3608c73")
    public boolean isisProtected() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISPROTECTED, this.element);
    }

    @objid ("2b372d2d-8f93-4a38-a4a0-b1a697b00240")
    public void isisProtected(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISPROTECTED, value);
    }

    @objid ("4f5a92ad-fc7c-469d-bdd3-1e096ea144ed")
    public boolean isisActive() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISACTIVE, this.element);
    }

    @objid ("c27adc35-0993-453a-9f0f-85d5dccafb04")
    public void isisActive(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISACTIVE, value);
    }

}
