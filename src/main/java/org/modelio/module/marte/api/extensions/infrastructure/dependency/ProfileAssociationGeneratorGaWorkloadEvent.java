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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_generator_GaWorkloadEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("23d3445f-fd56-4756-b282-1b0a97c6ceba")
public class ProfileAssociationGeneratorGaWorkloadEvent {
    @objid ("f6d19811-1e24-4e97-80c1-a798a681a17b")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_generator_GaWorkloadEvent";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("836d044c-6724-40a4-a312-e8c1e0b57bba")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationGeneratorGaWorkloadEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_generator_GaWorkloadEvent >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("50ed2999-8760-4ce4-9868-62d1fcac0d67")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationGeneratorGaWorkloadEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_generator_GaWorkloadEvent >> then instantiate a {@link ProfileAssociationGeneratorGaWorkloadEvent} proxy.
     * 
     * @return a {@link ProfileAssociationGeneratorGaWorkloadEvent} proxy on the created {@link Dependency}.
     */
    @objid ("93480e91-c85a-4dd8-bf94-ae615f79686c")
    public static ProfileAssociationGeneratorGaWorkloadEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationGeneratorGaWorkloadEvent.STEREOTYPE_NAME);
        return ProfileAssociationGeneratorGaWorkloadEvent.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationGeneratorGaWorkloadEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_generator_GaWorkloadEvent >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationGeneratorGaWorkloadEvent} proxy or <i>null</i>.
     */
    @objid ("824e7147-2032-46c1-ba72-d2c49b255a22")
    public static ProfileAssociationGeneratorGaWorkloadEvent instantiate(final Dependency obj) {
        return ProfileAssociationGeneratorGaWorkloadEvent.canInstantiate(obj) ? new ProfileAssociationGeneratorGaWorkloadEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationGeneratorGaWorkloadEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_generator_GaWorkloadEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationGeneratorGaWorkloadEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d9a1516f-7172-4f43-b0a5-6a202424e998")
    public static ProfileAssociationGeneratorGaWorkloadEvent safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationGeneratorGaWorkloadEvent.canInstantiate(obj))
        	return new ProfileAssociationGeneratorGaWorkloadEvent(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationGeneratorGaWorkloadEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("765296da-d8e3-4c00-a20f-2b253ec51968")
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
        ProfileAssociationGeneratorGaWorkloadEvent other = (ProfileAssociationGeneratorGaWorkloadEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("773818a4-7018-490d-a887-85952824548e")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("a9443e5f-388f-4509-b6d8-e6419ebf88a9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b85e881f-2ed3-4431-9136-d450f53c79a6")
    protected ProfileAssociationGeneratorGaWorkloadEvent(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("451fd643-d609-489e-a5b5-6c0dc474d6ba")
    public static final class MdaTypes {
        @objid ("cc1a003d-4f97-4bdf-8275-094ccdcb5c8c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c2afa396-be07-4610-a180-c5e0b99a5854")
        private static Stereotype MDAASSOCDEP;

        @objid ("8a1249d7-5cc1-440c-9866-016f6e71e13c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8b535db0-2f9b-4c9f-97df-aa7b8d1df832")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cf93afa5-dd1f-11e0-a2be-0027103f347c");
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
