/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Parameter} with << HwTimer_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("62ee1c97-a4ca-4da0-b794-b8b4899497d4")
public class HwTimerParameter extends HwTimingResourceParameter {
    @objid ("b224aef7-2149-4095-bff3-c02965d11907")
    public static final String STEREOTYPE_NAME = "HwTimer_Parameter";

    @objid ("69db881b-bbd1-4f9c-9fbc-a00ab8211025")
    public static final String HWTIMER_PARAMETER_COUNTERWIDTH_TAGTYPE = "HwTimer_Parameter_counterWidth";

    @objid ("c14f41d5-7308-4041-9d53-8a2edb5a6806")
    public static final String HWTIMER_PARAMETER_INPUTCLOCK_TAGTYPE = "HwTimer_Parameter_inputClock";

    @objid ("2d670eeb-ef6a-4743-873a-ce54c90841ad")
    public static final String HWTIMER_PARAMETER_NBCOUNTERS_TAGTYPE = "HwTimer_Parameter_nbCounters";

    /**
     * Tells whether a {@link HwTimerParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwTimer_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ea48cb9d-cc1d-453a-9532-d46fc076ae56")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwTimer_Parameter >> then instantiate a {@link HwTimerParameter} proxy.
     * 
     * @return a {@link HwTimerParameter} proxy on the created {@link Parameter}.
     */
    @objid ("78b0d46d-4e5d-49bf-8a5c-09ccad66fe63")
    public static HwTimerParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerParameter.STEREOTYPE_NAME);
        return HwTimerParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwTimerParameter} proxy from a {@link Parameter} stereotyped << HwTimer_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwTimerParameter} proxy or <i>null</i>.
     */
    @objid ("be41ceb9-971a-42d1-9b90-2602b530b419")
    public static HwTimerParameter instantiate(final Parameter obj) {
        return HwTimerParameter.canInstantiate(obj) ? new HwTimerParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimerParameter} proxy from a {@link Parameter} stereotyped << HwTimer_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwTimerParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("60656ee3-c6b4-4551-a5b6-6c60d2ffab9c")
    public static HwTimerParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwTimerParameter.canInstantiate(obj))
        	return new HwTimerParameter(obj);
        else
        	throw new IllegalArgumentException("HwTimerParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9fb2280f-0705-48d6-8a36-2e0fd81d00f8")
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
        HwTimerParameter other = (HwTimerParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("4746da67-9d80-42fe-902e-08c3976d1518")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwTimer_Parameter_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fd10266c-36a1-48da-aa59-c5e7e2e40aea")
    public String getHwTimer_Parameter_counterWidth() {
        return this.elt.getTagValue(HwTimerParameter.MdaTypes.HWTIMER_PARAMETER_COUNTERWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Parameter_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da301038-eb7a-4329-ad07-dae85b46a372")
    public String getHwTimer_Parameter_inputClock() {
        return this.elt.getTagValue(HwTimerParameter.MdaTypes.HWTIMER_PARAMETER_INPUTCLOCK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Parameter_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5060afba-150c-4675-ad61-12481bc2edbd")
    public String getHwTimer_Parameter_nbCounters() {
        return this.elt.getTagValue(HwTimerParameter.MdaTypes.HWTIMER_PARAMETER_NBCOUNTERS_TAGTYPE_ELT);
    }

    @objid ("0fd22881-d6d5-4a42-a45a-30a1762b1a46")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimer_Parameter_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d0b04642-311d-4c16-8a67-c1a7694fae52")
    public void setHwTimer_Parameter_counterWidth(final String value) {
        this.elt.putTagValue(HwTimerParameter.MdaTypes.HWTIMER_PARAMETER_COUNTERWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Parameter_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ddfbbd93-04cd-4692-90ab-fc66e8615050")
    public void setHwTimer_Parameter_inputClock(final String value) {
        this.elt.putTagValue(HwTimerParameter.MdaTypes.HWTIMER_PARAMETER_INPUTCLOCK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Parameter_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b88c98fa-e47b-4d7b-b137-f2a1b8367fa4")
    public void setHwTimer_Parameter_nbCounters(final String value) {
        this.elt.putTagValue(HwTimerParameter.MdaTypes.HWTIMER_PARAMETER_NBCOUNTERS_TAGTYPE_ELT, value);
    }

    @objid ("4299fd8e-eb37-4022-b592-b3053ec78c7b")
    protected HwTimerParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("797c5a18-89b7-4a71-ac18-cf6ca387a45b")
    public static final class MdaTypes {
        @objid ("a00657f4-9b6a-43c1-bc79-25a886477e9c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("419618d8-da7e-4c5d-a339-7171cfe5f1d9")
        public static TagType HWTIMER_PARAMETER_NBCOUNTERS_TAGTYPE_ELT;

        @objid ("3c7846dc-1386-4a70-83e2-5d8bb71a2767")
        public static TagType HWTIMER_PARAMETER_COUNTERWIDTH_TAGTYPE_ELT;

        @objid ("839881ac-2a16-4d86-a6d0-55b72198e2d5")
        public static TagType HWTIMER_PARAMETER_INPUTCLOCK_TAGTYPE_ELT;

        @objid ("545fcc62-7a10-4dd9-b73b-0cca7af6e350")
        private static Stereotype MDAASSOCDEP;

        @objid ("98729ce4-a227-4e3f-ad55-d296303269c2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("42cbe63c-5403-416f-836a-3386269ee14f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01299006-0ccf-11df-8525-001302895b2b");
            HWTIMER_PARAMETER_NBCOUNTERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54ad-0ccf-11df-8525-001302895b2b");
            HWTIMER_PARAMETER_COUNTERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54b4-0ccf-11df-8525-001302895b2b");
            HWTIMER_PARAMETER_INPUTCLOCK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54bb-0ccf-11df-8525-001302895b2b");
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
