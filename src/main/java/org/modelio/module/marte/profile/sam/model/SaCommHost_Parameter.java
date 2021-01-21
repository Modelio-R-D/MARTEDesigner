package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1b6c96a4-2d52-452b-bc2d-15a158345b9d")
public class SaCommHost_Parameter {
    @objid ("76f4649d-f3e5-4884-aa87-98840ddd635b")
    protected Parameter element;

    @objid ("5b8aaadb-041b-49e0-96c2-57491062f7b9")
    public SaCommHost_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SACOMMHOST_PARAMETER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SACOMMHOST_PARAMETER));
    }

    @objid ("8d437715-9848-4fa4-892a-0b1570da639a")
    public SaCommHost_Parameter(Parameter element) {
        this.element = element;
    }

    @objid ("217fd7e2-5266-4921-a945-7e772ab69448")
    public Parameter getElement() {
        return this.element;
    }

    @objid ("17ba7edb-ec49-4cc3-abd7-56c24240a59e")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("17d876bc-e3f4-446e-bd48-25051393caef")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaCommHost_Parameter_isSched", this.element);
    }

    @objid ("2808e041-1abf-46e8-9e63-7278686320bb")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_PARAMETER_SACOMMHOST_PARAMETER_ISSCHED, value);
    }

    @objid ("b13ecd7b-ab9d-43ef-9c2d-dd4eee4e87ea")
    public String getschSlack() {
        return ModelUtils.getTaggedValue("SaCommHost_Parameter_schSlack", this.element);
    }

    @objid ("117b6f81-5f00-43d4-8609-72a94a167421")
    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_PARAMETER_SACOMMHOST_PARAMETER_SCHSLACK, value);
    }

}
