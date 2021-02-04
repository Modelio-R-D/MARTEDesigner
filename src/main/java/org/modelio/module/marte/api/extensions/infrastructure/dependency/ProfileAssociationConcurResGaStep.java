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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_concurRes_GaStep >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1193e2d1-865c-4ea6-a8bc-5f3111cea951")
public class ProfileAssociationConcurResGaStep {
    @objid ("fdbda4cc-c922-4276-97ba-752e630048c2")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_concurRes_GaStep";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("dfa3186f-2ce1-453c-920a-f8dc79ee3ed0")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationConcurResGaStep proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_concurRes_GaStep >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e345c849-ef12-4c40-90ad-b81eda8cae23")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationConcurResGaStep.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_concurRes_GaStep >> then instantiate a {@link ProfileAssociationConcurResGaStep} proxy.
     * 
     * @return a {@link ProfileAssociationConcurResGaStep} proxy on the created {@link Dependency}.
     */
    @objid ("03f0f51a-cb8d-473f-8a2d-b23f1f76c91d")
    public static ProfileAssociationConcurResGaStep create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationConcurResGaStep.STEREOTYPE_NAME);
        return ProfileAssociationConcurResGaStep.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationConcurResGaStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_concurRes_GaStep >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationConcurResGaStep} proxy or <i>null</i>.
     */
    @objid ("51eb61bc-8ac5-49db-bfe9-05fd128e1eee")
    public static ProfileAssociationConcurResGaStep instantiate(final Dependency obj) {
        return ProfileAssociationConcurResGaStep.canInstantiate(obj) ? new ProfileAssociationConcurResGaStep(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationConcurResGaStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_concurRes_GaStep >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationConcurResGaStep} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9efb55c2-270a-464f-a864-8897dcbfc7c4")
    public static ProfileAssociationConcurResGaStep safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationConcurResGaStep.canInstantiate(obj))
        	return new ProfileAssociationConcurResGaStep(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationConcurResGaStep: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("98f5f911-6ba4-4b27-99ad-d19eac5eb796")
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
        ProfileAssociationConcurResGaStep other = (ProfileAssociationConcurResGaStep) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("5238ef85-15fe-4f59-8f73-0fc9650bf326")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("4f568ee2-dbbe-4d77-92f2-e927e31921fa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c477c8a8-9905-41d2-8fcc-7d949b21472a")
    protected ProfileAssociationConcurResGaStep(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("58dab8cc-4faf-4db8-963b-513113f682e5")
    public static final class MdaTypes {
        @objid ("0ad05325-3aad-43b8-87d9-1717950d6a3f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3f045fd4-83c7-4b40-9700-ee4859ccd0c6")
        private static Stereotype MDAASSOCDEP;

        @objid ("2e163c70-c174-4484-9e67-908dcdd2b59b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("262cab44-c38e-47d1-813e-d2466e3e67db")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d030caa7-dd1f-11e0-a2be-0027103f347c");
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
