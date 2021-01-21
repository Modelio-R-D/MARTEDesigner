/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.StorageResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwMemory_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8cdf9588-d9ba-4bbc-95bf-9b2a84d77853")
public class HwMemoryParameter extends StorageResourceParameter {
    @objid ("338763e8-9957-4009-8a92-f84752302a5b")
    public static final String STEREOTYPE_NAME = "HwMemory_Parameter";

    @objid ("111b9d31-980a-42e0-82b0-bfa26d3ed922")
    public static final String HWMEMORY_PARAMETER_ADRESSSIZE_TAGTYPE = "HwMemory_Parameter_adressSize";

    @objid ("3106c5aa-325b-4d54-b067-a81880530054")
    public static final String HWMEMORY_PARAMETER_DESCRIPTION_TAGTYPE = "HwMemory_Parameter_description";

    @objid ("87d9ef51-7102-4d91-a9c5-a1c069e26c82")
    public static final String HWMEMORY_PARAMETER_ENDPOINTS_TAGTYPE = "HwMemory_Parameter_endPoints";

    @objid ("8a7e20e5-dfe5-4096-b2d0-1c541a3a302f")
    public static final String HWMEMORY_PARAMETER_FREQUENCY_TAGTYPE = "HwMemory_Parameter_frequency";

    @objid ("a8027a5a-2dcf-4052-a3f1-0ea1414ee0d5")
    public static final String HWMEMORY_PARAMETER_MEMORYSIZE_TAGTYPE = "HwMemory_Parameter_memorySize";

    @objid ("cc9d1fe0-542d-4d7a-aea6-e43125aa153c")
    public static final String HWMEMORY_PARAMETER_OWNEDHW_TAGTYPE = "HwMemory_Parameter_ownedHW";

    @objid ("a2833185-b7ef-47bc-878f-ac095ae97c12")
    public static final String HWMEMORY_PARAMETER_P_HW_SERVICES_TAGTYPE = "HwMemory_Parameter_p_HW_Services";

    @objid ("94b0cb39-0eb8-4528-9437-f3435169af27")
    public static final String HWMEMORY_PARAMETER_R_HW_SERVICES_TAGTYPE = "HwMemory_Parameter_r_HW_Services";

    @objid ("3871d008-7089-4f88-bd39-b418e49422f0")
    public static final String HWMEMORY_PARAMETER_THROUGHPUT_TAGTYPE = "HwMemory_Parameter_throughput";

    @objid ("7de915a0-cd33-4076-8e31-483b3d475e6d")
    public static final String HWMEMORY_PARAMETER_TIMINGS_TAGTYPE = "HwMemory_Parameter_timings";

    /**
     * Tells whether a {@link HwMemoryParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwMemory_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f33e3e70-9cb9-405d-8574-3f22c694fbb1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwMemory_Parameter >> then instantiate a {@link HwMemoryParameter} proxy.
     * 
     * @return a {@link HwMemoryParameter} proxy on the created {@link Parameter}.
     */
    @objid ("c5ea22f2-da51-4b05-a12c-9dafc78a3658")
    public static HwMemoryParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryParameter.STEREOTYPE_NAME);
        return HwMemoryParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwMemoryParameter} proxy from a {@link Parameter} stereotyped << HwMemory_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwMemoryParameter} proxy or <i>null</i>.
     */
    @objid ("f3f4bfeb-5948-4af2-8e4f-680ead3b4ae4")
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
    @objid ("4d5d49e6-be3a-4a88-a6e8-d0dec57b0bff")
    public static HwMemoryParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwMemoryParameter.canInstantiate(obj))
        	return new HwMemoryParameter(obj);
        else
        	throw new IllegalArgumentException("HwMemoryParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e7a1dd5d-57f2-4705-8112-2cfb47f3f115")
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
    @objid ("e9d5a873-2a0c-4c25-97d6-474d001e1f43")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwMemory_Parameter_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("221caa85-963a-407d-9eb4-db59ecfdf5ac")
    public String getHwMemory_Parameter_adressSize() {
        return this.elt.getTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_ADRESSSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4109c9e3-a2be-49a9-ab57-5e5fb90bef5a")
    public String getHwMemory_Parameter_description() {
        return this.elt.getTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Parameter_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8eb00015-9ada-4678-ae01-bb5122222bfb")
    public List<String> getHwMemory_Parameter_endPoints() {
        return this.elt.getTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("63202fa1-6b40-4b54-9cd3-754141e784c3")
    public String getHwMemory_Parameter_frequency() {
        return this.elt.getTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Parameter_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("439ed060-1c7a-40ec-a67d-509baf11660f")
    public String getHwMemory_Parameter_memorySize() {
        return this.elt.getTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Parameter_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a1df5db0-2411-4d23-ac8a-c3fe484426e1")
    public List<String> getHwMemory_Parameter_ownedHW() {
        return this.elt.getTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Parameter_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c23d2e85-4489-41ab-850a-0950e726c099")
    public List<String> getHwMemory_Parameter_p_HW_Services() {
        return this.elt.getTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Parameter_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0fb3dbb8-e4c8-42ae-94a8-d8cfac047235")
    public List<String> getHwMemory_Parameter_r_HW_Services() {
        return this.elt.getTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Parameter_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b864f09-8bb4-46ff-a25b-bb1bf2bcdcfb")
    public String getHwMemory_Parameter_throughput() {
        return this.elt.getTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Parameter_timings'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("74a4ab99-3fd4-4a7c-b209-32efbbded7f9")
    public List<String> getHwMemory_Parameter_timings() {
        return this.elt.getTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_TIMINGS_TAGTYPE_ELT);
    }

    @objid ("d35a7c01-e666-4c73-9203-98d757ff26ca")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwMemory_Parameter_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bb573fc2-3a39-49a3-9e2b-a2fd52697e99")
    public void setHwMemory_Parameter_adressSize(final String value) {
        this.elt.putTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_ADRESSSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d2014f7b-a931-4ad7-ba82-6ba2fa8cf518")
    public void setHwMemory_Parameter_description(final String value) {
        this.elt.putTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Parameter_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1e1dff2d-4d15-4ca1-b166-2545e15596be")
    public void setHwMemory_Parameter_endPoints(final List<String> values) {
        this.elt.putTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b7b75a4d-4556-4654-9a9e-dfd73f5c2b57")
    public void setHwMemory_Parameter_frequency(final String value) {
        this.elt.putTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Parameter_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("223bc203-2a7b-465e-bd4a-9eedfb2c8604")
    public void setHwMemory_Parameter_memorySize(final String value) {
        this.elt.putTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Parameter_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("08bc4a6e-9110-4897-8c50-e816889063de")
    public void setHwMemory_Parameter_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Parameter_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8510005e-b81b-40a0-ab25-99e0268fbdc4")
    public void setHwMemory_Parameter_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Parameter_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4df7604c-d10a-44ce-9de0-b3f2c08e0b09")
    public void setHwMemory_Parameter_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Parameter_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("af103c6e-0087-439f-a3e9-99e7c5018aa2")
    public void setHwMemory_Parameter_throughput(final String value) {
        this.elt.putTagValue(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Parameter_timings'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a229a66b-fc44-4d16-9474-07c9dbca9e1a")
    public void setHwMemory_Parameter_timings(final List<String> values) {
        this.elt.putTagValues(HwMemoryParameter.MdaTypes.HWMEMORY_PARAMETER_TIMINGS_TAGTYPE_ELT, values);
    }

    @objid ("44929288-2b8d-4a03-9afe-5abd3e66518b")
    protected HwMemoryParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("d280da08-de1d-42bf-bc79-de3bc40ab4ce")
    public static final class MdaTypes {
        @objid ("54c08ad4-5879-4231-b30f-4d2c95282bc6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("957eb82d-056f-40e0-a553-81f30f831c02")
        public static TagType HWMEMORY_PARAMETER_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("12d24913-50d9-4c55-9bb6-145a1e8e3e84")
        public static TagType HWMEMORY_PARAMETER_ADRESSSIZE_TAGTYPE_ELT;

        @objid ("0fb57e0d-7ea3-45b4-bee9-d04c63607567")
        public static TagType HWMEMORY_PARAMETER_TIMINGS_TAGTYPE_ELT;

        @objid ("392f3aa5-8392-4439-b782-a0429aff966d")
        public static TagType HWMEMORY_PARAMETER_THROUGHPUT_TAGTYPE_ELT;

        @objid ("f464e25f-205f-4763-9503-3434521d55f7")
        public static TagType HWMEMORY_PARAMETER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("08ccc2fd-c4d1-438b-9eca-f510a9e4d8a6")
        public static TagType HWMEMORY_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("0d562739-e500-4863-bccb-ccff9544fd24")
        public static TagType HWMEMORY_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("6c4895fb-5fe7-4d33-99be-7ce4099ba779")
        public static TagType HWMEMORY_PARAMETER_OWNEDHW_TAGTYPE_ELT;

        @objid ("a702cb79-593d-4a85-a917-62700b26e850")
        public static TagType HWMEMORY_PARAMETER_FREQUENCY_TAGTYPE_ELT;

        @objid ("8be08144-b58c-4671-abc6-daa12eb6426f")
        public static TagType HWMEMORY_PARAMETER_ENDPOINTS_TAGTYPE_ELT;

        @objid ("4cfd75ea-d8b6-43b2-9e5f-197537aba7ea")
        private static Stereotype MDAASSOCDEP;

        @objid ("6e6ee077-68f4-47c5-9ed3-8e241e3267b2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("893dcf81-fdc1-447e-8844-4fcbc73f6afb")
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
