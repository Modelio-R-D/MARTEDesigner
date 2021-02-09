package org.modelio.module.marte.profile.sw_interaction.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.MutualExclusionResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwMutualExclusionResource_BindableInstance extends MutualExclusionResource_BindableInstance {
    public SwMutualExclusionResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwMutualExclusionResource_BindableInstance"));
    }

    public SwMutualExclusionResource_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM, this.element);
    }

    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM, value);
    }

    public String getconcurrentAccessProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL, this.element);
    }

    public void setconcurrentAccessProtocol(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL, value);
    }

    public String getaccessTokenElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS, this.element);
    }

    public void setaccessTokenElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS, value);
    }

    public String getreleaseServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES, this.element);
    }

    public void setreleaseServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES, value);
    }

    public String getacquireServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES, this.element);
    }

    public void setacquireServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES, value);
    }

}
