/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("e151d6a6-9848-44ee-a41a-a62f229d3621")
    public static final String STEREOTYPE_NAME = "HwTimer_Parameter";

    @objid ("e4649a26-d998-4696-9248-9a3190035e2a")
    public static final String HWTIMER_PARAMETER_COUNTERWIDTH_TAGTYPE = "HwTimer_Parameter_counterWidth";

    @objid ("2adec1c2-4fc4-4e1c-a9e7-12311da4cc5f")
    public static final String HWTIMER_PARAMETER_INPUTCLOCK_TAGTYPE = "HwTimer_Parameter_inputClock";

    @objid ("67356bb6-366d-46f2-9193-9b79a9373b0b")
    public static final String HWTIMER_PARAMETER_NBCOUNTERS_TAGTYPE = "HwTimer_Parameter_nbCounters";

    /**
     * Tells whether a {@link HwTimerParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwTimer_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3e52531e-3eb0-4486-a23b-27c6526a91e9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwTimer_Parameter >> then instantiate a {@link HwTimerParameter} proxy.
     * 
     * @return a {@link HwTimerParameter} proxy on the created {@link Parameter}.
     */
    @objid ("cb08cf23-9114-4a57-8566-aa5d7d9bc963")
    public static HwTimerParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerParameter.STEREOTYPE_NAME);
        return HwTimerParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwTimerParameter} proxy from a {@link Parameter} stereotyped << HwTimer_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwTimerParameter} proxy or <i>null</i>.
     */
    @objid ("fc04f54c-c7b5-48fe-a0b4-8536eb40aa0d")
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
    @objid ("19556dc2-b818-4664-b16b-84ca5b4392bf")
    public static HwTimerParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwTimerParameter.canInstantiate(obj))
        	return new HwTimerParameter(obj);
        else
        	throw new IllegalArgumentException("HwTimerParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0160361d-dc42-4fcb-916d-6b0cfd124fa3")
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
    @objid ("4cbce786-9ab3-4f1b-98b2-71d70a16aa8b")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwTimer_Parameter_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b05d4b24-c180-445b-8cd6-0f3b97d2c997")
    public String getHwTimer_Parameter_counterWidth() {
        return this.elt.getTagValue(HwTimerParameter.MdaTypes.HWTIMER_PARAMETER_COUNTERWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Parameter_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e23cd5bb-7528-4606-8464-28b3f9126d9e")
    public String getHwTimer_Parameter_inputClock() {
        return this.elt.getTagValue(HwTimerParameter.MdaTypes.HWTIMER_PARAMETER_INPUTCLOCK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Parameter_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a1486c0-65fe-42d3-9595-97c137bf9c46")
    public String getHwTimer_Parameter_nbCounters() {
        return this.elt.getTagValue(HwTimerParameter.MdaTypes.HWTIMER_PARAMETER_NBCOUNTERS_TAGTYPE_ELT);
    }

    @objid ("3fdfd359-0e58-4284-8fbb-3a353addc0c8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimer_Parameter_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3edc520c-f6e9-40d9-b072-b6c197df8eb8")
    public void setHwTimer_Parameter_counterWidth(final String value) {
        this.elt.putTagValue(HwTimerParameter.MdaTypes.HWTIMER_PARAMETER_COUNTERWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Parameter_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e185d5b5-79ca-4f4e-8d44-61b8db8a8cb5")
    public void setHwTimer_Parameter_inputClock(final String value) {
        this.elt.putTagValue(HwTimerParameter.MdaTypes.HWTIMER_PARAMETER_INPUTCLOCK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Parameter_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a2a2aae-8b77-466d-9d0f-35e445255e42")
    public void setHwTimer_Parameter_nbCounters(final String value) {
        this.elt.putTagValue(HwTimerParameter.MdaTypes.HWTIMER_PARAMETER_NBCOUNTERS_TAGTYPE_ELT, value);
    }

    @objid ("537bbcaf-67f0-4c2f-b90e-ccfbd5463b7f")
    protected HwTimerParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("797c5a18-89b7-4a71-ac18-cf6ca387a45b")
    public static final class MdaTypes {
        @objid ("d7524faf-f158-4530-948d-76ac2fac294e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("96a1cbea-290c-4240-80ae-a8524eb9b65a")
        public static TagType HWTIMER_PARAMETER_NBCOUNTERS_TAGTYPE_ELT;

        @objid ("100d8db8-7af9-4937-adbb-e792ac3cfb72")
        public static TagType HWTIMER_PARAMETER_COUNTERWIDTH_TAGTYPE_ELT;

        @objid ("355136a6-dc6d-4259-94ed-6a8df76c4922")
        public static TagType HWTIMER_PARAMETER_INPUTCLOCK_TAGTYPE_ELT;

        @objid ("189331d2-795a-487d-9bfa-2bbf82380a3a")
        private static Stereotype MDAASSOCDEP;

        @objid ("10b4079c-c837-4e96-87e9-eb7e387e6c32")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b523a60b-a558-4000-a793-7150a8a423f2")
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
