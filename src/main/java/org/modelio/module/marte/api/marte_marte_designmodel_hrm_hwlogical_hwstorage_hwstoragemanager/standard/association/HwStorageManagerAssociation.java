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
    @objid ("881248a7-276e-456a-9fb2-d538ae904d9b")
    public static final String STEREOTYPE_NAME = "HwStorageManager_Association";

    @objid ("a4c35767-fb57-4f1a-ac2e-c9d25b32639d")
    public static final String HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION_TAGTYPE = "HwStorageManager_Association_description";

    @objid ("a253a2e6-54e5-455c-8d6f-2eb4758402c7")
    public static final String HWSTORAGEMANAGER_ASSOCIATION_ENDPOINTS_TAGTYPE = "HwStorageManager_Association_endPoints";

    @objid ("266668dd-0e09-477a-b70d-6712db0caa57")
    public static final String HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY_TAGTYPE = "HwStorageManager_Association_frequency";

    @objid ("7c975343-6548-4771-9564-79bb78d3a215")
    public static final String HWSTORAGEMANAGER_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE = "HwStorageManager_Association_managedMemories";

    @objid ("f9f038d8-07df-4d5e-abec-3935dc913e5f")
    public static final String HWSTORAGEMANAGER_ASSOCIATION_OWNEDHW_TAGTYPE = "HwStorageManager_Association_ownedHW";

    @objid ("9430fbd0-a99e-45ba-8a2a-b28749662779")
    public static final String HWSTORAGEMANAGER_ASSOCIATION_P_HW_SERVICES_TAGTYPE = "HwStorageManager_Association_p_HW_Services";

    @objid ("bf0cb5a8-62a0-4ac0-a944-435a42f76475")
    public static final String HWSTORAGEMANAGER_ASSOCIATION_R_HW_SERVICES_TAGTYPE = "HwStorageManager_Association_r_HW_Services";

    /**
     * Tells whether a {@link HwStorageManagerAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwStorageManager_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("995bba0b-fe57-4968-8945-f93a332a0bfa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwStorageManager_Association >> then instantiate a {@link HwStorageManagerAssociation} proxy.
     * 
     * @return a {@link HwStorageManagerAssociation} proxy on the created {@link Association}.
     */
    @objid ("fc0081f0-d040-4e95-8eca-cac57ed1ee88")
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
    @objid ("d956df59-abeb-4473-89f5-f7a01f4ed5d7")
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
    @objid ("c8f667eb-3888-430c-ad31-64e17e71efdc")
    public static HwStorageManagerAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwStorageManagerAssociation.canInstantiate(obj))
        	return new HwStorageManagerAssociation(obj);
        else
        	throw new IllegalArgumentException("HwStorageManagerAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ae594052-e42d-470e-9f6d-2c9f44799a63")
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
    @objid ("5de7c356-a627-46bc-8b91-356c0286ef85")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwStorageManager_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a7d4117c-02cc-466a-9a7e-9c6c2cf94546")
    public String getHwStorageManager_Association_description() {
        return this.elt.getTagValue(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Association_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7d05e4fe-06bd-4efe-bc90-1a94044e40f6")
    public List<String> getHwStorageManager_Association_endPoints() {
        return this.elt.getTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwStorageManager_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f3b4972b-dfbb-4e6e-92c6-b75e0aed0a40")
    public String getHwStorageManager_Association_frequency() {
        return this.elt.getTagValue(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Association_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("63eb7ded-0b4a-4a22-a581-3728901e753f")
    public List<String> getHwStorageManager_Association_managedMemories() {
        return this.elt.getTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Association_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8b1e155c-0645-413d-a9d9-0863fe7aefb7")
    public List<String> getHwStorageManager_Association_ownedHW() {
        return this.elt.getTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Association_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c9efde2a-bb96-4b4a-af58-4ece2477a7fe")
    public List<String> getHwStorageManager_Association_p_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Association_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6f278479-6701-42bb-9ff2-de94921f854d")
    public List<String> getHwStorageManager_Association_r_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("170d1e8f-f9dd-4644-8b3f-3d1de10658c4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwStorageManager_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("773857fe-de87-4f19-9fe3-f1ca1d7fe63d")
    public void setHwStorageManager_Association_description(final String value) {
        this.elt.putTagValue(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Association_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("17179139-f44d-42dd-9778-ac081a883078")
    public void setHwStorageManager_Association_endPoints(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwStorageManager_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21ede12b-875f-4be2-bf2d-582e2e440ede")
    public void setHwStorageManager_Association_frequency(final String value) {
        this.elt.putTagValue(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Association_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ad147cec-6f3f-4898-8d77-8b077782addd")
    public void setHwStorageManager_Association_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Association_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("53b7b8b4-12a2-4bad-aed5-e1c69728d75d")
    public void setHwStorageManager_Association_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Association_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ef716206-9183-4b8b-bf71-02b5a9d18bb8")
    public void setHwStorageManager_Association_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Association_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b0cb6a6-35dd-4285-8f8e-c48e1dc03f66")
    public void setHwStorageManager_Association_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAssociation.MdaTypes.HWSTORAGEMANAGER_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("ec4183b7-a897-470c-9cb6-59895a05881d")
    protected HwStorageManagerAssociation(final Association elt) {
        super(elt);
    }

    @objid ("6d9df573-9b7c-480c-b091-ee4a53d4d153")
    public static final class MdaTypes {
        @objid ("a5a4faa0-a648-4aab-b996-6c65d549870c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8cb8962a-61fb-4a8c-bf95-4e23ff449383")
        public static TagType HWSTORAGEMANAGER_ASSOCIATION_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("52c4eb42-2064-443b-8a92-c1023ebf4c24")
        public static TagType HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT;

        @objid ("290817cf-dec1-46f6-840a-75af1f85016a")
        public static TagType HWSTORAGEMANAGER_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("d7e0e82e-3c23-4971-aa3d-3bb62202bb82")
        public static TagType HWSTORAGEMANAGER_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("9d656b76-4ec3-4113-87c7-990368e74477")
        public static TagType HWSTORAGEMANAGER_ASSOCIATION_OWNEDHW_TAGTYPE_ELT;

        @objid ("ecf3d292-8082-456e-a861-c519378727da")
        public static TagType HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        @objid ("518919a2-e340-4d67-be25-303165d46ebd")
        public static TagType HWSTORAGEMANAGER_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT;

        @objid ("b7b64f27-1210-4aec-8b71-075be8f9e697")
        private static Stereotype MDAASSOCDEP;

        @objid ("25ca82eb-fd71-461e-9699-90c47bb828e5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6c2f620f-f975-4fb1-9759-1ef48b6b6a93")
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
