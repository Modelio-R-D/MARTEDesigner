/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << Alarm_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class AlarmAttribute extends InterruptResourceAttribute {
    public static final String STEREOTYPE_NAME = "Alarm_Attribute";

    public static final String ALARM_ATTRIBUTE_ISWATCHDOG_TAGTYPE = "Alarm_Attribute_isWatchdog";

    public static final String ALARM_ATTRIBUTE_TIMERS_TAGTYPE = "Alarm_Attribute_timers";

    /**
     * Tells whether a {@link AlarmAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Alarm_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Alarm_Attribute >> then instantiate a {@link AlarmAttribute} proxy.
     * 
     * @return a {@link AlarmAttribute} proxy on the created {@link Attribute}.
     */
    public static AlarmAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AlarmAttribute.STEREOTYPE_NAME);
        return AlarmAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link AlarmAttribute} proxy from a {@link Attribute} stereotyped << Alarm_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link AlarmAttribute} proxy or <i>null</i>.
     */
    public static AlarmAttribute instantiate(final Attribute obj) {
        return AlarmAttribute.canInstantiate(obj) ? new AlarmAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AlarmAttribute} proxy from a {@link Attribute} stereotyped << Alarm_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link AlarmAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static AlarmAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (AlarmAttribute.canInstantiate(obj))
        	return new AlarmAttribute(obj);
        else
        	throw new IllegalArgumentException("AlarmAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        AlarmAttribute other = (AlarmAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Alarm_Attribute_timers'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getAlarm_Attribute_timers() {
        return this.elt.getTagValues(AlarmAttribute.MdaTypes.ALARM_ATTRIBUTE_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_Attribute_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isAlarm_Attribute_isWatchdog() {
        return this.elt.isTagged(AlarmAttribute.MdaTypes.ALARM_ATTRIBUTE_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_Attribute_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAlarm_Attribute_isWatchdog(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AlarmAttribute.MdaTypes.ALARM_ATTRIBUTE_ISWATCHDOG_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AlarmAttribute.MdaTypes.ALARM_ATTRIBUTE_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'Alarm_Attribute_timers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAlarm_Attribute_timers(final List<String> values) {
        this.elt.putTagValues(AlarmAttribute.MdaTypes.ALARM_ATTRIBUTE_TIMERS_TAGTYPE_ELT, values);
    }

    protected AlarmAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType ALARM_ATTRIBUTE_ISWATCHDOG_TAGTYPE_ELT;

        public static TagType ALARM_ATTRIBUTE_TIMERS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01f43542-0ccf-11df-8525-001302895b2b");
            ALARM_ATTRIBUTE_ISWATCHDOG_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01f43549-0ccf-11df-8525-001302895b2b");
            ALARM_ATTRIBUTE_TIMERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01f43550-0ccf-11df-8525-001302895b2b");
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
