/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Link} with << HwRAM_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwRAMLink extends HwMemoryLink {
    public static final String STEREOTYPE_NAME = "HwRAM_Link";

    public static final String HWRAM_LINK_ISNONVOLATILE_TAGTYPE = "HwRAM_Link_isNonVolatile";

    public static final String HWRAM_LINK_ISSTATIC_TAGTYPE = "HwRAM_Link_isStatic";

    public static final String HWRAM_LINK_ISSYNCHRONOUS_TAGTYPE = "HwRAM_Link_isSynchronous";

    public static final String HWRAM_LINK_ORGANIZATION_TAGTYPE = "HwRAM_Link_organization";

    public static final String HWRAM_LINK_REPL_POLICY_TAGTYPE = "HwRAM_Link_repl_Policy";

    public static final String HWRAM_LINK_WRITEPOLICY_TAGTYPE = "HwRAM_Link_writePolicy";

    /**
     * Tells whether a {@link HwRAMLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwRAM_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwRAM_Link >> then instantiate a {@link HwRAMLink} proxy.
     * 
     * @return a {@link HwRAMLink} proxy on the created {@link Link}.
     */
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
    public static HwRAMLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwRAMLink.canInstantiate(obj))
        	return new HwRAMLink(obj);
        else
        	throw new IllegalArgumentException("HwRAMLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwRAMLink other = (HwRAMLink) obj;
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
     * Getter for string property 'HwRAM_Link_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Link_organization() {
        return this.elt.getTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Link_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Link_repl_Policy() {
        return this.elt.getTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Link_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Link_writePolicy() {
        return this.elt.getTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_WRITEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_Link_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Link_isNonVolatile() {
        return this.elt.isTagged(HwRAMLink.MdaTypes.HWRAM_LINK_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Link_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Link_isStatic() {
        return this.elt.isTagged(HwRAMLink.MdaTypes.HWRAM_LINK_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Link_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Link_isSynchronous() {
        return this.elt.isTagged(HwRAMLink.MdaTypes.HWRAM_LINK_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Link_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setHwRAM_Link_organization(final String value) {
        this.elt.putTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Link_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Link_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Link_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Link_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMLink.MdaTypes.HWRAM_LINK_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    protected HwRAMLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWRAM_LINK_ORGANIZATION_TAGTYPE_ELT;

        public static TagType HWRAM_LINK_REPL_POLICY_TAGTYPE_ELT;

        public static TagType HWRAM_LINK_WRITEPOLICY_TAGTYPE_ELT;

        public static TagType HWRAM_LINK_ISSYNCHRONOUS_TAGTYPE_ELT;

        public static TagType HWRAM_LINK_ISSTATIC_TAGTYPE_ELT;

        public static TagType HWRAM_LINK_ISNONVOLATILE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
