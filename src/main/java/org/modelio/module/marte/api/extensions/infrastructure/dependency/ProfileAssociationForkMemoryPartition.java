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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_fork_MemoryPartition >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f187d69c-7bd0-4678-ae39-476ff0fddc71")
public class ProfileAssociationForkMemoryPartition {
    @objid ("e2d4f89b-ef0f-4c8e-8c0c-e7183d511e8e")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_fork_MemoryPartition";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("21694b0e-c8c1-45af-8b3a-226f355275e1")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationForkMemoryPartition proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_fork_MemoryPartition >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9b581148-63c8-45f5-a809-b862b0ddb393")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationForkMemoryPartition.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_fork_MemoryPartition >> then instantiate a {@link ProfileAssociationForkMemoryPartition} proxy.
     * 
     * @return a {@link ProfileAssociationForkMemoryPartition} proxy on the created {@link Dependency}.
     */
    @objid ("601b4364-3366-46d0-8910-fb8b53d052ba")
    public static ProfileAssociationForkMemoryPartition create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationForkMemoryPartition.STEREOTYPE_NAME);
        return ProfileAssociationForkMemoryPartition.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationForkMemoryPartition} proxy from a {@link Dependency} stereotyped << ProfileAssociation_fork_MemoryPartition >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationForkMemoryPartition} proxy or <i>null</i>.
     */
    @objid ("57606e8d-bd52-49bb-9169-90d0e5019195")
    public static ProfileAssociationForkMemoryPartition instantiate(final Dependency obj) {
        return ProfileAssociationForkMemoryPartition.canInstantiate(obj) ? new ProfileAssociationForkMemoryPartition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationForkMemoryPartition} proxy from a {@link Dependency} stereotyped << ProfileAssociation_fork_MemoryPartition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationForkMemoryPartition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f18fb865-1da4-47b4-9cf1-5219f726f551")
    public static ProfileAssociationForkMemoryPartition safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationForkMemoryPartition.canInstantiate(obj))
        	return new ProfileAssociationForkMemoryPartition(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationForkMemoryPartition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("67d21918-6b34-4fbd-baaf-20de25141445")
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
        ProfileAssociationForkMemoryPartition other = (ProfileAssociationForkMemoryPartition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("5fb732fe-3b02-41b0-844e-8045e8119615")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("dff40b17-3b85-4b61-8b27-b0b5470fa02a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d1f3e5dd-a7bd-488c-82ab-9110316746d2")
    protected ProfileAssociationForkMemoryPartition(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("33e2cc73-b26d-415c-be2a-fd55de8882d1")
    public static final class MdaTypes {
        @objid ("83b4fcca-79a1-4b8b-8f96-9c9266b7f980")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b7d6b2ee-267b-48d3-a15b-173442760b6b")
        private static Stereotype MDAASSOCDEP;

        @objid ("df965f54-cc80-4a77-978a-2dc75a5c47c7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("44d8dd4b-5c27-4470-94bb-1773a7d9e943")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "69d953db-9757-11e0-94fb-0027103f347c");
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
