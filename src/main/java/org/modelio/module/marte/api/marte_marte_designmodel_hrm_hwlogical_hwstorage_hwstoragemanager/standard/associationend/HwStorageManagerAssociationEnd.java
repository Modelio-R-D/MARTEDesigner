/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.StorageResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwStorageManager_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwStorageManagerAssociationEnd extends StorageResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "HwStorageManager_AssociationEnd";

    public static final String HWSTORAGEMANAGER_ASSOCIATIONEND_DESCRIPTION_TAGTYPE = "HwStorageManager_AssociationEnd_description";

    public static final String HWSTORAGEMANAGER_ASSOCIATIONEND_ENDPOINTS_TAGTYPE = "HwStorageManager_AssociationEnd_endPoints";

    public static final String HWSTORAGEMANAGER_ASSOCIATIONEND_FREQUENCY_TAGTYPE = "HwStorageManager_AssociationEnd_frequency";

    public static final String HWSTORAGEMANAGER_ASSOCIATIONEND_MANAGEDMEMORIES_TAGTYPE = "HwStorageManager_AssociationEnd_managedMemories";

    public static final String HWSTORAGEMANAGER_ASSOCIATIONEND_OWNEDHW_TAGTYPE = "HwStorageManager_AssociationEnd_ownedHW";

    public static final String HWSTORAGEMANAGER_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE = "HwStorageManager_AssociationEnd_p_HW_Services";

    public static final String HWSTORAGEMANAGER_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE = "HwStorageManager_AssociationEnd_r_HW_Services";

    /**
     * Tells whether a {@link HwStorageManagerAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwStorageManager_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwStorageManager_AssociationEnd >> then instantiate a {@link HwStorageManagerAssociationEnd} proxy.
     * 
     * @return a {@link HwStorageManagerAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static HwStorageManagerAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerAssociationEnd.STEREOTYPE_NAME);
        return HwStorageManagerAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwStorageManager_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwStorageManagerAssociationEnd} proxy or <i>null</i>.
     */
    public static HwStorageManagerAssociationEnd instantiate(final AssociationEnd obj) {
        return HwStorageManagerAssociationEnd.canInstantiate(obj) ? new HwStorageManagerAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwStorageManager_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwStorageManagerAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwStorageManagerAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwStorageManagerAssociationEnd.canInstantiate(obj))
        	return new HwStorageManagerAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwStorageManagerAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwStorageManagerAssociationEnd other = (HwStorageManagerAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwStorageManager_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwStorageManager_AssociationEnd_description() {
        return this.elt.getTagValue(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_AssociationEnd_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_AssociationEnd_endPoints() {
        return this.elt.getTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwStorageManager_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwStorageManager_AssociationEnd_frequency() {
        return this.elt.getTagValue(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_AssociationEnd_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_AssociationEnd_managedMemories() {
        return this.elt.getTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_AssociationEnd_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_AssociationEnd_ownedHW() {
        return this.elt.getTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_AssociationEnd_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_AssociationEnd_p_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_AssociationEnd_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_AssociationEnd_r_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwStorageManager_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_AssociationEnd_description(final String value) {
        this.elt.putTagValue(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_AssociationEnd_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_AssociationEnd_endPoints(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwStorageManager_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_AssociationEnd_frequency(final String value) {
        this.elt.putTagValue(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_AssociationEnd_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_AssociationEnd_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_AssociationEnd_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_AssociationEnd_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_AssociationEnd_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_AssociationEnd_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_AssociationEnd_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_AssociationEnd_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwStorageManagerAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_ASSOCIATIONEND_MANAGEDMEMORIES_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "017115a2-0ccf-11df-8525-001302895b2b");
            HWSTORAGEMANAGER_ASSOCIATIONEND_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017377f5-0ccf-11df-8525-001302895b2b");
            HWSTORAGEMANAGER_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ba42d770-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ba42d771-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ba42d772-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ba42d773-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ba42d774-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ba42d775-162f-11df-b9be-0014222a9f79");
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
