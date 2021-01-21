/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.StorageResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwMemory_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("cab287b8-efc0-4933-9cbc-2b0fa1f7e5cf")
public class HwMemoryAttribute extends StorageResourceAttribute {
    @objid ("a506e48e-0d59-42bb-b9fe-8925bba51a49")
    public static final String STEREOTYPE_NAME = "HwMemory_Attribute";

    @objid ("08822089-8114-4305-bb8c-ebe56b85f841")
    public static final String HWMEMORY_ATTRIBUTE_ADRESSSIZE_TAGTYPE = "HwMemory_Attribute_adressSize";

    @objid ("fcb0ac76-7720-4688-a90d-3781eda7a17b")
    public static final String HWMEMORY_ATTRIBUTE_DESCRIPTION_TAGTYPE = "HwMemory_Attribute_description";

    @objid ("74f4bd3d-90fe-4432-b49e-1083f1180fbc")
    public static final String HWMEMORY_ATTRIBUTE_ENDPOINTS_TAGTYPE = "HwMemory_Attribute_endPoints";

    @objid ("7a4154b0-91ca-4ccc-ad1f-553d3af6ea5b")
    public static final String HWMEMORY_ATTRIBUTE_FREQUENCY_TAGTYPE = "HwMemory_Attribute_frequency";

    @objid ("b9755c8a-c153-42ed-926a-5236ed538d12")
    public static final String HWMEMORY_ATTRIBUTE_MEMORYSIZE_TAGTYPE = "HwMemory_Attribute_memorySize";

    @objid ("d5aee03c-946e-406f-9c45-457981c3fc59")
    public static final String HWMEMORY_ATTRIBUTE_OWNEDHW_TAGTYPE = "HwMemory_Attribute_ownedHW";

    @objid ("700d34ad-f9fc-4f9a-b98f-153ca2345ec3")
    public static final String HWMEMORY_ATTRIBUTE_P_HW_SERVICES_TAGTYPE = "HwMemory_Attribute_p_HW_Services";

    @objid ("d4599f93-cbd7-4ca7-8664-23e171deec28")
    public static final String HWMEMORY_ATTRIBUTE_R_HW_SERVICES_TAGTYPE = "HwMemory_Attribute_r_HW_Services";

    @objid ("70087a6a-d589-4204-b1fc-e6a5f91448f6")
    public static final String HWMEMORY_ATTRIBUTE_THROUGHPUT_TAGTYPE = "HwMemory_Attribute_throughput";

    @objid ("eb37935a-9fba-4335-b46a-a15e4fd0668e")
    public static final String HWMEMORY_ATTRIBUTE_TIMINGS_TAGTYPE = "HwMemory_Attribute_timings";

    /**
     * Tells whether a {@link HwMemoryAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwMemory_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e2bf37ca-94e7-40c7-9587-66d313165628")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwMemory_Attribute >> then instantiate a {@link HwMemoryAttribute} proxy.
     * 
     * @return a {@link HwMemoryAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("2ff5c7f1-b7f6-4aeb-8134-be017f2a6e40")
    public static HwMemoryAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryAttribute.STEREOTYPE_NAME);
        return HwMemoryAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwMemoryAttribute} proxy from a {@link Attribute} stereotyped << HwMemory_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwMemoryAttribute} proxy or <i>null</i>.
     */
    @objid ("fb28f4a0-984d-4383-a67d-d9344bf3482a")
    public static HwMemoryAttribute instantiate(final Attribute obj) {
        return HwMemoryAttribute.canInstantiate(obj) ? new HwMemoryAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMemoryAttribute} proxy from a {@link Attribute} stereotyped << HwMemory_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwMemoryAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0e1c5fe8-bdb0-4a84-a025-774903e26020")
    public static HwMemoryAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwMemoryAttribute.canInstantiate(obj))
        	return new HwMemoryAttribute(obj);
        else
        	throw new IllegalArgumentException("HwMemoryAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c4f29a5e-a925-4a33-9fb1-89c06503d855")
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
        HwMemoryAttribute other = (HwMemoryAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("ef39f9d8-f638-4739-a65e-3ca120d2c400")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwMemory_Attribute_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("698e23fc-bd69-41db-8fac-2267fa811e95")
    public String getHwMemory_Attribute_adressSize() {
        return this.elt.getTagValue(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_ADRESSSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b82313e8-bd0c-4ff8-b081-00af0d29f6cb")
    public String getHwMemory_Attribute_description() {
        return this.elt.getTagValue(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Attribute_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2dd0be54-3322-49ab-aae4-66866ffb892e")
    public List<String> getHwMemory_Attribute_endPoints() {
        return this.elt.getTagValues(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("93c47372-80f3-440d-8202-8fa2bfa79c2a")
    public String getHwMemory_Attribute_frequency() {
        return this.elt.getTagValue(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Attribute_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("51b516d3-2a4b-4dde-8412-45c586708d2b")
    public String getHwMemory_Attribute_memorySize() {
        return this.elt.getTagValue(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Attribute_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5423fc76-df8c-4310-b39f-11e2eb1809b4")
    public List<String> getHwMemory_Attribute_ownedHW() {
        return this.elt.getTagValues(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Attribute_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0d7b769e-efe5-4031-88c6-063ac72f0ddc")
    public List<String> getHwMemory_Attribute_p_HW_Services() {
        return this.elt.getTagValues(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Attribute_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a84043f0-c363-430f-a527-5df8191abe0d")
    public List<String> getHwMemory_Attribute_r_HW_Services() {
        return this.elt.getTagValues(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Attribute_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac3d69ab-5114-47c7-b619-8f4e73afe9f0")
    public String getHwMemory_Attribute_throughput() {
        return this.elt.getTagValue(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Attribute_timings'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("000ba187-e768-4066-b8d0-3c9fdc2b3c9e")
    public List<String> getHwMemory_Attribute_timings() {
        return this.elt.getTagValues(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_TIMINGS_TAGTYPE_ELT);
    }

    @objid ("dc640fc7-87b7-4365-a0fa-d5be03804c60")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwMemory_Attribute_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1c91d27d-3fd0-47ca-a984-d3321877f44b")
    public void setHwMemory_Attribute_adressSize(final String value) {
        this.elt.putTagValue(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_ADRESSSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f16693c-9694-432d-ba67-76f837c507f9")
    public void setHwMemory_Attribute_description(final String value) {
        this.elt.putTagValue(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Attribute_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d2a7743-bc34-4727-9bc9-62b4f8652b20")
    public void setHwMemory_Attribute_endPoints(final List<String> values) {
        this.elt.putTagValues(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a51e769-aa27-4dd8-ab3a-103dd3a2c260")
    public void setHwMemory_Attribute_frequency(final String value) {
        this.elt.putTagValue(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Attribute_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("29877a89-dce3-4961-81e4-1214cd248a1a")
    public void setHwMemory_Attribute_memorySize(final String value) {
        this.elt.putTagValue(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Attribute_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5dec91e8-75b2-4afb-aa9f-d01786d7f5c6")
    public void setHwMemory_Attribute_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Attribute_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("83d56475-0050-4064-ab3f-873f51980a05")
    public void setHwMemory_Attribute_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Attribute_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ae9d6f7d-0f76-4264-90d1-afb49e7a557d")
    public void setHwMemory_Attribute_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Attribute_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9d9f94e3-1c87-465d-96d4-1761ebd4abd6")
    public void setHwMemory_Attribute_throughput(final String value) {
        this.elt.putTagValue(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Attribute_timings'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("011988f6-5034-4511-ab61-4db59de0c2e8")
    public void setHwMemory_Attribute_timings(final List<String> values) {
        this.elt.putTagValues(HwMemoryAttribute.MdaTypes.HWMEMORY_ATTRIBUTE_TIMINGS_TAGTYPE_ELT, values);
    }

    @objid ("351b1a35-56ab-4c7e-8810-ff98f10ef8ef")
    protected HwMemoryAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("90d29514-4346-4fab-b6c9-911e4f99373e")
    public static final class MdaTypes {
        @objid ("1b0e5fbd-4130-435d-a637-39c7e7149f00")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5c140b27-dbec-4dad-b2a2-b411b4f13d9e")
        public static TagType HWMEMORY_ATTRIBUTE_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("694debd2-448e-4771-a2e7-8540b9925810")
        public static TagType HWMEMORY_ATTRIBUTE_ADRESSSIZE_TAGTYPE_ELT;

        @objid ("fc0ebe6d-44c4-4be4-8e0c-db93391fe734")
        public static TagType HWMEMORY_ATTRIBUTE_TIMINGS_TAGTYPE_ELT;

        @objid ("24722ffe-6c4a-4655-9126-b23d3fa58387")
        public static TagType HWMEMORY_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT;

        @objid ("3aa4c94a-e59d-4688-91da-16b7424403f0")
        public static TagType HWMEMORY_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("e22c242e-c3c8-452f-a555-78411ba7cd96")
        public static TagType HWMEMORY_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("27587467-bf4c-4350-ba8b-6ed322c28b71")
        public static TagType HWMEMORY_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("a7fdb306-62de-47b4-9ab4-bbbc29f32d20")
        public static TagType HWMEMORY_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT;

        @objid ("8d4f8690-1f75-4ad6-ac03-3ebca3ea3288")
        public static TagType HWMEMORY_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT;

        @objid ("22cc59b8-f1e8-4383-b439-25797e33893c")
        public static TagType HWMEMORY_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("32d0504a-3f32-4119-b835-1249fda5dbe8")
        private static Stereotype MDAASSOCDEP;

        @objid ("dff84384-ff8f-448c-a45f-1cfa75756aea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("62776d6d-51e2-468c-85df-7bc5a2140f7f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "014af084-0ccf-11df-8525-001302895b2b");
            HWMEMORY_ATTRIBUTE_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014d52d6-0ccf-11df-8525-001302895b2b");
            HWMEMORY_ATTRIBUTE_ADRESSSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014d52dd-0ccf-11df-8525-001302895b2b");
            HWMEMORY_ATTRIBUTE_TIMINGS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014fb526-0ccf-11df-8525-001302895b2b");
            HWMEMORY_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014fb52d-0ccf-11df-8525-001302895b2b");
            HWMEMORY_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b99bd47a-162d-11df-b9be-0014222a9f79");
            HWMEMORY_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b99bd47b-162d-11df-b9be-0014222a9f79");
            HWMEMORY_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b99bd47c-162d-11df-b9be-0014222a9f79");
            HWMEMORY_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b99bd47d-162d-11df-b9be-0014222a9f79");
            HWMEMORY_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b99bd47e-162d-11df-b9be-0014222a9f79");
            HWMEMORY_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0dddb7c9-170f-11df-b92a-0014222a9f79");
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
