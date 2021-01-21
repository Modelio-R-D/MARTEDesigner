/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.linkend;

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
@objid ("539e432e-7463-4735-a2cb-2a498d1efd01")
public class ResourceLinkEnd {
    @objid ("aa65a9a1-b518-4716-9330-616985f3d3e9")
    public static final String STEREOTYPE_NAME = "Resource_LinkEnd";

    @objid ("4fb6784e-bb48-4039-a46d-804686dab416")
    public static final String RESOURCE_LINKEND_ISACTIVE_TAGTYPE = "Resource_LinkEnd_isActive";

    @objid ("aba50086-ca3b-4929-9dc5-9f9b26743a40")
    public static final String RESOURCE_LINKEND_ISPROTECTED_TAGTYPE = "Resource_LinkEnd_isProtected";

    @objid ("9e1cbd36-483b-463a-b7a0-4aa1c9366930")
    public static final String RESOURCE_LINKEND_RESMULT_TAGTYPE = "Resource_LinkEnd_resMult";

    /**
     * The underlying {@link LinkEnd} represented by this proxy, never null.
     */
    @objid ("3ab872f3-516a-4be2-a377-4c97ae1b93b8")
    protected final LinkEnd elt;

    /**
     * Tells whether a {@link ResourceLinkEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link LinkEnd} stereotyped << Resource_LinkEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("37029fc0-4fba-432a-ab3f-411aebc2e7be")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof LinkEnd) && ((LinkEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceLinkEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link LinkEnd} stereotyped << Resource_LinkEnd >> then instantiate a {@link ResourceLinkEnd} proxy.
     * 
     * @return a {@link ResourceLinkEnd} proxy on the created {@link LinkEnd}.
     */
    @objid ("0ef9954d-0fc4-4b79-b430-d8cf3783b780")
    public static ResourceLinkEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("LinkEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceLinkEnd.STEREOTYPE_NAME);
        return ResourceLinkEnd.instantiate((LinkEnd)e);
    }

    /**
     * Tries to instantiate a {@link ResourceLinkEnd} proxy from a {@link LinkEnd} stereotyped << Resource_LinkEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a LinkEnd
     * @return a {@link ResourceLinkEnd} proxy or <i>null</i>.
     */
    @objid ("03d9c4f8-603a-4fd9-a605-6be511873775")
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
    @objid ("243aecd0-a53f-4ab5-b2bd-af58d7765ad4")
    public static ResourceLinkEnd safeInstantiate(final LinkEnd obj) throws IllegalArgumentException {
        if (ResourceLinkEnd.canInstantiate(obj))
        	return new ResourceLinkEnd(obj);
        else
        	throw new IllegalArgumentException("ResourceLinkEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1352efb4-6c29-4b29-93a7-1f87a116a089")
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
    @objid ("8d61b5d2-fbfc-4618-aa49-517da8be9341")
    public LinkEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_LinkEnd_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45656f70-c3d8-4bd0-929f-27720f019bf0")
    public String getResource_LinkEnd_resMult() {
        return this.elt.getTagValue(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_RESMULT_TAGTYPE_ELT);
    }

    @objid ("23376ae2-1812-43a8-9ecd-681dd92aaf5a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_LinkEnd_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f4d2ef45-fc28-4efe-bb70-cd1058505299")
    public boolean isResource_LinkEnd_isActive() {
        return this.elt.isTagged(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_LinkEnd_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8f1d2f19-982a-463d-90bc-0aa64e459889")
    public boolean isResource_LinkEnd_isProtected() {
        return this.elt.isTagged(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_LinkEnd_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c025b14-ef4a-4cd8-963c-6a86cca0894c")
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
    @objid ("eeb3d1e4-49b4-41d2-bb35-4c918f1e16ae")
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
    @objid ("14cabbab-e9b4-4ddc-9b53-4745b8d0ea99")
    public void setResource_LinkEnd_resMult(final String value) {
        this.elt.putTagValue(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_RESMULT_TAGTYPE_ELT, value);
    }

    @objid ("fd961f00-22bc-434b-9681-6273ee012e9c")
    protected ResourceLinkEnd(final LinkEnd elt) {
        this.elt = elt;
    }

    @objid ("8dcbeca9-5909-40cd-a83c-84f2bd145b15")
    public static final class MdaTypes {
        @objid ("44b59158-dc4e-433d-810d-1d2eb3e253c8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("59ab7b42-9eae-4429-9b2a-2e68c5a46a54")
        public static TagType RESOURCE_LINKEND_RESMULT_TAGTYPE_ELT;

        @objid ("8ab4229a-df78-45fa-a65e-d0d6cbb9e8b2")
        public static TagType RESOURCE_LINKEND_ISPROTECTED_TAGTYPE_ELT;

        @objid ("ce78b237-6c66-4b6e-863f-93bf45a68a2d")
        public static TagType RESOURCE_LINKEND_ISACTIVE_TAGTYPE_ELT;

        @objid ("470c6b24-bce0-4fde-9060-b7f9a3016860")
        private static Stereotype MDAASSOCDEP;

        @objid ("0c339c69-080d-4481-aee1-4d8a2b5913da")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("00e06e98-6449-44b0-a2d4-7d82d580ef9e")
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
