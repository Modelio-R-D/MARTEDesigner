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

@objid ("eec43973-b34d-452e-8417-b05bc5f31384")
public class SaExecHost_Lifeline {
    @objid ("dcf6b942-0078-4f56-8e41-69fa35e4c57b")
    protected Lifeline element;

    @objid ("f82aaab8-2a7c-4af2-bebf-120c088feadc")
    public SaExecHost_Lifeline() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SAEXECHOST_LIFELINE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAEXECHOST_LIFELINE));
    }

    @objid ("f79320d1-c784-4621-93bf-57fc8fd4aa8b")
    public SaExecHost_Lifeline(Lifeline element) {
        this.element = element;
    }

    @objid ("affc1001-df44-40a0-92b1-c7e880035e6a")
    public Lifeline getElement() {
        return this.element;
    }

    @objid ("5b513bb4-0177-4a94-8293-cd7c0875d2d6")
    public void setParent(Interaction parent) {
        this.element.setOwner(parent);
    }

    @objid ("8ecf365b-e6ad-464d-9280-cec150a0b6c3")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("cd8d57e9-c080-4d2e-9808-94acc5ae33f0")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_ISSCHED, this.element);
    }

    @objid ("199a85be-8a27-421f-b022-35dd3faf0941")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_ISSCHED ,value);
    }

    @objid ("ad6a5181-f74e-4b02-a702-2f1cf4eb3ec8")
    public String getschSlack() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_SCHSLACK, this.element);
    }

    @objid ("7a0697a8-4f3d-49f0-9c10-a17cea6c4782")
    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_SCHSLACK, value);
    }

    @objid ("023d4d22-5b5a-42b3-91d4-83472278ae85")
    public String getschedUtiliz() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_SCHEDUTILIZ, this.element);
    }

    @objid ("d16f7bc6-38d5-4337-91da-f026d3b90ffb")
    public void setschedUtiliz(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_SCHEDUTILIZ, value);
    }

    @objid ("33805b55-43e9-4af1-aa68-26f7c40c723e")
    public String getISRswitchT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_ISRSWITCHT, this.element);
    }

    @objid ("e204cd1a-452d-43a7-b75f-bbeaa8bb9eed")
    public void setISRswitchT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_ISRSWITCHT, value);
    }

    @objid ("7fa51e45-2387-46c1-b275-1dbae4a8c861")
    public String getISRprioRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_ISRPRIORANGE, this.element);
    }

    @objid ("65d1a448-d28c-42c5-a204-e23fd5276c33")
    public void setISRprioRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_ISRPRIORANGE, value);
    }

}
