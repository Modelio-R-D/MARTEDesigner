/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("940c55c5-abca-43d4-a531-c8e910bb8c78")
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Lifeline";

    @objid ("3b90532f-aeab-4012-a771-30f12991c99f")
    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT_TAGTYPE = "SwCommunicationResource_Lifeline_blockT";

    @objid ("057feb29-1165-4df6-8fa4-c0fa4a22ddfe")
    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY_TAGTYPE = "SwCommunicationResource_Lifeline_capacity";

    @objid ("0db7cfed-b360-4458-bce9-0fd91f5388d1")
    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Lifeline_elementSize";

    @objid ("591cb3ed-984c-4b20-bd4b-88e7afb563f8")
    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Lifeline_mainScheduler";

    @objid ("21a1d81b-8b44-4c17-9930-d577e7f710e8")
    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT_TAGTYPE = "SwCommunicationResource_Lifeline_packetT";

    @objid ("f4b7c29a-aa6b-40d5-ac85-e4a68591608e")
    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Lifeline_speedFactor";

    @objid ("6da5ca32-cfc7-43c4-89ba-1b8054f04706")
    public static final String SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Lifeline_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwCommunicationResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a816eb11-d85f-4729-ae64-d89238b9266f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwCommunicationResource_Lifeline >> then instantiate a {@link SwCommunicationResourceLifeline} proxy.
     * 
     * @return a {@link SwCommunicationResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("871af5da-38ea-4c4a-9298-b1015b0cae53")
    public static SwCommunicationResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceLifeline.STEREOTYPE_NAME);
        return SwCommunicationResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwCommunicationResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwCommunicationResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("6212875d-5fa6-4ce3-8e4f-19d310e7daaf")
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
    @objid ("9d4aff2d-2463-4a22-8f00-96404ee62a1b")
    public static SwCommunicationResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwCommunicationResourceLifeline.canInstantiate(obj))
        	return new SwCommunicationResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("322130af-fce5-4be5-bf8b-aee26be31a21")
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
    @objid ("269357f1-1aac-409a-a446-a82c13c4ae37")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Lifeline_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1f29f983-0c42-40c8-9bf4-72f1fcbb4db4")
    public List<String> getSwCommunicationResource_Lifeline_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Lifeline_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a836c77e-67f6-4486-afb4-2a69190b9ab4")
    public List<String> getSwCommunicationResource_Lifeline_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d10e34a4-28af-4076-8682-1550062d1eb7")
    public String getSwCommunicationResource_Lifeline_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Lifeline_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5fe686f4-d6b5-4c37-9988-fd9158e4b092")
    public String getSwCommunicationResource_Lifeline_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Lifeline_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("79acd309-1154-46d8-ae56-c33cecffb76b")
    public List<String> getSwCommunicationResource_Lifeline_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Lifeline_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0219c6bc-b799-4a4a-ae41-70b523381346")
    public String getSwCommunicationResource_Lifeline_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Lifeline_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("32f90eb6-9699-487a-9e05-d0a7bd7781f8")
    public String getSwCommunicationResource_Lifeline_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE_TAGTYPE_ELT);
    }

    @objid ("a600ecdd-d1bc-4722-861d-7d0f9a868f99")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Lifeline_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c49848ec-df2b-440d-a235-1f7575e0e596")
    public void setSwCommunicationResource_Lifeline_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Lifeline_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("28248884-dacf-494d-83e4-df70d505de22")
    public void setSwCommunicationResource_Lifeline_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Lifeline_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cfb37549-ffea-49fd-a9ef-d369c492a051")
    public void setSwCommunicationResource_Lifeline_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Lifeline_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24970f43-6501-4b28-adfe-2b20ebf3192e")
    public void setSwCommunicationResource_Lifeline_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Lifeline_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e3eb8b4c-0d8c-4e3a-b347-86d4fbeec540")
    public void setSwCommunicationResource_Lifeline_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Lifeline_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3864d13b-7f22-4186-9a76-fe2dca6ab443")
    public void setSwCommunicationResource_Lifeline_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Lifeline_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d938c14-8e56-4aeb-92a6-3f163005ad06")
    public void setSwCommunicationResource_Lifeline_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceLifeline.MdaTypes.SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("d89a4a2c-aab4-41b0-8a50-7d7559331aa6")
    protected SwCommunicationResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("ce55357f-9445-4b1b-aa44-9950b2684890")
    public static final class MdaTypes {
        @objid ("b7260ff0-bc14-4834-b084-6bcb2756cda1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("591fa6b1-099d-4e94-8c2f-c0888964fbc7")
        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_BLOCKT_TAGTYPE_ELT;

        @objid ("c073f200-1828-4279-8c19-f1bfe9859425")
        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_PACKETT_TAGTYPE_ELT;

        @objid ("48caa671-874b-4e7e-a5a3-b3bcb4c38d63")
        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_CAPACITY_TAGTYPE_ELT;

        @objid ("b8ca7edd-be8b-4e3b-8184-6a93f81d6288")
        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("6b6f4ce2-2503-4e36-a925-4e035355060f")
        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("f54871f2-6ffe-437e-bc33-204c5a7f4b1c")
        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("268cba69-5362-4e9c-8c3b-b31832613796")
        public static TagType SWCOMMUNICATIONRESOURCE_LIFELINE_TRANSMMODE_TAGTYPE_ELT;

        @objid ("75e09789-5d80-4e2d-90fa-fdc737651b20")
        private static Stereotype MDAASSOCDEP;

        @objid ("802e9f21-a3a7-4c0b-a336-633e5beff351")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2010df2e-9c12-437b-b3aa-5460d55d16d9")
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
