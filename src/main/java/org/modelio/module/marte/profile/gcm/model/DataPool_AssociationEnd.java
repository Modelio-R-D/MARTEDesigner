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

@objid ("a8a56ab3-c027-4227-a081-5bdaf7df4497")
public class DataPool_AssociationEnd {
    @objid ("0bed64d7-67b4-4efa-9958-115d6237e43a")
    protected AssociationEnd element;

    @objid ("ec67968c-2e0c-4567-9ac0-96c7d3c29d22")
    public DataPool_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DATAPOOL_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName("DataPool_AssociationEnd"));
    }

    @objid ("7e2e6b7a-88d1-4bcc-a341-eb549f92b665")
    public DataPool_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    @objid ("b91a3d4e-eb66-4b79-886d-c2e14908ed58")
    public AssociationEnd getElement() {
        return this.element;
    }

    @objid ("dc737065-5719-4bec-aca3-1d31c6aa8ca2")
    public void setParent(Classifier parent) {
        this.element.setSource(parent);
    }

    @objid ("9d9d115d-1200-4505-af38-e8730aab32b4")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("79afe770-85b7-43f1-8383-310c9e61255e")
    public String getordering() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_ORDERING, this.element);
    }

    @objid ("c08751dd-26a7-4af1-9ad9-4faa6c71a722")
    public void setordering(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_ORDERING, value);
    }

    @objid ("db84252f-d28e-460a-aa10-9f10c43fe00b")
    public String getinsertion() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_INSERTION, this.element);
    }

    @objid ("536c958d-48b8-446d-8a19-872ab1ec68f3")
    public void setinsertion(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_INSERTION, value);
    }

    @objid ("a451b889-d8b9-456a-bc8b-81f5d4952f5a")
    public String getselection() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_SELECTION, this.element);
    }

    @objid ("a59dd18f-4508-4fde-b817-640f076d284b")
    public void setselection(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_SELECTION, value);
    }

}
