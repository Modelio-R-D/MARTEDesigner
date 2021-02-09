/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.parameter;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.TimingResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwTimingResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwTimingResourceParameter extends TimingResourceParameter {
    public static final String STEREOTYPE_NAME = "HwTimingResource_Parameter";

    public static final String HWTIMINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE = "HwTimingResource_Parameter_description";

    public static final String HWTIMINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE = "HwTimingResource_Parameter_endPoints";

    public static final String HWTIMINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE = "HwTimingResource_Parameter_frequency";

    public static final String HWTIMINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE = "HwTimingResource_Parameter_ownedHW";

    public static final String HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE = "HwTimingResource_Parameter_p_HW_Services";

    public static final String HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE = "HwTimingResource_Parameter_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwTimingResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwTimingResource_Parameter >> then instantiate a {@link HwTimingResourceParameter} proxy.
     * 
     * @return a {@link HwTimingResourceParameter} proxy on the created {@link Parameter}.
     */
    public static HwTimingResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceParameter.STEREOTYPE_NAME);
        return HwTimingResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceParameter} proxy from a {@link Parameter} stereotyped << HwTimingResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwTimingResourceParameter} proxy or <i>null</i>.
     */
    public static HwTimingResourceParameter instantiate(final Parameter obj) {
        return HwTimingResourceParameter.canInstantiate(obj) ? new HwTimingResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceParameter} proxy from a {@link Parameter} stereotyped << HwTimingResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwTimingResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwTimingResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwTimingResourceParameter.canInstantiate(obj))
        	return new HwTimingResourceParameter(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwTimingResourceParameter other = (HwTimingResourceParameter) obj;
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
     * Getter for string property 'HwTimingResource_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwTimingResource_Parameter_description() {
        return this.elt.getTagValue(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Parameter_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Parameter_endPoints() {
        return this.elt.getTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwTimingResource_Parameter_frequency() {
        return this.elt.getTagValue(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Parameter_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Parameter_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Parameter_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Parameter_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Parameter_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Parameter_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Parameter_description(final String value) {
        this.elt.putTagValue(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Parameter_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Parameter_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Parameter_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Parameter_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Parameter_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Parameter_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Parameter_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Parameter_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Parameter_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceParameter.MdaTypes.HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwTimingResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01226910-0ccf-11df-8525-001302895b2b");
            HWTIMINGRESOURCE_PARAMETER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "43f28866-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "43f28867-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "43f28868-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_PARAMETER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "43f28869-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_PARAMETER_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b9e86900-1709-11df-b92a-0014222a9f79");
            HWTIMINGRESOURCE_PARAMETER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "703fd91f-8dfb-11e0-8741-0027103f347c");
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
