/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.StorageResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwStorageManager_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwStorageManagerAssociation extends StorageResourceAssociation {
    public static final String STEREOTYPE_NAME = "HwStorageManager_Association";

    public static final String HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION_TAGTYPE = "HwStorageManager_Association_description";

    public static final String HWSTORAGEMANAGER_ASSOCIATION_ENDPOINTS_TAGTYPE = "HwStorageManager_Association_endPoints";

    public static final String HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY_TAGTYPE = "HwStorageManager_Association_frequency";

    public static final String HWSTORAGEMANAGER_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE = "HwStorageManager_Association_managedMemories";

    public static final String HWSTORAGEMANAGER_ASSOCIATION_OWNEDHW_TAGTYPE = "HwStorageManager_Association_ownedHW";

    public static final String HWSTORAGEMANAGER_ASSOCIATION_P_HW_SERVICES_TAGTYPE = "HwStorageManager_Association_p_HW_Services";

    public static final String HWSTORAGEMANAGER_ASSOCIATION_R_HW_SERVICES_TAGTYPE = "HwStorageManager_Association_r_HW_Services";

    /**
     * Tells whether a {@link HwStorageManagerAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwStorageManager_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwStorageManager_Association >> then instantiate a {@link HwStorageManagerAssociation} proxy.
     * 
     * @return a {@link HwStorageManagerAssociation} proxy on the created {@link Association}.
     */
    public static HwStorageManagerAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerAssociation.STEREOTYPE_NAME);
        return HwStorageManagerAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerAssociation} proxy from a {@link Association} stereotyped << HwStorageManager_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwStorageManagerAssociation} proxy or <i>null</i>.
     */
    public static HwStorageManagerAssociation instantiate(final Association obj) {
        return HwStorageManagerAssociation.canInstantiate(obj) ? new HwStorageManagerAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerAssociation} proxy from a {@link Association} stereotyped << HwStorageManager_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwStorageManagerAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwStorageManagerAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwStorageManagerAssociation.canInstantiate(obj))
        	return new HwStorageManagerAssociation(obj);
        else
        	throw new IllegalArgumentException("HwStorageManagerAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwStorageManagerAssociation other = (HwStorageManagerAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwStorageManager_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwStorageManager_Association_description() {
        return this.elt.getTagValue(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Association_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_Association_endPoints() {
        return this.elt.getTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwStorageManager_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwStorageManager_Association_frequency() {
        return this.elt.getTagValue(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Association_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_Association_managedMemories() {
        return this.elt.getTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Association_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_Association_ownedHW() {
        return this.elt.getTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Association_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_Association_p_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Association_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_Association_r_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwStorageManager_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Association_description(final String value) {
        this.elt.putTagValue(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Association_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Association_endPoints(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwStorageManager_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Association_frequency(final String value) {
        this.elt.putTagValue(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Association_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Association_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Association_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Association_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Association_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Association_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Association_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Association_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwStorageManagerAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_ASSOCIATION_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1f54bce4-10b3-11df-81d9-0014222a9f79");
            HWSTORAGEMANAGER_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f54bce5-10b3-11df-81d9-0014222a9f79");
            HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b67f9e40-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b67f9e41-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b67f9e42-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_ASSOCIATION_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b67f9e43-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b67f9e44-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4ae470e9-1710-11df-b92a-0014222a9f79");
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
