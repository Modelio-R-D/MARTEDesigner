/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.StorageResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwMemory_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("821975ed-7589-4a74-9283-aeb45c53fb99")
public class HwMemoryInstance extends StorageResourceInstance {
    @objid ("c909da98-87c5-4fc4-b462-dcf2515562ca")
    public static final String STEREOTYPE_NAME = "HwMemory_Instance";

    @objid ("325432f5-1a72-48d1-b2fe-f5cd6eb9cb60")
    public static final String HWMEMORY_INSTANCE_ADRESSSIZE_TAGTYPE = "HwMemory_Instance_adressSize";

    @objid ("dd7275b7-5eef-48fc-a706-ed4b5cebc4c9")
    public static final String HWMEMORY_INSTANCE_DESCRIPTION_TAGTYPE = "HwMemory_Instance_description";

    @objid ("c9cedabf-a1a4-4767-b995-4169f637ab10")
    public static final String HWMEMORY_INSTANCE_ENDPOINTS_TAGTYPE = "HwMemory_Instance_endPoints";

    @objid ("8b4312ff-4ac6-418c-aa7c-d5ccdfff400d")
    public static final String HWMEMORY_INSTANCE_FREQUENCY_TAGTYPE = "HwMemory_Instance_frequency";

    @objid ("51d64bfc-2525-47a6-af5b-9ebb841b6405")
    public static final String HWMEMORY_INSTANCE_MEMORYSIZE_TAGTYPE = "HwMemory_Instance_memorySize";

    @objid ("6f41c3c4-6b66-4352-956f-97d502c0c698")
    public static final String HWMEMORY_INSTANCE_OWNEDHW_TAGTYPE = "HwMemory_Instance_ownedHW";

    @objid ("c05dc995-9f14-4f78-ab15-95bfc8a6d971")
    public static final String HWMEMORY_INSTANCE_P_HW_SERVICES_TAGTYPE = "HwMemory_Instance_p_HW_Services";

    @objid ("57b190bf-28db-4133-8292-670043d0f1ae")
    public static final String HWMEMORY_INSTANCE_R_HW_SERVICES_TAGTYPE = "HwMemory_Instance_r_HW_Services";

    @objid ("4eb93f84-2643-4ffd-8141-d5dc7e3a68f4")
    public static final String HWMEMORY_INSTANCE_THROUGHPUT_TAGTYPE = "HwMemory_Instance_throughput";

    @objid ("314acf53-464d-4828-85f4-00c747c16adc")
    public static final String HWMEMORY_INSTANCE_TIMINGS_TAGTYPE = "HwMemory_Instance_timings";

    /**
     * Tells whether a {@link HwMemoryInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwMemory_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2a6e68ce-39d0-411e-9efc-f931d4f186ab")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwMemory_Instance >> then instantiate a {@link HwMemoryInstance} proxy.
     * 
     * @return a {@link HwMemoryInstance} proxy on the created {@link Instance}.
     */
    @objid ("dfef6a85-ee30-4728-b0ff-3b3a8028cdb1")
    public static HwMemoryInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryInstance.STEREOTYPE_NAME);
        return HwMemoryInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwMemoryInstance} proxy from a {@link Instance} stereotyped << HwMemory_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwMemoryInstance} proxy or <i>null</i>.
     */
    @objid ("64f70ea5-d6ab-482d-91d9-04cc72fbe631")
    public static HwMemoryInstance instantiate(final Instance obj) {
        return HwMemoryInstance.canInstantiate(obj) ? new HwMemoryInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMemoryInstance} proxy from a {@link Instance} stereotyped << HwMemory_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwMemoryInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("81dc49a2-8978-42d6-a3d2-3b0c1cad067a")
    public static HwMemoryInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwMemoryInstance.canInstantiate(obj))
        	return new HwMemoryInstance(obj);
        else
        	throw new IllegalArgumentException("HwMemoryInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6bac4872-1194-4082-8149-336f6030ae02")
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
        HwMemoryInstance other = (HwMemoryInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("f762fc05-031a-4f05-ba50-b8f7d95b34fa")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwMemory_Instance_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cba3e05d-e848-4f56-828c-97c0ce217e6a")
    public String getHwMemory_Instance_adressSize() {
        return this.elt.getTagValue(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_ADRESSSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("72c85882-8f8b-4126-a5ff-2360a09d918a")
    public String getHwMemory_Instance_description() {
        return this.elt.getTagValue(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Instance_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7a6ca769-f4c4-4690-8351-435ecc7cd0ee")
    public List<String> getHwMemory_Instance_endPoints() {
        return this.elt.getTagValues(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b2bae385-fdf5-4563-a929-60a6ed04d197")
    public String getHwMemory_Instance_frequency() {
        return this.elt.getTagValue(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Instance_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a0bb36e8-6fd1-4e5c-aaa7-fd936da188ab")
    public String getHwMemory_Instance_memorySize() {
        return this.elt.getTagValue(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Instance_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4cfa29ac-7e34-428c-b9c6-40e0a7aaf440")
    public List<String> getHwMemory_Instance_ownedHW() {
        return this.elt.getTagValues(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Instance_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8c4fe397-6b33-4814-8e01-4e78489d01f1")
    public List<String> getHwMemory_Instance_p_HW_Services() {
        return this.elt.getTagValues(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Instance_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9d0a0efd-9084-460e-8f07-3cfab90850f2")
    public List<String> getHwMemory_Instance_r_HW_Services() {
        return this.elt.getTagValues(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Instance_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e774c5f9-d11a-4758-9cfa-06294a38415b")
    public String getHwMemory_Instance_throughput() {
        return this.elt.getTagValue(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Instance_timings'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b9a369cc-866a-484f-9c46-f972a21d7f8d")
    public List<String> getHwMemory_Instance_timings() {
        return this.elt.getTagValues(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_TIMINGS_TAGTYPE_ELT);
    }

    @objid ("3497c440-7e21-42ca-b72b-1dca961cc8a4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwMemory_Instance_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("48f87557-caed-44ef-aeec-7efcf77ce0ee")
    public void setHwMemory_Instance_adressSize(final String value) {
        this.elt.putTagValue(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_ADRESSSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("024072dc-286d-49cb-9ef4-466bffbce036")
    public void setHwMemory_Instance_description(final String value) {
        this.elt.putTagValue(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Instance_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1461db78-ae02-4baf-b692-def8b34f4ba7")
    public void setHwMemory_Instance_endPoints(final List<String> values) {
        this.elt.putTagValues(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1b1451f3-93d1-4da5-938d-6b5b369c0de3")
    public void setHwMemory_Instance_frequency(final String value) {
        this.elt.putTagValue(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Instance_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("75239b8d-6551-4ae9-8aa8-ac28110a7ebe")
    public void setHwMemory_Instance_memorySize(final String value) {
        this.elt.putTagValue(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Instance_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0b85d60-5957-4e57-a182-e9ac7660d9d9")
    public void setHwMemory_Instance_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Instance_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f503def9-0c28-4665-a1a6-6f7faa0daea5")
    public void setHwMemory_Instance_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Instance_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("86a87ba5-59da-4e4a-9525-c061ba613bc9")
    public void setHwMemory_Instance_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Instance_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b5aee056-8ad8-4e26-acec-c144db38fcac")
    public void setHwMemory_Instance_throughput(final String value) {
        this.elt.putTagValue(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Instance_timings'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("94fa6355-ddc0-4e40-a6ea-8d6efaf93261")
    public void setHwMemory_Instance_timings(final List<String> values) {
        this.elt.putTagValues(HwMemoryInstance.MdaTypes.HWMEMORY_INSTANCE_TIMINGS_TAGTYPE_ELT, values);
    }

    @objid ("9fa787d0-773e-4c9d-b82a-f7fe2a4f3719")
    protected HwMemoryInstance(final Instance elt) {
        super(elt);
    }

    @objid ("5f618543-2df6-4348-bd46-d69d36d3efc4")
    public static final class MdaTypes {
        @objid ("105214fb-c8ca-4be1-b31b-f4866dacecbe")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fee6507e-dbfb-465e-a2d0-877dd7338210")
        public static TagType HWMEMORY_INSTANCE_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("2bb9aad7-546c-45cf-8da1-9556563212bd")
        public static TagType HWMEMORY_INSTANCE_ADRESSSIZE_TAGTYPE_ELT;

        @objid ("87b9b319-b87c-4161-9da6-6c2fe37cbb87")
        public static TagType HWMEMORY_INSTANCE_TIMINGS_TAGTYPE_ELT;

        @objid ("0ad8e1bd-4dee-4561-8488-52ed4b570578")
        public static TagType HWMEMORY_INSTANCE_THROUGHPUT_TAGTYPE_ELT;

        @objid ("74988159-edd2-4c1c-9cfe-bd8725f0f58f")
        public static TagType HWMEMORY_INSTANCE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("32bda70f-3b0a-47be-af49-f887c6016ba7")
        public static TagType HWMEMORY_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("1339aa9e-525b-4371-9c44-d0fef5679e90")
        public static TagType HWMEMORY_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("dfc6c542-2f57-4981-9981-70d4f71d23bf")
        public static TagType HWMEMORY_INSTANCE_OWNEDHW_TAGTYPE_ELT;

        @objid ("fc26ba39-6495-4bd5-9810-a058df1e7cfc")
        public static TagType HWMEMORY_INSTANCE_FREQUENCY_TAGTYPE_ELT;

        @objid ("827c4017-c73d-4bf5-896a-25ac31ddebb2")
        public static TagType HWMEMORY_INSTANCE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("69322413-09af-436f-ad74-d29c65d9fbfe")
        private static Stereotype MDAASSOCDEP;

        @objid ("bbfef076-95ad-46ba-b249-4541e3de40e7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0b1cd1e4-537c-4c79-b775-1380249afe48")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "014af087-0ccf-11df-8525-001302895b2b");
            HWMEMORY_INSTANCE_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014d52d9-0ccf-11df-8525-001302895b2b");
            HWMEMORY_INSTANCE_ADRESSSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014d52e0-0ccf-11df-8525-001302895b2b");
            HWMEMORY_INSTANCE_TIMINGS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014fb529-0ccf-11df-8525-001302895b2b");
            HWMEMORY_INSTANCE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014fb530-0ccf-11df-8525-001302895b2b");
            HWMEMORY_INSTANCE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b5dd6002-162d-11df-b9be-0014222a9f79");
            HWMEMORY_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b5dd6003-162d-11df-b9be-0014222a9f79");
            HWMEMORY_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b5dd6004-162d-11df-b9be-0014222a9f79");
            HWMEMORY_INSTANCE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b5dd6005-162d-11df-b9be-0014222a9f79");
            HWMEMORY_INSTANCE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b5dd6006-162d-11df-b9be-0014222a9f79");
            HWMEMORY_INSTANCE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "09ce3319-170f-11df-b92a-0014222a9f79");
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
