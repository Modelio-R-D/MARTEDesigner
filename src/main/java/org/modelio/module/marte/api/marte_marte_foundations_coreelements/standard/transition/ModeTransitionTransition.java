/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.transition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
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
 * Proxy class to handle a {@link Transition} with << ModeTransition_Transition >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3c5554fd-e705-4d63-a395-d4ebb4d27624")
public class ModeTransitionTransition {
    @objid ("aa9969dd-93f5-4728-97d8-5ef68fc117ba")
    public static final String STEREOTYPE_NAME = "ModeTransition_Transition";

    /**
     * The underlying {@link Transition} represented by this proxy, never null.
     */
    @objid ("488170a2-8033-4e2e-b2bf-25aa9fc23158")
    protected final Transition elt;

    /**
     * Tells whether a {@link ModeTransitionTransition proxy} can be instantiated from a {@link MObject} checking it is a {@link Transition} stereotyped << ModeTransition_Transition >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b4af8b2a-85b5-419e-8414-738cbae1f425")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Transition) && ((Transition) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ModeTransitionTransition.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Transition} stereotyped << ModeTransition_Transition >> then instantiate a {@link ModeTransitionTransition} proxy.
     * 
     * @return a {@link ModeTransitionTransition} proxy on the created {@link Transition}.
     */
    @objid ("f432c2cd-0ad4-429d-85e9-e2e41fad41ec")
    public static ModeTransitionTransition create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Transition");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ModeTransitionTransition.STEREOTYPE_NAME);
        return ModeTransitionTransition.instantiate((Transition)e);
    }

    /**
     * Tries to instantiate a {@link ModeTransitionTransition} proxy from a {@link Transition} stereotyped << ModeTransition_Transition >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Transition
     * @return a {@link ModeTransitionTransition} proxy or <i>null</i>.
     */
    @objid ("0343c61f-8368-4823-a48e-443e9b227fff")
    public static ModeTransitionTransition instantiate(final Transition obj) {
        return ModeTransitionTransition.canInstantiate(obj) ? new ModeTransitionTransition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ModeTransitionTransition} proxy from a {@link Transition} stereotyped << ModeTransition_Transition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Transition}
     * @return a {@link ModeTransitionTransition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("64c4a5af-b3f0-4d91-bce3-5dd951b23ea9")
    public static ModeTransitionTransition safeInstantiate(final Transition obj) throws IllegalArgumentException {
        if (ModeTransitionTransition.canInstantiate(obj))
        	return new ModeTransitionTransition(obj);
        else
        	throw new IllegalArgumentException("ModeTransitionTransition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("84b16d37-23f8-489c-bf1c-e81f759b7b55")
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
        ModeTransitionTransition other = (ModeTransitionTransition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Transition}. 
     * @return the Transition represented by this proxy, never null.
     */
    @objid ("82cd4ed2-beba-4014-9f2b-be28315cfaec")
    public Transition getElement() {
        return this.elt;
    }

    @objid ("9b7ec969-2331-44dd-a968-6e156b26fc14")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("950c901c-dd2d-445a-ab35-51b3c8b95645")
    protected ModeTransitionTransition(final Transition elt) {
        this.elt = elt;
    }

    @objid ("a240aadd-c6d3-48d2-988d-8ceeb6749353")
    public static final class MdaTypes {
        @objid ("1c472c13-d0f6-4d5c-9b5d-59cd73d408c4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("af4ebed7-6db7-49b1-880d-8096cd3eac1f")
        private static Stereotype MDAASSOCDEP;

        @objid ("51abf8f4-42c9-41df-b8b5-a2c122c58629")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("faae6bd4-0e53-4d86-9ab5-fcc891853d26")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00bbe54a-0ccf-11df-8525-001302895b2b");
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
