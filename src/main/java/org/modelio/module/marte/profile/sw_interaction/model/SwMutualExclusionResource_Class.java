package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.MutualExclusionResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4f189825-61f9-4397-bcf7-42bb803a380d")
public class SwMutualExclusionResource_Class extends MutualExclusionResource_Class {
    @objid ("e7b6aa65-4287-4d3c-89cb-c73339d22142")
    public SwMutualExclusionResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER));
    }

    @objid ("91775a0f-f306-43a7-a153-e487fa2c26c3")
    public SwMutualExclusionResource_Class(Class element) {
        super(element);
    }

    @objid ("d31bd000-ef26-4ee9-b88f-4dd03732d9d6")
    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM, this.element);
    }

    @objid ("b71fbdb3-8a4a-43fd-9609-5a1b156a9e6c")
    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM, value);
    }

    @objid ("85619891-4912-4106-ae55-6f7bbf901b97")
    public String getconcurrentAccessProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL, this.element);
    }

    @objid ("f9df75de-1f52-4f43-8207-9e4d10a4f32a")
    public void setconcurrentAccessProtocol(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL, value);
    }

    @objid ("218fe339-34d1-4b55-9be6-6e161a2d03e1")
    public String getaccessTokenElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS, this.element);
    }

    @objid ("881e42b5-5f55-4725-953a-79fd8d867988")
    public void setaccessTokenElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS, value);
    }

    @objid ("aa2cdbcc-1da3-437d-a302-45fb3310ce0d")
    public String getreleaseServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES, this.element);
    }

    @objid ("71fb0142-9bdb-4a68-8234-9a0c434c94e2")
    public void setreleaseServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES, value);
    }

    @objid ("efdf343b-32a7-48a2-901d-9959b9354dfe")
    public String getacquireServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES, this.element);
    }

    @objid ("8e62a9d4-cf60-4e39-847b-b116d8d370e9")
    public void setacquireServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES, value);
    }

    @objid ("3405b70f-19b5-4bae-af8a-cfcdff6c2ceb")
    public enum MutualExclusionResourceKind {
        BooleanSemaphore,
        CountSemaphore,
        Mutex,
        Undef,
        Other;
    }

    @objid ("b89717bc-bde6-460b-86ad-37beaf6da52d")
    public enum ConcurrentAccessProtocolKind {
        PIP,
        PCP,
        NoPreemption,
        Undef,
        Other;
    }

}
