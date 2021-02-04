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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_effect_GaWorkloadEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("81f087b7-f35a-4cbd-8ccf-ddf20041f305")
public class ProfileAssociationEffectGaWorkloadEvent {
    @objid ("387fca7a-7620-42ba-af55-a50991341a66")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_effect_GaWorkloadEvent";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("99a8b15f-c3f2-4dc3-bf64-b0046b2449a8")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationEffectGaWorkloadEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_effect_GaWorkloadEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("21afd937-9b1b-4255-a0b3-8e515826c58f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationEffectGaWorkloadEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_effect_GaWorkloadEvent >> then instantiate a {@link ProfileAssociationEffectGaWorkloadEvent} proxy.
     * 
     * @return a {@link ProfileAssociationEffectGaWorkloadEvent} proxy on the created {@link Dependency}.
     */
    @objid ("1ab0fb31-9491-464d-8a4d-2366171838fe")
    public static ProfileAssociationEffectGaWorkloadEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationEffectGaWorkloadEvent.STEREOTYPE_NAME);
        return ProfileAssociationEffectGaWorkloadEvent.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationEffectGaWorkloadEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_effect_GaWorkloadEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationEffectGaWorkloadEvent} proxy or <i>null</i>.
     */
    @objid ("7bedaccc-22e6-4341-9b87-bd3bfc1dcedc")
    public static ProfileAssociationEffectGaWorkloadEvent instantiate(final Dependency obj) {
        return ProfileAssociationEffectGaWorkloadEvent.canInstantiate(obj) ? new ProfileAssociationEffectGaWorkloadEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationEffectGaWorkloadEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_effect_GaWorkloadEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationEffectGaWorkloadEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6eaabc8d-4cd0-40ae-a8ac-af261e5e4da2")
    public static ProfileAssociationEffectGaWorkloadEvent safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationEffectGaWorkloadEvent.canInstantiate(obj))
        	return new ProfileAssociationEffectGaWorkloadEvent(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationEffectGaWorkloadEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bbf20828-dd9d-48db-8752-ad08d15ac813")
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
        ProfileAssociationEffectGaWorkloadEvent other = (ProfileAssociationEffectGaWorkloadEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("f59c5afd-176b-47cc-8dbc-79b105d40e45")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("42e225fc-cffd-4731-a22d-a11ad8e188f2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("bb0cac2e-3422-4f5c-982d-cb01ddc230c5")
    protected ProfileAssociationEffectGaWorkloadEvent(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("582d3e7d-7938-466e-9c35-53e0bef1eb41")
    public static final class MdaTypes {
        @objid ("eee086d8-90f9-47e2-9d21-dbdb39dc770b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ef70d14a-c865-4172-9d19-4a937e139826")
        private static Stereotype MDAASSOCDEP;

        @objid ("f105e005-d93e-47df-bfc8-1f7cc299fed9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c28056ea-fb4c-4820-99e1-eb5a8356c418")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cfc80dfb-dd1f-11e0-a2be-0027103f347c");
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
