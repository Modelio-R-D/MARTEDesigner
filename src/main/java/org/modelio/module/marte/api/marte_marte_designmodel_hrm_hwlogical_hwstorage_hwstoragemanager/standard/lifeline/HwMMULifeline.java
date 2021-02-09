/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwMMU_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwMMULifeline extends HwStorageManagerLifeline {
    public static final String STEREOTYPE_NAME = "HwMMU_Lifeline";

    public static final String HWMMU_LIFELINE_MEMORYPROTECTION_TAGTYPE = "HwMMU_Lifeline_memoryProtection";

    public static final String HWMMU_LIFELINE_NBENTRIES_TAGTYPE = "HwMMU_Lifeline_nbEntries";

    public static final String HWMMU_LIFELINE_OWNEDTLBS_TAGTYPE = "HwMMU_Lifeline_ownedTLBs";

    public static final String HWMMU_LIFELINE_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Lifeline_physicalAddrSpace";

    public static final String HWMMU_LIFELINE_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Lifeline_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMULifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwMMU_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMULifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwMMU_Lifeline >> then instantiate a {@link HwMMULifeline} proxy.
     * 
     * @return a {@link HwMMULifeline} proxy on the created {@link Lifeline}.
     */
    public static HwMMULifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMULifeline.STEREOTYPE_NAME);
        return HwMMULifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwMMULifeline} proxy from a {@link Lifeline} stereotyped << HwMMU_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwMMULifeline} proxy or <i>null</i>.
     */
    public static HwMMULifeline instantiate(final Lifeline obj) {
        return HwMMULifeline.canInstantiate(obj) ? new HwMMULifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMMULifeline} proxy from a {@link Lifeline} stereotyped << HwMMU_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwMMULifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwMMULifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwMMULifeline.canInstantiate(obj))
        	return new HwMMULifeline(obj);
        else
        	throw new IllegalArgumentException("HwMMULifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwMMULifeline other = (HwMMULifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Lifeline_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Lifeline_nbEntries() {
        return this.elt.getTagValue(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Lifeline_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMMU_Lifeline_ownedTLBs() {
        return this.elt.getTagValues(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Lifeline_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Lifeline_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Lifeline_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Lifeline_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Lifeline_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwMMU_Lifeline_memoryProtection() {
        return this.elt.isTagged(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Lifeline_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Lifeline_memoryProtection(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_MEMORYPROTECTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwMMU_Lifeline_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Lifeline_nbEntries(final String value) {
        this.elt.putTagValue(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Lifeline_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Lifeline_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Lifeline_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Lifeline_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Lifeline_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Lifeline_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    protected HwMMULifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMMU_LIFELINE_VIRTUALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_LIFELINE_PHYSICALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_LIFELINE_NBENTRIES_TAGTYPE_ELT;

        public static TagType HWMMU_LIFELINE_OWNEDTLBS_TAGTYPE_ELT;

        public static TagType HWMMU_LIFELINE_MEMORYPROTECTION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "47cc066e-10b3-11df-81d9-0014222a9f79");
            HWMMU_LIFELINE_VIRTUALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "47cc066f-10b3-11df-81d9-0014222a9f79");
            HWMMU_LIFELINE_PHYSICALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "47cc0670-10b3-11df-81d9-0014222a9f79");
            HWMMU_LIFELINE_NBENTRIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "47cc0672-10b3-11df-81d9-0014222a9f79");
            HWMMU_LIFELINE_OWNEDTLBS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "47cc0673-10b3-11df-81d9-0014222a9f79");
            HWMMU_LIFELINE_MEMORYPROTECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0531bad-1710-11df-b92a-0014222a9f79");
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
