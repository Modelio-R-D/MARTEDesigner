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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_concurRes_GaStep >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1193e2d1-865c-4ea6-a8bc-5f3111cea951")
public class ProfileAssociationConcurResGaStep {
    @objid ("ce4b79cb-7903-4566-a4ce-a405b0377191")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_concurRes_GaStep";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("8dd80ee7-3a8c-4663-9c2d-115972bf8af2")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationConcurResGaStep proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_concurRes_GaStep >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("97e6c80c-ee40-4efb-96aa-12821d1688c6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationConcurResGaStep.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_concurRes_GaStep >> then instantiate a {@link ProfileAssociationConcurResGaStep} proxy.
     * 
     * @return a {@link ProfileAssociationConcurResGaStep} proxy on the created {@link Dependency}.
     */
    @objid ("5f41b338-75a3-4ef7-a7a2-2fa89b30b827")
    public static ProfileAssociationConcurResGaStep create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationConcurResGaStep.STEREOTYPE_NAME);
        return ProfileAssociationConcurResGaStep.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationConcurResGaStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_concurRes_GaStep >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationConcurResGaStep} proxy or <i>null</i>.
     */
    @objid ("521b07b4-b080-47eb-8fb4-cf4476c26946")
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
    @objid ("bf95a1a0-cd09-4093-afd7-3bfe1a186e1d")
    public static ProfileAssociationConcurResGaStep safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationConcurResGaStep.canInstantiate(obj))
        	return new ProfileAssociationConcurResGaStep(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationConcurResGaStep: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0e1d0767-41d3-477a-b853-b2d744cbbcfa")
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
    @objid ("9b1c7e81-2685-476c-bb2f-c22a2570f9f5")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("28533ec0-502b-4d5b-b02d-ba8bd1af902b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c0c71dc4-fc91-464c-811d-7a1002a7d94d")
    protected ProfileAssociationConcurResGaStep(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("58dab8cc-4faf-4db8-963b-513113f682e5")
    public static final class MdaTypes {
        @objid ("c86d2ad7-2dca-43c1-a6b1-3ea4cc6f71ba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6d484efd-aa0c-476a-92ea-f6be12656ddf")
        private static Stereotype MDAASSOCDEP;

        @objid ("81be0aa0-2806-44b3-88f7-56e1cc60bddf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c2b2859c-356f-4575-8ebd-5cea250f6450")
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
