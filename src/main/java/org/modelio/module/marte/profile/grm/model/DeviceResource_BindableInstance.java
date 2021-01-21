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

@objid ("2786d056-7f08-4134-8019-964fab58761c")
public class DeviceResource_BindableInstance {
    @objid ("410f6cc3-f4d7-48bf-b6f8-f6b0bc9d4762")
    protected BindableInstance element;

    @objid ("10863112-6f37-4c8c-9309-18ad6643622d")
    public DeviceResource_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICERESOURCE_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("DeviceResource_BindableInstance"));
    }

    @objid ("d2718ceb-4508-49b9-955a-d71c45341e35")
    public DeviceResource_BindableInstance(final BindableInstance element) {
        this.element = element;
    }

    @objid ("6a70b5fa-8b08-4bc5-b861-0581785034d9")
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("d7e6c4a1-6232-4792-9bbc-0617571c6390")
    public void setParent(final Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("a65b4663-3cb5-4076-be1e-c01470d3d2f3")
    public void setParent(final Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("67103f94-257e-47b5-a0f4-de36c135cf05")
    public void setParent(final NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("27cca4fe-86ca-4018-a5bc-8569d631c8f2")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
