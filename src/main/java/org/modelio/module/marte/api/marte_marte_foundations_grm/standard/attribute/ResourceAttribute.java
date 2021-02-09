/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << Resource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ResourceAttribute {
    public static final String STEREOTYPE_NAME = "Resource_Attribute";

    public static final String RESOURCE_ATTRIBUTE_ISACTIVE_TAGTYPE = "Resource_Attribute_isActive";

    public static final String RESOURCE_ATTRIBUTE_ISPROTECTED_TAGTYPE = "Resource_Attribute_isProtected";

    public static final String RESOURCE_ATTRIBUTE_RESMULT_TAGTYPE = "Resource_Attribute_resMult";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    protected final Attribute elt;

    /**
     * Tells whether a {@link ResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Resource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Resource_Attribute >> then instantiate a {@link ResourceAttribute} proxy.
     * 
     * @return a {@link ResourceAttribute} proxy on the created {@link Attribute}.
     */
    public static ResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceAttribute.STEREOTYPE_NAME);
        return ResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link ResourceAttribute} proxy from a {@link Attribute} stereotyped << Resource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link ResourceAttribute} proxy or <i>null</i>.
     */
    public static ResourceAttribute instantiate(final Attribute obj) {
        return ResourceAttribute.canInstantiate(obj) ? new ResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceAttribute} proxy from a {@link Attribute} stereotyped << Resource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link ResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (ResourceAttribute.canInstantiate(obj))
        	return new ResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("ResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ResourceAttribute other = (ResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_Attribute_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getResource_Attribute_resMult() {
        return this.elt.getTagValue(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_RESMULT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_Attribute_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_Attribute_isActive() {
        return this.elt.isTagged(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_Attribute_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_Attribute_isProtected() {
        return this.elt.isTagged(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Attribute_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_Attribute_isActive(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_ISACTIVE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Attribute_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_Attribute_isProtected(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_ISPROTECTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Resource_Attribute_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_Attribute_resMult(final String value) {
        this.elt.putTagValue(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_RESMULT_TAGTYPE_ELT, value);
    }

    protected ResourceAttribute(final Attribute elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RESOURCE_ATTRIBUTE_RESMULT_TAGTYPE_ELT;

        public static TagType RESOURCE_ATTRIBUTE_ISPROTECTED_TAGTYPE_ELT;

        public static TagType RESOURCE_ATTRIBUTE_ISACTIVE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ff9dcee0-0cce-11df-8525-001302895b2b");
            RESOURCE_ATTRIBUTE_RESMULT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa0312e-0cce-11df-8525-001302895b2b");
            RESOURCE_ATTRIBUTE_ISPROTECTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa29383-0cce-11df-8525-001302895b2b");
            RESOURCE_ATTRIBUTE_ISACTIVE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa2938a-0cce-11df-8525-001302895b2b");
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
