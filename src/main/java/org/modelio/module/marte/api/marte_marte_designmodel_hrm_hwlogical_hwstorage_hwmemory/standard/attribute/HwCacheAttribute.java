/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute;

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
@objid ("271b0b6f-0900-4bc7-8437-261400bd92a5")
public class HwCacheAttribute extends HwMemoryAttribute {
    @objid ("807e25a4-f4bc-493c-9842-cd1c324845d8")
    public static final String STEREOTYPE_NAME = "HwCache_Attribute";

    @objid ("76866f83-aa25-4ebe-a9a1-ac3157d3ff24")
    public static final String HWCACHE_ATTRIBUTE_LEVEL_TAGTYPE = "HwCache_Attribute_level";

    @objid ("70bd3ae2-f298-47da-b4be-8ce438f08e07")
    public static final String HWCACHE_ATTRIBUTE_REPL_POLICY_TAGTYPE = "HwCache_Attribute_repl_Policy";

    @objid ("fda2ff55-6532-4eb6-a408-c606906de336")
    public static final String HWCACHE_ATTRIBUTE_STRUCTURE_TAGTYPE = "HwCache_Attribute_structure";

    @objid ("613b6be8-5a30-45a7-9421-ac2d167852b6")
    public static final String HWCACHE_ATTRIBUTE_TYPE_TAGTYPE = "HwCache_Attribute_type";

    @objid ("2b43ee93-45b7-4364-9d1d-90371bf318ae")
    public static final String HWCACHE_ATTRIBUTE_WRITEPOLICY_TAGTYPE = "HwCache_Attribute_writePolicy";

    /**
     * Tells whether a {@link HwCacheAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwCache_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2abd3d5e-d66c-45d3-a6e1-27fc5d6eba58")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwCache_Attribute >> then instantiate a {@link HwCacheAttribute} proxy.
     * 
     * @return a {@link HwCacheAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("20e2eb75-b1eb-488a-9faa-c832e248069f")
    public static HwCacheAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheAttribute.STEREOTYPE_NAME);
        return HwCacheAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwCacheAttribute} proxy from a {@link Attribute} stereotyped << HwCache_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwCacheAttribute} proxy or <i>null</i>.
     */
    @objid ("166d502d-3350-461e-acc7-cff286172c11")
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
    @objid ("c6a57714-5659-446a-829b-83c015c86c75")
    public static HwCacheAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwCacheAttribute.canInstantiate(obj))
        	return new HwCacheAttribute(obj);
        else
        	throw new IllegalArgumentException("HwCacheAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("44d86cdc-8c5a-4206-9f8e-6412be08ccee")
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
    @objid ("6741d637-0d06-452e-83e6-b6d2b65b890f")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_Attribute_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0f4476ec-3a73-4b37-8fa8-d2b4c430d574")
    public String getHwCache_Attribute_level() {
        return this.elt.getTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Attribute_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2e5bb2e1-60f1-4cb8-a762-98187b06679f")
    public String getHwCache_Attribute_repl_Policy() {
        return this.elt.getTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Attribute_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("42a8c92a-d2b4-4d06-8439-086bf75c4176")
    public String getHwCache_Attribute_structure() {
        return this.elt.getTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe6faaca-804e-4905-a100-da7a79fd1fc0")
    public String getHwCache_Attribute_type() {
        return this.elt.getTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Attribute_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c893a556-1269-45f0-bb4e-276c1481494b")
    public String getHwCache_Attribute_writePolicy() {
        return this.elt.getTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("f26adaca-a857-41aa-b699-b5649805a1e3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_Attribute_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("91578a9e-2820-4d0b-ac1f-0ea4f08dd86f")
    public void setHwCache_Attribute_level(final String value) {
        this.elt.putTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Attribute_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e868f089-20b0-40e4-9300-b99324017f06")
    public void setHwCache_Attribute_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Attribute_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4c580e17-0fe7-4e9e-93d9-937c2543fb8e")
    public void setHwCache_Attribute_structure(final String value) {
        this.elt.putTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a1bb74db-4f5e-4b2f-9dcd-9e52875ae3af")
    public void setHwCache_Attribute_type(final String value) {
        this.elt.putTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Attribute_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5cbd8dd7-4021-49fd-9227-c50ed0ae5d1d")
    public void setHwCache_Attribute_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("77a522b4-de48-4141-8132-e0dcda8b99f4")
    protected HwCacheAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("fed24553-7987-44c8-8e7d-5cbd3776dd0f")
    public static final class MdaTypes {
        @objid ("623fa4cb-0a05-4553-b937-3985c90c1160")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b5641636-c0dd-4423-8578-70e0383551a7")
        public static TagType HWCACHE_ATTRIBUTE_LEVEL_TAGTYPE_ELT;

        @objid ("c884ce36-2488-4675-9058-30611b63c896")
        public static TagType HWCACHE_ATTRIBUTE_TYPE_TAGTYPE_ELT;

        @objid ("e83b768c-f9ef-4954-b855-a295ac8e1f7e")
        public static TagType HWCACHE_ATTRIBUTE_STRUCTURE_TAGTYPE_ELT;

        @objid ("93d50090-cbf4-440b-968e-69ed4d81e66a")
        public static TagType HWCACHE_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT;

        @objid ("306fbeb3-601e-447d-a232-09b0f2e34149")
        public static TagType HWCACHE_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("c838af09-488e-4ab8-a3dd-2117184de087")
        private static Stereotype MDAASSOCDEP;

        @objid ("e5149c0a-3c71-4d6b-863e-27bee0b3d268")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2de9cd3a-e0ac-409d-8668-9bc6644f586e")
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
