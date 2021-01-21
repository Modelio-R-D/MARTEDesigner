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
 * Proxy class to handle a {@link Association} with << SwMutualExclusionResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("bcfde5d3-93b0-486d-bfcd-bc2816ea7550")
public class SwMutualExclusionResourceAssociation extends SwSynchronizationResourceAssociation {
    @objid ("f2a47f60-57ec-425e-91a4-daa4cf1027a1")
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_Association";

    @objid ("8c5f436d-aa62-4030-833e-8425c2e6472f")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_Association_accessTokenElements";

    @objid ("e995aefb-8eb9-435d-a21c-f4171b4e8edd")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_Association_acquireServices";

    @objid ("ec49ef32-1a9b-46eb-824b-f591114ab8a9")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE = "SwMutualExclusionResource_Association_ceiling";

    @objid ("8aa97e94-417a-471f-9d85-bf70bb6f8b4f")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Association_concurrentAccessProtocol";

    @objid ("4fad2de9-b329-4c05-a714-9a0df16405eb")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE = "SwMutualExclusionResource_Association_mechanism";

    @objid ("776def2b-5105-44ab-94ec-c3a9099c7967")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Association_otherProtectProtocol";

    @objid ("0bb53a6c-612e-4495-9380-5d4783168acf")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_Association_protectKind";

    @objid ("98f84114-dcef-4573-aa3b-d4787a88e758")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_Association_releaseServices";

    @objid ("bdf57e81-a6cd-4036-bf11-bec491eb7cdf")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_Association_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwMutualExclusionResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6d013198-1518-411f-9ce0-501bc29c4cbc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwMutualExclusionResource_Association >> then instantiate a {@link SwMutualExclusionResourceAssociation} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("2c79a45b-56d9-4a93-944d-d8fa8b942cf4")
    public static SwMutualExclusionResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceAssociation.STEREOTYPE_NAME);
        return SwMutualExclusionResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceAssociation} proxy from a {@link Association} stereotyped << SwMutualExclusionResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwMutualExclusionResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("2ae69de3-f62c-4af5-82d5-7aa3d0c44dbe")
    public static SwMutualExclusionResourceAssociation instantiate(final Association obj) {
        return SwMutualExclusionResourceAssociation.canInstantiate(obj) ? new SwMutualExclusionResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceAssociation} proxy from a {@link Association} stereotyped << SwMutualExclusionResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SwMutualExclusionResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7bdf3c36-e894-488a-8453-6b25e9cef4ad")
    public static SwMutualExclusionResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceAssociation.canInstantiate(obj))
        	return new SwMutualExclusionResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e38daca7-b4b6-47e9-9500-2ba55d5be47f")
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
        SwMutualExclusionResourceAssociation other = (SwMutualExclusionResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("a252bd5a-9413-4479-8289-8bbd0c57f790")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Association_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7288e154-7b94-4e66-a525-9fc294e636d7")
    public List<String> getSwMutualExclusionResource_Association_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Association_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ef78ee22-9c72-4714-94a7-35c69e23835e")
    public List<String> getSwMutualExclusionResource_Association_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Association_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b03644b9-395e-407c-a5e7-0b11da6ccb54")
    public String getSwMutualExclusionResource_Association_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Association_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a6da8db-ea4c-4941-a7ca-773e0adc0eef")
    public String getSwMutualExclusionResource_Association_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Association_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("132dbd4f-d070-4035-bcd6-55391bb73a23")
    public String getSwMutualExclusionResource_Association_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Association_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("77e302cb-3b63-45d9-a1c4-1db236b3fb27")
    public String getSwMutualExclusionResource_Association_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Association_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("54563294-1067-4a77-bfc5-8e6fd4e0cc3b")
    public String getSwMutualExclusionResource_Association_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Association_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b41148b8-985c-48c6-b92e-957a4f177289")
    public List<String> getSwMutualExclusionResource_Association_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Association_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ce7148ff-2b6a-4bf5-9838-e382d54c840f")
    public String getSwMutualExclusionResource_Association_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("e5e47be2-e23f-41e7-8acd-efd704514476")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Association_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f426f35e-c43a-4787-9c46-be82b84d277f")
    public void setSwMutualExclusionResource_Association_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Association_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("07040a25-7e74-4d8d-bb45-4af61ea12311")
    public void setSwMutualExclusionResource_Association_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Association_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09b3775b-7131-4840-98cc-8dc931ce9e57")
    public void setSwMutualExclusionResource_Association_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Association_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f18fd39d-57f9-4981-a3a3-e9052ff98d18")
    public void setSwMutualExclusionResource_Association_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Association_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3b2febe-88bf-47a3-856f-81873665e139")
    public void setSwMutualExclusionResource_Association_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Association_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("15fccd02-8808-4878-815c-ee8b77fd1f03")
    public void setSwMutualExclusionResource_Association_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Association_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5ffaf5cd-538f-4fed-b05f-ea62463a6c9f")
    public void setSwMutualExclusionResource_Association_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Association_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b8865e49-7fd1-4e2e-86bb-58a1134122bb")
    public void setSwMutualExclusionResource_Association_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Association_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("925b719c-44c6-4e98-92b5-6e14a9691ba5")
    public void setSwMutualExclusionResource_Association_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("f8f277f3-c90b-4e33-83a1-7d2afd5597ee")
    protected SwMutualExclusionResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("127e0808-b63f-4aee-8e35-bbf2146656ec")
    public static final class MdaTypes {
        @objid ("518c6b63-074f-4f80-85b2-bd0fae54f514")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("15154c4a-f2ce-4326-a95e-6a471328125f")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT;

        @objid ("afa423f8-27b7-45ec-86a8-04420a0ed7ac")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        @objid ("f7d5c5f8-5d7c-4d39-80a6-0d8fef93c789")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        @objid ("7807fde8-4625-4b35-991e-72f51b5a2f0a")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_RELEASESERVICES_TAGTYPE_ELT;

        @objid ("40db00a7-6f44-4a4c-8185-e8d0c7223281")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACQUIRESERVICES_TAGTYPE_ELT;

        @objid ("fc7d672f-b6fd-492a-8a89-ed79caf4fba3")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE_ELT;

        @objid ("de0c0db7-81bf-42b2-8621-89e89b9279cf")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE_ELT;

        @objid ("ac1f6804-e9c9-4658-a09c-aa93a869ecd9")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("6712ac1c-d58a-4a20-b2b9-f967cd105816")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE_ELT;

        @objid ("c2ebb6d9-832f-40b5-86d3-bfd3df8d989e")
        private static Stereotype MDAASSOCDEP;

        @objid ("ae9e95c9-3c91-4055-84fb-c840bdeba1a9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e2768dd9-76a6-4fb6-a517-0bda804f648d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "84d0a71a-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84d0a71b-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84d0a71c-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACCESSTOKENELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84d0a71d-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_RELEASESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84d0a71e-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACQUIRESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84d30977-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ddd56c79-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ddd56c7a-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ddd56c7b-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ddd56c7c-92ad-11e0-a69d-0027103f347c");
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
