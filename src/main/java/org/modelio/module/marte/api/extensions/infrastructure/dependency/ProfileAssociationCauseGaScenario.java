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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_cause_GaScenario >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f03e3191-9cba-4e71-b4cf-8167a0d1e056")
public class ProfileAssociationCauseGaScenario {
    @objid ("751fa383-05d0-4c0d-80fc-b7751189c914")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_cause_GaScenario";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("ffa5fcbc-9af0-4361-bfe1-cc7779c5f771")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationCauseGaScenario proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_cause_GaScenario >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6a694f1f-1ca8-46a6-ae6c-a93b9cd8d9aa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationCauseGaScenario.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_cause_GaScenario >> then instantiate a {@link ProfileAssociationCauseGaScenario} proxy.
     * 
     * @return a {@link ProfileAssociationCauseGaScenario} proxy on the created {@link Dependency}.
     */
    @objid ("68d8ed03-6533-4ec9-a128-c5779f760619")
    public static ProfileAssociationCauseGaScenario create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationCauseGaScenario.STEREOTYPE_NAME);
        return ProfileAssociationCauseGaScenario.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationCauseGaScenario} proxy from a {@link Dependency} stereotyped << ProfileAssociation_cause_GaScenario >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationCauseGaScenario} proxy or <i>null</i>.
     */
    @objid ("35744d73-438a-4dab-8850-fbbcbd6f855e")
    public static ProfileAssociationCauseGaScenario instantiate(final Dependency obj) {
        return ProfileAssociationCauseGaScenario.canInstantiate(obj) ? new ProfileAssociationCauseGaScenario(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationCauseGaScenario} proxy from a {@link Dependency} stereotyped << ProfileAssociation_cause_GaScenario >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationCauseGaScenario} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("06e44375-32b8-478d-b545-ca938a068441")
    public static ProfileAssociationCauseGaScenario safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationCauseGaScenario.canInstantiate(obj))
        	return new ProfileAssociationCauseGaScenario(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationCauseGaScenario: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5673158c-8fdb-4ccd-bf31-24709f812d2d")
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
        ProfileAssociationCauseGaScenario other = (ProfileAssociationCauseGaScenario) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("d941c688-48c8-48c8-9e44-8fd30ab101df")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("b23d1a46-c1ba-44bf-acfe-373d72b1795c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("abd9e7b1-245d-4fc1-9f98-cf3abf111b07")
    protected ProfileAssociationCauseGaScenario(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("a257bd90-c5e4-469e-80e0-545fd9f492e4")
    public static final class MdaTypes {
        @objid ("73e68a0c-1794-4809-be0c-b9910d0bb8df")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8ae8fc78-d7ba-489b-8267-75111e9a7e20")
        private static Stereotype MDAASSOCDEP;

        @objid ("e9598a9c-129a-425d-a0d1-6eb5c59f9401")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("64f4ccfb-4ac7-4f23-b1aa-299ebcd9330b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cffc6c51-dd1f-11e0-a2be-0027103f347c");
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
