/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SwMutualExclusionResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwMutualExclusionResourceAttribute extends SwSynchronizationResourceAttribute {
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_Attribute";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_Attribute_accessTokenElements";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_Attribute_acquireServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE = "SwMutualExclusionResource_Attribute_ceiling";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Attribute_concurrentAccessProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE = "SwMutualExclusionResource_Attribute_mechanism";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Attribute_otherProtectProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_Attribute_protectKind";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_Attribute_releaseServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_Attribute_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwMutualExclusionResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwMutualExclusionResource_Attribute >> then instantiate a {@link SwMutualExclusionResourceAttribute} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceAttribute} proxy on the created {@link Attribute}.
     */
    public static SwMutualExclusionResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceAttribute.STEREOTYPE_NAME);
        return SwMutualExclusionResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceAttribute} proxy from a {@link Attribute} stereotyped << SwMutualExclusionResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwMutualExclusionResourceAttribute} proxy or <i>null</i>.
     */
    public static SwMutualExclusionResourceAttribute instantiate(final Attribute obj) {
        return SwMutualExclusionResourceAttribute.canInstantiate(obj) ? new SwMutualExclusionResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceAttribute} proxy from a {@link Attribute} stereotyped << SwMutualExclusionResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SwMutualExclusionResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwMutualExclusionResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceAttribute.canInstantiate(obj))
        	return new SwMutualExclusionResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwMutualExclusionResourceAttribute other = (SwMutualExclusionResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Attribute_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Attribute_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Attribute_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Attribute_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Attribute_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Attribute_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Attribute_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Attribute_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Attribute_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Attribute_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Attribute_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Attribute_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Attribute_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Attribute_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Attribute_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Attribute_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Attribute_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Attribute_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Attribute_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Attribute_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Attribute_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Attribute_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Attribute_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Attribute_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Attribute_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Attribute_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Attribute_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Attribute_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Attribute_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Attribute_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Attribute_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Attribute_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Attribute_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Attribute_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Attribute_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Attribute_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE_ELT, value);
    }

    protected SwMutualExclusionResourceAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_RELEASESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACQUIRESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0242e1d2-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454427-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245442e-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACCESSTOKENELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454435-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_RELEASESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245443c-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACQUIRESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454443-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dfe5201b-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dfe5201c-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dfe5201d-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dfe5201e-92ad-11e0-a69d-0027103f347c");
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
