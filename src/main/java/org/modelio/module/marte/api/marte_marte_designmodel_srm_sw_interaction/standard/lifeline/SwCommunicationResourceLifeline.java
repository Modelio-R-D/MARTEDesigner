/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Lifeline} with << SwCommunicationResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4eaf77ad-c070-430f-9b7e-af0f3374485f")
public class SwCommunicationResourceLifeline extends SwInteractionResourceLifeline {
    @objid ("0361b07f-7fbe-4876-b186-0173912ad06b")
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Lifeline";

    @objid ("95cb998d-11cc-454e-85fd-c46b61169454")
    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT_TAGTYPE = "SwCommunicationResource_Lifeline_blockT";

    @objid ("3a104da0-040f-4129-8908-f263b65de648")
    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY_TAGTYPE = "SwCommunicationResource_Lifeline_capacity";

    @objid ("b4f19a6a-1bc9-4e6d-b60f-b6392de2fdcd")
    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Lifeline_elementSize";

    @objid ("05a6f37f-764d-4aac-bea8-da76a2a3373b")
    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Lifeline_mainScheduler";

    @objid ("39a77698-75f5-45c2-a275-65d3152b8dd3")
    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT_TAGTYPE = "SwCommunicationResource_Lifeline_packetT";

    @objid ("0d5235c4-1481-47cf-a16b-adc0e5e9821e")
    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Lifeline_speedFactor";

    @objid ("c8a5a79c-970c-4970-8c20-4143193829af")
    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Lifeline_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwCommunicationResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("14677d5e-85c0-4e67-a9da-c2900e6adcf1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwCommunicationResource_Lifeline >> then instantiate a {@link SwCommunicationResourceLifeline} proxy.
     * 
     * @return a {@link SwCommunicationResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("e9195736-492f-45bd-8000-1b2e454622fc")
    public static SwCommunicationResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceLifeline.STEREOTYPE_NAME);
        return SwCommunicationResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwCommunicationResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwCommunicationResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("52685e83-1827-43bc-9b0a-105b1d800687")
    public static SwCommunicationResourceLifeline instantiate(final Lifeline obj) {
        return SwCommunicationResourceLifeline.canInstantiate(obj) ? new SwCommunicationResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwCommunicationResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SwCommunicationResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5d3c977b-c8aa-4ddf-9a73-68e4fd791ec5")
    public static SwCommunicationResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwCommunicationResourceLifeline.canInstantiate(obj))
        	return new SwCommunicationResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("09198d4c-cc7f-4ed0-9308-9a4bccb1bae9")
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
        SwCommunicationResourceLifeline other = (SwCommunicationResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("52fb2506-41f5-49c0-ad55-88a19f00e672")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Lifeline_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1caf150f-a80e-4ec5-ac1a-316cf903ed8f")
    public List<String> getSwCommunicationResource_Lifeline_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Lifeline_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8e89cc6e-dc8c-411c-88e3-77fa1c46d002")
    public List<String> getSwCommunicationResource_Lifeline_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("637962e3-75d7-4b6a-a980-1d80b196c06b")
    public String getSwCommunicationResource_Lifeline_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Lifeline_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e643331-e913-4ece-9aa4-a45564113d0e")
    public String getSwCommunicationResource_Lifeline_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Lifeline_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a55ee74c-1e0c-4c91-80e5-b0125ac711e8")
    public List<String> getSwCommunicationResource_Lifeline_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Lifeline_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fc057f22-986e-47bd-b1af-b488c12ae46d")
    public String getSwCommunicationResource_Lifeline_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Lifeline_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a684583e-95f2-4141-a645-042d3e313ec9")
    public String getSwCommunicationResource_Lifeline_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE_TAGTYPE_ELT);
    }

    @objid ("01406875-39ae-4d53-b50d-214e78cf958f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Lifeline_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3534313a-3f63-4aef-9e3d-c0c4f9ef9389")
    public void setSwCommunicationResource_Lifeline_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a41fa031-bb59-4561-acd5-6ad44bac1f1b")
    public void setSwCommunicationResource_Lifeline_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c154d04-2daa-4bc4-960f-43ba6b5b252d")
    public void setSwCommunicationResource_Lifeline_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Lifeline_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("777f7730-09bd-44c4-9a5b-25aba16f6bc6")
    public void setSwCommunicationResource_Lifeline_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Lifeline_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("150271fd-8503-4939-af71-08b713300da4")
    public void setSwCommunicationResource_Lifeline_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Lifeline_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f10c1f70-b0b2-4d23-ab66-55d1949598b9")
    public void setSwCommunicationResource_Lifeline_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Lifeline_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d0bfc39b-f53a-4973-81d2-11d89d318ef8")
    public void setSwCommunicationResource_Lifeline_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("259651ab-bd35-4de1-99b1-f5dfa54e071e")
    protected SwCommunicationResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("ce55357f-9445-4b1b-aa44-9950b2684890")
    public static final class MdaTypes {
        @objid ("ef592358-bd37-4ecb-9256-b7d2a577e268")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("719b2bfd-e333-4036-85de-42f4733f8a81")
        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT_TAGTYPE_ELT;

        @objid ("e75e66a7-3861-4804-93a3-10afff9081b9")
        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT_TAGTYPE_ELT;

        @objid ("2ef3a462-3722-4b67-a2b0-53cce6858479")
        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT;

        @objid ("1e73eccb-f608-45da-bbd7-8cd1262ad088")
        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("e8156f6d-e564-48e6-81a4-41a5ddbfcc21")
        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("359a5bdf-c764-4fe5-921c-0c860dd14fda")
        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("c77efc54-9b74-496e-875f-4f8e73c9ae7a")
        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE_TAGTYPE_ELT;

        @objid ("41446a2a-0a95-4662-847d-df836ca83512")
        private static Stereotype MDAASSOCDEP;

        @objid ("5e8cd18a-6b98-4f8d-a889-40adfdf0525b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("acb632a0-15c8-4204-8ae0-ace5e478828f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "597b733e-10d8-11df-81d9-0014222a9f79");
            SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "88b626dd-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "88b626dc-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "88b5ffcd-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "88b5ffcc-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "88b5ffcb-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c9164c01-97f8-11e0-a4c3-0027103f347c");
            SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bfae321a-60ca-11e3-a828-0027103f347d");
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
