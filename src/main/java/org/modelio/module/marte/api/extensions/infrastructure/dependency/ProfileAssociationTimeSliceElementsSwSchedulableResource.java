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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_timeSliceElements_SwSchedulableResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8ae4b6ed-e9fb-434e-a016-d7f294657994")
public class ProfileAssociationTimeSliceElementsSwSchedulableResource {
    @objid ("ff06ce10-b30b-46f4-9fee-b414db2e7451")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_timeSliceElements_SwSchedulableResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("09d7c6e1-1cdd-4955-bba6-c45d782113ef")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationTimeSliceElementsSwSchedulableResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_timeSliceElements_SwSchedulableResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0d7bb8d6-aa13-4a00-b5fd-4649eeb25146")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTimeSliceElementsSwSchedulableResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_timeSliceElements_SwSchedulableResource >> then instantiate a {@link ProfileAssociationTimeSliceElementsSwSchedulableResource} proxy.
     * 
     * @return a {@link ProfileAssociationTimeSliceElementsSwSchedulableResource} proxy on the created {@link Dependency}.
     */
    @objid ("430c07cf-8ce5-4f25-ab33-709f0d96152e")
    public static ProfileAssociationTimeSliceElementsSwSchedulableResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTimeSliceElementsSwSchedulableResource.STEREOTYPE_NAME);
        return ProfileAssociationTimeSliceElementsSwSchedulableResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationTimeSliceElementsSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_timeSliceElements_SwSchedulableResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationTimeSliceElementsSwSchedulableResource} proxy or <i>null</i>.
     */
    @objid ("c1be514f-5cc0-4e38-a65c-8921969c8f23")
    public static ProfileAssociationTimeSliceElementsSwSchedulableResource instantiate(final Dependency obj) {
        return ProfileAssociationTimeSliceElementsSwSchedulableResource.canInstantiate(obj) ? new ProfileAssociationTimeSliceElementsSwSchedulableResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationTimeSliceElementsSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_timeSliceElements_SwSchedulableResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationTimeSliceElementsSwSchedulableResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("04f71ce2-ea48-49aa-934c-c66e257ae0fc")
    public static ProfileAssociationTimeSliceElementsSwSchedulableResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationTimeSliceElementsSwSchedulableResource.canInstantiate(obj))
        	return new ProfileAssociationTimeSliceElementsSwSchedulableResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationTimeSliceElementsSwSchedulableResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1eacdebd-d0b6-4015-aea9-f389acfa03f2")
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
        ProfileAssociationTimeSliceElementsSwSchedulableResource other = (ProfileAssociationTimeSliceElementsSwSchedulableResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("59b8bb9d-fe00-41c3-8459-45413d58cf9b")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("b681be9a-44be-425a-b0fa-55e4ee15e93b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9d9f5dc4-7e63-4df6-8068-0e9cf8099345")
    protected ProfileAssociationTimeSliceElementsSwSchedulableResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("a2619a7e-d179-4981-b7a6-1ded26c656be")
    public static final class MdaTypes {
        @objid ("2d53d58a-4667-4290-8a66-f91caa65a1bf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6299304a-5b9d-4cbf-a062-5ce09fcbe697")
        private static Stereotype MDAASSOCDEP;

        @objid ("31cbcaa2-3c72-485d-8640-7d062ad7c37c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2d3cf26b-8d87-442f-b4b8-5d33a54a9f13")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0fddea43-9758-11e0-94fb-0027103f347c");
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
