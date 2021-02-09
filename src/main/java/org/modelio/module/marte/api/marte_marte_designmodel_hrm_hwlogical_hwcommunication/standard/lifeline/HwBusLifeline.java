/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << HwBus_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwBusLifeline extends HwMediaLifeline {
    public static final String STEREOTYPE_NAME = "HwBus_Lifeline";

    public static final String HWBUS_LIFELINE_ADRESSWIDTH_TAGTYPE = "HwBus_Lifeline_adressWidth";

    public static final String HWBUS_LIFELINE_ISSERIAL_TAGTYPE = "HwBus_Lifeline_isSerial";

    public static final String HWBUS_LIFELINE_ISSYNCHRONOUS_TAGTYPE = "HwBus_Lifeline_isSynchronous";

    public static final String HWBUS_LIFELINE_WORDWIDTH_TAGTYPE = "HwBus_Lifeline_wordWidth";

    /**
     * Tells whether a {@link HwBusLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwBus_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBusLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwBus_Lifeline >> then instantiate a {@link HwBusLifeline} proxy.
     * 
     * @return a {@link HwBusLifeline} proxy on the created {@link Lifeline}.
     */
    public static HwBusLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBusLifeline.STEREOTYPE_NAME);
        return HwBusLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwBusLifeline} proxy from a {@link Lifeline} stereotyped << HwBus_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwBusLifeline} proxy or <i>null</i>.
     */
    public static HwBusLifeline instantiate(final Lifeline obj) {
        return HwBusLifeline.canInstantiate(obj) ? new HwBusLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBusLifeline} proxy from a {@link Lifeline} stereotyped << HwBus_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwBusLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwBusLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwBusLifeline.canInstantiate(obj))
        	return new HwBusLifeline(obj);
        else
        	throw new IllegalArgumentException("HwBusLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwBusLifeline other = (HwBusLifeline) obj;
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
     * Getter for string property 'HwBus_Lifeline_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwBus_Lifeline_adressWidth() {
        return this.elt.getTagValue(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_ADRESSWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwBus_Lifeline_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwBus_Lifeline_wordWidth() {
        return this.elt.getTagValue(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_WORDWIDTH_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwBus_Lifeline_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwBus_Lifeline_isSerial() {
        return this.elt.isTagged(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwBus_Lifeline_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwBus_Lifeline_isSynchronous() {
        return this.elt.isTagged(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Lifeline_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBus_Lifeline_adressWidth(final String value) {
        this.elt.putTagValue(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_ADRESSWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'HwBus_Lifeline_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBus_Lifeline_isSerial(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_ISSERIAL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwBus_Lifeline_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBus_Lifeline_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Lifeline_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBus_Lifeline_wordWidth(final String value) {
        this.elt.putTagValue(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_WORDWIDTH_TAGTYPE_ELT, value);
    }

    protected HwBusLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWBUS_LIFELINE_ADRESSWIDTH_TAGTYPE_ELT;

        public static TagType HWBUS_LIFELINE_WORDWIDTH_TAGTYPE_ELT;

        public static TagType HWBUS_LIFELINE_ISSYNCHRONOUS_TAGTYPE_ELT;

        public static TagType HWBUS_LIFELINE_ISSERIAL_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8539edb1-10ac-11df-81d9-0014222a9f79");
            HWBUS_LIFELINE_ADRESSWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8539edb3-10ac-11df-81d9-0014222a9f79");
            HWBUS_LIFELINE_WORDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8539edb4-10ac-11df-81d9-0014222a9f79");
            HWBUS_LIFELINE_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a3c6e85d-1707-11df-b92a-0014222a9f79");
            HWBUS_LIFELINE_ISSERIAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a3c6e85e-1707-11df-b92a-0014222a9f79");
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
