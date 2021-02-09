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
 * Proxy class to handle a {@link Link} with << HwCache_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwCacheLink extends HwMemoryLink {
    public static final String STEREOTYPE_NAME = "HwCache_Link";

    public static final String HWCACHE_LINK_LEVEL_TAGTYPE = "HwCache_Link_level";

    public static final String HWCACHE_LINK_REPL_POLICY_TAGTYPE = "HwCache_Link_repl_Policy";

    public static final String HWCACHE_LINK_STRUCTURE_TAGTYPE = "HwCache_Link_structure";

    public static final String HWCACHE_LINK_TYPE_TAGTYPE = "HwCache_Link_type";

    public static final String HWCACHE_LINK_WRITEPOLICY_TAGTYPE = "HwCache_Link_writePolicy";

    /**
     * Tells whether a {@link HwCacheLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwCache_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwCache_Link >> then instantiate a {@link HwCacheLink} proxy.
     * 
     * @return a {@link HwCacheLink} proxy on the created {@link Link}.
     */
    public static HwCacheLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheLink.STEREOTYPE_NAME);
        return HwCacheLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwCacheLink} proxy from a {@link Link} stereotyped << HwCache_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwCacheLink} proxy or <i>null</i>.
     */
    public static HwCacheLink instantiate(final Link obj) {
        return HwCacheLink.canInstantiate(obj) ? new HwCacheLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCacheLink} proxy from a {@link Link} stereotyped << HwCache_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwCacheLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwCacheLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwCacheLink.canInstantiate(obj))
        	return new HwCacheLink(obj);
        else
        	throw new IllegalArgumentException("HwCacheLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwCacheLink other = (HwCacheLink) obj;
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
     * Getter for string property 'HwCache_Link_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Link_level() {
        return this.elt.getTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Link_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Link_repl_Policy() {
        return this.elt.getTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Link_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Link_structure() {
        return this.elt.getTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Link_type() {
        return this.elt.getTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Link_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Link_writePolicy() {
        return this.elt.getTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_WRITEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_Link_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Link_level(final String value) {
        this.elt.putTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Link_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Link_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Link_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Link_structure(final String value) {
        this.elt.putTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Link_type(final String value) {
        this.elt.putTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Link_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Link_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    protected HwCacheLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCACHE_LINK_LEVEL_TAGTYPE_ELT;

        public static TagType HWCACHE_LINK_TYPE_TAGTYPE_ELT;

        public static TagType HWCACHE_LINK_STRUCTURE_TAGTYPE_ELT;

        public static TagType HWCACHE_LINK_REPL_POLICY_TAGTYPE_ELT;

        public static TagType HWCACHE_LINK_WRITEPOLICY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "015479ce-0ccf-11df-8525-001302895b2b");
            HWCACHE_LINK_LEVEL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479d5-0ccf-11df-8525-001302895b2b");
            HWCACHE_LINK_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479dc-0ccf-11df-8525-001302895b2b");
            HWCACHE_LINK_STRUCTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479e3-0ccf-11df-8525-001302895b2b");
            HWCACHE_LINK_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479ea-0ccf-11df-8525-001302895b2b");
            HWCACHE_LINK_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479f1-0ccf-11df-8525-001302895b2b");
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
