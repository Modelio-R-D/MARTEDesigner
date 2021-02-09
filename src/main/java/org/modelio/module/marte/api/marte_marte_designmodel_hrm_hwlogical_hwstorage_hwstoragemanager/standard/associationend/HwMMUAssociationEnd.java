/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwMMU_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwMMUAssociationEnd extends HwStorageManagerAssociationEnd {
    public static final String STEREOTYPE_NAME = "HwMMU_AssociationEnd";

    public static final String HWMMU_ASSOCIATIONEND_MEMORYPROTECTION_TAGTYPE = "HwMMU_AssociationEnd_memoryProtection";

    public static final String HWMMU_ASSOCIATIONEND_NBENTRIES_TAGTYPE = "HwMMU_AssociationEnd_nbEntries";

    public static final String HWMMU_ASSOCIATIONEND_OWNEDTLBS_TAGTYPE = "HwMMU_AssociationEnd_ownedTLBs";

    public static final String HWMMU_ASSOCIATIONEND_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_AssociationEnd_physicalAddrSpace";

    public static final String HWMMU_ASSOCIATIONEND_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_AssociationEnd_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMUAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwMMU_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwMMU_AssociationEnd >> then instantiate a {@link HwMMUAssociationEnd} proxy.
     * 
     * @return a {@link HwMMUAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static HwMMUAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUAssociationEnd.STEREOTYPE_NAME);
        return HwMMUAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwMMUAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwMMU_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwMMUAssociationEnd} proxy or <i>null</i>.
     */
    public static HwMMUAssociationEnd instantiate(final AssociationEnd obj) {
        return HwMMUAssociationEnd.canInstantiate(obj) ? new HwMMUAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMMUAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwMMU_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwMMUAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwMMUAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwMMUAssociationEnd.canInstantiate(obj))
        	return new HwMMUAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwMMUAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwMMUAssociationEnd other = (HwMMUAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_AssociationEnd_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_AssociationEnd_nbEntries() {
        return this.elt.getTagValue(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_AssociationEnd_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMMU_AssociationEnd_ownedTLBs() {
        return this.elt.getTagValues(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_AssociationEnd_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_AssociationEnd_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_AssociationEnd_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_AssociationEnd_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_AssociationEnd_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwMMU_AssociationEnd_memoryProtection() {
        return this.elt.isTagged(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_AssociationEnd_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_AssociationEnd_memoryProtection(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_MEMORYPROTECTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwMMU_AssociationEnd_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_AssociationEnd_nbEntries(final String value) {
        this.elt.putTagValue(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_AssociationEnd_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_AssociationEnd_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_AssociationEnd_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_AssociationEnd_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_AssociationEnd_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_AssociationEnd_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    protected HwMMUAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMMU_ASSOCIATIONEND_VIRTUALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_ASSOCIATIONEND_PHYSICALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_ASSOCIATIONEND_MEMORYPROTECTION_TAGTYPE_ELT;

        public static TagType HWMMU_ASSOCIATIONEND_NBENTRIES_TAGTYPE_ELT;

        public static TagType HWMMU_ASSOCIATIONEND_OWNEDTLBS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01842832-0ccf-11df-8525-001302895b2b");
            HWMMU_ASSOCIATIONEND_VIRTUALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01842839-0ccf-11df-8525-001302895b2b");
            HWMMU_ASSOCIATIONEND_PHYSICALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01842840-0ccf-11df-8525-001302895b2b");
            HWMMU_ASSOCIATIONEND_MEMORYPROTECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01842847-0ccf-11df-8525-001302895b2b");
            HWMMU_ASSOCIATIONEND_NBENTRIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0184284e-0ccf-11df-8525-001302895b2b");
            HWMMU_ASSOCIATIONEND_OWNEDTLBS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01842855-0ccf-11df-8525-001302895b2b");
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
