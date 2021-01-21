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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_predictors_HwProcessor_HwBranchPredictor >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c7535438-6e3d-4c32-912b-7e2805a2517d")
public class ProfileAssociationPredictorsHwProcessorHwBranchPredictor {
    @objid ("f93c49b4-c14f-4cc5-84e4-9bcc1c4956b2")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_predictors_HwProcessor_HwBranchPredictor";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("27aac5ca-99d5-48a8-84c9-20079faff200")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationPredictorsHwProcessorHwBranchPredictor proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_predictors_HwProcessor_HwBranchPredictor >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("63496286-d261-4187-9418-f6eebf3b3f4a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPredictorsHwProcessorHwBranchPredictor.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_predictors_HwProcessor_HwBranchPredictor >> then instantiate a {@link ProfileAssociationPredictorsHwProcessorHwBranchPredictor} proxy.
     * 
     * @return a {@link ProfileAssociationPredictorsHwProcessorHwBranchPredictor} proxy on the created {@link Dependency}.
     */
    @objid ("d62b3061-6e9e-4522-9747-d312d640c5d6")
    public static ProfileAssociationPredictorsHwProcessorHwBranchPredictor create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPredictorsHwProcessorHwBranchPredictor.STEREOTYPE_NAME);
        return ProfileAssociationPredictorsHwProcessorHwBranchPredictor.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationPredictorsHwProcessorHwBranchPredictor} proxy from a {@link Dependency} stereotyped << ProfileAssociation_predictors_HwProcessor_HwBranchPredictor >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationPredictorsHwProcessorHwBranchPredictor} proxy or <i>null</i>.
     */
    @objid ("43f37387-0c0b-4b76-8a3a-42c7823d505d")
    public static ProfileAssociationPredictorsHwProcessorHwBranchPredictor instantiate(final Dependency obj) {
        return ProfileAssociationPredictorsHwProcessorHwBranchPredictor.canInstantiate(obj) ? new ProfileAssociationPredictorsHwProcessorHwBranchPredictor(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationPredictorsHwProcessorHwBranchPredictor} proxy from a {@link Dependency} stereotyped << ProfileAssociation_predictors_HwProcessor_HwBranchPredictor >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationPredictorsHwProcessorHwBranchPredictor} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f70952a4-c78e-4d0a-88a9-008e03480852")
    public static ProfileAssociationPredictorsHwProcessorHwBranchPredictor safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationPredictorsHwProcessorHwBranchPredictor.canInstantiate(obj))
        	return new ProfileAssociationPredictorsHwProcessorHwBranchPredictor(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationPredictorsHwProcessorHwBranchPredictor: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d43e0839-084e-44b2-8149-e2b7f3aaa778")
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
        ProfileAssociationPredictorsHwProcessorHwBranchPredictor other = (ProfileAssociationPredictorsHwProcessorHwBranchPredictor) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("e7926888-63d0-40c4-bad5-ec35762845cb")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("140900f0-f3df-433e-9f6f-71dac0bbcfa6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e83bce0b-e245-42db-aa3a-fb5154567cf9")
    protected ProfileAssociationPredictorsHwProcessorHwBranchPredictor(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("578e7a26-69f0-4076-bacf-aac104fae231")
    public static final class MdaTypes {
        @objid ("608c1b8f-819b-4577-88c9-7f78d2f17431")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("76c6949b-eab9-4a5e-80b5-9122769077ca")
        private static Stereotype MDAASSOCDEP;

        @objid ("201b8820-2c6d-4082-994c-faa7173ded73")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dfb13926-6323-40c9-b712-65422a7bbcba")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8cd030bf-9688-11e0-95ba-0027103f347c");
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
