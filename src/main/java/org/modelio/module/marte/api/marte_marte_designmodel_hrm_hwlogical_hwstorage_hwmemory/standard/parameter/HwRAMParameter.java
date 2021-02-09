/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwRAM_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwRAMParameter extends HwMemoryParameter {
    public static final String STEREOTYPE_NAME = "HwRAM_Parameter";

    public static final String HWRAM_PARAMETER_ISNONVOLATILE_TAGTYPE = "HwRAM_Parameter_isNonVolatile";

    public static final String HWRAM_PARAMETER_ISSTATIC_TAGTYPE = "HwRAM_Parameter_isStatic";

    public static final String HWRAM_PARAMETER_ISSYNCHRONOUS_TAGTYPE = "HwRAM_Parameter_isSynchronous";

    public static final String HWRAM_PARAMETER_ORGANIZATION_TAGTYPE = "HwRAM_Parameter_organization";

    public static final String HWRAM_PARAMETER_REPL_POLICY_TAGTYPE = "HwRAM_Parameter_repl_Policy";

    public static final String HWRAM_PARAMETER_WRITEPOLICY_TAGTYPE = "HwRAM_Parameter_writePolicy";

    /**
     * Tells whether a {@link HwRAMParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwRAM_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwRAM_Parameter >> then instantiate a {@link HwRAMParameter} proxy.
     * 
     * @return a {@link HwRAMParameter} proxy on the created {@link Parameter}.
     */
    public static HwRAMParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMParameter.STEREOTYPE_NAME);
        return HwRAMParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMParameter} proxy from a {@link Parameter} stereotyped << HwRAM_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwRAMParameter} proxy or <i>null</i>.
     */
    public static HwRAMParameter instantiate(final Parameter obj) {
        return HwRAMParameter.canInstantiate(obj) ? new HwRAMParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwRAMParameter} proxy from a {@link Parameter} stereotyped << HwRAM_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwRAMParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwRAMParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwRAMParameter.canInstantiate(obj))
        	return new HwRAMParameter(obj);
        else
        	throw new IllegalArgumentException("HwRAMParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwRAMParameter other = (HwRAMParameter) obj;
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
     * Getter for string property 'HwRAM_Parameter_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Parameter_organization() {
        return this.elt.getTagValue(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Parameter_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Parameter_repl_Policy() {
        return this.elt.getTagValue(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Parameter_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Parameter_writePolicy() {
        return this.elt.getTagValue(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_WRITEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_Parameter_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Parameter_isNonVolatile() {
        return this.elt.isTagged(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Parameter_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Parameter_isStatic() {
        return this.elt.isTagged(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Parameter_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Parameter_isSynchronous() {
        return this.elt.isTagged(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Parameter_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Parameter_isNonVolatile(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ISNONVOLATILE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Parameter_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Parameter_isStatic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ISSTATIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Parameter_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Parameter_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwRAM_Parameter_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Parameter_organization(final String value) {
        this.elt.putTagValue(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Parameter_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Parameter_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Parameter_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Parameter_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    protected HwRAMParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWRAM_PARAMETER_ORGANIZATION_TAGTYPE_ELT;

        public static TagType HWRAM_PARAMETER_REPL_POLICY_TAGTYPE_ELT;

        public static TagType HWRAM_PARAMETER_WRITEPOLICY_TAGTYPE_ELT;

        public static TagType HWRAM_PARAMETER_ISSYNCHRONOUS_TAGTYPE_ELT;

        public static TagType HWRAM_PARAMETER_ISSTATIC_TAGTYPE_ELT;

        public static TagType HWRAM_PARAMETER_ISNONVOLATILE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01593e74-0ccf-11df-8525-001302895b2b");
            HWRAM_PARAMETER_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0c6-0ccf-11df-8525-001302895b2b");
            HWRAM_PARAMETER_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0e2-0ccf-11df-8525-001302895b2b");
            HWRAM_PARAMETER_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015e0317-0ccf-11df-8525-001302895b2b");
            HWRAM_PARAMETER_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "be727589-170f-11df-b92a-0014222a9f79");
            HWRAM_PARAMETER_ISSTATIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "be72758a-170f-11df-b92a-0014222a9f79");
            HWRAM_PARAMETER_ISNONVOLATILE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "be72758b-170f-11df-b92a-0014222a9f79");
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
