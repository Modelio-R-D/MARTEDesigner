/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwCache_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f68c9312-49c8-48fd-a0f1-6a271be10e79")
public class HwCacheAssociationEnd extends HwMemoryAssociationEnd {
    @objid ("6b499168-6a12-4bdc-b488-8717ae32dd60")
    public static final String STEREOTYPE_NAME = "HwCache_AssociationEnd";

    @objid ("59a08771-6599-4b7a-9a6c-f20bda55620b")
    public static final String HWCACHE_ASSOCIATIONEND_LEVEL_TAGTYPE = "HwCache_AssociationEnd_level";

    @objid ("030a1f81-76c0-4e02-8152-2c2467638ced")
    public static final String HWCACHE_ASSOCIATIONEND_REPL_POLICY_TAGTYPE = "HwCache_AssociationEnd_repl_Policy";

    @objid ("f03b9e10-9d19-454b-97ba-e7a457701a92")
    public static final String HWCACHE_ASSOCIATIONEND_STRUCTURE_TAGTYPE = "HwCache_AssociationEnd_structure";

    @objid ("edd5ae90-6e4b-4186-b546-120f3ea08172")
    public static final String HWCACHE_ASSOCIATIONEND_TYPE_TAGTYPE = "HwCache_AssociationEnd_type";

    @objid ("65bcc3fd-ef3f-463a-a972-50e5e5014edc")
    public static final String HWCACHE_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE = "HwCache_AssociationEnd_writePolicy";

    /**
     * Tells whether a {@link HwCacheAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwCache_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e16d23d6-d71b-4d5a-8bd6-bc1e62cf7803")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwCache_AssociationEnd >> then instantiate a {@link HwCacheAssociationEnd} proxy.
     * 
     * @return a {@link HwCacheAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("c86657ba-31f6-4f39-b3f0-59a306c23fa2")
    public static HwCacheAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheAssociationEnd.STEREOTYPE_NAME);
        return HwCacheAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwCacheAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwCache_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwCacheAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("d5dca439-30f1-4871-b596-2b4689448dde")
    public static HwCacheAssociationEnd instantiate(final AssociationEnd obj) {
        return HwCacheAssociationEnd.canInstantiate(obj) ? new HwCacheAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCacheAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwCache_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwCacheAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("be2f9350-564d-4fd9-82ab-85377469ed33")
    public static HwCacheAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwCacheAssociationEnd.canInstantiate(obj))
        	return new HwCacheAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwCacheAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("263cf589-a733-412e-9d50-7f600c0eb959")
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
        HwCacheAssociationEnd other = (HwCacheAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("2ca6ca42-584f-42d1-9b4e-b4ef78bb2e6c")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_AssociationEnd_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3334cc5a-be89-42f5-957e-7e5233d04a1e")
    public String getHwCache_AssociationEnd_level() {
        return this.elt.getTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_AssociationEnd_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("948d6b74-4467-4b05-a87c-a1c2f92ff4c0")
    public String getHwCache_AssociationEnd_repl_Policy() {
        return this.elt.getTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_AssociationEnd_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("363e29f4-74eb-4d59-973e-4a83756c6802")
    public String getHwCache_AssociationEnd_structure() {
        return this.elt.getTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bce60230-ef71-45a6-80e4-5c6a3a93305f")
    public String getHwCache_AssociationEnd_type() {
        return this.elt.getTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_AssociationEnd_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b785dd7d-9794-40a4-b27a-d1d93615c00c")
    public String getHwCache_AssociationEnd_writePolicy() {
        return this.elt.getTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("7dd2e849-f90b-4b97-8f68-5ddb8b82633d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_AssociationEnd_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0220b247-fe9c-4f56-9cd1-18dab0a431c8")
    public void setHwCache_AssociationEnd_level(final String value) {
        this.elt.putTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_AssociationEnd_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d6330004-572f-4dba-9f0c-9926b1ccd56e")
    public void setHwCache_AssociationEnd_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_AssociationEnd_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c17d2141-2f54-4b43-8d34-de6c6ec04c51")
    public void setHwCache_AssociationEnd_structure(final String value) {
        this.elt.putTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d14a0126-1284-45b4-801a-8e0bb23dc012")
    public void setHwCache_AssociationEnd_type(final String value) {
        this.elt.putTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_AssociationEnd_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3cdf0c89-d0b8-49be-ad21-074abc46ca9d")
    public void setHwCache_AssociationEnd_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("da88f652-b757-46b8-85bc-1d594918e898")
    protected HwCacheAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("3bcd3f2a-c638-4761-8ce3-badef1598de0")
    public static final class MdaTypes {
        @objid ("2cb8c2e9-6e1a-4c5a-b397-4a34648e4d18")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b3cb751d-ad23-4d03-bda1-a8550b6720f6")
        public static TagType HWCACHE_ASSOCIATIONEND_LEVEL_TAGTYPE_ELT;

        @objid ("d7ad2884-cfdc-4b16-b11d-1554b5dd3d3a")
        public static TagType HWCACHE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT;

        @objid ("144bc598-b6fa-43e0-b9c1-2fcaa3a093b5")
        public static TagType HWCACHE_ASSOCIATIONEND_STRUCTURE_TAGTYPE_ELT;

        @objid ("af312224-ee43-4ed1-a292-c6f4f688b7da")
        public static TagType HWCACHE_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT;

        @objid ("8ebe937e-e0fe-49a0-9805-c1b544c4256b")
        public static TagType HWCACHE_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("9cc2a7a4-9d14-4bbe-9add-9b8861dac2dc")
        private static Stereotype MDAASSOCDEP;

        @objid ("e1198393-6653-4bb0-ba90-f2d2e13d1d23")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e5f5a2df-4530-48de-9b28-acbefb14d8b1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "015479ca-0ccf-11df-8525-001302895b2b");
            HWCACHE_ASSOCIATIONEND_LEVEL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479d1-0ccf-11df-8525-001302895b2b");
            HWCACHE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479d8-0ccf-11df-8525-001302895b2b");
            HWCACHE_ASSOCIATIONEND_STRUCTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479df-0ccf-11df-8525-001302895b2b");
            HWCACHE_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479e6-0ccf-11df-8525-001302895b2b");
            HWCACHE_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479ed-0ccf-11df-8525-001302895b2b");
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
