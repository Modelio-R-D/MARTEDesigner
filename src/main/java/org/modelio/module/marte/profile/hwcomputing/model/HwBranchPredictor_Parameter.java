package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4287f5fa-54f0-4662-9cfe-11848cc5056e")
public class HwBranchPredictor_Parameter {
    @objid ("a2aaf864-a589-4c2c-b3a2-6068b127cd27")
    protected Parameter element;

    @objid ("b6836bbf-6e46-435e-82fd-a44ae8b4ad8c")
    public HwBranchPredictor_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRANCHPREDICTOR_PARAMETER);
        this.element.setName(MARTEResourceManager.getName("HwBranchPredictor_Parameter"));
    }

    @objid ("90efc53b-2677-41fd-a6cf-50ed3df5224c")
    public HwBranchPredictor_Parameter(Parameter element) {
        this.element = element;
    }

    @objid ("08d9ac94-bb73-473a-a7ee-9d606da265c7")
    public void setParent(Operation parent) {
        this.element.setComposed(parent);
    }

    @objid ("c9ee0232-113c-4c5c-8d79-d6bee1c08d8b")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("8e220d81-df8d-4894-bf48-30094054f510")
    public Parameter getElement() {
        return this.element;
    }

}
