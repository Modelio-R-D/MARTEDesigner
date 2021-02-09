package org.modelio.module.marte.profile.sw_interaction.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.MutualExclusionResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwMutualExclusionResource_Node extends MutualExclusionResource_Node {
    public SwMutualExclusionResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER));
    }

    public SwMutualExclusionResource_Node(Node element) {
        super(element);
    }

    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM, this.element);
    }

    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM, value);
    }

    public String getconcurrentAccessProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL, this.element);
    }

    public void setconcurrentAccessProtocol(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL, value);
    }

    public String getaccessTokenElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS, this.element);
    }

    public void setaccessTokenElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS, value);
    }

    public String getreleaseServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES, this.element);
    }

    public void setreleaseServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES, value);
    }

    public String getacquireServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES, this.element);
    }

    public void setacquireServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES, value);
    }

    public enum MutualExclusionResourceKind {
        BooleanSemaphore,
        CountSemaphore,
        Mutex,
        Undef,
        Other;
    }

    public enum ConcurrentAccessProtocolKind {
        PIP,
        PCP,
        NoPreemption,
        Undef,
        Other;
    }

}
