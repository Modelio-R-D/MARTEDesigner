/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Lifeline} with << HwTimer_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwTimerLifeline extends HwTimingResourceLifeline {
    public static final String STEREOTYPE_NAME = "HwTimer_Lifeline";

    public static final String HWTIMER_LIFELINE_COUNTERWIDTH_TAGTYPE = "HwTimer_Lifeline_counterWidth";

    public static final String HWTIMER_LIFELINE_INPUTCLOCK_TAGTYPE = "HwTimer_Lifeline_inputClock";

    public static final String HWTIMER_LIFELINE_NBCOUNTERS_TAGTYPE = "HwTimer_Lifeline_nbCounters";

    /**
     * Tells whether a {@link HwTimerLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwTimer_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwTimer_Lifeline >> then instantiate a {@link HwTimerLifeline} proxy.
     * 
     * @return a {@link HwTimerLifeline} proxy on the created {@link Lifeline}.
     */
    public static HwTimerLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerLifeline.STEREOTYPE_NAME);
        return HwTimerLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwTimerLifeline} proxy from a {@link Lifeline} stereotyped << HwTimer_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwTimerLifeline} proxy or <i>null</i>.
     */
    public static HwTimerLifeline instantiate(final Lifeline obj) {
        return HwTimerLifeline.canInstantiate(obj) ? new HwTimerLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimerLifeline} proxy from a {@link Lifeline} stereotyped << HwTimer_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwTimerLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwTimerLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwTimerLifeline.canInstantiate(obj))
        	return new HwTimerLifeline(obj);
        else
        	throw new IllegalArgumentException("HwTimerLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwTimerLifeline other = (HwTimerLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwTimer_Lifeline_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwTimer_Lifeline_counterWidth() {
        return this.elt.getTagValue(HwTimerLifeline.MdaTypes.HWTIMER_LIFELINE_COUNTERWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Lifeline_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwTimer_Lifeline_inputClock() {
        return this.elt.getTagValue(HwTimerLifeline.MdaTypes.HWTIMER_LIFELINE_INPUTCLOCK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Lifeline_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwTimer_Lifeline_nbCounters() {
        return this.elt.getTagValue(HwTimerLifeline.MdaTypes.HWTIMER_LIFELINE_NBCOUNTERS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimer_Lifeline_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimer_Lifeline_counterWidth(final String value) {
        this.elt.putTagValue(HwTimerLifeline.MdaTypes.HWTIMER_LIFELINE_COUNTERWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Lifeline_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimer_Lifeline_inputClock(final String value) {
        this.elt.putTagValue(HwTimerLifeline.MdaTypes.HWTIMER_LIFELINE_INPUTCLOCK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Lifeline_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimer_Lifeline_nbCounters(final String value) {
        this.elt.putTagValue(HwTimerLifeline.MdaTypes.HWTIMER_LIFELINE_NBCOUNTERS_TAGTYPE_ELT, value);
    }

    protected HwTimerLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWTIMER_LIFELINE_NBCOUNTERS_TAGTYPE_ELT;

        public static TagType HWTIMER_LIFELINE_COUNTERWIDTH_TAGTYPE_ELT;

        public static TagType HWTIMER_LIFELINE_INPUTCLOCK_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4e81ab53-10af-11df-81d9-0014222a9f79");
            HWTIMER_LIFELINE_NBCOUNTERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e81ab55-10af-11df-81d9-0014222a9f79");
            HWTIMER_LIFELINE_COUNTERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e81ab54-10af-11df-81d9-0014222a9f79");
            HWTIMER_LIFELINE_INPUTCLOCK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e81ab56-10af-11df-81d9-0014222a9f79");
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
