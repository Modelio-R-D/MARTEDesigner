/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.link;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << SwResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwResourceLink extends ResourceLink {
    public static final String STEREOTYPE_NAME = "SwResource_Link";

    public static final String SWRESOURCE_LINK_CREATESERVICES_TAGTYPE = "SwResource_Link_createServices";

    public static final String SWRESOURCE_LINK_DELETESERVICES_TAGTYPE = "SwResource_Link_deleteServices";

    public static final String SWRESOURCE_LINK_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_Link_identifierElements";

    public static final String SWRESOURCE_LINK_INITIALIZESERVICES_TAGTYPE = "SwResource_Link_initializeServices";

    public static final String SWRESOURCE_LINK_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_Link_memorySizeFootprint";

    public static final String SWRESOURCE_LINK_STATEELEMENTS_TAGTYPE = "SwResource_Link_stateElements";

    /**
     * Tells whether a {@link SwResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwResource_Link >> then instantiate a {@link SwResourceLink} proxy.
     * 
     * @return a {@link SwResourceLink} proxy on the created {@link Link}.
     */
    public static SwResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceLink.STEREOTYPE_NAME);
        return SwResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceLink} proxy from a {@link Link} stereotyped << SwResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SwResourceLink} proxy or <i>null</i>.
     */
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
    public static SwResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwResourceLink.canInstantiate(obj))
        	return new SwResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwResourceLink other = (SwResourceLink) obj;
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
     * Getter for List<String> property 'SwResource_Link_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Link_createServices() {
        return this.elt.getTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Link_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Link_deleteServices() {
        return this.elt.getTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Link_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Link_identifierElements() {
        return this.elt.getTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Link_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Link_initializeServices() {
        return this.elt.getTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_Link_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwResource_Link_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceLink.MdaTypes.SWRESOURCE_LINK_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Link_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Link_stateElements() {
        return this.elt.getTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_STATEELEMENTS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_Link_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Link_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Link_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Link_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Link_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Link_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Link_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Link_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_Link_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Link_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceLink.MdaTypes.SWRESOURCE_LINK_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_Link_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Link_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceLink.MdaTypes.SWRESOURCE_LINK_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    protected SwResourceLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWRESOURCE_LINK_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_LINK_STATEELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_LINK_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        public static TagType SWRESOURCE_LINK_CREATESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_LINK_DELETESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_LINK_INITIALIZESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
