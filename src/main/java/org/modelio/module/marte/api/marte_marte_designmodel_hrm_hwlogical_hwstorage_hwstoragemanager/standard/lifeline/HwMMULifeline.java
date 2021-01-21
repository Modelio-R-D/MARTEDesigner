/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("d28fd2d3-98ab-4ea1-8f76-b281d717d247")
public class HwMMULifeline extends HwStorageManagerLifeline {
    @objid ("ace7866c-aad3-4ccb-a6dd-be88eea2c603")
    public static final String STEREOTYPE_NAME = "HwMMU_Lifeline";

    @objid ("8023affc-5611-42c3-9684-320b778168b9")
    public static final String HWMMU_LIFELINE_MEMORYPROTECTION_TAGTYPE = "HwMMU_Lifeline_memoryProtection";

    @objid ("952bb7af-f509-4c19-b69f-935ac5c237e7")
    public static final String HWMMU_LIFELINE_NBENTRIES_TAGTYPE = "HwMMU_Lifeline_nbEntries";

    @objid ("1a2b315e-224d-4682-b61f-21007ca028de")
    public static final String HWMMU_LIFELINE_OWNEDTLBS_TAGTYPE = "HwMMU_Lifeline_ownedTLBs";

    @objid ("a6d92d10-7430-433d-a537-a448eca26cef")
    public static final String HWMMU_LIFELINE_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Lifeline_physicalAddrSpace";

    @objid ("aa063736-05bb-47bc-afd6-68a302654bcb")
    public static final String HWMMU_LIFELINE_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Lifeline_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMULifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwMMU_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c38330a7-7c0b-4d9e-8ab4-51d67d3ac3f6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMULifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwMMU_Lifeline >> then instantiate a {@link HwMMULifeline} proxy.
     * 
     * @return a {@link HwMMULifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("af086a01-0b92-4f23-bddb-f7415587721a")
    public static HwMMULifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMULifeline.STEREOTYPE_NAME);
        return HwMMULifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwMMULifeline} proxy from a {@link Lifeline} stereotyped << HwMMU_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwMMULifeline} proxy or <i>null</i>.
     */
    @objid ("28b856e7-fd8f-4cab-ad05-dec69cc07dbb")
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
    @objid ("ffb25ecc-b319-4247-8dd9-e95a75a88274")
    public static HwMMULifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwMMULifeline.canInstantiate(obj))
        	return new HwMMULifeline(obj);
        else
        	throw new IllegalArgumentException("HwMMULifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e4a1b5e8-eadc-4361-9ac4-d75387abb704")
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
    @objid ("7ac6776a-0dc9-49b7-a2c0-56fa69c910c3")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Lifeline_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2056723a-dbdd-4a12-b3b9-1cb013e29f44")
    public String getHwMMU_Lifeline_nbEntries() {
        return this.elt.getTagValue(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Lifeline_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2dcf6a55-08d8-49f8-900b-8a78d886fff0")
    public List<String> getHwMMU_Lifeline_ownedTLBs() {
        return this.elt.getTagValues(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Lifeline_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a640fa85-4ff3-4e24-8eb7-4c0aaa07e539")
    public String getHwMMU_Lifeline_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Lifeline_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("470f7a7d-f4fc-4126-a131-78459ffe51ca")
    public String getHwMMU_Lifeline_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @objid ("6042e2fc-14eb-4bdc-a724-9b7305ac00b5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Lifeline_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("130dc492-444c-463f-8235-782fb4dd7549")
    public boolean isHwMMU_Lifeline_memoryProtection() {
        return this.elt.isTagged(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Lifeline_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f446f3b-80c8-4262-ac28-3a22226d5785")
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
    @objid ("eeee16d1-95be-45b5-b044-cfbc2a3e48fb")
    public void setHwMMU_Lifeline_nbEntries(final String value) {
        this.elt.putTagValue(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Lifeline_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8ba14a76-ecc3-439b-8428-72a0f386d3ba")
    public void setHwMMU_Lifeline_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Lifeline_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("988da4fb-3019-404b-91fd-4482df22195c")
    public void setHwMMU_Lifeline_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Lifeline_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aff61bd3-8385-4b7b-a10d-578d11681b4a")
    public void setHwMMU_Lifeline_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMULifeline.MdaTypes.HWMMU_LIFELINE_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    @objid ("c62ccd7e-5b55-4681-85f8-a38102310167")
    protected HwMMULifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("a5fe970f-811f-44e3-a0e8-981481a06a2d")
    public static final class MdaTypes {
        @objid ("0de22f45-c510-4417-ba7a-59f701d84df8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1a30999f-a9e3-42ae-92e8-2b8e13ba1541")
        public static TagType HWMMU_LIFELINE_VIRTUALADDRSPACE_TAGTYPE_ELT;

        @objid ("a89e4150-c8d5-4d94-8a62-b6e8ebf12b02")
        public static TagType HWMMU_LIFELINE_PHYSICALADDRSPACE_TAGTYPE_ELT;

        @objid ("868083f1-1cd8-4ffb-9aff-29bfc8fe1c9b")
        public static TagType HWMMU_LIFELINE_NBENTRIES_TAGTYPE_ELT;

        @objid ("0c4fdc8b-1c12-45d7-9b3f-f4b104c18575")
        public static TagType HWMMU_LIFELINE_OWNEDTLBS_TAGTYPE_ELT;

        @objid ("7cac1085-002b-41e1-9168-da2689266f04")
        public static TagType HWMMU_LIFELINE_MEMORYPROTECTION_TAGTYPE_ELT;

        @objid ("480f0045-8bfa-4703-b5ec-07d532fd089b")
        private static Stereotype MDAASSOCDEP;

        @objid ("c526dd05-b2a9-438e-a1b5-6f5b0b30b7fb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("86fc769c-0759-4ceb-8a57-4c1a4c78daa7")
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
