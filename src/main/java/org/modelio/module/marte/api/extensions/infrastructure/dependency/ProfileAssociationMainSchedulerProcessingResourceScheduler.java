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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_mainScheduler_ProcessingResource_Scheduler >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("68eb779e-3c75-40b4-8109-5c1f402bb042")
public class ProfileAssociationMainSchedulerProcessingResourceScheduler {
    @objid ("e71665ae-b2dd-434a-a354-4d7ffbc6788f")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_mainScheduler_ProcessingResource_Scheduler";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("0faa4655-1277-4b08-8b5d-b1502802550a")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMainSchedulerProcessingResourceScheduler proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_mainScheduler_ProcessingResource_Scheduler >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e680069f-66dc-421f-bc30-8e6dba576c91")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMainSchedulerProcessingResourceScheduler.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_mainScheduler_ProcessingResource_Scheduler >> then instantiate a {@link ProfileAssociationMainSchedulerProcessingResourceScheduler} proxy.
     * 
     * @return a {@link ProfileAssociationMainSchedulerProcessingResourceScheduler} proxy on the created {@link Dependency}.
     */
    @objid ("0471f870-3bfb-4fbb-9f97-d41959110fcb")
    public static ProfileAssociationMainSchedulerProcessingResourceScheduler create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMainSchedulerProcessingResourceScheduler.STEREOTYPE_NAME);
        return ProfileAssociationMainSchedulerProcessingResourceScheduler.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMainSchedulerProcessingResourceScheduler} proxy from a {@link Dependency} stereotyped << ProfileAssociation_mainScheduler_ProcessingResource_Scheduler >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMainSchedulerProcessingResourceScheduler} proxy or <i>null</i>.
     */
    @objid ("d8109d39-c68c-4ced-bb1d-c35692eb0e2d")
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
    @objid ("f721360d-72e9-40b1-94bb-4c3ae5db320f")
    public static ProfileAssociationMainSchedulerProcessingResourceScheduler safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMainSchedulerProcessingResourceScheduler.canInstantiate(obj))
        	return new ProfileAssociationMainSchedulerProcessingResourceScheduler(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMainSchedulerProcessingResourceScheduler: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("20b4b0d8-1eca-4f51-9f3a-3605e283005d")
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
    @objid ("db98eb6e-6f17-4f83-afed-f28067fc9161")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("443a4055-c69d-4107-8830-e5089ea6b52a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fc502919-e2ad-4efd-9dcb-99a8f9b1502f")
    protected ProfileAssociationMainSchedulerProcessingResourceScheduler(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("2fe57526-1ead-4dbc-8117-ecb7933383c1")
    public static final class MdaTypes {
        @objid ("058bc5fe-7bcc-4694-a9e0-1f500dd7e4d3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0ca70431-1aa1-410c-9cd8-b5ecd3558dbb")
        private static Stereotype MDAASSOCDEP;

        @objid ("93525769-0d21-468b-979a-04f37ce49f5d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("783576c3-4556-400f-9fcc-decd2882e37a")
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
