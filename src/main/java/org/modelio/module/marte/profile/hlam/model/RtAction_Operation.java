package org.modelio.module.marte.profile.hlam.model;

import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class RtAction_Operation {
    protected Operation element;

    public RtAction_Operation() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTACTION_OPERATION);
        this.element.setName(MARTEResourceManager.getName("RtAction_Operation"));
    }

    public RtAction_Operation(Operation element) {
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

    public boolean isisAtomic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_ISATOMIC, this.element);
    }

    public void isisAtomic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_ISATOMIC,value);
    }

    public String getRtAction_Operation_synchKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_SYNCHKIND, this.element);
    }

    public void setRtAction_Operation_synchKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_SYNCHKIND, value);
    }

    public String getRtAction_Operation_msgSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_MSGSIZE, this.element);
    }

    public void setRtAction_Operation_msgSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_MSGSIZE, value);
    }

}
