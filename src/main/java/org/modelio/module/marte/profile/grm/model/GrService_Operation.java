package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GrService_Operation {
    protected Operation element;

    public GrService_Operation() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GRSERVICE_OPERATION);
        this.element.setName(MARTEResourceManager.getName("GrService_Operation"));
    }

    public GrService_Operation(final Operation element) {
        this.element = element;
    }

    public Operation getElement() {
        return this.element;
    }

    public void setParent(final Classifier parent) {
        this.element.setOwner(parent);
    }

    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getGrService_Operation_own() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GRSERVICE_OPERATION_GRSERVICE_OPERATION_OWNER, this.element);
    }

    public void setGrService_Operation_own(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GRSERVICE_OPERATION_GRSERVICE_OPERATION_OWNER, value);
    }

}
