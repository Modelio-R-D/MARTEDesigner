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
public class HwMMUAssociation extends HwStorageManagerAssociation {
    public static final String STEREOTYPE_NAME = "HwMMU_Association";

    public static final String HWMMU_ASSOCIATION_MEMORYPROTECTION_TAGTYPE = "HwMMU_Association_memoryProtection";

    public static final String HWMMU_ASSOCIATION_NBENTRIES_TAGTYPE = "HwMMU_Association_nbEntries";

    public static final String HWMMU_ASSOCIATION_OWNEDTLBS_TAGTYPE = "HwMMU_Association_ownedTLBs";

    public static final String HWMMU_ASSOCIATION_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Association_physicalAddrSpace";

    public static final String HWMMU_ASSOCIATION_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Association_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMUAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwMMU_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwMMU_Association >> then instantiate a {@link HwMMUAssociation} proxy.
     * 
     * @return a {@link HwMMUAssociation} proxy on the created {@link Association}.
     */
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
    public static HwMMUAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwMMUAssociation.canInstantiate(obj))
        	return new HwMMUAssociation(obj);
        else
        	throw new IllegalArgumentException("HwMMUAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwMMUAssociation other = (HwMMUAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Association_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Association_nbEntries() {
        return this.elt.getTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Association_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMMU_Association_ownedTLBs() {
        return this.elt.getTagValues(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Association_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Association_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Association_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Association_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Association_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwMMU_Association_memoryProtection() {
        return this.elt.isTagged(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Association_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setHwMMU_Association_nbEntries(final String value) {
        this.elt.putTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Association_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Association_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Association_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Association_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Association_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Association_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUAssociation.MdaTypes.HWMMU_ASSOCIATION_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    protected HwMMUAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMMU_ASSOCIATION_VIRTUALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_ASSOCIATION_PHYSICALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_ASSOCIATION_NBENTRIES_TAGTYPE_ELT;

        public static TagType HWMMU_ASSOCIATION_OWNEDTLBS_TAGTYPE_ELT;

        public static TagType HWMMU_ASSOCIATION_MEMORYPROTECTION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
