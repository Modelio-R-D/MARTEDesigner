/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.link;

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
 * Proxy class to handle a {@link Link} with << HwStorageManager_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c787dd95-4720-429e-82ea-8e1e1b74cc80")
public class HwStorageManagerLink extends StorageResourceLink {
    @objid ("edd8d074-5ded-4a71-8049-b865f2cff086")
    public static final String STEREOTYPE_NAME = "HwStorageManager_Link";

    @objid ("fd661080-79aa-4e77-b306-feca4bb597f6")
    public static final String HWSTORAGEMANAGER_LINK_DESCRIPTION_TAGTYPE = "HwStorageManager_Link_description";

    @objid ("8c80f72d-946d-40f0-8250-85ca3d5a847e")
    public static final String HWSTORAGEMANAGER_LINK_ENDPOINTS_TAGTYPE = "HwStorageManager_Link_endPoints";

    @objid ("156a95af-c1f8-4af3-87f4-80198b90a209")
    public static final String HWSTORAGEMANAGER_LINK_FREQUENCY_TAGTYPE = "HwStorageManager_Link_frequency";

    @objid ("86bd0956-367c-4b11-be74-46dadf34443d")
    public static final String HWSTORAGEMANAGER_LINK_MANAGEDMEMORIES_TAGTYPE = "HwStorageManager_Link_managedMemories";

    @objid ("ae512e2c-c33a-4d45-9247-4aa475022355")
    public static final String HWSTORAGEMANAGER_LINK_OWNEDHW_TAGTYPE = "HwStorageManager_Link_ownedHW";

    @objid ("19ae4510-5e12-4e91-b99e-badf16b6e34c")
    public static final String HWSTORAGEMANAGER_LINK_P_HW_SERVICES_TAGTYPE = "HwStorageManager_Link_p_HW_Services";

    @objid ("f13e4581-35cf-4020-a8ae-63f29f908fed")
    public static final String HWSTORAGEMANAGER_LINK_R_HW_SERVICES_TAGTYPE = "HwStorageManager_Link_r_HW_Services";

    /**
     * Tells whether a {@link HwStorageManagerLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwStorageManager_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("aa4fbc7a-33fa-4881-85d1-967586363d61")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwStorageManager_Link >> then instantiate a {@link HwStorageManagerLink} proxy.
     * 
     * @return a {@link HwStorageManagerLink} proxy on the created {@link Link}.
     */
    @objid ("c7031149-534c-4f2e-80d2-6d26127f15cf")
    public static HwStorageManagerLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerLink.STEREOTYPE_NAME);
        return HwStorageManagerLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerLink} proxy from a {@link Link} stereotyped << HwStorageManager_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwStorageManagerLink} proxy or <i>null</i>.
     */
    @objid ("1ffedb06-2e0c-44e6-93fb-da18334db758")
    public static HwStorageManagerLink instantiate(final Link obj) {
        return HwStorageManagerLink.canInstantiate(obj) ? new HwStorageManagerLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerLink} proxy from a {@link Link} stereotyped << HwStorageManager_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwStorageManagerLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bdd17df0-3cf5-4b60-a276-e91e940f280d")
    public static HwStorageManagerLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwStorageManagerLink.canInstantiate(obj))
        	return new HwStorageManagerLink(obj);
        else
        	throw new IllegalArgumentException("HwStorageManagerLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2a5a0581-48e8-4f91-adf9-0510859ca34c")
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
        HwStorageManagerLink other = (HwStorageManagerLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("54552548-503b-487d-92ba-dcf6d6e3b5d3")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwStorageManager_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e9a28cb3-f111-45fb-9a67-82159bff6209")
    public String getHwStorageManager_Link_description() {
        return this.elt.getTagValue(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Link_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("023427f2-354a-406a-a827-933adfd37b8f")
    public List<String> getHwStorageManager_Link_endPoints() {
        return this.elt.getTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwStorageManager_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5319306d-071a-4f26-ad2e-e9e195a42681")
    public String getHwStorageManager_Link_frequency() {
        return this.elt.getTagValue(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Link_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1de55dfb-7299-40c5-8f9b-da59248eb626")
    public List<String> getHwStorageManager_Link_managedMemories() {
        return this.elt.getTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Link_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c0c9cf84-aeb8-4e7f-98df-0236f7a5e9c8")
    public List<String> getHwStorageManager_Link_ownedHW() {
        return this.elt.getTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Link_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3b0214c6-e3ee-415e-a054-80956b438812")
    public List<String> getHwStorageManager_Link_p_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Link_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4eacf24c-d004-41d8-a926-601111eb6e95")
    public List<String> getHwStorageManager_Link_r_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("d4a5221d-567c-43fe-a883-deb78c86dbcb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwStorageManager_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d6c16e64-4138-4d5b-8aea-2ec15ba7d5e8")
    public void setHwStorageManager_Link_description(final String value) {
        this.elt.putTagValue(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Link_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e21c75bf-678b-43d0-a4a7-1f2b0d1f50b3")
    public void setHwStorageManager_Link_endPoints(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwStorageManager_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0f62d3da-5460-4994-bc79-e9252d5d4aac")
    public void setHwStorageManager_Link_frequency(final String value) {
        this.elt.putTagValue(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Link_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d56aabbb-ca46-4bc2-945d-fe156f02c1b1")
    public void setHwStorageManager_Link_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Link_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("042834ad-b743-4ef7-b7bb-39f4bdcbc4dc")
    public void setHwStorageManager_Link_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Link_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21849a5e-f8dc-4aff-9bf9-0588bdbcfbd3")
    public void setHwStorageManager_Link_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Link_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8ee61a39-2c31-4352-820d-4437217c7528")
    public void setHwStorageManager_Link_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("51fe31e6-2f0b-4e73-bc72-3f04e025b595")
    protected HwStorageManagerLink(final Link elt) {
        super(elt);
    }

    @objid ("792beefe-c4ab-4949-a1c8-0c9e0e4862a5")
    public static final class MdaTypes {
        @objid ("4d8c7798-99c0-42d1-90f1-57d91937b3dc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4980f96f-3d6e-4e43-a434-c75399f45887")
        public static TagType HWSTORAGEMANAGER_LINK_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("32d8670b-4a57-4c86-9382-19abec7c25f5")
        public static TagType HWSTORAGEMANAGER_LINK_DESCRIPTION_TAGTYPE_ELT;

        @objid ("d44d97e4-d1aa-4f23-b01d-075d7e4711f3")
        public static TagType HWSTORAGEMANAGER_LINK_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("6ed9e4bd-1959-4e55-bbb3-c90063bcd21b")
        public static TagType HWSTORAGEMANAGER_LINK_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("ea124c14-4ff0-4fa0-affc-9923da289909")
        public static TagType HWSTORAGEMANAGER_LINK_OWNEDHW_TAGTYPE_ELT;

        @objid ("9ab4a6c1-adc7-4389-a392-07f80fe10f78")
        public static TagType HWSTORAGEMANAGER_LINK_FREQUENCY_TAGTYPE_ELT;

        @objid ("20b8e739-4a46-4b0a-a6ac-23ad7add6bc3")
        public static TagType HWSTORAGEMANAGER_LINK_ENDPOINTS_TAGTYPE_ELT;

        @objid ("ce2228a4-59d4-4f59-ae61-9a9585665102")
        private static Stereotype MDAASSOCDEP;

        @objid ("92966aab-8760-40d7-9019-3e175d4f82e2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b62384c3-6f37-41bf-b7ab-3e151fa66a06")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "017115a6-0ccf-11df-8525-001302895b2b");
            HWSTORAGEMANAGER_LINK_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017377f9-0ccf-11df-8525-001302895b2b");
            HWSTORAGEMANAGER_LINK_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3d81dd4-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_LINK_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3d81dd5-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_LINK_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3da8030-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_LINK_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3da8031-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_LINK_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3da8032-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_LINK_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "47b9ceb9-1710-11df-b92a-0014222a9f79");
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
