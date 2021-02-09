/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.StorageResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwMemory_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwMemoryParameter extends StorageResourceParameter {
    public static final String STEREOTYPE_NAME = "HwMemory_Parameter";

    public static final String HWMEMORY_PARAMETER_ADRESSSIZE_TAGTYPE = "HwMemory_Parameter_adressSize";

    public static final String HWMEMORY_PARAMETER_DESCRIPTION_TAGTYPE = "HwMemory_Parameter_description";

    public static final String HWMEMORY_PARAMETER_ENDPOINTS_TAGTYPE = "HwMemory_Parameter_endPoints";

    public static final String HWMEMORY_PARAMETER_FREQUENCY_TAGTYPE = "HwMemory_Parameter_frequency";

    public static final String HWMEMORY_PARAMETER_MEMORYSIZE_TAGTYPE = "HwMemory_Parameter_memorySize";

    public static final String HWMEMORY_PARAMETER_OWNEDHW_TAGTYPE = "HwMemory_Parameter_ownedHW";

    public static final String HWMEMORY_PARAMETER_P_HW_SERVICES_TAGTYPE = "HwMemory_Parameter_p_HW_Services";

    public static final String HWMEMORY_PARAMETER_R_HW_SERVICES_TAGTYPE = "HwMemory_Parameter_r_HW_Services";

    public static final String HWMEMORY_PARAMETER_THROUGHPUT_TAGTYPE = "HwMemory_Parameter_throughput";

    public static final String HWMEMORY_PARAMETER_TIMINGS_TAGTYPE = "HwMemory_Parameter_timings";

    /**
     * Tells whether a {@link HwMemoryParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwMemory_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwMemory_Parameter >> then instantiate a {@link HwMemoryParameter} proxy.
     * 
     * @return a {@link HwMemoryParameter} proxy on the created {@link Parameter}.
     */
    public static HwMemoryParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryParameter.STEREOTYPE_NAME);
        return HwMemoryParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwMemoryParameter} proxy from a {@link Parameter} stereotyped << HwMemory_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwMemoryParameter} proxy or <i>null</i>.
     */
    public static HwMemoryParameter instantiate(final Parameter obj) {
        return HwMemoryParameter.canInstantiate(obj) ? new HwMemoryParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMemoryParameter} proxy from a {@link Parameter} stereotyped << HwMemory_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwMemoryParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwMemoryParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwMemoryParameter.canInstantiate(obj))
        	return new HwMemoryParameter(obj);
        else
        	throw new IllegalArgumentException("HwMemoryParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwMemoryParameter other = (HwMemoryParameter) obj;
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
     * Getter for string property 'HwMemory_Parameter_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Parameter_adressSize() {
        return this.elt.getTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_ADRESSSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Parameter_description() {
        return this.elt.getTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Parameter_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Parameter_endPoints() {
        return this.elt.getTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Parameter_frequency() {
        return this.elt.getTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Parameter_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Parameter_memorySize() {
        return this.elt.getTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Parameter_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Parameter_ownedHW() {
        return this.elt.getTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Parameter_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Parameter_p_HW_Services() {
        return this.elt.getTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Parameter_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Parameter_r_HW_Services() {
        return this.elt.getTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Parameter_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Parameter_throughput() {
        return this.elt.getTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Parameter_timings'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Parameter_timings() {
        return this.elt.getTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_TIMINGS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwMemory_Parameter_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Parameter_adressSize(final String value) {
        this.elt.putTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_ADRESSSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Parameter_description(final String value) {
        this.elt.putTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Parameter_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Parameter_endPoints(final List<String> values) {
        this.elt.putTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Parameter_frequency(final String value) {
        this.elt.putTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Parameter_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Parameter_memorySize(final String value) {
        this.elt.putTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Parameter_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Parameter_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Parameter_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Parameter_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Parameter_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Parameter_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Parameter_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Parameter_throughput(final String value) {
        this.elt.putTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Parameter_timings'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Parameter_timings(final List<String> values) {
        this.elt.putTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_TIMINGS_TAGTYPE_ELT, values);
    }

    protected HwMemoryParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMEMORY_PARAMETER_MEMORYSIZE_TAGTYPE_ELT;

        public static TagType HWMEMORY_PARAMETER_ADRESSSIZE_TAGTYPE_ELT;

        public static TagType HWMEMORY_PARAMETER_TIMINGS_TAGTYPE_ELT;

        public static TagType HWMEMORY_PARAMETER_THROUGHPUT_TAGTYPE_ELT;

        public static TagType HWMEMORY_PARAMETER_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWMEMORY_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWMEMORY_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWMEMORY_PARAMETER_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWMEMORY_PARAMETER_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWMEMORY_PARAMETER_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "014af088-0ccf-11df-8525-001302895b2b");
            HWMEMORY_PARAMETER_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014d52da-0ccf-11df-8525-001302895b2b");
            HWMEMORY_PARAMETER_ADRESSSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014d52e1-0ccf-11df-8525-001302895b2b");
            HWMEMORY_PARAMETER_TIMINGS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014fb52a-0ccf-11df-8525-001302895b2b");
            HWMEMORY_PARAMETER_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014fb531-0ccf-11df-8525-001302895b2b");
            HWMEMORY_PARAMETER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b2c8330e-162d-11df-b9be-0014222a9f79");
            HWMEMORY_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b2c8330f-162d-11df-b9be-0014222a9f79");
            HWMEMORY_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b2c83310-162d-11df-b9be-0014222a9f79");
            HWMEMORY_PARAMETER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b2c83311-162d-11df-b9be-0014222a9f79");
            HWMEMORY_PARAMETER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b2c83312-162d-11df-b9be-0014222a9f79");
            HWMEMORY_PARAMETER_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "06eb17b1-170f-11df-b92a-0014222a9f79");
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
