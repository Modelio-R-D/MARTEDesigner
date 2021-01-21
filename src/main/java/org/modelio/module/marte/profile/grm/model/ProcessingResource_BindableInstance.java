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

@objid ("11516fc5-5220-4927-9059-edd5b0372818")
public class ProcessingResource_BindableInstance {
    @objid ("548c350f-d53a-476d-9cfc-a46e532c1278")
    protected BindableInstance element;

    @objid ("7df463a7-109d-47b5-8be2-daa9f907f6c9")
    public ProcessingResource_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PROCESSINGRESOURCE_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("ProcessingResource_BindableInstance"));
    }

    @objid ("9f770ce5-1e80-44f5-9a11-8d67a7b2e4fb")
    public ProcessingResource_BindableInstance(final BindableInstance element) {
        this.element = element;
    }

    @objid ("62f55c33-4647-45e1-a88a-67d1db9dbbd7")
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("adeb34d2-6634-4ea7-b78f-6a40b0a94a16")
    public void setParent(final Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("f5933d41-ade4-4ef7-b90f-618cd8899960")
    public void setParent(final Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("28971d02-c888-4e82-b064-d3123b2dcb64")
    public void setParent(final NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("ab1f40c2-3bc1-4c35-85ff-eb13f4f24d06")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("0668e386-53ac-4e47-9daf-813ccf73abf6")
    public String getspeedFactor() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_INSTANCE_PROCESSINGRESOURCE_INSTANCE_SPEEDFACTOR, this.element);
    }

    @objid ("579c311c-c0d5-4643-bb10-339d647ebe88")
    public void setspeedFactor(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_INSTANCE_PROCESSINGRESOURCE_INSTANCE_SPEEDFACTOR, value);
    }

    @objid ("6785a0fa-d6cc-4c6b-9f01-6c1ec16eb44b")
    public String getmainScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PROCESSINGRESOURCE_INSTANCE_PROCESSINGRESOURCE_INSTANCE_MAINSCHEDULER, this.element);
    }

    @objid ("f95557d0-34ef-417e-9219-4e52e14b29c2")
    public void setmainScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_INSTANCE_PROCESSINGRESOURCE_INSTANCE_MAINSCHEDULER, value);
    }

}
