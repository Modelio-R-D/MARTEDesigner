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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_routineDisconnectServices_InterruptResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("949149c0-08b8-49ab-bcdf-db6be1b4b589")
public class ProfileAssociationRoutineDisconnectServicesInterruptResource {
    @objid ("d84f835b-448d-421b-bcef-eb1b5e98d9b1")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_routineDisconnectServices_InterruptResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("59520c24-2eff-4b6e-bb92-c2b2464eda8c")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationRoutineDisconnectServicesInterruptResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_routineDisconnectServices_InterruptResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b7955aea-d85c-49f7-a277-d8a2ddf7ca30")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationRoutineDisconnectServicesInterruptResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_routineDisconnectServices_InterruptResource >> then instantiate a {@link ProfileAssociationRoutineDisconnectServicesInterruptResource} proxy.
     * 
     * @return a {@link ProfileAssociationRoutineDisconnectServicesInterruptResource} proxy on the created {@link Dependency}.
     */
    @objid ("6fbe3587-df89-47f9-86f5-bcebab19bd0d")
    public static ProfileAssociationRoutineDisconnectServicesInterruptResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationRoutineDisconnectServicesInterruptResource.STEREOTYPE_NAME);
        return ProfileAssociationRoutineDisconnectServicesInterruptResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationRoutineDisconnectServicesInterruptResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_routineDisconnectServices_InterruptResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationRoutineDisconnectServicesInterruptResource} proxy or <i>null</i>.
     */
    @objid ("5d656c13-bb35-4690-9d09-6be71c80ba8a")
    public static ProfileAssociationRoutineDisconnectServicesInterruptResource instantiate(final Dependency obj) {
        return ProfileAssociationRoutineDisconnectServicesInterruptResource.canInstantiate(obj) ? new ProfileAssociationRoutineDisconnectServicesInterruptResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationRoutineDisconnectServicesInterruptResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_routineDisconnectServices_InterruptResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationRoutineDisconnectServicesInterruptResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f4c1af6f-4941-4e2c-a40a-711c3c10d62f")
    public static ProfileAssociationRoutineDisconnectServicesInterruptResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationRoutineDisconnectServicesInterruptResource.canInstantiate(obj))
        	return new ProfileAssociationRoutineDisconnectServicesInterruptResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationRoutineDisconnectServicesInterruptResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("04b03daa-1ad3-4044-885a-c7ea69fce5fd")
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
        ProfileAssociationRoutineDisconnectServicesInterruptResource other = (ProfileAssociationRoutineDisconnectServicesInterruptResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("36df0e76-611c-4964-8013-56ce98f5e288")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("39ea4e71-c0e2-4e7b-864f-e53a80282eea")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a3a5ade7-e537-41b7-8f8a-58cee6fe7291")
    protected ProfileAssociationRoutineDisconnectServicesInterruptResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("cf198b6e-e66a-4910-918f-42f1bbd66534")
    public static final class MdaTypes {
        @objid ("316e9723-e21b-454d-a3cb-d578bbcf334d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2d126d3a-2f27-4307-a5d8-58532d326092")
        private static Stereotype MDAASSOCDEP;

        @objid ("41e6e65d-cadc-4c34-bf70-810801ba5ac4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e3a97381-9bb0-4df2-b830-065d77256905")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b6e0189b-9757-11e0-94fb-0027103f347c");
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
