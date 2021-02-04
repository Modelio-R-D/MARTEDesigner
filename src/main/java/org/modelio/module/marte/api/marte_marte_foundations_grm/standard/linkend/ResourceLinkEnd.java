/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("59e5067b-4351-4849-9d7f-3d224bd18e28")
    public static final String STEREOTYPE_NAME = "Resource_LinkEnd";

    @objid ("c97e8f11-2064-40da-b7b7-04b5ac122699")
    public static final String RESOURCE_LINKEND_ISACTIVE_TAGTYPE = "Resource_LinkEnd_isActive";

    @objid ("97bd126c-2496-4a27-8ae0-ede5d58aa31a")
    public static final String RESOURCE_LINKEND_ISPROTECTED_TAGTYPE = "Resource_LinkEnd_isProtected";

    @objid ("40bf6c9c-8044-4a01-a0c3-8878c2f24bd2")
    public static final String RESOURCE_LINKEND_RESMULT_TAGTYPE = "Resource_LinkEnd_resMult";

    /**
     * The underlying {@link LinkEnd} represented by this proxy, never null.
     */
    @objid ("87e0847d-7c84-4cc0-9046-1cf00c24b822")
    protected final LinkEnd elt;

    /**
     * Tells whether a {@link ResourceLinkEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link LinkEnd} stereotyped << Resource_LinkEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a7074c0b-e20e-4030-91f4-b7cf556f1e2c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof LinkEnd) && ((LinkEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceLinkEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link LinkEnd} stereotyped << Resource_LinkEnd >> then instantiate a {@link ResourceLinkEnd} proxy.
     * 
     * @return a {@link ResourceLinkEnd} proxy on the created {@link LinkEnd}.
     */
    @objid ("7638f109-6d78-439a-9c5e-4293272013b5")
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
    @objid ("443b68b5-93e9-413e-88b9-13991c2e85e8")
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
    @objid ("90cb7626-7f7c-4027-b09a-082670f90916")
    public static ResourceLinkEnd safeInstantiate(final LinkEnd obj) throws IllegalArgumentException {
        if (ResourceLinkEnd.canInstantiate(obj))
        	return new ResourceLinkEnd(obj);
        else
        	throw new IllegalArgumentException("ResourceLinkEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2d0d6fbd-799b-4f86-b565-5caeea6dcc52")
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
    @objid ("99fd3a39-1f45-4b7e-b349-4080c4569726")
    public LinkEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_LinkEnd_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("61041f39-21b6-4851-8738-2b293d93c848")
    public String getResource_LinkEnd_resMult() {
        return this.elt.getTagValue(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_RESMULT_TAGTYPE_ELT);
    }

    @objid ("675e1127-e1a3-4348-8181-09d67706f6b1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_LinkEnd_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("400702a0-0073-46b3-9c29-e791d8988b64")
    public boolean isResource_LinkEnd_isActive() {
        return this.elt.isTagged(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_LinkEnd_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7e154c0e-c411-471a-aa4a-5c5b43ceaa65")
    public boolean isResource_LinkEnd_isProtected() {
        return this.elt.isTagged(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_LinkEnd_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("358cd3a1-026a-46ac-84a1-560832b9a583")
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
    @objid ("88a7255c-6745-4cfa-a17f-f1f1f75ac130")
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
    @objid ("cf0a521c-62c4-45c1-94e4-f20dbd108c46")
    public void setResource_LinkEnd_resMult(final String value) {
        this.elt.putTagValue(ResourceLinkEnd.MdaTypes.RESOURCE_LINKEND_RESMULT_TAGTYPE_ELT, value);
    }

    @objid ("d515e9be-e68f-4ddb-8f45-2dfa1c4a44a8")
    protected ResourceLinkEnd(final LinkEnd elt) {
        this.elt = elt;
    }

    @objid ("8dcbeca9-5909-40cd-a83c-84f2bd145b15")
    public static final class MdaTypes {
        @objid ("d4c3ab7f-2ba8-43bc-a776-3ee76ef628f1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b40346b0-7e03-4a0f-82a3-005706e4e975")
        public static TagType RESOURCE_LINKEND_RESMULT_TAGTYPE_ELT;

        @objid ("773d7e5c-2a64-47f3-a4fe-15fabc21e0f2")
        public static TagType RESOURCE_LINKEND_ISPROTECTED_TAGTYPE_ELT;

        @objid ("89431300-11e0-48cd-be76-885fea38ef9e")
        public static TagType RESOURCE_LINKEND_ISACTIVE_TAGTYPE_ELT;

        @objid ("e555751b-a64d-4d22-acf6-857d1b975e92")
        private static Stereotype MDAASSOCDEP;

        @objid ("a61197b8-5f94-4151-b65b-6c16879f6e50")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8c91d655-37dd-48d7-81e0-5ad08b124828")
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
