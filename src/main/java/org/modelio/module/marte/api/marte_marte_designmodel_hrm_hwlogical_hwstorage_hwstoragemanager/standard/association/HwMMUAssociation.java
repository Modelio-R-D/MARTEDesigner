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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwMMU_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f5bf282e-d63c-4f4b-b50d-db2a28526888")
public class HwMMUAssociation extends HwStorageManagerAssociation {
    @objid ("5207d065-5d93-4bc6-8b9d-dea09aa0f3a5")
    public static final String STEREOTYPE_NAME = "HwMMU_Association";

    @objid ("93efc589-0f56-4522-92d8-73c685d9237b")
    public static final String HWMMU_ASSOCIATION_MEMORYPROTECTION_TAGTYPE = "HwMMU_Association_memoryProtection";

    @objid ("0e70150f-4977-4e8d-b6b3-6d7e5c1e39aa")
    public static final String HWMMU_ASSOCIATION_NBENTRIES_TAGTYPE = "HwMMU_Association_nbEntries";

    @objid ("06fc988e-2122-438d-9ec2-a0fe25683023")
    public static final String HWMMU_ASSOCIATION_OWNEDTLBS_TAGTYPE = "HwMMU_Association_ownedTLBs";

    @objid ("38d9b608-4197-4397-ae98-f716f7f8aab2")
    public static final String HWMMU_ASSOCIATION_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Association_physicalAddrSpace";

    @objid ("2d18258d-b950-4cea-b383-74fcd47f9d35")
    public static final String HWMMU_ASSOCIATION_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Association_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMUAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwMMU_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cf2a6855-87fc-45e3-b701-51ab257b6730")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwMMU_Association >> then instantiate a {@link HwMMUAssociation} proxy.
     * 
     * @return a {@link HwMMUAssociation} proxy on the created {@link Association}.
     */
    @objid ("e163d1ae-d81e-4c40-b1e9-bcf629c677bf")
    public static HwMMUAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUAssociation.STEREOTYPE_NAME);
        return HwMMUAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwMMUAssociation} proxy from a {@link Association} stereotyped << HwMMU_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwMMUAssociation} proxy or <i>null</i>.
     */
    @objid ("2aadee8b-4cdd-4eef-b3ca-525b108e3198")
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
    @objid ("3fd2c0b5-5a94-4911-9399-10fc4911c94a")
    public static HwMMUAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwMMUAssociation.canInstantiate(obj))
        	return new HwMMUAssociation(obj);
        else
        	throw new IllegalArgumentException("HwMMUAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5cc816cd-ab4f-4fdc-af3c-3dc4f5d07d44")
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
    @objid ("84166e2c-e0a9-4241-a094-0ffeaea22cb0")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Association_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7f153caa-1ec8-4f2e-a4cc-e3fade686d93")
    public String getHwMMU_Association_nbEntries() {
        return this.elt.getTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Association_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("baee1f74-cbd7-4825-ba1c-de92cfbc4b28")
    public List<String> getHwMMU_Association_ownedTLBs() {
        return this.elt.getTagValues(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Association_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0339b532-132d-428e-b096-f44a02040e58")
    public String getHwMMU_Association_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Association_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e06b8550-fdad-4c77-9325-c501e974f8d2")
    public String getHwMMU_Association_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @objid ("e0c6f7e2-31a4-46b1-9597-d56e72b48234")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Association_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09205546-fee3-4b89-8134-0274814ea43e")
    public boolean isHwMMU_Association_memoryProtection() {
        return this.elt.isTagged(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Association_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b71d8b4f-401e-4ae3-b3fa-c2ec83927a50")
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
    @objid ("2739e43b-b0fe-4f84-924a-e612b4ded9ff")
    public void setHwMMU_Association_nbEntries(final String value) {
        this.elt.putTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Association_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7f6f81a9-d954-46d5-99ab-b11154f97d43")
    public void setHwMMU_Association_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Association_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("649d9699-ef18-4c9c-a060-0012ea793060")
    public void setHwMMU_Association_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Association_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1cd7916-259a-41e0-b998-0c3f63b0af1f")
    public void setHwMMU_Association_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    @objid ("f4b9f4ef-038e-407f-af69-c437d8de4e58")
    protected HwMMUAssociation(final Association elt) {
        super(elt);
    }

    @objid ("356fe071-11f7-4d60-b3dd-34ad868e5064")
    public static final class MdaTypes {
        @objid ("cfeb0f78-4e76-4f7c-b11e-2d9a8e957b75")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cb36de3c-c563-4504-a2a3-557adc60fe33")
        public static TagType HWMMU_ASSOCIATION_VIRTUALADDRSPACE_TAGTYPE_ELT;

        @objid ("f4103e80-a4ee-4880-b3bd-a5569c278bf5")
        public static TagType HWMMU_ASSOCIATION_PHYSICALADDRSPACE_TAGTYPE_ELT;

        @objid ("3522d734-9402-424c-bf35-67d84b9005cc")
        public static TagType HWMMU_ASSOCIATION_NBENTRIES_TAGTYPE_ELT;

        @objid ("e256fecb-9a7f-4a27-9c02-1283b59412d6")
        public static TagType HWMMU_ASSOCIATION_OWNEDTLBS_TAGTYPE_ELT;

        @objid ("3a2ffbe3-6f8f-4b23-bce6-a58a4e5b2158")
        public static TagType HWMMU_ASSOCIATION_MEMORYPROTECTION_TAGTYPE_ELT;

        @objid ("6ad3b45f-acd3-4eaa-928a-5cbdb0f7c2f9")
        private static Stereotype MDAASSOCDEP;

        @objid ("7e650a6f-abd9-48e6-b7b3-a6a9f5fa5b12")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8658d617-e50c-4056-befa-23e404ed9931")
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
