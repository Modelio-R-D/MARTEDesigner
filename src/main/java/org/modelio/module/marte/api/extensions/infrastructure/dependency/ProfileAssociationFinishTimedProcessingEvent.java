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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_finish_TimedProcessing_Event >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c37eda99-8ff9-4df6-91bb-d5742164bb4f")
public class ProfileAssociationFinishTimedProcessingEvent {
    @objid ("300cbef3-605c-4b18-a8c2-cb565b466ee8")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_finish_TimedProcessing_Event";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("87c80d3f-e389-4386-a4b5-5ee6580e7eef")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationFinishTimedProcessingEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_finish_TimedProcessing_Event >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e7f24cef-ef6c-4785-a8bc-ce56db5569a7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationFinishTimedProcessingEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_finish_TimedProcessing_Event >> then instantiate a {@link ProfileAssociationFinishTimedProcessingEvent} proxy.
     * 
     * @return a {@link ProfileAssociationFinishTimedProcessingEvent} proxy on the created {@link Dependency}.
     */
    @objid ("8a6598db-3b01-4df7-9833-b78e44b09f9f")
    public static ProfileAssociationFinishTimedProcessingEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationFinishTimedProcessingEvent.STEREOTYPE_NAME);
        return ProfileAssociationFinishTimedProcessingEvent.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationFinishTimedProcessingEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_finish_TimedProcessing_Event >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationFinishTimedProcessingEvent} proxy or <i>null</i>.
     */
    @objid ("32fda852-3b5a-44e1-89ee-6286d5d9c11e")
    public static ProfileAssociationFinishTimedProcessingEvent instantiate(final Dependency obj) {
        return ProfileAssociationFinishTimedProcessingEvent.canInstantiate(obj) ? new ProfileAssociationFinishTimedProcessingEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationFinishTimedProcessingEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_finish_TimedProcessing_Event >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationFinishTimedProcessingEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("46feb0ea-fb9b-40eb-97e0-9d5f181974ef")
    public static ProfileAssociationFinishTimedProcessingEvent safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationFinishTimedProcessingEvent.canInstantiate(obj))
        	return new ProfileAssociationFinishTimedProcessingEvent(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationFinishTimedProcessingEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dd97bb22-e9e7-41ce-a763-699c52135216")
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
        ProfileAssociationFinishTimedProcessingEvent other = (ProfileAssociationFinishTimedProcessingEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("8621714e-651b-49cc-8a7a-31a6ddc8d2b8")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("65b10e84-5992-44ea-9a3c-b8d073295b11")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fb794096-1d24-4c0a-b2f2-f7ef0993f7e7")
    protected ProfileAssociationFinishTimedProcessingEvent(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("3bf74cb7-2e36-46bc-a37b-94f9624bc839")
    public static final class MdaTypes {
        @objid ("49462811-80f4-4e26-ab6a-f36af39926ff")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("55380aa5-b2ee-4098-b6d8-beac68a1cb7d")
        private static Stereotype MDAASSOCDEP;

        @objid ("fe5e848b-bb8a-4b8e-aea0-453cdcb8aa8e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1e7053f8-2f74-4a17-9cea-082d95feaddc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ec105cba-7d43-11df-b1cb-0014222a9f79");
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
