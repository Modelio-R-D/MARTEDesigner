/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.MutualExclusionResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SwMutualExclusionResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwMutualExclusionResourceParameter extends MutualExclusionResourceParameter {
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_Parameter";

    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_Parameter_accessTokenElements";

    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_Parameter_acquireServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE = "SwMutualExclusionResource_Parameter_ceiling";

    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Parameter_concurrentAccessProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE = "SwMutualExclusionResource_Parameter_mechanism";

    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Parameter_otherProtectProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_Parameter_protectKind";

    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_Parameter_releaseServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_Parameter_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SwMutualExclusionResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SwMutualExclusionResource_Parameter >> then instantiate a {@link SwMutualExclusionResourceParameter} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceParameter} proxy on the created {@link Parameter}.
     */
    public static SwMutualExclusionResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceParameter.STEREOTYPE_NAME);
        return SwMutualExclusionResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceParameter} proxy from a {@link Parameter} stereotyped << SwMutualExclusionResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SwMutualExclusionResourceParameter} proxy or <i>null</i>.
     */
    public static SwMutualExclusionResourceParameter instantiate(final Parameter obj) {
        return SwMutualExclusionResourceParameter.canInstantiate(obj) ? new SwMutualExclusionResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceParameter} proxy from a {@link Parameter} stereotyped << SwMutualExclusionResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SwMutualExclusionResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwMutualExclusionResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceParameter.canInstantiate(obj))
        	return new SwMutualExclusionResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwMutualExclusionResourceParameter other = (SwMutualExclusionResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Parameter_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Parameter_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Parameter_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Parameter_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Parameter_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Parameter_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Parameter_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Parameter_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Parameter_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Parameter_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Parameter_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Parameter_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Parameter_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Parameter_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Parameter_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Parameter_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Parameter_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Parameter_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Parameter_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Parameter_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Parameter_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Parameter_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Parameter_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Parameter_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Parameter_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Parameter_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Parameter_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Parameter_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Parameter_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Parameter_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Parameter_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Parameter_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Parameter_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Parameter_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Parameter_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Parameter_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT, value);
    }

    protected SwMutualExclusionResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_RELEASESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACQUIRESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "023bbadf-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454424-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245442b-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACCESSTOKENELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454432-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_RELEASESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454439-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACQUIRESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454440-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e5ee899a-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e5ee899b-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e5ee899c-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e5ee899d-92ad-11e0-a69d-0027103f347c");
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
