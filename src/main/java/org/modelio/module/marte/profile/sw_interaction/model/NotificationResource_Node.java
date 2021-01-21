package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4d3683c4-0c64-469f-a8ed-c604cb41efec")
public class NotificationResource_Node extends SwSynchronizationResource_Node {
    @objid ("87a72e20-920b-47aa-acab-e88abc8c3e0e")
    public NotificationResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_CLASSIFIER));
    }

    @objid ("ffd19c37-c41a-4660-8fb1-f1efb5171edc")
    public NotificationResource_Node(Node element) {
        super(element);
    }

    @objid ("6ba36074-4b97-40a3-90a9-e11d9e140952")
    public String getoccurence() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE, this.element);
    }

    @objid ("941532db-88e2-48b1-9306-59112d25e3c7")
    public void setoccurence(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE, value);
    }

    @objid ("bfae33c7-95a0-4846-ae4d-80ca0cda4618")
    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM, this.element);
    }

    @objid ("354a91b3-2632-4091-a80f-a745f9a84131")
    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM, value);
    }

    @objid ("e4f9d322-ec75-4a44-83cf-07658cf9f42f")
    public String getoccurenceCountElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS, this.element);
    }

    @objid ("ad0f1519-90b5-4374-9653-451898e12da9")
    public void setoccurenceCountElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS, value);
    }

    @objid ("60f6d64c-ff88-43f9-8f2b-248ebffd46cc")
    public String getmaskElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS, this.element);
    }

    @objid ("cb9710d7-c28c-480c-943a-361020db49b2")
    public void setmaskElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS, value);
    }

    @objid ("8261ccfd-cf2d-4f76-8c6c-84f018d255c5")
    public String getflushServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES, this.element);
    }

    @objid ("9506bb1f-7492-482d-b9c3-a47c5f8e0211")
    public void setflushServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES, value);
    }

    @objid ("0d42df1d-9845-4227-a5b7-eac0a83a0cd6")
    public String getsignalServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES, this.element);
    }

    @objid ("9bdab1da-b3f0-4376-9fcc-b409cad55b6d")
    public void setsignalServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES, value);
    }

    @objid ("fc7b25ad-ba2e-4055-8aab-88e5bf4d9291")
    public String getwaitServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES, this.element);
    }

    @objid ("028221c7-1939-40f5-9efd-e3807e501c6a")
    public void setwaitServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES, value);
    }

    @objid ("8b93a843-794e-4751-b1ad-d67cd77ec15b")
    public String getclearServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES, this.element);
    }

    @objid ("91327d07-209a-4144-880a-b460db6166bd")
    public void setclearServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES, value);
    }

    @objid ("d0320b28-6c6c-44f2-a2e2-aed0f5f2ac59")
    public enum NotificationKind {
        Memorized,
        Bounded,
        Memoryless,
        Undef,
        Other;
    }

    @objid ("2780d72c-84f3-4e27-95e4-7d8f07adf364")
    public enum NotificationResourceKind {
        Event,
        Barrier,
        Undef,
        Other;
    }

}
