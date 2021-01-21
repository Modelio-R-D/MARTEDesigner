/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << NotificationResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("611e233e-e650-4a89-b42a-85036a9c9da2")
public class NotificationResourceClassifier extends SwSynchronizationResourceClassifier {
    @objid ("fc3ffacc-878c-46e4-a47e-dd4fb8e7c879")
    public static final String STEREOTYPE_NAME = "NotificationResource_Classifier";

    @objid ("ef22d1f4-894d-450d-a16e-31be7cdd5a4d")
    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES_TAGTYPE = "NotificationResource_Classifier_clearServices";

    @objid ("5326b57d-247e-4a84-9e03-370cf34991d3")
    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES_TAGTYPE = "NotificationResource_Classifier_flushServices";

    @objid ("90279655-eceb-4c41-9745-6f441e2085f5")
    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE = "NotificationResource_Classifier_maskElements";

    @objid ("6067d2bc-c3ee-491c-9301-78e89fe388d3")
    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE = "NotificationResource_Classifier_mechanism";

    @objid ("b0daaae3-62e7-4d6c-930e-fb5cacc442d8")
    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE_TAGTYPE = "NotificationResource_Classifier_occurence";

    @objid ("fe3624f9-a69b-407b-991e-130b23a85df7")
    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_Classifier_occurenceCountElements";

    @objid ("1e4c240a-1476-4dcc-8240-b6bf6fa9b4f2")
    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES_TAGTYPE = "NotificationResource_Classifier_signalServices";

    @objid ("2d20efd9-468d-42b0-a821-828d56308851")
    public static final String NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES_TAGTYPE = "NotificationResource_Classifier_waitServices";

    /**
     * Tells whether a {@link NotificationResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << NotificationResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("aaf5d8c4-efb3-4363-91c3-052fba686e98")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << NotificationResource_Classifier >> then instantiate a {@link NotificationResourceClassifier} proxy.
     * 
     * @return a {@link NotificationResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("6b5010b5-cd25-4563-a554-2a16dbdd8301")
    public static NotificationResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceClassifier.STEREOTYPE_NAME);
        return NotificationResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceClassifier} proxy from a {@link Classifier} stereotyped << NotificationResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link NotificationResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("c33dfbe6-52a8-457b-badf-66549bbc0958")
    public static NotificationResourceClassifier instantiate(final Classifier obj) {
        return NotificationResourceClassifier.canInstantiate(obj) ? new NotificationResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NotificationResourceClassifier} proxy from a {@link Classifier} stereotyped << NotificationResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link NotificationResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4f5c0f8d-64dd-4928-934f-086ae0ec4599")
    public static NotificationResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (NotificationResourceClassifier.canInstantiate(obj))
        	return new NotificationResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6f51b136-974b-4ecd-88d2-f7beafebf2e5")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        NotificationResourceClassifier other = (NotificationResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("19b36466-1c1a-4f44-9417-829f669aeecb")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_Classifier_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e11fb799-13b4-4c56-bf57-03f8bc19013e")
    public List<String> getNotificationResource_Classifier_clearServices() {
        return this.elt.getTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Classifier_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a9a0e8bd-ba2f-4e25-8956-372c6ba6a826")
    public List<String> getNotificationResource_Classifier_flushServices() {
        return this.elt.getTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Classifier_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f5943f83-4bb6-4275-aadb-37405cccc043")
    public List<String> getNotificationResource_Classifier_maskElements() {
        return this.elt.getTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Classifier_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d06ddfc6-bd44-42d0-8a30-2462cf14190a")
    public String getNotificationResource_Classifier_mechanism() {
        return this.elt.getTagValue(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Classifier_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da1b8b0f-0ea4-494b-ab4f-59ee97a19961")
    public String getNotificationResource_Classifier_occurence() {
        return this.elt.getTagValue(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Classifier_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("295a93ff-c187-4a9d-b214-0c86cbf4df64")
    public List<String> getNotificationResource_Classifier_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Classifier_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0f8dbe19-8296-495d-9fee-f9aa15a06b45")
    public List<String> getNotificationResource_Classifier_signalServices() {
        return this.elt.getTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Classifier_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1d09875b-6c52-4d66-b920-9b5f4614ee77")
    public List<String> getNotificationResource_Classifier_waitServices() {
        return this.elt.getTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES_TAGTYPE_ELT);
    }

    @objid ("4ed05ed9-51fb-430c-ad9e-7cfc793a0a8f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_Classifier_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d8d7b8c8-f3b3-4f1a-b909-98a0970927ce")
    public void setNotificationResource_Classifier_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Classifier_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("921d1717-b66a-438c-9ba0-10d1cf19da49")
    public void setNotificationResource_Classifier_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Classifier_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("92777f66-6d81-4120-adf3-963ed51fea63")
    public void setNotificationResource_Classifier_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_Classifier_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b9707d66-05a8-49fa-ade3-011b67543bc5")
    public void setNotificationResource_Classifier_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_Classifier_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cd9048d2-3500-485e-85da-e7c4ac2b5fd3")
    public void setNotificationResource_Classifier_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Classifier_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0967007e-7ef9-4bca-9edb-b69b25da1bb3")
    public void setNotificationResource_Classifier_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Classifier_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("93da9270-d510-4f58-8f2c-d340fb97a75d")
    public void setNotificationResource_Classifier_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Classifier_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ae5efa24-f73f-412a-9552-5615bba1f23b")
    public void setNotificationResource_Classifier_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceClassifier.MdaTypes.NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("fe6a5291-68a0-4c50-a906-3610604693c1")
    protected NotificationResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("da17be08-52b5-41ed-8c8f-fbe4a1227501")
    public static final class MdaTypes {
        @objid ("78def751-0b32-4b5f-8866-ee3d6f6b111f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("658f06ae-85d6-4946-b691-29dc5720139b")
        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE_TAGTYPE_ELT;

        @objid ("a69728b2-df89-4cc4-aeca-666439221a69")
        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT;

        @objid ("9bccdfd2-7442-448e-8ff8-fbc796747afc")
        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        @objid ("e888541a-db40-46ad-86fc-dbb28a208176")
        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("413562d0-172b-48e4-9c98-719e0dcba179")
        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES_TAGTYPE_ELT;

        @objid ("008a0094-e14d-4e73-8c9d-3cdeb884fa1e")
        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES_TAGTYPE_ELT;

        @objid ("970d4272-096f-4001-bd10-6abb902155aa")
        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES_TAGTYPE_ELT;

        @objid ("bbc4da3e-1901-4d3f-923a-a4dae3bf1240")
        public static TagType NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES_TAGTYPE_ELT;

        @objid ("25de5b65-eb2d-4965-9edd-cf0f7d75b2a7")
        private static Stereotype MDAASSOCDEP;

        @objid ("11dd0750-d5d3-4a60-9f6e-eb538492a642")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("295618cb-25da-458d-b643-88f62fdee7fb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d2d13812-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d13817-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d13818-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d13819-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d1381a-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d13813-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d13814-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d13815-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2d13816-10d8-11df-81d9-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
