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
    @objid ("f101a752-70d3-4fe9-868e-d64c2f4c749c")
    public static final String STEREOTYPE_NAME = "SwInteractionResource_Link";

    @objid ("063a07ee-d12c-440e-9e89-6a96a81f47ee")
    public static final String SWINTERACTIONRESOURCE_LINK_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE = "SwInteractionResource_Link_isIntraMemoryPartitionInteraction";

    @objid ("ae35e75f-7768-4a3a-859e-184cf7bf27b6")
    public static final String SWINTERACTIONRESOURCE_LINK_WAITINGPOLICYELEMENTS_TAGTYPE = "SwInteractionResource_Link_waitingPolicyElements";

    @objid ("38ba669d-05b2-4583-9b5a-ce99b0525a90")
    public static final String SWINTERACTIONRESOURCE_LINK_WAITINGQUEUECAPACITY_TAGTYPE = "SwInteractionResource_Link_waitingQueueCapacity";

    @objid ("f9819c08-dfc5-4278-bfb5-6e6b6f698086")
    public static final String SWINTERACTIONRESOURCE_LINK_WAITINGQUEUEPOLICY_TAGTYPE = "SwInteractionResource_Link_waitingQueuePolicy";

    /**
     * Tells whether a {@link SwInteractionResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwInteractionResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d1669aaa-bd5e-4549-811f-5e81e456e84b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwInteractionResource_Link >> then instantiate a {@link SwInteractionResourceLink} proxy.
     * 
     * @return a {@link SwInteractionResourceLink} proxy on the created {@link Link}.
     */
    @objid ("47f98615-b56b-4420-a139-7772f9b55119")
    public static SwInteractionResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceLink.STEREOTYPE_NAME);
        return SwInteractionResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceLink} proxy from a {@link Link} stereotyped << SwInteractionResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SwInteractionResourceLink} proxy or <i>null</i>.
     */
    @objid ("eb87dcff-eb8c-4724-abaf-52c01f22f0b8")
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
    @objid ("28e566df-791d-4548-83db-41b02b219c30")
    public static SwInteractionResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwInteractionResourceLink.canInstantiate(obj))
        	return new SwInteractionResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwInteractionResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("30debaf9-ebf2-49bc-9551-14d51f184841")
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
    @objid ("a7214aa0-fa3d-4423-8d07-93c4e6a519fe")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwInteractionResource_Link_waitingPolicyElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ce2350ea-4f65-4aac-9933-546f04761556")
    public List<String> getSwInteractionResource_Link_waitingPolicyElements() {
        return this.elt.getTagValues(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_WAITINGPOLICYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Link_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d3fac31e-5803-4564-87f1-6c2286c4c6c3")
    public String getSwInteractionResource_Link_waitingQueueCapacity() {
        return this.elt.getTagValue(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_WAITINGQUEUECAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Link_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("615f5e84-a35f-4193-85bd-75b8c68f2687")
    public String getSwInteractionResource_Link_waitingQueuePolicy() {
        return this.elt.getTagValue(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_WAITINGQUEUEPOLICY_TAGTYPE_ELT);
    }

    @objid ("39bf848d-c5bd-4bc8-af17-4dc65c6af071")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwInteractionResource_Link_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9c7b25e3-2862-4f04-b00d-2a923cbf8066")
    public boolean isSwInteractionResource_Link_isIntraMemoryPartitionInteraction() {
        return this.elt.isTagged(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwInteractionResource_Link_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a04cd2a-ecae-4f28-87eb-5f3701166b3e")
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
    @objid ("f4338a7a-82ef-4e36-996f-14e582c15bed")
    public void setSwInteractionResource_Link_waitingPolicyElements(final List<String> values) {
        this.elt.putTagValues(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_WAITINGPOLICYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwInteractionResource_Link_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8482f0ec-19c7-465a-b0f5-927fd2e35f04")
    public void setSwInteractionResource_Link_waitingQueueCapacity(final String value) {
        this.elt.putTagValue(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_WAITINGQUEUECAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwInteractionResource_Link_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1c9a2fa9-75f5-4d70-820f-62ab89c072c8")
    public void setSwInteractionResource_Link_waitingQueuePolicy(final String value) {
        this.elt.putTagValue(SwInteractionResourceLink.MdaTypes.SWINTERACTIONRESOURCE_LINK_WAITINGQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("7505065e-e589-4c99-8a66-b66a0cbb08ef")
    protected SwInteractionResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("8aa18aa2-5949-41da-8e33-7752574f1cd0")
    public static final class MdaTypes {
        @objid ("3a4c5818-1b9b-4f4b-8748-49fe7c109aaa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9e0a50af-8e4e-4388-987b-2323bba5e60b")
        public static TagType SWINTERACTIONRESOURCE_LINK_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT;

        @objid ("e94c00f4-f909-4c89-b15c-dc5665a0bbbe")
        public static TagType SWINTERACTIONRESOURCE_LINK_WAITINGQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("0b4664f5-04ef-4016-b43e-cc036769a073")
        public static TagType SWINTERACTIONRESOURCE_LINK_WAITINGQUEUECAPACITY_TAGTYPE_ELT;

        @objid ("8c6a3b6a-3f3b-46ff-978e-1286147bd70a")
        public static TagType SWINTERACTIONRESOURCE_LINK_WAITINGPOLICYELEMENTS_TAGTYPE_ELT;

        @objid ("65312812-6b97-4bc0-9c70-d30ade5a7e2c")
        private static Stereotype MDAASSOCDEP;

        @objid ("47c497ce-0172-4f84-8532-7bb6e2478bfb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bad175a6-16ff-4ef2-8fd1-e2f0fe247753")
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
