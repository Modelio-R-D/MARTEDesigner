/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("34fef90f-d4c1-4fcf-a02e-45b147910dea")
    public static final String STEREOTYPE_NAME = "HwCache_Attribute";

    @objid ("c785b702-097f-4e37-9b45-40cb967a6c4e")
    public static final String HWCACHE_ATTRIBUTE_LEVEL_TAGTYPE = "HwCache_Attribute_level";

    @objid ("5937f732-07c1-4adb-b957-d93911a83926")
    public static final String HWCACHE_ATTRIBUTE_REPL_POLICY_TAGTYPE = "HwCache_Attribute_repl_Policy";

    @objid ("4e763e47-e08e-4bc6-a63e-4bbf9ad33c7e")
    public static final String HWCACHE_ATTRIBUTE_STRUCTURE_TAGTYPE = "HwCache_Attribute_structure";

    @objid ("17416adf-4053-42ff-8065-cfc9cd59c3a9")
    public static final String HWCACHE_ATTRIBUTE_TYPE_TAGTYPE = "HwCache_Attribute_type";

    @objid ("603697a2-8d9e-4de6-b69a-f9f670094537")
    public static final String HWCACHE_ATTRIBUTE_WRITEPOLICY_TAGTYPE = "HwCache_Attribute_writePolicy";

    /**
     * Tells whether a {@link HwCacheAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwCache_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("821851b7-b1e5-49f8-b78b-8b0f2aaa1af6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwCache_Attribute >> then instantiate a {@link HwCacheAttribute} proxy.
     * 
     * @return a {@link HwCacheAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("b4994514-48b1-4e01-ba0d-d1fb0402c583")
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
    @objid ("c1e23a7d-5d4c-43af-bdb3-b22412864e3f")
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
    @objid ("963ca250-7fcc-408a-90fc-4f1fb1894877")
    public static HwCacheAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwCacheAttribute.canInstantiate(obj))
        	return new HwCacheAttribute(obj);
        else
        	throw new IllegalArgumentException("HwCacheAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dffa0631-a130-4e98-87bc-53438ac94464")
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
    @objid ("1e647cdf-c65a-4c2b-b8c7-e66dbf04a2f9")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_Attribute_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d632db5-d59b-423c-ac78-4773050a4844")
    public String getHwCache_Attribute_level() {
        return this.elt.getTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Attribute_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6dea85e4-08d1-463b-8062-f5f8841fdf3d")
    public String getHwCache_Attribute_repl_Policy() {
        return this.elt.getTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Attribute_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e35ae9fe-8fe6-4775-a2e7-0d0d86ccb60d")
    public String getHwCache_Attribute_structure() {
        return this.elt.getTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2b54d3ef-7e74-43a5-80ca-e8e38cdb8131")
    public String getHwCache_Attribute_type() {
        return this.elt.getTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Attribute_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("afdf8564-0f54-4cc2-9dd7-ae16248c66fb")
    public String getHwCache_Attribute_writePolicy() {
        return this.elt.getTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("321b5a34-bf97-4496-b18b-ac7bfd88c211")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_Attribute_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6ee7191b-eca8-46d6-9ea6-3939b7aae385")
    public void setHwCache_Attribute_level(final String value) {
        this.elt.putTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Attribute_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a4d2167d-e9e7-401d-ab76-873bb6c5a0c5")
    public void setHwCache_Attribute_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Attribute_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24364e1a-2c02-408e-9fd1-ff13c7ce9472")
    public void setHwCache_Attribute_structure(final String value) {
        this.elt.putTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a56dccf3-a757-4ae5-9710-4573a06e2e98")
    public void setHwCache_Attribute_type(final String value) {
        this.elt.putTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Attribute_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0426191-aedb-4103-b22e-9636adf18faf")
    public void setHwCache_Attribute_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheAttribute.MdaTypes.HWCACHE_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("9387009e-aaa0-4196-9f01-2aff19b0e467")
    protected HwCacheAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("fed24553-7987-44c8-8e7d-5cbd3776dd0f")
    public static final class MdaTypes {
        @objid ("cb4dff5f-8f41-4391-a21a-ef380edb5c20")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a43d8079-d917-4405-ba71-f04945a89ab4")
        public static TagType HWCACHE_ATTRIBUTE_LEVEL_TAGTYPE_ELT;

        @objid ("27f72d86-d777-48fb-9c08-e472b30da680")
        public static TagType HWCACHE_ATTRIBUTE_TYPE_TAGTYPE_ELT;

        @objid ("c0862ffe-bca1-4dd5-b73d-8b6683ec063e")
        public static TagType HWCACHE_ATTRIBUTE_STRUCTURE_TAGTYPE_ELT;

        @objid ("bc042c55-4360-473c-85f2-9cfb2771945a")
        public static TagType HWCACHE_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT;

        @objid ("8662100f-78ac-424a-aa41-61cf9a5dd403")
        public static TagType HWCACHE_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("4bc69b76-425c-4eb8-beed-17cbcc4d3bb7")
        private static Stereotype MDAASSOCDEP;

        @objid ("b1e2bc92-f83b-49ab-af16-528141bee015")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c7805781-afd6-44ce-8518-a369dd51c634")
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
