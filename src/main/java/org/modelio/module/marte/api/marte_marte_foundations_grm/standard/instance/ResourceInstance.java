/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << Resource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ResourceInstance {
    public static final String STEREOTYPE_NAME = "Resource_Instance";

    public static final String RESOURCE_INSTANCE_ISACTIVE_TAGTYPE = "Resource_Instance_isActive";

    public static final String RESOURCE_INSTANCE_ISPROTECTED_TAGTYPE = "Resource_Instance_isProtected";

    public static final String RESOURCE_INSTANCE_RESMULT_TAGTYPE = "Resource_Instance_resMult";

    /**
     * The underlying {@link Instance} represented by this proxy, never null.
     */
    protected final Instance elt;

    /**
     * Tells whether a {@link ResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Resource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Resource_Instance >> then instantiate a {@link ResourceInstance} proxy.
     * 
     * @return a {@link ResourceInstance} proxy on the created {@link Instance}.
     */
    public static ResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceInstance.STEREOTYPE_NAME);
        return ResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link ResourceInstance} proxy from a {@link Instance} stereotyped << Resource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link ResourceInstance} proxy or <i>null</i>.
     */
    public static ResourceInstance instantiate(final Instance obj) {
        return ResourceInstance.canInstantiate(obj) ? new ResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceInstance} proxy from a {@link Instance} stereotyped << Resource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link ResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ResourceInstance.canInstantiate(obj))
        	return new ResourceInstance(obj);
        else
        	throw new IllegalArgumentException("ResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ResourceInstance other = (ResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    public Instance getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_Instance_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getResource_Instance_resMult() {
        return this.elt.getTagValue(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_RESMULT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_Instance_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_Instance_isActive() {
        return this.elt.isTagged(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_Instance_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_Instance_isProtected() {
        return this.elt.isTagged(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Instance_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_Instance_isActive(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_ISACTIVE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Instance_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_Instance_isProtected(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_ISPROTECTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Resource_Instance_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_Instance_resMult(final String value) {
        this.elt.putTagValue(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_RESMULT_TAGTYPE_ELT, value);
    }

    protected ResourceInstance(final Instance elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RESOURCE_INSTANCE_RESMULT_TAGTYPE_ELT;

        public static TagType RESOURCE_INSTANCE_ISPROTECTED_TAGTYPE_ELT;

        public static TagType RESOURCE_INSTANCE_ISACTIVE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ff9dcee3-0cce-11df-8525-001302895b2b");
            RESOURCE_INSTANCE_RESMULT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa2937f-0cce-11df-8525-001302895b2b");
            RESOURCE_INSTANCE_ISPROTECTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa29386-0cce-11df-8525-001302895b2b");
            RESOURCE_INSTANCE_ISACTIVE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa2938d-0cce-11df-8525-001302895b2b");
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
