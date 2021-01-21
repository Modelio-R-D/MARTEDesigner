/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.associationend;

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
@objid ("bc6e03c5-8584-44af-a9bb-7d1ab04b0058")
public class HwStorageManagerAssociationEnd extends StorageResourceAssociationEnd {
    @objid ("67ba5127-96c5-49be-9821-3fad7c19b894")
    public static final String STEREOTYPE_NAME = "HwStorageManager_AssociationEnd";

    @objid ("59d3f4db-8989-4432-9713-74162006d850")
    public static final String HWSTORAGEMANAGER_ASSOCIATIONEND_DESCRIPTION_TAGTYPE = "HwStorageManager_AssociationEnd_description";

    @objid ("9cf1a602-201f-44ad-ae88-8248b0e51d37")
    public static final String HWSTORAGEMANAGER_ASSOCIATIONEND_ENDPOINTS_TAGTYPE = "HwStorageManager_AssociationEnd_endPoints";

    @objid ("bdda4f6a-9b41-47a1-801f-2896ae444a17")
    public static final String HWSTORAGEMANAGER_ASSOCIATIONEND_FREQUENCY_TAGTYPE = "HwStorageManager_AssociationEnd_frequency";

    @objid ("6ce26049-a8d6-45eb-9dbf-6a15fafc8c9d")
    public static final String HWSTORAGEMANAGER_ASSOCIATIONEND_MANAGEDMEMORIES_TAGTYPE = "HwStorageManager_AssociationEnd_managedMemories";

    @objid ("1600c86c-ee6b-4561-a004-3e97cc4c9611")
    public static final String HWSTORAGEMANAGER_ASSOCIATIONEND_OWNEDHW_TAGTYPE = "HwStorageManager_AssociationEnd_ownedHW";

    @objid ("72f3fad4-a86a-45c1-a378-55c64536878d")
    public static final String HWSTORAGEMANAGER_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE = "HwStorageManager_AssociationEnd_p_HW_Services";

    @objid ("6d84d34d-06c9-41a7-b11b-67ef823df0d9")
    public static final String HWSTORAGEMANAGER_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE = "HwStorageManager_AssociationEnd_r_HW_Services";

    /**
     * Tells whether a {@link HwStorageManagerAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwStorageManager_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9a2ea136-bb29-40dd-b741-a0690e1281bd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwStorageManager_AssociationEnd >> then instantiate a {@link HwStorageManagerAssociationEnd} proxy.
     * 
     * @return a {@link HwStorageManagerAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("a4c35a39-c9b8-4419-ac5d-fd2e95683989")
    public static HwStorageManagerAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerAssociationEnd.STEREOTYPE_NAME);
        return HwStorageManagerAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwStorageManager_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwStorageManagerAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("4462f7dd-3410-4c45-8254-5de2a7e05bac")
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
    @objid ("aa660651-6b0b-4277-bf06-e5ac818846d1")
    public static HwStorageManagerAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwStorageManagerAssociationEnd.canInstantiate(obj))
        	return new HwStorageManagerAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwStorageManagerAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6f96ad7c-5bd7-4dbd-841e-4faad37ef1c6")
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
    @objid ("0a5ae368-c7dc-43a3-b4ae-03025d99024f")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwStorageManager_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a4c5a668-5a49-46c6-8758-f2cab24a4151")
    public String getHwStorageManager_AssociationEnd_description() {
        return this.elt.getTagValue(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_AssociationEnd_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5f960541-905d-4e2a-b6a0-d8d862d05014")
    public List<String> getHwStorageManager_AssociationEnd_endPoints() {
        return this.elt.getTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwStorageManager_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("26491a21-dcaf-4759-93a2-cb0886d1f8b3")
    public String getHwStorageManager_AssociationEnd_frequency() {
        return this.elt.getTagValue(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_AssociationEnd_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fc34917d-0dba-467b-80b4-58034ab06356")
    public List<String> getHwStorageManager_AssociationEnd_managedMemories() {
        return this.elt.getTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_AssociationEnd_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("45b59cf1-20bd-47da-b3fa-4d51ddf7a21d")
    public List<String> getHwStorageManager_AssociationEnd_ownedHW() {
        return this.elt.getTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_AssociationEnd_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("270259b2-7677-475e-ab43-2fcbdc4528ca")
    public List<String> getHwStorageManager_AssociationEnd_p_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_AssociationEnd_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5bd3a193-005b-4e7e-9642-91e4b576f4a1")
    public List<String> getHwStorageManager_AssociationEnd_r_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("3a0f8540-fa5d-4b30-bd53-856bce1f5b62")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwStorageManager_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("58a980c7-e965-41ed-9903-03d9614953ee")
    public void setHwStorageManager_AssociationEnd_description(final String value) {
        this.elt.putTagValue(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_AssociationEnd_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("31ea2f7d-52b8-4391-af26-67bc77ca5542")
    public void setHwStorageManager_AssociationEnd_endPoints(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwStorageManager_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("347c8727-6674-4f94-b327-d7745fbf8142")
    public void setHwStorageManager_AssociationEnd_frequency(final String value) {
        this.elt.putTagValue(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_AssociationEnd_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("85ae1910-2191-4f62-a20a-c93f408ecfb3")
    public void setHwStorageManager_AssociationEnd_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_AssociationEnd_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8e8539ad-05db-4b4e-93ac-b0975893f7db")
    public void setHwStorageManager_AssociationEnd_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_AssociationEnd_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c433ff1f-97fe-4b67-ac30-6f1eb1d910a7")
    public void setHwStorageManager_AssociationEnd_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_AssociationEnd_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5ebd3e5e-c01e-4461-a363-763e8da83981")
    public void setHwStorageManager_AssociationEnd_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociationEnd.MdaTypes.HWSTORAGEMANAGER_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("7bf82c8a-de46-4527-b4e1-105a05bc4fed")
    protected HwStorageManagerAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("5d04dae4-106d-40c9-8da0-36dda9c4b424")
    public static final class MdaTypes {
        @objid ("2deaca9f-1072-4414-9ab6-160679134a0b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bb02a057-9e87-4362-95bb-605cd2c67f06")
        public static TagType HWSTORAGEMANAGER_ASSOCIATIONEND_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("883a762c-ca50-4c3f-b5a4-71bb964cc441")
        public static TagType HWSTORAGEMANAGER_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT;

        @objid ("bee082c9-3243-45e2-885f-82ece051b529")
        public static TagType HWSTORAGEMANAGER_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("2f02295a-31b8-4dcb-baaa-990c019c5517")
        public static TagType HWSTORAGEMANAGER_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("fbd4334b-06b8-4875-a5b0-343d1a9c93df")
        public static TagType HWSTORAGEMANAGER_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT;

        @objid ("c34b1d5e-7474-4591-9e92-46d287119e2b")
        public static TagType HWSTORAGEMANAGER_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT;

        @objid ("c99ee7cc-5b91-4271-91ab-ad7393f364b2")
        public static TagType HWSTORAGEMANAGER_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT;

        @objid ("86b0096e-bf10-4d1d-a2f2-64787340bcf2")
        private static Stereotype MDAASSOCDEP;

        @objid ("58a3f3a0-d40d-4666-bc55-dc3c9352e8c1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bfeda0d7-21eb-4167-8138-f176c7430811")
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
