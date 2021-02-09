/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << TimerResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimerResourceParameter extends TimingResourceParameter {
    public static final String STEREOTYPE_NAME = "TimerResource_Parameter";

    public static final String TIMERRESOURCE_PARAMETER_DURATION_TAGTYPE = "TimerResource_Parameter_duration";

    public static final String TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE = "TimerResource_Parameter_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << TimerResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << TimerResource_Parameter >> then instantiate a {@link TimerResourceParameter} proxy.
     * 
     * @return a {@link TimerResourceParameter} proxy on the created {@link Parameter}.
     */
    public static TimerResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceParameter.STEREOTYPE_NAME);
        return TimerResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceParameter} proxy from a {@link Parameter} stereotyped << TimerResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link TimerResourceParameter} proxy or <i>null</i>.
     */
    public static TimerResourceParameter instantiate(final Parameter obj) {
        return TimerResourceParameter.canInstantiate(obj) ? new TimerResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerResourceParameter} proxy from a {@link Parameter} stereotyped << TimerResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link TimerResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimerResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (TimerResourceParameter.canInstantiate(obj))
        	return new TimerResourceParameter(obj);
        else
        	throw new IllegalArgumentException("TimerResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        TimerResourceParameter other = (TimerResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_Parameter_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimerResource_Parameter_duration() {
        return this.elt.getTagValue(TimerResourceParameter.MdaTypes.TIMERRESOURCE_PARAMETER_DURATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Parameter_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isTimerResource_Parameter_isPeriodic() {
        return this.elt.isTagged(TimerResourceParameter.MdaTypes.TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Parameter_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_Parameter_duration(final String value) {
        this.elt.putTagValue(TimerResourceParameter.MdaTypes.TIMERRESOURCE_PARAMETER_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Parameter_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimerResource_Parameter_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceParameter.MdaTypes.TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceParameter.MdaTypes.TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE_ELT);
    }

    protected TimerResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TIMERRESOURCE_PARAMETER_DURATION_TAGTYPE_ELT;

        public static TagType TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00a1abca-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_PARAMETER_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abd1-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_PARAMETER_ISPERIODIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abd8-0ccf-11df-8525-001302895b2b");
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
