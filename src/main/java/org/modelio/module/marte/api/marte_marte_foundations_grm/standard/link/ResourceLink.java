/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << Resource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e58da43f-72d8-4c79-a57a-4313b1780a2b")
public class ResourceLink {
    @objid ("428136a3-6284-4eb9-b3f9-e11e2ae9b816")
    public static final String STEREOTYPE_NAME = "Resource_Link";

    @objid ("8b0db7a0-a6d9-42cc-ac89-b3c9ba7a6ec3")
    public static final String RESOURCE_LINK_ISACTIVE_TAGTYPE = "Resource_Link_isActive";

    @objid ("d33fa7ee-3274-4c4b-a796-013ee205e35a")
    public static final String RESOURCE_LINK_ISPROTECTED_TAGTYPE = "Resource_Link_isProtected";

    @objid ("26beb3c7-a11e-464e-9acb-49fc2bea0cfd")
    public static final String RESOURCE_LINK_RESMULT_TAGTYPE = "Resource_Link_resMult";

    /**
     * The underlying {@link Link} represented by this proxy, never null.
     */
    @objid ("0428b0a5-e74b-4a78-86f7-da20ddc2eb25")
    protected final Link elt;

    /**
     * Tells whether a {@link ResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << Resource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8bdc5f15-91c8-4c12-96bd-f254ed18f012")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << Resource_Link >> then instantiate a {@link ResourceLink} proxy.
     * 
     * @return a {@link ResourceLink} proxy on the created {@link Link}.
     */
    @objid ("78586400-4146-46c9-aba8-e7080bc59bd8")
    public static ResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceLink.STEREOTYPE_NAME);
        return ResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link ResourceLink} proxy from a {@link Link} stereotyped << Resource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link ResourceLink} proxy or <i>null</i>.
     */
    @objid ("846cab46-9694-402a-9250-6970ddc1ec25")
    public static ResourceLink instantiate(final Link obj) {
        return ResourceLink.canInstantiate(obj) ? new ResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceLink} proxy from a {@link Link} stereotyped << Resource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link ResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9e198a5b-df94-4d17-8c73-740c08cfe6b7")
    public static ResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (ResourceLink.canInstantiate(obj))
        	return new ResourceLink(obj);
        else
        	throw new IllegalArgumentException("ResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2e55e234-117b-4f2c-aae1-1200a4756e47")
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
        ResourceLink other = (ResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("85440b04-d7d6-414c-8287-1c361564f023")
    public Link getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_Link_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c447f6cc-010c-45ed-91a8-67fd6c229408")
    public String getResource_Link_resMult() {
        return this.elt.getTagValue(ResourceLink.MdaTypes.RESOURCE_LINK_RESMULT_TAGTYPE_ELT);
    }

    @objid ("7f34fea1-4a82-467e-9773-8ab64c845112")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_Link_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b297bbd-eec5-4bee-9f26-0e235b88af18")
    public boolean isResource_Link_isActive() {
        return this.elt.isTagged(ResourceLink.MdaTypes.RESOURCE_LINK_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_Link_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("355d8569-0e47-4720-85f4-3a6734f2fcd1")
    public boolean isResource_Link_isProtected() {
        return this.elt.isTagged(ResourceLink.MdaTypes.RESOURCE_LINK_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Link_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6fd03383-b640-4a78-80f7-9070d59460e9")
    public void setResource_Link_isActive(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceLink.MdaTypes.RESOURCE_LINK_ISACTIVE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceLink.MdaTypes.RESOURCE_LINK_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Link_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("af0c187d-d6f7-4c58-b318-cfba3abb6c3d")
    public void setResource_Link_isProtected(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceLink.MdaTypes.RESOURCE_LINK_ISPROTECTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceLink.MdaTypes.RESOURCE_LINK_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Resource_Link_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c29eeecd-3749-4a81-8098-560c2eaec2fb")
    public void setResource_Link_resMult(final String value) {
        this.elt.putTagValue(ResourceLink.MdaTypes.RESOURCE_LINK_RESMULT_TAGTYPE_ELT, value);
    }

    @objid ("4eee0671-63c5-4772-b04f-59465052f3da")
    protected ResourceLink(final Link elt) {
        this.elt = elt;
    }

    @objid ("a86b1637-eaa9-4825-9771-daca0b20879c")
    public static final class MdaTypes {
        @objid ("67f71a69-c84a-4800-b921-fdb643ecdee5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e0f60b71-ae89-45ba-85b0-538ee172a363")
        public static TagType RESOURCE_LINK_RESMULT_TAGTYPE_ELT;

        @objid ("b2d4224a-dace-40e5-9a4f-9ae1b8447cea")
        public static TagType RESOURCE_LINK_ISPROTECTED_TAGTYPE_ELT;

        @objid ("c2dfa64e-425c-42d4-af94-79ae13502478")
        public static TagType RESOURCE_LINK_ISACTIVE_TAGTYPE_ELT;

        @objid ("2c4c14c8-e647-4520-85a2-21ddf1c9a40f")
        private static Stereotype MDAASSOCDEP;

        @objid ("20aa10b8-035a-46a3-a473-0c0a38285193")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("01347419-8b13-4818-9e6f-15a5e3babd34")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ff9dcee2-0cce-11df-8525-001302895b2b");
            RESOURCE_LINK_RESMULT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa2937e-0cce-11df-8525-001302895b2b");
            RESOURCE_LINK_ISPROTECTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa29385-0cce-11df-8525-001302895b2b");
            RESOURCE_LINK_ISACTIVE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa2938c-0cce-11df-8525-001302895b2b");
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
