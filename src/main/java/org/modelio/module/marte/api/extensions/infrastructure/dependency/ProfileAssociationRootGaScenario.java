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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_root_GaScenario >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ec6133db-f263-4877-9b67-8ae601510acd")
public class ProfileAssociationRootGaScenario {
    @objid ("f7d08e91-7bf2-43f5-8fe5-55932293fcd5")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_root_GaScenario";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("cd0314ee-e4f8-4132-b0af-e2e0e0a68229")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationRootGaScenario proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_root_GaScenario >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c3507c83-6be7-4c78-88df-748c19f7f940")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationRootGaScenario.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_root_GaScenario >> then instantiate a {@link ProfileAssociationRootGaScenario} proxy.
     * 
     * @return a {@link ProfileAssociationRootGaScenario} proxy on the created {@link Dependency}.
     */
    @objid ("c3cc469b-6e45-455b-a790-89d5f30eb637")
    public static ProfileAssociationRootGaScenario create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationRootGaScenario.STEREOTYPE_NAME);
        return ProfileAssociationRootGaScenario.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationRootGaScenario} proxy from a {@link Dependency} stereotyped << ProfileAssociation_root_GaScenario >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationRootGaScenario} proxy or <i>null</i>.
     */
    @objid ("0aa48b01-19a2-4033-9ce3-ade6bac0b95e")
    public static ProfileAssociationRootGaScenario instantiate(final Dependency obj) {
        return ProfileAssociationRootGaScenario.canInstantiate(obj) ? new ProfileAssociationRootGaScenario(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationRootGaScenario} proxy from a {@link Dependency} stereotyped << ProfileAssociation_root_GaScenario >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationRootGaScenario} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5e5978ab-707c-4754-b022-8395942d833b")
    public static ProfileAssociationRootGaScenario safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationRootGaScenario.canInstantiate(obj))
        	return new ProfileAssociationRootGaScenario(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationRootGaScenario: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("07fb9c8e-fbd6-41d5-a67a-800022ca7e76")
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
        ProfileAssociationRootGaScenario other = (ProfileAssociationRootGaScenario) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("05497a2f-0bc5-4ae1-8c70-3d003a7c7556")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("4a7f7e94-a8e6-4037-82ff-262e12da091a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f97e7afe-b10b-4612-9d7f-d0179308565a")
    protected ProfileAssociationRootGaScenario(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("e3378450-d46f-4325-9516-1009957b345a")
    public static final class MdaTypes {
        @objid ("92cd59a6-c699-44b2-9399-027bfacef6d8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5b3dcea7-bfd5-411d-9f43-b0473c629706")
        private static Stereotype MDAASSOCDEP;

        @objid ("36ddeca7-45b8-4c82-b149-468e0dedcc2e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("baf1b814-8c46-4aed-9a40-8c4dbfcf99e6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d0169b7c-dd1f-11e0-a2be-0027103f347c");
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
