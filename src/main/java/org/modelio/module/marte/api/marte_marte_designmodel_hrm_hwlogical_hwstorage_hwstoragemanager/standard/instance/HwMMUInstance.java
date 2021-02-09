/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.instance;

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
public class HwMMUInstance extends HwStorageManagerInstance {
    public static final String STEREOTYPE_NAME = "HwMMU_Instance";

    public static final String HWMMU_INSTANCE_MEMORYPROTECTION_TAGTYPE = "HwMMU_Instance_memoryProtection";

    public static final String HWMMU_INSTANCE_NBENTRIES_TAGTYPE = "HwMMU_Instance_nbEntries";

    public static final String HWMMU_INSTANCE_OWNEDTLBS_TAGTYPE = "HwMMU_Instance_ownedTLBs";

    public static final String HWMMU_INSTANCE_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Instance_physicalAddrSpace";

    public static final String HWMMU_INSTANCE_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Instance_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMUInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwMMU_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwMMU_Instance >> then instantiate a {@link HwMMUInstance} proxy.
     * 
     * @return a {@link HwMMUInstance} proxy on the created {@link Instance}.
     */
    public static HwMMUInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUInstance.STEREOTYPE_NAME);
        return HwMMUInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwMMUInstance} proxy from a {@link Instance} stereotyped << HwMMU_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwMMUInstance} proxy or <i>null</i>.
     */
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
    public static HwMMUInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwMMUInstance.canInstantiate(obj))
        	return new HwMMUInstance(obj);
        else
        	throw new IllegalArgumentException("HwMMUInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwMMUInstance other = (HwMMUInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Instance_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Instance_nbEntries() {
        return this.elt.getTagValue(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Instance_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMMU_Instance_ownedTLBs() {
        return this.elt.getTagValues(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Instance_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Instance_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Instance_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Instance_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Instance_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwMMU_Instance_memoryProtection() {
        return this.elt.isTagged(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Instance_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setHwMMU_Instance_nbEntries(final String value) {
        this.elt.putTagValue(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Instance_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Instance_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Instance_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Instance_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Instance_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Instance_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUInstance.MdaTypes.HWMMU_INSTANCE_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    protected HwMMUInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMMU_INSTANCE_VIRTUALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_INSTANCE_PHYSICALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_INSTANCE_NBENTRIES_TAGTYPE_ELT;

        public static TagType HWMMU_INSTANCE_OWNEDTLBS_TAGTYPE_ELT;

        public static TagType HWMMU_INSTANCE_MEMORYPROTECTION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
