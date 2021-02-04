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
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.link.SwResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << SwInteractionResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("90d2c7eb-1c9a-42bf-b2df-113278aa0f5f")
public class SwInteractionResourceLink extends SwResourceLink {
    @objid ("a3b54a9d-e669-4234-89d2-fb220d9e63ae")
    public static final String STEREOTYPE_NAME = "SwInteractionResource_Link";

    @objid ("3c418175-71b8-4597-8acb-c0cc0d14ca15")
    public static final String SWINTERACTIONRESOURCE_LINK_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE = "SwInteractionResource_Link_isIntraMemoryPartitionInteraction";

    @objid ("2e017e2e-ab88-4880-ba28-893b885163b9")
    public static final String SWINTERACTIONRESOURCE_LINK_WAITINGPOLICYELEMENTS_TAGTYPE = "SwInteractionResource_Link_waitingPolicyElements";

    @objid ("ce33425d-1191-4d40-953b-08dad1cc57a2")
    public static final String SWINTERACTIONRESOURCE_LINK_WAITINGQUEUECAPACITY_TAGTYPE = "SwInteractionResource_Link_waitingQueueCapacity";

    @objid ("a2e4f12a-f8b5-4996-9e5d-e0ce45fc50e3")
    public static final String SWINTERACTIONRESOURCE_LINK_WAITINGQUEUEPOLICY_TAGTYPE = "SwInteractionResource_Link_waitingQueuePolicy";

    /**
     * Tells whether a {@link SwInteractionResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwInteractionResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("64e3091f-bdbc-459d-881a-5fbbd5f5adbe")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwInteractionResource_Link >> then instantiate a {@link SwInteractionResourceLink} proxy.
     * 
     * @return a {@link SwInteractionResourceLink} proxy on the created {@link Link}.
     */
    @objid ("594e5f92-b09b-4f75-b551-80eded7855bc")
    public static SwInteractionResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceLink.STEREOTYPE_NAME);
        return SwInteractionResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceLink} proxy from a {@link Link} stereotyped << SwInteractionResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SwInteractionResourceLink} proxy or <i>null</i>.
     */
    @objid ("5014b552-e923-4207-b0d8-b3cb8a11b30b")
    public static SwInteractionResourceLink instantiate(final Link obj) {
        return SwInteractionResourceLink.canInstantiate(obj) ? new SwInteractionResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceLink} proxy from a {@link Link} stereotyped << SwInteractionResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SwInteractionResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("79b520de-d599-4fd3-b03b-e3d83299ca3d")
    public static SwInteractionResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwInteractionResourceLink.canInstantiate(obj))
        	return new SwInteractionResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwInteractionResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9d6d5d1a-8139-4e0d-9a34-035f1729b23c")
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
        SwInteractionResourceLink other = (SwInteractionResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("7cbedb5b-9587-4a4a-8530-f83e3854eb57")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwInteractionResource_Link_waitingPolicyElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("27e88dd0-47f0-4da2-9eaa-75d46180d7fa")
    public List<String> getSwInteractionResource_Link_waitingPolicyElements() {
        return this.elt.getTagValues(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_WAITINGPOLICYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Link_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("75388b8b-858d-4812-a15f-0351028e1059")
    public String getSwInteractionResource_Link_waitingQueueCapacity() {
        return this.elt.getTagValue(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_WAITINGQUEUECAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Link_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("608884bc-541a-48fc-8d2b-cdf49cbd6f56")
    public String getSwInteractionResource_Link_waitingQueuePolicy() {
        return this.elt.getTagValue(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_WAITINGQUEUEPOLICY_TAGTYPE_ELT);
    }

    @objid ("7bdbd432-eaa2-4fcd-92fd-475d91d2f4ef")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwInteractionResource_Link_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("28a6372a-06cf-4641-aea8-0da79218c7fa")
    public boolean isSwInteractionResource_Link_isIntraMemoryPartitionInteraction() {
        return this.elt.isTagged(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwInteractionResource_Link_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4faacf58-165e-42b9-bb6b-99ca547805e6")
    public void setSwInteractionResource_Link_isIntraMemoryPartitionInteraction(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwInteractionResource_Link_waitingPolicyElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2ffbf6e7-574f-4bc9-be7f-28075af67c62")
    public void setSwInteractionResource_Link_waitingPolicyElements(final List<String> values) {
        this.elt.putTagValues(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_WAITINGPOLICYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwInteractionResource_Link_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cc00e173-ebf1-4705-ae9a-31c5ddf30f8d")
    public void setSwInteractionResource_Link_waitingQueueCapacity(final String value) {
        this.elt.putTagValue(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_WAITINGQUEUECAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwInteractionResource_Link_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("355e13dd-3ab7-4310-9f6f-6abde2f153ab")
    public void setSwInteractionResource_Link_waitingQueuePolicy(final String value) {
        this.elt.putTagValue(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_WAITINGQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("647d5b59-97ef-4f90-9ea6-1d37f5e38b4c")
    protected SwInteractionResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("8aa18aa2-5949-41da-8e33-7752574f1cd0")
    public static final class MdaTypes {
        @objid ("de12ac5f-2da3-42d7-8cae-7bd3dc342fdb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cb032b56-3a98-4308-8516-350c4e238c80")
        public static TagType SWINTERACTIONRESOURCE_LINK_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT;

        @objid ("46a7da8a-aa9f-4c5e-b0f4-a3dad29a9b4d")
        public static TagType SWINTERACTIONRESOURCE_LINK_WAITINGQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("a25bd374-ba76-4c54-8c48-80295e06d8e9")
        public static TagType SWINTERACTIONRESOURCE_LINK_WAITINGQUEUECAPACITY_TAGTYPE_ELT;

        @objid ("f495ddc1-f138-49cf-8031-893b6fc28afd")
        public static TagType SWINTERACTIONRESOURCE_LINK_WAITINGPOLICYELEMENTS_TAGTYPE_ELT;

        @objid ("9f6751e8-50a5-4427-b66f-7ec250d1acea")
        private static Stereotype MDAASSOCDEP;

        @objid ("9ee5fb1e-3b9b-4371-916b-cbe59d16846d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6b22ba18-3290-4886-8e54-d391f370f059")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "020c0c78-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_LINK_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c7f-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_LINK_WAITINGQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c86-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_LINK_WAITINGQUEUECAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c8d-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_LINK_WAITINGPOLICYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020e6ec9-0ccf-11df-8525-001302895b2b");
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
