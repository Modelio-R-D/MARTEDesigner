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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_scheduler_MutualExclusionResource_Scheduler >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5fbfe2c7-f6b0-4f7c-87fe-86b330775ebc")
public class ProfileAssociationSchedulerMutualExclusionResourceScheduler {
    @objid ("e50538f1-7e90-4d15-b74f-de9b9696f01c")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_scheduler_MutualExclusionResource_Scheduler";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("9742db07-7d04-412d-b08f-7f0baa2adf63")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationSchedulerMutualExclusionResourceScheduler proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_scheduler_MutualExclusionResource_Scheduler >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2f66052e-62ad-4a77-93ae-49820bf1400d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSchedulerMutualExclusionResourceScheduler.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_scheduler_MutualExclusionResource_Scheduler >> then instantiate a {@link ProfileAssociationSchedulerMutualExclusionResourceScheduler} proxy.
     * 
     * @return a {@link ProfileAssociationSchedulerMutualExclusionResourceScheduler} proxy on the created {@link Dependency}.
     */
    @objid ("d084a736-597d-4f2e-8488-2e113aba6171")
    public static ProfileAssociationSchedulerMutualExclusionResourceScheduler create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSchedulerMutualExclusionResourceScheduler.STEREOTYPE_NAME);
        return ProfileAssociationSchedulerMutualExclusionResourceScheduler.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSchedulerMutualExclusionResourceScheduler} proxy from a {@link Dependency} stereotyped << ProfileAssociation_scheduler_MutualExclusionResource_Scheduler >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationSchedulerMutualExclusionResourceScheduler} proxy or <i>null</i>.
     */
    @objid ("ae2cf0fe-f5a0-42ac-9749-ea1ab509ebb2")
    public static ProfileAssociationSchedulerMutualExclusionResourceScheduler instantiate(final Dependency obj) {
        return ProfileAssociationSchedulerMutualExclusionResourceScheduler.canInstantiate(obj) ? new ProfileAssociationSchedulerMutualExclusionResourceScheduler(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSchedulerMutualExclusionResourceScheduler} proxy from a {@link Dependency} stereotyped << ProfileAssociation_scheduler_MutualExclusionResource_Scheduler >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationSchedulerMutualExclusionResourceScheduler} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ec7765d1-fa80-4048-80f2-81e4118cd765")
    public static ProfileAssociationSchedulerMutualExclusionResourceScheduler safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationSchedulerMutualExclusionResourceScheduler.canInstantiate(obj))
        	return new ProfileAssociationSchedulerMutualExclusionResourceScheduler(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationSchedulerMutualExclusionResourceScheduler: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f1f31c80-b5fb-48f2-861e-19ff8d95d76b")
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
        ProfileAssociationSchedulerMutualExclusionResourceScheduler other = (ProfileAssociationSchedulerMutualExclusionResourceScheduler) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("553154ad-6efe-4b1f-9e20-22af68923274")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("53a4d0a8-5fe0-48c1-bc4a-cab255912e45")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7c3bf9c8-2d45-49ba-b60c-ea78bfb1ab68")
    protected ProfileAssociationSchedulerMutualExclusionResourceScheduler(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("8cb422e6-9305-4c6d-bbdc-d208729f71c9")
    public static final class MdaTypes {
        @objid ("45f80f5a-48e8-4a90-b602-fcb016b67618")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c385218e-44ec-4c0d-97f9-28878c37a1c1")
        private static Stereotype MDAASSOCDEP;

        @objid ("47d75779-2c98-4831-a2fc-499ffdd88251")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("abd31898-ec89-43ea-ba41-c29f4f6ccb71")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f9f4a736-8b67-11df-9343-0014222a9f79");
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
