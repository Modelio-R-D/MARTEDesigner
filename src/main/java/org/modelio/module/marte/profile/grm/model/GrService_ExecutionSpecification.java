package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9b3acf2d-5deb-4f64-9700-24af21889e2f")
public class GrService_ExecutionSpecification {
    @objid ("9c6770e4-3c41-407e-97b1-a9917dbf09e7")
    protected ExecutionSpecification element;

    @objid ("b9e24094-9f8b-45ec-8ea1-bc83c26c2f98")
    public GrService_ExecutionSpecification() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createExecutionSpecification();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GRSERVICE_EXECUTIONSPECIFICATION);
        this.element.setName(MARTEResourceManager.getName("GrService_ExecutionSpecification"));
    }

    @objid ("8dec0343-3729-434b-9720-06ffb962aa92")
    public GrService_ExecutionSpecification(final ExecutionSpecification element) {
        this.element = element;
    }

    @objid ("4fd75dd1-1ce1-49cf-9cdb-a2393af78068")
    public ExecutionSpecification getElement() {
        return this.element;
    }

    @objid ("9cd7e407-9b0e-419c-b6ed-6d0b6b723e05")
    public void setParent(final Interaction parent) {
        this.element.setEnclosingInteraction(parent);
    }

    @objid ("d2ad1d59-12f4-469c-ab78-05b42c565021")
    public void setParent(final InteractionOperand parent) {
        this.element.setEnclosingOperand(parent);
    }

    @objid ("646dbce6-12e2-4578-818e-0111479048ee")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("8baad188-2c3b-4bb2-9e78-ef95392b1670")
    public String getowner() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GRSERVICE_EXECUTIONSPECIFICATION_GRSERVICE_EXECUTIONSPECIFICATION_OWNER, this.element);
    }

    @objid ("101397b9-ba54-4aa6-8900-bd89e0d7a3c4")
    public void setowner(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GRSERVICE_EXECUTIONSPECIFICATION_GRSERVICE_EXECUTIONSPECIFICATION_OWNER, value);
    }

}
