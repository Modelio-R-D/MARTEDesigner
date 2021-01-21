/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.statemachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
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
 * Proxy class to handle a {@link StateMachine} with << ModeBehavior_StateMachine >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9369ef3a-301d-4741-b1d1-c643675e0323")
public class ModeBehaviorStateMachine {
    @objid ("ffc516fa-90e3-4b48-9fb2-81463fee4d4b")
    public static final String STEREOTYPE_NAME = "ModeBehavior_StateMachine";

    /**
     * The underlying {@link StateMachine} represented by this proxy, never null.
     */
    @objid ("92625521-ea20-4bd7-8d29-ff4bb30de6fa")
    protected final StateMachine elt;

    /**
     * Tells whether a {@link ModeBehaviorStateMachine proxy} can be instantiated from a {@link MObject} checking it is a {@link StateMachine} stereotyped << ModeBehavior_StateMachine >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1edf4bed-5b52-4226-ad9b-95905d6ca4c7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StateMachine) && ((StateMachine) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ModeBehaviorStateMachine.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link StateMachine} stereotyped << ModeBehavior_StateMachine >> then instantiate a {@link ModeBehaviorStateMachine} proxy.
     * 
     * @return a {@link ModeBehaviorStateMachine} proxy on the created {@link StateMachine}.
     */
    @objid ("719380ac-3aab-4f4d-8b35-858121ead908")
    public static ModeBehaviorStateMachine create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("StateMachine");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ModeBehaviorStateMachine.STEREOTYPE_NAME);
        return ModeBehaviorStateMachine.instantiate((StateMachine)e);
    }

    /**
     * Tries to instantiate a {@link ModeBehaviorStateMachine} proxy from a {@link StateMachine} stereotyped << ModeBehavior_StateMachine >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StateMachine
     * @return a {@link ModeBehaviorStateMachine} proxy or <i>null</i>.
     */
    @objid ("360581c5-b183-4313-8758-8de211135780")
    public static ModeBehaviorStateMachine instantiate(final StateMachine obj) {
        return ModeBehaviorStateMachine.canInstantiate(obj) ? new ModeBehaviorStateMachine(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ModeBehaviorStateMachine} proxy from a {@link StateMachine} stereotyped << ModeBehavior_StateMachine >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link StateMachine}
     * @return a {@link ModeBehaviorStateMachine} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5f162fb7-a269-4a4e-a43e-07a0ee078773")
    public static ModeBehaviorStateMachine safeInstantiate(final StateMachine obj) throws IllegalArgumentException {
        if (ModeBehaviorStateMachine.canInstantiate(obj))
        	return new ModeBehaviorStateMachine(obj);
        else
        	throw new IllegalArgumentException("ModeBehaviorStateMachine: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("923bdc2e-f9fd-4473-8959-981c5b1f93d8")
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
        ModeBehaviorStateMachine other = (ModeBehaviorStateMachine) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StateMachine}. 
     * @return the StateMachine represented by this proxy, never null.
     */
    @objid ("3c31912c-8665-4ddd-ba3b-62e9a530a3f5")
    public StateMachine getElement() {
        return this.elt;
    }

    @objid ("b74cafad-c733-4d8a-b670-de33cf308f51")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0518b6d0-d9d2-424f-9e41-690dbcd23d50")
    protected ModeBehaviorStateMachine(final StateMachine elt) {
        this.elt = elt;
    }

    @objid ("ea1a8e70-08df-49c2-bb54-2797c19ce2a1")
    public static final class MdaTypes {
        @objid ("ce4f352b-13b8-4931-afdc-e2ecdde141b8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("29b43be9-3065-45f8-8d6f-b5371c68f025")
        private static Stereotype MDAASSOCDEP;

        @objid ("1ea235cb-079f-47a4-af3a-92db3bee793f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9a11f1ee-b785-477e-8ca5-045cfa593ec9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00c0a9ee-0ccf-11df-8525-001302895b2b");
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
