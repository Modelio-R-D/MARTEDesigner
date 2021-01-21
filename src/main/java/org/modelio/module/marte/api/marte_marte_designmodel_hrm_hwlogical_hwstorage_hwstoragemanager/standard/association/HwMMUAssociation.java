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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwMMU_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f5bf282e-d63c-4f4b-b50d-db2a28526888")
public class HwMMUAssociation extends HwStorageManagerAssociation {
    @objid ("b441448a-157b-4bef-b0cd-71756fd3087d")
    public static final String STEREOTYPE_NAME = "HwMMU_Association";

    @objid ("482601c4-068d-47ac-9d85-e4ff040407ec")
    public static final String HWMMU_ASSOCIATION_MEMORYPROTECTION_TAGTYPE = "HwMMU_Association_memoryProtection";

    @objid ("4fea1b99-fca4-4eae-b764-635abb786f18")
    public static final String HWMMU_ASSOCIATION_NBENTRIES_TAGTYPE = "HwMMU_Association_nbEntries";

    @objid ("15d3d5f5-8d26-4bfe-8b3b-905b6b7fbd18")
    public static final String HWMMU_ASSOCIATION_OWNEDTLBS_TAGTYPE = "HwMMU_Association_ownedTLBs";

    @objid ("8df5f1ec-4e88-4972-b8cd-030f49fc9830")
    public static final String HWMMU_ASSOCIATION_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Association_physicalAddrSpace";

    @objid ("37aa942c-3536-4e61-860d-aa68d2782808")
    public static final String HWMMU_ASSOCIATION_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Association_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMUAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwMMU_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("85121825-b68e-42c0-b093-efa554e7b67e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwMMU_Association >> then instantiate a {@link HwMMUAssociation} proxy.
     * 
     * @return a {@link HwMMUAssociation} proxy on the created {@link Association}.
     */
    @objid ("39685b18-3022-4e2a-be2a-9d7c2705f162")
    public static HwMMUAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUAssociation.STEREOTYPE_NAME);
        return HwMMUAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwMMUAssociation} proxy from a {@link Association} stereotyped << HwMMU_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwMMUAssociation} proxy or <i>null</i>.
     */
    @objid ("1fceb2c6-1860-4958-b460-7422b2e6829e")
    public static HwMMUAssociation instantiate(final Association obj) {
        return HwMMUAssociation.canInstantiate(obj) ? new HwMMUAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMMUAssociation} proxy from a {@link Association} stereotyped << HwMMU_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwMMUAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("479e50a0-ead9-4361-bae4-dc7ff7e1a7f9")
    public static HwMMUAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwMMUAssociation.canInstantiate(obj))
        	return new HwMMUAssociation(obj);
        else
        	throw new IllegalArgumentException("HwMMUAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b9eb5611-51b9-4bd7-95ad-707da8c6798b")
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
        HwMMUAssociation other = (HwMMUAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("9f8701a9-cb1d-4f39-9c72-a676fe6d2119")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Association_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f606448a-c6fa-4fea-8102-3725188b98f4")
    public String getHwMMU_Association_nbEntries() {
        return this.elt.getTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Association_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a3d0873c-bd31-442d-8fbb-6cb3eac46d8b")
    public List<String> getHwMMU_Association_ownedTLBs() {
        return this.elt.getTagValues(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Association_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a525c2e9-4f7f-419a-80b2-c7cde2258c10")
    public String getHwMMU_Association_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Association_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("82952ee9-7fc8-42ee-b850-42c4cb1acd86")
    public String getHwMMU_Association_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @objid ("c8400804-8e54-4d12-a477-ee74543cd037")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Association_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e24f85ad-6260-48f6-b828-3a90219a78e5")
    public boolean isHwMMU_Association_memoryProtection() {
        return this.elt.isTagged(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Association_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fc106a5b-a4d0-41d0-a43c-b9ed7a714c2f")
    public void setHwMMU_Association_memoryProtection(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_MEMORYPROTECTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwMMU_Association_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("49668e2c-ee11-47d4-89d7-ad5ad27b6173")
    public void setHwMMU_Association_nbEntries(final String value) {
        this.elt.putTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Association_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("35b97da2-2e79-4fb3-9a8f-25674290fb11")
    public void setHwMMU_Association_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Association_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e8eb698a-046d-4441-b08c-a0a38d762db9")
    public void setHwMMU_Association_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Association_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e58ba227-3035-41fd-b3da-d8ebb4f9f8f8")
    public void setHwMMU_Association_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    @objid ("c1f190ad-594e-4f32-aae3-e786999e18d7")
    protected HwMMUAssociation(final Association elt) {
        super(elt);
    }

    @objid ("356fe071-11f7-4d60-b3dd-34ad868e5064")
    public static final class MdaTypes {
        @objid ("14dcb658-ab32-4124-922b-0fef72d32bff")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("72989c82-38a2-48bb-aad6-a47b78d1ea73")
        public static TagType HWMMU_ASSOCIATION_VIRTUALADDRSPACE_TAGTYPE_ELT;

        @objid ("e440649c-132d-46c3-a8f9-7b06a880a980")
        public static TagType HWMMU_ASSOCIATION_PHYSICALADDRSPACE_TAGTYPE_ELT;

        @objid ("fc5c07ba-d655-4470-bb3b-5a0900ef2791")
        public static TagType HWMMU_ASSOCIATION_NBENTRIES_TAGTYPE_ELT;

        @objid ("36599a5c-9496-4e41-a14d-d3a713a3d97c")
        public static TagType HWMMU_ASSOCIATION_OWNEDTLBS_TAGTYPE_ELT;

        @objid ("d1e3e3bd-8ac8-44be-8d88-216eb186b6b7")
        public static TagType HWMMU_ASSOCIATION_MEMORYPROTECTION_TAGTYPE_ELT;

        @objid ("b2cd926d-a23b-4004-91ae-02e3d6b91a2f")
        private static Stereotype MDAASSOCDEP;

        @objid ("236b29e2-85be-44f1-be41-a42b20931aa2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d329d77c-7503-4d8a-8ad7-9179aa0f62e9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "47e6404c-10b3-11df-81d9-0014222a9f79");
            HWMMU_ASSOCIATION_VIRTUALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "47e6404d-10b3-11df-81d9-0014222a9f79");
            HWMMU_ASSOCIATION_PHYSICALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "47e6404e-10b3-11df-81d9-0014222a9f79");
            HWMMU_ASSOCIATION_NBENTRIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "47e64050-10b3-11df-81d9-0014222a9f79");
            HWMMU_ASSOCIATION_OWNEDTLBS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "47e64051-10b3-11df-81d9-0014222a9f79");
            HWMMU_ASSOCIATION_MEMORYPROTECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2397cfd-1710-11df-b92a-0014222a9f79");
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
