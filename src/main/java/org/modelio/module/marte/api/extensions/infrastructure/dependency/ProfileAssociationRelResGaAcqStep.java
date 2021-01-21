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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_relRes_GaAcqStep >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("56429354-dad8-4d02-911a-3e06c9035261")
public class ProfileAssociationRelResGaAcqStep {
    @objid ("36341249-24cd-472e-8bc1-11cc5070489c")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_relRes_GaAcqStep";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("ad453899-49e2-4db1-81c6-c0b3d02da553")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationRelResGaAcqStep proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_relRes_GaAcqStep >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3f3fe57a-c0b9-463b-9f83-9804b4293bb0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationRelResGaAcqStep.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_relRes_GaAcqStep >> then instantiate a {@link ProfileAssociationRelResGaAcqStep} proxy.
     * 
     * @return a {@link ProfileAssociationRelResGaAcqStep} proxy on the created {@link Dependency}.
     */
    @objid ("40fcf410-16a0-46fd-a6e8-e3ad6622bc02")
    public static ProfileAssociationRelResGaAcqStep create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationRelResGaAcqStep.STEREOTYPE_NAME);
        return ProfileAssociationRelResGaAcqStep.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationRelResGaAcqStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_relRes_GaAcqStep >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationRelResGaAcqStep} proxy or <i>null</i>.
     */
    @objid ("be990dcc-92c0-46b6-8960-b008c9b37a33")
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
    @objid ("ce03b8a4-0a5b-4805-9c45-9f26735d5681")
    public static ProfileAssociationRelResGaAcqStep safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationRelResGaAcqStep.canInstantiate(obj))
        	return new ProfileAssociationRelResGaAcqStep(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationRelResGaAcqStep: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e97fcfb4-0228-46e0-95ed-1fbc6b9903a8")
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
    @objid ("3e1c8cd8-121e-4e9e-a4cc-01a9ee3546d6")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("c0d2e5b4-5ad3-4978-8d54-481982119dff")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6e741fbe-002e-440a-b913-30ad563d94ca")
    protected ProfileAssociationRelResGaAcqStep(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("22a07217-852d-431b-93b6-821fce4d28c3")
    public static final class MdaTypes {
        @objid ("13f34f55-aaaa-47f7-9f24-e7bd3d994d09")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("63f01bee-c310-4d79-b61c-97c86cc68119")
        private static Stereotype MDAASSOCDEP;

        @objid ("133a620b-2323-4d3b-8c90-5d4647d2e4a9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f78b2025-83de-42ad-9e2a-e7e690052cc3")
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
