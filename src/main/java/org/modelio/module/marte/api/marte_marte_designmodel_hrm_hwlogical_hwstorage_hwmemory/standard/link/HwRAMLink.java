/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("ef48a04c-62bc-4f43-919d-9e2e95ca14fb")
    public static final String STEREOTYPE_NAME = "HwRAM_Link";

    @objid ("7a5f2642-e5fc-404b-acdf-b45128c78d38")
    public static final String HWRAM_LINK_ISNONVOLATILE_TAGTYPE = "HwRAM_Link_isNonVolatile";

    @objid ("865a8589-ebf0-4269-9dd6-1085dedfae21")
    public static final String HWRAM_LINK_ISSTATIC_TAGTYPE = "HwRAM_Link_isStatic";

    @objid ("bbea32c4-8d07-45cb-bad6-d1a111682eba")
    public static final String HWRAM_LINK_ISSYNCHRONOUS_TAGTYPE = "HwRAM_Link_isSynchronous";

    @objid ("ec895fc9-d246-44b7-9c98-f8d9016d8375")
    public static final String HWRAM_LINK_ORGANIZATION_TAGTYPE = "HwRAM_Link_organization";

    @objid ("77c66b49-40dc-4d8b-9ac9-f398a37e70dd")
    public static final String HWRAM_LINK_REPL_POLICY_TAGTYPE = "HwRAM_Link_repl_Policy";

    @objid ("8edd6ecc-775b-41e9-82e8-0f6eafd63b7f")
    public static final String HWRAM_LINK_WRITEPOLICY_TAGTYPE = "HwRAM_Link_writePolicy";

    /**
     * Tells whether a {@link HwRAMLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwRAM_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("93047add-d970-4b5f-9218-d0772db2f229")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwRAM_Link >> then instantiate a {@link HwRAMLink} proxy.
     * 
     * @return a {@link HwRAMLink} proxy on the created {@link Link}.
     */
    @objid ("2c13618c-6587-411f-a5ec-c234f1a14d60")
    public static HwRAMLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMLink.STEREOTYPE_NAME);
        return HwRAMLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMLink} proxy from a {@link Link} stereotyped << HwRAM_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwRAMLink} proxy or <i>null</i>.
     */
    @objid ("649a6711-96cd-4f7d-b68d-f28a1d9e290e")
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
    @objid ("8915cf90-e14d-4e86-9f1c-7a2462a9616e")
    public static HwRAMLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwRAMLink.canInstantiate(obj))
        	return new HwRAMLink(obj);
        else
        	throw new IllegalArgumentException("HwRAMLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0cad1f24-4ffd-4804-85df-29a624a2ada3")
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
    @objid ("c16aaa8a-1b14-4fc3-8afb-b5e82befbf27")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwRAM_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("32121c1b-fe5e-41dc-972b-52d9a94d8c96")
    public String getHwRAM_Link_organization() {
        return this.elt.getTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Link_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("85cb4064-6306-4446-8500-aca25bf12f42")
    public String getHwRAM_Link_repl_Policy() {
        return this.elt.getTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Link_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dd14d8bd-ccc3-45be-9406-84c081ec3714")
    public String getHwRAM_Link_writePolicy() {
        return this.elt.getTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("1c9ab789-5482-4f89-8de4-6efa449c6d04")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_Link_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("042d3140-eae6-4426-be6e-a5eeab4927f2")
    public boolean isHwRAM_Link_isNonVolatile() {
        return this.elt.isTagged(HwRAMLink.MdaTypes.HWRAM_LINK_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Link_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d7950f9e-f6ce-4e59-a61f-2dfff1e9d6ca")
    public boolean isHwRAM_Link_isStatic() {
        return this.elt.isTagged(HwRAMLink.MdaTypes.HWRAM_LINK_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Link_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1bdf7a38-8306-4bc3-80af-68b45ae0bab1")
    public boolean isHwRAM_Link_isSynchronous() {
        return this.elt.isTagged(HwRAMLink.MdaTypes.HWRAM_LINK_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Link_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e5355288-816d-43c4-a806-dced4d7ea3d6")
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
    @objid ("11e2f59d-a40d-43d5-97b3-997be07660ce")
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
    @objid ("30e5a4d4-baf0-4115-bda3-4e3682677bfb")
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
    @objid ("0047b3ea-d9bb-4191-b774-20b746a2e821")
    public void setHwRAM_Link_organization(final String value) {
        this.elt.putTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Link_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7b237831-76f5-4647-be97-59de090569e4")
    public void setHwRAM_Link_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Link_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c171d450-e4d6-41e8-b01f-b7ebfc32414b")
    public void setHwRAM_Link_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("c4b69c74-ea2d-4c10-921f-7f2ea5aba677")
    protected HwRAMLink(final Link elt) {
        super(elt);
    }

    @objid ("fae5df8d-a3c8-4835-ae82-088a51c9943a")
    public static final class MdaTypes {
        @objid ("c2941d28-cd41-4d08-9789-04e3bdfa6d1c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bbae2743-7a9a-49e5-b0a9-a44056979bca")
        public static TagType HWRAM_LINK_ORGANIZATION_TAGTYPE_ELT;

        @objid ("8afd5701-a7c5-42b6-865c-20267b0bd51a")
        public static TagType HWRAM_LINK_REPL_POLICY_TAGTYPE_ELT;

        @objid ("c009351c-471a-48b7-94fb-049f01a200cd")
        public static TagType HWRAM_LINK_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("b6d2398e-6227-4d4f-a517-5b7af698be0b")
        public static TagType HWRAM_LINK_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("fb8a03a5-d210-4fe1-a537-fb4061b40c66")
        public static TagType HWRAM_LINK_ISSTATIC_TAGTYPE_ELT;

        @objid ("049d3d91-25f1-4ca3-bfdb-028a6a3e466f")
        public static TagType HWRAM_LINK_ISNONVOLATILE_TAGTYPE_ELT;

        @objid ("006a53d4-c5ad-411f-9b24-4815aa2bc481")
        private static Stereotype MDAASSOCDEP;

        @objid ("06785717-2f10-4c4e-be9a-ff2f765c2583")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("021f2ae7-59c6-45b1-aac6-9b86165c0025")
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
