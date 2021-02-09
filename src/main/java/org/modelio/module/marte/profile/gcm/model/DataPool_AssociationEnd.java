package org.modelio.module.marte.profile.gcm.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class DataPool_AssociationEnd {
    protected AssociationEnd element;

    public DataPool_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DATAPOOL_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName("DataPool_AssociationEnd"));
    }

    public DataPool_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    public AssociationEnd getElement() {
        return this.element;
    }

    public void setParent(Classifier parent) {
        this.element.setSource(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getordering() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_ORDERING, this.element);
    }

    public void setordering(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_ORDERING, value);
    }

    public String getinsertion() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_INSERTION, this.element);
    }

    public void setinsertion(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_INSERTION, value);
    }

    public String getselection() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_SELECTION, this.element);
    }

    public void setselection(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_ASSOCIATIONEND_DATAPOOL_ASSOCIATIONEND_SELECTION, value);
    }

}
