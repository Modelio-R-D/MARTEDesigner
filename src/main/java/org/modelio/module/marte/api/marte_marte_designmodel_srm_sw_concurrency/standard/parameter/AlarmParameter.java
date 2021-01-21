/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter;

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
@objid ("9b5a80af-c40a-48b3-a178-8c628db3f69f")
public class AlarmParameter extends InterruptResourceParameter {
    @objid ("2bc6e918-c20a-43cb-b610-ffe9ad9c7349")
    public static final String STEREOTYPE_NAME = "Alarm_Parameter";

    @objid ("6e9be56d-e6a5-4728-96e4-92dbe392fe62")
    public static final String ALARM_PARAMETER_ISWATCHDOG_TAGTYPE = "Alarm_Parameter_isWatchdog";

    @objid ("b8bdecfc-c0c4-407e-89b3-54d4178af58a")
    public static final String ALARM_PARAMETER_TIMERS_TAGTYPE = "Alarm_Parameter_timers";

    /**
     * Tells whether a {@link AlarmParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << Alarm_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("00fc8511-3850-49ef-a8d0-dfe08953f004")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << Alarm_Parameter >> then instantiate a {@link AlarmParameter} proxy.
     * 
     * @return a {@link AlarmParameter} proxy on the created {@link Parameter}.
     */
    @objid ("a2782745-c0a4-4955-b32f-0915955c294a")
    public static AlarmParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AlarmParameter.STEREOTYPE_NAME);
        return AlarmParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link AlarmParameter} proxy from a {@link Parameter} stereotyped << Alarm_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link AlarmParameter} proxy or <i>null</i>.
     */
    @objid ("1a3fb513-d223-4eb2-a28b-e8605d1e89cd")
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
    @objid ("09af12ca-591e-44ef-9230-8459807e2f03")
    public static AlarmParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (AlarmParameter.canInstantiate(obj))
        	return new AlarmParameter(obj);
        else
        	throw new IllegalArgumentException("AlarmParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b2336ca2-4934-4f27-84ad-a473ec7b979e")
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
    @objid ("2bca7856-81b0-4c67-963b-cea97dcf3672")
    public List<String> getAlarm_Parameter_timers() {
        return this.elt.getTagValues(AlarmParameter.MdaTypes.ALARM_PARAMETER_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("9c5ee0e7-5216-4b08-9700-211451285f59")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("1b781399-5d08-4d2c-a20a-c9b03db54e8a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_Parameter_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("40f72e55-0cc0-44cc-80a8-acf5e03475b1")
    public boolean isAlarm_Parameter_isWatchdog() {
        return this.elt.isTagged(AlarmParameter.MdaTypes.ALARM_PARAMETER_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_Parameter_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2f2c940d-f93d-4653-80be-a3cc9ab27d90")
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
    @objid ("e5478b5c-c413-4e7d-9bed-5fe7646e6ab7")
    public void setAlarm_Parameter_timers(final List<String> values) {
        this.elt.putTagValues(AlarmParameter.MdaTypes.ALARM_PARAMETER_TIMERS_TAGTYPE_ELT, values);
    }

    @objid ("144f07d4-9612-460e-882c-cf877e6e8ae5")
    protected AlarmParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("8d226d0a-d6f6-4b76-8a6e-9f09a4d2d564")
    public static final class MdaTypes {
        @objid ("2ba70321-b81a-41be-bd33-ed3640d131cc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("39a90634-d84c-413f-ba84-e6d90adf28b0")
        public static TagType ALARM_PARAMETER_ISWATCHDOG_TAGTYPE_ELT;

        @objid ("b0e9d34c-26f9-46f6-a89c-a2fd24f8c8e1")
        public static TagType ALARM_PARAMETER_TIMERS_TAGTYPE_ELT;

        @objid ("d17d8472-911a-4477-a5ed-d0ef33da647b")
        private static Stereotype MDAASSOCDEP;

        @objid ("10b6b417-37d3-42c4-ab8d-b5319f94e9e1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2ee9c285-97c2-4b1e-bd93-4fdc34dfc69e")
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
