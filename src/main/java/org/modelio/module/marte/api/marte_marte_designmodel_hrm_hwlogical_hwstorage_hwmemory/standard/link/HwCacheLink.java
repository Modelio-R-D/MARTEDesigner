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
 * Proxy class to handle a {@link Link} with << HwCache_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("05f8d7ef-9e6c-497d-94f1-825950a1b6e0")
public class HwCacheLink extends HwMemoryLink {
    @objid ("7e137e3f-ea22-4386-82c7-cbeb2c548c4f")
    public static final String STEREOTYPE_NAME = "HwCache_Link";

    @objid ("13a10504-5e1b-4969-a37f-895e0e79629d")
    public static final String HWCACHE_LINK_LEVEL_TAGTYPE = "HwCache_Link_level";

    @objid ("07378c46-0d73-4f87-b35a-a83018ac62df")
    public static final String HWCACHE_LINK_REPL_POLICY_TAGTYPE = "HwCache_Link_repl_Policy";

    @objid ("5d2e318e-e2c2-4ee2-9216-f2a81e3c8d43")
    public static final String HWCACHE_LINK_STRUCTURE_TAGTYPE = "HwCache_Link_structure";

    @objid ("e99598d8-39f8-442e-9bea-721968e8381b")
    public static final String HWCACHE_LINK_TYPE_TAGTYPE = "HwCache_Link_type";

    @objid ("28c74284-0e2d-4970-9046-c734c8d80c4b")
    public static final String HWCACHE_LINK_WRITEPOLICY_TAGTYPE = "HwCache_Link_writePolicy";

    /**
     * Tells whether a {@link HwCacheLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwCache_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3b451bf3-828d-4b86-980b-f17e04813469")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwCache_Link >> then instantiate a {@link HwCacheLink} proxy.
     * 
     * @return a {@link HwCacheLink} proxy on the created {@link Link}.
     */
    @objid ("d1ef1277-8e12-4f46-b4d9-a8db96b03660")
    public static HwCacheLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheLink.STEREOTYPE_NAME);
        return HwCacheLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwCacheLink} proxy from a {@link Link} stereotyped << HwCache_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwCacheLink} proxy or <i>null</i>.
     */
    @objid ("28220874-d5fb-490c-995d-10947956630c")
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
    @objid ("816acf70-c3fb-40dd-b1cb-ef8cac7cb77e")
    public static HwCacheLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwCacheLink.canInstantiate(obj))
        	return new HwCacheLink(obj);
        else
        	throw new IllegalArgumentException("HwCacheLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("26c4bde7-70e8-4f1b-b50c-5e0cea148997")
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
    @objid ("bff09f48-b9ef-401d-a2dc-51584b376acd")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_Link_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2f6091ce-35ea-4025-a562-4de671700e57")
    public String getHwCache_Link_level() {
        return this.elt.getTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Link_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dfacc7d7-9d70-450e-b09b-8d9655a20098")
    public String getHwCache_Link_repl_Policy() {
        return this.elt.getTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Link_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f36a71a7-2ce2-40df-a9d3-d99eadde68ac")
    public String getHwCache_Link_structure() {
        return this.elt.getTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("576264b5-3cbf-41c0-ac31-e38a28fa1f30")
    public String getHwCache_Link_type() {
        return this.elt.getTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Link_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c1569796-a08d-49a4-a422-b1e87135a68f")
    public String getHwCache_Link_writePolicy() {
        return this.elt.getTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("672a26b0-0938-457e-83d4-7ae57f90ab88")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_Link_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("87e3f277-4670-4a9b-b0fb-6d4b8c0565bb")
    public void setHwCache_Link_level(final String value) {
        this.elt.putTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Link_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0826b495-6efe-441e-bfe6-a92dbbbffca8")
    public void setHwCache_Link_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Link_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a340383b-00f4-4587-9548-0f7827ae71ff")
    public void setHwCache_Link_structure(final String value) {
        this.elt.putTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db730c30-2a22-489d-924a-dcbdddb945cd")
    public void setHwCache_Link_type(final String value) {
        this.elt.putTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Link_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1bebc063-49ad-436c-8222-fdc85b45e89d")
    public void setHwCache_Link_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheLink.MdaTypes.HWCACHE_LINK_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("6baa1db9-a33b-4a85-a3d9-646ad52b1011")
    protected HwCacheLink(final Link elt) {
        super(elt);
    }

    @objid ("8683ce0e-dee7-4537-8d6b-6caad56ba012")
    public static final class MdaTypes {
        @objid ("e397d294-4402-4876-bfe9-a28dbb172d09")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1f637d55-7d0b-46f9-a03c-70ecb5cd280c")
        public static TagType HWCACHE_LINK_LEVEL_TAGTYPE_ELT;

        @objid ("94f45f9b-f366-434d-b072-1bb826c58c3b")
        public static TagType HWCACHE_LINK_TYPE_TAGTYPE_ELT;

        @objid ("4e97629f-0fef-4d8c-809e-21a5f594b026")
        public static TagType HWCACHE_LINK_STRUCTURE_TAGTYPE_ELT;

        @objid ("69af1c4d-ee46-4115-8dda-a53bffff965d")
        public static TagType HWCACHE_LINK_REPL_POLICY_TAGTYPE_ELT;

        @objid ("f860964a-5a8d-4823-93f8-919129862199")
        public static TagType HWCACHE_LINK_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("c772ca5e-793f-4e57-8d65-1783b8e58fbe")
        private static Stereotype MDAASSOCDEP;

        @objid ("5f25538c-70f9-4f38-a981-df3bf7df62d0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("49509c3d-45f0-4940-9844-95a8fb710331")
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
