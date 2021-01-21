package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8c76b2a1-75c5-4c21-85be-ad80d770d29f")
public class HwCommunicationResource_Lifeline {
    @objid ("916cfca3-59f7-4683-ba4a-5875267fb00d")
    protected Lifeline element;

    @objid ("ecb258ca-c128-453f-bd92-8c769797f957")
    public HwCommunicationResource_Lifeline() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_LIFELINE);
        this.element.setName(MARTEResourceManager.getName("HwCommunicationResource_Lifeline"));
    }

    @objid ("e3b537d0-c269-4400-8da6-5b0963385187")
    public HwCommunicationResource_Lifeline(Lifeline element) {
        this.element = element;
    }

    @objid ("65f802df-4609-4880-9072-5e6237ee6600")
    public void setParent(Interaction parent) {
        this.element.setOwner(parent);
    }

    @objid ("8ea5dc50-9076-4799-9e99-4d7229981dc7")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("e4904e6d-67b1-4756-a52d-630a63629a2f")
    public Lifeline getElement() {
        return this.element;
    }

}
