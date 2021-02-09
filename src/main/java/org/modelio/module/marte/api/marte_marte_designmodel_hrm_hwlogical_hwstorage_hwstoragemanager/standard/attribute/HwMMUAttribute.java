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
public class HwMMUAttribute extends HwStorageManagerAttribute {
    public static final String STEREOTYPE_NAME = "HwMMU_Attribute";

    public static final String HWMMU_ATTRIBUTE_MEMORYPROTECTION_TAGTYPE = "HwMMU_Attribute_memoryProtection";

    public static final String HWMMU_ATTRIBUTE_NBENTRIES_TAGTYPE = "HwMMU_Attribute_nbEntries";

    public static final String HWMMU_ATTRIBUTE_OWNEDTLBS_TAGTYPE = "HwMMU_Attribute_ownedTLBs";

    public static final String HWMMU_ATTRIBUTE_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Attribute_physicalAddrSpace";

    public static final String HWMMU_ATTRIBUTE_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Attribute_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMUAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwMMU_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwMMU_Attribute >> then instantiate a {@link HwMMUAttribute} proxy.
     * 
     * @return a {@link HwMMUAttribute} proxy on the created {@link Attribute}.
     */
    public static HwMMUAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUAttribute.STEREOTYPE_NAME);
        return HwMMUAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwMMUAttribute} proxy from a {@link Attribute} stereotyped << HwMMU_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwMMUAttribute} proxy or <i>null</i>.
     */
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
    public static HwMMUAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwMMUAttribute.canInstantiate(obj))
        	return new HwMMUAttribute(obj);
        else
        	throw new IllegalArgumentException("HwMMUAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwMMUAttribute other = (HwMMUAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Attribute_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Attribute_nbEntries() {
        return this.elt.getTagValue(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Attribute_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMMU_Attribute_ownedTLBs() {
        return this.elt.getTagValues(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Attribute_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Attribute_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Attribute_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Attribute_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Attribute_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwMMU_Attribute_memoryProtection() {
        return this.elt.isTagged(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Attribute_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setHwMMU_Attribute_nbEntries(final String value) {
        this.elt.putTagValue(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Attribute_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Attribute_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Attribute_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Attribute_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Attribute_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Attribute_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUAttribute.MdaTypes.HWMMU_ATTRIBUTE_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    protected HwMMUAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMMU_ATTRIBUTE_VIRTUALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_ATTRIBUTE_PHYSICALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_ATTRIBUTE_NBENTRIES_TAGTYPE_ELT;

        public static TagType HWMMU_ATTRIBUTE_OWNEDTLBS_TAGTYPE_ELT;

        public static TagType HWMMU_ATTRIBUTE_MEMORYPROTECTION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
