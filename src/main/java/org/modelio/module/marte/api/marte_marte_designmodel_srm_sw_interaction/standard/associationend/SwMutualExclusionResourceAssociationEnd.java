/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SwMutualExclusionResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9a5e5a45-8332-4f91-afbd-9ea95c04a7d1")
public class SwMutualExclusionResourceAssociationEnd extends SwSynchronizationResourceAssociationEnd {
    @objid ("d60f5677-7da3-4af9-84c5-963c5c969f63")
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_AssociationEnd";

    @objid ("db690270-aa1c-4fe5-920e-fd94f260bd78")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_accessTokenElements";

    @objid ("60caca53-08ff-45db-bca5-69d0df4e8b93")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_acquireServices";

    @objid ("dfefbbfd-a30a-4ca9-8b8a-ad0a66d665b6")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_ceiling";

    @objid ("bf5b54ad-0282-4216-ab29-2b50a097f1d4")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_concurrentAccessProtocol";

    @objid ("31143be9-a71e-47f3-97ef-32cae9c4db77")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_mechanism";

    @objid ("fbb7117c-4655-4f95-b5ca-8482ae90ff2f")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_otherProtectProtocol";

    @objid ("2f9186cf-b9ff-4682-8aa6-aa72389102fb")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_protectKind";

    @objid ("1bd330ea-2181-4b46-9df7-ca1c58d32df5")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_releaseServices";

    @objid ("2ca18170-b56e-4d31-8dac-d619db1283a9")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwMutualExclusionResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b9fbf55f-9ec3-483d-bb12-74b2313f6ffe")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwMutualExclusionResource_AssociationEnd >> then instantiate a {@link SwMutualExclusionResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("7c67a9ad-c7ed-4650-88b9-974ab5044cc5")
    public static SwMutualExclusionResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceAssociationEnd.STEREOTYPE_NAME);
        return SwMutualExclusionResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwMutualExclusionResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwMutualExclusionResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("e6c087f1-6aa8-47df-bcbb-2e2b0288c590")
    public static SwMutualExclusionResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SwMutualExclusionResourceAssociationEnd.canInstantiate(obj) ? new SwMutualExclusionResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwMutualExclusionResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SwMutualExclusionResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fe3f04f2-131b-4ea1-b36c-59441ddf8e4c")
    public static SwMutualExclusionResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceAssociationEnd.canInstantiate(obj))
        	return new SwMutualExclusionResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5823c1f0-30d2-42d8-99fa-677abfd861b9")
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
        SwMutualExclusionResourceAssociationEnd other = (SwMutualExclusionResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("888d2ccd-cd0c-46fb-899c-6ac7a7150413")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_AssociationEnd_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("12becfbc-acba-44cd-8f4d-d602ab2ecc29")
    public List<String> getSwMutualExclusionResource_AssociationEnd_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_AssociationEnd_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b2b88b3f-e732-4b81-b464-fc7500521c01")
    public List<String> getSwMutualExclusionResource_AssociationEnd_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a2a5fe93-3587-4b97-8c34-d6708fe81045")
    public String getSwMutualExclusionResource_AssociationEnd_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("15e29063-1ad8-40e7-b463-779c752c6a4c")
    public String getSwMutualExclusionResource_AssociationEnd_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ae134bd6-758a-4792-8b70-f8ee899bd374")
    public String getSwMutualExclusionResource_AssociationEnd_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e1fa6416-ef68-48f4-81eb-192ae5f2485c")
    public String getSwMutualExclusionResource_AssociationEnd_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("877f8ccd-be7c-4827-b9dc-7b1d7b196496")
    public String getSwMutualExclusionResource_AssociationEnd_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_AssociationEnd_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e30dd692-2fd4-4af8-be42-25a01527b4e4")
    public List<String> getSwMutualExclusionResource_AssociationEnd_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2301cb8e-62ab-4a6b-8254-91520ca2beb0")
    public String getSwMutualExclusionResource_AssociationEnd_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("d5406345-df96-4759-b685-b293199fe249")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_AssociationEnd_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("64c7ca16-c521-4ff4-a403-3671f279d329")
    public void setSwMutualExclusionResource_AssociationEnd_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_AssociationEnd_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5419e0d5-ee43-482c-88cb-07a3bb12bbcf")
    public void setSwMutualExclusionResource_AssociationEnd_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("566bd328-c895-41a2-ac10-cc61aaf8c348")
    public void setSwMutualExclusionResource_AssociationEnd_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ce516982-8cb7-47af-a0ef-96992ea92cfe")
    public void setSwMutualExclusionResource_AssociationEnd_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f4660de5-1478-440a-8f47-16b3600cc94f")
    public void setSwMutualExclusionResource_AssociationEnd_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a5835d6b-e56d-4f1d-be3e-a118a267df9e")
    public void setSwMutualExclusionResource_AssociationEnd_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c70cecd7-3384-4c4a-812f-26b3be4ba8b8")
    public void setSwMutualExclusionResource_AssociationEnd_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_AssociationEnd_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("483ff886-b429-4d1d-b1de-6362ef41bb77")
    public void setSwMutualExclusionResource_AssociationEnd_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("564d88c2-2f26-4a96-ac3c-fdc229377d46")
    public void setSwMutualExclusionResource_AssociationEnd_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("df386485-c86d-4d9b-9dc0-851a97344b11")
    protected SwMutualExclusionResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("c04394ca-c420-43d7-9a78-5fecc2aede4d")
    public static final class MdaTypes {
        @objid ("f559ffac-1fad-4dfe-8ff2-d6f865cf3f19")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("67c9ff88-f14d-4740-b511-a6759d25f114")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT;

        @objid ("5c30983c-a986-48f8-90ba-4a0f433d5a16")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        @objid ("92f0efd2-d8df-4f45-a16e-72ef33430a27")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        @objid ("37f93c8a-5549-4765-b6bd-fd1a7e7a6039")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_RELEASESERVICES_TAGTYPE_ELT;

        @objid ("ea7cab4d-b2e6-457f-8b8a-1679011cc530")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACQUIRESERVICES_TAGTYPE_ELT;

        @objid ("ad407660-e154-4aca-8b25-3b3ee53c4dd7")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE_ELT;

        @objid ("471a48bb-1889-4537-8135-a57d3700b8ec")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE_ELT;

        @objid ("dbea9a9e-fc68-4336-9b17-fe06edf8c3b1")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("5511a6d1-308e-4f35-b696-00cb09585486")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE_ELT;

        @objid ("fd6dead3-8243-4487-8a02-962fa708a5e3")
        private static Stereotype MDAASSOCDEP;

        @objid ("8fd999b6-cd12-4c82-ac4e-3f982c28efa5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("48c91df3-7015-49e9-b708-866ed1d2730f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "02407f80-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454425-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245442c-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACCESSTOKENELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454433-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_RELEASESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245443a-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACQUIRESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454441-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "deff4e19-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "deff4e1a-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "deff4e1b-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "deff4e1c-92ad-11e0-a69d-0027103f347c");
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
