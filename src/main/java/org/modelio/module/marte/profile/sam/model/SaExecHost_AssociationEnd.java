package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaExecHost_AssociationEnd {
    protected AssociationEnd element;

    public SaExecHost_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element, MARTEDesignerStereotypes.SAEXECHOST_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAEXECHOST_ASSOCIATIONEND));
    }

    public SaExecHost_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    public void setParent(TemplateParameter source, AssociationEnd destination) {
        this.element.setOwnerTemplateParameter(source);
    }

    public AssociationEnd getElement() {
        return this.element;
    }

    public boolean isisSched() {
        return ModelUtils.hasTaggedValue( MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISSCHED, this.element);
    }

    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISSCHED, value);
    }

    public String getschSlack() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_SCHSLACK, this.element);
    }

    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_SCHSLACK, value);
    }

    public String getschedUtiliz() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ, this.element);
    }

    public void setschedUtiliz(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ, value);
    }

    public String getISRswitchT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT, this.element);
    }

    public void setISRswitchT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT, value);
    }

    public String getISRprioRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE, this.element);
    }

    public void setISRprioRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_ASSOCIATIONEND_SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE, value);
    }

}
