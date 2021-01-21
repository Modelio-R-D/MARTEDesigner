/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("5888ad76-a65b-4840-99c5-b19dcb3a0e89")
public class HwISAParameter extends HwResourceParameter {
    @objid ("6891a4d1-e02e-4dcb-94b0-ded76316e4e4")
    public static final String STEREOTYPE_NAME = "HwISA_Parameter";

    @objid ("2b2a72ce-7a37-43fa-bb08-a08c0f8ee2c9")
    public static final String HWISA_PARAMETER_FAMILY_TAGTYPE = "HwISA_Parameter_family";

    @objid ("bd96a302-f991-44ea-b5b1-4343abb31418")
    public static final String HWISA_PARAMETER_INST_WIDTH_TAGTYPE = "HwISA_Parameter_inst_Width";

    @objid ("889579fc-bb52-4def-8b20-55a540b686a3")
    public static final String HWISA_PARAMETER_TYPE_TAGTYPE = "HwISA_Parameter_type";

    /**
     * Tells whether a {@link HwISAParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwISA_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ff389068-93d0-4860-a796-f1d4ee2cc52e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwISAParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwISA_Parameter >> then instantiate a {@link HwISAParameter} proxy.
     * 
     * @return a {@link HwISAParameter} proxy on the created {@link Parameter}.
     */
    @objid ("c1ab669a-b12e-410f-9015-40837c322a2f")
    public static HwISAParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwISAParameter.STEREOTYPE_NAME);
        return HwISAParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwISAParameter} proxy from a {@link Parameter} stereotyped << HwISA_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwISAParameter} proxy or <i>null</i>.
     */
    @objid ("087a822c-4dfc-476a-8550-f246d2077a69")
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
    @objid ("c98ab652-7b6b-4595-9a87-30b535c39774")
    public static HwISAParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwISAParameter.canInstantiate(obj))
        	return new HwISAParameter(obj);
        else
        	throw new IllegalArgumentException("HwISAParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0a73687d-1b0d-432c-80a4-04c41af20430")
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
    @objid ("bbc29564-8580-44a7-ae5e-cd95542ff95d")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwISA_Parameter_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c49dc598-12bb-416b-a687-0747172e9903")
    public String getHwISA_Parameter_family() {
        return this.elt.getTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_FAMILY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Parameter_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ad4aef49-615e-43e7-ae63-4b6552d35c9f")
    public String getHwISA_Parameter_inst_Width() {
        return this.elt.getTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_INST_WIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c85dc06-fcbc-462e-9a04-ef6db6eb829f")
    public String getHwISA_Parameter_type() {
        return this.elt.getTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_TYPE_TAGTYPE_ELT);
    }

    @objid ("3bcc33f9-3eb1-4f52-a34d-44c8b6b3ff29")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwISA_Parameter_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("052b323d-4c0d-46e6-9b0f-acfb8f917a8f")
    public void setHwISA_Parameter_family(final String value) {
        this.elt.putTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_FAMILY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Parameter_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0b3af9e0-4793-4947-87af-3cc9ad73d433")
    public void setHwISA_Parameter_inst_Width(final String value) {
        this.elt.putTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_INST_WIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da5b4759-c6d8-46b6-a2eb-c15966b6bf8e")
    public void setHwISA_Parameter_type(final String value) {
        this.elt.putTagValue(HwISAParameter.MdaTypes.HWISA_PARAMETER_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("597ad5a4-05ba-4d21-aa64-7fb5475cfcd0")
    protected HwISAParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("072de4dc-700a-40eb-bd32-06c9c1200be4")
    public static final class MdaTypes {
        @objid ("d670a545-84d8-42ae-99fd-458aae95000c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1e1a71c1-ec93-4e86-94f7-ac70603f7de6")
        public static TagType HWISA_PARAMETER_FAMILY_TAGTYPE_ELT;

        @objid ("213f003c-f248-4edb-824c-1e7866380fa8")
        public static TagType HWISA_PARAMETER_INST_WIDTH_TAGTYPE_ELT;

        @objid ("28023ace-49a4-4ed2-bfb9-d198551b7df7")
        public static TagType HWISA_PARAMETER_TYPE_TAGTYPE_ELT;

        @objid ("5a705213-a262-47df-8bfd-d6f5bdbaf994")
        private static Stereotype MDAASSOCDEP;

        @objid ("79f4e5a9-4ca4-4723-98e1-dd759ac31538")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d38054af-4c89-4527-b95e-9c7e6f4b5c00")
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
