/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ComputingResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwComputingResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwComputingResourceAttribute extends ComputingResourceAttribute {
    public static final String STEREOTYPE_NAME = "HwComputingResource_Attribute";

    public static final String HWCOMPUTINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE = "HwComputingResource_Attribute_description";

    public static final String HWCOMPUTINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE = "HwComputingResource_Attribute_endPoints";

    public static final String HWCOMPUTINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE = "HwComputingResource_Attribute_frequency";

    public static final String HWCOMPUTINGRESOURCE_ATTRIBUTE_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_Attribute_op_Frequencies";

    public static final String HWCOMPUTINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE = "HwComputingResource_Attribute_ownedHW";

    public static final String HWCOMPUTINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE = "HwComputingResource_Attribute_p_HW_Services";

    public static final String HWCOMPUTINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE = "HwComputingResource_Attribute_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwComputingResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwComputingResource_Attribute >> then instantiate a {@link HwComputingResourceAttribute} proxy.
     * 
     * @return a {@link HwComputingResourceAttribute} proxy on the created {@link Attribute}.
     */
    public static HwComputingResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceAttribute.STEREOTYPE_NAME);
        return HwComputingResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceAttribute} proxy from a {@link Attribute} stereotyped << HwComputingResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwComputingResourceAttribute} proxy or <i>null</i>.
     */
    public static HwComputingResourceAttribute instantiate(final Attribute obj) {
        return HwComputingResourceAttribute.canInstantiate(obj) ? new HwComputingResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceAttribute} proxy from a {@link Attribute} stereotyped << HwComputingResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwComputingResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwComputingResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwComputingResourceAttribute.canInstantiate(obj))
        	return new HwComputingResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwComputingResourceAttribute other = (HwComputingResourceAttribute) obj;
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
     * Getter for string property 'HwComputingResource_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComputingResource_Attribute_description() {
        return this.elt.getTagValue(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Attribute_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Attribute_endPoints() {
        return this.elt.getTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComputingResource_Attribute_frequency() {
        return this.elt.getTagValue(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Attribute_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComputingResource_Attribute_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Attribute_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Attribute_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Attribute_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Attribute_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Attribute_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Attribute_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Attribute_description(final String value) {
        this.elt.putTagValue(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Attribute_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Attribute_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Attribute_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_Attribute_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Attribute_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Attribute_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Attribute_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Attribute_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Attribute_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Attribute_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Attribute_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAttribute.MdaTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwComputingResourceAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ATTRIBUTE_OP_FREQUENCIES_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00d61ed3-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_ATTRIBUTE_OP_FREQUENCIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00e46cbf-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f9812bd-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f9812be-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f9812bf-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f9812c0-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f9812c1-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f9812c2-1623-11df-b9be-0014222a9f79");
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
