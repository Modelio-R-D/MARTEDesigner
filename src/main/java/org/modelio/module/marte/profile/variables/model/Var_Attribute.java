package org.modelio.module.marte.profile.variables.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9058ef8e-6d3e-4cfb-9c00-579bbb47f4d1")
public class Var_Attribute {
    @objid ("3d1fee75-b4e4-49e3-8e15-fff70207a284")
    protected Attribute element;

    @objid ("d3938ba6-11dd-4eb4-9e44-e37088f40d6e")
    public Var_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.VAR_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("Var_Attribute"));
    }

    @objid ("6329a1cf-79a3-474e-804a-24515190f68d")
    public Var_Attribute(Attribute element) {
        this.element = element;
    }

    @objid ("38e98d76-3fdc-4382-8046-5ca75c9ddee0")
    public Attribute getElement() {
        return this.element;
    }

    @objid ("4efe4f5f-fef7-4fe7-a5d6-f14c240e8beb")
    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    @objid ("b7aa4947-f606-401c-87cf-7718f2226eed")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("3a611934-0f60-469d-ba99-721909c1f4a2")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("2d3d355a-44c9-4175-8218-9ceff7b53f56")
    public String getdir() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.VAR_ATTRIBUTE_VAR_ATTRIBUTE_DIR, this.element);
    }

    @objid ("62241005-791d-4a0b-be0d-3a9f5e725561")
    public void setdir(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.VAR_ATTRIBUTE_VAR_ATTRIBUTE_DIR, value);
    }

}
