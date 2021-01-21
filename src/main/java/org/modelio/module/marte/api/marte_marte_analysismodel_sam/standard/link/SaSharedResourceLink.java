/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.link;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.MutualExclusionResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << SaSharedResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2deafe38-691b-45c2-8d93-0d48f35d624d")
public class SaSharedResourceLink extends MutualExclusionResourceLink {
    @objid ("5169d961-f9b4-40c9-8bba-ed15a91c7e12")
    public static final String STEREOTYPE_NAME = "SaSharedResource_Link";

    @objid ("c32fa94a-30ee-4b47-9e58-2a01c5cf87ae")
    public static final String SASHAREDRESOURCE_LINK_ACQUIST_TAGTYPE = "SaSharedResource_Link_acquisT";

    @objid ("2af81de0-be9b-48eb-8e1e-92c3c1acc008")
    public static final String SASHAREDRESOURCE_LINK_CAPACITY_TAGTYPE = "SaSharedResource_Link_capacity";

    @objid ("0214fb34-84c2-4a13-9468-4fc1372bc7ca")
    public static final String SASHAREDRESOURCE_LINK_ISCONSUM_TAGTYPE = "SaSharedResource_Link_isConsum";

    @objid ("b29dd359-7e06-44ca-bbf5-39b040e6f74a")
    public static final String SASHAREDRESOURCE_LINK_ISPREEMP_TAGTYPE = "SaSharedResource_Link_isPreemp";

    @objid ("0bb88670-40da-4b38-9c8e-520257266350")
    public static final String SASHAREDRESOURCE_LINK_RELEASET_TAGTYPE = "SaSharedResource_Link_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SaSharedResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5cf26ef3-d10d-4262-8805-04dd61d72451")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SaSharedResource_Link >> then instantiate a {@link SaSharedResourceLink} proxy.
     * 
     * @return a {@link SaSharedResourceLink} proxy on the created {@link Link}.
     */
    @objid ("7f757cd1-4d02-4978-b642-3a3933c21e05")
    public static SaSharedResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceLink.STEREOTYPE_NAME);
        return SaSharedResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceLink} proxy from a {@link Link} stereotyped << SaSharedResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SaSharedResourceLink} proxy or <i>null</i>.
     */
    @objid ("2a3e272b-698c-4626-8b2f-99d777a480c3")
    public static SaSharedResourceLink instantiate(final Link obj) {
        return SaSharedResourceLink.canInstantiate(obj) ? new SaSharedResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceLink} proxy from a {@link Link} stereotyped << SaSharedResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SaSharedResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5dcc7b0d-d339-408c-a0e8-0272ee08b7aa")
    public static SaSharedResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SaSharedResourceLink.canInstantiate(obj))
        	return new SaSharedResourceLink(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1aa22203-8f0c-442e-b9b1-5f0ce3e5da80")
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
        SaSharedResourceLink other = (SaSharedResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("d5c95d1a-445d-4dca-9ba9-2a92f7de3227")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Link_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("84874011-e40a-4cac-8edd-a0f360559476")
    public List<String> getSaSharedResource_Link_acquisT() {
        return this.elt.getTagValues(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Link_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb470d6f-9763-45d2-8702-59f49f3e43f4")
    public String getSaSharedResource_Link_capacity() {
        return this.elt.getTagValue(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Link_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("939f9c6d-7f60-49f3-8896-433dc1df3cac")
    public List<String> getSaSharedResource_Link_releaseT() {
        return this.elt.getTagValues(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_RELEASET_TAGTYPE_ELT);
    }

    @objid ("379b558d-4664-4699-b17e-e505054204ac")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Link_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c1d2d338-9b18-42e5-b4e1-538be7bb9c3c")
    public boolean isSaSharedResource_Link_isConsum() {
        return this.elt.isTagged(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Link_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("81670d07-0076-4778-a83b-d7bda560e5dc")
    public boolean isSaSharedResource_Link_isPreemp() {
        return this.elt.isTagged(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Link_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("50fb42ae-4175-43fa-a79a-1866054aebfd")
    public void setSaSharedResource_Link_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Link_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e5495608-344e-49c9-842a-39d2c2b2dd86")
    public void setSaSharedResource_Link_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Link_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2eff9fef-ed6c-4dd7-9747-3267c310a9ce")
    public void setSaSharedResource_Link_isConsum(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ISCONSUM_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Link_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("703055b6-ff9a-4456-ad3f-868213e56cd7")
    public void setSaSharedResource_Link_isPreemp(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ISPREEMP_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Link_releaseT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c3d4de77-3e1a-4bd5-a8c2-8ec73d37fc9c")
    public void setSaSharedResource_Link_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_RELEASET_TAGTYPE_ELT, values);
    }

    @objid ("2780fe0b-b2c2-4fe0-b7f1-f6401257d281")
    protected SaSharedResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("219a7199-8316-45ee-85d2-1c63c3e89d0b")
    public static final class MdaTypes {
        @objid ("6b1a4b36-ac6d-4bb0-98fd-f082f07faac1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8b3c36bc-54d7-40cb-b410-adcee5e5f689")
        public static TagType SASHAREDRESOURCE_LINK_CAPACITY_TAGTYPE_ELT;

        @objid ("9075cba8-19c8-4ee8-b91b-6495b14a8e47")
        public static TagType SASHAREDRESOURCE_LINK_ISPREEMP_TAGTYPE_ELT;

        @objid ("3688c664-bd03-45ff-ba45-116b274b1e29")
        public static TagType SASHAREDRESOURCE_LINK_ISCONSUM_TAGTYPE_ELT;

        @objid ("8f66df68-a9c2-4fe0-907a-30eb15eabeda")
        public static TagType SASHAREDRESOURCE_LINK_ACQUIST_TAGTYPE_ELT;

        @objid ("e8297c09-7244-4dbe-bb9c-b961cf019d3c")
        public static TagType SASHAREDRESOURCE_LINK_RELEASET_TAGTYPE_ELT;

        @objid ("04b1b254-c2ce-4fff-afa2-049c8a928c61")
        private static Stereotype MDAASSOCDEP;

        @objid ("cfa853c7-a150-4514-a59a-ef8cc4547794")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5603c2e9-3dc3-4f1d-8111-1c21bc561999")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03956b53-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_LINK_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b5a-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_LINK_ISPREEMP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b61-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_LINK_ISCONSUM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0397cda1-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_LINK_ACQUIST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0397cda8-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_LINK_RELEASET_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0397cdaf-0ccf-11df-8525-001302895b2b");
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
