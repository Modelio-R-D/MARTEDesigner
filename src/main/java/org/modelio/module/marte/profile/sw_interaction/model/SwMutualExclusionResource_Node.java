package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.MutualExclusionResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("daebc0df-1e39-4e10-a5f6-0c2160e28573")
public class SwMutualExclusionResource_Node extends MutualExclusionResource_Node {
    @objid ("708a87a6-7202-45d7-bd66-569fe270fbab")
    public SwMutualExclusionResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER));
    }

    @objid ("49d6b7ad-d329-46a9-91ae-cfe643ea862a")
    public SwMutualExclusionResource_Node(Node element) {
        super(element);
    }

    @objid ("8953fa85-ae85-41cb-bae9-01ce85170984")
    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM, this.element);
    }

    @objid ("e83c0703-f38f-49ff-b80a-3cf57dbd46fd")
    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM, value);
    }

    @objid ("ccc79b34-09b6-4060-9da6-062da87be35a")
    public String getconcurrentAccessProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL, this.element);
    }

    @objid ("f3767f17-906d-494e-adce-5e1f92d23c19")
    public void setconcurrentAccessProtocol(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL, value);
    }

    @objid ("d137b8b9-8578-4d52-b442-6dd726947984")
    public String getaccessTokenElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS, this.element);
    }

    @objid ("d85b45ed-e5fe-47ef-b0fd-851983d130ec")
    public void setaccessTokenElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS, value);
    }

    @objid ("7a3b63b1-0fc4-4c49-a6df-f412b3455aca")
    public String getreleaseServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES, this.element);
    }

    @objid ("d5a1d373-da46-4a35-be38-f614d27ff5c4")
    public void setreleaseServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES, value);
    }

    @objid ("0ce05ffd-21bd-4529-8ccc-e007a0b15c3b")
    public String getacquireServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES, this.element);
    }

    @objid ("4bb7a938-5a53-4c2d-a86b-b24cefe67680")
    public void setacquireServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES, value);
    }

    @objid ("c7271b28-8575-4664-8f1e-dba9649a8254")
    public enum MutualExclusionResourceKind {
        BooleanSemaphore,
        CountSemaphore,
        Mutex,
        Undef,
        Other;
    }

    @objid ("05205322-bdd3-426c-aee8-187aaa1cbd5c")
    public enum ConcurrentAccessProtocolKind {
        PIP,
        PCP,
        NoPreemption,
        Undef,
        Other;
    }

}
