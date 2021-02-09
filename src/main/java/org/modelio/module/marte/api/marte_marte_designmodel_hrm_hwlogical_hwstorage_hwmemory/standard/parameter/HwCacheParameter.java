/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwCache_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwCacheParameter extends HwMemoryParameter {
    public static final String STEREOTYPE_NAME = "HwCache_Parameter";

    public static final String HWCACHE_PARAMETER_LEVEL_TAGTYPE = "HwCache_Parameter_level";

    public static final String HWCACHE_PARAMETER_REPL_POLICY_TAGTYPE = "HwCache_Parameter_repl_Policy";

    public static final String HWCACHE_PARAMETER_STRUCTURE_TAGTYPE = "HwCache_Parameter_structure";

    public static final String HWCACHE_PARAMETER_TYPE_TAGTYPE = "HwCache_Parameter_type";

    public static final String HWCACHE_PARAMETER_WRITEPOLICY_TAGTYPE = "HwCache_Parameter_writePolicy";

    /**
     * Tells whether a {@link HwCacheParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwCache_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwCache_Parameter >> then instantiate a {@link HwCacheParameter} proxy.
     * 
     * @return a {@link HwCacheParameter} proxy on the created {@link Parameter}.
     */
    public static HwCacheParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheParameter.STEREOTYPE_NAME);
        return HwCacheParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwCacheParameter} proxy from a {@link Parameter} stereotyped << HwCache_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwCacheParameter} proxy or <i>null</i>.
     */
    public static HwCacheParameter instantiate(final Parameter obj) {
        return HwCacheParameter.canInstantiate(obj) ? new HwCacheParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCacheParameter} proxy from a {@link Parameter} stereotyped << HwCache_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwCacheParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwCacheParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwCacheParameter.canInstantiate(obj))
        	return new HwCacheParameter(obj);
        else
        	throw new IllegalArgumentException("HwCacheParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwCacheParameter other = (HwCacheParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_Parameter_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Parameter_level() {
        return this.elt.getTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Parameter_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Parameter_repl_Policy() {
        return this.elt.getTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Parameter_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Parameter_structure() {
        return this.elt.getTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Parameter_type() {
        return this.elt.getTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Parameter_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Parameter_writePolicy() {
        return this.elt.getTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_WRITEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_Parameter_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Parameter_level(final String value) {
        this.elt.putTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Parameter_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Parameter_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Parameter_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Parameter_structure(final String value) {
        this.elt.putTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Parameter_type(final String value) {
        this.elt.putTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Parameter_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Parameter_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    protected HwCacheParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCACHE_PARAMETER_LEVEL_TAGTYPE_ELT;

        public static TagType HWCACHE_PARAMETER_TYPE_TAGTYPE_ELT;

        public static TagType HWCACHE_PARAMETER_STRUCTURE_TAGTYPE_ELT;

        public static TagType HWCACHE_PARAMETER_REPL_POLICY_TAGTYPE_ELT;

        public static TagType HWCACHE_PARAMETER_WRITEPOLICY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "015479d0-0ccf-11df-8525-001302895b2b");
            HWCACHE_PARAMETER_LEVEL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479d7-0ccf-11df-8525-001302895b2b");
            HWCACHE_PARAMETER_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479de-0ccf-11df-8525-001302895b2b");
            HWCACHE_PARAMETER_STRUCTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479e5-0ccf-11df-8525-001302895b2b");
            HWCACHE_PARAMETER_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479ec-0ccf-11df-8525-001302895b2b");
            HWCACHE_PARAMETER_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479f3-0ccf-11df-8525-001302895b2b");
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
