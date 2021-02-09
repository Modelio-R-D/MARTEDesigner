/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << Resource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "Resource_AssociationEnd";

    public static final String RESOURCE_ASSOCIATIONEND_ISACTIVE_TAGTYPE = "Resource_AssociationEnd_isActive";

    public static final String RESOURCE_ASSOCIATIONEND_ISPROTECTED_TAGTYPE = "Resource_AssociationEnd_isProtected";

    public static final String RESOURCE_ASSOCIATIONEND_RESMULT_TAGTYPE = "Resource_AssociationEnd_resMult";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link ResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << Resource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << Resource_AssociationEnd >> then instantiate a {@link ResourceAssociationEnd} proxy.
     * 
     * @return a {@link ResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static ResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceAssociationEnd.STEREOTYPE_NAME);
        return ResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link ResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Resource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link ResourceAssociationEnd} proxy or <i>null</i>.
     */
    public static ResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return ResourceAssociationEnd.canInstantiate(obj) ? new ResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Resource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link ResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (ResourceAssociationEnd.canInstantiate(obj))
        	return new ResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("ResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ResourceAssociationEnd other = (ResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    public AssociationEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_AssociationEnd_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getResource_AssociationEnd_resMult() {
        return this.elt.getTagValue(ResourceAssociationEnd.MdaTypes.RESOURCE_ASSOCIATIONEND_RESMULT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_AssociationEnd_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_AssociationEnd_isActive() {
        return this.elt.isTagged(ResourceAssociationEnd.MdaTypes.RESOURCE_ASSOCIATIONEND_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_AssociationEnd_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_AssociationEnd_isProtected() {
        return this.elt.isTagged(ResourceAssociationEnd.MdaTypes.RESOURCE_ASSOCIATIONEND_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_AssociationEnd_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_AssociationEnd_isActive(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceAssociationEnd.MdaTypes.RESOURCE_ASSOCIATIONEND_ISACTIVE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceAssociationEnd.MdaTypes.RESOURCE_ASSOCIATIONEND_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_AssociationEnd_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_AssociationEnd_isProtected(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceAssociationEnd.MdaTypes.RESOURCE_ASSOCIATIONEND_ISPROTECTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceAssociationEnd.MdaTypes.RESOURCE_ASSOCIATIONEND_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Resource_AssociationEnd_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_AssociationEnd_resMult(final String value) {
        this.elt.putTagValue(ResourceAssociationEnd.MdaTypes.RESOURCE_ASSOCIATIONEND_RESMULT_TAGTYPE_ELT, value);
    }

    protected ResourceAssociationEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RESOURCE_ASSOCIATIONEND_RESMULT_TAGTYPE_ELT;

        public static TagType RESOURCE_ASSOCIATIONEND_ISPROTECTED_TAGTYPE_ELT;

        public static TagType RESOURCE_ASSOCIATIONEND_ISACTIVE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ff9dcede-0cce-11df-8525-001302895b2b");
            RESOURCE_ASSOCIATIONEND_RESMULT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa0312c-0cce-11df-8525-001302895b2b");
            RESOURCE_ASSOCIATIONEND_ISPROTECTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa29381-0cce-11df-8525-001302895b2b");
            RESOURCE_ASSOCIATIONEND_ISACTIVE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa29388-0cce-11df-8525-001302895b2b");
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
