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

@objid ("27644dcb-8b0e-406b-91a4-c4cb09192266")
public class TimingResource_BindableInstance {
    @objid ("6a0b4b53-15e3-42fc-a3f9-5d499e078216")
    protected BindableInstance element;

    @objid ("9f462d9e-8886-4a51-990f-fff03d3553f3")
    public TimingResource_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMINGRESOURCE_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("TimingResource_BindableInstance"));
    }

    @objid ("3e70cd5b-2808-4a44-8b81-f01f836190ad")
    public TimingResource_BindableInstance(final BindableInstance element) {
        this.element = element;
    }

    @objid ("5ee9209e-8e71-4493-a9e8-141a0a95bb8b")
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("52cc3685-b410-4b03-b2f9-4e7435ebfe43")
    public void setParent(final Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("d9e46600-e984-4031-a309-1457b98b44a3")
    public void setParent(final Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("3e660ab7-4f5c-4571-877e-531b14f27d0a")
    public void setParent(final NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("5ecbd0c4-9692-472b-97e8-d83812f01245")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
