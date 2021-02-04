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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_lockService_MemoryBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f98bf189-82bb-45ac-905e-a3b2487d4fed")
public class ProfileAssociationLockServiceMemoryBroker {
    @objid ("dbf45f73-a46d-4ad0-86df-ca697c9cd684")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_lockService_MemoryBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("d245446c-3374-4b12-b468-21f9b65aafea")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationLockServiceMemoryBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_lockService_MemoryBroker >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("416c239c-1886-483e-ade4-9a954e00f65e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationLockServiceMemoryBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_lockService_MemoryBroker >> then instantiate a {@link ProfileAssociationLockServiceMemoryBroker} proxy.
     * 
     * @return a {@link ProfileAssociationLockServiceMemoryBroker} proxy on the created {@link Dependency}.
     */
    @objid ("31843a90-7280-40b6-90be-4a0e18345b3e")
    public static ProfileAssociationLockServiceMemoryBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationLockServiceMemoryBroker.STEREOTYPE_NAME);
        return ProfileAssociationLockServiceMemoryBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationLockServiceMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_lockService_MemoryBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationLockServiceMemoryBroker} proxy or <i>null</i>.
     */
    @objid ("b7915436-1de4-4870-997c-b5af0cfa6508")
    public static ProfileAssociationLockServiceMemoryBroker instantiate(final Dependency obj) {
        return ProfileAssociationLockServiceMemoryBroker.canInstantiate(obj) ? new ProfileAssociationLockServiceMemoryBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationLockServiceMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_lockService_MemoryBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationLockServiceMemoryBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("df60f6c5-d239-45f5-b250-16bb92f2fc9d")
    public static ProfileAssociationLockServiceMemoryBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationLockServiceMemoryBroker.canInstantiate(obj))
        	return new ProfileAssociationLockServiceMemoryBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationLockServiceMemoryBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("395b4286-7564-48b5-b947-ef3d8cd906e7")
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
        ProfileAssociationLockServiceMemoryBroker other = (ProfileAssociationLockServiceMemoryBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("c004f05c-ada0-46d5-b4f9-4d9ae504891d")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("876bd839-5b1f-4d68-9f98-85f6622eee4f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9e6a70e8-15a2-4a9c-96cc-a1d5f57b0d7b")
    protected ProfileAssociationLockServiceMemoryBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("d4067bc2-e388-482f-a606-c9a55d28cd52")
    public static final class MdaTypes {
        @objid ("da6b4bf3-f1a0-4dda-a14e-97ea2c8fc690")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("12e23fc0-14f9-4aac-ad29-5f6e03f182be")
        private static Stereotype MDAASSOCDEP;

        @objid ("4cbbde54-0ddf-4500-aa7a-0368858a59d7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("60be4f18-dab7-4834-aab4-3de7c483e610")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d6251cdf-9759-11e0-94fb-0027103f347c");
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
