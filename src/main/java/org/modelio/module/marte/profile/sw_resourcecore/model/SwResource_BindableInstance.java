package org.modelio.module.marte.profile.sw_resourcecore.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Resource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("120ae0f9-7b49-41a0-a081-4f9cac87c77f")
public class SwResource_BindableInstance extends Resource_BindableInstance {
    @objid ("48d6ba4a-e492-46b3-a7e9-db4b3a898b25")
    public SwResource_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWRESOURCE_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("SwResource_BindableInstance"));
    }

    @objid ("8b034a76-6738-490e-9b36-e87174ce5b47")
    public SwResource_BindableInstance(BindableInstance element) {
        this.element = element;
    }

    @objid ("e8589079-6372-4be3-9cf4-8ae7acd7b4ea")
    @Override
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("ca30c9b1-ef1e-41f9-a7f7-6bf433f6c731")
    @Override
    public void setParent(Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("b22561f5-9e8a-456d-aca2-9ec948de0423")
    @Override
    public void setParent(Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("e881ed7c-fb07-4ce6-a893-a0e87f342827")
    @Override
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("a2d8f6d0-c274-4e5a-9e9b-340990138d77")
    @Override
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("59f2fd79-b666-4dbe-951c-a68be0fd84bc")
    public String getidentifierElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS, this.element);
    }

    @objid ("f5802b9e-0fb3-497f-a2fc-7fc2df9ee3db")
    public void setidentifierElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS, value);
    }

    @objid ("715e380e-a452-435a-86de-1f36c5f1d4dc")
    public String getstateElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_STATEELEMENTS, this.element);
    }

    @objid ("0a274f89-a0cc-442d-a214-05de193ae276")
    public void setstateElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_STATEELEMENTS, value);
    }

    @objid ("879595eb-61ae-4609-845a-fca4ced0876b")
    public String getmemorySizeFootprint() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT, this.element);
    }

    @objid ("d5f736d4-013f-4980-80dc-178cf78c000d")
    public void setmemorySizeFootprint(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT, value);
    }

    @objid ("8d1d4dd8-3162-4fc8-a886-0a6a48fc0d21")
    public String getcreateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_CREATESERVICES, this.element);
    }

    @objid ("3c421eea-88ef-40ed-87f3-2b7a7211ad71")
    public void setcreateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_CREATESERVICES, value);
    }

    @objid ("15773ffd-19fa-4810-b8c8-5db798238bed")
    public String getdeleteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_DELETESERVICES, this.element);
    }

    @objid ("32578dbb-e1c4-4853-ba42-e78e20532b5e")
    public void setdeleteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_DELETESERVICES, value);
    }

    @objid ("cc027928-a613-4133-aba6-f38b01cf2bb2")
    public String getinitializeServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_INITIALIZESERVICES, this.element);
    }

    @objid ("56a6cc51-b2b2-44bc-b785-a18cef468489")
    public void setinitializeServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_INITIALIZESERVICES, value);
    }

}
