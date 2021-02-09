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
 * Proxy class to handle a {@link Link} with << SharedDataComResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SharedDataComResourceLink extends SwCommunicationResourceLink {
    public static final String STEREOTYPE_NAME = "SharedDataComResource_Link";

    public static final String SHAREDDATACOMRESOURCE_LINK_READSERVICES_TAGTYPE = "SharedDataComResource_Link_readServices";

    public static final String SHAREDDATACOMRESOURCE_LINK_WRITESERVICES_TAGTYPE = "SharedDataComResource_Link_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SharedDataComResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SharedDataComResource_Link >> then instantiate a {@link SharedDataComResourceLink} proxy.
     * 
     * @return a {@link SharedDataComResourceLink} proxy on the created {@link Link}.
     */
    public static SharedDataComResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceLink.STEREOTYPE_NAME);
        return SharedDataComResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceLink} proxy from a {@link Link} stereotyped << SharedDataComResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SharedDataComResourceLink} proxy or <i>null</i>.
     */
    public static SharedDataComResourceLink instantiate(final Link obj) {
        return SharedDataComResourceLink.canInstantiate(obj) ? new SharedDataComResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceLink} proxy from a {@link Link} stereotyped << SharedDataComResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SharedDataComResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SharedDataComResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SharedDataComResourceLink.canInstantiate(obj))
        	return new SharedDataComResourceLink(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SharedDataComResourceLink other = (SharedDataComResourceLink) obj;
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
     * Getter for List<String> property 'SharedDataComResource_Link_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSharedDataComResource_Link_readServices() {
        return this.elt.getTagValues(SharedDataComResourceLink.MdaTypes.SHAREDDATACOMRESOURCE_LINK_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Link_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSharedDataComResource_Link_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceLink.MdaTypes.SHAREDDATACOMRESOURCE_LINK_WRITESERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Link_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSharedDataComResource_Link_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceLink.MdaTypes.SHAREDDATACOMRESOURCE_LINK_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Link_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSharedDataComResource_Link_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceLink.MdaTypes.SHAREDDATACOMRESOURCE_LINK_WRITESERVICES_TAGTYPE_ELT, values);
    }

    protected SharedDataComResourceLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SHAREDDATACOMRESOURCE_LINK_READSERVICES_TAGTYPE_ELT;

        public static TagType SHAREDDATACOMRESOURCE_LINK_WRITESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0221815a-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_LINK_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02218161-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_LINK_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02218168-0ccf-11df-8525-001302895b2b");
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
