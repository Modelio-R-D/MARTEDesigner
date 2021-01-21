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

@objid ("d0dfa852-1384-4d23-9cc7-78e330ed5c19")
public class RtService_Operation {
    @objid ("e0d8790c-4567-441b-9fc0-f3fab2d23131")
    protected Operation element;

    @objid ("296e6bfa-20ec-4e2f-be34-f89a752cef24")
    public RtService_Operation() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTSERVICE_OPERATION);
        this.element.setName(MARTEResourceManager.getName("RtService_Operation"));
    }

    @objid ("c384ea51-3692-46f7-a048-a04da50a1dbd")
    public RtService_Operation(Operation element) {
        this.element = element;
    }

    @objid ("8364c17b-33c3-4f75-940c-fab9009bcaa1")
    public Operation getElement() {
        return this.element;
    }

    @objid ("72bc01d2-2e82-43c2-9b1f-4419f05f119d")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("793caf37-35e0-4381-a441-54298f343e90")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("76935a66-4363-4cc0-9be1-695fa0f10f5c")
    public String getconcPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_CONCPOLICY, this.element);
    }

    @objid ("7bf4d2d9-7818-4c86-8ce3-92b8040baf2f")
    public void setconcPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_CONCPOLICY, value);
    }

    @objid ("f449b2dc-ca45-451c-b8b2-461cc44fb8d3")
    public String getexeKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_EXEKIND, this.element);
    }

    @objid ("1a75dddf-19ca-4585-b0f6-46e3a086db88")
    public void setexeKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_EXEKIND, value);
    }

    @objid ("2f22f708-8574-446f-9879-12b47d89ba61")
    public boolean isisAtomic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_ISATOMIC, this.element);
    }

    @objid ("e39350ca-b045-4ef1-9a48-174c38fff14e")
    public void isisAtomic(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_ISATOMIC,value);
    }

    @objid ("e43ba08d-759f-4f52-80f8-84918f9e9eac")
    public String getsynchKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_SYNCHKIND, this.element);
    }

    @objid ("11fd3ae3-83e3-4c4b-8be7-f774e760bfac")
    public void setsynchKind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RTSERVICE_OPERATION_RTSERVICE_OPERATION_SYNCHKIND, value);
    }

}
