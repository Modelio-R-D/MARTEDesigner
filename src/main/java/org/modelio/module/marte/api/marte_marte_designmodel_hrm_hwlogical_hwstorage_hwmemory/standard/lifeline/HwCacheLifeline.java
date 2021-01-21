/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwCache_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ef61ee74-629d-4b84-98fb-7a5487ca13cc")
public class HwCacheLifeline extends HwMemoryLifeline {
    @objid ("0fbf439d-a996-4f52-a1d0-a31c0f3cd766")
    public static final String STEREOTYPE_NAME = "HwCache_Lifeline";

    @objid ("6c323a4b-4ba3-4586-9761-e0eee8f134a1")
    public static final String HWCACHE_LIFELINE_LEVEL_TAGTYPE = "HwCache_Lifeline_level";

    @objid ("03be1809-6cf5-462d-8869-dc7f47a03e75")
    public static final String HWCACHE_LIFELINE_REPL_POLICY_TAGTYPE = "HwCache_Lifeline_repl_Policy";

    @objid ("6f5bc89a-b4d1-4dd7-80b6-29c54b9e3d10")
    public static final String HWCACHE_LIFELINE_STRUCTURE_TAGTYPE = "HwCache_Lifeline_structure";

    @objid ("092c5393-1423-4a0f-883f-55aa76055678")
    public static final String HWCACHE_LIFELINE_TYPE_TAGTYPE = "HwCache_Lifeline_type";

    @objid ("c1363445-6290-49f8-bf71-2ec1c9022af7")
    public static final String HWCACHE_LIFELINE_WRITEPOLICY_TAGTYPE = "HwCache_Lifeline_writePolicy";

    /**
     * Tells whether a {@link HwCacheLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwCache_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5694b8ab-5a91-4e6e-832e-824dd7d1cfa3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwCache_Lifeline >> then instantiate a {@link HwCacheLifeline} proxy.
     * 
     * @return a {@link HwCacheLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("48b61d7f-72b2-454b-a8f5-edca4b37b397")
    public static HwCacheLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheLifeline.STEREOTYPE_NAME);
        return HwCacheLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwCacheLifeline} proxy from a {@link Lifeline} stereotyped << HwCache_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwCacheLifeline} proxy or <i>null</i>.
     */
    @objid ("e2ece275-82d4-41bf-90f2-20ffbc372f95")
    public static HwCacheLifeline instantiate(final Lifeline obj) {
        return HwCacheLifeline.canInstantiate(obj) ? new HwCacheLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCacheLifeline} proxy from a {@link Lifeline} stereotyped << HwCache_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwCacheLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7766ad71-01cf-4a21-8295-94178b215fa9")
    public static HwCacheLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwCacheLifeline.canInstantiate(obj))
        	return new HwCacheLifeline(obj);
        else
        	throw new IllegalArgumentException("HwCacheLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("23b0ecfb-8d05-4f3b-862c-27cf6bd96d55")
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
        HwCacheLifeline other = (HwCacheLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("61fa0fa2-5d6b-4442-921b-042114fd42d9")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_Lifeline_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("080883aa-43f2-443e-bccd-393efacf14a3")
    public String getHwCache_Lifeline_level() {
        return this.elt.getTagValue(HwCacheLifeline.MdaTypes.HWCACHE_LIFELINE_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Lifeline_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2519f53c-5968-4cac-a306-dda5d5812c8d")
    public String getHwCache_Lifeline_repl_Policy() {
        return this.elt.getTagValue(HwCacheLifeline.MdaTypes.HWCACHE_LIFELINE_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Lifeline_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0be3602-394e-4ead-ae77-6c1437fb54f0")
    public String getHwCache_Lifeline_structure() {
        return this.elt.getTagValue(HwCacheLifeline.MdaTypes.HWCACHE_LIFELINE_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Lifeline_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d54f475b-df41-4a37-a52f-10fff74d93de")
    public String getHwCache_Lifeline_type() {
        return this.elt.getTagValue(HwCacheLifeline.MdaTypes.HWCACHE_LIFELINE_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Lifeline_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9961b5d4-d520-46bf-a1b3-c9e5f92c6784")
    public String getHwCache_Lifeline_writePolicy() {
        return this.elt.getTagValue(HwCacheLifeline.MdaTypes.HWCACHE_LIFELINE_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("67fd4c35-af54-4c96-ad12-65f1da4f387a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_Lifeline_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0c1d1fb-ffce-4f35-9d19-b403063b56a7")
    public void setHwCache_Lifeline_level(final String value) {
        this.elt.putTagValue(HwCacheLifeline.MdaTypes.HWCACHE_LIFELINE_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Lifeline_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("077496ac-4f1e-4866-b07b-7d143e0cc8b4")
    public void setHwCache_Lifeline_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheLifeline.MdaTypes.HWCACHE_LIFELINE_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Lifeline_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6c89647d-518d-4b2a-9c08-bcaa0b109733")
    public void setHwCache_Lifeline_structure(final String value) {
        this.elt.putTagValue(HwCacheLifeline.MdaTypes.HWCACHE_LIFELINE_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Lifeline_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0ecb9c8a-4091-4a09-959e-8100dc4dfc0e")
    public void setHwCache_Lifeline_type(final String value) {
        this.elt.putTagValue(HwCacheLifeline.MdaTypes.HWCACHE_LIFELINE_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Lifeline_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("58ede230-0b59-414d-9c82-56e89d880a3d")
    public void setHwCache_Lifeline_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheLifeline.MdaTypes.HWCACHE_LIFELINE_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("2ae700d8-123f-4a4e-9602-069c72430a6e")
    protected HwCacheLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("d8756ae2-bf65-4595-a1d3-032b8ac4bfa4")
    public static final class MdaTypes {
        @objid ("8abbeab5-324f-49d4-bb30-123bd5e5b1e0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("64b684f1-7e98-430b-8be5-1bff79927cb0")
        public static TagType HWCACHE_LIFELINE_LEVEL_TAGTYPE_ELT;

        @objid ("31f52853-20b4-4b3e-81a0-4c15090f84c9")
        public static TagType HWCACHE_LIFELINE_TYPE_TAGTYPE_ELT;

        @objid ("a7010e5d-e8bd-4915-b286-dbaca965f08d")
        public static TagType HWCACHE_LIFELINE_STRUCTURE_TAGTYPE_ELT;

        @objid ("8ebef508-584c-4d94-817c-0e3a0933a6bf")
        public static TagType HWCACHE_LIFELINE_REPL_POLICY_TAGTYPE_ELT;

        @objid ("7d7a0f40-3b0b-4771-ad0f-f25760e90d0c")
        public static TagType HWCACHE_LIFELINE_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("78cef687-c765-4f2f-83d5-ec104e66512b")
        private static Stereotype MDAASSOCDEP;

        @objid ("87e63651-9c1c-43bc-b733-09b1ec7cd791")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cbc1af1b-e5ca-4513-9e2e-5006579fa4a8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6a4ff1b7-1006-11df-86fe-0014222a9f79");
            HWCACHE_LIFELINE_LEVEL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ffafc1d-1007-11df-86fe-0014222a9f79");
            HWCACHE_LIFELINE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ffafc1e-1007-11df-86fe-0014222a9f79");
            HWCACHE_LIFELINE_STRUCTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ffafc1f-1007-11df-86fe-0014222a9f79");
            HWCACHE_LIFELINE_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ffafc20-1007-11df-86fe-0014222a9f79");
            HWCACHE_LIFELINE_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ffafc21-1007-11df-86fe-0014222a9f79");
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
