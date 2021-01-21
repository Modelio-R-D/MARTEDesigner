/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Link} with << HwRAM_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c3479289-0935-4c52-a911-a91966379894")
public class HwRAMLink extends HwMemoryLink {
    @objid ("2dc47fc5-2747-4469-8772-467f2e518d4f")
    public static final String STEREOTYPE_NAME = "HwRAM_Link";

    @objid ("2c6ee8f7-b7a9-4bb0-bf86-8eb9a6230de8")
    public static final String HWRAM_LINK_ISNONVOLATILE_TAGTYPE = "HwRAM_Link_isNonVolatile";

    @objid ("f1214578-3d70-4f9a-9115-a0d400f3c2f8")
    public static final String HWRAM_LINK_ISSTATIC_TAGTYPE = "HwRAM_Link_isStatic";

    @objid ("775a4dfe-e0a4-4d7c-a35a-289aa57df4f7")
    public static final String HWRAM_LINK_ISSYNCHRONOUS_TAGTYPE = "HwRAM_Link_isSynchronous";

    @objid ("66825ac1-bff9-4237-81b0-82a49913dd32")
    public static final String HWRAM_LINK_ORGANIZATION_TAGTYPE = "HwRAM_Link_organization";

    @objid ("5329f5d3-0f73-43f1-ab61-3d695ac62f9a")
    public static final String HWRAM_LINK_REPL_POLICY_TAGTYPE = "HwRAM_Link_repl_Policy";

    @objid ("143d6901-0eb1-4007-846b-d005ce29ea76")
    public static final String HWRAM_LINK_WRITEPOLICY_TAGTYPE = "HwRAM_Link_writePolicy";

    /**
     * Tells whether a {@link HwRAMLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwRAM_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("62402ff7-f81e-41a9-9bcb-30f339f7c17a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwRAM_Link >> then instantiate a {@link HwRAMLink} proxy.
     * 
     * @return a {@link HwRAMLink} proxy on the created {@link Link}.
     */
    @objid ("73ce4617-94b9-4e98-a8e7-440c6db13512")
    public static HwRAMLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMLink.STEREOTYPE_NAME);
        return HwRAMLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMLink} proxy from a {@link Link} stereotyped << HwRAM_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwRAMLink} proxy or <i>null</i>.
     */
    @objid ("dd154c03-1817-4b0e-957a-6be6ad7a0834")
    public static HwRAMLink instantiate(final Link obj) {
        return HwRAMLink.canInstantiate(obj) ? new HwRAMLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwRAMLink} proxy from a {@link Link} stereotyped << HwRAM_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwRAMLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("255311c9-0684-438b-af4e-096b5b589b20")
    public static HwRAMLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwRAMLink.canInstantiate(obj))
        	return new HwRAMLink(obj);
        else
        	throw new IllegalArgumentException("HwRAMLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f1cdf3e7-377e-4a3b-9ed2-21974383cc14")
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
        HwRAMLink other = (HwRAMLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("231c5200-311e-443d-9002-3f9cedc0bf71")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwRAM_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e9a89f68-b1da-4683-ae49-1405cd4b85dd")
    public String getHwRAM_Link_organization() {
        return this.elt.getTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Link_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f28ea583-64c6-4176-9d33-60541d17b99e")
    public String getHwRAM_Link_repl_Policy() {
        return this.elt.getTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Link_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("520626cc-03e9-4dc9-bfe3-b15d0c20fadf")
    public String getHwRAM_Link_writePolicy() {
        return this.elt.getTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("9f29b241-74c7-491e-a56d-479720b56bd3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_Link_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f73eacc-9c8e-440e-b4dd-855a7e645f1e")
    public boolean isHwRAM_Link_isNonVolatile() {
        return this.elt.isTagged(HwRAMLink.MdaTypes.HWRAM_LINK_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Link_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2f3708c9-548d-4454-9328-3d27de7f8e9d")
    public boolean isHwRAM_Link_isStatic() {
        return this.elt.isTagged(HwRAMLink.MdaTypes.HWRAM_LINK_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Link_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5bc9563e-7113-45eb-b9f8-24277d3ba785")
    public boolean isHwRAM_Link_isSynchronous() {
        return this.elt.isTagged(HwRAMLink.MdaTypes.HWRAM_LINK_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Link_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f4d51603-a9cc-4f02-94a5-e0a4582538e5")
    public void setHwRAM_Link_isNonVolatile(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMLink.MdaTypes.HWRAM_LINK_ISNONVOLATILE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMLink.MdaTypes.HWRAM_LINK_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Link_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db7462d3-fcc2-4246-8840-2394c0faaf75")
    public void setHwRAM_Link_isStatic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMLink.MdaTypes.HWRAM_LINK_ISSTATIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMLink.MdaTypes.HWRAM_LINK_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Link_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("58810e52-68b8-432a-bd20-3ded4e07108e")
    public void setHwRAM_Link_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMLink.MdaTypes.HWRAM_LINK_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMLink.MdaTypes.HWRAM_LINK_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwRAM_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("916a5b27-f1bd-4cc1-b982-7ce24beb2607")
    public void setHwRAM_Link_organization(final String value) {
        this.elt.putTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Link_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8e13016f-0b00-485c-9d72-f4332f7ad69e")
    public void setHwRAM_Link_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Link_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("047191bc-596d-4d75-a53a-19813caf61ac")
    public void setHwRAM_Link_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("6832de8a-848b-4ffe-ac04-5d639c6eea9a")
    protected HwRAMLink(final Link elt) {
        super(elt);
    }

    @objid ("fae5df8d-a3c8-4835-ae82-088a51c9943a")
    public static final class MdaTypes {
        @objid ("92705955-40ec-4503-a97a-e8f543e363cb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7cb71aaa-aa52-4e47-a450-e9270cbdcff6")
        public static TagType HWRAM_LINK_ORGANIZATION_TAGTYPE_ELT;

        @objid ("b9ce2166-6653-423d-9c09-82cc7c1fe5f2")
        public static TagType HWRAM_LINK_REPL_POLICY_TAGTYPE_ELT;

        @objid ("9090416c-e92b-41fe-bfd3-f9ad51979860")
        public static TagType HWRAM_LINK_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("0606be17-f4ba-4b9e-8519-1e9006868ae6")
        public static TagType HWRAM_LINK_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("229af06e-7fa5-455b-87e0-20a5cf1d84a6")
        public static TagType HWRAM_LINK_ISSTATIC_TAGTYPE_ELT;

        @objid ("22daa9b2-33be-4aab-bde6-b49cf7547d27")
        public static TagType HWRAM_LINK_ISNONVOLATILE_TAGTYPE_ELT;

        @objid ("cb1d3cf3-2e5c-497d-b2af-2e8ef9e27cfd")
        private static Stereotype MDAASSOCDEP;

        @objid ("19dfe5c7-876e-4497-8a31-5203cfce90b1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ee1a0c53-7e81-49b8-a63f-5d888944c724")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01593e72-0ccf-11df-8525-001302895b2b");
            HWRAM_LINK_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0c4-0ccf-11df-8525-001302895b2b");
            HWRAM_LINK_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0e0-0ccf-11df-8525-001302895b2b");
            HWRAM_LINK_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015e0315-0ccf-11df-8525-001302895b2b");
            HWRAM_LINK_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c1a1dc71-170f-11df-b92a-0014222a9f79");
            HWRAM_LINK_ISSTATIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c1a1dc72-170f-11df-b92a-0014222a9f79");
            HWRAM_LINK_ISNONVOLATILE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c1a1dc73-170f-11df-b92a-0014222a9f79");
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
