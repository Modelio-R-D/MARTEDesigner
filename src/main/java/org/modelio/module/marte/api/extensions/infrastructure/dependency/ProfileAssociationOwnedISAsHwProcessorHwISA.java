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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_ownedISAs_HwProcessor_HwISA >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ade4a5b3-e4c6-45e9-9b04-4603b6e9db28")
public class ProfileAssociationOwnedISAsHwProcessorHwISA {
    @objid ("f7624a45-ffd2-4075-82bf-16dacb41bcb6")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_ownedISAs_HwProcessor_HwISA";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("383bd34e-7741-4ace-96d4-74ae9cfa9f71")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOwnedISAsHwProcessorHwISA proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_ownedISAs_HwProcessor_HwISA >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("66cd3885-8064-48e2-8f29-1c48900f1a23")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOwnedISAsHwProcessorHwISA.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_ownedISAs_HwProcessor_HwISA >> then instantiate a {@link ProfileAssociationOwnedISAsHwProcessorHwISA} proxy.
     * 
     * @return a {@link ProfileAssociationOwnedISAsHwProcessorHwISA} proxy on the created {@link Dependency}.
     */
    @objid ("73446aad-ed87-44ab-be47-f6575a8a7a50")
    public static ProfileAssociationOwnedISAsHwProcessorHwISA create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOwnedISAsHwProcessorHwISA.STEREOTYPE_NAME);
        return ProfileAssociationOwnedISAsHwProcessorHwISA.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOwnedISAsHwProcessorHwISA} proxy from a {@link Dependency} stereotyped << ProfileAssociation_ownedISAs_HwProcessor_HwISA >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOwnedISAsHwProcessorHwISA} proxy or <i>null</i>.
     */
    @objid ("e3b310c8-93b2-4101-9ede-914e091c1022")
    public static ProfileAssociationOwnedISAsHwProcessorHwISA instantiate(final Dependency obj) {
        return ProfileAssociationOwnedISAsHwProcessorHwISA.canInstantiate(obj) ? new ProfileAssociationOwnedISAsHwProcessorHwISA(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOwnedISAsHwProcessorHwISA} proxy from a {@link Dependency} stereotyped << ProfileAssociation_ownedISAs_HwProcessor_HwISA >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationOwnedISAsHwProcessorHwISA} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dc43a8a8-8927-4ded-be8a-42fef068ebaf")
    public static ProfileAssociationOwnedISAsHwProcessorHwISA safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOwnedISAsHwProcessorHwISA.canInstantiate(obj))
        	return new ProfileAssociationOwnedISAsHwProcessorHwISA(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOwnedISAsHwProcessorHwISA: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a7f92f67-0fff-46bc-88e1-41f6361d32ba")
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
        ProfileAssociationOwnedISAsHwProcessorHwISA other = (ProfileAssociationOwnedISAsHwProcessorHwISA) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("4ca3b338-3468-4756-831a-781781d41019")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("b54bbbe8-6e62-4c16-afd6-b9d38a2891ae")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("aba5e80a-6b94-4388-9c09-558cb50beb30")
    protected ProfileAssociationOwnedISAsHwProcessorHwISA(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("bc40e27c-fbdd-458a-8eb3-d346468ad294")
    public static final class MdaTypes {
        @objid ("51845df6-6eb0-45a0-90be-da66310ac241")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c5da2e04-1dca-4d15-86be-a71381a186d9")
        private static Stereotype MDAASSOCDEP;

        @objid ("624062d8-5183-42b7-b42d-2a1c1d320f42")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1c4ce5ed-fb62-4eae-af1b-d77bd5921db3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a9599bbf-9688-11e0-95ba-0027103f347c");
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
