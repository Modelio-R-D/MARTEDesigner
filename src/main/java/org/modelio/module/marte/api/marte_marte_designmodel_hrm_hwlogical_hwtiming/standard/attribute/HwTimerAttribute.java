/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("add375a1-71f3-42ec-99ee-2e8cd1a341b4")
    public static final String STEREOTYPE_NAME = "HwTimer_Attribute";

    @objid ("8a1f383e-d078-4483-a25c-0241884184ef")
    public static final String HWTIMER_ATTRIBUTE_COUNTERWIDTH_TAGTYPE = "HwTimer_Attribute_counterWidth";

    @objid ("cdeb9ec9-e94e-43f2-9385-a94d940f8dce")
    public static final String HWTIMER_ATTRIBUTE_INPUTCLOCK_TAGTYPE = "HwTimer_Attribute_inputClock";

    @objid ("4b1a1fb2-c886-46ae-a7b4-da140cdd5fa6")
    public static final String HWTIMER_ATTRIBUTE_NBCOUNTERS_TAGTYPE = "HwTimer_Attribute_nbCounters";

    /**
     * Tells whether a {@link HwTimerAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwTimer_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("dce30a3c-0cfb-4cdc-9f05-5202e8026820")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwTimer_Attribute >> then instantiate a {@link HwTimerAttribute} proxy.
     * 
     * @return a {@link HwTimerAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("568cab36-e2a9-4801-b196-96616e37acd6")
    public static HwTimerAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerAttribute.STEREOTYPE_NAME);
        return HwTimerAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwTimerAttribute} proxy from a {@link Attribute} stereotyped << HwTimer_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwTimerAttribute} proxy or <i>null</i>.
     */
    @objid ("cbed6915-881d-4953-9aaf-f8821b5e6505")
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
    @objid ("51cae975-a7a5-4ea0-8c5f-d9be5deec2c4")
    public static HwTimerAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwTimerAttribute.canInstantiate(obj))
        	return new HwTimerAttribute(obj);
        else
        	throw new IllegalArgumentException("HwTimerAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ebc0ba53-50a0-4405-b230-ed49f16b41df")
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
    @objid ("79ea9928-e494-4621-980f-e2dc46d5109d")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwTimer_Attribute_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("33c2c445-d461-493b-9f19-47703d614232")
    public String getHwTimer_Attribute_counterWidth() {
        return this.elt.getTagValue(HwTimerAttribute.MdaTypes.HWTIMER_ATTRIBUTE_COUNTERWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Attribute_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f14af4db-b19d-40c4-9010-98444f33a985")
    public String getHwTimer_Attribute_inputClock() {
        return this.elt.getTagValue(HwTimerAttribute.MdaTypes.HWTIMER_ATTRIBUTE_INPUTCLOCK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Attribute_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("08f0eaeb-32ec-401f-a39f-48885ddc10ca")
    public String getHwTimer_Attribute_nbCounters() {
        return this.elt.getTagValue(HwTimerAttribute.MdaTypes.HWTIMER_ATTRIBUTE_NBCOUNTERS_TAGTYPE_ELT);
    }

    @objid ("7a5c806a-3587-4b05-9bc6-1f38cfaf40eb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimer_Attribute_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b315735f-eb0a-4808-aa88-e9fe8a011b9f")
    public void setHwTimer_Attribute_counterWidth(final String value) {
        this.elt.putTagValue(HwTimerAttribute.MdaTypes.HWTIMER_ATTRIBUTE_COUNTERWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Attribute_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0976e53b-75c7-418d-b89c-03866c6f191c")
    public void setHwTimer_Attribute_inputClock(final String value) {
        this.elt.putTagValue(HwTimerAttribute.MdaTypes.HWTIMER_ATTRIBUTE_INPUTCLOCK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Attribute_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b509138-02ff-40c9-8e00-98637cfae575")
    public void setHwTimer_Attribute_nbCounters(final String value) {
        this.elt.putTagValue(HwTimerAttribute.MdaTypes.HWTIMER_ATTRIBUTE_NBCOUNTERS_TAGTYPE_ELT, value);
    }

    @objid ("ff1c3604-0126-42f6-a595-8c86fe7e35c6")
    protected HwTimerAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("c7ccf0ea-0e9f-4723-9e90-993833972d6b")
    public static final class MdaTypes {
        @objid ("b7bec0ce-3f86-4f19-becb-59022998d732")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3dd82fac-27a7-433f-bcf0-1e7dd60d41e8")
        public static TagType HWTIMER_ATTRIBUTE_NBCOUNTERS_TAGTYPE_ELT;

        @objid ("3176e0c3-cfd6-43ff-aba9-bee62e480bec")
        public static TagType HWTIMER_ATTRIBUTE_COUNTERWIDTH_TAGTYPE_ELT;

        @objid ("acf2de54-14db-440a-9e77-9554da0b0a09")
        public static TagType HWTIMER_ATTRIBUTE_INPUTCLOCK_TAGTYPE_ELT;

        @objid ("bd796c4b-798b-4db0-9f45-9356c4d2a95a")
        private static Stereotype MDAASSOCDEP;

        @objid ("73213c73-4969-4ae8-8447-fca59dd96a88")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6409f3e0-9ca9-4c52-972c-01f5517e60c9")
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
