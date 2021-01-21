/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwRAM_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ee21f598-9823-4bc1-9733-de650410b35c")
public class HwRAMParameter extends HwMemoryParameter {
    @objid ("f2bbfe4e-9286-4886-88f8-36d7b8de98ec")
    public static final String STEREOTYPE_NAME = "HwRAM_Parameter";

    @objid ("3b001589-3557-4b8d-a979-29e636a44faf")
    public static final String HWRAM_PARAMETER_ISNONVOLATILE_TAGTYPE = "HwRAM_Parameter_isNonVolatile";

    @objid ("2a2c2436-0f77-42c4-94b1-c782d356823e")
    public static final String HWRAM_PARAMETER_ISSTATIC_TAGTYPE = "HwRAM_Parameter_isStatic";

    @objid ("73d73b50-5b7c-40bc-bab3-ada55506a9c4")
    public static final String HWRAM_PARAMETER_ISSYNCHRONOUS_TAGTYPE = "HwRAM_Parameter_isSynchronous";

    @objid ("7f74619e-d557-4fc9-afe4-9f2bde4e6ab1")
    public static final String HWRAM_PARAMETER_ORGANIZATION_TAGTYPE = "HwRAM_Parameter_organization";

    @objid ("16748341-0866-4ad7-8793-fc59f2043030")
    public static final String HWRAM_PARAMETER_REPL_POLICY_TAGTYPE = "HwRAM_Parameter_repl_Policy";

    @objid ("a636d9f2-2c5d-45a6-b58c-644e38e568d1")
    public static final String HWRAM_PARAMETER_WRITEPOLICY_TAGTYPE = "HwRAM_Parameter_writePolicy";

    /**
     * Tells whether a {@link HwRAMParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwRAM_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d243e981-0af3-4cdc-a5fc-a1130588fbe6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwRAM_Parameter >> then instantiate a {@link HwRAMParameter} proxy.
     * 
     * @return a {@link HwRAMParameter} proxy on the created {@link Parameter}.
     */
    @objid ("2bd43c8e-d76d-436b-9e5c-b3e1c7f15f8f")
    public static HwRAMParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMParameter.STEREOTYPE_NAME);
        return HwRAMParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMParameter} proxy from a {@link Parameter} stereotyped << HwRAM_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwRAMParameter} proxy or <i>null</i>.
     */
    @objid ("924a91a0-e051-4e8f-bc40-558fc0f588f8")
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
    @objid ("db313fff-3ab6-4ee9-aa51-9330aa5abe6d")
    public static HwRAMParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwRAMParameter.canInstantiate(obj))
        	return new HwRAMParameter(obj);
        else
        	throw new IllegalArgumentException("HwRAMParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3a1ecbf1-fd19-4d3a-a568-61880b341bd3")
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
    @objid ("033ff59e-1863-43b1-89cf-4206ac01d9ab")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwRAM_Parameter_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0fd0ae36-c3f8-4b7a-8869-019f5fc8b424")
    public String getHwRAM_Parameter_organization() {
        return this.elt.getTagValue(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Parameter_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a462d1b5-4b34-4728-ac1d-df9e1ec2e828")
    public String getHwRAM_Parameter_repl_Policy() {
        return this.elt.getTagValue(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Parameter_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("12a2ddae-b5e6-4a18-94a4-4d4b9e454224")
    public String getHwRAM_Parameter_writePolicy() {
        return this.elt.getTagValue(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("622d4c76-533b-42d2-95f9-7626eeff4bab")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_Parameter_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3a436ffb-8d66-4608-9f20-aeaaaa07299e")
    public boolean isHwRAM_Parameter_isNonVolatile() {
        return this.elt.isTagged(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Parameter_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("361ecbc4-c8c7-4001-b23d-1486f53e06d9")
    public boolean isHwRAM_Parameter_isStatic() {
        return this.elt.isTagged(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Parameter_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("34902db6-d321-48dc-917a-5935dc51427f")
    public boolean isHwRAM_Parameter_isSynchronous() {
        return this.elt.isTagged(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Parameter_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6e07d9eb-c20a-498b-bd4e-5dc7910e3d9a")
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
    @objid ("155b01b7-327c-41f8-87a2-faf32f30874c")
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
    @objid ("024f05dc-e9c3-4bd0-bdb9-3caff7deae2c")
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
    @objid ("46405f27-c1c8-4e28-9e7d-12ea8db740ae")
    public void setHwRAM_Parameter_organization(final String value) {
        this.elt.putTagValue(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Parameter_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a789ad15-835c-4099-877c-c54d5f51a753")
    public void setHwRAM_Parameter_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Parameter_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7a7d59e4-5f69-4429-bddb-8b4ea7c04e53")
    public void setHwRAM_Parameter_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMParameter.MdaTypes.HWRAM_PARAMETER_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("149a5b63-74cc-4702-997e-7a5231f5ace6")
    protected HwRAMParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("eeed02f5-2daa-4fee-a213-0fdd0fb3b877")
    public static final class MdaTypes {
        @objid ("413f6281-edf8-44d1-b863-e7ff7001e939")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cc091ccf-6f05-4dc1-8c42-dbd3dfb359f8")
        public static TagType HWRAM_PARAMETER_ORGANIZATION_TAGTYPE_ELT;

        @objid ("1249f96d-8286-450a-800b-4a00d8bbb6e4")
        public static TagType HWRAM_PARAMETER_REPL_POLICY_TAGTYPE_ELT;

        @objid ("b1201a23-833c-4110-a54d-17fd91da9833")
        public static TagType HWRAM_PARAMETER_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("81a6acab-6d54-4607-81b0-b9caaab8d18b")
        public static TagType HWRAM_PARAMETER_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("0c9281ed-8be0-4490-8a40-3c56b4fa59fe")
        public static TagType HWRAM_PARAMETER_ISSTATIC_TAGTYPE_ELT;

        @objid ("1c123236-e97d-4252-8f3c-ae29b6aab037")
        public static TagType HWRAM_PARAMETER_ISNONVOLATILE_TAGTYPE_ELT;

        @objid ("ba98dbeb-c95d-4b87-a85a-7fb34152296c")
        private static Stereotype MDAASSOCDEP;

        @objid ("b11fd02d-9fb2-41d0-9f3f-a3c3eb6607de")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e65efa14-43c5-475d-815e-1d8789ea97be")
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
