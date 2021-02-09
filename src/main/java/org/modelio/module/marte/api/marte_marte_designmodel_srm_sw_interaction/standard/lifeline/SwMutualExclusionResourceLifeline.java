/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SwMutualExclusionResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwMutualExclusionResourceLifeline extends SwSynchronizationResourceLifeline {
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_Lifeline";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_Lifeline_accessTokenElements";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_Lifeline_acquireServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE = "SwMutualExclusionResource_Lifeline_ceiling";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Lifeline_concurrentAccessProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE = "SwMutualExclusionResource_Lifeline_mechanism";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Lifeline_otherProtectProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_Lifeline_protectKind";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_Lifeline_releaseServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_Lifeline_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwMutualExclusionResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwMutualExclusionResource_Lifeline >> then instantiate a {@link SwMutualExclusionResourceLifeline} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static SwMutualExclusionResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceLifeline.STEREOTYPE_NAME);
        return SwMutualExclusionResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwMutualExclusionResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwMutualExclusionResourceLifeline} proxy or <i>null</i>.
     */
    public static SwMutualExclusionResourceLifeline instantiate(final Lifeline obj) {
        return SwMutualExclusionResourceLifeline.canInstantiate(obj) ? new SwMutualExclusionResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwMutualExclusionResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SwMutualExclusionResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwMutualExclusionResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceLifeline.canInstantiate(obj))
        	return new SwMutualExclusionResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwMutualExclusionResourceLifeline other = (SwMutualExclusionResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Lifeline_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Lifeline_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Lifeline_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Lifeline_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Lifeline_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Lifeline_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Lifeline_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Lifeline_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Lifeline_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Lifeline_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Lifeline_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Lifeline_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Lifeline_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Lifeline_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Lifeline_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Lifeline_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Lifeline_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Lifeline_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Lifeline_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Lifeline_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Lifeline_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Lifeline_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Lifeline_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Lifeline_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT, value);
    }

    protected SwMutualExclusionResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_RELEASESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACQUIRESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "84f6ccea-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84f6cceb-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84f6ccec-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACCESSTOKENELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84f6cced-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_RELEASESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84f6ccee-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACQUIRESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84f6ccef-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e36ed33a-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e36ed33b-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e36ed33c-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e36efa4b-92ad-11e0-a69d-0027103f347c");
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
