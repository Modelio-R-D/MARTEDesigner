/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << Alarm_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b704c2aa-b0eb-4ce6-9560-25d39c5bad63")
public class AlarmLink extends InterruptResourceLink {
    @objid ("4b5c052c-4b40-49db-a837-bb49079e7c1c")
    public static final String STEREOTYPE_NAME = "Alarm_Link";

    @objid ("729377ae-42e9-4e15-96d6-66d631ee7276")
    public static final String ALARM_LINK_ISWATCHDOG_TAGTYPE = "Alarm_Link_isWatchdog";

    @objid ("372d26a5-7706-4fef-8823-f199e37fd56b")
    public static final String ALARM_LINK_TIMERS_TAGTYPE = "Alarm_Link_timers";

    /**
     * Tells whether a {@link AlarmLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << Alarm_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0fe2503a-84ff-48d8-977f-782e1d9a937b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << Alarm_Link >> then instantiate a {@link AlarmLink} proxy.
     * 
     * @return a {@link AlarmLink} proxy on the created {@link Link}.
     */
    @objid ("24a0520e-f680-4636-acbb-62e5eccf5aba")
    public static AlarmLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AlarmLink.STEREOTYPE_NAME);
        return AlarmLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link AlarmLink} proxy from a {@link Link} stereotyped << Alarm_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link AlarmLink} proxy or <i>null</i>.
     */
    @objid ("52479aaa-8c01-4531-92b3-8b3057665692")
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
    @objid ("9a351dfd-1b8f-44f5-92c3-eee505c9233f")
    public static AlarmLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (AlarmLink.canInstantiate(obj))
        	return new AlarmLink(obj);
        else
        	throw new IllegalArgumentException("AlarmLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ab1c5f11-b5a2-4c1a-a635-3a31fe925078")
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
    @objid ("eb499a20-01d7-48f3-9d8d-9fbe91b7c666")
    public List<String> getAlarm_Link_timers() {
        return this.elt.getTagValues(AlarmLink.MdaTypes.ALARM_LINK_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("b5020b51-446d-480f-bbb0-70b8dfa4a63e")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("a374ec30-5a73-41c6-94ca-c4227651b34f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_Link_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2ae1acc0-3664-411a-982f-32d3a70de77b")
    public boolean isAlarm_Link_isWatchdog() {
        return this.elt.isTagged(AlarmLink.MdaTypes.ALARM_LINK_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_Link_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5372efa6-8b14-4d83-9c29-7c50e80fe442")
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
    @objid ("b86b77c0-e6bc-43f1-933f-c6203c3a8d2e")
    public void setAlarm_Link_timers(final List<String> values) {
        this.elt.putTagValues(AlarmLink.MdaTypes.ALARM_LINK_TIMERS_TAGTYPE_ELT, values);
    }

    @objid ("d47c3659-dc74-44f8-8d0c-cbc6e8030251")
    protected AlarmLink(final Link elt) {
        super(elt);
    }

    @objid ("6f81b5d9-b20d-4eef-9f58-9a4a0c81af7a")
    public static final class MdaTypes {
        @objid ("669662ba-0280-407c-86d6-8952c104a84d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("144887e8-bc37-4f81-8181-7a8d05226ba6")
        public static TagType ALARM_LINK_ISWATCHDOG_TAGTYPE_ELT;

        @objid ("feb75b4c-8f7e-47a0-b645-a552da7fce44")
        public static TagType ALARM_LINK_TIMERS_TAGTYPE_ELT;

        @objid ("3ca20a78-dba3-4c67-a8c0-e2f536638255")
        private static Stereotype MDAASSOCDEP;

        @objid ("79dc40f8-0269-4015-bde6-6394bcfb1094")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f86fb700-4c35-4d9d-a67f-06ac0881debd")
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
