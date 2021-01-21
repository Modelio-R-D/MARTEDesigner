/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwTimer_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a280afcc-2a7f-480a-a8e8-814fb69e50e9")
public class HwTimerAttribute extends HwTimingResourceAttribute {
    @objid ("d49c8fc5-09fd-4f32-9948-f86d9b499ea7")
    public static final String STEREOTYPE_NAME = "HwTimer_Attribute";

    @objid ("9b847627-9ce0-4315-a87f-f42904f9c6c1")
    public static final String HWTIMER_ATTRIBUTE_COUNTERWIDTH_TAGTYPE = "HwTimer_Attribute_counterWidth";

    @objid ("a76d031a-83a8-488d-9d38-54308fe9d66a")
    public static final String HWTIMER_ATTRIBUTE_INPUTCLOCK_TAGTYPE = "HwTimer_Attribute_inputClock";

    @objid ("fb615492-1739-41c2-a1ab-cc4b75bf0bee")
    public static final String HWTIMER_ATTRIBUTE_NBCOUNTERS_TAGTYPE = "HwTimer_Attribute_nbCounters";

    /**
     * Tells whether a {@link HwTimerAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwTimer_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("287e4b73-776f-4226-807e-aa89b798782a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwTimer_Attribute >> then instantiate a {@link HwTimerAttribute} proxy.
     * 
     * @return a {@link HwTimerAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("a7bc2541-769a-4f60-8ad8-9144db674e7a")
    public static HwTimerAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerAttribute.STEREOTYPE_NAME);
        return HwTimerAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwTimerAttribute} proxy from a {@link Attribute} stereotyped << HwTimer_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwTimerAttribute} proxy or <i>null</i>.
     */
    @objid ("c5c7f6f4-8638-4158-9abe-b5d64f46737c")
    public static HwTimerAttribute instantiate(final Attribute obj) {
        return HwTimerAttribute.canInstantiate(obj) ? new HwTimerAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimerAttribute} proxy from a {@link Attribute} stereotyped << HwTimer_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwTimerAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2443c691-9af3-4179-b9be-65fec003d197")
    public static HwTimerAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwTimerAttribute.canInstantiate(obj))
        	return new HwTimerAttribute(obj);
        else
        	throw new IllegalArgumentException("HwTimerAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("728e8c54-0635-48e3-bc9b-daac36da4419")
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
        HwTimerAttribute other = (HwTimerAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("c4fc5fc3-6f64-40a2-9086-29e15e6c22bf")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwTimer_Attribute_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("75f7fdeb-e2cf-4ede-9b1b-084f8af5e821")
    public String getHwTimer_Attribute_counterWidth() {
        return this.elt.getTagValue(HwTimerAttribute.MdaTypes.HWTIMER_ATTRIBUTE_COUNTERWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Attribute_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("46a45926-2576-4a92-9bc2-9df287e257fb")
    public String getHwTimer_Attribute_inputClock() {
        return this.elt.getTagValue(HwTimerAttribute.MdaTypes.HWTIMER_ATTRIBUTE_INPUTCLOCK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Attribute_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da3dbba2-9c09-4cf1-86a1-6caf14db0e58")
    public String getHwTimer_Attribute_nbCounters() {
        return this.elt.getTagValue(HwTimerAttribute.MdaTypes.HWTIMER_ATTRIBUTE_NBCOUNTERS_TAGTYPE_ELT);
    }

    @objid ("50b81d46-0641-43b8-bbff-976f856c3b30")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimer_Attribute_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6ef3f339-3baa-406c-b48b-f2d5685a73c3")
    public void setHwTimer_Attribute_counterWidth(final String value) {
        this.elt.putTagValue(HwTimerAttribute.MdaTypes.HWTIMER_ATTRIBUTE_COUNTERWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Attribute_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("27ff0e3a-76ed-4342-91c9-c1656909532a")
    public void setHwTimer_Attribute_inputClock(final String value) {
        this.elt.putTagValue(HwTimerAttribute.MdaTypes.HWTIMER_ATTRIBUTE_INPUTCLOCK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Attribute_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("46bd8d07-b766-4efc-a64e-c57c7bf8e938")
    public void setHwTimer_Attribute_nbCounters(final String value) {
        this.elt.putTagValue(HwTimerAttribute.MdaTypes.HWTIMER_ATTRIBUTE_NBCOUNTERS_TAGTYPE_ELT, value);
    }

    @objid ("430c4ae6-933b-44eb-9163-fbdc4486ddd9")
    protected HwTimerAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("c7ccf0ea-0e9f-4723-9e90-993833972d6b")
    public static final class MdaTypes {
        @objid ("7de56673-4438-4d31-9402-2eefe6fcc649")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cde74a9c-f4b6-4e6d-b4a5-69bdd703e865")
        public static TagType HWTIMER_ATTRIBUTE_NBCOUNTERS_TAGTYPE_ELT;

        @objid ("8b8812af-9c8c-40a0-99fd-74aae444a42b")
        public static TagType HWTIMER_ATTRIBUTE_COUNTERWIDTH_TAGTYPE_ELT;

        @objid ("75dbfc30-f39c-4c0f-9ebc-f2ee64213590")
        public static TagType HWTIMER_ATTRIBUTE_INPUTCLOCK_TAGTYPE_ELT;

        @objid ("c38626a6-58f0-4f7a-a1fd-c8e3a80d9119")
        private static Stereotype MDAASSOCDEP;

        @objid ("f89423ff-2aa6-4ae3-8072-20cf1130f851")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("19715e01-c598-49de-b26e-780ac404eb00")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "012bf25a-0ccf-11df-8525-001302895b2b");
            HWTIMER_ATTRIBUTE_NBCOUNTERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54b0-0ccf-11df-8525-001302895b2b");
            HWTIMER_ATTRIBUTE_COUNTERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54b7-0ccf-11df-8525-001302895b2b");
            HWTIMER_ATTRIBUTE_INPUTCLOCK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "012e54be-0ccf-11df-8525-001302895b2b");
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
