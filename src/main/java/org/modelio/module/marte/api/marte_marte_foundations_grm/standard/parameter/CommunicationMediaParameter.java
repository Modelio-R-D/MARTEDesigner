/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

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
 * Proxy class to handle a {@link Parameter} with << CommunicationMedia_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class CommunicationMediaParameter extends ProcessingResourceParameter {
    public static final String STEREOTYPE_NAME = "CommunicationMedia_Parameter";

    public static final String COMMUNICATIONMEDIA_PARAMETER_BLOCKT_TAGTYPE = "CommunicationMedia_Parameter_blockT";

    public static final String COMMUNICATIONMEDIA_PARAMETER_CAPACITY_TAGTYPE = "CommunicationMedia_Parameter_capacity";

    public static final String COMMUNICATIONMEDIA_PARAMETER_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_Parameter_elementSize";

    public static final String COMMUNICATIONMEDIA_PARAMETER_PACKETT_TAGTYPE = "CommunicationMedia_Parameter_packetT";

    public static final String COMMUNICATIONMEDIA_PARAMETER_TRANSMMODE_TAGTYPE = "CommunicationMedia_Parameter_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << CommunicationMedia_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << CommunicationMedia_Parameter >> then instantiate a {@link CommunicationMediaParameter} proxy.
     * 
     * @return a {@link CommunicationMediaParameter} proxy on the created {@link Parameter}.
     */
    public static CommunicationMediaParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaParameter.STEREOTYPE_NAME);
        return CommunicationMediaParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaParameter} proxy from a {@link Parameter} stereotyped << CommunicationMedia_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link CommunicationMediaParameter} proxy or <i>null</i>.
     */
    public static CommunicationMediaParameter instantiate(final Parameter obj) {
        return CommunicationMediaParameter.canInstantiate(obj) ? new CommunicationMediaParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaParameter} proxy from a {@link Parameter} stereotyped << CommunicationMedia_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link CommunicationMediaParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static CommunicationMediaParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (CommunicationMediaParameter.canInstantiate(obj))
        	return new CommunicationMediaParameter(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        CommunicationMediaParameter other = (CommunicationMediaParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Parameter_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getCommunicationMedia_Parameter_blockT() {
        return this.elt.getTagValues(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Parameter_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getCommunicationMedia_Parameter_capacity() {
        return this.elt.getTagValues(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCommunicationMedia_Parameter_elementSize() {
        return this.elt.getTagValue(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Parameter_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getCommunicationMedia_Parameter_packetT() {
        return this.elt.getTagValues(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Parameter_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCommunicationMedia_Parameter_transmMode() {
        return this.elt.getTagValue(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Parameter_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Parameter_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Parameter_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Parameter_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Parameter_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Parameter_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Parameter_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Parameter_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_TRANSMMODE_TAGTYPE_ELT, value);
    }

    protected CommunicationMediaParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_PARAMETER_TRANSMMODE_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_PARAMETER_BLOCKT_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_PARAMETER_PACKETT_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_PARAMETER_CAPACITY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "069e7572-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "126b7e2a-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_PARAMETER_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "126b7e2b-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_PARAMETER_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "126b7e2c-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_PARAMETER_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "126b7e2d-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_PARAMETER_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "126b7e2e-0fdd-11df-86ac-0014222a9f79");
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
