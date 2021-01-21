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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwMMU_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d4cedb4e-207e-4e51-b0ec-19e09e519fcf")
public class HwMMUAttribute extends HwStorageManagerAttribute {
    @objid ("9ba6ebe0-43af-4ba1-bade-8a0490180984")
    public static final String STEREOTYPE_NAME = "HwMMU_Attribute";

    @objid ("70a0d57a-585b-4587-afc4-22546c571200")
    public static final String HWMMU_ATTRIBUTE_MEMORYPROTECTION_TAGTYPE = "HwMMU_Attribute_memoryProtection";

    @objid ("af01232f-4313-4985-8ca9-25f3af519b93")
    public static final String HWMMU_ATTRIBUTE_NBENTRIES_TAGTYPE = "HwMMU_Attribute_nbEntries";

    @objid ("29f858ee-e6c4-4d0f-82e9-90cb7d2e85ac")
    public static final String HWMMU_ATTRIBUTE_OWNEDTLBS_TAGTYPE = "HwMMU_Attribute_ownedTLBs";

    @objid ("58e40374-fc0d-4d8e-a67c-726e0146dfa8")
    public static final String HWMMU_ATTRIBUTE_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Attribute_physicalAddrSpace";

    @objid ("f5dea358-b1bd-4600-b1fe-05d30151060e")
    public static final String HWMMU_ATTRIBUTE_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Attribute_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMUAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwMMU_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4fbbdb98-327d-4555-8a41-5f9402aec36e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwMMU_Attribute >> then instantiate a {@link HwMMUAttribute} proxy.
     * 
     * @return a {@link HwMMUAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("e1344fe1-7abb-4690-b11d-19202efc3e5d")
    public static HwMMUAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUAttribute.STEREOTYPE_NAME);
        return HwMMUAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwMMUAttribute} proxy from a {@link Attribute} stereotyped << HwMMU_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwMMUAttribute} proxy or <i>null</i>.
     */
    @objid ("cc84316d-40a8-4c8b-b7e3-146237de283b")
    public static HwMMUAttribute instantiate(final Attribute obj) {
        return HwMMUAttribute.canInstantiate(obj) ? new HwMMUAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMMUAttribute} proxy from a {@link Attribute} stereotyped << HwMMU_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwMMUAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b7f5b227-41e7-49cc-9475-58e6838c2fdb")
    public static HwMMUAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwMMUAttribute.canInstantiate(obj))
        	return new HwMMUAttribute(obj);
        else
        	throw new IllegalArgumentException("HwMMUAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("96277945-c61b-427c-aa5d-157627db0bca")
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
        HwMMUAttribute other = (HwMMUAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("a3762ce0-cfa0-4efa-aace-8c56ae97f1be")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Attribute_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ce19dc07-943a-4872-8a9a-6ad559f4902c")
    public String getHwMMU_Attribute_nbEntries() {
        return this.elt.getTagValue(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Attribute_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9e581407-35cb-4bef-abf8-56582a4aebbb")
    public List<String> getHwMMU_Attribute_ownedTLBs() {
        return this.elt.getTagValues(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Attribute_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fdd850c6-f623-4029-8d53-329d73a155fd")
    public String getHwMMU_Attribute_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Attribute_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("afcd9741-c9d6-4466-953f-4b5d9e621b91")
    public String getHwMMU_Attribute_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @objid ("c1f6b69f-7f43-4478-a05a-9b3df01f241f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Attribute_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("05336f7c-190d-4e99-96f2-7781700bf73c")
    public boolean isHwMMU_Attribute_memoryProtection() {
        return this.elt.isTagged(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Attribute_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f847f969-ba08-4114-b997-58aa3880e8cf")
    public void setHwMMU_Attribute_memoryProtection(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_MEMORYPROTECTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwMMU_Attribute_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ce1b155b-2e1a-45b1-bbbe-bfb9ecb85311")
    public void setHwMMU_Attribute_nbEntries(final String value) {
        this.elt.putTagValue(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Attribute_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9cb5505b-967b-4517-8582-3d7c6dfcba92")
    public void setHwMMU_Attribute_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Attribute_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("04ef1c7c-00ad-443a-99d9-e06df355ba4d")
    public void setHwMMU_Attribute_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Attribute_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("34376dba-ab6f-4a81-9e5d-f063e7888fff")
    public void setHwMMU_Attribute_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    @objid ("c6c83e0b-9021-469c-b390-4f0b88ea725d")
    protected HwMMUAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("a5cecf24-e9f7-4e10-b2b0-36d10e431f03")
    public static final class MdaTypes {
        @objid ("54f5d245-ab7e-4155-8c28-054a0ad66b6e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5bbfb8d1-8858-4cc4-8ab8-8aebfe103abf")
        public static TagType HWMMU_ATTRIBUTE_VIRTUALADDRSPACE_TAGTYPE_ELT;

        @objid ("ae440425-52b5-4dcb-b6ef-556a5f3acd3d")
        public static TagType HWMMU_ATTRIBUTE_PHYSICALADDRSPACE_TAGTYPE_ELT;

        @objid ("63971f62-e1fb-4a04-aae1-e1b2ac1b5dcd")
        public static TagType HWMMU_ATTRIBUTE_NBENTRIES_TAGTYPE_ELT;

        @objid ("06388f9e-0e70-43bb-a9ff-a311f1e1191d")
        public static TagType HWMMU_ATTRIBUTE_OWNEDTLBS_TAGTYPE_ELT;

        @objid ("e1213bb7-3ae1-4eb9-b597-36eae53bcd11")
        public static TagType HWMMU_ATTRIBUTE_MEMORYPROTECTION_TAGTYPE_ELT;

        @objid ("bd99732f-9826-468c-8a8c-35077415cfb4")
        private static Stereotype MDAASSOCDEP;

        @objid ("1283ab9a-d688-4c56-96f6-1983e052eafb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("045f0193-5db0-464f-81c5-e3c3892ce29b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01842834-0ccf-11df-8525-001302895b2b");
            HWMMU_ATTRIBUTE_VIRTUALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0184283b-0ccf-11df-8525-001302895b2b");
            HWMMU_ATTRIBUTE_PHYSICALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01842842-0ccf-11df-8525-001302895b2b");
            HWMMU_ATTRIBUTE_NBENTRIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01842850-0ccf-11df-8525-001302895b2b");
            HWMMU_ATTRIBUTE_OWNEDTLBS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01842857-0ccf-11df-8525-001302895b2b");
            HWMMU_ATTRIBUTE_MEMORYPROTECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d56da89d-1710-11df-b92a-0014222a9f79");
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
