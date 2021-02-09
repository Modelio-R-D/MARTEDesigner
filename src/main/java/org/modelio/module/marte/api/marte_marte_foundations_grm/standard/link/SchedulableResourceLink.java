/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

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
 * Proxy class to handle a {@link Link} with << SchedulableResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SchedulableResourceLink extends ResourceLink {
    public static final String STEREOTYPE_NAME = "SchedulableResource_Link";

    public static final String SCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE = "SchedulableResource_Link_dependentScheduler";

    public static final String SCHEDULABLERESOURCE_LINK_HOST_TAGTYPE = "SchedulableResource_Link_host";

    public static final String SCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE = "SchedulableResource_Link_schedParams";

    /**
     * Tells whether a {@link SchedulableResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SchedulableResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SchedulableResource_Link >> then instantiate a {@link SchedulableResourceLink} proxy.
     * 
     * @return a {@link SchedulableResourceLink} proxy on the created {@link Link}.
     */
    public static SchedulableResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceLink.STEREOTYPE_NAME);
        return SchedulableResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceLink} proxy from a {@link Link} stereotyped << SchedulableResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SchedulableResourceLink} proxy or <i>null</i>.
     */
    public static SchedulableResourceLink instantiate(final Link obj) {
        return SchedulableResourceLink.canInstantiate(obj) ? new SchedulableResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceLink} proxy from a {@link Link} stereotyped << SchedulableResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SchedulableResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SchedulableResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SchedulableResourceLink.canInstantiate(obj))
        	return new SchedulableResourceLink(obj);
        else
        	throw new IllegalArgumentException("SchedulableResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SchedulableResourceLink other = (SchedulableResourceLink) obj;
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
     * Getter for string property 'SchedulableResource_Link_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSchedulableResource_Link_dependentScheduler() {
        return this.elt.getTagValue(SchedulableResourceLink.MdaTypes.SCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SchedulableResource_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSchedulableResource_Link_host() {
        return this.elt.getTagValue(SchedulableResourceLink.MdaTypes.SCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SchedulableResource_Link_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSchedulableResource_Link_schedParams() {
        return this.elt.getTagValues(SchedulableResourceLink.MdaTypes.SCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SchedulableResource_Link_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSchedulableResource_Link_dependentScheduler(final String value) {
        this.elt.putTagValue(SchedulableResourceLink.MdaTypes.SCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SchedulableResource_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSchedulableResource_Link_host(final String value) {
        this.elt.putTagValue(SchedulableResourceLink.MdaTypes.SCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SchedulableResource_Link_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSchedulableResource_Link_schedParams(final List<String> values) {
        this.elt.putTagValues(SchedulableResourceLink.MdaTypes.SCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    protected SchedulableResourceLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT;

        public static TagType SCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT;

        public static TagType SCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "008e9938-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_LINK_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb89-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_LINK_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb90-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb97-0ccf-11df-8525-001302895b2b");
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
