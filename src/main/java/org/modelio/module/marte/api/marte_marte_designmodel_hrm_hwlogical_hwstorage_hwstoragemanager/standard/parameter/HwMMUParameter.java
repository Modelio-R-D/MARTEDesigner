/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.parameter;

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
@objid ("3c0755ab-822b-4a94-8a54-dded929a6efa")
public class HwMMUParameter extends HwStorageManagerParameter {
    @objid ("4e61f3c0-55c1-4a50-9c97-c43d80ac1994")
    public static final String STEREOTYPE_NAME = "HwMMU_Parameter";

    @objid ("d3c1ce24-53e9-43ea-8a3c-17c594ffa2e6")
    public static final String HWMMU_PARAMETER_MEMORYPROTECTION_TAGTYPE = "HwMMU_Parameter_memoryProtection";

    @objid ("50245947-a12b-4fd0-84af-9a1fe20b028e")
    public static final String HWMMU_PARAMETER_NBENTRIES_TAGTYPE = "HwMMU_Parameter_nbEntries";

    @objid ("a36a9932-29de-4fa9-a926-581bc81a40ba")
    public static final String HWMMU_PARAMETER_OWNEDTLBS_TAGTYPE = "HwMMU_Parameter_ownedTLBs";

    @objid ("15602105-229d-4109-b7cf-42ea6b98c88d")
    public static final String HWMMU_PARAMETER_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Parameter_physicalAddrSpace";

    @objid ("82434eea-545e-44c6-af68-eb15d499f510")
    public static final String HWMMU_PARAMETER_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Parameter_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMUParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwMMU_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bf08358b-b794-47b5-b7e4-a8e8a5d0882c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwMMU_Parameter >> then instantiate a {@link HwMMUParameter} proxy.
     * 
     * @return a {@link HwMMUParameter} proxy on the created {@link Parameter}.
     */
    @objid ("4dc959c8-9fcb-434c-b680-784590c476ba")
    public static HwMMUParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUParameter.STEREOTYPE_NAME);
        return HwMMUParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwMMUParameter} proxy from a {@link Parameter} stereotyped << HwMMU_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwMMUParameter} proxy or <i>null</i>.
     */
    @objid ("a2526036-b975-409c-a06d-573f0c510413")
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
    @objid ("3668ea53-7767-49e3-a441-99bc1832ddc5")
    public static HwMMUParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwMMUParameter.canInstantiate(obj))
        	return new HwMMUParameter(obj);
        else
        	throw new IllegalArgumentException("HwMMUParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fe62b450-329c-4274-8434-010f8d3c946b")
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
    @objid ("dd721d18-2c79-41f2-beea-dba940c32dbd")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Parameter_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8aedac69-fbaa-4f24-87a6-673c6b13ddb2")
    public String getHwMMU_Parameter_nbEntries() {
        return this.elt.getTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Parameter_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fadc4efb-863b-4713-a81b-a20905b8d099")
    public List<String> getHwMMU_Parameter_ownedTLBs() {
        return this.elt.getTagValues(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Parameter_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0172025d-0162-4e26-aa39-13a4e978f6d1")
    public String getHwMMU_Parameter_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Parameter_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e27efd5a-b549-4787-bd84-0ac3fba117fc")
    public String getHwMMU_Parameter_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @objid ("40db1cda-1582-431c-b46f-25986b3d5ef8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Parameter_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("daf9d3b2-a794-474a-8d62-9e70b97d0e4d")
    public boolean isHwMMU_Parameter_memoryProtection() {
        return this.elt.isTagged(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Parameter_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("86fbe087-d8cb-4bf7-8a9b-e7990ddc517d")
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
    @objid ("197f8305-d784-4a6a-bec3-72f14268b19d")
    public void setHwMMU_Parameter_nbEntries(final String value) {
        this.elt.putTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Parameter_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("88996072-49c7-488b-8565-063eae788961")
    public void setHwMMU_Parameter_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Parameter_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0b9a7de-f325-4ede-a4eb-96433e8e5993")
    public void setHwMMU_Parameter_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Parameter_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2253323c-51ac-4db3-bad7-0f9ade5e82b6")
    public void setHwMMU_Parameter_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    @objid ("3fbb9a1c-7bc9-4d93-af81-480c15807b88")
    protected HwMMUParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("a4b721ef-bfea-41d1-91b2-b474dcb6e178")
    public static final class MdaTypes {
        @objid ("323e5682-cb69-44c8-89f5-d15c0ee96c51")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dc6886ff-c6d9-4a08-8ffa-4e55a9124372")
        public static TagType HWMMU_PARAMETER_VIRTUALADDRSPACE_TAGTYPE_ELT;

        @objid ("7e5375cc-30bc-4c77-af45-7cf6d3705096")
        public static TagType HWMMU_PARAMETER_PHYSICALADDRSPACE_TAGTYPE_ELT;

        @objid ("4bd281ee-ffdf-4bad-b2bb-cd92b6441a79")
        public static TagType HWMMU_PARAMETER_NBENTRIES_TAGTYPE_ELT;

        @objid ("e1b1e6a3-cc55-416c-8c0e-4b2dd0c39caf")
        public static TagType HWMMU_PARAMETER_OWNEDTLBS_TAGTYPE_ELT;

        @objid ("292df265-1746-4780-b76b-3398250fc581")
        public static TagType HWMMU_PARAMETER_MEMORYPROTECTION_TAGTYPE_ELT;

        @objid ("febaf2ea-5d82-4bc3-914c-b2a10293b0a3")
        private static Stereotype MDAASSOCDEP;

        @objid ("113bc346-0c3c-4d35-ae1e-c42d71321a9f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e4b175d8-219c-4386-9c7b-d07d1e405870")
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
