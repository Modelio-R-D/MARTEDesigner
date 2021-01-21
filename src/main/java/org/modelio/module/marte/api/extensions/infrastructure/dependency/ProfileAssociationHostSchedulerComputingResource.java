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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_host_Scheduler_ComputingResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fb3af21b-0ae3-4606-93b8-0c449be04073")
public class ProfileAssociationHostSchedulerComputingResource {
    @objid ("b4406fef-8834-41ee-9ac8-01c4bf4095a7")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_host_Scheduler_ComputingResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("a26b3938-74ce-4e1b-9b21-9dd2bb89849f")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationHostSchedulerComputingResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_host_Scheduler_ComputingResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e2dfe1ad-65f4-45fe-8087-ccd24f5d2abc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationHostSchedulerComputingResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_host_Scheduler_ComputingResource >> then instantiate a {@link ProfileAssociationHostSchedulerComputingResource} proxy.
     * 
     * @return a {@link ProfileAssociationHostSchedulerComputingResource} proxy on the created {@link Dependency}.
     */
    @objid ("b7fab19c-2c92-4d5f-a0f4-5646b126906d")
    public static ProfileAssociationHostSchedulerComputingResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationHostSchedulerComputingResource.STEREOTYPE_NAME);
        return ProfileAssociationHostSchedulerComputingResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationHostSchedulerComputingResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_host_Scheduler_ComputingResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationHostSchedulerComputingResource} proxy or <i>null</i>.
     */
    @objid ("60a28f9e-41e3-42c5-a929-c6d557c1f6ff")
    public static ProfileAssociationHostSchedulerComputingResource instantiate(final Dependency obj) {
        return ProfileAssociationHostSchedulerComputingResource.canInstantiate(obj) ? new ProfileAssociationHostSchedulerComputingResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationHostSchedulerComputingResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_host_Scheduler_ComputingResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationHostSchedulerComputingResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("db970dfc-3b5e-4414-a5f7-1feaf686e546")
    public static ProfileAssociationHostSchedulerComputingResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationHostSchedulerComputingResource.canInstantiate(obj))
        	return new ProfileAssociationHostSchedulerComputingResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationHostSchedulerComputingResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("09412f2e-ccda-4932-b98b-69d6ae7f425f")
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
        ProfileAssociationHostSchedulerComputingResource other = (ProfileAssociationHostSchedulerComputingResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("33795304-f493-4eee-98ed-3c9a51bb3520")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("d7a419a0-f1d7-43ce-a7b4-791aba94b6da")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("92312569-bb62-4fd3-96e4-43402022660b")
    protected ProfileAssociationHostSchedulerComputingResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("1dda7a71-db85-4760-b308-e8179b37894c")
    public static final class MdaTypes {
        @objid ("c74f16c8-9f7a-4adf-993a-1989681b48ef")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("81d62d4e-ec9e-472a-921b-c9ea46c60a30")
        private static Stereotype MDAASSOCDEP;

        @objid ("bcee8a8c-c01b-44ce-8a9b-01fae8ca8a0c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ff8596f7-79a5-4002-a179-bd149cf743b7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "bc4dca1e-8b65-11df-9343-0014222a9f79");
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
