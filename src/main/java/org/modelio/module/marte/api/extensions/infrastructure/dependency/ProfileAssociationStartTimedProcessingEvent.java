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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_start_TimedProcessing_Event >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("69a02742-7c9d-408e-b74a-f2b9afe1cf40")
public class ProfileAssociationStartTimedProcessingEvent {
    @objid ("b569f7b2-c124-4bd8-ac85-e53208978294")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_start_TimedProcessing_Event";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("d0b2d0c5-cb28-476b-b948-8cfee5c34528")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationStartTimedProcessingEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_start_TimedProcessing_Event >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a9aed4a1-213c-43a4-837d-2a760db7a873")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationStartTimedProcessingEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_start_TimedProcessing_Event >> then instantiate a {@link ProfileAssociationStartTimedProcessingEvent} proxy.
     * 
     * @return a {@link ProfileAssociationStartTimedProcessingEvent} proxy on the created {@link Dependency}.
     */
    @objid ("1bcda5be-3d95-40ad-8828-d7a2c98552eb")
    public static ProfileAssociationStartTimedProcessingEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationStartTimedProcessingEvent.STEREOTYPE_NAME);
        return ProfileAssociationStartTimedProcessingEvent.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationStartTimedProcessingEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_start_TimedProcessing_Event >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationStartTimedProcessingEvent} proxy or <i>null</i>.
     */
    @objid ("92027e84-6b29-4058-86ab-84fd241b0d06")
    public static ProfileAssociationStartTimedProcessingEvent instantiate(final Dependency obj) {
        return ProfileAssociationStartTimedProcessingEvent.canInstantiate(obj) ? new ProfileAssociationStartTimedProcessingEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationStartTimedProcessingEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_start_TimedProcessing_Event >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationStartTimedProcessingEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("73bf99c5-fdf6-467d-811b-1a47f3eaea92")
    public static ProfileAssociationStartTimedProcessingEvent safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationStartTimedProcessingEvent.canInstantiate(obj))
        	return new ProfileAssociationStartTimedProcessingEvent(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationStartTimedProcessingEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("31b61ed7-eb93-4eeb-8085-e3a2f0469db3")
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
        ProfileAssociationStartTimedProcessingEvent other = (ProfileAssociationStartTimedProcessingEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("88a76c84-125a-4dba-8c95-dca7fa258736")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("a0d93dbd-c451-4b06-92d5-b64739b72c56")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ba3a8ed9-a9a4-4a08-a7da-8a92a1724652")
    protected ProfileAssociationStartTimedProcessingEvent(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("664e100a-796f-4a1f-bc87-0d9193c09763")
    public static final class MdaTypes {
        @objid ("0c0be50d-3f1f-4145-8fda-e1127cad9bc3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4e797890-6474-4b76-9427-461e86e80b19")
        private static Stereotype MDAASSOCDEP;

        @objid ("18b7773a-2953-49ce-953f-bfe5bdf0606b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c93380d1-ecea-4c58-8e1d-b555368cdf96")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "008832ea-7d44-11df-b1cb-0014222a9f79");
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
