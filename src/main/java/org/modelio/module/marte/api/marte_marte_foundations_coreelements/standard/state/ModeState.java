/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
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
 * Proxy class to handle a {@link State} with << Mode_State >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("bb4c480f-b2ab-417a-8075-49e72cc2dc42")
public class ModeState {
    @objid ("7c9d0407-ba33-403d-9a1c-a9918f7dc440")
    public static final String STEREOTYPE_NAME = "Mode_State";

    /**
     * The underlying {@link State} represented by this proxy, never null.
     */
    @objid ("3998b93e-b125-4742-a15b-f004b46046c6")
    protected final State elt;

    /**
     * Tells whether a {@link ModeState proxy} can be instantiated from a {@link MObject} checking it is a {@link State} stereotyped << Mode_State >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f7663560-2b9b-4f59-a348-ca80f909e2f4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof State) && ((State) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ModeState.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link State} stereotyped << Mode_State >> then instantiate a {@link ModeState} proxy.
     * 
     * @return a {@link ModeState} proxy on the created {@link State}.
     */
    @objid ("42464111-485b-47e3-bb9a-bc6dd6a34382")
    public static ModeState create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("State");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ModeState.STEREOTYPE_NAME);
        return ModeState.instantiate((State)e);
    }

    /**
     * Tries to instantiate a {@link ModeState} proxy from a {@link State} stereotyped << Mode_State >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a State
     * @return a {@link ModeState} proxy or <i>null</i>.
     */
    @objid ("0fd29d9d-0e9e-41cd-9723-fdc20f8f37a6")
    public static ModeState instantiate(final State obj) {
        return ModeState.canInstantiate(obj) ? new ModeState(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ModeState} proxy from a {@link State} stereotyped << Mode_State >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link State}
     * @return a {@link ModeState} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("574a3ec0-aa4e-470e-90e7-ce464322d27e")
    public static ModeState safeInstantiate(final State obj) throws IllegalArgumentException {
        if (ModeState.canInstantiate(obj))
        	return new ModeState(obj);
        else
        	throw new IllegalArgumentException("ModeState: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ed82a547-d28d-41c0-a94e-10e0cff09a9d")
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
        ModeState other = (ModeState) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link State}. 
     * @return the State represented by this proxy, never null.
     */
    @objid ("09f39f3a-efd4-412b-b4b5-acaf8da2f0cd")
    public State getElement() {
        return this.elt;
    }

    @objid ("aec73a06-abd4-4c7c-9b30-51a53523308e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("179e6d1b-e9d2-4084-8c98-7d3a44b2e2f7")
    protected ModeState(final State elt) {
        this.elt = elt;
    }

    @objid ("29469e12-41c7-481c-9f17-1875a0ad796c")
    public static final class MdaTypes {
        @objid ("e6975308-1de9-456d-9e40-8b4d5e74edfe")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2ebe6b95-aa03-48f0-9daa-a095c4a463ee")
        private static Stereotype MDAASSOCDEP;

        @objid ("e3019141-9cbd-44a8-887b-0b0513ae419b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8438f1ff-f63f-4763-a655-65f963bcafd5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00b982f8-0ccf-11df-8525-001302895b2b");
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
