/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_schedulers_SwSchedulableResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("211c79b5-1bdf-4aa3-b98b-5d875f856a9b")
public class ProfileAssociationSchedulersSwSchedulableResource {
    @objid ("0d5d6173-05a2-487f-8d34-801e6dd7425f")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_schedulers_SwSchedulableResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("abed234d-cc7d-4320-85f4-114c6519fbf5")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationSchedulersSwSchedulableResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_schedulers_SwSchedulableResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("fba2d7a5-c4a2-41c6-85e5-26dd2f7afe2f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSchedulersSwSchedulableResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_schedulers_SwSchedulableResource >> then instantiate a {@link ProfileAssociationSchedulersSwSchedulableResource} proxy.
     * 
     * @return a {@link ProfileAssociationSchedulersSwSchedulableResource} proxy on the created {@link Dependency}.
     */
    @objid ("3c61a17f-ae3b-4f5b-88d4-741fddb3eaf8")
    public static ProfileAssociationSchedulersSwSchedulableResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSchedulersSwSchedulableResource.STEREOTYPE_NAME);
        return ProfileAssociationSchedulersSwSchedulableResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSchedulersSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_schedulers_SwSchedulableResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationSchedulersSwSchedulableResource} proxy or <i>null</i>.
     */
    @objid ("0b1603f1-b70d-4b7c-8262-ee267af1f138")
    public static ProfileAssociationSchedulersSwSchedulableResource instantiate(final Dependency obj) {
        return ProfileAssociationSchedulersSwSchedulableResource.canInstantiate(obj) ? new ProfileAssociationSchedulersSwSchedulableResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSchedulersSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_schedulers_SwSchedulableResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationSchedulersSwSchedulableResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("96018557-cbe2-4664-96a1-b7ae041b485d")
    public static ProfileAssociationSchedulersSwSchedulableResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationSchedulersSwSchedulableResource.canInstantiate(obj))
        	return new ProfileAssociationSchedulersSwSchedulableResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationSchedulersSwSchedulableResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c513c60e-cb8f-4e6a-b1d1-eb0d6741850d")
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
        ProfileAssociationSchedulersSwSchedulableResource other = (ProfileAssociationSchedulersSwSchedulableResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("8eb249a1-df3e-4046-b2f0-e502ac517f62")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("a5699681-5635-43d1-886c-77e7314a87d4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ca9dabad-f730-4a92-8dfe-56e03c95af9b")
    protected ProfileAssociationSchedulersSwSchedulableResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("ce1a0b48-b760-45b6-89f4-26aa0c179f6c")
    public static final class MdaTypes {
        @objid ("21462d9b-adb5-4d17-ad25-ecb56b94c858")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e86a8e80-b055-4af7-8938-ec658fc5a797")
        private static Stereotype MDAASSOCDEP;

        @objid ("710b86b7-da74-4c6b-8886-6d34d072ff07")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3f9abf6b-9581-4c36-ad85-3cd7a92769b0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e4100677-9757-11e0-94fb-0027103f347c");
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
