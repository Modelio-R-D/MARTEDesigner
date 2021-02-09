/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

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
 * Proxy class to handle a {@link Link} with << TimerResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimerResourceLink extends TimingResourceLink {
    public static final String STEREOTYPE_NAME = "TimerResource_Link";

    public static final String TIMERRESOURCE_LINK_DURATION_TAGTYPE = "TimerResource_Link_duration";

    public static final String TIMERRESOURCE_LINK_ISPERIODIC_TAGTYPE = "TimerResource_Link_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << TimerResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << TimerResource_Link >> then instantiate a {@link TimerResourceLink} proxy.
     * 
     * @return a {@link TimerResourceLink} proxy on the created {@link Link}.
     */
    public static TimerResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceLink.STEREOTYPE_NAME);
        return TimerResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceLink} proxy from a {@link Link} stereotyped << TimerResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link TimerResourceLink} proxy or <i>null</i>.
     */
    public static TimerResourceLink instantiate(final Link obj) {
        return TimerResourceLink.canInstantiate(obj) ? new TimerResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerResourceLink} proxy from a {@link Link} stereotyped << TimerResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link TimerResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimerResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (TimerResourceLink.canInstantiate(obj))
        	return new TimerResourceLink(obj);
        else
        	throw new IllegalArgumentException("TimerResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        TimerResourceLink other = (TimerResourceLink) obj;
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
     * Getter for string property 'TimerResource_Link_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimerResource_Link_duration() {
        return this.elt.getTagValue(TimerResourceLink.MdaTypes.TIMERRESOURCE_LINK_DURATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Link_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isTimerResource_Link_isPeriodic() {
        return this.elt.isTagged(TimerResourceLink.MdaTypes.TIMERRESOURCE_LINK_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Link_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_Link_duration(final String value) {
        this.elt.putTagValue(TimerResourceLink.MdaTypes.TIMERRESOURCE_LINK_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Link_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_Link_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceLink.MdaTypes.TIMERRESOURCE_LINK_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceLink.MdaTypes.TIMERRESOURCE_LINK_ISPERIODIC_TAGTYPE_ELT);
    }

    protected TimerResourceLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TIMERRESOURCE_LINK_DURATION_TAGTYPE_ELT;

        public static TagType TIMERRESOURCE_LINK_ISPERIODIC_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00a1abc8-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_LINK_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abcf-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_LINK_ISPERIODIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abd6-0ccf-11df-8525-001302895b2b");
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
