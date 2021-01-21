/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwMMU_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("90aab6f8-1446-4963-86aa-08b9f1fdfaad")
public class HwMMUInstance extends HwStorageManagerInstance {
    @objid ("ede967aa-b441-45db-83bf-50ee9fa3fb63")
    public static final String STEREOTYPE_NAME = "HwMMU_Instance";

    @objid ("d2e600ff-7385-4039-a2ce-238dcd00605d")
    public static final String HWMMU_INSTANCE_MEMORYPROTECTION_TAGTYPE = "HwMMU_Instance_memoryProtection";

    @objid ("79afed15-3287-43b5-a013-ee48b9c3f828")
    public static final String HWMMU_INSTANCE_NBENTRIES_TAGTYPE = "HwMMU_Instance_nbEntries";

    @objid ("e0f79ba2-c40b-43b1-9688-7db70e3413b4")
    public static final String HWMMU_INSTANCE_OWNEDTLBS_TAGTYPE = "HwMMU_Instance_ownedTLBs";

    @objid ("611b45e0-58df-48d5-a86a-5f2f4bd3b9d1")
    public static final String HWMMU_INSTANCE_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Instance_physicalAddrSpace";

    @objid ("076a1128-4bde-4eaa-b016-c5673b94eaeb")
    public static final String HWMMU_INSTANCE_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Instance_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMUInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwMMU_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f130a4f6-76b9-41bd-85b5-248862ddec19")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwMMU_Instance >> then instantiate a {@link HwMMUInstance} proxy.
     * 
     * @return a {@link HwMMUInstance} proxy on the created {@link Instance}.
     */
    @objid ("07fff841-604c-4938-b5d3-dabe2c929f6a")
    public static HwMMUInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUInstance.STEREOTYPE_NAME);
        return HwMMUInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwMMUInstance} proxy from a {@link Instance} stereotyped << HwMMU_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwMMUInstance} proxy or <i>null</i>.
     */
    @objid ("41454a8e-2561-48f4-a7e5-d2c039e5f7fa")
    public static HwMMUInstance instantiate(final Instance obj) {
        return HwMMUInstance.canInstantiate(obj) ? new HwMMUInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMMUInstance} proxy from a {@link Instance} stereotyped << HwMMU_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwMMUInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2088c756-9868-4a0e-a0a3-35275e93b212")
    public static HwMMUInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwMMUInstance.canInstantiate(obj))
        	return new HwMMUInstance(obj);
        else
        	throw new IllegalArgumentException("HwMMUInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a97331cc-2b9e-4af8-833a-88d34ea439ba")
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
        HwMMUInstance other = (HwMMUInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("721fcf0a-b10f-465e-a67a-fda38dfbb536")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Instance_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5fa8d17a-154e-4be0-a1bb-e1ce1f6d2fd1")
    public String getHwMMU_Instance_nbEntries() {
        return this.elt.getTagValue(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Instance_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a3ad7d5f-771b-46f8-874a-bbbc3fd455f9")
    public List<String> getHwMMU_Instance_ownedTLBs() {
        return this.elt.getTagValues(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Instance_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0dc9ef87-8b20-4260-929a-aee6913421a0")
    public String getHwMMU_Instance_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Instance_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("10128e18-99a8-4712-be3d-ec75b7eb7353")
    public String getHwMMU_Instance_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @objid ("643342de-d1eb-44de-948d-09725eefcb9c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Instance_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d163c592-b171-4364-bf02-64e3db530b2c")
    public boolean isHwMMU_Instance_memoryProtection() {
        return this.elt.isTagged(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Instance_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d813ba4c-2dfa-4791-8796-a4a1cfeece51")
    public void setHwMMU_Instance_memoryProtection(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_MEMORYPROTECTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwMMU_Instance_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2643672b-49e1-4aa9-9cb5-dafac12eb453")
    public void setHwMMU_Instance_nbEntries(final String value) {
        this.elt.putTagValue(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Instance_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76b29f7e-a3e6-4676-9665-cce8d5deb78e")
    public void setHwMMU_Instance_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Instance_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b241c60d-7dbe-4d00-8848-4f4da04d18c2")
    public void setHwMMU_Instance_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Instance_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e8855c27-0ced-40b8-8853-d37a86664c4e")
    public void setHwMMU_Instance_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    @objid ("4c981c57-ef0c-4f58-ad62-1034bead7953")
    protected HwMMUInstance(final Instance elt) {
        super(elt);
    }

    @objid ("0bec96f4-55dc-4beb-b55d-737b5e4ce0d9")
    public static final class MdaTypes {
        @objid ("a2d2c509-e4b1-49be-a972-88d1f1f4fcd1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ac746cc3-979d-4a24-95e0-6ce8975bf9bd")
        public static TagType HWMMU_INSTANCE_VIRTUALADDRSPACE_TAGTYPE_ELT;

        @objid ("3fa26c1e-1f04-4034-b75e-8dcc0b463e56")
        public static TagType HWMMU_INSTANCE_PHYSICALADDRSPACE_TAGTYPE_ELT;

        @objid ("7418a1b2-84fe-4057-bf21-eda563dd3121")
        public static TagType HWMMU_INSTANCE_NBENTRIES_TAGTYPE_ELT;

        @objid ("d19d8763-e4e0-4a07-a0a1-15ff6fdd2f1e")
        public static TagType HWMMU_INSTANCE_OWNEDTLBS_TAGTYPE_ELT;

        @objid ("0c0a826b-181c-4918-8427-112ac52ab774")
        public static TagType HWMMU_INSTANCE_MEMORYPROTECTION_TAGTYPE_ELT;

        @objid ("10d64029-d556-4520-a60f-cc0bd84d61a6")
        private static Stereotype MDAASSOCDEP;

        @objid ("a24d33b8-330b-4ad5-a4b5-50fa6273bf38")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6e470371-b744-4e9c-b327-191c241e7c5f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01842837-0ccf-11df-8525-001302895b2b");
            HWMMU_INSTANCE_VIRTUALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0184283e-0ccf-11df-8525-001302895b2b");
            HWMMU_INSTANCE_PHYSICALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01842845-0ccf-11df-8525-001302895b2b");
            HWMMU_INSTANCE_NBENTRIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01842853-0ccf-11df-8525-001302895b2b");
            HWMMU_INSTANCE_OWNEDTLBS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0184285a-0ccf-11df-8525-001302895b2b");
            HWMMU_INSTANCE_MEMORYPROTECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d12e74bd-1710-11df-b92a-0014222a9f79");
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
