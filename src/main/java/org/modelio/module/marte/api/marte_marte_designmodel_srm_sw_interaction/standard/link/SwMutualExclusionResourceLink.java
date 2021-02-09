/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << SwMutualExclusionResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwMutualExclusionResourceLink extends SwSynchronizationResourceLink {
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_Link";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_Link_accessTokenElements";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_Link_acquireServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE = "SwMutualExclusionResource_Link_ceiling";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Link_concurrentAccessProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_MECHANISM_TAGTYPE = "SwMutualExclusionResource_Link_mechanism";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Link_otherProtectProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_Link_protectKind";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_Link_releaseServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_Link_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwMutualExclusionResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwMutualExclusionResource_Link >> then instantiate a {@link SwMutualExclusionResourceLink} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceLink} proxy on the created {@link Link}.
     */
    public static SwMutualExclusionResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceLink.STEREOTYPE_NAME);
        return SwMutualExclusionResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceLink} proxy from a {@link Link} stereotyped << SwMutualExclusionResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SwMutualExclusionResourceLink} proxy or <i>null</i>.
     */
    public static SwMutualExclusionResourceLink instantiate(final Link obj) {
        return SwMutualExclusionResourceLink.canInstantiate(obj) ? new SwMutualExclusionResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceLink} proxy from a {@link Link} stereotyped << SwMutualExclusionResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SwMutualExclusionResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwMutualExclusionResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceLink.canInstantiate(obj))
        	return new SwMutualExclusionResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        SwMutualExclusionResourceLink other = (SwMutualExclusionResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Link_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Link_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Link_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Link_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Link_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Link_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Link_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Link_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Link_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Link_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Link_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Link_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Link_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Link_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Link_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Link_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Link_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Link_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Link_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Link_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Link_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Link_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Link_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Link_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Link_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Link_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Link_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Link_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Link_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Link_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Link_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Link_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Link_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Link_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Link_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Link_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLink.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE_ELT, value);
    }

    protected SwMutualExclusionResourceLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_RELEASESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_ACQUIRESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0242e1d4-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_LINK_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454429-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_LINK_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454430-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_LINK_ACCESSTOKENELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454437-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_LINK_RELEASESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245443e-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_LINK_ACQUIRESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454445-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e45a71c2-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_LINK_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e45a71c3-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e45a71c4-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e45a71c5-92ad-11e0-a69d-0027103f347c");
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
