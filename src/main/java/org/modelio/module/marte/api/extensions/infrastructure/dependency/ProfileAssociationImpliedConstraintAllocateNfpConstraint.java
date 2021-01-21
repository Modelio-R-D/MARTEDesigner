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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_impliedConstraint_Allocate_NfpConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("da418d69-3979-4844-b5f5-8d83652ec649")
public class ProfileAssociationImpliedConstraintAllocateNfpConstraint {
    @objid ("c6cbdc52-a253-419e-a040-fbc071bca1fc")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_impliedConstraint_Allocate_NfpConstraint";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("3c4dc4a1-d4b5-43ec-a588-bc96357cc808")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationImpliedConstraintAllocateNfpConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_impliedConstraint_Allocate_NfpConstraint >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("dbd57185-0190-4e6d-ab38-779e3bec1e4d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationImpliedConstraintAllocateNfpConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_impliedConstraint_Allocate_NfpConstraint >> then instantiate a {@link ProfileAssociationImpliedConstraintAllocateNfpConstraint} proxy.
     * 
     * @return a {@link ProfileAssociationImpliedConstraintAllocateNfpConstraint} proxy on the created {@link Dependency}.
     */
    @objid ("c5714129-7c18-4a99-be95-e5a7875a8e9f")
    public static ProfileAssociationImpliedConstraintAllocateNfpConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationImpliedConstraintAllocateNfpConstraint.STEREOTYPE_NAME);
        return ProfileAssociationImpliedConstraintAllocateNfpConstraint.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationImpliedConstraintAllocateNfpConstraint} proxy from a {@link Dependency} stereotyped << ProfileAssociation_impliedConstraint_Allocate_NfpConstraint >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationImpliedConstraintAllocateNfpConstraint} proxy or <i>null</i>.
     */
    @objid ("f9987915-710a-4c3f-86aa-c5b98d377bfc")
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
    @objid ("0395800e-8002-4583-8475-1856a6c3f6bf")
    public static ProfileAssociationImpliedConstraintAllocateNfpConstraint safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationImpliedConstraintAllocateNfpConstraint.canInstantiate(obj))
        	return new ProfileAssociationImpliedConstraintAllocateNfpConstraint(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationImpliedConstraintAllocateNfpConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("02aa04d8-f839-46dc-a4f4-4508b74bab33")
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
    @objid ("3eba2edb-dee8-4c57-97fb-1b5bd874ec44")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("36e9220b-9134-4960-97e3-7a77c36bdd54")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a4b3a43f-b08b-4487-8109-e2e9f809995b")
    protected ProfileAssociationImpliedConstraintAllocateNfpConstraint(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("2fd1004d-ec30-40b6-aa64-f128bdbedf55")
    public static final class MdaTypes {
        @objid ("72fdc685-e85a-4d99-9eb8-f1974a08388d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("aa5fe869-22a8-4b74-a917-71ed9dbc66c5")
        private static Stereotype MDAASSOCDEP;

        @objid ("7b044bbd-b984-490d-b982-ef87a5ef4896")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("145ab7d3-6650-432b-b200-8ce2de5a0500")
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
