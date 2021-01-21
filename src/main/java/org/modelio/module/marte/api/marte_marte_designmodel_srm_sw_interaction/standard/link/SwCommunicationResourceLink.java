/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("78bc8092-3e4c-4a23-b97c-68b60eda877f")
public class SwCommunicationResourceLink extends SwInteractionResourceLink {
    @objid ("5ec4e992-e777-4891-b55a-335e9ad30554")
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Link";

    @objid ("6b1d49ee-f5f3-42c2-8a19-09193d338073")
    public static final String SWCOMMUNICATIONRESOURCE_LINK_BLOCKT_TAGTYPE = "SwCommunicationResource_Link_blockT";

    @objid ("e236793b-ae8c-447a-9991-a100513c352b")
    public static final String SWCOMMUNICATIONRESOURCE_LINK_CAPACITY_TAGTYPE = "SwCommunicationResource_Link_capacity";

    @objid ("baace1c8-6793-4b79-8523-fb2ca9cde9a0")
    public static final String SWCOMMUNICATIONRESOURCE_LINK_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Link_elementSize";

    @objid ("9cc751a4-228a-4d8b-b1bb-23b8183db236")
    public static final String SWCOMMUNICATIONRESOURCE_LINK_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Link_mainScheduler";

    @objid ("644b1f34-1c2f-49dd-aa8b-f5f655be2aa6")
    public static final String SWCOMMUNICATIONRESOURCE_LINK_PACKETT_TAGTYPE = "SwCommunicationResource_Link_packetT";

    @objid ("77bb1165-5184-4cca-bdc7-205e866f206e")
    public static final String SWCOMMUNICATIONRESOURCE_LINK_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Link_speedFactor";

    @objid ("1813472d-f1ca-442f-971c-9171f0993bf1")
    public static final String SWCOMMUNICATIONRESOURCE_LINK_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Link_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwCommunicationResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ca44d7f1-6e9b-40a8-b9f2-4a4a93844d64")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwCommunicationResource_Link >> then instantiate a {@link SwCommunicationResourceLink} proxy.
     * 
     * @return a {@link SwCommunicationResourceLink} proxy on the created {@link Link}.
     */
    @objid ("11632994-2246-4f0d-a418-9240ac464895")
    public static SwCommunicationResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceLink.STEREOTYPE_NAME);
        return SwCommunicationResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceLink} proxy from a {@link Link} stereotyped << SwCommunicationResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SwCommunicationResourceLink} proxy or <i>null</i>.
     */
    @objid ("8a3f7619-b2e3-4d20-9fb1-ecf77fec3cb1")
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
    @objid ("d7dc37fb-7d13-4e91-bd0f-cb7556857527")
    public static SwCommunicationResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwCommunicationResourceLink.canInstantiate(obj))
        	return new SwCommunicationResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("369be701-90ba-48ec-a161-f4c778c25b44")
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
    @objid ("2e59806c-0a50-4f55-ba4e-750c49c2111a")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Link_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("860e13e3-e482-472a-ae9a-5627eae166bd")
    public List<String> getSwCommunicationResource_Link_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Link_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("68c24b94-66ff-49be-a1e2-4011e3be2601")
    public List<String> getSwCommunicationResource_Link_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Link_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("50d2c0db-4b85-48eb-909d-bfa8368414fc")
    public String getSwCommunicationResource_Link_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Link_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("50b2be56-5b41-464e-9dad-7f20d9d91f02")
    public String getSwCommunicationResource_Link_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Link_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3a836c2e-8f66-4456-99df-1598c0b41ea1")
    public List<String> getSwCommunicationResource_Link_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Link_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("202e86d1-cb83-405d-a347-2318f2fb6f2f")
    public String getSwCommunicationResource_Link_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Link_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("994af2f5-7318-431e-b1c1-df019cc7bc21")
    public String getSwCommunicationResource_Link_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_TRANSMMODE_TAGTYPE_ELT);
    }

    @objid ("397ccb5c-bc82-4626-872f-da573d84cebb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Link_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa204b4c-e9ea-4e09-8006-66055eac3fb5")
    public void setSwCommunicationResource_Link_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Link_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("550fdd95-8a0e-440c-927a-1a5ccd96df9a")
    public void setSwCommunicationResource_Link_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Link_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3fe0e52-e27f-4e31-ab70-c90664a45488")
    public void setSwCommunicationResource_Link_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Link_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac9d58a6-2d36-487e-8272-463eada7300a")
    public void setSwCommunicationResource_Link_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Link_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2efac52b-252c-408b-bd4e-69649149a273")
    public void setSwCommunicationResource_Link_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Link_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("84820f5e-42ba-43de-9922-17ad8b46b6b2")
    public void setSwCommunicationResource_Link_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Link_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5477b544-868d-4753-ad9a-ce4b690baf8c")
    public void setSwCommunicationResource_Link_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLink.MdaTypes.SWCOMMUNICATIONRESOURCE_LINK_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("1b412415-0902-4aab-8998-4c2847778b30")
    protected SwCommunicationResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("9cb4e60d-c9e2-402d-868f-ae8929772d76")
    public static final class MdaTypes {
        @objid ("661b0608-a037-40f1-a1af-cd3a383193c1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4a205f0a-3520-4f1c-81db-fcac7b504849")
        public static TagType SWCOMMUNICATIONRESOURCE_LINK_BLOCKT_TAGTYPE_ELT;

        @objid ("21760671-64f1-415e-b3f9-880be371bbff")
        public static TagType SWCOMMUNICATIONRESOURCE_LINK_PACKETT_TAGTYPE_ELT;

        @objid ("db02deb9-4649-4d87-80eb-cc179bb3fb1d")
        public static TagType SWCOMMUNICATIONRESOURCE_LINK_CAPACITY_TAGTYPE_ELT;

        @objid ("de68f53f-d753-4b5a-9203-9d8d2a64f872")
        public static TagType SWCOMMUNICATIONRESOURCE_LINK_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("3cf29309-2d65-446c-a78f-7414a48303c1")
        public static TagType SWCOMMUNICATIONRESOURCE_LINK_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("b22d9a4f-d250-41a1-9b03-e2b2ffbca4fd")
        public static TagType SWCOMMUNICATIONRESOURCE_LINK_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("a7e5070f-c156-4fa7-8752-2cbf06007b4b")
        public static TagType SWCOMMUNICATIONRESOURCE_LINK_TRANSMMODE_TAGTYPE_ELT;

        @objid ("2b17b54c-8b37-4e85-9507-0b64d72f7535")
        private static Stereotype MDAASSOCDEP;

        @objid ("5641f3a3-6412-46aa-99fb-df7bb5573c35")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1395239f-3e0f-4b28-9605-e5daf3b10f06")
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
