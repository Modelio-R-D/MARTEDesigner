/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("ac5dadf5-21c2-420a-9a41-8ef7e4c1a37f")
    public static final String STEREOTYPE_NAME = "SaSharedResource_Link";

    @objid ("eda0c71d-9314-45ad-83ff-f6f2db0d4fab")
    public static final String SASHAREDRESOURCE_LINK_ACQUIST_TAGTYPE = "SaSharedResource_Link_acquisT";

    @objid ("566c2e7e-5332-4ed7-a050-7437ed47e206")
    public static final String SASHAREDRESOURCE_LINK_CAPACITY_TAGTYPE = "SaSharedResource_Link_capacity";

    @objid ("94ee5e6a-caaa-45a3-8615-1d32ebe3a70a")
    public static final String SASHAREDRESOURCE_LINK_ISCONSUM_TAGTYPE = "SaSharedResource_Link_isConsum";

    @objid ("5b754b45-6602-4c4f-b0ce-6ef3bd7d2582")
    public static final String SASHAREDRESOURCE_LINK_ISPREEMP_TAGTYPE = "SaSharedResource_Link_isPreemp";

    @objid ("f321f839-9002-4a81-ba2e-208f65a5fdf8")
    public static final String SASHAREDRESOURCE_LINK_RELEASET_TAGTYPE = "SaSharedResource_Link_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SaSharedResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("197f90f9-6310-4e21-93d6-0ade2c250189")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SaSharedResource_Link >> then instantiate a {@link SaSharedResourceLink} proxy.
     * 
     * @return a {@link SaSharedResourceLink} proxy on the created {@link Link}.
     */
    @objid ("04cd887e-65ff-4e91-9143-1792fc32262c")
    public static SaSharedResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceLink.STEREOTYPE_NAME);
        return SaSharedResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceLink} proxy from a {@link Link} stereotyped << SaSharedResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SaSharedResourceLink} proxy or <i>null</i>.
     */
    @objid ("0fabd7c0-9ba0-47ad-a380-c8e993bcbf36")
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
    @objid ("a7df47fb-0f5c-45c0-842c-d51a947e5443")
    public static SaSharedResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SaSharedResourceLink.canInstantiate(obj))
        	return new SaSharedResourceLink(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("74a1ea52-9838-4aa9-9593-95bba908acda")
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
    @objid ("693b6371-5878-4eee-b5ab-eb8746233579")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Link_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1040304d-11ce-4f4f-8e51-5f0d06c38bce")
    public List<String> getSaSharedResource_Link_acquisT() {
        return this.elt.getTagValues(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Link_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8379e28e-7459-4f6e-be40-1a20abeecfdd")
    public String getSaSharedResource_Link_capacity() {
        return this.elt.getTagValue(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Link_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("07fe7093-3266-40c5-8e91-51675b746a5f")
    public List<String> getSaSharedResource_Link_releaseT() {
        return this.elt.getTagValues(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_RELEASET_TAGTYPE_ELT);
    }

    @objid ("300e1cec-d269-4833-9c32-70243519a964")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Link_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("377b0930-e639-4ced-b707-dd7b6cccb873")
    public boolean isSaSharedResource_Link_isConsum() {
        return this.elt.isTagged(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Link_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b5683de2-d2a5-4da0-869d-5b68af7ed2bd")
    public boolean isSaSharedResource_Link_isPreemp() {
        return this.elt.isTagged(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Link_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4de22bef-c3db-4d33-b834-5359023699e0")
    public void setSaSharedResource_Link_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Link_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cb2842f6-f983-4386-898e-477b5c7340bf")
    public void setSaSharedResource_Link_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Link_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bc90122d-4ec8-48fc-a5ac-9bf7603f6423")
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
    @objid ("17b4c36b-a94d-44a0-b9b6-388864f122db")
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
    @objid ("315e7ce8-a347-4af0-9837-e30aab5f2be3")
    public void setSaSharedResource_Link_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_RELEASET_TAGTYPE_ELT, values);
    }

    @objid ("ba11f719-e26b-4699-9dc7-02c28ca345d8")
    protected SaSharedResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("219a7199-8316-45ee-85d2-1c63c3e89d0b")
    public static final class MdaTypes {
        @objid ("60e84514-ba72-458b-b1ff-44b1afda5cf2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("59e113e6-fc8d-42c6-af69-069e5ef11a90")
        public static TagType SASHAREDRESOURCE_LINK_CAPACITY_TAGTYPE_ELT;

        @objid ("dc009e65-1b7c-4faf-b0b7-594005e1d9c7")
        public static TagType SASHAREDRESOURCE_LINK_ISPREEMP_TAGTYPE_ELT;

        @objid ("70ad004f-1c41-407c-b8c7-9e49a8fc7266")
        public static TagType SASHAREDRESOURCE_LINK_ISCONSUM_TAGTYPE_ELT;

        @objid ("cded498a-c404-4fda-b066-21bc244397d3")
        public static TagType SASHAREDRESOURCE_LINK_ACQUIST_TAGTYPE_ELT;

        @objid ("3fbb3ed3-c7fb-410e-b2a1-982c2cefd4a4")
        public static TagType SASHAREDRESOURCE_LINK_RELEASET_TAGTYPE_ELT;

        @objid ("65ed6c6a-c40e-4f12-86c2-5de755a71e98")
        private static Stereotype MDAASSOCDEP;

        @objid ("3556d521-e432-4a97-811f-67c014b19822")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("85be6b9d-b897-4f38-a6b2-572cbdf70fb8")
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
