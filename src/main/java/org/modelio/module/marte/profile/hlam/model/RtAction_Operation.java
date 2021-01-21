package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2d6f17a0-82ba-4fe3-b746-c7ad1048a585")
public class RtAction_Operation {
    @objid ("e4365e73-96d9-4571-ac9a-68a6bdb74758")
    protected Operation element;

    @objid ("775ba812-7ccb-4426-beb5-b2a5d749e5a5")
    public RtAction_Operation() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTACTION_OPERATION);
        this.element.setName(MARTEResourceManager.getName("RtAction_Operation"));
    }

    @objid ("46d0561f-9baf-408b-8c73-0fce0ac92edd")
    public RtAction_Operation(Operation element) {
        this.element = element;
    }

    @objid ("d54614be-0b50-4371-b5f3-7e91aa011a5d")
    public Operation getElement() {
        return this.element;
    }

    @objid ("a481fe2b-9a5c-443e-bf37-1886b1294e5a")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("75487be5-7c9e-4f23-8e7c-6821a097f570")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("00a07d9c-b582-402c-abd4-dcd38b611756")
    public boolean isisAtomic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_ISATOMIC, this.element);
    }

    @objid ("cc12b75f-8187-4b61-9035-ef203501876d")
    public void isisAtomic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_ISATOMIC,value);
    }

    @objid ("15ed7b6b-0eae-4059-bcec-dd8288a71e36")
    public String getRtAction_Operation_synchKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_SYNCHKIND, this.element);
    }

    @objid ("6a6298c4-11bc-48d1-bcb4-98a80d5d783f")
    public void setRtAction_Operation_synchKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_SYNCHKIND, value);
    }

    @objid ("7d45ec12-2bf5-4853-b278-2ac774b6ad38")
    public String getRtAction_Operation_msgSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_MSGSIZE, this.element);
    }

    @objid ("157ce275-3181-4056-a26a-76a7f079f721")
    public void setRtAction_Operation_msgSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTACTION_OPERATION_RTACTION_OPERATION_MSGSIZE, value);
    }

}
