/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.link;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << Clock_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ClockLink {
    public static final String STEREOTYPE_NAME = "Clock_Link";

    public static final String CLOCK_LINK_STANDARD_TAGTYPE = "Clock_Link_standard";

    public static final String CLOCK_LINK_TYPE_TAGTYPE = "Clock_Link_type";

    public static final String CLOCK_LINK_UNIT_TAGTYPE = "Clock_Link_unit";

    /**
     * The underlying {@link Link} represented by this proxy, never null.
     */
    protected final Link elt;

    /**
     * Tells whether a {@link ClockLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << Clock_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << Clock_Link >> then instantiate a {@link ClockLink} proxy.
     * 
     * @return a {@link ClockLink} proxy on the created {@link Link}.
     */
    public static ClockLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockLink.STEREOTYPE_NAME);
        return ClockLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link ClockLink} proxy from a {@link Link} stereotyped << Clock_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link ClockLink} proxy or <i>null</i>.
     */
    public static ClockLink instantiate(final Link obj) {
        return ClockLink.canInstantiate(obj) ? new ClockLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockLink} proxy from a {@link Link} stereotyped << Clock_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link ClockLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ClockLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (ClockLink.canInstantiate(obj))
        	return new ClockLink(obj);
        else
        	throw new IllegalArgumentException("ClockLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ClockLink other = (ClockLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Clock_Link_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClock_Link_standard() {
        return this.elt.getTagValue(ClockLink.MdaTypes.CLOCK_LINK_STANDARD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClock_Link_type() {
        return this.elt.getTagValue(ClockLink.MdaTypes.CLOCK_LINK_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Link_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClock_Link_unit() {
        return this.elt.getTagValue(ClockLink.MdaTypes.CLOCK_LINK_UNIT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    public Link getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Clock_Link_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClock_Link_standard(final String value) {
        this.elt.putTagValue(ClockLink.MdaTypes.CLOCK_LINK_STANDARD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClock_Link_type(final String value) {
        this.elt.putTagValue(ClockLink.MdaTypes.CLOCK_LINK_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Link_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClock_Link_unit(final String value) {
        this.elt.putTagValue(ClockLink.MdaTypes.CLOCK_LINK_UNIT_TAGTYPE_ELT, value);
    }

    protected ClockLink(final Link elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType CLOCK_LINK_STANDARD_TAGTYPE_ELT;

        public static TagType CLOCK_LINK_TYPE_TAGTYPE_ELT;

        public static TagType CLOCK_LINK_UNIT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dfdb017b-14cd-11df-9d54-0014222a9f79");
            CLOCK_LINK_STANDARD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dfdb017c-14cd-11df-9d54-0014222a9f79");
            CLOCK_LINK_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dfdb017d-14cd-11df-9d54-0014222a9f79");
            CLOCK_LINK_UNIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dfdb017e-14cd-11df-9d54-0014222a9f79");
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
