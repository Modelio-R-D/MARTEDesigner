/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter;

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
@objid ("e52591b3-4096-412f-9c32-ef0eece6138c")
public class HwCacheParameter extends HwMemoryParameter {
    @objid ("9b9875f8-5dd8-446e-86a0-8e2e24a2edb0")
    public static final String STEREOTYPE_NAME = "HwCache_Parameter";

    @objid ("2ab60009-bd3e-46a2-8794-557e706f2ed7")
    public static final String HWCACHE_PARAMETER_LEVEL_TAGTYPE = "HwCache_Parameter_level";

    @objid ("f71700ec-060b-4845-a0c2-6daea6075eb2")
    public static final String HWCACHE_PARAMETER_REPL_POLICY_TAGTYPE = "HwCache_Parameter_repl_Policy";

    @objid ("1ecc7565-68b8-4991-910e-3fd7037d5ace")
    public static final String HWCACHE_PARAMETER_STRUCTURE_TAGTYPE = "HwCache_Parameter_structure";

    @objid ("aa416a70-a8ae-4800-9c35-ae370eccf1f1")
    public static final String HWCACHE_PARAMETER_TYPE_TAGTYPE = "HwCache_Parameter_type";

    @objid ("2e83bab5-ef79-4517-84c6-538ef2518170")
    public static final String HWCACHE_PARAMETER_WRITEPOLICY_TAGTYPE = "HwCache_Parameter_writePolicy";

    /**
     * Tells whether a {@link HwCacheParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwCache_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("28d74763-4b03-49f2-bb52-eaa41540ce8b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwCache_Parameter >> then instantiate a {@link HwCacheParameter} proxy.
     * 
     * @return a {@link HwCacheParameter} proxy on the created {@link Parameter}.
     */
    @objid ("66cb2c76-29e0-410c-8ed0-774319e24ad3")
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
    @objid ("05ac4985-fe95-4dbb-9c11-6658f6f2dcdc")
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
    @objid ("b90dc220-a321-49a1-888b-e3d31e48c3df")
    public static HwCacheParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwCacheParameter.canInstantiate(obj))
        	return new HwCacheParameter(obj);
        else
        	throw new IllegalArgumentException("HwCacheParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5ccf22e8-c98e-4962-8cd0-553bb0d15920")
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
    @objid ("7aa14b2c-6988-467d-827d-6d585245f20f")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_Parameter_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("751846c2-2be4-4836-a160-1c83ca204c71")
    public String getHwCache_Parameter_level() {
        return this.elt.getTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Parameter_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("26bc12d0-14f8-4913-b095-cfdfd5dfc292")
    public String getHwCache_Parameter_repl_Policy() {
        return this.elt.getTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Parameter_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9fec0123-f71e-4dc6-bd39-90e27ce8564a")
    public String getHwCache_Parameter_structure() {
        return this.elt.getTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aebb5872-7763-40c7-aa33-4c3d1fbf6c3a")
    public String getHwCache_Parameter_type() {
        return this.elt.getTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Parameter_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7aa189e5-0047-4e96-be58-bbc9439676fb")
    public String getHwCache_Parameter_writePolicy() {
        return this.elt.getTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("c4d6c060-5681-414c-b4d1-54d599ddb5d8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_Parameter_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("990daf6d-12ab-4dd7-ab8a-c90acc919e29")
    public void setHwCache_Parameter_level(final String value) {
        this.elt.putTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Parameter_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e7b2cade-e947-4f89-a28c-714cb86d3e1a")
    public void setHwCache_Parameter_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Parameter_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70786a7a-7dcf-4020-bb4c-47d6ccab13f8")
    public void setHwCache_Parameter_structure(final String value) {
        this.elt.putTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7ab5b245-a375-4e36-8661-1c311efdbf65")
    public void setHwCache_Parameter_type(final String value) {
        this.elt.putTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Parameter_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4ec64990-1967-4f0b-8e6d-f39f5dfd08e0")
    public void setHwCache_Parameter_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheParameter.MdaTypes.HWCACHE_PARAMETER_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("4d4d2bb6-1ccb-4fd5-a312-883217715a25")
    protected HwCacheParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("6e582b43-2782-40b1-8fa2-fa681a3dee82")
    public static final class MdaTypes {
        @objid ("0e498a15-58de-40ff-9b3f-8c78f82b4079")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1c683f62-0a7e-43e5-ab42-ce45962b2357")
        public static TagType HWCACHE_PARAMETER_LEVEL_TAGTYPE_ELT;

        @objid ("b82b8221-1ce4-4570-ad99-5dd1fa33880f")
        public static TagType HWCACHE_PARAMETER_TYPE_TAGTYPE_ELT;

        @objid ("495e8801-1115-42a2-9b86-7904d9907f29")
        public static TagType HWCACHE_PARAMETER_STRUCTURE_TAGTYPE_ELT;

        @objid ("82a13f12-a890-4f83-b06c-7d0a8d90296d")
        public static TagType HWCACHE_PARAMETER_REPL_POLICY_TAGTYPE_ELT;

        @objid ("224e2e9c-1c74-40c2-bed5-f53a538eab5f")
        public static TagType HWCACHE_PARAMETER_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("4ef7d0eb-ecf9-4b8c-b382-05974d0b69c1")
        private static Stereotype MDAASSOCDEP;

        @objid ("d175d31b-e27d-475f-96c3-9cc23103b248")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("372d3231-42b7-4925-a568-c23f04ee1eaf")
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
