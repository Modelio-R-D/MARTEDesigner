/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public class HwStorageManagerInstance extends StorageResourceInstance {
    public static final String STEREOTYPE_NAME = "HwStorageManager_Instance";

    public static final String HWSTORAGEMANAGER_INSTANCE_DESCRIPTION_TAGTYPE = "HwStorageManager_Instance_description";

    public static final String HWSTORAGEMANAGER_INSTANCE_ENDPOINTS_TAGTYPE = "HwStorageManager_Instance_endPoints";

    public static final String HWSTORAGEMANAGER_INSTANCE_FREQUENCY_TAGTYPE = "HwStorageManager_Instance_frequency";

    public static final String HWSTORAGEMANAGER_INSTANCE_MANAGEDMEMORIES_TAGTYPE = "HwStorageManager_Instance_managedMemories";

    public static final String HWSTORAGEMANAGER_INSTANCE_OWNEDHW_TAGTYPE = "HwStorageManager_Instance_ownedHW";

    public static final String HWSTORAGEMANAGER_INSTANCE_P_HW_SERVICES_TAGTYPE = "HwStorageManager_Instance_p_HW_Services";

    public static final String HWSTORAGEMANAGER_INSTANCE_R_HW_SERVICES_TAGTYPE = "HwStorageManager_Instance_r_HW_Services";

    /**
     * Tells whether a {@link HwStorageManagerInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwStorageManager_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwStorageManager_Instance >> then instantiate a {@link HwStorageManagerInstance} proxy.
     * 
     * @return a {@link HwStorageManagerInstance} proxy on the created {@link Instance}.
     */
    public static HwStorageManagerInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerInstance.STEREOTYPE_NAME);
        return HwStorageManagerInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerInstance} proxy from a {@link Instance} stereotyped << HwStorageManager_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwStorageManagerInstance} proxy or <i>null</i>.
     */
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
    public static HwStorageManagerInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwStorageManagerInstance.canInstantiate(obj))
        	return new HwStorageManagerInstance(obj);
        else
        	throw new IllegalArgumentException("HwStorageManagerInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwStorageManagerInstance other = (HwStorageManagerInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwStorageManager_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwStorageManager_Instance_description() {
        return this.elt.getTagValue(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Instance_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_Instance_endPoints() {
        return this.elt.getTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwStorageManager_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwStorageManager_Instance_frequency() {
        return this.elt.getTagValue(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Instance_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_Instance_managedMemories() {
        return this.elt.getTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Instance_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_Instance_ownedHW() {
        return this.elt.getTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Instance_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_Instance_p_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Instance_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_Instance_r_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwStorageManager_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Instance_description(final String value) {
        this.elt.putTagValue(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Instance_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Instance_endPoints(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwStorageManager_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Instance_frequency(final String value) {
        this.elt.putTagValue(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Instance_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Instance_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Instance_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Instance_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Instance_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Instance_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Instance_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Instance_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerInstance.MdaTypes.HWSTORAGEMANAGER_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwStorageManagerInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_INSTANCE_MANAGEDMEMORIES_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_INSTANCE_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_INSTANCE_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_INSTANCE_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_INSTANCE_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
