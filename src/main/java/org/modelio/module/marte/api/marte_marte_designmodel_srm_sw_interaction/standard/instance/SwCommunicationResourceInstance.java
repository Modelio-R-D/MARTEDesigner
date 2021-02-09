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
 * Proxy class to handle a {@link Instance} with << SwCommunicationResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwCommunicationResourceInstance extends SwInteractionResourceInstance {
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Instance";

    public static final String SWCOMMUNICATIONRESOURCE_INSTANCE_BLOCKT_TAGTYPE = "SwCommunicationResource_Instance_blockT";

    public static final String SWCOMMUNICATIONRESOURCE_INSTANCE_CAPACITY_TAGTYPE = "SwCommunicationResource_Instance_capacity";

    public static final String SWCOMMUNICATIONRESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Instance_elementSize";

    public static final String SWCOMMUNICATIONRESOURCE_INSTANCE_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Instance_mainScheduler";

    public static final String SWCOMMUNICATIONRESOURCE_INSTANCE_PACKETT_TAGTYPE = "SwCommunicationResource_Instance_packetT";

    public static final String SWCOMMUNICATIONRESOURCE_INSTANCE_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Instance_speedFactor";

    public static final String SWCOMMUNICATIONRESOURCE_INSTANCE_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Instance_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwCommunicationResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwCommunicationResource_Instance >> then instantiate a {@link SwCommunicationResourceInstance} proxy.
     * 
     * @return a {@link SwCommunicationResourceInstance} proxy on the created {@link Instance}.
     */
    public static SwCommunicationResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceInstance.STEREOTYPE_NAME);
        return SwCommunicationResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceInstance} proxy from a {@link Instance} stereotyped << SwCommunicationResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SwCommunicationResourceInstance} proxy or <i>null</i>.
     */
    public static SwCommunicationResourceInstance instantiate(final Instance obj) {
        return SwCommunicationResourceInstance.canInstantiate(obj) ? new SwCommunicationResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceInstance} proxy from a {@link Instance} stereotyped << SwCommunicationResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SwCommunicationResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwCommunicationResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwCommunicationResourceInstance.canInstantiate(obj))
        	return new SwCommunicationResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwCommunicationResourceInstance other = (SwCommunicationResourceInstance) obj;
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
     * Getter for List<String> property 'SwCommunicationResource_Instance_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Instance_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Instance_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Instance_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Instance_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Instance_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Instance_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Instance_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Instance_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Instance_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Instance_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Instance_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Instance_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_TRANSMMODE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Instance_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Instance_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Instance_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Instance_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Instance_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Instance_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Instance_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Instance_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Instance_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Instance_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Instance_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Instance_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Instance_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceInstance.MdaTypes.SWCOMMUNICATIONRESOURCE_INSTANCE_TRANSMMODE_TAGTYPE_ELT, value);
    }

    protected SwCommunicationResourceInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_INSTANCE_BLOCKT_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_INSTANCE_PACKETT_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_INSTANCE_CAPACITY_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_INSTANCE_TRANSMMODE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0213336a-0ccf-11df-8525-001302895b2b");
            SWCOMMUNICATIONRESOURCE_INSTANCE_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "87cece31-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_INSTANCE_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "87cece30-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_INSTANCE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "87cea721-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "87cea720-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "87cea71f-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "be2b10a4-97f8-11e0-a4c3-0027103f347c");
            SWCOMMUNICATIONRESOURCE_INSTANCE_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b531425a-60ca-11e3-a828-0027103f347d");
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
