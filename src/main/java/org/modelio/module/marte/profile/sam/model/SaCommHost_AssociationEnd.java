package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1ab3a7eb-e000-4479-a8b1-515148a07366")
public class SaCommHost_AssociationEnd {
    @objid ("bd8db13f-8c9d-43db-8b91-19f514ed2a59")
    protected AssociationEnd element;

    @objid ("d813230e-cffa-44e8-b5bb-4b9c3eddc6ff")
    public SaCommHost_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SACOMMHOST_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SACOMMHOST_ASSOCIATIONEND));
    }

    @objid ("f0cd3bc5-099a-4106-8ac4-d0a0bb46f512")
    public SaCommHost_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    @objid ("23c7f483-68e7-4176-ae31-30c0365fe90b")
    public AssociationEnd getElement() {
        return this.element;
    }

    @objid ("4934cd4d-d600-4873-bdd5-3e30dda0af86")
    public void setParent(Classifier parent) {
        this.element.setSource(parent);
    }

    @objid ("f3d3f4a9-69f6-45be-83cc-279c564b5b38")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("01513062-d1a3-473b-8448-7ca8dcdb2069")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaCommHost_AssociationEnd_isSched", this.element);
    }

    @objid ("b2b3a276-fbac-4080-acd0-373a006d06e1")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATIONEND_SACOMMHOST_ASSOCIATIONEND_ISSCHED, value);
    }

    @objid ("390396fb-7d82-486d-bd47-3631c2a0e62f")
    public String getschSlack() {
        return ModelUtils.getTaggedValue("SaCommHost_AssociationEnd_schSlack", this.element);
    }

    @objid ("ab783eea-50aa-4163-9c34-34815ed5411e")
    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATIONEND_SACOMMHOST_ASSOCIATIONEND_SCHSLACK, value);
    }

}
