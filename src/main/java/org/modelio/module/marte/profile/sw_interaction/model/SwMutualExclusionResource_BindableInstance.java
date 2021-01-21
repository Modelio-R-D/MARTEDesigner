package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.MutualExclusionResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6e2edc36-d61b-426d-8f2a-cba6fc10ae97")
public class SwMutualExclusionResource_BindableInstance extends MutualExclusionResource_BindableInstance {
    @objid ("664a6d14-7ff1-4c7b-b104-a5ec95c1caa3")
    public SwMutualExclusionResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwMutualExclusionResource_BindableInstance"));
    }

    @objid ("3ee894de-5a7b-4eb3-a4db-711b027ddd06")
    public SwMutualExclusionResource_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("68e2ecc6-fa59-4f65-907f-c3f798e6b6d1")
    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM, this.element);
    }

    @objid ("7821d0ff-febb-4491-90b1-0aeb39331cbc")
    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM, value);
    }

    @objid ("584f9093-1892-4bc9-91d7-2c8f11ab8f09")
    public String getconcurrentAccessProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL, this.element);
    }

    @objid ("c5b204bf-912c-43b2-8ddb-2a0fd83cabdf")
    public void setconcurrentAccessProtocol(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL, value);
    }

    @objid ("c38333fc-c27f-4348-bbc5-83a17aec9ae2")
    public String getaccessTokenElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS, this.element);
    }

    @objid ("b9455c3b-8a66-482f-b067-51b59eb7dea3")
    public void setaccessTokenElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS, value);
    }

    @objid ("640ecabc-59eb-4e08-ba70-0b50ad4cd19e")
    public String getreleaseServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES, this.element);
    }

    @objid ("516c767c-9d6c-4a3b-a7fa-9a95c5f23a96")
    public void setreleaseServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES, value);
    }

    @objid ("21539cd3-403d-48f2-864e-854ac1cf6c25")
    public String getacquireServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES, this.element);
    }

    @objid ("9797f271-d252-437b-96ac-ce232e4c08ef")
    public void setacquireServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES, value);
    }

}
