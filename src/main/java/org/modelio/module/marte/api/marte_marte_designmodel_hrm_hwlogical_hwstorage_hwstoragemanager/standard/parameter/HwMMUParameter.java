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
    @objid ("93757273-d161-4738-adf8-ff1e9ce8467c")
    public static final String STEREOTYPE_NAME = "HwMMU_Parameter";

    @objid ("1aec415f-74a5-4d98-b61e-29d632f0ff41")
    public static final String HWMMU_PARAMETER_MEMORYPROTECTION_TAGTYPE = "HwMMU_Parameter_memoryProtection";

    @objid ("66e6342b-1e6e-4789-bfd8-d81bb1a249b9")
    public static final String HWMMU_PARAMETER_NBENTRIES_TAGTYPE = "HwMMU_Parameter_nbEntries";

    @objid ("6287f7c9-e1ba-4fd6-a594-0a8d930216bb")
    public static final String HWMMU_PARAMETER_OWNEDTLBS_TAGTYPE = "HwMMU_Parameter_ownedTLBs";

    @objid ("5edf47ba-8d94-4fee-a8ea-3d6a25836bf9")
    public static final String HWMMU_PARAMETER_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Parameter_physicalAddrSpace";

    @objid ("24a38a89-c6ab-45f3-b9c6-c7798eb03203")
    public static final String HWMMU_PARAMETER_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Parameter_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMUParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwMMU_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6a9f11a7-20e1-43d4-8c35-34cc9addf403")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwMMU_Parameter >> then instantiate a {@link HwMMUParameter} proxy.
     * 
     * @return a {@link HwMMUParameter} proxy on the created {@link Parameter}.
     */
    @objid ("08aa44eb-adc3-44a6-8f0c-276ac2030f84")
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
    @objid ("1eb0fbee-4bee-4d2f-ad16-7a67fbd6fd59")
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
    @objid ("ec5aedfe-320a-459a-bcd9-86541779a171")
    public static HwMMUParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwMMUParameter.canInstantiate(obj))
        	return new HwMMUParameter(obj);
        else
        	throw new IllegalArgumentException("HwMMUParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f6970542-8f30-47b9-b173-1cc7995f7d94")
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
    @objid ("f1485689-d90f-4a76-a587-64e14a221c27")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Parameter_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e248dc74-4f02-45db-a7c4-1b56244ddbf7")
    public String getHwMMU_Parameter_nbEntries() {
        return this.elt.getTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Parameter_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f2c226fd-e431-40ff-82cc-d423759c7620")
    public List<String> getHwMMU_Parameter_ownedTLBs() {
        return this.elt.getTagValues(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Parameter_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ddafb850-2034-4e20-9a92-ae5024429318")
    public String getHwMMU_Parameter_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Parameter_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1bc824cf-a389-45c7-8b41-d800c69129d5")
    public String getHwMMU_Parameter_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @objid ("d0e0796a-cb3c-4b4d-b2f6-e4c2e0012171")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Parameter_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6139351b-1ce6-40b7-b597-4086b9466c18")
    public boolean isHwMMU_Parameter_memoryProtection() {
        return this.elt.isTagged(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Parameter_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8298904f-1f32-4e64-943a-707a30dccf62")
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
    @objid ("f6589719-af6e-4c0c-b8dd-0483ffb5824f")
    public void setHwMMU_Parameter_nbEntries(final String value) {
        this.elt.putTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Parameter_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60cc4409-2914-4139-81df-69e1499bc182")
    public void setHwMMU_Parameter_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Parameter_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9d44276b-a3f1-45fe-97a5-e5a025ba7bd0")
    public void setHwMMU_Parameter_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Parameter_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8a25594e-2851-4fad-bbca-18a693e606b7")
    public void setHwMMU_Parameter_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUParameter.MdaTypes.HWMMU_PARAMETER_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    @objid ("56d72f6a-6c36-4cf6-8f3c-7da7fdc1aea4")
    protected HwMMUParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("a4b721ef-bfea-41d1-91b2-b474dcb6e178")
    public static final class MdaTypes {
        @objid ("97b3b7cd-bb81-4353-8006-f473915a5e2b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cb9a8bb6-27e3-4a1c-88e6-b3650328c31d")
        public static TagType HWMMU_PARAMETER_VIRTUALADDRSPACE_TAGTYPE_ELT;

        @objid ("2447d2ff-7133-4756-ad3b-4f7c4488b695")
        public static TagType HWMMU_PARAMETER_PHYSICALADDRSPACE_TAGTYPE_ELT;

        @objid ("775bda82-23e3-4595-8843-4fc32ce00c35")
        public static TagType HWMMU_PARAMETER_NBENTRIES_TAGTYPE_ELT;

        @objid ("3fb9d0c2-8252-4972-be4a-27b8b347dc7e")
        public static TagType HWMMU_PARAMETER_OWNEDTLBS_TAGTYPE_ELT;

        @objid ("280826a2-7d7b-440d-a4c7-b36c8de52485")
        public static TagType HWMMU_PARAMETER_MEMORYPROTECTION_TAGTYPE_ELT;

        @objid ("c2238572-a0bf-4a84-8093-87226ffe2783")
        private static Stereotype MDAASSOCDEP;

        @objid ("4245437c-dc45-49ea-86a9-1362a99549ad")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0261cdc1-bc83-48fa-8963-5419745f1f08")
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
