package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9e09d793-6741-4b7e-a3c4-84f490ca2ab3")
public class Resource_Instance {
    @objid ("e359b9b7-666f-4e48-92cd-857361ae957f")
    protected Instance element;

    @objid ("7e65455b-01fe-4db3-a677-9b47b76de288")
    public Resource_Instance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RESOURCE_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("Resource_Instance"));
    }

    @objid ("bb093277-50a6-4a66-af62-6046c2616b20")
    public Resource_Instance(final Instance element) {
        this.element = element;
    }

    @objid ("5c6d88e1-2a6b-40af-a794-f21860ad3477")
    public Instance getElement() {
        return this.element;
    }

    @objid ("9878657b-bb2f-4102-8874-9576dcd0aff5")
    public void setParent(final NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("2f2641d9-9641-41b9-a228-021acaf0f565")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("7c28b703-db88-4cc7-a9b8-dd05d4b89533")
    public String getresMult() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_INSTANCE_RESOURCE_INSTANCE_RESMULT, this.element);
    }

    @objid ("42ced6a5-c184-4336-a5f3-ecf8f4297034")
    public void setresMult(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_INSTANCE_RESOURCE_INSTANCE_RESMULT, value);
    }

    @objid ("39e59288-8aab-4a58-909d-910c35207dc4")
    public boolean isisProtected() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_INSTANCE_RESOURCE_INSTANCE_ISPROTECTED, this.element);
    }

    @objid ("0ca1affc-e1e9-48ef-8e25-74485a9b7a83")
    public void isisProtected(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_INSTANCE_RESOURCE_INSTANCE_ISPROTECTED,value);
    }

    @objid ("261c6eda-ba53-4612-9738-5ff565588d9f")
    public boolean isisActive() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_INSTANCE_RESOURCE_INSTANCE_ISACTIVE, this.element);
    }

    @objid ("718c0b1f-be08-452f-b6d5-d47a595a78e3")
    public void isisActive(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_INSTANCE_RESOURCE_INSTANCE_ISACTIVE,value);
    }

}
