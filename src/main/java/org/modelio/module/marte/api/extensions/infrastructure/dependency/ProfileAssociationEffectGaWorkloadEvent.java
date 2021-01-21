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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_effect_GaWorkloadEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("81f087b7-f35a-4cbd-8ccf-ddf20041f305")
public class ProfileAssociationEffectGaWorkloadEvent {
    @objid ("19350115-4f71-4c0a-9c3b-a4457e293bf4")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_effect_GaWorkloadEvent";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("58b29e9e-dbc6-4254-bbf5-67b208d70441")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationEffectGaWorkloadEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_effect_GaWorkloadEvent >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("13c6a580-b68f-4d6f-99a3-b34ff5136ee9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationEffectGaWorkloadEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_effect_GaWorkloadEvent >> then instantiate a {@link ProfileAssociationEffectGaWorkloadEvent} proxy.
     * 
     * @return a {@link ProfileAssociationEffectGaWorkloadEvent} proxy on the created {@link Dependency}.
     */
    @objid ("19bfc6df-352d-44b8-8156-4c2f09d5f72d")
    public static ProfileAssociationEffectGaWorkloadEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationEffectGaWorkloadEvent.STEREOTYPE_NAME);
        return ProfileAssociationEffectGaWorkloadEvent.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationEffectGaWorkloadEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_effect_GaWorkloadEvent >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationEffectGaWorkloadEvent} proxy or <i>null</i>.
     */
    @objid ("03f3ce11-785f-41c3-88d6-ea529da5b098")
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
    @objid ("fe6fd1bb-f64a-4dc5-9dc5-02ae750122e6")
    public static ProfileAssociationEffectGaWorkloadEvent safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationEffectGaWorkloadEvent.canInstantiate(obj))
        	return new ProfileAssociationEffectGaWorkloadEvent(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationEffectGaWorkloadEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("09324c50-82e1-4757-b6cf-bd0df8308e9d")
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
    @objid ("4f382a4c-bc32-47ff-899c-6a36955097c4")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("16e64541-266f-4656-b9c7-d9398195a6b1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fc912c1a-f317-4f49-ac8c-07d2c1adab26")
    protected ProfileAssociationEffectGaWorkloadEvent(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("582d3e7d-7938-466e-9c35-53e0bef1eb41")
    public static final class MdaTypes {
        @objid ("454cdb6b-3506-44ad-84db-6c8b5f3ca909")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e5eccee8-c09e-4e94-a3c0-6545345cbb7d")
        private static Stereotype MDAASSOCDEP;

        @objid ("ecd593c5-ac8d-4c97-8555-ff96242f54fe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0112603f-7745-483f-a801-1197e0cc6c18")
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
