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
public class SaSharedResourceLink extends MutualExclusionResourceLink {
    public static final String STEREOTYPE_NAME = "SaSharedResource_Link";

    public static final String SASHAREDRESOURCE_LINK_ACQUIST_TAGTYPE = "SaSharedResource_Link_acquisT";

    public static final String SASHAREDRESOURCE_LINK_CAPACITY_TAGTYPE = "SaSharedResource_Link_capacity";

    public static final String SASHAREDRESOURCE_LINK_ISCONSUM_TAGTYPE = "SaSharedResource_Link_isConsum";

    public static final String SASHAREDRESOURCE_LINK_ISPREEMP_TAGTYPE = "SaSharedResource_Link_isPreemp";

    public static final String SASHAREDRESOURCE_LINK_RELEASET_TAGTYPE = "SaSharedResource_Link_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SaSharedResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SaSharedResource_Link >> then instantiate a {@link SaSharedResourceLink} proxy.
     * 
     * @return a {@link SaSharedResourceLink} proxy on the created {@link Link}.
     */
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
    public static SaSharedResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SaSharedResourceLink.canInstantiate(obj))
        	return new SaSharedResourceLink(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaSharedResourceLink other = (SaSharedResourceLink) obj;
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
     * Getter for List<String> property 'SaSharedResource_Link_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_Link_acquisT() {
        return this.elt.getTagValues(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Link_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaSharedResource_Link_capacity() {
        return this.elt.getTagValue(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Link_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_Link_releaseT() {
        return this.elt.getTagValues(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_RELEASET_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Link_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_Link_isConsum() {
        return this.elt.isTagged(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Link_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_Link_isPreemp() {
        return this.elt.isTagged(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Link_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Link_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Link_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Link_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Link_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setSaSharedResource_Link_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceLink.MdaTypes.SASHAREDRESOURCE_LINK_RELEASET_TAGTYPE_ELT, values);
    }

    protected SaSharedResourceLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SASHAREDRESOURCE_LINK_CAPACITY_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_LINK_ISPREEMP_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_LINK_ISCONSUM_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_LINK_ACQUIST_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_LINK_RELEASET_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
