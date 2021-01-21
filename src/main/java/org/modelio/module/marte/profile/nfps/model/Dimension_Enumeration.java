package org.modelio.module.marte.profile.nfps.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("df3dc773-4b81-454e-a783-462c246ab4ae")
public class Dimension_Enumeration {
    @objid ("705e74a4-2b6c-4665-9bbb-74240792eeb5")
    protected Enumeration element;

    @objid ("fe14fa32-915d-4441-88d3-ab1198612889")
    public Dimension_Enumeration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createEnumeration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DIMENSION_ENUMERATION);
        this.element.setName(MARTEResourceManager.getName("Dimension_Enumeration"));
    }

    @objid ("c8f02d75-a8a3-4fc8-b535-cf94d4c76cae")
    public Dimension_Enumeration(Enumeration element) {
        this.element = element;
    }

    @objid ("86b0155b-ae04-47d7-931b-93a27221f03c")
    public Enumeration getElement() {
        return this.element;
    }

    @objid ("84b01b0e-5b88-4b52-9bdc-78254f5c5e36")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("922c9536-bf83-431c-923a-ce02d6ad18e1")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("d32e4581-e8fe-41eb-b86c-5eabfe567d34")
    public String getsymbol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_SYMBOL, this.element);
    }

    @objid ("96e0fced-0c25-42f3-9b7f-4fe7837ba768")
    public void setsymbol(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_SYMBOL, value);
    }

    @objid ("b058cf88-64eb-4d7b-b22f-67ad45d52dcf")
    public String getbaseDimension() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_BASEDIMENSION, this.element);
    }

    @objid ("63aab9d3-50c1-4400-953f-9ad49f812c64")
    public void setbaseDimension(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_BASEDIMENSION, value);
    }

    @objid ("9c7aad30-3b22-4cb6-8244-3949521c2ed1")
    public String getbaseExponent() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_BASEEXPONENT, this.element);
    }

    @objid ("37006092-ad67-47ba-bf73-7365ae458442")
    public void setbaseExponent(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DIMENSION_ENUMERATION_DIMENSION_ENUMERATION_BASEEXPONENT, value);
    }

}
