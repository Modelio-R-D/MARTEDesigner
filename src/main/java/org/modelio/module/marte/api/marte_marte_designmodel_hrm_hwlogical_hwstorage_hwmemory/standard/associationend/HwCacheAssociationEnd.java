/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("1813e432-65b4-49ef-acbd-d486f44f6347")
    public static final String STEREOTYPE_NAME = "HwCache_AssociationEnd";

    @objid ("a5a77afa-7146-476b-8750-0e6e366d56e2")
    public static final String HWCACHE_ASSOCIATIONEND_LEVEL_TAGTYPE = "HwCache_AssociationEnd_level";

    @objid ("c3db060a-7a60-4c2c-8ca1-aef5acd8bcad")
    public static final String HWCACHE_ASSOCIATIONEND_REPL_POLICY_TAGTYPE = "HwCache_AssociationEnd_repl_Policy";

    @objid ("674c059d-cd08-4def-b28f-e20b9537af13")
    public static final String HWCACHE_ASSOCIATIONEND_STRUCTURE_TAGTYPE = "HwCache_AssociationEnd_structure";

    @objid ("d452fdfe-3dfc-4fb8-bea7-b7472e356b32")
    public static final String HWCACHE_ASSOCIATIONEND_TYPE_TAGTYPE = "HwCache_AssociationEnd_type";

    @objid ("fa410e22-df44-4292-b0c9-ef81718797f7")
    public static final String HWCACHE_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE = "HwCache_AssociationEnd_writePolicy";

    /**
     * Tells whether a {@link HwCacheAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwCache_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("99b7e9f6-ac47-4e6b-99d0-d0ad1d0acf96")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwCache_AssociationEnd >> then instantiate a {@link HwCacheAssociationEnd} proxy.
     * 
     * @return a {@link HwCacheAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("4a41398e-7046-49d2-919b-c2167298067d")
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
    @objid ("9ef56242-cdda-4f36-aa1e-5f2b83bd9725")
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
    @objid ("7f85fd67-d73b-4893-a3bc-928f04558667")
    public static HwCacheAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwCacheAssociationEnd.canInstantiate(obj))
        	return new HwCacheAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwCacheAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cce23f53-5049-4370-af24-9671cfb8d42e")
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
    @objid ("4ad007dc-114f-49db-9eb2-d04084ef06bc")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_AssociationEnd_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("85df1bb0-5dd9-46ab-8056-db555ac3ba3c")
    public String getHwCache_AssociationEnd_level() {
        return this.elt.getTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_AssociationEnd_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("819063cd-1a4c-458e-8ee7-103969b084c9")
    public String getHwCache_AssociationEnd_repl_Policy() {
        return this.elt.getTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_AssociationEnd_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09652fce-93e0-4efa-863f-ea2c5bcd732c")
    public String getHwCache_AssociationEnd_structure() {
        return this.elt.getTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8ff598a5-9a06-4d79-93dd-786a25bb29a4")
    public String getHwCache_AssociationEnd_type() {
        return this.elt.getTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_AssociationEnd_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("869e0ad8-ffa9-42a6-a588-34ec50a93fd6")
    public String getHwCache_AssociationEnd_writePolicy() {
        return this.elt.getTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("ec55b36c-6fa4-4bee-a9c2-2b228eb6c50c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_AssociationEnd_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ada5753e-580e-4ef8-a7ca-a79b0d3fe1e4")
    public void setHwCache_AssociationEnd_level(final String value) {
        this.elt.putTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_AssociationEnd_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a393bf7c-3f59-4758-8df3-76b4f792eb4f")
    public void setHwCache_AssociationEnd_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_AssociationEnd_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d5cceda9-9d77-4be7-bacc-6e6ff7f5b329")
    public void setHwCache_AssociationEnd_structure(final String value) {
        this.elt.putTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0bcf6155-9bf0-4daf-be15-f63722e546fe")
    public void setHwCache_AssociationEnd_type(final String value) {
        this.elt.putTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_AssociationEnd_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a27cb7b8-fb8b-47a1-a20f-431117a62f76")
    public void setHwCache_AssociationEnd_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheAssociationEnd.MdaTypes.HWCACHE_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("2e03deec-5036-4c44-85be-9c72197b6e4c")
    protected HwCacheAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("3bcd3f2a-c638-4761-8ce3-badef1598de0")
    public static final class MdaTypes {
        @objid ("ada8bbb2-a29a-4bea-880c-10da09952bd8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8d348436-fa03-4e3c-a2f6-41f4aa15b63e")
        public static TagType HWCACHE_ASSOCIATIONEND_LEVEL_TAGTYPE_ELT;

        @objid ("52c5340e-581d-4f81-95fc-9bd1943e0e8c")
        public static TagType HWCACHE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT;

        @objid ("b1339c0b-399e-48d6-80c0-761ba491088f")
        public static TagType HWCACHE_ASSOCIATIONEND_STRUCTURE_TAGTYPE_ELT;

        @objid ("0afb78b5-e890-4c91-b277-ac8e38ca41cd")
        public static TagType HWCACHE_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT;

        @objid ("be54b0b7-6a73-4ac1-9707-71c0c0382be8")
        public static TagType HWCACHE_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("c60ee349-2143-4c16-9468-16900f166367")
        private static Stereotype MDAASSOCDEP;

        @objid ("95fbc4c0-8a90-4193-9359-d553a3a523e8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("46139d2e-888a-4b39-b01f-caa598b7cccf")
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
