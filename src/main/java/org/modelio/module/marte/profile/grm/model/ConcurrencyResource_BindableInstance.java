package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("54b17f5e-fa81-4b8f-9055-68df1a433de1")
public class ConcurrencyResource_BindableInstance {
    @objid ("d6197e73-d2af-40f4-8f0c-9c64ea244282")
    protected BindableInstance element;

    @objid ("260fa6d8-ed76-4f2b-9d38-be4367a77e3d")
    public ConcurrencyResource_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONCURRENCYRESOURCE_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("ConcurrencyResource_BindableInstance"));
    }

    @objid ("892215fb-0e2b-482d-96fe-6840c5a08550")
    public ConcurrencyResource_BindableInstance(final BindableInstance element) {
        this.element = element;
    }

    @objid ("592e7e18-019f-47f5-8ecb-5378c807ce56")
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("631953e9-35d7-49fb-ad42-bc935962337b")
    public void setParent(final Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("fb5db0f1-cf7e-434c-b99d-1b9a374eef1c")
    public void setParent(final Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("1402d64c-94cf-4be2-905e-2335f28c3ecb")
    public void setParent(final NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("b9325f71-3412-4537-8bf9-e3082fb88887")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
