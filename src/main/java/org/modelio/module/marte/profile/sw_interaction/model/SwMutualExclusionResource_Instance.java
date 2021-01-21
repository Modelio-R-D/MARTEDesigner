package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.MutualExclusionResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("48fe7855-7eef-4da0-a225-8fa62eeeb3e2")
public class SwMutualExclusionResource_Instance extends MutualExclusionResource_Instance {
    @objid ("75001a36-7aad-4da9-a1b2-afa9fa15a8f2")
    public SwMutualExclusionResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwMutualExclusionResource_Instance"));
    }

    @objid ("376237d4-d444-40ee-a016-0737c7ca3fde")
    public SwMutualExclusionResource_Instance(Instance element) {
        super(element);
    }

    @objid ("4b350e35-4134-4e55-830e-cd62db433789")
    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM, this.element);
    }

    @objid ("675ca34c-1103-4608-beb0-9de153c3b56d")
    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM, value);
    }

    @objid ("c2952e8c-ce74-44f1-b259-4c115e0f2e10")
    public String getconcurrentAccessProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL, this.element);
    }

    @objid ("cf6294ca-6c0c-4a09-a01b-889103d72aed")
    public void setconcurrentAccessProtocol(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL, value);
    }

    @objid ("48b3b92b-b608-4645-9749-677c2efa0316")
    public String getaccessTokenElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS, this.element);
    }

    @objid ("c2429833-51fb-4a8e-a76e-1c30539536c2")
    public void setaccessTokenElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS, value);
    }

    @objid ("6406fba3-e182-483b-99de-2d55e8943a08")
    public String getreleaseServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES, this.element);
    }

    @objid ("87f1453f-bc9e-46cc-b2a3-99313df0bd16")
    public void setreleaseServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES, value);
    }

    @objid ("cef20365-4f6c-45f7-a9f1-710d16442d53")
    public String getacquireServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES, this.element);
    }

    @objid ("09f74a85-c141-4e9b-9a56-16cfe6a84db3")
    public void setacquireServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES, value);
    }

    @objid ("73838fca-84ca-4ad2-8e13-3b4fee06bbfe")
    public enum MutualExclusionResourceKind {
        BooleanSemaphore,
        CountSemaphore,
        Mutex,
        Undef,
        Other;
    }

    @objid ("4377f440-1562-4368-8fa3-861a7b8453b8")
    public enum ConcurrentAccessProtocolKind {
        PIP,
        PCP,
        NoPreemption,
        Undef,
        Other;
    }

}
