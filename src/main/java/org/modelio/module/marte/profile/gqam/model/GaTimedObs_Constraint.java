package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("26acfc41-e4ce-41c6-9f20-bf51a94bfc48")
public class GaTimedObs_Constraint {
    @objid ("2bd0ffb9-0e86-412c-92e3-90eba85e16c4")
    protected Constraint element;

    @objid ("c38a9ca5-2412-495f-8635-fc579ccca878")
    public GaTimedObs_Constraint() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConstraint();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GATIMEDOBS_CONSTRAINT);
        this.element.setName(MARTEResourceManager.getName("GaTimedObs_Constraint"));
    }

    @objid ("3dba7a85-a466-4eb2-9182-accd13dfc5c1")
    public GaTimedObs_Constraint(Constraint element) {
        this.element = element;
    }

    @objid ("61d5a713-042f-486a-9f40-9dc3b3d0f71f")
    public Constraint getElement() {
        return this.element;
    }

    @objid ("55b13b2d-83bc-4fc7-bb21-984cf7fa366c")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("d3065628-33b9-4de4-900b-0c896feacbf2")
    public String getlaxity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_LAXITY, this.element);
    }

    @objid ("b8a9c23f-af98-4ee3-8c03-fe29ac011bbb")
    public void setlaxity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_LAXITY, value);
    }

    @objid ("cd927a44-81b8-4e5d-b580-542eb2ddbd5c")
    public String getstartObs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_STARTOBS, this.element);
    }

    @objid ("8c0bc06f-ed5c-43dd-bddc-e984193ac9d6")
    public void setstartObs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_STARTOBS, value);
    }

    @objid ("e8ca8349-1246-4fef-af1a-1cb413d05506")
    public String getendObs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_ENDOBS, this.element);
    }

    @objid ("656553e2-3fed-4399-9437-888befbd39f6")
    public void setendObs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_ENDOBS, value);
    }

}
