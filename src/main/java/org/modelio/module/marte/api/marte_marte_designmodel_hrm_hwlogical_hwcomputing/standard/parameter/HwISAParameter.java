/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.parameter.HwResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwISA_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwISAParameter extends HwResourceParameter {
    public static final String STEREOTYPE_NAME = "HwISA_Parameter";

    public static final String HWISA_PARAMETER_FAMILY_TAGTYPE = "HwISA_Parameter_family";

    public static final String HWISA_PARAMETER_INST_WIDTH_TAGTYPE = "HwISA_Parameter_inst_Width";

    public static final String HWISA_PARAMETER_TYPE_TAGTYPE = "HwISA_Parameter_type";

    /**
     * Tells whether a {@link HwISAParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwISA_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwISAParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwISA_Parameter >> then instantiate a {@link HwISAParameter} proxy.
     * 
     * @return a {@link HwISAParameter} proxy on the created {@link Parameter}.
     */
    public static HwISAParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwISAParameter.STEREOTYPE_NAME);
        return HwISAParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwISAParameter} proxy from a {@link Parameter} stereotyped << HwISA_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwISAParameter} proxy or <i>null</i>.
     */
    public static HwISAParameter instantiate(final Parameter obj) {
        return HwISAParameter.canInstantiate(obj) ? new HwISAParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwISAParameter} proxy from a {@link Parameter} stereotyped << HwISA_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwISAParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwISAParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwISAParameter.canInstantiate(obj))
        	return new HwISAParameter(obj);
        else
        	throw new IllegalArgumentException("HwISAParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwISAParameter other = (HwISAParameter) obj;
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
     * Getter for string property 'HwISA_Parameter_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwISA_Parameter_family() {
        return this.elt.getTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_FAMILY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Parameter_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwISA_Parameter_inst_Width() {
        return this.elt.getTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_INST_WIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwISA_Parameter_type() {
        return this.elt.getTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwISA_Parameter_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwISA_Parameter_family(final String value) {
        this.elt.putTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_FAMILY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Parameter_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwISA_Parameter_inst_Width(final String value) {
        this.elt.putTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_INST_WIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwISA_Parameter_type(final String value) {
        this.elt.putTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_TYPE_TAGTYPE_ELT, value);
    }

    protected HwISAParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWISA_PARAMETER_FAMILY_TAGTYPE_ELT;

        public static TagType HWISA_PARAMETER_INST_WIDTH_TAGTYPE_ELT;

        public static TagType HWISA_PARAMETER_TYPE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00f77f4c-0ccf-11df-8525-001302895b2b");
            HWISA_PARAMETER_FAMILY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f53-0ccf-11df-8525-001302895b2b");
            HWISA_PARAMETER_INST_WIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f5a-0ccf-11df-8525-001302895b2b");
            HWISA_PARAMETER_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f61-0ccf-11df-8525-001302895b2b");
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
