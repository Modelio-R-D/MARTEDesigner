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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_behavior_GaStep >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7f81f20b-3c5c-45df-885c-c8fca3c9b26b")
public class ProfileAssociationBehaviorGaStep {
    @objid ("44bb0073-3b76-46c5-81df-2955fe9a9f52")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_behavior_GaStep";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("5cc65676-d962-4e2b-b121-be8289d670ad")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationBehaviorGaStep proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_behavior_GaStep >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("abf6bf35-a564-4e98-af82-2c4d9d8afe20")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBehaviorGaStep.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_behavior_GaStep >> then instantiate a {@link ProfileAssociationBehaviorGaStep} proxy.
     * 
     * @return a {@link ProfileAssociationBehaviorGaStep} proxy on the created {@link Dependency}.
     */
    @objid ("e33d16c1-8447-40b0-b12b-ac9365228190")
    public static ProfileAssociationBehaviorGaStep create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBehaviorGaStep.STEREOTYPE_NAME);
        return ProfileAssociationBehaviorGaStep.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBehaviorGaStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_behavior_GaStep >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationBehaviorGaStep} proxy or <i>null</i>.
     */
    @objid ("44660be4-956b-4ace-824e-57b53a004a13")
    public static ProfileAssociationBehaviorGaStep instantiate(final Dependency obj) {
        return ProfileAssociationBehaviorGaStep.canInstantiate(obj) ? new ProfileAssociationBehaviorGaStep(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBehaviorGaStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_behavior_GaStep >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationBehaviorGaStep} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b719604a-e5aa-45f6-a320-e51197172f62")
    public static ProfileAssociationBehaviorGaStep safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationBehaviorGaStep.canInstantiate(obj))
        	return new ProfileAssociationBehaviorGaStep(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationBehaviorGaStep: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("70144630-cf73-4833-a89b-3eaba8dd1be9")
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
        ProfileAssociationBehaviorGaStep other = (ProfileAssociationBehaviorGaStep) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("6e589653-b9db-40a1-bd31-4cd9f22a60fd")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("f52f6fc5-229d-460e-9258-07fa4f22e6a0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("836f2f27-79d2-4d82-8820-f37c7ae103ba")
    protected ProfileAssociationBehaviorGaStep(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("ac73fcf2-47a5-4bfe-a6fd-9e64a50bc3be")
    public static final class MdaTypes {
        @objid ("7f247b31-5954-4a8f-9ddd-6b588401ac22")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("21ede2ea-7112-4d52-b530-c6b7f742bda7")
        private static Stereotype MDAASSOCDEP;

        @objid ("7ad07463-774a-4627-b063-95e5e1488f5b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("619116a6-4a2b-4efc-8814-704f6f6ef10e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d081b989-dd1f-11e0-a2be-0027103f347c");
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
