/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.association;

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
@objid ("17bd7ccb-8655-446e-9386-e63b7b8255a3")
public class HwStorageManagerAssociation extends StorageResourceAssociation {
    @objid ("bae4da1e-78db-4e28-9017-0e6c4e85f18a")
    public static final String STEREOTYPE_NAME = "HwStorageManager_Association";

    @objid ("438a8259-5d2f-4037-ab4e-6075e2f9150e")
    public static final String HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION_TAGTYPE = "HwStorageManager_Association_description";

    @objid ("4fdff9b5-1c18-4502-8e9f-ac440d7bfa01")
    public static final String HWSTORAGEMANAGER_ASSOCIATION_ENDPOINTS_TAGTYPE = "HwStorageManager_Association_endPoints";

    @objid ("90e3980a-0ce3-4af4-b19b-85d3e44b18f8")
    public static final String HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY_TAGTYPE = "HwStorageManager_Association_frequency";

    @objid ("ecbeb9a4-3c72-40fc-95e2-8fb2f4ca5c5f")
    public static final String HWSTORAGEMANAGER_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE = "HwStorageManager_Association_managedMemories";

    @objid ("b464a6b9-4e54-439b-8669-9b6e583aabc2")
    public static final String HWSTORAGEMANAGER_ASSOCIATION_OWNEDHW_TAGTYPE = "HwStorageManager_Association_ownedHW";

    @objid ("77416bb2-e6a0-48f6-ba25-a60cb8b9b876")
    public static final String HWSTORAGEMANAGER_ASSOCIATION_P_HW_SERVICES_TAGTYPE = "HwStorageManager_Association_p_HW_Services";

    @objid ("afcde8e0-6ec0-416f-b5fa-2119dd93da8a")
    public static final String HWSTORAGEMANAGER_ASSOCIATION_R_HW_SERVICES_TAGTYPE = "HwStorageManager_Association_r_HW_Services";

    /**
     * Tells whether a {@link HwStorageManagerAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwStorageManager_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c012ff1e-c7ef-4b1f-a95c-8a5c9ea6554d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwStorageManager_Association >> then instantiate a {@link HwStorageManagerAssociation} proxy.
     * 
     * @return a {@link HwStorageManagerAssociation} proxy on the created {@link Association}.
     */
    @objid ("ca0a13b5-16d3-4ef2-b457-58815eb15f93")
    public static HwStorageManagerAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerAssociation.STEREOTYPE_NAME);
        return HwStorageManagerAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerAssociation} proxy from a {@link Association} stereotyped << HwStorageManager_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwStorageManagerAssociation} proxy or <i>null</i>.
     */
    @objid ("6cd41695-822c-4884-a549-dcbe60883497")
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
    @objid ("d9b4aba7-1c76-48a8-a962-d0e56e477cfb")
    public static HwStorageManagerAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwStorageManagerAssociation.canInstantiate(obj))
        	return new HwStorageManagerAssociation(obj);
        else
        	throw new IllegalArgumentException("HwStorageManagerAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e8a3ab31-3d26-4791-8c36-f943acc4200a")
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
    @objid ("4465d8f7-9b8b-4013-b5da-42b1651bcaf4")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwStorageManager_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0dd76ae2-b5d8-42ec-b1df-576fed9c8a4c")
    public String getHwStorageManager_Association_description() {
        return this.elt.getTagValue(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Association_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f6dc700a-55e8-4e65-a6f3-c53e1dac86a9")
    public List<String> getHwStorageManager_Association_endPoints() {
        return this.elt.getTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwStorageManager_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e1c57368-eedf-43d3-919d-7a33e8773bc0")
    public String getHwStorageManager_Association_frequency() {
        return this.elt.getTagValue(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Association_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7e434127-a2a8-4a12-a231-1faa34f11ad7")
    public List<String> getHwStorageManager_Association_managedMemories() {
        return this.elt.getTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Association_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("73838edd-930d-4bb7-b422-b51a586c4c07")
    public List<String> getHwStorageManager_Association_ownedHW() {
        return this.elt.getTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Association_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d2f59c21-b44e-4b5a-95ae-4771faa21f12")
    public List<String> getHwStorageManager_Association_p_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Association_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("86ba3e50-0896-4fc4-a7aa-423b362bafdc")
    public List<String> getHwStorageManager_Association_r_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("424292d9-3683-4ceb-a8d7-f9fe747db4de")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwStorageManager_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4f1bc3a3-c00e-4320-9daf-e92697741152")
    public void setHwStorageManager_Association_description(final String value) {
        this.elt.putTagValue(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Association_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fd5792a2-9067-4e5a-a76f-69280665ff77")
    public void setHwStorageManager_Association_endPoints(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwStorageManager_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("778b95c4-f1eb-40e9-bf4c-331b6c085466")
    public void setHwStorageManager_Association_frequency(final String value) {
        this.elt.putTagValue(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Association_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3d89ddf-7115-4bd9-8e1b-8fb838386d8c")
    public void setHwStorageManager_Association_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Association_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("19e145a1-b765-4c88-98e9-5753a2bdb6db")
    public void setHwStorageManager_Association_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Association_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8d69b813-9838-4659-8dee-eb2c2d352adc")
    public void setHwStorageManager_Association_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Association_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5a68b0dc-959e-4d97-973d-4d2d186f4c28")
    public void setHwStorageManager_Association_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("c9ac43fc-57e8-4756-9607-677ce6786b07")
    protected HwStorageManagerAssociation(final Association elt) {
        super(elt);
    }

    @objid ("6d9df573-9b7c-480c-b091-ee4a53d4d153")
    public static final class MdaTypes {
        @objid ("2d7eb034-0fa4-4716-affd-77380337c30f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f17435d0-1283-4273-9b72-e19ba3ab56c6")
        public static TagType HWSTORAGEMANAGER_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("013c3669-9466-4504-b2d1-8a248a198734")
        public static TagType HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT;

        @objid ("838283de-eda0-46a2-a585-7a0ad014e1c3")
        public static TagType HWSTORAGEMANAGER_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("0437a247-4361-4a81-ad2a-8c3816af252c")
        public static TagType HWSTORAGEMANAGER_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("f636174e-0dd6-4241-a1f2-e83895c43e82")
        public static TagType HWSTORAGEMANAGER_ASSOCIATION_OWNEDHW_TAGTYPE_ELT;

        @objid ("aea68bb6-8a78-4a7d-b889-0be5d1cd37b9")
        public static TagType HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        @objid ("2f5b11c8-3d74-4297-9ebb-68d1fa34418a")
        public static TagType HWSTORAGEMANAGER_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT;

        @objid ("420463dc-d3c0-469e-bdfb-fbfa5f1feb48")
        private static Stereotype MDAASSOCDEP;

        @objid ("128fea78-f7ab-44c3-83cb-e352a97fbed8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8ea33671-a3fd-448e-9d7e-29fe1d2605ca")
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
