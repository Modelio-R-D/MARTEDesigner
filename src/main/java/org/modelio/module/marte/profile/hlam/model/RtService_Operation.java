package org.modelio.module.marte.profile.hlam.model;

import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class RtService_Operation {
    protected Operation element;

    public RtService_Operation() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTSERVICE_OPERATION);
        this.element.setName(MARTEResourceManager.getName("RtService_Operation"));
    }

    public RtService_Operation(Operation element) {
        this.element = element;
    }

    public Operation getElement() {
        return this.element;
    }

    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getconcPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_CONCPOLICY, this.element);
    }

    public void setconcPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_CONCPOLICY, value);
    }

    public String getexeKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_EXEKIND, this.element);
    }

    public void setexeKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_EXEKIND, value);
    }

    public boolean isisAtomic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_ISATOMIC, this.element);
    }

    public void isisAtomic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_ISATOMIC,value);
    }

    public String getsynchKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_SYNCHKIND, this.element);
    }

    public void setsynchKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_SYNCHKIND, value);
    }

}
