package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a166e81a-4dbf-4457-869e-e538a2a7c935")
public class Resource_Class {
    @objid ("e670b1f7-3623-41a9-b6ab-5e12604cea56")
    protected Class element;

    @objid ("73bf504f-be81-4e71-bf56-769cfcb0b5a0")
    public Resource_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RESOURCE_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.RESOURCE_CLASSIFIER));
    }

    @objid ("ad7099fa-587c-4e4c-ae15-fe2b60c84eb1")
    public Resource_Class(final Class element) {
        this.element = element;
    }

    @objid ("c792226a-bb62-453f-b4d3-e09527c9679b")
    public Class getElement() {
        return this.element;
    }

    @objid ("743ae6e4-6ff9-45a5-ad20-ff7130315733")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("c74078e7-ce12-4c07-ae92-6d2de2499216")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("c9aa2bee-e0e1-4236-9f54-7af368d546a2")
    public String getresMult() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_RESMULT, this.element);
    }

    @objid ("e160a376-0009-40f3-a961-b8ffc4817f75")
    public void setresMult(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_RESMULT, value);
    }

    @objid ("dc8e8808-668c-4d04-a1bf-ce2c99fee55a")
    public boolean isisProtected() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISPROTECTED, this.element);
    }

    @objid ("f0895af4-46db-4883-8299-b6405201f956")
    public void isisProtected(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISPROTECTED,value);
    }

    @objid ("f5c818ad-16d3-42e5-8285-e704f7057889")
    public boolean isisActive() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISACTIVE, this.element);
    }

    @objid ("4200f587-f7c8-4202-8f50-a75b15ce38e0")
    public void isisActive(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISACTIVE,value);
    }

}
