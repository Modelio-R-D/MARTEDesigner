package org.modelio.module.marte.profile.gcm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("258a18d6-3ba9-4231-925b-5c549e1b77a6")
public class FlowProperty_AssociationEnd {
    @objid ("15a3870a-7ae0-4b95-8b49-304951725ed1")
    protected AssociationEnd element;

    @objid ("1cc706ac-c8a2-4073-b20e-f5eb197889fb")
    public FlowProperty_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.FLOWPROPERTY_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName("FlowProperty_AssociationEnd"));
    }

    @objid ("a5f4dd72-44cb-473a-8ad1-04c6f707c13a")
    public FlowProperty_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    @objid ("9b14a41e-cfc3-46c4-92a7-a5786365ceed")
    public AssociationEnd getElement() {
        return this.element;
    }

    @objid ("8e965c0f-4606-49d2-97bd-a910e9669426")
    public void setParent(Classifier parent) {
        this.element.setSource(parent);
    }

    @objid ("486a1451-bc45-4b64-8696-73c25960f2ed")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("60060eda-ad7d-4442-9175-b858b960b9af")
    public String getdirection() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.FLOWPROPERTY_ASSOCIATIONEND_FLOWPROPERTY_ASSOCIATIONEND_DIRECTION, this.element);
    }

    @objid ("43d0129e-c198-4310-bdc5-e5394d4c7617")
    public void setdirection(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.FLOWPROPERTY_ASSOCIATIONEND_FLOWPROPERTY_ASSOCIATIONEND_DIRECTION, value);
    }

}
