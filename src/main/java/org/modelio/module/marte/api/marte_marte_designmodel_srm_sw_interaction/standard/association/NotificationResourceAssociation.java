/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << NotificationResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a14f42f1-8161-4db5-aa4e-e3435048bd59")
public class NotificationResourceAssociation extends SwSynchronizationResourceAssociation {
    @objid ("4a06f562-aa18-47f7-b754-7e09d6a1a16a")
    public static final String STEREOTYPE_NAME = "NotificationResource_Association";

    @objid ("6b049a8a-f7db-42d9-8354-bec674fa3cf8")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_CLEARSERVICES_TAGTYPE = "NotificationResource_Association_clearServices";

    @objid ("300dd0a7-33f9-43fc-8882-5327f576e3c2")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_FLUSHSERVICES_TAGTYPE = "NotificationResource_Association_flushServices";

    @objid ("40852a4b-18de-43dd-ab19-2461c7b560f5")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE = "NotificationResource_Association_maskElements";

    @objid ("72552bd8-3c30-46f9-85cf-3e2b74551b96")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE = "NotificationResource_Association_mechanism";

    @objid ("ea2998b3-116b-47ed-8193-706bde35d788")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCE_TAGTYPE = "NotificationResource_Association_occurence";

    @objid ("73c99c41-fde9-4954-830d-285f2c7b4d22")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCECOUNTELEMENTS_TAGTYPE = "NotificationResource_Association_occurenceCountElements";

    @objid ("0e3f829a-097d-4974-9750-2fbeb5d348c9")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_SIGNALSERVICES_TAGTYPE = "NotificationResource_Association_signalServices";

    @objid ("dfa81937-d3cf-4d7e-822e-45c4afeecc8c")
    public static final String NOTIFICATIONRESOURCE_ASSOCIATION_WAITSERVICES_TAGTYPE = "NotificationResource_Association_waitServices";

    /**
     * Tells whether a {@link NotificationResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << NotificationResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("35373ebf-7c4e-47dd-ba8c-6e85319e4318")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << NotificationResource_Association >> then instantiate a {@link NotificationResourceAssociation} proxy.
     * 
     * @return a {@link NotificationResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("f2c7e555-d5f1-4601-bf93-76f13972d7c7")
    public static NotificationResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NotificationResourceAssociation.STEREOTYPE_NAME);
        return NotificationResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link NotificationResourceAssociation} proxy from a {@link Association} stereotyped << NotificationResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link NotificationResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("c805fa6f-eea6-4946-936f-2a0012d414f4")
    public static NotificationResourceAssociation instantiate(final Association obj) {
        return NotificationResourceAssociation.canInstantiate(obj) ? new NotificationResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NotificationResourceAssociation} proxy from a {@link Association} stereotyped << NotificationResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link NotificationResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("afa54ed2-4a99-4a73-86d7-47171f993e45")
    public static NotificationResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (NotificationResourceAssociation.canInstantiate(obj))
        	return new NotificationResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("NotificationResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("149bd241-edeb-42c3-b4a2-38dbf13b77f5")
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
        NotificationResourceAssociation other = (NotificationResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("90e7a7d3-8204-48e5-bf70-1a9710fff468")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'NotificationResource_Association_clearServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8781c4bb-95aa-4b12-8635-fad6c709446d")
    public List<String> getNotificationResource_Association_clearServices() {
        return this.elt.getTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_CLEARSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Association_flushServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2ea844e2-b553-4881-9a5a-1f819c51b4c1")
    public List<String> getNotificationResource_Association_flushServices() {
        return this.elt.getTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_FLUSHSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Association_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("267fc456-9f63-41c0-abe6-847f4b3d5467")
    public List<String> getNotificationResource_Association_maskElements() {
        return this.elt.getTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Association_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f2e58ddd-0fae-45d8-a27a-de18f2ad28ad")
    public String getNotificationResource_Association_mechanism() {
        return this.elt.getTagValue(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NotificationResource_Association_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("709c7e43-224c-4a70-86d8-99ce3e03bd2f")
    public String getNotificationResource_Association_occurence() {
        return this.elt.getTagValue(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Association_occurenceCountElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7602d20c-93a5-4d13-8b95-a553f4fe59c8")
    public List<String> getNotificationResource_Association_occurenceCountElements() {
        return this.elt.getTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Association_signalServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b65635f0-74b5-4b74-a932-ad78af5fcd62")
    public List<String> getNotificationResource_Association_signalServices() {
        return this.elt.getTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_SIGNALSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NotificationResource_Association_waitServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f1880006-86bf-4d47-af02-1d92eeb7c79c")
    public List<String> getNotificationResource_Association_waitServices() {
        return this.elt.getTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_WAITSERVICES_TAGTYPE_ELT);
    }

    @objid ("962821f1-aa6d-4507-8e53-f645453c6700")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NotificationResource_Association_clearServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ca549872-e7ef-4b16-b04f-b52f4114e6c2")
    public void setNotificationResource_Association_clearServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_CLEARSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Association_flushServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d5f328d1-45ab-45b5-8959-903bfac0f8a0")
    public void setNotificationResource_Association_flushServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_FLUSHSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Association_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("22ba5f02-f09d-428a-bd91-7f321642b6ae")
    public void setNotificationResource_Association_maskElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'NotificationResource_Association_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b834bc42-b619-4c23-ba9c-d76f56a50744")
    public void setNotificationResource_Association_mechanism(final String value) {
        this.elt.putTagValue(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NotificationResource_Association_occurence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6e514957-f65b-48ac-9ee7-983c25698257")
    public void setNotificationResource_Association_occurence(final String value) {
        this.elt.putTagValue(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Association_occurenceCountElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b410e4e2-326d-4c18-9414-2f1fa1142924")
    public void setNotificationResource_Association_occurenceCountElements(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Association_signalServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b937c74b-1e44-4c4b-8265-718e094bf9c0")
    public void setNotificationResource_Association_signalServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_SIGNALSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'NotificationResource_Association_waitServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b9d16411-a883-473c-9dec-11c2dc58a7fb")
    public void setNotificationResource_Association_waitServices(final List<String> values) {
        this.elt.putTagValues(NotificationResourceAssociation.MdaTypes.NOTIFICATIONRESOURCE_ASSOCIATION_WAITSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("478a10cb-02b5-4a9c-a7ab-8abed5a73ad3")
    protected NotificationResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("8ee5a442-4f7b-4675-aee0-175cb59fe0f6")
    public static final class MdaTypes {
        @objid ("dd0a18c5-d9b0-4e49-b328-b65fa27abad5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0dade3c7-f515-49f6-8734-9b550a4a56b0")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCE_TAGTYPE_ELT;

        @objid ("a4919968-d2b0-4bbc-805e-98d96e092f2f")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT;

        @objid ("5669e3d5-f197-4436-b0bf-c474754d39fd")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT;

        @objid ("aeb5ac35-56c9-410d-9a36-eb76b00e8b8e")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("0abf78ff-0230-4a99-ad15-a4a3555dc10c")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_FLUSHSERVICES_TAGTYPE_ELT;

        @objid ("e1b33aea-749d-4535-8105-2ee85c601a38")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_SIGNALSERVICES_TAGTYPE_ELT;

        @objid ("40823754-99c7-4a7c-b0ba-ad2da19d2cb6")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_WAITSERVICES_TAGTYPE_ELT;

        @objid ("84fa9166-8954-478a-b9bc-b314ad66437b")
        public static TagType NOTIFICATIONRESOURCE_ASSOCIATION_CLEARSERVICES_TAGTYPE_ELT;

        @objid ("fe86a731-c260-45cf-a875-48aefaed150e")
        private static Stereotype MDAASSOCDEP;

        @objid ("15bca656-6be5-4e86-8d18-ca8f5bbae97c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e96df8f8-fcd7-4c5b-8502-29780c72424c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d2933aa0-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa5-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa6-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_OCCURENCECOUNTELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa7-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa8-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_FLUSHSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa1-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_SIGNALSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa2-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_WAITSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa3-10d8-11df-81d9-0014222a9f79");
            NOTIFICATIONRESOURCE_ASSOCIATION_CLEARSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2933aa4-10d8-11df-81d9-0014222a9f79");
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
