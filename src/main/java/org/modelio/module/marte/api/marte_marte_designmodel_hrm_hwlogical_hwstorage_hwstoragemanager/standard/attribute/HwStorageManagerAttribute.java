/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("0fc7e1f9-8f13-4d1d-89cf-a2a8ffa06787")
    public static final String STEREOTYPE_NAME = "HwStorageManager_Attribute";

    @objid ("10303f72-fd8b-4f26-a8ee-da117e59f1a2")
    public static final String HWSTORAGEMANAGER_ATTRIBUTE_DESCRIPTION_TAGTYPE = "HwStorageManager_Attribute_description";

    @objid ("16f78ff7-f2ad-4ee9-a1c4-43f9d8cbb01c")
    public static final String HWSTORAGEMANAGER_ATTRIBUTE_ENDPOINTS_TAGTYPE = "HwStorageManager_Attribute_endPoints";

    @objid ("d7f2c2da-a735-4eba-b806-244ab23110c3")
    public static final String HWSTORAGEMANAGER_ATTRIBUTE_FREQUENCY_TAGTYPE = "HwStorageManager_Attribute_frequency";

    @objid ("699559ba-c1ae-475f-8951-a3313e239a50")
    public static final String HWSTORAGEMANAGER_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE = "HwStorageManager_Attribute_managedMemories";

    @objid ("a7916236-d18b-4147-8362-dc526c8b9508")
    public static final String HWSTORAGEMANAGER_ATTRIBUTE_OWNEDHW_TAGTYPE = "HwStorageManager_Attribute_ownedHW";

    @objid ("58069331-a0e5-4183-9c6c-47a98cccce71")
    public static final String HWSTORAGEMANAGER_ATTRIBUTE_P_HW_SERVICES_TAGTYPE = "HwStorageManager_Attribute_p_HW_Services";

    @objid ("990a7fc1-b184-4fcf-9b1f-abe7aec70604")
    public static final String HWSTORAGEMANAGER_ATTRIBUTE_R_HW_SERVICES_TAGTYPE = "HwStorageManager_Attribute_r_HW_Services";

    /**
     * Tells whether a {@link HwStorageManagerAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwStorageManager_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b2f103b0-792a-4a51-a4f9-892fe836b06e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwStorageManager_Attribute >> then instantiate a {@link HwStorageManagerAttribute} proxy.
     * 
     * @return a {@link HwStorageManagerAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("ca0e3067-0c32-4d38-a3ab-92c3535c188a")
    public static HwStorageManagerAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerAttribute.STEREOTYPE_NAME);
        return HwStorageManagerAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerAttribute} proxy from a {@link Attribute} stereotyped << HwStorageManager_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwStorageManagerAttribute} proxy or <i>null</i>.
     */
    @objid ("032dafdb-0e69-4a98-b85b-db3ad4060155")
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
    @objid ("7798b92a-56a6-4159-bfb0-4769a7d43953")
    public static HwStorageManagerAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwStorageManagerAttribute.canInstantiate(obj))
        	return new HwStorageManagerAttribute(obj);
        else
        	throw new IllegalArgumentException("HwStorageManagerAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b6a1777f-18c2-434f-af17-360ea145af8c")
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
    @objid ("ce34cd7c-8313-4089-9785-7c87ef20dc45")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwStorageManager_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("879cf177-d925-4a90-a617-efd1139d0e7c")
    public String getHwStorageManager_Attribute_description() {
        return this.elt.getTagValue(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Attribute_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3aeed759-3f12-4987-b01b-aa724d3d0802")
    public List<String> getHwStorageManager_Attribute_endPoints() {
        return this.elt.getTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwStorageManager_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("936ef279-f360-4e25-bd06-1a2699ee838c")
    public String getHwStorageManager_Attribute_frequency() {
        return this.elt.getTagValue(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Attribute_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c720ee2d-4d28-4d32-9f7a-62b9be0bb19f")
    public List<String> getHwStorageManager_Attribute_managedMemories() {
        return this.elt.getTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Attribute_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("84b66cff-73ce-4ca9-b6e6-15e87981b987")
    public List<String> getHwStorageManager_Attribute_ownedHW() {
        return this.elt.getTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Attribute_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("955d0425-9d44-48b5-9184-248233d6e6ac")
    public List<String> getHwStorageManager_Attribute_p_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Attribute_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("952334fb-09bc-4cdf-9e7d-e75382b573c2")
    public List<String> getHwStorageManager_Attribute_r_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("4a408d0a-e74c-4f5f-9479-d3aca7d3da5d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwStorageManager_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b27566c-6726-4923-abf6-9f65d23353fa")
    public void setHwStorageManager_Attribute_description(final String value) {
        this.elt.putTagValue(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Attribute_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e273ac55-a644-44cc-a1e8-59ffc7f6a5b6")
    public void setHwStorageManager_Attribute_endPoints(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwStorageManager_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3835c70-b75a-49e5-aaa0-555addd6b093")
    public void setHwStorageManager_Attribute_frequency(final String value) {
        this.elt.putTagValue(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Attribute_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("80099f60-0f3d-4e27-b4fb-d248f0c898dd")
    public void setHwStorageManager_Attribute_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Attribute_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e346fbb9-f720-49a6-b6d5-ba98e2996de5")
    public void setHwStorageManager_Attribute_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Attribute_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("212ebe3f-c330-43bc-9763-de157560fa37")
    public void setHwStorageManager_Attribute_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Attribute_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f838e54f-1537-4fe2-b06b-80077993a297")
    public void setHwStorageManager_Attribute_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerAttribute.MdaTypes.HWSTORAGEMANAGER_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("b971b8a1-c126-4688-985b-731f1b706816")
    protected HwStorageManagerAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("55f0ee47-7ed2-4b14-8c48-1b44832f2c12")
    public static final class MdaTypes {
        @objid ("79e2c9b6-2f58-444b-8030-8078f980b6ae")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b74f25ff-ae28-484f-8854-327a3356b523")
        public static TagType HWSTORAGEMANAGER_ATTRIBUTE_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("6b09d870-d794-4e7c-a5c6-11eae249f34d")
        public static TagType HWSTORAGEMANAGER_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("fac6ca0d-a9fe-4cef-9bb6-4a187ccdb84e")
        public static TagType HWSTORAGEMANAGER_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("748fe781-d667-438c-b48e-10a20209ac3f")
        public static TagType HWSTORAGEMANAGER_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("fa3c299e-9783-42f3-ac59-24397d991f4b")
        public static TagType HWSTORAGEMANAGER_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT;

        @objid ("9e66d1e6-3945-4fb3-b32c-51d748af30f5")
        public static TagType HWSTORAGEMANAGER_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT;

        @objid ("bf58804a-dbab-45b8-93bf-85bfedb0b02b")
        public static TagType HWSTORAGEMANAGER_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("82d5e81b-6b1b-41b9-a705-534e986b1f63")
        private static Stereotype MDAASSOCDEP;

        @objid ("f36d3cbd-7768-40bf-a36a-34dc9352fcd9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("442e5aab-53a1-4c1d-8359-a7ab1157902e")
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
