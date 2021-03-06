/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwMMU_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwMMULink extends HwStorageManagerLink {
    public static final String STEREOTYPE_NAME = "HwMMU_Link";

    public static final String HWMMU_LINK_MEMORYPROTECTION_TAGTYPE = "HwMMU_Link_memoryProtection";

    public static final String HWMMU_LINK_NBENTRIES_TAGTYPE = "HwMMU_Link_nbEntries";

    public static final String HWMMU_LINK_OWNEDTLBS_TAGTYPE = "HwMMU_Link_ownedTLBs";

    public static final String HWMMU_LINK_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Link_physicalAddrSpace";

    public static final String HWMMU_LINK_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Link_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMULink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwMMU_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMULink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwMMU_Link >> then instantiate a {@link HwMMULink} proxy.
     * 
     * @return a {@link HwMMULink} proxy on the created {@link Link}.
     */
    public static HwMMULink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMULink.STEREOTYPE_NAME);
        return HwMMULink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwMMULink} proxy from a {@link Link} stereotyped << HwMMU_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwMMULink} proxy or <i>null</i>.
     */
    public static HwMMULink instantiate(final Link obj) {
        return HwMMULink.canInstantiate(obj) ? new HwMMULink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMMULink} proxy from a {@link Link} stereotyped << HwMMU_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwMMULink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwMMULink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwMMULink.canInstantiate(obj))
        	return new HwMMULink(obj);
        else
        	throw new IllegalArgumentException("HwMMULink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwMMULink other = (HwMMULink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Link_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Link_nbEntries() {
        return this.elt.getTagValue(HwMMULink.MdaTypes.HWMMU_LINK_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Link_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMMU_Link_ownedTLBs() {
        return this.elt.getTagValues(HwMMULink.MdaTypes.HWMMU_LINK_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Link_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Link_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMULink.MdaTypes.HWMMU_LINK_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Link_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Link_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMULink.MdaTypes.HWMMU_LINK_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Link_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwMMU_Link_memoryProtection() {
        return this.elt.isTagged(HwMMULink.MdaTypes.HWMMU_LINK_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Link_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Link_memoryProtection(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwMMULink.MdaTypes.HWMMU_LINK_MEMORYPROTECTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwMMULink.MdaTypes.HWMMU_LINK_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwMMU_Link_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Link_nbEntries(final String value) {
        this.elt.putTagValue(HwMMULink.MdaTypes.HWMMU_LINK_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Link_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Link_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMULink.MdaTypes.HWMMU_LINK_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Link_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Link_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMULink.MdaTypes.HWMMU_LINK_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Link_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Link_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMULink.MdaTypes.HWMMU_LINK_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    protected HwMMULink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMMU_LINK_VIRTUALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_LINK_PHYSICALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_LINK_NBENTRIES_TAGTYPE_ELT;

        public static TagType HWMMU_LINK_OWNEDTLBS_TAGTYPE_ELT;

        public static TagType HWMMU_LINK_MEMORYPROTECTION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01842836-0ccf-11df-8525-001302895b2b");
            HWMMU_LINK_VIRTUALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0184283d-0ccf-11df-8525-001302895b2b");
            HWMMU_LINK_PHYSICALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01842844-0ccf-11df-8525-001302895b2b");
            HWMMU_LINK_NBENTRIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01842852-0ccf-11df-8525-001302895b2b");
            HWMMU_LINK_OWNEDTLBS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01842859-0ccf-11df-8525-001302895b2b");
            HWMMU_LINK_MEMORYPROTECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cf5feb05-1710-11df-b92a-0014222a9f79");
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
