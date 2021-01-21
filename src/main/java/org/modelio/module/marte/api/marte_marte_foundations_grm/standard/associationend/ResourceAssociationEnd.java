/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

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
 * Proxy class to handle a {@link AssociationEnd} with << Resource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("febd8306-591f-4549-a10d-027039d81de2")
public class ResourceAssociationEnd {
    @objid ("e01ff6db-7ee3-453b-952f-454bd3337de4")
    public static final String STEREOTYPE_NAME = "Resource_AssociationEnd";

    @objid ("bd447277-8186-4378-92e0-5f6a56969148")
    public static final String RESOURCE_ASSOCIATIONEND_ISACTIVE_TAGTYPE = "Resource_AssociationEnd_isActive";

    @objid ("122cd7d6-a8f7-4103-a46c-3ad21a9b6454")
    public static final String RESOURCE_ASSOCIATIONEND_ISPROTECTED_TAGTYPE = "Resource_AssociationEnd_isProtected";

    @objid ("914f533b-2334-4920-b785-a1ca624c2c10")
    public static final String RESOURCE_ASSOCIATIONEND_RESMULT_TAGTYPE = "Resource_AssociationEnd_resMult";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    @objid ("3324e07d-d7a7-4428-a092-d504bea6f8be")
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link ResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << Resource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("394b76e6-dea5-4ee4-a8f6-ac61aa6d5fa3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << Resource_AssociationEnd >> then instantiate a {@link ResourceAssociationEnd} proxy.
     * 
     * @return a {@link ResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("d9403ce2-aec8-41ba-9d5c-f72111e08728")
    public static ResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceAssociationEnd.STEREOTYPE_NAME);
        return ResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link ResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Resource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link ResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("37e2be75-b9ad-4b75-b5f8-b08251adfeaf")
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
    @objid ("ed358f52-930a-48ae-8a00-52fca0f75323")
    public static ResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (ResourceAssociationEnd.canInstantiate(obj))
        	return new ResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("ResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b3cf9911-f2be-419e-aa0a-9e550e18469e")
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
    @objid ("1fec0356-d1ce-484e-87d9-6ce65834f70b")
    public AssociationEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_AssociationEnd_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("343a393f-923d-4d74-85aa-59d37d317962")
    public String getResource_AssociationEnd_resMult() {
        return this.elt.getTagValue(ResourceAssociationEnd.MdaTypes.RESOURCE_ASSOCIATIONEND_RESMULT_TAGTYPE_ELT);
    }

    @objid ("d6e75ae5-4140-4e10-aeba-9efde682b50b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_AssociationEnd_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d598fb4b-04c5-4f99-90fe-2685980bd189")
    public boolean isResource_AssociationEnd_isActive() {
        return this.elt.isTagged(ResourceAssociationEnd.MdaTypes.RESOURCE_ASSOCIATIONEND_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_AssociationEnd_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9c98046c-4517-4f1a-8458-b7a4378a8463")
    public boolean isResource_AssociationEnd_isProtected() {
        return this.elt.isTagged(ResourceAssociationEnd.MdaTypes.RESOURCE_ASSOCIATIONEND_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_AssociationEnd_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("950a8489-147a-45a1-bb42-2418f04466fa")
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
    @objid ("d921a832-ee6b-42c1-b547-3847a48897b9")
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
    @objid ("7b8fbacc-7be1-4079-b01a-99fc624dc8c1")
    public void setResource_AssociationEnd_resMult(final String value) {
        this.elt.putTagValue(ResourceAssociationEnd.MdaTypes.RESOURCE_ASSOCIATIONEND_RESMULT_TAGTYPE_ELT, value);
    }

    @objid ("beab5d47-4862-42bf-80b0-175a3f3ad530")
    protected ResourceAssociationEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    @objid ("10cbb7b5-766a-4e41-8d76-c92e841e3f35")
    public static final class MdaTypes {
        @objid ("3443b1c1-ece8-4cd8-b0c9-2be70e26167e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8a371c72-b3aa-4b93-b7b2-ac99a8a786f4")
        public static TagType RESOURCE_ASSOCIATIONEND_RESMULT_TAGTYPE_ELT;

        @objid ("75f2e018-7dcb-4654-9a3c-3fb8921cecdc")
        public static TagType RESOURCE_ASSOCIATIONEND_ISPROTECTED_TAGTYPE_ELT;

        @objid ("9a7a31ab-6f3e-44ee-82e8-5b4f3b8660f1")
        public static TagType RESOURCE_ASSOCIATIONEND_ISACTIVE_TAGTYPE_ELT;

        @objid ("369c6747-b7b6-4995-8262-43858f4e0bab")
        private static Stereotype MDAASSOCDEP;

        @objid ("eca1f7e2-4200-4651-834f-1a8af16bed7f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("335e8a1f-0cdc-42c8-86d4-5a03bb230d0a")
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
