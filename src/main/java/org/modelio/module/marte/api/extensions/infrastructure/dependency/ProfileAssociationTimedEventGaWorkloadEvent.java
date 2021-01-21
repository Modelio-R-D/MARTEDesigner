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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_timedEvent_GaWorkloadEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("68775b9b-3e0c-4ada-a47f-4339677080e6")
public class ProfileAssociationTimedEventGaWorkloadEvent {
    @objid ("eb490687-89a7-4b6b-a9e3-54c8d78034c4")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_timedEvent_GaWorkloadEvent";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("c6222e1c-a92b-4905-843b-91720a5bca42")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationTimedEventGaWorkloadEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_timedEvent_GaWorkloadEvent >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("99b06f54-51fb-4335-ad1a-ba830b06de13")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTimedEventGaWorkloadEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_timedEvent_GaWorkloadEvent >> then instantiate a {@link ProfileAssociationTimedEventGaWorkloadEvent} proxy.
     * 
     * @return a {@link ProfileAssociationTimedEventGaWorkloadEvent} proxy on the created {@link Dependency}.
     */
    @objid ("86417dc8-7821-4a27-9046-8dd92b62ead9")
    public static ProfileAssociationTimedEventGaWorkloadEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTimedEventGaWorkloadEvent.STEREOTYPE_NAME);
        return ProfileAssociationTimedEventGaWorkloadEvent.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationTimedEventGaWorkloadEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_timedEvent_GaWorkloadEvent >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationTimedEventGaWorkloadEvent} proxy or <i>null</i>.
     */
    @objid ("e79f7a05-916b-44b3-81d9-e1b7a85fcca5")
    public static ProfileAssociationTimedEventGaWorkloadEvent instantiate(final Dependency obj) {
        return ProfileAssociationTimedEventGaWorkloadEvent.canInstantiate(obj) ? new ProfileAssociationTimedEventGaWorkloadEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationTimedEventGaWorkloadEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_timedEvent_GaWorkloadEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationTimedEventGaWorkloadEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4c1c4df3-9db7-4b81-bcc4-e763a431684a")
    public static ProfileAssociationTimedEventGaWorkloadEvent safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationTimedEventGaWorkloadEvent.canInstantiate(obj))
        	return new ProfileAssociationTimedEventGaWorkloadEvent(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationTimedEventGaWorkloadEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1d6eb979-3fb3-4902-9173-e9268e7ecc7e")
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
        ProfileAssociationTimedEventGaWorkloadEvent other = (ProfileAssociationTimedEventGaWorkloadEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("2f404268-30de-426c-bb1d-4bb66c3f2b9b")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("439f6773-d661-4775-b327-1f2de7acf348")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("eb95ed63-cd23-45a7-80df-64c221999ad3")
    protected ProfileAssociationTimedEventGaWorkloadEvent(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("37dd1137-0157-41f1-8786-69e1fa769fe4")
    public static final class MdaTypes {
        @objid ("9fa6242e-8d8d-4976-bba3-3a512052c891")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d446c495-4364-4381-a12a-789ce19e5610")
        private static Stereotype MDAASSOCDEP;

        @objid ("433bc9d8-2910-4915-b090-b24f5818aa8d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5dce951c-313d-4ac6-aa70-a5626ce71a02")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cfe23d26-dd1f-11e0-a2be-0027103f347c");
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
