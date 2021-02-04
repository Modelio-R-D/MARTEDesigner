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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_impliedConstraint_Allocate_NfpConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("da418d69-3979-4844-b5f5-8d83652ec649")
public class ProfileAssociationImpliedConstraintAllocateNfpConstraint {
    @objid ("5e7bf858-3f27-4d97-88b8-a24df3bc845d")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_impliedConstraint_Allocate_NfpConstraint";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("d7a2446f-81a8-4510-92d3-130bf30d2f80")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationImpliedConstraintAllocateNfpConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_impliedConstraint_Allocate_NfpConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ac821d44-bca4-425d-b6ae-4063f7f5249e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationImpliedConstraintAllocateNfpConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_impliedConstraint_Allocate_NfpConstraint >> then instantiate a {@link ProfileAssociationImpliedConstraintAllocateNfpConstraint} proxy.
     * 
     * @return a {@link ProfileAssociationImpliedConstraintAllocateNfpConstraint} proxy on the created {@link Dependency}.
     */
    @objid ("650de7ee-04db-4f80-86e2-292daa6f0fd4")
    public static ProfileAssociationImpliedConstraintAllocateNfpConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationImpliedConstraintAllocateNfpConstraint.STEREOTYPE_NAME);
        return ProfileAssociationImpliedConstraintAllocateNfpConstraint.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationImpliedConstraintAllocateNfpConstraint} proxy from a {@link Dependency} stereotyped << ProfileAssociation_impliedConstraint_Allocate_NfpConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationImpliedConstraintAllocateNfpConstraint} proxy or <i>null</i>.
     */
    @objid ("d36fad4d-877e-436b-8fdb-7d564953a62c")
    public static ProfileAssociationImpliedConstraintAllocateNfpConstraint instantiate(final Dependency obj) {
        return ProfileAssociationImpliedConstraintAllocateNfpConstraint.canInstantiate(obj) ? new ProfileAssociationImpliedConstraintAllocateNfpConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationImpliedConstraintAllocateNfpConstraint} proxy from a {@link Dependency} stereotyped << ProfileAssociation_impliedConstraint_Allocate_NfpConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationImpliedConstraintAllocateNfpConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4a5c0e62-ceed-4379-922a-896b14515f23")
    public static ProfileAssociationImpliedConstraintAllocateNfpConstraint safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationImpliedConstraintAllocateNfpConstraint.canInstantiate(obj))
        	return new ProfileAssociationImpliedConstraintAllocateNfpConstraint(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationImpliedConstraintAllocateNfpConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("085ade66-a840-414f-a76d-12ecf81d347e")
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
        ProfileAssociationImpliedConstraintAllocateNfpConstraint other = (ProfileAssociationImpliedConstraintAllocateNfpConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("e1704e31-090a-4fca-a561-9f4f0297ef51")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("37ec1305-a805-47d0-ae56-853083165370")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d43942db-f650-49d1-bb2c-be9d18bf27ee")
    protected ProfileAssociationImpliedConstraintAllocateNfpConstraint(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("2fd1004d-ec30-40b6-aa64-f128bdbedf55")
    public static final class MdaTypes {
        @objid ("9cdb6722-caf4-4c37-a818-936a5bf84d18")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e5f413c8-1256-4d64-bd84-b573c5ae7dc2")
        private static Stereotype MDAASSOCDEP;

        @objid ("27a041cd-8496-49e4-90e0-4c862148cab4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("31f90f3e-c98f-4b91-a01b-15ab0652ec8c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a4f7cd24-a6fb-11e0-8d6a-0027103f347c");
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
