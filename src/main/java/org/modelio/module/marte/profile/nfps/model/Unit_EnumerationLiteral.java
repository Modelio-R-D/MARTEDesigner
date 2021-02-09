package org.modelio.module.marte.profile.nfps.model;

import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Unit_EnumerationLiteral {
    protected EnumerationLiteral element;

    public Unit_EnumerationLiteral() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createEnumerationLiteral();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.UNIT_ENUMERATIONLITERAL);
        this.element.setName(MARTEResourceManager.getName("Unit_EnumerationLiteral"));
    }

    public Unit_EnumerationLiteral(EnumerationLiteral element) {
        this.element = element;
    }

    public EnumerationLiteral getElement() {
        return this.element;
    }

    public void setParent(Enumeration parent) {
        this.element.setValuated(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getconvFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_CONVFACTOR, this.element);
    }

    public void setconvFactor(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_CONVFACTOR, value);
    }

    public String getoffsetFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_OFFSETFACTOR, this.element);
    }

    public void setoffsetFactor(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_OFFSETFACTOR, value);
    }

    public String getbaseUnit() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_BASEUNIT, this.element);
    }

    public void setbaseUnit(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_BASEUNIT, value);
    }

}
