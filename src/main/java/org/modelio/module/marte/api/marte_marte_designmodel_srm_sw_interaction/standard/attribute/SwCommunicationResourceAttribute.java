/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
 * Proxy class to handle a {@link Attribute} with << SwCommunicationResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwCommunicationResourceAttribute extends SwInteractionResourceAttribute {
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Attribute";

    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT_TAGTYPE = "SwCommunicationResource_Attribute_blockT";

    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE = "SwCommunicationResource_Attribute_capacity";

    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Attribute_elementSize";

    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Attribute_mainScheduler";

    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT_TAGTYPE = "SwCommunicationResource_Attribute_packetT";

    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Attribute_speedFactor";

    public static final String SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Attribute_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwCommunicationResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwCommunicationResource_Attribute >> then instantiate a {@link SwCommunicationResourceAttribute} proxy.
     * 
     * @return a {@link SwCommunicationResourceAttribute} proxy on the created {@link Attribute}.
     */
    public static SwCommunicationResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceAttribute.STEREOTYPE_NAME);
        return SwCommunicationResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceAttribute} proxy from a {@link Attribute} stereotyped << SwCommunicationResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwCommunicationResourceAttribute} proxy or <i>null</i>.
     */
    public static SwCommunicationResourceAttribute instantiate(final Attribute obj) {
        return SwCommunicationResourceAttribute.canInstantiate(obj) ? new SwCommunicationResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceAttribute} proxy from a {@link Attribute} stereotyped << SwCommunicationResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SwCommunicationResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwCommunicationResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwCommunicationResourceAttribute.canInstantiate(obj))
        	return new SwCommunicationResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwCommunicationResourceAttribute other = (SwCommunicationResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Attribute_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Attribute_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Attribute_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Attribute_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Attribute_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Attribute_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Attribute_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Attribute_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Attribute_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Attribute_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Attribute_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Attribute_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Attribute_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Attribute_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Attribute_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Attribute_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Attribute_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Attribute_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Attribute_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Attribute_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Attribute_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Attribute_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Attribute_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Attribute_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Attribute_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceAttribute.MdaTypes.SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT, value);
    }

    protected SwCommunicationResourceAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0210d11b-0ccf-11df-8525-001302895b2b");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85d2ca23-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85d2ca22-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85d2ca21-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85d2ca20-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85d2ca1f-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a23f493d-97f8-11e0-a4c3-0027103f347c");
            SWCOMMUNICATIONRESOURCE_ATTRIBUTE_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a0f77e8a-60ca-11e3-a828-0027103f347d");
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
