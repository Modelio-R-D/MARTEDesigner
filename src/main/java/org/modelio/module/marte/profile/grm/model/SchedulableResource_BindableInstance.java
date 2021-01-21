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

@objid ("bfc1091d-52fd-4d0d-bafe-9912e86571c1")
public class SchedulableResource_BindableInstance {
    @objid ("82482257-b3c0-46e6-a4b7-de4119afdd4b")
    protected BindableInstance element;

    @objid ("7ab719b8-76bf-4260-8ce8-df34e931f570")
    public SchedulableResource_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULABLERESOURCE_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("SchedulableResource_BindableInstance"));
    }

    @objid ("618cf731-8ef8-442e-8929-d38da6006527")
    public SchedulableResource_BindableInstance(final BindableInstance element) {
        this.element = element;
    }

    @objid ("4ca04f3c-3478-4e71-af19-3c7e01c100b8")
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("72208a42-f6ad-4acc-9574-8dadb1fa4722")
    public void setParent(final Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("e8dd68b6-2fd2-4dba-9637-87134f93d912")
    public void setParent(final Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("063674bb-6965-487d-b058-90906d640c6c")
    public void setParent(final NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("6ede25d6-514c-4e8a-b4ab-808423b109b3")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("2b613a3b-30d1-4e02-9ba2-b04f6188bf3e")
    public String getschedParams() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS, this.element);
    }

    @objid ("3aa2ca5e-a79e-48c2-9011-5d3a6fc047dc")
    public void setschedParams(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS, value);
    }

    @objid ("d98b08cd-589c-474c-a844-4a1995f0ad43")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDULABLERESOURCE_INSTANCE_HOST, this.element);
    }

    @objid ("4335b44f-8a35-468e-879f-c798b96854d7")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDULABLERESOURCE_INSTANCE_HOST, value);
    }

    @objid ("3d0046ff-4966-4a3b-9f41-c690bef2b895")
    public String getdependentScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER, this.element);
    }

    @objid ("fe02b1c7-c1c9-4648-adce-07a9ae2ee599")
    public void setdependentScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER, value);
    }

}
