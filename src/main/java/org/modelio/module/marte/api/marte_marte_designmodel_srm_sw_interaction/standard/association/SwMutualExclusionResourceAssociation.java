/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association;

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
public class SwMutualExclusionResourceAssociation extends SwSynchronizationResourceAssociation {
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_Association";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_Association_accessTokenElements";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_Association_acquireServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE = "SwMutualExclusionResource_Association_ceiling";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Association_concurrentAccessProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE = "SwMutualExclusionResource_Association_mechanism";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Association_otherProtectProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_Association_protectKind";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_Association_releaseServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_Association_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwMutualExclusionResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwMutualExclusionResource_Association >> then instantiate a {@link SwMutualExclusionResourceAssociation} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceAssociation} proxy on the created {@link Association}.
     */
    public static SwMutualExclusionResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceAssociation.STEREOTYPE_NAME);
        return SwMutualExclusionResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceAssociation} proxy from a {@link Association} stereotyped << SwMutualExclusionResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwMutualExclusionResourceAssociation} proxy or <i>null</i>.
     */
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
    public static SwMutualExclusionResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceAssociation.canInstantiate(obj))
        	return new SwMutualExclusionResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwMutualExclusionResourceAssociation other = (SwMutualExclusionResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Association_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Association_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Association_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Association_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Association_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Association_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Association_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Association_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Association_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Association_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Association_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Association_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Association_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Association_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Association_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Association_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Association_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Association_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Association_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Association_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Association_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Association_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Association_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Association_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Association_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Association_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Association_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Association_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Association_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Association_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Association_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Association_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Association_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Association_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Association_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Association_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociation.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE_ELT, value);
    }

    protected SwMutualExclusionResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_MECHANISM_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_RELEASESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_ACQUIRESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
