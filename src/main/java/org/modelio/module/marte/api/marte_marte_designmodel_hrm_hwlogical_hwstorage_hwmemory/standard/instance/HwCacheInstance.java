/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwCache_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("370d2f26-ab70-4cbd-8510-c9a79993fdac")
public class HwCacheInstance extends HwMemoryInstance {
    @objid ("5b189b7e-8b5f-457d-ad48-1f1f0a030cec")
    public static final String STEREOTYPE_NAME = "HwCache_Instance";

    @objid ("3956acab-9c22-456f-9a4c-0b43bf31302b")
    public static final String HWCACHE_INSTANCE_LEVEL_TAGTYPE = "HwCache_Instance_level";

    @objid ("90b0c5ee-5437-4203-87da-3832544448ae")
    public static final String HWCACHE_INSTANCE_REPL_POLICY_TAGTYPE = "HwCache_Instance_repl_Policy";

    @objid ("5dd9764a-38b0-4d9c-99a1-e5bc3e78affa")
    public static final String HWCACHE_INSTANCE_STRUCTURE_TAGTYPE = "HwCache_Instance_structure";

    @objid ("6614f2e4-03f8-4243-9d38-1e368694b829")
    public static final String HWCACHE_INSTANCE_TYPE_TAGTYPE = "HwCache_Instance_type";

    @objid ("92a7b611-a625-4a82-bacd-30b917cda272")
    public static final String HWCACHE_INSTANCE_WRITEPOLICY_TAGTYPE = "HwCache_Instance_writePolicy";

    /**
     * Tells whether a {@link HwCacheInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwCache_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("33f0738a-7e49-4de0-a0e0-a3fe4111f4ce")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwCache_Instance >> then instantiate a {@link HwCacheInstance} proxy.
     * 
     * @return a {@link HwCacheInstance} proxy on the created {@link Instance}.
     */
    @objid ("0834d535-497f-45a8-9c22-74423967211a")
    public static HwCacheInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheInstance.STEREOTYPE_NAME);
        return HwCacheInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwCacheInstance} proxy from a {@link Instance} stereotyped << HwCache_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwCacheInstance} proxy or <i>null</i>.
     */
    @objid ("11dfbf98-f600-45b1-b5be-8ca601c4bc34")
    public static HwCacheInstance instantiate(final Instance obj) {
        return HwCacheInstance.canInstantiate(obj) ? new HwCacheInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCacheInstance} proxy from a {@link Instance} stereotyped << HwCache_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwCacheInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e64adfc6-3ff7-48ea-a63f-7acd6482047c")
    public static HwCacheInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwCacheInstance.canInstantiate(obj))
        	return new HwCacheInstance(obj);
        else
        	throw new IllegalArgumentException("HwCacheInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a4548ac0-6758-4535-8daf-12091aee9d70")
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
        HwCacheInstance other = (HwCacheInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("0ff0a83f-df26-44a4-b1b7-f37019579ecc")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_Instance_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("63ec015b-057d-4e0d-a792-3d292769fb7b")
    public String getHwCache_Instance_level() {
        return this.elt.getTagValue(HwCacheInstance.MdaTypes.HWCACHE_INSTANCE_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Instance_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be88f641-f60e-470e-b860-28c04ac27825")
    public String getHwCache_Instance_repl_Policy() {
        return this.elt.getTagValue(HwCacheInstance.MdaTypes.HWCACHE_INSTANCE_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Instance_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c19d4629-37bb-45bf-9045-dd8b4ee890cf")
    public String getHwCache_Instance_structure() {
        return this.elt.getTagValue(HwCacheInstance.MdaTypes.HWCACHE_INSTANCE_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3cd9ff5d-cf72-4e72-8514-b88c27ae399e")
    public String getHwCache_Instance_type() {
        return this.elt.getTagValue(HwCacheInstance.MdaTypes.HWCACHE_INSTANCE_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Instance_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c53fc8f6-49f5-4370-a7b3-29cb3d4dfc49")
    public String getHwCache_Instance_writePolicy() {
        return this.elt.getTagValue(HwCacheInstance.MdaTypes.HWCACHE_INSTANCE_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("1381e5dd-5dc9-4108-b5dc-a7781abd3417")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_Instance_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1b0fad1-27e8-4393-a538-0562be110159")
    public void setHwCache_Instance_level(final String value) {
        this.elt.putTagValue(HwCacheInstance.MdaTypes.HWCACHE_INSTANCE_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Instance_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0b4c9b86-23b7-42df-87f0-587806877d8e")
    public void setHwCache_Instance_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheInstance.MdaTypes.HWCACHE_INSTANCE_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Instance_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("31b0e3b0-2525-40b1-bdf3-96464e632ab3")
    public void setHwCache_Instance_structure(final String value) {
        this.elt.putTagValue(HwCacheInstance.MdaTypes.HWCACHE_INSTANCE_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8f6994a2-433c-44dd-ae72-92fe7db0b243")
    public void setHwCache_Instance_type(final String value) {
        this.elt.putTagValue(HwCacheInstance.MdaTypes.HWCACHE_INSTANCE_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Instance_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0dbe449f-542a-4f72-9e12-92d422b96682")
    public void setHwCache_Instance_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheInstance.MdaTypes.HWCACHE_INSTANCE_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("1c341e1d-bc17-4c7c-b074-51d3c44f9280")
    protected HwCacheInstance(final Instance elt) {
        super(elt);
    }

    @objid ("ad23f43b-23a3-4a26-9f33-0916ed43db86")
    public static final class MdaTypes {
        @objid ("23a4c623-3f14-4bf8-ae5a-1f49f83e40d8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dc170cbf-4901-4211-95b5-b7f9de7c2c99")
        public static TagType HWCACHE_INSTANCE_LEVEL_TAGTYPE_ELT;

        @objid ("04d15bb3-097c-4d70-9bdf-70bbe25b8b08")
        public static TagType HWCACHE_INSTANCE_TYPE_TAGTYPE_ELT;

        @objid ("d11556f2-a1f9-4e3f-bbb1-4361b1ad21de")
        public static TagType HWCACHE_INSTANCE_STRUCTURE_TAGTYPE_ELT;

        @objid ("5b14c793-faac-4a6e-814b-65b5e644186b")
        public static TagType HWCACHE_INSTANCE_REPL_POLICY_TAGTYPE_ELT;

        @objid ("994a2d76-65db-435c-b543-9b41ddd734b5")
        public static TagType HWCACHE_INSTANCE_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("fcbe3f36-c274-4b1f-b2e5-8eb3384284eb")
        private static Stereotype MDAASSOCDEP;

        @objid ("48e2ac47-8b8e-42fc-81f3-ba4f9be7cbed")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a582bd43-9838-48d0-b0c6-5afed26caeea")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "015479cf-0ccf-11df-8525-001302895b2b");
            HWCACHE_INSTANCE_LEVEL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479d6-0ccf-11df-8525-001302895b2b");
            HWCACHE_INSTANCE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479dd-0ccf-11df-8525-001302895b2b");
            HWCACHE_INSTANCE_STRUCTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479e4-0ccf-11df-8525-001302895b2b");
            HWCACHE_INSTANCE_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479eb-0ccf-11df-8525-001302895b2b");
            HWCACHE_INSTANCE_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015479f2-0ccf-11df-8525-001302895b2b");
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
