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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_unit_Clock_Unit >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2ca4317d-6bd9-4e85-bb4c-7a13521224dc")
public class ProfileAssociationUnitClockUnit {
    @objid ("0cebba9a-610c-4b16-ad18-3551a2a87b70")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_unit_Clock_Unit";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("e3803f18-2ac1-4e9f-ae54-1c94f6b9156c")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationUnitClockUnit proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_unit_Clock_Unit >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("25a73b93-c10e-47fa-ba9d-bf143cfc0923")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUnitClockUnit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_unit_Clock_Unit >> then instantiate a {@link ProfileAssociationUnitClockUnit} proxy.
     * 
     * @return a {@link ProfileAssociationUnitClockUnit} proxy on the created {@link Dependency}.
     */
    @objid ("2569b45c-e3c0-4485-9f52-0e0596e26d63")
    public static ProfileAssociationUnitClockUnit create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUnitClockUnit.STEREOTYPE_NAME);
        return ProfileAssociationUnitClockUnit.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationUnitClockUnit} proxy from a {@link Dependency} stereotyped << ProfileAssociation_unit_Clock_Unit >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationUnitClockUnit} proxy or <i>null</i>.
     */
    @objid ("63af0531-26fa-49df-aef3-fa2b505da287")
    public static ProfileAssociationUnitClockUnit instantiate(final Dependency obj) {
        return ProfileAssociationUnitClockUnit.canInstantiate(obj) ? new ProfileAssociationUnitClockUnit(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationUnitClockUnit} proxy from a {@link Dependency} stereotyped << ProfileAssociation_unit_Clock_Unit >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationUnitClockUnit} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2927bafd-f5cf-411f-8158-c087c5316dd6")
    public static ProfileAssociationUnitClockUnit safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationUnitClockUnit.canInstantiate(obj))
        	return new ProfileAssociationUnitClockUnit(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationUnitClockUnit: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("87b7bd94-8b8f-4c25-aa68-56f3b3fa80a8")
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
        ProfileAssociationUnitClockUnit other = (ProfileAssociationUnitClockUnit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("e70ad0a0-3298-42df-8bdb-abd063f993de")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("87125041-f988-4071-af53-52f2c5e6a63e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("dbf1827c-b387-4384-99ae-72fda9bd899b")
    protected ProfileAssociationUnitClockUnit(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("a0de9b15-3e62-462d-b219-d29e27de1b73")
    public static final class MdaTypes {
        @objid ("4c0a4ef1-8a0c-49a4-b711-43af51b708f5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2c7d7ef9-94f3-44b5-bf0c-a2e293cbb7b5")
        private static Stereotype MDAASSOCDEP;

        @objid ("52dd668f-cd16-43e9-bb19-6275fddfc5e8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1e5ea3f9-8291-42e5-b51e-95675270a3ef")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5eefc01d-77b9-11df-a783-0014222a9f79");
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
