/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend;

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
public class HwCacheAssociationEnd extends HwMemoryAssociationEnd {
    public static final String STEREOTYPE_NAME = "HwCache_AssociationEnd";

    public static final String HWCACHE_ASSOCIATIONEND_LEVEL_TAGTYPE = "HwCache_AssociationEnd_level";

    public static final String HWCACHE_ASSOCIATIONEND_REPL_POLICY_TAGTYPE = "HwCache_AssociationEnd_repl_Policy";

    public static final String HWCACHE_ASSOCIATIONEND_STRUCTURE_TAGTYPE = "HwCache_AssociationEnd_structure";

    public static final String HWCACHE_ASSOCIATIONEND_TYPE_TAGTYPE = "HwCache_AssociationEnd_type";

    public static final String HWCACHE_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE = "HwCache_AssociationEnd_writePolicy";

    /**
     * Tells whether a {@link HwCacheAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwCache_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwCache_AssociationEnd >> then instantiate a {@link HwCacheAssociationEnd} proxy.
     * 
     * @return a {@link HwCacheAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static HwCacheAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheAssociationEnd.STEREOTYPE_NAME);
        return HwCacheAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwCacheAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwCache_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwCacheAssociationEnd} proxy or <i>null</i>.
     */
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
    public static HwCacheAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwCacheAssociationEnd.canInstantiate(obj))
        	return new HwCacheAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwCacheAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwCacheAssociationEnd other = (HwCacheAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_AssociationEnd_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_AssociationEnd_level() {
        return this.elt.getTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_AssociationEnd_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_AssociationEnd_repl_Policy() {
        return this.elt.getTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_AssociationEnd_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_AssociationEnd_structure() {
        return this.elt.getTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_AssociationEnd_type() {
        return this.elt.getTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_AssociationEnd_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_AssociationEnd_writePolicy() {
        return this.elt.getTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_AssociationEnd_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_AssociationEnd_level(final String value) {
        this.elt.putTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_AssociationEnd_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_AssociationEnd_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_AssociationEnd_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_AssociationEnd_structure(final String value) {
        this.elt.putTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_AssociationEnd_type(final String value) {
        this.elt.putTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_AssociationEnd_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_AssociationEnd_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    protected HwCacheAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCACHE_ASSOCIATIONEND_LEVEL_TAGTYPE_ELT;

        public static TagType HWCACHE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT;

        public static TagType HWCACHE_ASSOCIATIONEND_STRUCTURE_TAGTYPE_ELT;

        public static TagType HWCACHE_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT;

        public static TagType HWCACHE_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
