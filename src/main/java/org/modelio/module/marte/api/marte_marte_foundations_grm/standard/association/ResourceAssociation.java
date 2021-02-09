/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
 * Proxy class to handle a {@link Association} with << Resource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ResourceAssociation {
    public static final String STEREOTYPE_NAME = "Resource_Association";

    public static final String RESOURCE_ASSOCIATION_ISACTIVE_TAGTYPE = "Resource_Association_isActive";

    public static final String RESOURCE_ASSOCIATION_ISPROTECTED_TAGTYPE = "Resource_Association_isProtected";

    public static final String RESOURCE_ASSOCIATION_RESMULT_TAGTYPE = "Resource_Association_resMult";

    /**
     * The underlying {@link Association} represented by this proxy, never null.
     */
    protected final Association elt;

    /**
     * Tells whether a {@link ResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << Resource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << Resource_Association >> then instantiate a {@link ResourceAssociation} proxy.
     * 
     * @return a {@link ResourceAssociation} proxy on the created {@link Association}.
     */
    public static ResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceAssociation.STEREOTYPE_NAME);
        return ResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link ResourceAssociation} proxy from a {@link Association} stereotyped << Resource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link ResourceAssociation} proxy or <i>null</i>.
     */
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
    public static ResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (ResourceAssociation.canInstantiate(obj))
        	return new ResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("ResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ResourceAssociation other = (ResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    public Association getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_Association_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getResource_Association_resMult() {
        return this.elt.getTagValue(ResourceAssociation.MdaTypes.RESOURCE_ASSOCIATION_RESMULT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_Association_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_Association_isActive() {
        return this.elt.isTagged(ResourceAssociation.MdaTypes.RESOURCE_ASSOCIATION_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_Association_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_Association_isProtected() {
        return this.elt.isTagged(ResourceAssociation.MdaTypes.RESOURCE_ASSOCIATION_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Association_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setResource_Association_resMult(final String value) {
        this.elt.putTagValue(ResourceAssociation.MdaTypes.RESOURCE_ASSOCIATION_RESMULT_TAGTYPE_ELT, value);
    }

    protected ResourceAssociation(final Association elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RESOURCE_ASSOCIATION_RESMULT_TAGTYPE_ELT;

        public static TagType RESOURCE_ASSOCIATION_ISPROTECTED_TAGTYPE_ELT;

        public static TagType RESOURCE_ASSOCIATION_ISACTIVE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
