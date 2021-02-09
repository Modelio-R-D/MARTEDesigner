package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class StorageResource_BindableInstance {
    protected BindableInstance element;

    public StorageResource_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.STORAGERESOURCE_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("StorageResource_BindableInstance"));
    }

    public StorageResource_BindableInstance(final BindableInstance element) {
        this.element = element;
    }

    public BindableInstance getElement() {
        return this.element;
    }

    public void setParent(final Instance parent) {
        this.element.setCluster(parent);
    }

    public void setParent(final Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    public void setParent(final NameSpace parent) {
        this.element.setOwner(parent);
    }

    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_INSTANCE_STORAGERESOURCE_INSTANCE_ELEMENTSIZE, this.element);
    }

    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.STORAGERESOURCE_INSTANCE_STORAGERESOURCE_INSTANCE_ELEMENTSIZE, value);
    }

}
