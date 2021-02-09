/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
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
 * Proxy class to handle a {@link Behavior} with << TimedProcessing_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimedProcessingBehavior {
    public static final String STEREOTYPE_NAME = "TimedProcessing_Behavior";

    public static final String TIMEDPROCESSING_BEHAVIOR_DURATION_TAGTYPE = "TimedProcessing_Behavior_duration";

    public static final String TIMEDPROCESSING_BEHAVIOR_FINISH_TAGTYPE = "TimedProcessing_Behavior_finish";

    public static final String TIMEDPROCESSING_BEHAVIOR_ON_TAGTYPE = "TimedProcessing_Behavior_on";

    public static final String TIMEDPROCESSING_BEHAVIOR_START_TAGTYPE = "TimedProcessing_Behavior_start";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    protected final Behavior elt;

    /**
     * Tells whether a {@link TimedProcessingBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << TimedProcessing_Behavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedProcessingBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << TimedProcessing_Behavior >> then instantiate a {@link TimedProcessingBehavior} proxy.
     * 
     * @return a {@link TimedProcessingBehavior} proxy on the created {@link Behavior}.
     */
    public static TimedProcessingBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedProcessingBehavior.STEREOTYPE_NAME);
        return TimedProcessingBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link TimedProcessingBehavior} proxy from a {@link Behavior} stereotyped << TimedProcessing_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link TimedProcessingBehavior} proxy or <i>null</i>.
     */
    public static TimedProcessingBehavior instantiate(final Behavior obj) {
        return TimedProcessingBehavior.canInstantiate(obj) ? new TimedProcessingBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimedProcessingBehavior} proxy from a {@link Behavior} stereotyped << TimedProcessing_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link TimedProcessingBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimedProcessingBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (TimedProcessingBehavior.canInstantiate(obj))
        	return new TimedProcessingBehavior(obj);
        else
        	throw new IllegalArgumentException("TimedProcessingBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        TimedProcessingBehavior other = (TimedProcessingBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    public Behavior getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'TimedProcessing_Behavior_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimedProcessing_Behavior_duration() {
        return this.elt.getTagValue(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_DURATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'TimedProcessing_Behavior_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimedProcessing_Behavior_finish() {
        return this.elt.getTagValue(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_FINISH_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedProcessing_Behavior_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getTimedProcessing_Behavior_on() {
        return this.elt.getTagValues(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_ON_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'TimedProcessing_Behavior_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimedProcessing_Behavior_start() {
        return this.elt.getTagValue(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_START_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedProcessing_Behavior_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedProcessing_Behavior_duration(final String value) {
        this.elt.putTagValue(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'TimedProcessing_Behavior_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedProcessing_Behavior_finish(final String value) {
        this.elt.putTagValue(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_FINISH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedProcessing_Behavior_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedProcessing_Behavior_on(final List<String> values) {
        this.elt.putTagValues(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_ON_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'TimedProcessing_Behavior_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedProcessing_Behavior_start(final String value) {
        this.elt.putTagValue(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_START_TAGTYPE_ELT, value);
    }

    protected TimedProcessingBehavior(final Behavior elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TIMEDPROCESSING_BEHAVIOR_DURATION_TAGTYPE_ELT;

        public static TagType TIMEDPROCESSING_BEHAVIOR_START_TAGTYPE_ELT;

        public static TagType TIMEDPROCESSING_BEHAVIOR_FINISH_TAGTYPE_ELT;

        public static TagType TIMEDPROCESSING_BEHAVIOR_ON_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b507b8f9-1259-11df-8f55-0014222a9f79");
            TIMEDPROCESSING_BEHAVIOR_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b507b8fa-1259-11df-8f55-0014222a9f79");
            TIMEDPROCESSING_BEHAVIOR_START_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b507b8fb-1259-11df-8f55-0014222a9f79");
            TIMEDPROCESSING_BEHAVIOR_FINISH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b507b8fc-1259-11df-8f55-0014222a9f79");
            TIMEDPROCESSING_BEHAVIOR_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bc77dba4-c7fd-11e0-9823-0027103f347c");
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
