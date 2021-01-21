package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f2117a96-9baa-4bb7-8f76-0ef7ccdce642")
public class GaLatencyObs_Constraint {
    @objid ("adba604d-ef68-46c6-8839-8fc7eb22e195")
    protected Constraint element;

    @objid ("475e9bf4-2a8e-4165-994f-07833958983c")
    public GaLatencyObs_Constraint() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConstraint();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GALATENCYOBS_CONSTRAINT);
        this.element.setName(MARTEResourceManager.getName("GaLatencyObs_Constraint"));
    }

    @objid ("d9d427ba-e839-4393-888a-787ac389884a")
    public GaLatencyObs_Constraint(Constraint element) {
        this.element = element;
    }

    @objid ("9233726d-b6fd-45c2-8f47-1e290d3a40ca")
    public Constraint getElement() {
        return this.element;
    }

    @objid ("52593c27-587e-435e-a320-92f77c574f06")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("1ecfe48b-1c57-4b8b-b7b5-9959e727ff19")
    public String getlatency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_LATENCY, this.element);
    }

    @objid ("f187d6f6-75e5-4d2d-889b-7e687789c396")
    public void setlatency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_LATENCY, value);
    }

    @objid ("e4036e03-61b7-4e72-adea-edb2b3a30696")
    public String getmiss() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_MISS, this.element);
    }

    @objid ("14c34b7d-56a6-4ca5-99c7-8c2903123d63")
    public void setmiss(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_MISS, value);
    }

    @objid ("c359b63c-7799-4664-b946-ed6de2a20313")
    public String getutility() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_UTILITY, this.element);
    }

    @objid ("47c3371e-bd14-4f65-94d2-7667c19e7ce3")
    public void setutility(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_UTILITY, value);
    }

    @objid ("47bf1209-43ba-4925-b576-abb368933424")
    public String getmaxJitter() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_MAXJITTER, this.element);
    }

    @objid ("d975f581-bbc3-432a-b100-c9599338e639")
    public void setmaxJitter(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_MAXJITTER, value);
    }

}
