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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_sharedRes_SaStep >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("27742497-8c1b-49f9-bfa6-fb93bda7952d")
public class ProfileAssociationSharedResSaStep {
    @objid ("48fb377c-1826-47ce-92b1-d1d7a277bb4d")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_sharedRes_SaStep";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("4d9e5271-f1bc-4865-ae49-2389a1f49455")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationSharedResSaStep proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_sharedRes_SaStep >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6c5bddc4-5019-490b-90b2-696896a722c1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSharedResSaStep.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_sharedRes_SaStep >> then instantiate a {@link ProfileAssociationSharedResSaStep} proxy.
     * 
     * @return a {@link ProfileAssociationSharedResSaStep} proxy on the created {@link Dependency}.
     */
    @objid ("0cd1ae00-f66a-456e-92f9-fb33bf92f2c7")
    public static ProfileAssociationSharedResSaStep create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSharedResSaStep.STEREOTYPE_NAME);
        return ProfileAssociationSharedResSaStep.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSharedResSaStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_sharedRes_SaStep >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationSharedResSaStep} proxy or <i>null</i>.
     */
    @objid ("f5c0f0c8-d825-459f-accb-fba089ac317d")
    public static ProfileAssociationSharedResSaStep instantiate(final Dependency obj) {
        return ProfileAssociationSharedResSaStep.canInstantiate(obj) ? new ProfileAssociationSharedResSaStep(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSharedResSaStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_sharedRes_SaStep >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationSharedResSaStep} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ef665753-3fbc-43e8-8b17-4e1e602cdf27")
    public static ProfileAssociationSharedResSaStep safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationSharedResSaStep.canInstantiate(obj))
        	return new ProfileAssociationSharedResSaStep(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationSharedResSaStep: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a0a95166-ff0a-4065-a429-3dadfba87d1c")
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
        ProfileAssociationSharedResSaStep other = (ProfileAssociationSharedResSaStep) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("8a8eef50-ccc5-476c-8b2e-dc7f6ed72785")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("5f958b7e-1a16-4aa3-8de0-cafc742c0fd7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9b62cbba-bbfa-4521-a422-a885468ed6c1")
    protected ProfileAssociationSharedResSaStep(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("dd337b70-feb6-4d66-89ab-e2873396857c")
    public static final class MdaTypes {
        @objid ("173ae827-9661-49de-86e0-214fe1c17700")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5a6f41c6-842c-4c82-aa0f-78a206437a87")
        private static Stereotype MDAASSOCDEP;

        @objid ("0214c3cf-4fa9-41b1-8d09-4a4e1e2022a6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d4ea05bd-6df5-41f5-99a5-102d6ce9638a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d0d509cc-dd1f-11e0-a2be-0027103f347c");
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
