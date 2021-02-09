/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.link;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Link} with << PaLogicalResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class PaLogicalResourceLink extends ResourceLink {
    public static final String STEREOTYPE_NAME = "PaLogicalResource_Link";

    public static final String PALOGICALRESOURCE_LINK_POOLSIZE_TAGTYPE = "PaLogicalResource_Link_poolSize";

    public static final String PALOGICALRESOURCE_LINK_THROUGHPUT_TAGTYPE = "PaLogicalResource_Link_throughput";

    public static final String PALOGICALRESOURCE_LINK_UTILIZATION_TAGTYPE = "PaLogicalResource_Link_utilization";

    /**
     * Tells whether a {@link PaLogicalResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << PaLogicalResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << PaLogicalResource_Link >> then instantiate a {@link PaLogicalResourceLink} proxy.
     * 
     * @return a {@link PaLogicalResourceLink} proxy on the created {@link Link}.
     */
    public static PaLogicalResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceLink.STEREOTYPE_NAME);
        return PaLogicalResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceLink} proxy from a {@link Link} stereotyped << PaLogicalResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link PaLogicalResourceLink} proxy or <i>null</i>.
     */
    public static PaLogicalResourceLink instantiate(final Link obj) {
        return PaLogicalResourceLink.canInstantiate(obj) ? new PaLogicalResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceLink} proxy from a {@link Link} stereotyped << PaLogicalResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link PaLogicalResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static PaLogicalResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (PaLogicalResourceLink.canInstantiate(obj))
        	return new PaLogicalResourceLink(obj);
        else
        	throw new IllegalArgumentException("PaLogicalResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        PaLogicalResourceLink other = (PaLogicalResourceLink) obj;
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
     * Getter for string property 'PaLogicalResource_Link_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaLogicalResource_Link_poolSize() {
        return this.elt.getTagValue(PaLogicalResourceLink.MdaTypes.PALOGICALRESOURCE_LINK_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Link_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaLogicalResource_Link_throughput() {
        return this.elt.getTagValue(PaLogicalResourceLink.MdaTypes.PALOGICALRESOURCE_LINK_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Link_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaLogicalResource_Link_utilization() {
        return this.elt.getTagValue(PaLogicalResourceLink.MdaTypes.PALOGICALRESOURCE_LINK_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaLogicalResource_Link_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaLogicalResource_Link_poolSize(final String value) {
        this.elt.putTagValue(PaLogicalResourceLink.MdaTypes.PALOGICALRESOURCE_LINK_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Link_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaLogicalResource_Link_throughput(final String value) {
        this.elt.putTagValue(PaLogicalResourceLink.MdaTypes.PALOGICALRESOURCE_LINK_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Link_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaLogicalResource_Link_utilization(final String value) {
        this.elt.putTagValue(PaLogicalResourceLink.MdaTypes.PALOGICALRESOURCE_LINK_UTILIZATION_TAGTYPE_ELT, value);
    }

    protected PaLogicalResourceLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType PALOGICALRESOURCE_LINK_UTILIZATION_TAGTYPE_ELT;

        public static TagType PALOGICALRESOURCE_LINK_THROUGHPUT_TAGTYPE_ELT;

        public static TagType PALOGICALRESOURCE_LINK_POOLSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d10556-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_LINK_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d1055d-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_LINK_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367a3-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_LINK_POOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367aa-0ccf-11df-8525-001302895b2b");
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
