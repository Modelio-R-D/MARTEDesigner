package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("12e61ef9-4ea5-4ed6-a5fe-68f6253fd678")
public class SaSharedResource_Lifeline {
    @objid ("8b814c30-2192-4461-81ad-d502b2f7067f")
    protected Lifeline element;

    @objid ("638e3943-ac5d-4d7e-b5d3-9c2fd3235586")
    public SaSharedResource_Lifeline() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SASHAREDRESOURCE_LIFELINE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SASHAREDRESOURCE_LIFELINE));
    }

    @objid ("40f8a9b0-16ee-4bd3-b369-1256ae262d27")
    public SaSharedResource_Lifeline(Lifeline element) {
        this.element = element;
    }

    @objid ("079244ce-d25e-43ae-9d26-285e82013384")
    public Lifeline getElement() {
        return this.element;
    }

    @objid ("541cb328-bac8-45e1-9ae7-bd7d47b6dbd4")
    public void setParent(Interaction parent) {
        this.element.setOwner(parent);
    }

    @objid ("30f15068-15bb-4abd-9723-dd6acc0568c5")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("c73a0d94-5788-4a81-b9f1-b1bc53486e3f")
    public String getcapacity() {
        return ModelUtils.getTaggedValue("SaSharedResource_Lifeline_capacity", this.element);
    }

    @objid ("faa15ab8-fd54-4e6b-8185-9148243fb768")
    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_LIFELINE_SASHAREDRESOURCE_LIFELINE_CAPACITY, value);
    }

    @objid ("0fba1bc7-3a57-4cd7-9002-2127ef7e802d")
    public boolean isisPreemp() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Lifeline_isPreemp", this.element);
    }

    @objid ("7605e70f-41dd-4333-847f-9f95759926b5")
    public void isisPreemp(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_LIFELINE_SASHAREDRESOURCE_LIFELINE_ISPREEMP, value);
    }

    @objid ("65d4cb81-5fcb-4a67-951a-92ca92cb98a3")
    public boolean isisConsum() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Lifeline_isConsum", this.element);
    }

    @objid ("26c82f5c-911b-4d63-8a6e-babdcdd3c288")
    public void isisConsum(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_LIFELINE_SASHAREDRESOURCE_LIFELINE_ISCONSUM, value);
    }

    @objid ("e986f026-5a4c-40ed-84a1-a5f2646421e8")
    public String getacquisT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Lifeline_acquisT", this.element);
    }

    @objid ("5a7c03b8-1c9d-4c01-ab1f-b63b2080576e")
    public void setacquisT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_LIFELINE_SASHAREDRESOURCE_LIFELINE_ACQUIST, value);
    }

    @objid ("a10846c6-a476-4518-bf5c-978c45aa9882")
    public String getreleaseT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Lifeline_releaseT", this.element);
    }

    @objid ("2b4c2151-bb1b-4d71-8516-e0bf0256b729")
    public void setreleaseT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_LIFELINE_SASHAREDRESOURCE_LIFELINE_RELEASET, value);
    }

}
