package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("199d4f7f-d06a-4852-8462-12d417164153")
public class Resource_Parameter {
    @objid ("3fc5d4ee-bc1a-41c4-ad70-a43ee5e9fd55")
    protected Parameter element;

    @objid ("949bdd39-2cc7-48c2-8d66-8fdfc76b2975")
    public Resource_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RESOURCE_PARAMETER);
        this.element.setName(MARTEResourceManager.getName("Resource_Parameter"));
    }

    @objid ("33c192bf-9f78-433b-bcab-f6557b4d183f")
    public Resource_Parameter(final Parameter element) {
        this.element = element;
    }

    @objid ("4af1557d-0d3e-485e-95df-8c12a685db91")
    public Parameter getElement() {
        return this.element;
    }

    @objid ("2d637d04-42bb-4be6-83a7-ead42f0ba025")
    public void setParent(final Operation parent) {
        this.element.setComposed(parent);
    }

    @objid ("4ee8fb95-8ab5-4f0c-a70f-ef6016c9ca26")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("1ae24b5c-82e0-4c52-ad94-d01006236ef4")
    public String getresMult() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_RESMULT, this.element);
    }

    @objid ("65eedd37-0bc2-476d-ba13-2d063dcc6838")
    public void setresMult(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_RESMULT, value);
    }

    @objid ("772bb19d-0e04-4a0a-b20f-718a287e0c53")
    public boolean isisProtected() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISPROTECTED, this.element);
    }

    @objid ("bf0fa8e4-eed6-4b32-8571-80eb5bda6285")
    public void isisProtected(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISPROTECTED,value);
    }

    @objid ("3b236af2-6517-47d6-afa5-a031d7a8608a")
    public boolean isisActive() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISACTIVE, this.element);
    }

    @objid ("dfe15d1c-f6a0-4aa8-808d-89a88fe54b76")
    public void isisActive(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISACTIVE,value);
    }

}
