package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("6633a13d-b0ec-47d6-891e-0ca103e7f146")
public class StorageResource_BindableInstance {
    @objid ("e45feb98-fefe-40dc-8767-2d8e3afcc466")
    protected BindableInstance element;

    @objid ("7cfd2cfb-e334-463d-8f8b-e571e31dbc7e")
    public StorageResource_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.STORAGERESOURCE_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("StorageResource_BindableInstance"));
    }

    @objid ("390a1117-e6a6-48f7-a47c-65286d1fd53c")
    public StorageResource_BindableInstance(final BindableInstance element) {
        this.element = element;
    }

    @objid ("1e61abba-51a6-416e-a115-711de6e59810")
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("6be9e8e1-16ae-4302-a0d1-38e4027f1480")
    public void setParent(final Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("761fee9d-ab18-4ea0-b13a-7b6447ee2b34")
    public void setParent(final Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("34c08ecf-64b7-41dc-97d4-7f565cf2e499")
    public void setParent(final NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("048ee1db-f1fd-4b30-86ac-41b21cd8cdd0")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("78bf8220-c975-479b-97a6-f772ace6ec66")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_INSTANCE_STORAGERESOURCE_INSTANCE_ELEMENTSIZE, this.element);
    }

    @objid ("e8b6f42c-8c01-4919-810b-701b2257248e")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.STORAGERESOURCE_INSTANCE_STORAGERESOURCE_INSTANCE_ELEMENTSIZE, value);
    }

}
