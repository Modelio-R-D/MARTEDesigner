/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << HwStorageManager_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d2a047a8-17a4-48b5-a148-371c8d01eb91")
public class HwStorageManagerAttribute extends StorageResourceAttribute {
    @objid ("b0931f04-310b-40cd-9af0-b1df2a84e42c")
    public static final String STEREOTYPE_NAME = "HwStorageManager_Attribute";

    @objid ("11d31eee-fef2-492b-a691-7f2d182eba7d")
    public static final String HWSTORAGEMANAGER_ATTRIBUTE_DESCRIPTION_TAGTYPE = "HwStorageManager_Attribute_description";

    @objid ("af343f60-98b1-4746-b2ca-4c0d49080849")
    public static final String HWSTORAGEMANAGER_ATTRIBUTE_ENDPOINTS_TAGTYPE = "HwStorageManager_Attribute_endPoints";

    @objid ("34385173-9bf5-4083-a3ec-9ed6a4ac5ca7")
    public static final String HWSTORAGEMANAGER_ATTRIBUTE_FREQUENCY_TAGTYPE = "HwStorageManager_Attribute_frequency";

    @objid ("d09754a5-cd26-4868-a4c5-c7f34b84eb4c")
    public static final String HWSTORAGEMANAGER_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE = "HwStorageManager_Attribute_managedMemories";

    @objid ("67ce1f83-0117-459c-a9e7-dcb02acd1962")
    public static final String HWSTORAGEMANAGER_ATTRIBUTE_OWNEDHW_TAGTYPE = "HwStorageManager_Attribute_ownedHW";

    @objid ("795acbd0-8c15-4f39-82bd-bb519a6fd958")
    public static final String HWSTORAGEMANAGER_ATTRIBUTE_P_HW_SERVICES_TAGTYPE = "HwStorageManager_Attribute_p_HW_Services";

    @objid ("dadb9d36-fc84-4295-9f88-451fc1e3ae98")
    public static final String HWSTORAGEMANAGER_ATTRIBUTE_R_HW_SERVICES_TAGTYPE = "HwStorageManager_Attribute_r_HW_Services";

    /**
     * Tells whether a {@link HwStorageManagerAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwStorageManager_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("275e7e7f-22a4-4fe8-9410-53d60fcf09e8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwStorageManager_Attribute >> then instantiate a {@link HwStorageManagerAttribute} proxy.
     * 
     * @return a {@link HwStorageManagerAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("e6d7139c-0c68-482b-ad55-c990674a55c9")
    public static HwStorageManagerAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerAttribute.STEREOTYPE_NAME);
        return HwStorageManagerAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerAttribute} proxy from a {@link Attribute} stereotyped << HwStorageManager_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwStorageManagerAttribute} proxy or <i>null</i>.
     */
    @objid ("39bbb46f-b074-496e-9542-49cee4c07204")
    public static HwStorageManagerAttribute instantiate(final Attribute obj) {
        return HwStorageManagerAttribute.canInstantiate(obj) ? new HwStorageManagerAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerAttribute} proxy from a {@link Attribute} stereotyped << HwStorageManager_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwStorageManagerAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c6667a0d-64eb-4791-971b-1db0a0738413")
    public static HwStorageManagerAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwStorageManagerAttribute.canInstantiate(obj))
        	return new HwStorageManagerAttribute(obj);
        else
        	throw new IllegalArgumentException("HwStorageManagerAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b027f9d1-bd7f-4ddd-b812-bc623655d39b")
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
        HwStorageManagerAttribute other = (HwStorageManagerAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("fe86c17e-499c-4a33-b91f-989225e2164d")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwStorageManager_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d01199e6-8135-4369-b7ab-c5203554266e")
    public String getHwStorageManager_Attribute_description() {
        return this.elt.getTagValue(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Attribute_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("57b5c861-d73a-472c-9ef6-028bbffaf0d3")
    public List<String> getHwStorageManager_Attribute_endPoints() {
        return this.elt.getTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwStorageManager_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5dbb27cf-2a37-414f-84c4-afda6db88227")
    public String getHwStorageManager_Attribute_frequency() {
        return this.elt.getTagValue(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Attribute_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8baace64-1a33-4151-89f3-374341c8cd63")
    public List<String> getHwStorageManager_Attribute_managedMemories() {
        return this.elt.getTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Attribute_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e17bd600-3e0f-47e4-9e74-340578d5e7fc")
    public List<String> getHwStorageManager_Attribute_ownedHW() {
        return this.elt.getTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Attribute_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cb3d0f26-f126-4384-a7e8-b93a68b90ecc")
    public List<String> getHwStorageManager_Attribute_p_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Attribute_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("370978ce-0aaf-4239-be46-d1c827f6c3ca")
    public List<String> getHwStorageManager_Attribute_r_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("99fcc06d-22dc-4820-951d-a823a607f734")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwStorageManager_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6d80e8b0-caeb-4d61-b6cb-2eb169d88f67")
    public void setHwStorageManager_Attribute_description(final String value) {
        this.elt.putTagValue(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Attribute_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db9aa7ea-1330-446d-92db-95321ebf763c")
    public void setHwStorageManager_Attribute_endPoints(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwStorageManager_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fb2d33f8-e77d-4718-8b1b-d391598bf168")
    public void setHwStorageManager_Attribute_frequency(final String value) {
        this.elt.putTagValue(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Attribute_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c9b24854-4d02-432b-933b-ac43b8cedc97")
    public void setHwStorageManager_Attribute_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Attribute_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24e1613d-df48-447f-b77c-57aebc0564ca")
    public void setHwStorageManager_Attribute_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Attribute_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8564b160-baa6-49f6-8991-2d8d3181fdab")
    public void setHwStorageManager_Attribute_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Attribute_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be8719ca-214f-456c-b98b-2772b95640f1")
    public void setHwStorageManager_Attribute_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("005ccef1-eab1-42b2-8bbd-cca5c30a67fa")
    protected HwStorageManagerAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("55f0ee47-7ed2-4b14-8c48-1b44832f2c12")
    public static final class MdaTypes {
        @objid ("101b66aa-c561-418f-8b24-200a1456c887")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c082746b-7756-460b-a5ba-e23269695c43")
        public static TagType HWSTORAGEMANAGER_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("0d9c46ce-166e-4e1e-b2d9-91aa7acc7634")
        public static TagType HWSTORAGEMANAGER_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("fa5691c8-61e0-4b19-a684-56b58bc74ab1")
        public static TagType HWSTORAGEMANAGER_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("264532bf-9584-4a8a-8122-3b0734abe1d4")
        public static TagType HWSTORAGEMANAGER_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("f6c64027-c6c3-4dcb-9575-168f7a0ba5f4")
        public static TagType HWSTORAGEMANAGER_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT;

        @objid ("e2eec59a-57da-4409-bf22-236d3d3baf7d")
        public static TagType HWSTORAGEMANAGER_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT;

        @objid ("196d1520-0ac0-43bc-8d34-bb02153d71e7")
        public static TagType HWSTORAGEMANAGER_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("57f15b26-77a1-451d-bf43-a4320f77c84a")
        private static Stereotype MDAASSOCDEP;

        @objid ("f8e1a8ac-0595-4742-9927-3a6d88b8288c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("34edfedb-2980-4134-9b10-013ed5f07ebe")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "017115a4-0ccf-11df-8525-001302895b2b");
            HWSTORAGEMANAGER_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017377f7-0ccf-11df-8525-001302895b2b");
            HWSTORAGEMANAGER_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b9546b80-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b9546b81-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b9546b82-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b9546b83-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b9546b84-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e248855-1710-11df-b92a-0014222a9f79");
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
