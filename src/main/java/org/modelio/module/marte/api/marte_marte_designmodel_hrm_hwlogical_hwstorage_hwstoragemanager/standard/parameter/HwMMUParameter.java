/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwMMU_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwMMUParameter extends HwStorageManagerParameter {
    public static final String STEREOTYPE_NAME = "HwMMU_Parameter";

    public static final String HWMMU_PARAMETER_MEMORYPROTECTION_TAGTYPE = "HwMMU_Parameter_memoryProtection";

    public static final String HWMMU_PARAMETER_NBENTRIES_TAGTYPE = "HwMMU_Parameter_nbEntries";

    public static final String HWMMU_PARAMETER_OWNEDTLBS_TAGTYPE = "HwMMU_Parameter_ownedTLBs";

    public static final String HWMMU_PARAMETER_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Parameter_physicalAddrSpace";

    public static final String HWMMU_PARAMETER_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Parameter_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMUParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwMMU_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwMMU_Parameter >> then instantiate a {@link HwMMUParameter} proxy.
     * 
     * @return a {@link HwMMUParameter} proxy on the created {@link Parameter}.
     */
    public static HwMMUParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUParameter.STEREOTYPE_NAME);
        return HwMMUParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwMMUParameter} proxy from a {@link Parameter} stereotyped << HwMMU_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwMMUParameter} proxy or <i>null</i>.
     */
    public static HwMMUParameter instantiate(final Parameter obj) {
        return HwMMUParameter.canInstantiate(obj) ? new HwMMUParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMMUParameter} proxy from a {@link Parameter} stereotyped << HwMMU_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwMMUParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwMMUParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwMMUParameter.canInstantiate(obj))
        	return new HwMMUParameter(obj);
        else
        	throw new IllegalArgumentException("HwMMUParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwMMUParameter other = (HwMMUParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Parameter_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Parameter_nbEntries() {
        return this.elt.getTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Parameter_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMMU_Parameter_ownedTLBs() {
        return this.elt.getTagValues(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Parameter_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Parameter_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Parameter_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Parameter_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Parameter_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwMMU_Parameter_memoryProtection() {
        return this.elt.isTagged(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Parameter_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Parameter_memoryProtection(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_MEMORYPROTECTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwMMU_Parameter_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Parameter_nbEntries(final String value) {
        this.elt.putTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Parameter_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Parameter_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Parameter_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Parameter_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Parameter_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Parameter_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    protected HwMMUParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMMU_PARAMETER_VIRTUALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_PARAMETER_PHYSICALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_PARAMETER_NBENTRIES_TAGTYPE_ELT;

        public static TagType HWMMU_PARAMETER_OWNEDTLBS_TAGTYPE_ELT;

        public static TagType HWMMU_PARAMETER_MEMORYPROTECTION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "017f638e-0ccf-11df-8525-001302895b2b");
            HWMMU_PARAMETER_VIRTUALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01842838-0ccf-11df-8525-001302895b2b");
            HWMMU_PARAMETER_PHYSICALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0184283f-0ccf-11df-8525-001302895b2b");
            HWMMU_PARAMETER_NBENTRIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0184284d-0ccf-11df-8525-001302895b2b");
            HWMMU_PARAMETER_OWNEDTLBS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01842854-0ccf-11df-8525-001302895b2b");
            HWMMU_PARAMETER_MEMORYPROTECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce3381bd-1710-11df-b92a-0014222a9f79");
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
