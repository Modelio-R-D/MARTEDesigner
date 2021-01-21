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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_unlockService_MemoryBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2dbbd491-38d4-4afa-83b9-c04582144c85")
public class ProfileAssociationUnlockServiceMemoryBroker {
    @objid ("14fc684a-314d-492d-86fd-077cdcd0e7d6")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_unlockService_MemoryBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("08c19921-426b-4878-8d12-ca5013dc2358")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationUnlockServiceMemoryBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_unlockService_MemoryBroker >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("41c34e0c-3ac9-41e2-8f9c-a8576376d7fb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUnlockServiceMemoryBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_unlockService_MemoryBroker >> then instantiate a {@link ProfileAssociationUnlockServiceMemoryBroker} proxy.
     * 
     * @return a {@link ProfileAssociationUnlockServiceMemoryBroker} proxy on the created {@link Dependency}.
     */
    @objid ("eccd1571-a3ab-4220-a5dd-501e430a34c7")
    public static ProfileAssociationUnlockServiceMemoryBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUnlockServiceMemoryBroker.STEREOTYPE_NAME);
        return ProfileAssociationUnlockServiceMemoryBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationUnlockServiceMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_unlockService_MemoryBroker >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationUnlockServiceMemoryBroker} proxy or <i>null</i>.
     */
    @objid ("6cd78d18-681f-4890-b751-a46efc60ad27")
    public static ProfileAssociationUnlockServiceMemoryBroker instantiate(final Dependency obj) {
        return ProfileAssociationUnlockServiceMemoryBroker.canInstantiate(obj) ? new ProfileAssociationUnlockServiceMemoryBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationUnlockServiceMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_unlockService_MemoryBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationUnlockServiceMemoryBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("94f7e3ff-7a36-4f6d-a45d-71918623a7e9")
    public static ProfileAssociationUnlockServiceMemoryBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationUnlockServiceMemoryBroker.canInstantiate(obj))
        	return new ProfileAssociationUnlockServiceMemoryBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationUnlockServiceMemoryBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ed0bbf2d-364e-4bed-bf31-8ecefc6bcf13")
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
        ProfileAssociationUnlockServiceMemoryBroker other = (ProfileAssociationUnlockServiceMemoryBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("6f6f7ad6-6290-4ef1-ac68-7755a8bd1e72")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("8f055d24-b7d4-4e9b-80ab-e7bb80f6f577")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f956a612-114b-4f7f-9d06-09348ddb8a8c")
    protected ProfileAssociationUnlockServiceMemoryBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("83248686-4b42-4271-8086-3d2550349e2e")
    public static final class MdaTypes {
        @objid ("7e9ecb98-6f9a-4939-b2d2-970b43c564b2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c26132f1-1002-4e16-9b40-75ec3ade4891")
        private static Stereotype MDAASSOCDEP;

        @objid ("e81d5bc1-12f1-4f13-aa80-6b2928b8dd3d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2f5e7fd1-ee1f-4ff3-8d10-4f3b7757b058")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dd095b98-9759-11e0-94fb-0027103f347c");
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
