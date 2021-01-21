package org.modelio.module.marte.profile.nfps.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("fcf58f09-c41f-42d8-9b5f-61d288a22641")
public class Unit_EnumerationLiteral {
    @objid ("d4afa6bf-fe33-4dd5-9a55-691141c625be")
    protected EnumerationLiteral element;

    @objid ("c462fb8c-a176-4187-a095-6ea1975d3b44")
    public Unit_EnumerationLiteral() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createEnumerationLiteral();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.UNIT_ENUMERATIONLITERAL);
        this.element.setName(MARTEResourceManager.getName("Unit_EnumerationLiteral"));
    }

    @objid ("5bdab464-7f20-4e02-b421-34812f06a35f")
    public Unit_EnumerationLiteral(EnumerationLiteral element) {
        this.element = element;
    }

    @objid ("3474dc20-f3f8-427b-9079-0d194258dbf9")
    public EnumerationLiteral getElement() {
        return this.element;
    }

    @objid ("7d245026-41d8-419f-9dbb-5c7c7cddad60")
    public void setParent(Enumeration parent) {
        this.element.setValuated(parent);
    }

    @objid ("c0b65dc0-dd7f-4d16-9433-b7ba286b7e08")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("4998dc0c-efdb-4735-bb93-e60f0907f255")
    public String getconvFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_CONVFACTOR, this.element);
    }

    @objid ("750fcf67-5f2d-41b8-befb-95890aa8186b")
    public void setconvFactor(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_CONVFACTOR, value);
    }

    @objid ("79fd9322-170c-4fc7-8724-b750e32d898b")
    public String getoffsetFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_OFFSETFACTOR, this.element);
    }

    @objid ("d1dcf95b-447d-4b01-9a04-61f67a4eb2ce")
    public void setoffsetFactor(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_OFFSETFACTOR, value);
    }

    @objid ("405c5e4f-180c-48b0-b879-6645fcca591e")
    public String getbaseUnit() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_BASEUNIT, this.element);
    }

    @objid ("33403653-948d-47bd-bb7d-ab659aec0f1f")
    public void setbaseUnit(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.UNIT_ENUMERATIONLITERAL_UNIT_ENUMERATIONLITERAL_BASEUNIT, value);
    }

}
