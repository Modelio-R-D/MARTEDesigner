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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_invocations_GCMInvocatingBehavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d158b1d9-aa22-48cf-b752-d14cb7ade881")
public class ProfileAssociationInvocationsGCMInvocatingBehavior {
    @objid ("8c62f529-a667-4620-8643-a21203a4ae02")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_invocations_GCMInvocatingBehavior";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("0e4ef2e0-50a6-4ed3-a00f-31822bd55a87")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationInvocationsGCMInvocatingBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_invocations_GCMInvocatingBehavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("66cf9c71-76aa-4ebc-afb8-d2e51ba42100")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationInvocationsGCMInvocatingBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_invocations_GCMInvocatingBehavior >> then instantiate a {@link ProfileAssociationInvocationsGCMInvocatingBehavior} proxy.
     * 
     * @return a {@link ProfileAssociationInvocationsGCMInvocatingBehavior} proxy on the created {@link Dependency}.
     */
    @objid ("1a890121-295e-47f5-9ec4-134226444675")
    public static ProfileAssociationInvocationsGCMInvocatingBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationInvocationsGCMInvocatingBehavior.STEREOTYPE_NAME);
        return ProfileAssociationInvocationsGCMInvocatingBehavior.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationInvocationsGCMInvocatingBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_invocations_GCMInvocatingBehavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationInvocationsGCMInvocatingBehavior} proxy or <i>null</i>.
     */
    @objid ("d8798437-f060-468d-b18d-3c0f428c2070")
    public static ProfileAssociationInvocationsGCMInvocatingBehavior instantiate(final Dependency obj) {
        return ProfileAssociationInvocationsGCMInvocatingBehavior.canInstantiate(obj) ? new ProfileAssociationInvocationsGCMInvocatingBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationInvocationsGCMInvocatingBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_invocations_GCMInvocatingBehavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationInvocationsGCMInvocatingBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("221c0301-f2ec-4841-a4ef-912938fd0ba5")
    public static ProfileAssociationInvocationsGCMInvocatingBehavior safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationInvocationsGCMInvocatingBehavior.canInstantiate(obj))
        	return new ProfileAssociationInvocationsGCMInvocatingBehavior(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationInvocationsGCMInvocatingBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b10cb238-ccd6-462e-bb53-ed457e0bd0b5")
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
        ProfileAssociationInvocationsGCMInvocatingBehavior other = (ProfileAssociationInvocationsGCMInvocatingBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("26120057-8f6d-4f41-aa2a-1f5338349eea")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("11741d07-bb82-4ea1-9503-c8d59294dbdd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f38645bc-a7ad-4f33-adbd-2a291d15bc3e")
    protected ProfileAssociationInvocationsGCMInvocatingBehavior(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("f5a67ee9-4913-43ee-9aa7-531143ffc1e6")
    public static final class MdaTypes {
        @objid ("95b669ea-534d-4f91-9fb2-ae4594a434ff")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("101ee279-bf96-45cf-8dff-9225cae0f2b3")
        private static Stereotype MDAASSOCDEP;

        @objid ("d084fe78-4774-4132-9e20-52e187ddc2e9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b64b7a73-9c74-4f69-ad65-8a7868f5a459")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c283f7e3-a32a-11e1-8263-0027103f347d");
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
