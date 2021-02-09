/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << Alarm_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class AlarmLifeline extends InterruptResourceLifeline {
    public static final String STEREOTYPE_NAME = "Alarm_Lifeline";

    public static final String ALARM_LIFELINE_ISWATCHDOG_TAGTYPE = "Alarm_Lifeline_isWatchdog";

    public static final String ALARM_LIFELINE_TIMERS_TAGTYPE = "Alarm_Lifeline_timers";

    /**
     * Tells whether a {@link AlarmLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << Alarm_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << Alarm_Lifeline >> then instantiate a {@link AlarmLifeline} proxy.
     * 
     * @return a {@link AlarmLifeline} proxy on the created {@link Lifeline}.
     */
    public static AlarmLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AlarmLifeline.STEREOTYPE_NAME);
        return AlarmLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link AlarmLifeline} proxy from a {@link Lifeline} stereotyped << Alarm_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link AlarmLifeline} proxy or <i>null</i>.
     */
    public static AlarmLifeline instantiate(final Lifeline obj) {
        return AlarmLifeline.canInstantiate(obj) ? new AlarmLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AlarmLifeline} proxy from a {@link Lifeline} stereotyped << Alarm_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link AlarmLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static AlarmLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (AlarmLifeline.canInstantiate(obj))
        	return new AlarmLifeline(obj);
        else
        	throw new IllegalArgumentException("AlarmLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        AlarmLifeline other = (AlarmLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Alarm_Lifeline_timers'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getAlarm_Lifeline_timers() {
        return this.elt.getTagValues(AlarmLifeline.MdaTypes.ALARM_LIFELINE_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_Lifeline_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isAlarm_Lifeline_isWatchdog() {
        return this.elt.isTagged(AlarmLifeline.MdaTypes.ALARM_LIFELINE_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_Lifeline_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAlarm_Lifeline_isWatchdog(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AlarmLifeline.MdaTypes.ALARM_LIFELINE_ISWATCHDOG_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AlarmLifeline.MdaTypes.ALARM_LIFELINE_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'Alarm_Lifeline_timers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAlarm_Lifeline_timers(final List<String> values) {
        this.elt.putTagValues(AlarmLifeline.MdaTypes.ALARM_LIFELINE_TIMERS_TAGTYPE_ELT, values);
    }

    protected AlarmLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType ALARM_LIFELINE_ISWATCHDOG_TAGTYPE_ELT;

        public static TagType ALARM_LIFELINE_TIMERS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0182f64a-10d1-11df-81d9-0014222a9f79");
            ALARM_LIFELINE_ISWATCHDOG_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0182f64b-10d1-11df-81d9-0014222a9f79");
            ALARM_LIFELINE_TIMERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0182f64c-10d1-11df-81d9-0014222a9f79");
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
