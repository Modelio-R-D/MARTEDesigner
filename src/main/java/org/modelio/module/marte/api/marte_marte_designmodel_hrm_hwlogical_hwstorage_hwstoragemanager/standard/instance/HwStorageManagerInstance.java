/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.instance;

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
 * Proxy class to handle a {@link Instance} with << HwStorageManager_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ea7a67a0-7804-49d0-8d84-17a70edf6ee5")
public class HwStorageManagerInstance extends StorageResourceInstance {
    @objid ("586934f8-62c4-42f5-8dbf-0a29cf61395c")
    public static final String STEREOTYPE_NAME = "HwStorageManager_Instance";

    @objid ("46736b1a-be22-4244-917e-fa0db22da3f1")
    public static final String HWSTORAGEMANAGER_INSTANCE_DESCRIPTION_TAGTYPE = "HwStorageManager_Instance_description";

    @objid ("c20263ed-4728-4bc9-9b39-8fa6c3e6ac67")
    public static final String HWSTORAGEMANAGER_INSTANCE_ENDPOINTS_TAGTYPE = "HwStorageManager_Instance_endPoints";

    @objid ("d0c91b82-ebc4-4b3c-9c09-2a81947dc2f7")
    public static final String HWSTORAGEMANAGER_INSTANCE_FREQUENCY_TAGTYPE = "HwStorageManager_Instance_frequency";

    @objid ("4e8d607b-1c77-45e5-8fe3-adac32d17c83")
    public static final String HWSTORAGEMANAGER_INSTANCE_MANAGEDMEMORIES_TAGTYPE = "HwStorageManager_Instance_managedMemories";

    @objid ("a411c17f-1e2b-496c-84a3-c44f951986ff")
    public static final String HWSTORAGEMANAGER_INSTANCE_OWNEDHW_TAGTYPE = "HwStorageManager_Instance_ownedHW";

    @objid ("d470402b-b6fa-462f-9cf1-ed7982f8f216")
    public static final String HWSTORAGEMANAGER_INSTANCE_P_HW_SERVICES_TAGTYPE = "HwStorageManager_Instance_p_HW_Services";

    @objid ("cba97f0b-8c97-4f60-b4b2-2871611250d2")
    public static final String HWSTORAGEMANAGER_INSTANCE_R_HW_SERVICES_TAGTYPE = "HwStorageManager_Instance_r_HW_Services";

    /**
     * Tells whether a {@link HwStorageManagerInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwStorageManager_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3417f6f7-e77b-4607-b2d7-a41838ad5634")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwStorageManager_Instance >> then instantiate a {@link HwStorageManagerInstance} proxy.
     * 
     * @return a {@link HwStorageManagerInstance} proxy on the created {@link Instance}.
     */
    @objid ("f27e0809-5b93-4ae7-a0a8-a9fa60957273")
    public static HwStorageManagerInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerInstance.STEREOTYPE_NAME);
        return HwStorageManagerInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerInstance} proxy from a {@link Instance} stereotyped << HwStorageManager_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwStorageManagerInstance} proxy or <i>null</i>.
     */
    @objid ("a490c580-ca82-4b31-b8ae-80df51bd2ec9")
    public static HwStorageManagerInstance instantiate(final Instance obj) {
        return HwStorageManagerInstance.canInstantiate(obj) ? new HwStorageManagerInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerInstance} proxy from a {@link Instance} stereotyped << HwStorageManager_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwStorageManagerInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ae107bdc-6d77-47d6-9529-677590e8638d")
    public static HwStorageManagerInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwStorageManagerInstance.canInstantiate(obj))
        	return new HwStorageManagerInstance(obj);
        else
        	throw new IllegalArgumentException("HwStorageManagerInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6ab1a2ff-f093-46a4-9e84-f3c96bd66031")
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
        HwStorageManagerInstance other = (HwStorageManagerInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("86f9e7e6-7808-49b3-b294-97e85f7aa8c6")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwStorageManager_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ddc4d68c-2c4e-4791-b1bc-93240f4495a5")
    public String getHwStorageManager_Instance_description() {
        return this.elt.getTagValue(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Instance_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("30a322ad-5894-40ac-92e1-7e98ddb41807")
    public List<String> getHwStorageManager_Instance_endPoints() {
        return this.elt.getTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwStorageManager_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("811b726d-6958-4f2d-b91e-86e908104dd0")
    public String getHwStorageManager_Instance_frequency() {
        return this.elt.getTagValue(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Instance_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("898098e8-43a8-47aa-b0b0-2507c7145230")
    public List<String> getHwStorageManager_Instance_managedMemories() {
        return this.elt.getTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Instance_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2effc0b1-fa00-45a0-9924-6344f65f655a")
    public List<String> getHwStorageManager_Instance_ownedHW() {
        return this.elt.getTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Instance_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a39f2468-1ce3-422c-a875-e7b8caaa103f")
    public List<String> getHwStorageManager_Instance_p_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Instance_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ac5809dc-a1f4-4e69-88ce-8f92899d9a0a")
    public List<String> getHwStorageManager_Instance_r_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("ee51c5d4-e84c-429b-b82e-b5e3e6d5f883")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwStorageManager_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("77073a9c-ed95-4c1f-ac31-8f8ced6a7021")
    public void setHwStorageManager_Instance_description(final String value) {
        this.elt.putTagValue(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Instance_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("52fb50f1-f8df-4ed0-9474-704e53cd6bf0")
    public void setHwStorageManager_Instance_endPoints(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwStorageManager_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9ee79bfa-4178-46e7-9bcf-a32bf7b5d321")
    public void setHwStorageManager_Instance_frequency(final String value) {
        this.elt.putTagValue(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Instance_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fc968bf7-6e64-4079-92c3-f37da0b4cb01")
    public void setHwStorageManager_Instance_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Instance_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ef0bf454-33fe-4409-b340-545a228e3fa2")
    public void setHwStorageManager_Instance_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Instance_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d7035a51-f58e-435a-b0e5-5b6d25cea028")
    public void setHwStorageManager_Instance_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Instance_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8f7be609-1d74-49e1-bcdb-bc3740de20c3")
    public void setHwStorageManager_Instance_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("49ba80ec-0f24-41f2-89b5-e2e95ac98a79")
    protected HwStorageManagerInstance(final Instance elt) {
        super(elt);
    }

    @objid ("eaf25117-4832-408f-a282-5d18d26f6a6b")
    public static final class MdaTypes {
        @objid ("de2a72c1-4ad1-4889-a5f1-b285314cc5f8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e8e465d7-6af7-43cb-a53c-6678ee60717a")
        public static TagType HWSTORAGEMANAGER_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("937ea556-ed5d-43bf-b46a-4e8344d2d56c")
        public static TagType HWSTORAGEMANAGER_INSTANCE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("20d115db-e1d1-4df4-94e2-23e8caf591ad")
        public static TagType HWSTORAGEMANAGER_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("4f911185-2acf-4e8c-bf70-15f4d3b96d6c")
        public static TagType HWSTORAGEMANAGER_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("27cbd28e-226c-4752-8554-c3bca4b7587b")
        public static TagType HWSTORAGEMANAGER_INSTANCE_OWNEDHW_TAGTYPE_ELT;

        @objid ("4fb7cc6b-e783-47ca-a36c-4cabf5723b6c")
        public static TagType HWSTORAGEMANAGER_INSTANCE_FREQUENCY_TAGTYPE_ELT;

        @objid ("af08af76-60c2-4fc3-93d3-b6b6fbab6ec0")
        public static TagType HWSTORAGEMANAGER_INSTANCE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("59017631-3428-414f-b482-de1d6213b8de")
        private static Stereotype MDAASSOCDEP;

        @objid ("0d6fd1eb-4cd5-4069-a5dc-ff503a0fc726")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0b95bc92-c32a-4ea2-8bb4-1c0f5b7e52a7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "017115a7-0ccf-11df-8525-001302895b2b");
            HWSTORAGEMANAGER_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017377fa-0ccf-11df-8525-001302895b2b");
            HWSTORAGEMANAGER_INSTANCE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b5985964-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b5985965-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b5985966-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_INSTANCE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b5985967-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_INSTANCE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b5985968-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_INSTANCE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "49dbcb05-1710-11df-b92a-0014222a9f79");
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
