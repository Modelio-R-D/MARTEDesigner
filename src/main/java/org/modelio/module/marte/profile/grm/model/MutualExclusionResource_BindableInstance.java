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

@objid ("95ad949a-b475-4f1f-9f56-77e09281f246")
public class MutualExclusionResource_BindableInstance {
    @objid ("2a1ee2a7-37ba-4164-9677-37f84b3269ef")
    protected BindableInstance element;

    @objid ("d45a137a-d14b-4159-bdbc-7f51aeed710e")
    public MutualExclusionResource_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("MutualExclusionResource_BindableInstance"));
    }

    @objid ("c70ea31c-997f-4249-818a-5d316e156c90")
    public MutualExclusionResource_BindableInstance(final BindableInstance element) {
        this.element = element;
    }

    @objid ("3e6b6ffe-7bed-4175-9e60-5abbd9ab8c02")
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("b47843e1-961e-49c0-b79f-04d2cc39a0d4")
    public void setParent(final Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("0d7ce109-9e66-423d-9309-ba410c0e6264")
    public void setParent(final Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("7d6455a0-fd52-4e9a-9be9-2d634ea4c8e0")
    public void setParent(final NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("74638d3c-0f8d-4a48-8db8-2942505d3bae")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("323de984-b2ad-4411-8548-b1ffcbbd975a")
    public String getprotectKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND, this.element);
    }

    @objid ("a4c57b22-fc39-4151-8899-d95f7cc78545")
    public void setprotectKind(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND, value);
    }

    @objid ("343217d2-3f29-4afd-9362-5c9ebe9d8520")
    public String getceiling() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING, this.element);
    }

    @objid ("7c0ffb30-29e8-438b-80e6-f0a1fb27c31a")
    public void setceiling(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING, value);
    }

    @objid ("d4881adb-e869-4f3e-99b8-160b9e1e3964")
    public String getotherProtectProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL, this.element);
    }

    @objid ("0a5c9a5b-5c21-4ac0-b28d-d091bde7de81")
    public void setotherProtectProtocol(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL, value);
    }

    @objid ("78c5e59c-a3b8-4476-b205-2b63213aeb78")
    public String getscheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER, this.element);
    }

    @objid ("9263bdf3-ede7-4bdc-bdca-213e605d13e4")
    public void setscheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER, value);
    }

}
