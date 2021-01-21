/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
 * Proxy class to handle a {@link Association} with << Resource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ce4b51c0-d5f5-443f-abcf-17c576056166")
public class ResourceAssociation {
    @objid ("fbdc2e2f-f99f-4478-92b3-260fb8deddf2")
    public static final String STEREOTYPE_NAME = "Resource_Association";

    @objid ("bbb23552-b2e5-4b5c-9d95-867db706aa49")
    public static final String RESOURCE_ASSOCIATION_ISACTIVE_TAGTYPE = "Resource_Association_isActive";

    @objid ("2df2b0bc-5af5-459a-b2c2-ec84745ebc5c")
    public static final String RESOURCE_ASSOCIATION_ISPROTECTED_TAGTYPE = "Resource_Association_isProtected";

    @objid ("03bb3db9-b0d7-415c-a9a3-307175dc3447")
    public static final String RESOURCE_ASSOCIATION_RESMULT_TAGTYPE = "Resource_Association_resMult";

    /**
     * The underlying {@link Association} represented by this proxy, never null.
     */
    @objid ("ea3792f8-6548-4576-9148-cfb97df9aed7")
    protected final Association elt;

    /**
     * Tells whether a {@link ResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << Resource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4208fc30-2428-4464-b499-40df9d0ead5b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << Resource_Association >> then instantiate a {@link ResourceAssociation} proxy.
     * 
     * @return a {@link ResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("ffccf3aa-a26a-4b47-b416-306746a52a2f")
    public static ResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceAssociation.STEREOTYPE_NAME);
        return ResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link ResourceAssociation} proxy from a {@link Association} stereotyped << Resource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link ResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("8f0fdcc5-e404-44de-b406-65bc4f519958")
    public static ResourceAssociation instantiate(final Association obj) {
        return ResourceAssociation.canInstantiate(obj) ? new ResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceAssociation} proxy from a {@link Association} stereotyped << Resource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link ResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3d7fb36d-3dc2-4ecd-836e-3265a80ac8f7")
    public static ResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (ResourceAssociation.canInstantiate(obj))
        	return new ResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("ResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e3b5e5b8-92f2-463a-8a14-a0642a3d0ad4")
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
        ResourceAssociation other = (ResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("0f583dd0-8340-4d88-b270-fd5187649f23")
    public Association getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_Association_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c85a3cab-b236-4b98-9cdf-577f08323991")
    public String getResource_Association_resMult() {
        return this.elt.getTagValue(ResourceAssociation.MdaTypes.RESOURCE_ASSOCIATION_RESMULT_TAGTYPE_ELT);
    }

    @objid ("383d60c1-e900-4c2f-8786-5c01b184a58b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_Association_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1b198ed-3eaf-411c-91e8-55be5149616d")
    public boolean isResource_Association_isActive() {
        return this.elt.isTagged(ResourceAssociation.MdaTypes.RESOURCE_ASSOCIATION_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_Association_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f8c0f31d-8506-4d59-803f-1148b1a1bb59")
    public boolean isResource_Association_isProtected() {
        return this.elt.isTagged(ResourceAssociation.MdaTypes.RESOURCE_ASSOCIATION_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Association_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ee768cdb-a3fb-4843-9163-bdacbfeb4c3f")
    public void setResource_Association_isActive(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceAssociation.MdaTypes.RESOURCE_ASSOCIATION_ISACTIVE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceAssociation.MdaTypes.RESOURCE_ASSOCIATION_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Association_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9a0153b4-ce0f-42aa-8393-323b3fd7a863")
    public void setResource_Association_isProtected(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceAssociation.MdaTypes.RESOURCE_ASSOCIATION_ISPROTECTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceAssociation.MdaTypes.RESOURCE_ASSOCIATION_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Resource_Association_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6c8b1627-6327-438e-b6ec-c723a511945d")
    public void setResource_Association_resMult(final String value) {
        this.elt.putTagValue(ResourceAssociation.MdaTypes.RESOURCE_ASSOCIATION_RESMULT_TAGTYPE_ELT, value);
    }

    @objid ("f7135386-98c1-4d03-9139-708d6f7e0e26")
    protected ResourceAssociation(final Association elt) {
        this.elt = elt;
    }

    @objid ("bdb61db6-c626-453d-bac2-9f0bfd7983df")
    public static final class MdaTypes {
        @objid ("b75d8c29-c8c6-4614-bc47-5c16c07fccdc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8ffb7180-ade3-492b-84a6-0a3e7dba06e8")
        public static TagType RESOURCE_ASSOCIATION_RESMULT_TAGTYPE_ELT;

        @objid ("fce8af87-525e-429a-a0ea-1d10c0085298")
        public static TagType RESOURCE_ASSOCIATION_ISPROTECTED_TAGTYPE_ELT;

        @objid ("6a3ece83-a49b-4f0d-9680-cfe239a29b91")
        public static TagType RESOURCE_ASSOCIATION_ISACTIVE_TAGTYPE_ELT;

        @objid ("bbdfc971-8cb3-48ca-a94c-06be59563298")
        private static Stereotype MDAASSOCDEP;

        @objid ("470ce577-469d-4d51-86fe-e47a32f10193")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3715e8c5-5841-4970-90fb-26ded8a95b21")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6ee8d83a-101a-11df-86fe-0014222a9f79");
            RESOURCE_ASSOCIATION_RESMULT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "88f0c599-101a-11df-86fe-0014222a9f79");
            RESOURCE_ASSOCIATION_ISPROTECTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "88f0c59a-101a-11df-86fe-0014222a9f79");
            RESOURCE_ASSOCIATION_ISACTIVE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "88f0c59b-101a-11df-86fe-0014222a9f79");
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
