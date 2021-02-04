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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_relRes_GaAcqStep >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("56429354-dad8-4d02-911a-3e06c9035261")
public class ProfileAssociationRelResGaAcqStep {
    @objid ("8c23e60e-5bab-4dd9-b747-eefc14e7a76c")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_relRes_GaAcqStep";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("f263d8d8-a63a-461c-829c-22f5395c880c")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationRelResGaAcqStep proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_relRes_GaAcqStep >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f6fcc7c8-e5da-49ed-9983-00214a655f89")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationRelResGaAcqStep.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_relRes_GaAcqStep >> then instantiate a {@link ProfileAssociationRelResGaAcqStep} proxy.
     * 
     * @return a {@link ProfileAssociationRelResGaAcqStep} proxy on the created {@link Dependency}.
     */
    @objid ("67393742-bb77-4a0b-bb80-216119cc3b8d")
    public static ProfileAssociationRelResGaAcqStep create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationRelResGaAcqStep.STEREOTYPE_NAME);
        return ProfileAssociationRelResGaAcqStep.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationRelResGaAcqStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_relRes_GaAcqStep >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationRelResGaAcqStep} proxy or <i>null</i>.
     */
    @objid ("c9fc80f3-4d11-4313-a6e5-734b4cfb9a02")
    public static ProfileAssociationRelResGaAcqStep instantiate(final Dependency obj) {
        return ProfileAssociationRelResGaAcqStep.canInstantiate(obj) ? new ProfileAssociationRelResGaAcqStep(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationRelResGaAcqStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_relRes_GaAcqStep >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationRelResGaAcqStep} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("743bc230-0434-431c-9128-4370cd82e790")
    public static ProfileAssociationRelResGaAcqStep safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationRelResGaAcqStep.canInstantiate(obj))
        	return new ProfileAssociationRelResGaAcqStep(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationRelResGaAcqStep: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("25532338-7ed4-4220-8890-629494fc4daf")
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
        ProfileAssociationRelResGaAcqStep other = (ProfileAssociationRelResGaAcqStep) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("7eafde36-ba43-41bd-9f12-cc0104c1ef30")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("23665fb9-94f9-45e9-bf69-f624afbc72dc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("56f6f05b-bd5f-41d6-bd4d-3915486af4f5")
    protected ProfileAssociationRelResGaAcqStep(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("22a07217-852d-431b-93b6-821fce4d28c3")
    public static final class MdaTypes {
        @objid ("bda00bce-58ec-4de6-a592-fa1b3a362993")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b84804fa-a2ba-40fc-93c6-ab151e21c5a6")
        private static Stereotype MDAASSOCDEP;

        @objid ("d74ba4cd-b864-4e2b-9ba9-d0f77f916830")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("08645f9e-034e-4df8-ab98-004b4d05272e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d0badaa1-dd1f-11e0-a2be-0027103f347c");
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
