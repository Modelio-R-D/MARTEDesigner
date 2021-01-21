/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.link;

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
@objid ("33470ede-bc76-4057-98a0-beb847c1fa70")
public class HwMMULink extends HwStorageManagerLink {
    @objid ("8fc335f1-5173-44d0-9b18-332e1d7c1647")
    public static final String STEREOTYPE_NAME = "HwMMU_Link";

    @objid ("2d6d91bd-76fb-4a8f-8bf3-55ce2ead9114")
    public static final String HWMMU_LINK_MEMORYPROTECTION_TAGTYPE = "HwMMU_Link_memoryProtection";

    @objid ("b9fead91-89c8-44aa-ac0d-afe99d87daad")
    public static final String HWMMU_LINK_NBENTRIES_TAGTYPE = "HwMMU_Link_nbEntries";

    @objid ("a0239be7-2567-47b2-aca3-cd78df14e28b")
    public static final String HWMMU_LINK_OWNEDTLBS_TAGTYPE = "HwMMU_Link_ownedTLBs";

    @objid ("73fbbf34-923e-472c-858a-b3aa4ccf38d7")
    public static final String HWMMU_LINK_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Link_physicalAddrSpace";

    @objid ("07ff7806-f0ca-48d1-aa85-9a3d874bee08")
    public static final String HWMMU_LINK_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Link_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMULink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwMMU_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("49123836-3967-4f24-b9f8-06cb0c35c226")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMULink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwMMU_Link >> then instantiate a {@link HwMMULink} proxy.
     * 
     * @return a {@link HwMMULink} proxy on the created {@link Link}.
     */
    @objid ("f96a06d2-1b41-40a4-96a3-6a5a2622915f")
    public static HwMMULink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMULink.STEREOTYPE_NAME);
        return HwMMULink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwMMULink} proxy from a {@link Link} stereotyped << HwMMU_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwMMULink} proxy or <i>null</i>.
     */
    @objid ("71ab0545-8309-42c5-90cf-9385837ec715")
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
    @objid ("135af6eb-d9e1-4e5b-8f71-5d5f39273913")
    public static HwMMULink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwMMULink.canInstantiate(obj))
        	return new HwMMULink(obj);
        else
        	throw new IllegalArgumentException("HwMMULink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7dc665b6-08f0-438a-830c-f505e371f255")
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
    @objid ("91c292e5-ab87-4570-a037-5ac9ed4c8e6d")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Link_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dbfbef66-c2ee-4c0c-ae38-41e2819cc0e5")
    public String getHwMMU_Link_nbEntries() {
        return this.elt.getTagValue(HwMMULink.MdaTypes.HWMMU_LINK_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Link_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f057cb85-6c38-42ff-beb0-502e8ddd5860")
    public List<String> getHwMMU_Link_ownedTLBs() {
        return this.elt.getTagValues(HwMMULink.MdaTypes.HWMMU_LINK_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Link_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("972713ee-df53-4ab0-9d9b-75a8ccb39814")
    public String getHwMMU_Link_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMULink.MdaTypes.HWMMU_LINK_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Link_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c8328c3-84e9-4041-9e1d-e63d8c5d8ecb")
    public String getHwMMU_Link_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMULink.MdaTypes.HWMMU_LINK_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @objid ("665dbec6-485e-4996-8485-0e134e9cc789")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Link_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6e5af44d-caf9-4693-9664-8e57c231bd72")
    public boolean isHwMMU_Link_memoryProtection() {
        return this.elt.isTagged(HwMMULink.MdaTypes.HWMMU_LINK_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Link_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a873a464-c324-4641-8076-d936dcd2a8e7")
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
    @objid ("deb39a8e-daf0-4f9c-8605-2038b78fed38")
    public void setHwMMU_Link_nbEntries(final String value) {
        this.elt.putTagValue(HwMMULink.MdaTypes.HWMMU_LINK_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Link_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4c8aa8fe-fb4e-4981-aafe-39d0189127c4")
    public void setHwMMU_Link_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMULink.MdaTypes.HWMMU_LINK_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Link_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("837564d7-3c86-4e7c-98a2-50a34d8a0499")
    public void setHwMMU_Link_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMULink.MdaTypes.HWMMU_LINK_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Link_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("510df670-85f9-4354-927b-6b486cbc8f82")
    public void setHwMMU_Link_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMULink.MdaTypes.HWMMU_LINK_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    @objid ("465e0918-51f6-42d5-a5da-917746ce63a9")
    protected HwMMULink(final Link elt) {
        super(elt);
    }

    @objid ("3bbca01a-7360-4b6d-b61c-cd3f41fd4a8d")
    public static final class MdaTypes {
        @objid ("48376759-aadc-423b-bdde-2ebc6e8c49b7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d85ef024-68e8-4ce9-b476-52d5207147a9")
        public static TagType HWMMU_LINK_VIRTUALADDRSPACE_TAGTYPE_ELT;

        @objid ("60c4cfbe-cd10-46e4-99f8-fcfdfaa510f6")
        public static TagType HWMMU_LINK_PHYSICALADDRSPACE_TAGTYPE_ELT;

        @objid ("6f598c8c-9add-4a99-8fff-4aad1dc5da19")
        public static TagType HWMMU_LINK_NBENTRIES_TAGTYPE_ELT;

        @objid ("33729e54-4617-4088-a3b6-012e57624dc2")
        public static TagType HWMMU_LINK_OWNEDTLBS_TAGTYPE_ELT;

        @objid ("0e5b0561-787d-45ad-b6d4-9cf93ebdb922")
        public static TagType HWMMU_LINK_MEMORYPROTECTION_TAGTYPE_ELT;

        @objid ("46ac765b-dcf5-4dc8-a18c-dfbecb0aec46")
        private static Stereotype MDAASSOCDEP;

        @objid ("f9b1daab-0a63-4641-885b-b69563b40717")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("53d4737c-633c-4f01-ab87-364af9d93527")
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
