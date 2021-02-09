/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend;

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
public class SwMutualExclusionResourceAssociationEnd extends SwSynchronizationResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_AssociationEnd";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_accessTokenElements";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_acquireServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_ceiling";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_concurrentAccessProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_mechanism";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_otherProtectProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_protectKind";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_releaseServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_AssociationEnd_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwMutualExclusionResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwMutualExclusionResource_AssociationEnd >> then instantiate a {@link SwMutualExclusionResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static SwMutualExclusionResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceAssociationEnd.STEREOTYPE_NAME);
        return SwMutualExclusionResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwMutualExclusionResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwMutualExclusionResourceAssociationEnd} proxy or <i>null</i>.
     */
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
    public static SwMutualExclusionResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceAssociationEnd.canInstantiate(obj))
        	return new SwMutualExclusionResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwMutualExclusionResourceAssociationEnd other = (SwMutualExclusionResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_AssociationEnd_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_AssociationEnd_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_AssociationEnd_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_AssociationEnd_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_AssociationEnd_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_AssociationEnd_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_AssociationEnd_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_AssociationEnd_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_AssociationEnd_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_AssociationEnd_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_AssociationEnd_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_AssociationEnd_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_AssociationEnd_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_AssociationEnd_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_AssociationEnd_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_AssociationEnd_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_AssociationEnd_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_AssociationEnd_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_AssociationEnd_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_AssociationEnd_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_AssociationEnd_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_AssociationEnd_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_AssociationEnd_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_AssociationEnd_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_AssociationEnd_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_AssociationEnd_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAssociationEnd.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE_ELT, value);
    }

    protected SwMutualExclusionResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MECHANISM_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_RELEASESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_ACQUIRESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
