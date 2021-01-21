package org.modelio.module.marte.profile.sw_resourcecore.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.GrService_ExecutionSpecification;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2025f8b6-8538-48fd-9c56-0ecbb6d1983f")
public class SwAccessService_ExecutionSpecification extends GrService_ExecutionSpecification {
    @objid ("82def1cd-d44a-4a5b-917a-2e95d3991f02")
    public SwAccessService_ExecutionSpecification() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createExecutionSpecification());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION);
                this.element.setName(MARTEResourceManager.getName("SwAccessService_ExecutionSpecification"));
    }

    @objid ("dee835a0-02ef-44e4-94fe-91b3e0e306b3")
    public SwAccessService_ExecutionSpecification(ExecutionSpecification element) {
        super(element);
    }

    @objid ("c6439246-c3fd-4856-8697-bc00d62464a6")
    public boolean isisModifier() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_SWACCESSSERVICE_EXECUTIONSPECIFICATION_ISMODIFIER, this.element);
    }

    @objid ("fc63bae6-b081-459a-bcc1-76a9bd04e62b")
    public void isisModifier(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_SWACCESSSERVICE_EXECUTIONSPECIFICATION_ISMODIFIER,value);
    }

    @objid ("c1e4da15-35ca-4b0b-bebc-155df3aa3ac5")
    public String getaccessedElement() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_SWACCESSSERVICE_EXECUTIONSPECIFICATION_ACCESSEDELEMENT, this.element);
    }

    @objid ("b9f3fcd5-0da8-43c0-b50b-cff89ad2eb0d")
    public void setaccessedElement(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_SWACCESSSERVICE_EXECUTIONSPECIFICATION_ACCESSEDELEMENT, value);
    }

}
