/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SwMutualExclusionResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwMutualExclusionResourceInstance extends SwSynchronizationResourceInstance {
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_Instance";

    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_Instance_accessTokenElements";

    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_Instance_acquireServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING_TAGTYPE = "SwMutualExclusionResource_Instance_ceiling";

    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Instance_concurrentAccessProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE = "SwMutualExclusionResource_Instance_mechanism";

    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Instance_otherProtectProtocol";

    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_Instance_protectKind";

    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_Instance_releaseServices";

    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_Instance_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwMutualExclusionResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwMutualExclusionResource_Instance >> then instantiate a {@link SwMutualExclusionResourceInstance} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceInstance} proxy on the created {@link Instance}.
     */
    public static SwMutualExclusionResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceInstance.STEREOTYPE_NAME);
        return SwMutualExclusionResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceInstance} proxy from a {@link Instance} stereotyped << SwMutualExclusionResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SwMutualExclusionResourceInstance} proxy or <i>null</i>.
     */
    public static SwMutualExclusionResourceInstance instantiate(final Instance obj) {
        return SwMutualExclusionResourceInstance.canInstantiate(obj) ? new SwMutualExclusionResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceInstance} proxy from a {@link Instance} stereotyped << SwMutualExclusionResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SwMutualExclusionResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwMutualExclusionResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceInstance.canInstantiate(obj))
        	return new SwMutualExclusionResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwMutualExclusionResourceInstance other = (SwMutualExclusionResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Instance_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Instance_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Instance_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Instance_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Instance_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Instance_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Instance_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Instance_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Instance_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Instance_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Instance_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Instance_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Instance_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Instance_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Instance_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwMutualExclusionResource_Instance_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Instance_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwMutualExclusionResource_Instance_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Instance_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Instance_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Instance_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Instance_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Instance_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Instance_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Instance_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Instance_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Instance_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Instance_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Instance_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Instance_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Instance_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Instance_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Instance_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Instance_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Instance_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwMutualExclusionResource_Instance_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER_TAGTYPE_ELT, value);
    }

    protected SwMutualExclusionResourceInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0242e1d5-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245442a-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454431-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454438-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245443f-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454446-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e26328c0-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e26328c1-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e2634fd1-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e2634fd2-92ad-11e0-a69d-0027103f347c");
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
