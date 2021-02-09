/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwCache_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwCacheAttribute extends HwMemoryAttribute {
    public static final String STEREOTYPE_NAME = "HwCache_Attribute";

    public static final String HWCACHE_ATTRIBUTE_LEVEL_TAGTYPE = "HwCache_Attribute_level";

    public static final String HWCACHE_ATTRIBUTE_REPL_POLICY_TAGTYPE = "HwCache_Attribute_repl_Policy";

    public static final String HWCACHE_ATTRIBUTE_STRUCTURE_TAGTYPE = "HwCache_Attribute_structure";

    public static final String HWCACHE_ATTRIBUTE_TYPE_TAGTYPE = "HwCache_Attribute_type";

    public static final String HWCACHE_ATTRIBUTE_WRITEPOLICY_TAGTYPE = "HwCache_Attribute_writePolicy";

    /**
     * Tells whether a {@link HwCacheAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwCache_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwCache_Attribute >> then instantiate a {@link HwCacheAttribute} proxy.
     * 
     * @return a {@link HwCacheAttribute} proxy on the created {@link Attribute}.
     */
    public static HwCacheAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheAttribute.STEREOTYPE_NAME);
        return HwCacheAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwCacheAttribute} proxy from a {@link Attribute} stereotyped << HwCache_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwCacheAttribute} proxy or <i>null</i>.
     */
    public static HwCacheAttribute instantiate(final Attribute obj) {
        return HwCacheAttribute.canInstantiate(obj) ? new HwCacheAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCacheAttribute} proxy from a {@link Attribute} stereotyped << HwCache_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwCacheAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwCacheAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwCacheAttribute.canInstantiate(obj))
        	return new HwCacheAttribute(obj);
        else
        	throw new IllegalArgumentException("HwCacheAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwCacheAttribute other = (HwCacheAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_Attribute_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Attribute_level() {
        return this.elt.getTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Attribute_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Attribute_repl_Policy() {
        return this.elt.getTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Attribute_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Attribute_structure() {
        return this.elt.getTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Attribute_type() {
        return this.elt.getTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Attribute_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Attribute_writePolicy() {
        return this.elt.getTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_Attribute_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Attribute_level(final String value) {
        this.elt.putTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Attribute_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Attribute_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Attribute_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Attribute_structure(final String value) {
        this.elt.putTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Attribute_type(final String value) {
        this.elt.putTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Attribute_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Attribute_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    protected HwCacheAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCACHE_ATTRIBUTE_LEVEL_TAGTYPE_ELT;

        public static TagType HWCACHE_ATTRIBUTE_TYPE_TAGTYPE_ELT;

        public static TagType HWCACHE_ATTRIBUTE_STRUCTURE_TAGTYPE_ELT;

        public static TagType HWCACHE_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT;

        public static TagType HWCACHE_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "015479cc-0ccf-11df-8525-001302895b2b");
            HWCACHE_ATTRIBUTE_LEVEL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479d3-0ccf-11df-8525-001302895b2b");
            HWCACHE_ATTRIBUTE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479da-0ccf-11df-8525-001302895b2b");
            HWCACHE_ATTRIBUTE_STRUCTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479e1-0ccf-11df-8525-001302895b2b");
            HWCACHE_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479e8-0ccf-11df-8525-001302895b2b");
            HWCACHE_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479ef-0ccf-11df-8525-001302895b2b");
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
