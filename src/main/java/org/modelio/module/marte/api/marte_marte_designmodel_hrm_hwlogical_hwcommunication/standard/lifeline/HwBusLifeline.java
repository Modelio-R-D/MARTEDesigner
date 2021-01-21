/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("c14d5963-de2f-4cbd-b7f0-67920dc3645f")
public class HwBusLifeline extends HwMediaLifeline {
    @objid ("285f190a-3b33-43cb-8f4c-eedf071a57be")
    public static final String STEREOTYPE_NAME = "HwBus_Lifeline";

    @objid ("6eeb210a-abf1-4062-a187-f65ae8c5c8d4")
    public static final String HWBUS_LIFELINE_ADRESSWIDTH_TAGTYPE = "HwBus_Lifeline_adressWidth";

    @objid ("0975df3b-c00c-4970-a6d9-541c1baf7f70")
    public static final String HWBUS_LIFELINE_ISSERIAL_TAGTYPE = "HwBus_Lifeline_isSerial";

    @objid ("b166748b-30d0-4eeb-833a-9dc4743c801f")
    public static final String HWBUS_LIFELINE_ISSYNCHRONOUS_TAGTYPE = "HwBus_Lifeline_isSynchronous";

    @objid ("05377ea2-4501-4827-a7c7-2684bfc21b18")
    public static final String HWBUS_LIFELINE_WORDWIDTH_TAGTYPE = "HwBus_Lifeline_wordWidth";

    /**
     * Tells whether a {@link HwBusLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwBus_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("76353c3c-2ba2-4246-8330-8f8c9a63fd28")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBusLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwBus_Lifeline >> then instantiate a {@link HwBusLifeline} proxy.
     * 
     * @return a {@link HwBusLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("231bae2c-ec21-4765-a80a-19f50588c539")
    public static HwBusLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBusLifeline.STEREOTYPE_NAME);
        return HwBusLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwBusLifeline} proxy from a {@link Lifeline} stereotyped << HwBus_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwBusLifeline} proxy or <i>null</i>.
     */
    @objid ("c608204e-04c5-4891-b968-3dd89865b6ca")
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
    @objid ("c864b349-a6cc-4941-ad2c-1c90ebde1e80")
    public static HwBusLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwBusLifeline.canInstantiate(obj))
        	return new HwBusLifeline(obj);
        else
        	throw new IllegalArgumentException("HwBusLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8e454c46-cf25-4b04-b79e-473ebc6fb60b")
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
    @objid ("86a029fb-b895-416b-851d-3eb8baade238")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwBus_Lifeline_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("84467cf4-65c2-4fe1-b028-ceeb15625add")
    public String getHwBus_Lifeline_adressWidth() {
        return this.elt.getTagValue(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_ADRESSWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwBus_Lifeline_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6a40cd94-c2e4-47d8-b146-852a6c4c9239")
    public String getHwBus_Lifeline_wordWidth() {
        return this.elt.getTagValue(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_WORDWIDTH_TAGTYPE_ELT);
    }

    @objid ("85077d3b-e844-4306-a6b9-badbc57ec86d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwBus_Lifeline_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("92798b07-ad1b-41ee-b988-980812c65501")
    public boolean isHwBus_Lifeline_isSerial() {
        return this.elt.isTagged(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwBus_Lifeline_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c811d4a1-bbe8-43e1-ba08-46c9b5143306")
    public boolean isHwBus_Lifeline_isSynchronous() {
        return this.elt.isTagged(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Lifeline_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fc7b2535-7e25-4e6e-baa8-f2fdc8e2cfd9")
    public void setHwBus_Lifeline_adressWidth(final String value) {
        this.elt.putTagValue(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_ADRESSWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'HwBus_Lifeline_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b53d3249-7e03-42a0-8bcb-20bec934fb3c")
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
    @objid ("74dfcfd6-d3a8-428a-855e-8e44613c74c0")
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
    @objid ("1f8909bb-788f-4a20-bddc-770fa0430512")
    public void setHwBus_Lifeline_wordWidth(final String value) {
        this.elt.putTagValue(HwBusLifeline.MdaTypes.HWBUS_LIFELINE_WORDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("1727a8bc-6265-4e4b-b0ae-77d29553052b")
    protected HwBusLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("bcbe2728-8cf8-42fa-a45b-a1c14ee27f6c")
    public static final class MdaTypes {
        @objid ("e4772664-1928-4e08-a985-87eb11ff4111")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c8c88601-1f42-4957-948d-8c614c9810a7")
        public static TagType HWBUS_LIFELINE_ADRESSWIDTH_TAGTYPE_ELT;

        @objid ("feb50dc2-2d62-4828-8253-64dfa749055d")
        public static TagType HWBUS_LIFELINE_WORDWIDTH_TAGTYPE_ELT;

        @objid ("6daa81a4-6bbc-436f-978f-a4ed3c2aae60")
        public static TagType HWBUS_LIFELINE_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("53fea48c-008b-42f9-b112-77606e093a42")
        public static TagType HWBUS_LIFELINE_ISSERIAL_TAGTYPE_ELT;

        @objid ("1214b211-5e19-49e5-bdf0-9794550db464")
        private static Stereotype MDAASSOCDEP;

        @objid ("511461bc-4dee-4a63-86a9-349c557e8b9f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fde2ef80-e230-4ddf-bbfd-19b7394205b1")
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
