/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association;

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
@objid ("a3a1b5de-9e97-4b71-aa2f-c03f4cb8a5ad")
public class HwCacheAssociation extends HwMemoryAssociation {
    @objid ("f3ca0656-1b70-4cf3-97b7-f77f8e137492")
    public static final String STEREOTYPE_NAME = "HwCache_Association";

    @objid ("e61c9e16-ab19-49e1-b1e2-b651e24d77db")
    public static final String HWCACHE_ASSOCIATION_LEVEL_TAGTYPE = "HwCache_Association_level";

    @objid ("98fffd1d-a8d2-4c44-a52b-3eafdb084d0e")
    public static final String HWCACHE_ASSOCIATION_REPL_POLICY_TAGTYPE = "HwCache_Association_repl_Policy";

    @objid ("3978ef29-dc1c-4ef9-89ec-a8d84dfafd8a")
    public static final String HWCACHE_ASSOCIATION_STRUCTURE_TAGTYPE = "HwCache_Association_structure";

    @objid ("d454d95a-9227-4316-9179-636502b9f1c6")
    public static final String HWCACHE_ASSOCIATION_TYPE_TAGTYPE = "HwCache_Association_type";

    @objid ("666efb2e-ff21-4c7d-bc53-998880b683ca")
    public static final String HWCACHE_ASSOCIATION_WRITEPOLICY_TAGTYPE = "HwCache_Association_writePolicy";

    /**
     * Tells whether a {@link HwCacheAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwCache_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ac3c21fd-1913-4be7-8409-5640049196b0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwCache_Association >> then instantiate a {@link HwCacheAssociation} proxy.
     * 
     * @return a {@link HwCacheAssociation} proxy on the created {@link Association}.
     */
    @objid ("25d7db37-18d0-4d04-8309-cc9daabd5942")
    public static HwCacheAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheAssociation.STEREOTYPE_NAME);
        return HwCacheAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwCacheAssociation} proxy from a {@link Association} stereotyped << HwCache_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwCacheAssociation} proxy or <i>null</i>.
     */
    @objid ("cac49557-98af-441c-b994-6640d36abea9")
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
    @objid ("85cb501f-b450-4c31-8066-3c1ce0687518")
    public static HwCacheAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwCacheAssociation.canInstantiate(obj))
        	return new HwCacheAssociation(obj);
        else
        	throw new IllegalArgumentException("HwCacheAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("36fdb5b2-e59c-4950-b723-66d996cee45b")
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
    @objid ("1302d1af-ca72-47d4-9bbb-52be815fff2a")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_Association_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6ee8644-654e-4662-bacb-60d709b3aa07")
    public String getHwCache_Association_level() {
        return this.elt.getTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Association_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c9c1cd98-5fce-4b79-bd3a-716b1d5561e8")
    public String getHwCache_Association_repl_Policy() {
        return this.elt.getTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Association_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("84b3a677-85bb-4c37-bcb9-a6f0b0d13c90")
    public String getHwCache_Association_structure() {
        return this.elt.getTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4aea5c1c-8583-454f-8b90-fed53da8ba7f")
    public String getHwCache_Association_type() {
        return this.elt.getTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Association_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d236dc41-7617-4774-90ea-36e6a78a2517")
    public String getHwCache_Association_writePolicy() {
        return this.elt.getTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("ff9dfc2b-61fc-4f61-8303-b1be3457a06d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_Association_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6a5305c8-1afe-449b-90a0-f5894a4780c6")
    public void setHwCache_Association_level(final String value) {
        this.elt.putTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Association_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eedbfbe6-b843-4166-ac3d-87a3cb528cd8")
    public void setHwCache_Association_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Association_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2266187f-bc51-40e0-a1c3-2ee9e3d48e77")
    public void setHwCache_Association_structure(final String value) {
        this.elt.putTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("efe01f57-2b37-483d-8d45-3c3d01d559b3")
    public void setHwCache_Association_type(final String value) {
        this.elt.putTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Association_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7898af14-680c-4907-a550-7be2aa9f6be8")
    public void setHwCache_Association_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheAssociation.MdaTypes.HWCACHE_ASSOCIATION_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("28ad44a4-1a84-4b3d-8b76-67027992914f")
    protected HwCacheAssociation(final Association elt) {
        super(elt);
    }

    @objid ("c71b37a8-d2e1-47be-91b1-bcea82f90c99")
    public static final class MdaTypes {
        @objid ("bfeb2cc3-6efa-4b4a-bc08-c0332f09c333")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("841ed3d3-0e46-454d-9866-02b967045fce")
        public static TagType HWCACHE_ASSOCIATION_LEVEL_TAGTYPE_ELT;

        @objid ("0c20715a-77d3-4d07-997a-ddc2d38ed424")
        public static TagType HWCACHE_ASSOCIATION_TYPE_TAGTYPE_ELT;

        @objid ("abbd4b22-6b29-4b57-b2e2-eacff0f4f7ed")
        public static TagType HWCACHE_ASSOCIATION_STRUCTURE_TAGTYPE_ELT;

        @objid ("da093918-fe75-4934-b564-23878cc97df0")
        public static TagType HWCACHE_ASSOCIATION_REPL_POLICY_TAGTYPE_ELT;

        @objid ("f22b236c-350e-4c71-92d1-97f0208aaaeb")
        public static TagType HWCACHE_ASSOCIATION_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("c4828ca5-7004-418c-9e5f-a108a9b23eb4")
        private static Stereotype MDAASSOCDEP;

        @objid ("2b1d9e1d-d590-4364-9968-6c85f81ad3b0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d42efe5d-b6fd-43fd-b03f-9b4c29064504")
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
