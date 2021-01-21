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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_yieldServices_SwSchedulableResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9f055c14-f947-4103-93ad-0492ce36d5ff")
public class ProfileAssociationYieldServicesSwSchedulableResource {
    @objid ("756a3fdb-dffc-4bda-ad55-c30caf351237")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_yieldServices_SwSchedulableResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("dd925b01-4f85-45cf-a160-9278fbd37c54")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationYieldServicesSwSchedulableResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_yieldServices_SwSchedulableResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0754d14a-49e1-44c8-b8e0-f840e771ce4d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationYieldServicesSwSchedulableResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_yieldServices_SwSchedulableResource >> then instantiate a {@link ProfileAssociationYieldServicesSwSchedulableResource} proxy.
     * 
     * @return a {@link ProfileAssociationYieldServicesSwSchedulableResource} proxy on the created {@link Dependency}.
     */
    @objid ("84b50e3e-8131-4ddc-8176-2debd2b84c55")
    public static ProfileAssociationYieldServicesSwSchedulableResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationYieldServicesSwSchedulableResource.STEREOTYPE_NAME);
        return ProfileAssociationYieldServicesSwSchedulableResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationYieldServicesSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_yieldServices_SwSchedulableResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationYieldServicesSwSchedulableResource} proxy or <i>null</i>.
     */
    @objid ("af83cd53-95b4-4a77-8dc1-de2743469b14")
    public static ProfileAssociationYieldServicesSwSchedulableResource instantiate(final Dependency obj) {
        return ProfileAssociationYieldServicesSwSchedulableResource.canInstantiate(obj) ? new ProfileAssociationYieldServicesSwSchedulableResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationYieldServicesSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_yieldServices_SwSchedulableResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationYieldServicesSwSchedulableResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8d457210-0797-4bbd-83ce-69e7e69b94bc")
    public static ProfileAssociationYieldServicesSwSchedulableResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationYieldServicesSwSchedulableResource.canInstantiate(obj))
        	return new ProfileAssociationYieldServicesSwSchedulableResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationYieldServicesSwSchedulableResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3b47b372-51fc-4f9a-b0af-bb477b727d90")
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
        ProfileAssociationYieldServicesSwSchedulableResource other = (ProfileAssociationYieldServicesSwSchedulableResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("8391b550-c649-4e09-95d6-cb1b081630bd")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("ee1d563a-54fe-4403-8dff-5d836c03a503")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("602cd947-b20d-44b0-b0e4-ce2fc349b739")
    protected ProfileAssociationYieldServicesSwSchedulableResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("43bb0b57-4106-400e-a4a6-af1d3221ec09")
    public static final class MdaTypes {
        @objid ("d992b587-846d-4ebc-9abd-e7a1dd97d626")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7580af75-9f1f-44b5-8847-323202074b88")
        private static Stereotype MDAASSOCDEP;

        @objid ("0980514e-cff6-46fb-a1e7-65008953a322")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fad371c7-8fbe-4e60-b0cb-dcd6982ae687")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3266854f-9758-11e0-94fb-0027103f347c");
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
