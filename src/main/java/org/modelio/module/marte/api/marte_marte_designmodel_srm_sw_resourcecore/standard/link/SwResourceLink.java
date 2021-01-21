/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.link;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << SwResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7e518789-fd97-4f7e-8e40-839ae7fcae28")
public class SwResourceLink extends ResourceLink {
    @objid ("905404fa-61d7-4cd6-bb3a-c9b6681e8032")
    public static final String STEREOTYPE_NAME = "SwResource_Link";

    @objid ("53332a11-ca74-46a0-ae1b-8d40b4c6252a")
    public static final String SWRESOURCE_LINK_CREATESERVICES_TAGTYPE = "SwResource_Link_createServices";

    @objid ("113e1f0b-b56f-430b-8019-d59886a91184")
    public static final String SWRESOURCE_LINK_DELETESERVICES_TAGTYPE = "SwResource_Link_deleteServices";

    @objid ("b999648c-5fa1-4498-b3be-3a59166f5c8c")
    public static final String SWRESOURCE_LINK_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_Link_identifierElements";

    @objid ("20a2f08c-c961-4335-a9f7-63fd4a681c56")
    public static final String SWRESOURCE_LINK_INITIALIZESERVICES_TAGTYPE = "SwResource_Link_initializeServices";

    @objid ("ea20b728-7f49-448c-80ba-3fc93a4c2a28")
    public static final String SWRESOURCE_LINK_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_Link_memorySizeFootprint";

    @objid ("3beb574e-e98e-4379-b5e6-062efb2045e0")
    public static final String SWRESOURCE_LINK_STATEELEMENTS_TAGTYPE = "SwResource_Link_stateElements";

    /**
     * Tells whether a {@link SwResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("db3c70a8-8205-4183-a4f1-a791e5e26bb2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwResource_Link >> then instantiate a {@link SwResourceLink} proxy.
     * 
     * @return a {@link SwResourceLink} proxy on the created {@link Link}.
     */
    @objid ("5be598c8-02b3-4ee6-8184-70a4d4af056d")
    public static SwResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceLink.STEREOTYPE_NAME);
        return SwResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceLink} proxy from a {@link Link} stereotyped << SwResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SwResourceLink} proxy or <i>null</i>.
     */
    @objid ("7ddced44-aab7-4d9f-b7ec-7dd48ac2ad65")
    public static SwResourceLink instantiate(final Link obj) {
        return SwResourceLink.canInstantiate(obj) ? new SwResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwResourceLink} proxy from a {@link Link} stereotyped << SwResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SwResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("126d79a7-5dcb-4370-9519-fa873fda83d8")
    public static SwResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwResourceLink.canInstantiate(obj))
        	return new SwResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("131bd4e8-97e5-4a84-a541-8026afc40c18")
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
        SwResourceLink other = (SwResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("58b3908c-5499-4e2c-bd4f-ef911429be73")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwResource_Link_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6f62d86f-3f9c-4b77-98d7-3759d4c38335")
    public List<String> getSwResource_Link_createServices() {
        return this.elt.getTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Link_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d1780a8c-27b3-4ad4-bbd6-a13a8c0693ee")
    public List<String> getSwResource_Link_deleteServices() {
        return this.elt.getTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Link_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("78bc11f8-caac-47d1-95d4-4f74578bbac6")
    public List<String> getSwResource_Link_identifierElements() {
        return this.elt.getTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Link_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a60aa0aa-0fc1-4e99-9e6d-550d0be0b375")
    public List<String> getSwResource_Link_initializeServices() {
        return this.elt.getTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_Link_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b982b14d-0ea2-40e5-a204-ba0318a03fd5")
    public String getSwResource_Link_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceLink.MdaTypes.SWRESOURCE_LINK_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Link_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b9c12698-9a75-476e-b817-97ee44a1a814")
    public List<String> getSwResource_Link_stateElements() {
        return this.elt.getTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_STATEELEMENTS_TAGTYPE_ELT);
    }

    @objid ("5d315094-93e4-4655-a4f6-db00a63ab3bb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_Link_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c9fca798-0013-41ed-acf4-8bbd073cadaf")
    public void setSwResource_Link_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Link_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fbc44604-d2d8-47a9-ab8e-ee937112c1c4")
    public void setSwResource_Link_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Link_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("48bd6076-3ed5-47f8-95bf-739944964d5d")
    public void setSwResource_Link_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Link_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("80856671-69a5-4a6b-a647-c8de55427377")
    public void setSwResource_Link_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_Link_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("338b49f8-ce76-4bf7-96bc-b91ecc528239")
    public void setSwResource_Link_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceLink.MdaTypes.SWRESOURCE_LINK_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_Link_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c10cbc3-b8ec-4195-acb1-ca4b1225cfb5")
    public void setSwResource_Link_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("61f5c4b8-4f9c-4412-bad1-e9c2994cdaaa")
    protected SwResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("54e46f72-6bf0-4d0d-b187-7728f81afc54")
    public static final class MdaTypes {
        @objid ("0c11b0a8-3cff-473a-856c-38a40db2f406")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a4ebb99b-a441-4eeb-a9ec-16360eeb7e5b")
        public static TagType SWRESOURCE_LINK_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        @objid ("16926bb4-757c-49e2-b249-b0554ce2c4ef")
        public static TagType SWRESOURCE_LINK_STATEELEMENTS_TAGTYPE_ELT;

        @objid ("03321ace-886c-4ba5-a121-bd48a1b79bc1")
        public static TagType SWRESOURCE_LINK_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        @objid ("67767347-8570-406f-8016-fc694b3bc53f")
        public static TagType SWRESOURCE_LINK_CREATESERVICES_TAGTYPE_ELT;

        @objid ("d58fa24e-f95c-4964-a7ae-3581c7f49a77")
        public static TagType SWRESOURCE_LINK_DELETESERVICES_TAGTYPE_ELT;

        @objid ("9cb61f61-e963-4617-8228-69cc81c0601c")
        public static TagType SWRESOURCE_LINK_INITIALIZESERVICES_TAGTYPE_ELT;

        @objid ("64780666-2c23-4ac0-9add-0b87c545fac4")
        private static Stereotype MDAASSOCDEP;

        @objid ("1025a448-11b9-4cb8-bf5d-f84c0d82de43")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a41c85b0-5daa-40f7-8acf-b208df629def")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a32660-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_LINK_IDENTIFIERELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32667-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_LINK_STATEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a3266e-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_LINK_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588ae-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_LINK_CREATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588b5-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_LINK_DELETESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588bc-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_LINK_INITIALIZESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588c3-0ccf-11df-8525-001302895b2b");
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
