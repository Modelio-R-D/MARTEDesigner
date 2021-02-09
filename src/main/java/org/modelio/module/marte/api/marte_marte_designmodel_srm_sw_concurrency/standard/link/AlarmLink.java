/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link;

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
 * Proxy class to handle a {@link Link} with << Alarm_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class AlarmLink extends InterruptResourceLink {
    public static final String STEREOTYPE_NAME = "Alarm_Link";

    public static final String ALARM_LINK_ISWATCHDOG_TAGTYPE = "Alarm_Link_isWatchdog";

    public static final String ALARM_LINK_TIMERS_TAGTYPE = "Alarm_Link_timers";

    /**
     * Tells whether a {@link AlarmLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << Alarm_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << Alarm_Link >> then instantiate a {@link AlarmLink} proxy.
     * 
     * @return a {@link AlarmLink} proxy on the created {@link Link}.
     */
    public static AlarmLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AlarmLink.STEREOTYPE_NAME);
        return AlarmLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link AlarmLink} proxy from a {@link Link} stereotyped << Alarm_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link AlarmLink} proxy or <i>null</i>.
     */
    public static AlarmLink instantiate(final Link obj) {
        return AlarmLink.canInstantiate(obj) ? new AlarmLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AlarmLink} proxy from a {@link Link} stereotyped << Alarm_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link AlarmLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static AlarmLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (AlarmLink.canInstantiate(obj))
        	return new AlarmLink(obj);
        else
        	throw new IllegalArgumentException("AlarmLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        AlarmLink other = (AlarmLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Alarm_Link_timers'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getAlarm_Link_timers() {
        return this.elt.getTagValues(AlarmLink.MdaTypes.ALARM_LINK_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_Link_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isAlarm_Link_isWatchdog() {
        return this.elt.isTagged(AlarmLink.MdaTypes.ALARM_LINK_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_Link_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAlarm_Link_isWatchdog(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AlarmLink.MdaTypes.ALARM_LINK_ISWATCHDOG_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AlarmLink.MdaTypes.ALARM_LINK_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'Alarm_Link_timers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAlarm_Link_timers(final List<String> values) {
        this.elt.putTagValues(AlarmLink.MdaTypes.ALARM_LINK_TIMERS_TAGTYPE_ELT, values);
    }

    protected AlarmLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType ALARM_LINK_ISWATCHDOG_TAGTYPE_ELT;

        public static TagType ALARM_LINK_TIMERS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01f43544-0ccf-11df-8525-001302895b2b");
            ALARM_LINK_ISWATCHDOG_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01f4354b-0ccf-11df-8525-001302895b2b");
            ALARM_LINK_TIMERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01f43552-0ccf-11df-8525-001302895b2b");
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
