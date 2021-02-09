/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwCache_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwCacheAssociation extends HwMemoryAssociation {
    public static final String STEREOTYPE_NAME = "HwCache_Association";

    public static final String HWCACHE_ASSOCIATION_LEVEL_TAGTYPE = "HwCache_Association_level";

    public static final String HWCACHE_ASSOCIATION_REPL_POLICY_TAGTYPE = "HwCache_Association_repl_Policy";

    public static final String HWCACHE_ASSOCIATION_STRUCTURE_TAGTYPE = "HwCache_Association_structure";

    public static final String HWCACHE_ASSOCIATION_TYPE_TAGTYPE = "HwCache_Association_type";

    public static final String HWCACHE_ASSOCIATION_WRITEPOLICY_TAGTYPE = "HwCache_Association_writePolicy";

    /**
     * Tells whether a {@link HwCacheAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwCache_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwCache_Association >> then instantiate a {@link HwCacheAssociation} proxy.
     * 
     * @return a {@link HwCacheAssociation} proxy on the created {@link Association}.
     */
    public static HwCacheAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheAssociation.STEREOTYPE_NAME);
        return HwCacheAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwCacheAssociation} proxy from a {@link Association} stereotyped << HwCache_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwCacheAssociation} proxy or <i>null</i>.
     */
    public static HwCacheAssociation instantiate(final Association obj) {
        return HwCacheAssociation.canInstantiate(obj) ? new HwCacheAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCacheAssociation} proxy from a {@link Association} stereotyped << HwCache_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwCacheAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwCacheAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwCacheAssociation.canInstantiate(obj))
        	return new HwCacheAssociation(obj);
        else
        	throw new IllegalArgumentException("HwCacheAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwCacheAssociation other = (HwCacheAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_Association_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Association_level() {
        return this.elt.getTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Association_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Association_repl_Policy() {
        return this.elt.getTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Association_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Association_structure() {
        return this.elt.getTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Association_type() {
        return this.elt.getTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Association_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Association_writePolicy() {
        return this.elt.getTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_WRITEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_Association_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Association_level(final String value) {
        this.elt.putTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Association_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Association_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Association_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Association_structure(final String value) {
        this.elt.putTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Association_type(final String value) {
        this.elt.putTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Association_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Association_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    protected HwCacheAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCACHE_ASSOCIATION_LEVEL_TAGTYPE_ELT;

        public static TagType HWCACHE_ASSOCIATION_TYPE_TAGTYPE_ELT;

        public static TagType HWCACHE_ASSOCIATION_STRUCTURE_TAGTYPE_ELT;

        public static TagType HWCACHE_ASSOCIATION_REPL_POLICY_TAGTYPE_ELT;

        public static TagType HWCACHE_ASSOCIATION_WRITEPOLICY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5a4d733c-1006-11df-86fe-0014222a9f79");
            HWCACHE_ASSOCIATION_LEVEL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ec9cd9d-1007-11df-86fe-0014222a9f79");
            HWCACHE_ASSOCIATION_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ec9cd9e-1007-11df-86fe-0014222a9f79");
            HWCACHE_ASSOCIATION_STRUCTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ec9cd9f-1007-11df-86fe-0014222a9f79");
            HWCACHE_ASSOCIATION_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ec9cda0-1007-11df-86fe-0014222a9f79");
            HWCACHE_ASSOCIATION_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ec9cda1-1007-11df-86fe-0014222a9f79");
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
