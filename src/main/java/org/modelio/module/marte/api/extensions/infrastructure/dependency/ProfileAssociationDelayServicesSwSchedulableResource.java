/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_delayServices_SwSchedulableResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0c4d7c51-1c2a-43a7-868b-4eb65cdcae28")
public class ProfileAssociationDelayServicesSwSchedulableResource {
    @objid ("0ade96ea-101d-422b-91aa-e1026c99fcf3")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_delayServices_SwSchedulableResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("d8ff651e-2ab1-475d-87f5-a3e543246be9")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationDelayServicesSwSchedulableResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_delayServices_SwSchedulableResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a9efe78b-4fa4-40b5-9d25-6194328efc3a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDelayServicesSwSchedulableResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_delayServices_SwSchedulableResource >> then instantiate a {@link ProfileAssociationDelayServicesSwSchedulableResource} proxy.
     * 
     * @return a {@link ProfileAssociationDelayServicesSwSchedulableResource} proxy on the created {@link Dependency}.
     */
    @objid ("a587ac2d-1b25-4f31-956a-0d65dcde2339")
    public static ProfileAssociationDelayServicesSwSchedulableResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDelayServicesSwSchedulableResource.STEREOTYPE_NAME);
        return ProfileAssociationDelayServicesSwSchedulableResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDelayServicesSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_delayServices_SwSchedulableResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationDelayServicesSwSchedulableResource} proxy or <i>null</i>.
     */
    @objid ("ba16e1fe-2472-49c0-a01e-e0eb8407fb72")
    public static ProfileAssociationDelayServicesSwSchedulableResource instantiate(final Dependency obj) {
        return ProfileAssociationDelayServicesSwSchedulableResource.canInstantiate(obj) ? new ProfileAssociationDelayServicesSwSchedulableResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDelayServicesSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_delayServices_SwSchedulableResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationDelayServicesSwSchedulableResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6526944b-f510-4669-8581-a29facdb0516")
    public static ProfileAssociationDelayServicesSwSchedulableResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationDelayServicesSwSchedulableResource.canInstantiate(obj))
        	return new ProfileAssociationDelayServicesSwSchedulableResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationDelayServicesSwSchedulableResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("13b38438-6262-46c5-a07b-f64903a5cf47")
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
        ProfileAssociationDelayServicesSwSchedulableResource other = (ProfileAssociationDelayServicesSwSchedulableResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("f8d39a5d-19ff-4760-9000-7871afdf7163")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("b9e63974-ca60-4a4b-acdb-e8261dc80d4f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("49173cf5-95b8-4018-ba3d-888f30814a6e")
    protected ProfileAssociationDelayServicesSwSchedulableResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("672a43bd-2190-4a2c-a178-cc5a1ca93a65")
    public static final class MdaTypes {
        @objid ("bee231ef-7cc4-476e-92eb-0b29545f0d01")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e7e374a2-10db-4a7e-b26a-843be3fc6db7")
        private static Stereotype MDAASSOCDEP;

        @objid ("b0520a6e-c73a-495f-8cee-61286135258a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c5468772-287f-48c2-8702-ddd779a9f410")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1bb4eb39-9758-11e0-94fb-0027103f347c");
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
