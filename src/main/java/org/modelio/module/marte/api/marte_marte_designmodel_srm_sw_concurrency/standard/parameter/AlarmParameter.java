/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << Alarm_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class AlarmParameter extends InterruptResourceParameter {
    public static final String STEREOTYPE_NAME = "Alarm_Parameter";

    public static final String ALARM_PARAMETER_ISWATCHDOG_TAGTYPE = "Alarm_Parameter_isWatchdog";

    public static final String ALARM_PARAMETER_TIMERS_TAGTYPE = "Alarm_Parameter_timers";

    /**
     * Tells whether a {@link AlarmParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << Alarm_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << Alarm_Parameter >> then instantiate a {@link AlarmParameter} proxy.
     * 
     * @return a {@link AlarmParameter} proxy on the created {@link Parameter}.
     */
    public static AlarmParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AlarmParameter.STEREOTYPE_NAME);
        return AlarmParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link AlarmParameter} proxy from a {@link Parameter} stereotyped << Alarm_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link AlarmParameter} proxy or <i>null</i>.
     */
    public static AlarmParameter instantiate(final Parameter obj) {
        return AlarmParameter.canInstantiate(obj) ? new AlarmParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AlarmParameter} proxy from a {@link Parameter} stereotyped << Alarm_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link AlarmParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static AlarmParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (AlarmParameter.canInstantiate(obj))
        	return new AlarmParameter(obj);
        else
        	throw new IllegalArgumentException("AlarmParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        AlarmParameter other = (AlarmParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Alarm_Parameter_timers'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getAlarm_Parameter_timers() {
        return this.elt.getTagValues(AlarmParameter.MdaTypes.ALARM_PARAMETER_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_Parameter_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isAlarm_Parameter_isWatchdog() {
        return this.elt.isTagged(AlarmParameter.MdaTypes.ALARM_PARAMETER_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_Parameter_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAlarm_Parameter_isWatchdog(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AlarmParameter.MdaTypes.ALARM_PARAMETER_ISWATCHDOG_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AlarmParameter.MdaTypes.ALARM_PARAMETER_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'Alarm_Parameter_timers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAlarm_Parameter_timers(final List<String> values) {
        this.elt.putTagValues(AlarmParameter.MdaTypes.ALARM_PARAMETER_TIMERS_TAGTYPE_ELT, values);
    }

    protected AlarmParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType ALARM_PARAMETER_ISWATCHDOG_TAGTYPE_ELT;

        public static TagType ALARM_PARAMETER_TIMERS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01e849b1-0ccf-11df-8525-001302895b2b");
            ALARM_PARAMETER_ISWATCHDOG_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01f43546-0ccf-11df-8525-001302895b2b");
            ALARM_PARAMETER_TIMERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01f4354d-0ccf-11df-8525-001302895b2b");
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
