/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << TimerResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimerResourceLifeline extends TimingResourceLifeline {
    public static final String STEREOTYPE_NAME = "TimerResource_Lifeline";

    public static final String TIMERRESOURCE_LIFELINE_DURATION_TAGTYPE = "TimerResource_Lifeline_duration";

    public static final String TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE = "TimerResource_Lifeline_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << TimerResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << TimerResource_Lifeline >> then instantiate a {@link TimerResourceLifeline} proxy.
     * 
     * @return a {@link TimerResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static TimerResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceLifeline.STEREOTYPE_NAME);
        return TimerResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceLifeline} proxy from a {@link Lifeline} stereotyped << TimerResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link TimerResourceLifeline} proxy or <i>null</i>.
     */
    public static TimerResourceLifeline instantiate(final Lifeline obj) {
        return TimerResourceLifeline.canInstantiate(obj) ? new TimerResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerResourceLifeline} proxy from a {@link Lifeline} stereotyped << TimerResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link TimerResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimerResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (TimerResourceLifeline.canInstantiate(obj))
        	return new TimerResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("TimerResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        TimerResourceLifeline other = (TimerResourceLifeline) obj;
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
     * Getter for string property 'TimerResource_Lifeline_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimerResource_Lifeline_duration() {
        return this.elt.getTagValue(TimerResourceLifeline.MdaTypes.TIMERRESOURCE_LIFELINE_DURATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Lifeline_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isTimerResource_Lifeline_isPeriodic() {
        return this.elt.isTagged(TimerResourceLifeline.MdaTypes.TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Lifeline_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_Lifeline_duration(final String value) {
        this.elt.putTagValue(TimerResourceLifeline.MdaTypes.TIMERRESOURCE_LIFELINE_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Lifeline_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_Lifeline_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceLifeline.MdaTypes.TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceLifeline.MdaTypes.TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE_ELT);
    }

    protected TimerResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TIMERRESOURCE_LIFELINE_DURATION_TAGTYPE_ELT;

        public static TagType TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "54f186c5-0f4c-11df-8c52-0014222a9f79");
            TIMERRESOURCE_LIFELINE_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "81888b54-14c6-11df-92f7-001302895b2b");
            TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "87643c4a-14c6-11df-92f7-001302895b2b");
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
