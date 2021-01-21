/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwTimer_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f17ec958-4385-4e89-b043-4b742307a946")
public class HwTimerInstance extends HwTimingResourceInstance {
    @objid ("64c24e73-85a4-439c-b96a-fc910547c665")
    public static final String STEREOTYPE_NAME = "HwTimer_Instance";

    @objid ("fe3eb634-ccc0-43f3-941e-b0a3bbc102ad")
    public static final String HWTIMER_INSTANCE_COUNTERWIDTH_TAGTYPE = "HwTimer_Instance_counterWidth";

    @objid ("baf5a17e-4cce-47fc-87c1-f8e643662c23")
    public static final String HWTIMER_INSTANCE_INPUTCLOCK_TAGTYPE = "HwTimer_Instance_inputClock";

    @objid ("9c225967-7d3a-465e-a6f7-f7168c31f924")
    public static final String HWTIMER_INSTANCE_NBCOUNTERS_TAGTYPE = "HwTimer_Instance_nbCounters";

    /**
     * Tells whether a {@link HwTimerInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwTimer_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bf6f28ad-4d87-4c6c-9493-e8f28774807b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwTimer_Instance >> then instantiate a {@link HwTimerInstance} proxy.
     * 
     * @return a {@link HwTimerInstance} proxy on the created {@link Instance}.
     */
    @objid ("a98cb037-060f-4dd8-97d9-df5c1fd0da98")
    public static HwTimerInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerInstance.STEREOTYPE_NAME);
        return HwTimerInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwTimerInstance} proxy from a {@link Instance} stereotyped << HwTimer_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwTimerInstance} proxy or <i>null</i>.
     */
    @objid ("3c7067cd-3748-4526-94f5-479a01affce5")
    public static HwTimerInstance instantiate(final Instance obj) {
        return HwTimerInstance.canInstantiate(obj) ? new HwTimerInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimerInstance} proxy from a {@link Instance} stereotyped << HwTimer_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwTimerInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0e4c22d7-e62c-4178-82e2-d6952ef7faa8")
    public static HwTimerInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwTimerInstance.canInstantiate(obj))
        	return new HwTimerInstance(obj);
        else
        	throw new IllegalArgumentException("HwTimerInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0b05e5db-a277-477e-8738-581f788db93d")
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
        HwTimerInstance other = (HwTimerInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("631ed506-f16d-48ac-91c9-7ec3b5aabd29")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwTimer_Instance_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a6303068-7305-451b-a3a7-05a18713f3e5")
    public String getHwTimer_Instance_counterWidth() {
        return this.elt.getTagValue(HwTimerInstance.MdaTypes.HWTIMER_INSTANCE_COUNTERWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Instance_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0ff778d-0b00-41fb-9687-4fbbd764c8d0")
    public String getHwTimer_Instance_inputClock() {
        return this.elt.getTagValue(HwTimerInstance.MdaTypes.HWTIMER_INSTANCE_INPUTCLOCK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Instance_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c61d6bca-f0e6-40ef-898b-b347ffca95b6")
    public String getHwTimer_Instance_nbCounters() {
        return this.elt.getTagValue(HwTimerInstance.MdaTypes.HWTIMER_INSTANCE_NBCOUNTERS_TAGTYPE_ELT);
    }

    @objid ("41eee81a-bc74-4467-8264-86c0da11bab0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimer_Instance_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9266d12b-99ea-45da-b745-86740581ac19")
    public void setHwTimer_Instance_counterWidth(final String value) {
        this.elt.putTagValue(HwTimerInstance.MdaTypes.HWTIMER_INSTANCE_COUNTERWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Instance_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8e1cb45a-51b9-439f-82e6-dc538755ea3c")
    public void setHwTimer_Instance_inputClock(final String value) {
        this.elt.putTagValue(HwTimerInstance.MdaTypes.HWTIMER_INSTANCE_INPUTCLOCK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Instance_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a86832d8-9850-4c95-8c8f-6471f70d60f9")
    public void setHwTimer_Instance_nbCounters(final String value) {
        this.elt.putTagValue(HwTimerInstance.MdaTypes.HWTIMER_INSTANCE_NBCOUNTERS_TAGTYPE_ELT, value);
    }

    @objid ("a6565029-1667-400a-8f06-b6f6416b2fc8")
    protected HwTimerInstance(final Instance elt) {
        super(elt);
    }

    @objid ("e4d7efbb-0045-4990-aa04-4b409850b328")
    public static final class MdaTypes {
        @objid ("b94d56a4-9fcd-40ea-8560-8c961c18e96d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("924b2504-d571-454e-acc2-fc23ffd8a84a")
        public static TagType HWTIMER_INSTANCE_NBCOUNTERS_TAGTYPE_ELT;

        @objid ("9fbf974d-acf1-46bb-ad2e-c842be58591d")
        public static TagType HWTIMER_INSTANCE_COUNTERWIDTH_TAGTYPE_ELT;

        @objid ("8156d287-bbe6-44fb-aaee-55d46f6b4791")
        public static TagType HWTIMER_INSTANCE_INPUTCLOCK_TAGTYPE_ELT;

        @objid ("98cb2889-4b47-431e-9c8f-0677b4d9f7e5")
        private static Stereotype MDAASSOCDEP;

        @objid ("9f1191fc-f527-4585-8848-a53be741c88d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("34d7a161-cf7c-4c34-9321-01742d7ae523")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "012e54ac-0ccf-11df-8525-001302895b2b");
            HWTIMER_INSTANCE_NBCOUNTERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54b3-0ccf-11df-8525-001302895b2b");
            HWTIMER_INSTANCE_COUNTERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54ba-0ccf-11df-8525-001302895b2b");
            HWTIMER_INSTANCE_INPUTCLOCK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54c1-0ccf-11df-8525-001302895b2b");
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
