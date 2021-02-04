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
    @objid ("dd7e0c7b-3013-4857-a1a9-4e307ef5bea7")
    public static final String STEREOTYPE_NAME = "Alarm_Link";

    @objid ("dca5f577-d7ba-4212-9278-f06445b59680")
    public static final String ALARM_LINK_ISWATCHDOG_TAGTYPE = "Alarm_Link_isWatchdog";

    @objid ("5005b726-5d54-4e6f-904b-0c3ba2f66b09")
    public static final String ALARM_LINK_TIMERS_TAGTYPE = "Alarm_Link_timers";

    /**
     * Tells whether a {@link AlarmLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << Alarm_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b97b457e-a37d-4efb-9d8e-f6cd4e5575b6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << Alarm_Link >> then instantiate a {@link AlarmLink} proxy.
     * 
     * @return a {@link AlarmLink} proxy on the created {@link Link}.
     */
    @objid ("3b810944-58b5-4e77-8c03-cc9175ca4c3d")
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
    @objid ("b16fcb6c-38ca-44a6-bd21-44363331a37c")
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
    @objid ("ef16601c-453c-49d0-8e6e-353bbf9ceccc")
    public static AlarmLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (AlarmLink.canInstantiate(obj))
        	return new AlarmLink(obj);
        else
        	throw new IllegalArgumentException("AlarmLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("77e42677-ed10-420a-bde2-2f1624fe9faf")
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
    @objid ("ec16f77b-cafe-40ef-aa6d-fd0b3dceb21e")
    public List<String> getAlarm_Link_timers() {
        return this.elt.getTagValues(AlarmLink.MdaTypes.ALARM_LINK_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("92888b4a-2ab8-4bfb-a44e-8ceb21443927")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("0c498d67-fa6f-4876-9e79-74aead6c3eda")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_Link_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6049d11e-5fa3-40bd-826d-70c191fe9e35")
    public boolean isAlarm_Link_isWatchdog() {
        return this.elt.isTagged(AlarmLink.MdaTypes.ALARM_LINK_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_Link_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("af8c1cf3-49b8-4a18-b656-669972340fad")
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
    @objid ("906448ef-191d-4e11-b5a0-e32972a6d8e2")
    public void setAlarm_Link_timers(final List<String> values) {
        this.elt.putTagValues(AlarmLink.MdaTypes.ALARM_LINK_TIMERS_TAGTYPE_ELT, values);
    }

    @objid ("4c78f0ae-e6ac-42ab-ac7a-e9a3e9df0722")
    protected AlarmLink(final Link elt) {
        super(elt);
    }

    @objid ("6f81b5d9-b20d-4eef-9f58-9a4a0c81af7a")
    public static final class MdaTypes {
        @objid ("77766d28-49f5-4000-a22d-c159cb8281d2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("17746b1e-0363-4944-8919-43bd6bcbeb3f")
        public static TagType ALARM_LINK_ISWATCHDOG_TAGTYPE_ELT;

        @objid ("d7c31225-8fa3-4aaa-b740-269ebbe8645c")
        public static TagType ALARM_LINK_TIMERS_TAGTYPE_ELT;

        @objid ("8d5038f4-443f-4a98-8517-db99b34ab031")
        private static Stereotype MDAASSOCDEP;

        @objid ("e95c0c09-29c4-451d-b4dd-dedd7efb1b2c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b3deab1c-c474-4d24-8d38-b9d54be5751a")
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
