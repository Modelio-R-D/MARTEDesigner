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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_host_GaStep >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7994aed7-8ae2-4037-9a59-491d3d7f6bfa")
public class ProfileAssociationHostGaStep {
    @objid ("4c4cff51-9ab9-4ea6-8119-fab8fa2cf688")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_host_GaStep";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("6c187a86-bc17-4735-8528-cfe6367a01a1")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationHostGaStep proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_host_GaStep >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a24b9dd2-0d7c-4a54-ab00-45ffd182413e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationHostGaStep.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_host_GaStep >> then instantiate a {@link ProfileAssociationHostGaStep} proxy.
     * 
     * @return a {@link ProfileAssociationHostGaStep} proxy on the created {@link Dependency}.
     */
    @objid ("94e44c8d-f643-4e17-9cbc-9229d1fba919")
    public static ProfileAssociationHostGaStep create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationHostGaStep.STEREOTYPE_NAME);
        return ProfileAssociationHostGaStep.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationHostGaStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_host_GaStep >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationHostGaStep} proxy or <i>null</i>.
     */
    @objid ("233e320c-0737-4a99-bb12-970c925c655f")
    public static ProfileAssociationHostGaStep instantiate(final Dependency obj) {
        return ProfileAssociationHostGaStep.canInstantiate(obj) ? new ProfileAssociationHostGaStep(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationHostGaStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_host_GaStep >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationHostGaStep} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7ec8569f-7b04-4fd7-aa91-201a312b4cb3")
    public static ProfileAssociationHostGaStep safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationHostGaStep.canInstantiate(obj))
        	return new ProfileAssociationHostGaStep(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationHostGaStep: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("593de38f-66f0-4815-a25c-ba5390c69a28")
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
        ProfileAssociationHostGaStep other = (ProfileAssociationHostGaStep) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("b4a64603-0d37-42db-90bf-7f5b2d2eacd1")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("247344e1-8c7b-4219-a7ae-edbf523f1446")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a07c2dec-a488-4d15-bd5e-1a8c47bdeaa1")
    protected ProfileAssociationHostGaStep(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("1b252540-9041-47bf-a031-aec8542cdd43")
    public static final class MdaTypes {
        @objid ("d00fc3bc-f7dd-446b-8133-519d5ae50308")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("43c624a0-9428-43c0-9e72-b7c890a605fd")
        private static Stereotype MDAASSOCDEP;

        @objid ("2f1579b2-72c7-4ee4-bbee-cf5249d7b5c3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9f8b2ae2-27ea-4820-b850-afe3a5c628f6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d04af9d2-dd1f-11e0-a2be-0027103f347c");
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
