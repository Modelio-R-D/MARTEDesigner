/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("8e18f321-c7db-4831-a6ab-416870c86465")
    public static final String STEREOTYPE_NAME = "HwStorageManager_Link";

    @objid ("280e34cc-38e7-431d-a3b3-f7711fcebfe4")
    public static final String HWSTORAGEMANAGER_LINK_DESCRIPTION_TAGTYPE = "HwStorageManager_Link_description";

    @objid ("464056ff-25aa-41e8-a08e-db33b2856b84")
    public static final String HWSTORAGEMANAGER_LINK_ENDPOINTS_TAGTYPE = "HwStorageManager_Link_endPoints";

    @objid ("249ce852-5e98-4fd3-95a7-4a42a18578cf")
    public static final String HWSTORAGEMANAGER_LINK_FREQUENCY_TAGTYPE = "HwStorageManager_Link_frequency";

    @objid ("5605f7c7-5a6b-4f32-b387-335d31de1722")
    public static final String HWSTORAGEMANAGER_LINK_MANAGEDMEMORIES_TAGTYPE = "HwStorageManager_Link_managedMemories";

    @objid ("84a3a338-d07a-4d72-87f2-f4514941471c")
    public static final String HWSTORAGEMANAGER_LINK_OWNEDHW_TAGTYPE = "HwStorageManager_Link_ownedHW";

    @objid ("b6bdb815-7264-453d-9878-3885a4beddb4")
    public static final String HWSTORAGEMANAGER_LINK_P_HW_SERVICES_TAGTYPE = "HwStorageManager_Link_p_HW_Services";

    @objid ("9ae6ab1a-7f72-4da0-8990-2a279d9e1fc5")
    public static final String HWSTORAGEMANAGER_LINK_R_HW_SERVICES_TAGTYPE = "HwStorageManager_Link_r_HW_Services";

    /**
     * Tells whether a {@link HwStorageManagerLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwStorageManager_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8c5563de-051c-4701-86f1-5e999b7be477")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwStorageManager_Link >> then instantiate a {@link HwStorageManagerLink} proxy.
     * 
     * @return a {@link HwStorageManagerLink} proxy on the created {@link Link}.
     */
    @objid ("1d32000a-e170-450c-bccc-58e8c817946d")
    public static HwStorageManagerLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerLink.STEREOTYPE_NAME);
        return HwStorageManagerLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerLink} proxy from a {@link Link} stereotyped << HwStorageManager_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwStorageManagerLink} proxy or <i>null</i>.
     */
    @objid ("7e1dc6cc-5edf-4b64-9208-d3ba0ec68b41")
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
    @objid ("351ef09a-e49c-4ac4-b700-06609f93a3d4")
    public static HwStorageManagerLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwStorageManagerLink.canInstantiate(obj))
        	return new HwStorageManagerLink(obj);
        else
        	throw new IllegalArgumentException("HwStorageManagerLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b402ea99-4964-4250-8107-e57482b5be28")
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
    @objid ("cd9af1a6-3b82-45a1-ab13-c069cf946e83")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwStorageManager_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a216f251-9c5a-4eb8-b664-68a2e09a2b86")
    public String getHwStorageManager_Link_description() {
        return this.elt.getTagValue(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Link_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bccae00b-bfef-4f11-8981-3d0927a5f920")
    public List<String> getHwStorageManager_Link_endPoints() {
        return this.elt.getTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwStorageManager_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b9a4f17b-dae7-4b73-9e8e-715c59925acf")
    public String getHwStorageManager_Link_frequency() {
        return this.elt.getTagValue(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Link_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fd15ee63-5a3b-4156-a412-6394d324891c")
    public List<String> getHwStorageManager_Link_managedMemories() {
        return this.elt.getTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Link_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7208d043-04f8-4637-a5e8-6024637e2d29")
    public List<String> getHwStorageManager_Link_ownedHW() {
        return this.elt.getTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Link_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4cffd3b6-1532-4970-9dd6-65d40b651a36")
    public List<String> getHwStorageManager_Link_p_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Link_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2f5f4c37-d11f-4f75-a64c-fde06efda775")
    public List<String> getHwStorageManager_Link_r_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("336bbbe9-36b7-432b-9637-15e498630ed6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwStorageManager_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5af3d308-3c92-4cbf-a190-dd488f3b80b8")
    public void setHwStorageManager_Link_description(final String value) {
        this.elt.putTagValue(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Link_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aa566f86-d28a-4251-9ea0-6bad6c90b800")
    public void setHwStorageManager_Link_endPoints(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwStorageManager_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5f1579ee-7d47-4c9e-b415-bb461197b934")
    public void setHwStorageManager_Link_frequency(final String value) {
        this.elt.putTagValue(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Link_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("180425d8-9119-4097-bae7-37db9fe7fa33")
    public void setHwStorageManager_Link_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Link_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fd504b12-dc59-4258-a969-7c4ea5774e2d")
    public void setHwStorageManager_Link_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Link_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a86a621-df0c-4c3a-9945-0c84953ebbaf")
    public void setHwStorageManager_Link_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Link_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9469b460-10e6-4871-a017-aceba4f8f3a3")
    public void setHwStorageManager_Link_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLink.MdaTypes.HWSTORAGEMANAGER_LINK_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("6156f009-7910-4cdf-8893-82552decd9ac")
    protected HwStorageManagerLink(final Link elt) {
        super(elt);
    }

    @objid ("792beefe-c4ab-4949-a1c8-0c9e0e4862a5")
    public static final class MdaTypes {
        @objid ("9fddbc6e-0107-4cc4-9656-68387b960fe8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f3508577-6759-4b94-9d53-2905a0d651b7")
        public static TagType HWSTORAGEMANAGER_LINK_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("d9355161-8cc5-4398-922e-bbcbbf5828c9")
        public static TagType HWSTORAGEMANAGER_LINK_DESCRIPTION_TAGTYPE_ELT;

        @objid ("0616a5f0-ba27-432e-9024-1a8394cb0de3")
        public static TagType HWSTORAGEMANAGER_LINK_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("edc2951c-bd8a-425e-a9cc-7b0199fa0605")
        public static TagType HWSTORAGEMANAGER_LINK_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("de3be769-d096-4336-9fa2-a5478b1580d2")
        public static TagType HWSTORAGEMANAGER_LINK_OWNEDHW_TAGTYPE_ELT;

        @objid ("fd86a99e-c908-4adb-8b83-d4a2a50a1ae6")
        public static TagType HWSTORAGEMANAGER_LINK_FREQUENCY_TAGTYPE_ELT;

        @objid ("877224c3-94bc-49ff-8ce0-08c39aeec515")
        public static TagType HWSTORAGEMANAGER_LINK_ENDPOINTS_TAGTYPE_ELT;

        @objid ("b70d99e9-97a8-4ef2-b75b-c9fa3bea39e1")
        private static Stereotype MDAASSOCDEP;

        @objid ("59c90d79-fef0-4b63-9cb6-449ec343896c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b6202b2b-0bd9-4bbb-90ef-13923ae2dcf0")
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
