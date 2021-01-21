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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_scenario_GaScenario >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b60f0bce-11c3-438e-b4f5-c14b9a734a2d")
public class ProfileAssociationScenarioGaScenario {
    @objid ("141aad04-7c98-46d0-ac19-e31a37ddc876")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_scenario_GaScenario";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("56561249-bb27-4edb-ad03-cd07b1ba56f9")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationScenarioGaScenario proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_scenario_GaScenario >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("56f596da-cd25-4a56-9c70-af2a86c7e19a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationScenarioGaScenario.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_scenario_GaScenario >> then instantiate a {@link ProfileAssociationScenarioGaScenario} proxy.
     * 
     * @return a {@link ProfileAssociationScenarioGaScenario} proxy on the created {@link Dependency}.
     */
    @objid ("04e284ee-6b30-429b-a346-0206a049a9f5")
    public static ProfileAssociationScenarioGaScenario create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationScenarioGaScenario.STEREOTYPE_NAME);
        return ProfileAssociationScenarioGaScenario.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationScenarioGaScenario} proxy from a {@link Dependency} stereotyped << ProfileAssociation_scenario_GaScenario >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationScenarioGaScenario} proxy or <i>null</i>.
     */
    @objid ("46169e0d-aac3-4bf0-94b7-a88b8676bdc7")
    public static ProfileAssociationScenarioGaScenario instantiate(final Dependency obj) {
        return ProfileAssociationScenarioGaScenario.canInstantiate(obj) ? new ProfileAssociationScenarioGaScenario(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationScenarioGaScenario} proxy from a {@link Dependency} stereotyped << ProfileAssociation_scenario_GaScenario >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationScenarioGaScenario} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("107af1a6-f486-4dce-9779-e8d103988e04")
    public static ProfileAssociationScenarioGaScenario safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationScenarioGaScenario.canInstantiate(obj))
        	return new ProfileAssociationScenarioGaScenario(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationScenarioGaScenario: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0a52d55e-2f97-4a10-965b-ad71b98a6105")
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
        ProfileAssociationScenarioGaScenario other = (ProfileAssociationScenarioGaScenario) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("c07dff6e-b2b9-42f6-a7d1-c470a92d0de9")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("14e7baa4-a581-4d69-baaf-843da891e49d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ca9af8a5-3470-4384-b13b-715ce32e6e13")
    protected ProfileAssociationScenarioGaScenario(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("f103c23e-a0e8-44df-ac13-28eb1cc45817")
    public static final class MdaTypes {
        @objid ("a5d81402-b489-4726-8f46-031f74c37692")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("98247d98-cb60-401d-b0ea-b66a7bbb3b15")
        private static Stereotype MDAASSOCDEP;

        @objid ("127013e0-bac3-44a0-ae80-1931878d4359")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("be738197-6241-4c01-b873-5e570d1e74b2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4d0c34c2-9e88-11e1-8c5f-0027103f347d");
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
