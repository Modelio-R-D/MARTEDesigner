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
 * Proxy class to handle a {@link Lifeline} with << SwCommunicationResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwCommunicationResourceLifeline extends SwInteractionResourceLifeline {
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Lifeline";

    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT_TAGTYPE = "SwCommunicationResource_Lifeline_blockT";

    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY_TAGTYPE = "SwCommunicationResource_Lifeline_capacity";

    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Lifeline_elementSize";

    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Lifeline_mainScheduler";

    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT_TAGTYPE = "SwCommunicationResource_Lifeline_packetT";

    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Lifeline_speedFactor";

    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Lifeline_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwCommunicationResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwCommunicationResource_Lifeline >> then instantiate a {@link SwCommunicationResourceLifeline} proxy.
     * 
     * @return a {@link SwCommunicationResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static SwCommunicationResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceLifeline.STEREOTYPE_NAME);
        return SwCommunicationResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwCommunicationResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwCommunicationResourceLifeline} proxy or <i>null</i>.
     */
    public static SwCommunicationResourceLifeline instantiate(final Lifeline obj) {
        return SwCommunicationResourceLifeline.canInstantiate(obj) ? new SwCommunicationResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwCommunicationResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SwCommunicationResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwCommunicationResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwCommunicationResourceLifeline.canInstantiate(obj))
        	return new SwCommunicationResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwCommunicationResourceLifeline other = (SwCommunicationResourceLifeline) obj;
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
     * Getter for List<String> property 'SwCommunicationResource_Lifeline_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Lifeline_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Lifeline_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Lifeline_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Lifeline_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Lifeline_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Lifeline_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Lifeline_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Lifeline_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Lifeline_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Lifeline_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Lifeline_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Lifeline_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Lifeline_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Lifeline_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Lifeline_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Lifeline_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Lifeline_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Lifeline_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Lifeline_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Lifeline_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Lifeline_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Lifeline_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Lifeline_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Lifeline_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE_TAGTYPE_ELT, value);
    }

    protected SwCommunicationResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "597b733e-10d8-11df-81d9-0014222a9f79");
            SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "88b626dd-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "88b626dc-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "88b5ffcd-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "88b5ffcc-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "88b5ffcb-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c9164c01-97f8-11e0-a4c3-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bfae321a-60ca-11e3-a828-0027103f347d");
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
