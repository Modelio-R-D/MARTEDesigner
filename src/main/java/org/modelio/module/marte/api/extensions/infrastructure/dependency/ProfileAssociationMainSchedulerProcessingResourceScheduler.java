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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_mainScheduler_ProcessingResource_Scheduler >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("68eb779e-3c75-40b4-8109-5c1f402bb042")
public class ProfileAssociationMainSchedulerProcessingResourceScheduler {
    @objid ("19d0ec45-d5e2-4caf-8905-d07e1f313ef7")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_mainScheduler_ProcessingResource_Scheduler";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("e75c10d1-6667-4d86-9f90-629ffc49498f")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMainSchedulerProcessingResourceScheduler proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_mainScheduler_ProcessingResource_Scheduler >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5fb71ac3-3b5b-4e9d-9b98-0d890b2f1bc1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMainSchedulerProcessingResourceScheduler.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_mainScheduler_ProcessingResource_Scheduler >> then instantiate a {@link ProfileAssociationMainSchedulerProcessingResourceScheduler} proxy.
     * 
     * @return a {@link ProfileAssociationMainSchedulerProcessingResourceScheduler} proxy on the created {@link Dependency}.
     */
    @objid ("9a9afac2-fb0f-4f7d-a637-fbdd2cb8d13f")
    public static ProfileAssociationMainSchedulerProcessingResourceScheduler create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMainSchedulerProcessingResourceScheduler.STEREOTYPE_NAME);
        return ProfileAssociationMainSchedulerProcessingResourceScheduler.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMainSchedulerProcessingResourceScheduler} proxy from a {@link Dependency} stereotyped << ProfileAssociation_mainScheduler_ProcessingResource_Scheduler >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMainSchedulerProcessingResourceScheduler} proxy or <i>null</i>.
     */
    @objid ("edec85ed-a599-4f1b-a6f7-79cd0ad641e3")
    public static ProfileAssociationMainSchedulerProcessingResourceScheduler instantiate(final Dependency obj) {
        return ProfileAssociationMainSchedulerProcessingResourceScheduler.canInstantiate(obj) ? new ProfileAssociationMainSchedulerProcessingResourceScheduler(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMainSchedulerProcessingResourceScheduler} proxy from a {@link Dependency} stereotyped << ProfileAssociation_mainScheduler_ProcessingResource_Scheduler >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMainSchedulerProcessingResourceScheduler} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d6aff304-a552-461c-adf3-9066b6d5a4bb")
    public static ProfileAssociationMainSchedulerProcessingResourceScheduler safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMainSchedulerProcessingResourceScheduler.canInstantiate(obj))
        	return new ProfileAssociationMainSchedulerProcessingResourceScheduler(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMainSchedulerProcessingResourceScheduler: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a6efbb7a-0af9-4116-bca7-d199fb414047")
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
        ProfileAssociationMainSchedulerProcessingResourceScheduler other = (ProfileAssociationMainSchedulerProcessingResourceScheduler) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("3df71295-4ee5-4d0d-bca9-c61afa3fbae8")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("f6e26cce-bf2a-4c7c-b6f6-06b34c6dc5d3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9851b00b-0aa3-4e6f-b2c1-17fbd5903102")
    protected ProfileAssociationMainSchedulerProcessingResourceScheduler(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("2fe57526-1ead-4dbc-8117-ecb7933383c1")
    public static final class MdaTypes {
        @objid ("dd5f4f4b-20ef-45a7-b0e0-299b7f48791f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("570ece2d-c2ae-4206-95f6-e86c79c1428d")
        private static Stereotype MDAASSOCDEP;

        @objid ("945a1dbf-0ebe-49de-9284-a87c90baef97")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b8877976-0638-462c-bb48-0bf97229e785")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aa325afa-8b67-11df-9343-0014222a9f79");
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
