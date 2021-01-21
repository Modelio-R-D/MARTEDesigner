/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.StorageResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwMemory_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d3a01a46-6dd3-4e68-a259-cc9da7da0505")
public class HwMemoryLink extends StorageResourceLink {
    @objid ("03a2d212-4e68-4a89-b495-cd90de27d58b")
    public static final String STEREOTYPE_NAME = "HwMemory_Link";

    @objid ("36d2d112-dab7-4532-aa41-0f4ae07f0085")
    public static final String HWMEMORY_LINK_ADRESSSIZE_TAGTYPE = "HwMemory_Link_adressSize";

    @objid ("c94254e6-1f48-42dd-9672-b40cfe9b55e6")
    public static final String HWMEMORY_LINK_DESCRIPTION_TAGTYPE = "HwMemory_Link_description";

    @objid ("250d71d3-39d3-4f21-b80b-1e0e95fbd614")
    public static final String HWMEMORY_LINK_ENDPOINTS_TAGTYPE = "HwMemory_Link_endPoints";

    @objid ("9a5ac388-8d55-44de-89e1-428604d14baf")
    public static final String HWMEMORY_LINK_FREQUENCY_TAGTYPE = "HwMemory_Link_frequency";

    @objid ("50a7f918-324f-4f2f-8288-a3568f73257c")
    public static final String HWMEMORY_LINK_MEMORYSIZE_TAGTYPE = "HwMemory_Link_memorySize";

    @objid ("786dda3a-8bb3-4851-ba40-10bcb6ace7f3")
    public static final String HWMEMORY_LINK_OWNEDHW_TAGTYPE = "HwMemory_Link_ownedHW";

    @objid ("e12ed37a-d1fe-422b-b701-d5d27cb127fe")
    public static final String HWMEMORY_LINK_P_HW_SERVICES_TAGTYPE = "HwMemory_Link_p_HW_Services";

    @objid ("5eec5c7c-b964-4d15-a200-637ac1d45a77")
    public static final String HWMEMORY_LINK_R_HW_SERVICES_TAGTYPE = "HwMemory_Link_r_HW_Services";

    @objid ("39d84757-43b5-446b-bbe4-afc0c4fb4233")
    public static final String HWMEMORY_LINK_THROUGHPUT_TAGTYPE = "HwMemory_Link_throughput";

    @objid ("e58bcd99-7b89-495d-a083-825d5c8fcf1d")
    public static final String HWMEMORY_LINK_TIMINGS_TAGTYPE = "HwMemory_Link_timings";

    /**
     * Tells whether a {@link HwMemoryLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwMemory_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2511e313-e19e-4f62-95c7-d7932936e66c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwMemory_Link >> then instantiate a {@link HwMemoryLink} proxy.
     * 
     * @return a {@link HwMemoryLink} proxy on the created {@link Link}.
     */
    @objid ("fed97ee0-67c8-48fe-bede-7f1808a15733")
    public static HwMemoryLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryLink.STEREOTYPE_NAME);
        return HwMemoryLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwMemoryLink} proxy from a {@link Link} stereotyped << HwMemory_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwMemoryLink} proxy or <i>null</i>.
     */
    @objid ("d49bb95b-16e1-4b77-828c-f3a34c5f84ae")
    public static HwMemoryLink instantiate(final Link obj) {
        return HwMemoryLink.canInstantiate(obj) ? new HwMemoryLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMemoryLink} proxy from a {@link Link} stereotyped << HwMemory_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwMemoryLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("82deca23-ba09-4ce7-8ed2-c43b992b4b22")
    public static HwMemoryLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwMemoryLink.canInstantiate(obj))
        	return new HwMemoryLink(obj);
        else
        	throw new IllegalArgumentException("HwMemoryLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6d5db377-62e7-4bbe-8b5a-1a1c689c18af")
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
        HwMemoryLink other = (HwMemoryLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("d2a1ad0e-1a55-424d-855b-1fad90b6dde6")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwMemory_Link_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("22e1161a-1f16-4371-ba2f-a6c85ce4c45c")
    public String getHwMemory_Link_adressSize() {
        return this.elt.getTagValue(HwMemoryLink.MdaTypes.HWMEMORY_LINK_ADRESSSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e941ea8-2ceb-4c4c-9410-b7d44bc6a654")
    public String getHwMemory_Link_description() {
        return this.elt.getTagValue(HwMemoryLink.MdaTypes.HWMEMORY_LINK_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Link_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d3f64046-6e80-464e-b65b-1e30f8bafecd")
    public List<String> getHwMemory_Link_endPoints() {
        return this.elt.getTagValues(HwMemoryLink.MdaTypes.HWMEMORY_LINK_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("86745471-b3ad-48ed-a707-093143d712c0")
    public String getHwMemory_Link_frequency() {
        return this.elt.getTagValue(HwMemoryLink.MdaTypes.HWMEMORY_LINK_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Link_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6a1b9e19-7752-4b13-915c-70689bc476b5")
    public String getHwMemory_Link_memorySize() {
        return this.elt.getTagValue(HwMemoryLink.MdaTypes.HWMEMORY_LINK_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Link_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("62f84b25-126b-4889-b760-733ec40905dd")
    public List<String> getHwMemory_Link_ownedHW() {
        return this.elt.getTagValues(HwMemoryLink.MdaTypes.HWMEMORY_LINK_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Link_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("665dc311-015f-46a8-a31d-877decfb1d22")
    public List<String> getHwMemory_Link_p_HW_Services() {
        return this.elt.getTagValues(HwMemoryLink.MdaTypes.HWMEMORY_LINK_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Link_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f419be8f-d730-44f4-8815-678121e4ce35")
    public List<String> getHwMemory_Link_r_HW_Services() {
        return this.elt.getTagValues(HwMemoryLink.MdaTypes.HWMEMORY_LINK_R_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Link_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e1df30b1-3a5a-46e8-9441-50183a90bf6f")
    public String getHwMemory_Link_throughput() {
        return this.elt.getTagValue(HwMemoryLink.MdaTypes.HWMEMORY_LINK_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Link_timings'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dc983083-215d-45dd-88c1-295c00108f04")
    public List<String> getHwMemory_Link_timings() {
        return this.elt.getTagValues(HwMemoryLink.MdaTypes.HWMEMORY_LINK_TIMINGS_TAGTYPE_ELT);
    }

    @objid ("255ce1c0-fa0c-4b29-ad10-e37622d4a3d5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwMemory_Link_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8a90ed68-158a-43d2-8cc1-00542531eedd")
    public void setHwMemory_Link_adressSize(final String value) {
        this.elt.putTagValue(HwMemoryLink.MdaTypes.HWMEMORY_LINK_ADRESSSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("819ceec8-8681-4870-93dd-d4a71adbce38")
    public void setHwMemory_Link_description(final String value) {
        this.elt.putTagValue(HwMemoryLink.MdaTypes.HWMEMORY_LINK_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Link_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a535f80a-b8aa-4271-a572-e89a9c037ee0")
    public void setHwMemory_Link_endPoints(final List<String> values) {
        this.elt.putTagValues(HwMemoryLink.MdaTypes.HWMEMORY_LINK_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4189b9e8-2422-427f-bf76-b27c553cebb8")
    public void setHwMemory_Link_frequency(final String value) {
        this.elt.putTagValue(HwMemoryLink.MdaTypes.HWMEMORY_LINK_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Link_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("275ef44d-cd62-405c-b9ad-f8c814bbe6f1")
    public void setHwMemory_Link_memorySize(final String value) {
        this.elt.putTagValue(HwMemoryLink.MdaTypes.HWMEMORY_LINK_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Link_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("37c64fa2-c572-4027-9568-ddda05413b01")
    public void setHwMemory_Link_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwMemoryLink.MdaTypes.HWMEMORY_LINK_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Link_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9527a944-dac1-44fb-ba04-5d9001eac98e")
    public void setHwMemory_Link_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryLink.MdaTypes.HWMEMORY_LINK_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Link_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("35537898-5825-4c65-ac9b-96c142e57074")
    public void setHwMemory_Link_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryLink.MdaTypes.HWMEMORY_LINK_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Link_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("47b3bfae-8d66-4af6-8cef-67c057bf9be6")
    public void setHwMemory_Link_throughput(final String value) {
        this.elt.putTagValue(HwMemoryLink.MdaTypes.HWMEMORY_LINK_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Link_timings'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c6722f5-0f8f-446d-ae01-aa8cede5c0df")
    public void setHwMemory_Link_timings(final List<String> values) {
        this.elt.putTagValues(HwMemoryLink.MdaTypes.HWMEMORY_LINK_TIMINGS_TAGTYPE_ELT, values);
    }

    @objid ("3de93fa7-7dee-4773-8f7b-d296225825c0")
    protected HwMemoryLink(final Link elt) {
        super(elt);
    }

    @objid ("930f18da-68c2-481a-978d-b2a542ee618e")
    public static final class MdaTypes {
        @objid ("b31dc74d-2a23-48c8-9fc5-688e0c6856e3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ec2faf20-8928-4e7d-84b7-9e124b95390f")
        public static TagType HWMEMORY_LINK_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("c8e88c70-e00c-4e2f-a5c6-65f875958a20")
        public static TagType HWMEMORY_LINK_ADRESSSIZE_TAGTYPE_ELT;

        @objid ("b061d01b-4484-4641-b7a3-6aefefb9e474")
        public static TagType HWMEMORY_LINK_TIMINGS_TAGTYPE_ELT;

        @objid ("136aa2b7-ef93-48a3-85ae-e56c9d913198")
        public static TagType HWMEMORY_LINK_THROUGHPUT_TAGTYPE_ELT;

        @objid ("ab40692a-c786-44c1-9db9-1726b07653dc")
        public static TagType HWMEMORY_LINK_DESCRIPTION_TAGTYPE_ELT;

        @objid ("2b8e6a68-f118-4cfb-8d32-7ba28bf167b1")
        public static TagType HWMEMORY_LINK_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("8c109ddb-728a-4bef-9a0c-7d90d09e69bf")
        public static TagType HWMEMORY_LINK_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("fa5dc12c-2b3c-40ce-9104-491a77293aad")
        public static TagType HWMEMORY_LINK_OWNEDHW_TAGTYPE_ELT;

        @objid ("70ae1cf4-786e-4af6-9b4f-70bdcda596db")
        public static TagType HWMEMORY_LINK_FREQUENCY_TAGTYPE_ELT;

        @objid ("397d72d6-a7cf-4bf8-8ab8-6e3e8f672f4f")
        public static TagType HWMEMORY_LINK_ENDPOINTS_TAGTYPE_ELT;

        @objid ("dd4f24db-25e9-4eaf-940a-8e492b02c86e")
        private static Stereotype MDAASSOCDEP;

        @objid ("6000e052-34f0-4082-a23a-da5f0a0aa78e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d85d356e-b9b2-4615-b3e6-eb72ecdb1319")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "014af086-0ccf-11df-8525-001302895b2b");
            HWMEMORY_LINK_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014d52d8-0ccf-11df-8525-001302895b2b");
            HWMEMORY_LINK_ADRESSSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014d52df-0ccf-11df-8525-001302895b2b");
            HWMEMORY_LINK_TIMINGS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014fb528-0ccf-11df-8525-001302895b2b");
            HWMEMORY_LINK_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014fb52f-0ccf-11df-8525-001302895b2b");
            HWMEMORY_LINK_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3df271a-162d-11df-b9be-0014222a9f79");
            HWMEMORY_LINK_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3df271b-162d-11df-b9be-0014222a9f79");
            HWMEMORY_LINK_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3df271c-162d-11df-b9be-0014222a9f79");
            HWMEMORY_LINK_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3df271d-162d-11df-b9be-0014222a9f79");
            HWMEMORY_LINK_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3df271e-162d-11df-b9be-0014222a9f79");
            HWMEMORY_LINK_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "07d983a1-170f-11df-b92a-0014222a9f79");
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
