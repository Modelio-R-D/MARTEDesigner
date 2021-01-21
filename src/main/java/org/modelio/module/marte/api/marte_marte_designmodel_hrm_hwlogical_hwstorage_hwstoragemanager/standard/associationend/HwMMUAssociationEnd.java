/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.associationend;

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
@objid ("ed42e2fe-9e7d-46b8-861f-c087a5956e6a")
public class HwMMUAssociationEnd extends HwStorageManagerAssociationEnd {
    @objid ("0f092d1e-20f6-48ec-8b2d-b86e75a36784")
    public static final String STEREOTYPE_NAME = "HwMMU_AssociationEnd";

    @objid ("010751e7-6d7a-40cd-abb8-c1d3ebd13923")
    public static final String HWMMU_ASSOCIATIONEND_MEMORYPROTECTION_TAGTYPE = "HwMMU_AssociationEnd_memoryProtection";

    @objid ("65964275-b1de-4c63-8813-4b5e93b8d9b1")
    public static final String HWMMU_ASSOCIATIONEND_NBENTRIES_TAGTYPE = "HwMMU_AssociationEnd_nbEntries";

    @objid ("d551d2a8-c0fa-45d9-b929-4b7e6a3c0ed9")
    public static final String HWMMU_ASSOCIATIONEND_OWNEDTLBS_TAGTYPE = "HwMMU_AssociationEnd_ownedTLBs";

    @objid ("37d91d22-9b37-4db5-8a41-f4fd48a8d5b8")
    public static final String HWMMU_ASSOCIATIONEND_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_AssociationEnd_physicalAddrSpace";

    @objid ("7f1d7fdd-c8c8-4814-84c9-ca7bec3c620f")
    public static final String HWMMU_ASSOCIATIONEND_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_AssociationEnd_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMUAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwMMU_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e35f0fbe-01ed-4d85-9e77-9af6cba8345b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwMMU_AssociationEnd >> then instantiate a {@link HwMMUAssociationEnd} proxy.
     * 
     * @return a {@link HwMMUAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("2ed24c59-e3ce-4324-a79e-05f6aecc6b83")
    public static HwMMUAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUAssociationEnd.STEREOTYPE_NAME);
        return HwMMUAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwMMUAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwMMU_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwMMUAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("60363b7a-0c6b-4e2f-8ef7-4732418924be")
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
    @objid ("c690a4ff-5041-4320-8c29-3fd17c9cf2f0")
    public static HwMMUAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwMMUAssociationEnd.canInstantiate(obj))
        	return new HwMMUAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwMMUAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8d58ca63-4f35-4ac6-9bd5-a763b36a22b5")
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
    @objid ("1b34c99a-0c9e-45e0-ac99-c890e8989ac6")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_AssociationEnd_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c2e1e6e-7603-42ef-af57-4d5f4794573d")
    public String getHwMMU_AssociationEnd_nbEntries() {
        return this.elt.getTagValue(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_AssociationEnd_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f3179519-3e1d-475e-b90f-aa29342bee91")
    public List<String> getHwMMU_AssociationEnd_ownedTLBs() {
        return this.elt.getTagValues(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_AssociationEnd_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8254dcce-3725-4ed2-854e-41406c84637d")
    public String getHwMMU_AssociationEnd_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_AssociationEnd_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("795c92fd-3e1a-42a3-9caa-e4233cc51904")
    public String getHwMMU_AssociationEnd_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @objid ("6fadf495-2196-4a69-803e-0c9bf8531667")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_AssociationEnd_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2efc620d-9c63-445e-823d-a4e32e217075")
    public boolean isHwMMU_AssociationEnd_memoryProtection() {
        return this.elt.isTagged(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_AssociationEnd_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0ea88f2e-677b-4c60-ad44-0e16894fecd4")
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
    @objid ("07d3aa11-ab69-4a23-9fdc-7338b379b454")
    public void setHwMMU_AssociationEnd_nbEntries(final String value) {
        this.elt.putTagValue(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_AssociationEnd_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("525babe8-ca68-4eee-9d77-0f0e9c3e4e06")
    public void setHwMMU_AssociationEnd_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_AssociationEnd_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe041feb-aa13-4b84-bfb9-8febff1274af")
    public void setHwMMU_AssociationEnd_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_AssociationEnd_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("05002efa-1b0d-4283-9365-2f1dfca28555")
    public void setHwMMU_AssociationEnd_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUAssociationEnd.MdaTypes.HWMMU_ASSOCIATIONEND_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    @objid ("09d3904d-15ee-4e76-b22a-23fabcad2c1c")
    protected HwMMUAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("206fb317-8aa3-4894-b6f4-88aa0128a315")
    public static final class MdaTypes {
        @objid ("d1badd4f-10ee-4e47-ac73-8ca00745ddf5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2334646c-5321-4828-aaea-9a5d53e8a5be")
        public static TagType HWMMU_ASSOCIATIONEND_VIRTUALADDRSPACE_TAGTYPE_ELT;

        @objid ("ccd6fe86-3d12-4102-9d8c-8deed781810f")
        public static TagType HWMMU_ASSOCIATIONEND_PHYSICALADDRSPACE_TAGTYPE_ELT;

        @objid ("01a248f4-1794-447d-80a3-0a57932757c4")
        public static TagType HWMMU_ASSOCIATIONEND_MEMORYPROTECTION_TAGTYPE_ELT;

        @objid ("4072ac46-299f-4198-8254-f13fa42069cb")
        public static TagType HWMMU_ASSOCIATIONEND_NBENTRIES_TAGTYPE_ELT;

        @objid ("5c518711-3caf-425c-bd25-8984bea0b05d")
        public static TagType HWMMU_ASSOCIATIONEND_OWNEDTLBS_TAGTYPE_ELT;

        @objid ("3790b6b4-d06e-4eb8-9f67-ebb7e16d3ca9")
        private static Stereotype MDAASSOCDEP;

        @objid ("084d2f7c-a62b-4362-ab04-8d4842cfec42")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("05529b0b-a08e-440c-86db-8dd97fa58969")
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
