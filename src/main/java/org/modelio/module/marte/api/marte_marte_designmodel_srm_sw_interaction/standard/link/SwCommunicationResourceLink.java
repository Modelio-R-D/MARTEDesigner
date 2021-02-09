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
 * Proxy class to handle a {@link Link} with << SwCommunicationResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwCommunicationResourceLink extends SwInteractionResourceLink {
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Link";

    public static final String SWCOMMUNICATIONRESOURCE_LINK_BLOCKT_TAGTYPE = "SwCommunicationResource_Link_blockT";

    public static final String SWCOMMUNICATIONRESOURCE_LINK_CAPACITY_TAGTYPE = "SwCommunicationResource_Link_capacity";

    public static final String SWCOMMUNICATIONRESOURCE_LINK_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Link_elementSize";

    public static final String SWCOMMUNICATIONRESOURCE_LINK_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Link_mainScheduler";

    public static final String SWCOMMUNICATIONRESOURCE_LINK_PACKETT_TAGTYPE = "SwCommunicationResource_Link_packetT";

    public static final String SWCOMMUNICATIONRESOURCE_LINK_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Link_speedFactor";

    public static final String SWCOMMUNICATIONRESOURCE_LINK_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Link_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwCommunicationResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwCommunicationResource_Link >> then instantiate a {@link SwCommunicationResourceLink} proxy.
     * 
     * @return a {@link SwCommunicationResourceLink} proxy on the created {@link Link}.
     */
    public static SwCommunicationResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceLink.STEREOTYPE_NAME);
        return SwCommunicationResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceLink} proxy from a {@link Link} stereotyped << SwCommunicationResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SwCommunicationResourceLink} proxy or <i>null</i>.
     */
    public static SwCommunicationResourceLink instantiate(final Link obj) {
        return SwCommunicationResourceLink.canInstantiate(obj) ? new SwCommunicationResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceLink} proxy from a {@link Link} stereotyped << SwCommunicationResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SwCommunicationResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwCommunicationResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwCommunicationResourceLink.canInstantiate(obj))
        	return new SwCommunicationResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwCommunicationResourceLink other = (SwCommunicationResourceLink) obj;
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
     * Getter for List<String> property 'SwCommunicationResource_Link_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Link_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Link_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Link_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Link_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Link_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Link_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Link_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Link_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Link_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Link_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Link_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Link_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Link_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_TRANSMMODE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Link_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Link_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Link_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Link_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Link_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Link_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Link_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Link_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Link_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Link_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Link_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Link_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Link_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Link_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_TRANSMMODE_TAGTYPE_ELT, value);
    }

    protected SwCommunicationResourceLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_LINK_BLOCKT_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_LINK_PACKETT_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_LINK_CAPACITY_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_LINK_SPEEDFACTOR_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_LINK_MAINSCHEDULER_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_LINK_ELEMENTSIZE_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_LINK_TRANSMMODE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0210d11d-0ccf-11df-8525-001302895b2b");
            SWCOMMUNICATIONRESOURCE_LINK_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "89b4b1a4-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LINK_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "89b4b1a3-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LINK_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "89b4b1a2-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LINK_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "89b4b1a1-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LINK_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "89b4b1a0-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LINK_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d8cff7cd-97f8-11e0-a4c3-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LINK_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cb7cf63a-60ca-11e3-a828-0027103f347d");
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
