/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.linkend;

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
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link LinkEnd} with << Resource_LinkEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ResourceLinkEnd {
    public static final String STEREOTYPE_NAME = "Resource_LinkEnd";

    public static final String RESOURCE_LINKEND_ISACTIVE_TAGTYPE = "Resource_LinkEnd_isActive";

    public static final String RESOURCE_LINKEND_ISPROTECTED_TAGTYPE = "Resource_LinkEnd_isProtected";

    public static final String RESOURCE_LINKEND_RESMULT_TAGTYPE = "Resource_LinkEnd_resMult";

    /**
     * The underlying {@link LinkEnd} represented by this proxy, never null.
     */
    protected final LinkEnd elt;

    /**
     * Tells whether a {@link ResourceLinkEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link LinkEnd} stereotyped << Resource_LinkEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof LinkEnd) && ((LinkEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceLinkEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link LinkEnd} stereotyped << Resource_LinkEnd >> then instantiate a {@link ResourceLinkEnd} proxy.
     * 
     * @return a {@link ResourceLinkEnd} proxy on the created {@link LinkEnd}.
     */
    public static ResourceLinkEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.LinkEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceLinkEnd.STEREOTYPE_NAME);
        return ResourceLinkEnd.instantiate((LinkEnd)e);
    }

    /**
     * Tries to instantiate a {@link ResourceLinkEnd} proxy from a {@link LinkEnd} stereotyped << Resource_LinkEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a LinkEnd
     * @return a {@link ResourceLinkEnd} proxy or <i>null</i>.
     */
    public static ResourceLinkEnd instantiate(final LinkEnd obj) {
        return ResourceLinkEnd.canInstantiate(obj) ? new ResourceLinkEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceLinkEnd} proxy from a {@link LinkEnd} stereotyped << Resource_LinkEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link LinkEnd}
     * @return a {@link ResourceLinkEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ResourceLinkEnd safeInstantiate(final LinkEnd obj) throws IllegalArgumentException {
        if (ResourceLinkEnd.canInstantiate(obj))
        	return new ResourceLinkEnd(obj);
        else
        	throw new IllegalArgumentException("ResourceLinkEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ResourceLinkEnd other = (ResourceLinkEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link LinkEnd}. 
     * @return the LinkEnd represented by this proxy, never null.
     */
    public LinkEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_LinkEnd_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getResource_LinkEnd_resMult() {
        return this.elt.getTagValue(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_RESMULT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_LinkEnd_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_LinkEnd_isActive() {
        return this.elt.isTagged(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_LinkEnd_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_LinkEnd_isProtected() {
        return this.elt.isTagged(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_LinkEnd_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_LinkEnd_isActive(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_ISACTIVE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_LinkEnd_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_LinkEnd_isProtected(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_ISPROTECTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Resource_LinkEnd_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_LinkEnd_resMult(final String value) {
        this.elt.putTagValue(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_RESMULT_TAGTYPE_ELT, value);
    }

    protected ResourceLinkEnd(final LinkEnd elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RESOURCE_LINKEND_RESMULT_TAGTYPE_ELT;

        public static TagType RESOURCE_LINKEND_ISPROTECTED_TAGTYPE_ELT;

        public static TagType RESOURCE_LINKEND_ISACTIVE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "90ae0f72-32a2-11df-9294-001302895b2b");
            RESOURCE_LINKEND_RESMULT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "90ae0f73-32a2-11df-9294-001302895b2b");
            RESOURCE_LINKEND_ISPROTECTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "90ae0f74-32a2-11df-9294-001302895b2b");
            RESOURCE_LINKEND_ISACTIVE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "90ae0f75-32a2-11df-9294-001302895b2b");
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
