package org.modelio.module.marte.profile.nfps.model;

import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Dimension_Enumeration {
    protected Enumeration element;

    public Dimension_Enumeration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createEnumeration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DIMENSION_ENUMERATION);
        this.element.setName(MARTEResourceManager.getName("Dimension_Enumeration"));
    }

    public Dimension_Enumeration(Enumeration element) {
        this.element = element;
    }

    public Enumeration getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getsymbol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_SYMBOL, this.element);
    }

    public void setsymbol(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_SYMBOL, value);
    }

    public String getbaseDimension() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_BASEDIMENSION, this.element);
    }

    public void setbaseDimension(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_BASEDIMENSION, value);
    }

    public String getbaseExponent() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_BASEEXPONENT, this.element);
    }

    public void setbaseExponent(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_BASEEXPONENT, value);
    }

}
