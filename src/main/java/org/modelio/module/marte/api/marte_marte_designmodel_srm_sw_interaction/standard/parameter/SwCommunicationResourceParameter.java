/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SwCommunicationResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwCommunicationResourceParameter extends SwInteractionResourceParameter {
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Parameter";

    public static final String SWCOMMUNICATIONRESOURCE_PARAMETER_BLOCKT_TAGTYPE = "SwCommunicationResource_Parameter_blockT";

    public static final String SWCOMMUNICATIONRESOURCE_PARAMETER_CAPACITY_TAGTYPE = "SwCommunicationResource_Parameter_capacity";

    public static final String SWCOMMUNICATIONRESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Parameter_elementSize";

    public static final String SWCOMMUNICATIONRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Parameter_mainScheduler";

    public static final String SWCOMMUNICATIONRESOURCE_PARAMETER_PACKETT_TAGTYPE = "SwCommunicationResource_Parameter_packetT";

    public static final String SWCOMMUNICATIONRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Parameter_speedFactor";

    public static final String SWCOMMUNICATIONRESOURCE_PARAMETER_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Parameter_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SwCommunicationResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SwCommunicationResource_Parameter >> then instantiate a {@link SwCommunicationResourceParameter} proxy.
     * 
     * @return a {@link SwCommunicationResourceParameter} proxy on the created {@link Parameter}.
     */
    public static SwCommunicationResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceParameter.STEREOTYPE_NAME);
        return SwCommunicationResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceParameter} proxy from a {@link Parameter} stereotyped << SwCommunicationResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SwCommunicationResourceParameter} proxy or <i>null</i>.
     */
    public static SwCommunicationResourceParameter instantiate(final Parameter obj) {
        return SwCommunicationResourceParameter.canInstantiate(obj) ? new SwCommunicationResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceParameter} proxy from a {@link Parameter} stereotyped << SwCommunicationResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SwCommunicationResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwCommunicationResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SwCommunicationResourceParameter.canInstantiate(obj))
        	return new SwCommunicationResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwCommunicationResourceParameter other = (SwCommunicationResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Parameter_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Parameter_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Parameter_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Parameter_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Parameter_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Parameter_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Parameter_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Parameter_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Parameter_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Parameter_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Parameter_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Parameter_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Parameter_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_TRANSMMODE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Parameter_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Parameter_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Parameter_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Parameter_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Parameter_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Parameter_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Parameter_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Parameter_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Parameter_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Parameter_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Parameter_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Parameter_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceParameter.MdaTypes.SWCOMMUNICATIONRESOURCE_PARAMETER_TRANSMMODE_TAGTYPE_ELT, value);
    }

    protected SwCommunicationResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_PARAMETER_BLOCKT_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_PARAMETER_PACKETT_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_PARAMETER_TRANSMMODE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0210d118-0ccf-11df-8525-001302895b2b");
            SWCOMMUNICATIONRESOURCE_PARAMETER_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8b0fddb7-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_PARAMETER_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8b0fddb6-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8b0fddb5-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8b0fddb4-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8b0fddb3-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e19a19f6-97f8-11e0-a4c3-0027103f347c");
            SWCOMMUNICATIONRESOURCE_PARAMETER_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3f1b9ea-60ca-11e3-a828-0027103f347d");
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
