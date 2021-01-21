/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
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
 * Proxy class to handle a {@link Lifeline} with << ConcurrencyResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f5ec1e2f-c70d-4ae4-b3a3-131b35be75e0")
public class ConcurrencyResourceLifeline extends ResourceLifeline {
    @objid ("052b757a-eb90-4a84-adb8-29286c15701b")
    public static final String STEREOTYPE_NAME = "ConcurrencyResource_Lifeline";

    /**
     * Tells whether a {@link ConcurrencyResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << ConcurrencyResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7e527fd2-9a83-4b6f-8db7-e6cbbde7104a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << ConcurrencyResource_Lifeline >> then instantiate a {@link ConcurrencyResourceLifeline} proxy.
     * 
     * @return a {@link ConcurrencyResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("9b992a32-8897-4810-a04d-49f279576a5c")
    public static ConcurrencyResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceLifeline.STEREOTYPE_NAME);
        return ConcurrencyResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceLifeline} proxy from a {@link Lifeline} stereotyped << ConcurrencyResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link ConcurrencyResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("54bfb788-2405-4646-aebb-05faca19dbc9")
    public static ConcurrencyResourceLifeline instantiate(final Lifeline obj) {
        return ConcurrencyResourceLifeline.canInstantiate(obj) ? new ConcurrencyResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceLifeline} proxy from a {@link Lifeline} stereotyped << ConcurrencyResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link ConcurrencyResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fecfa92e-d490-4fc2-8418-71016728b46d")
    public static ConcurrencyResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (ConcurrencyResourceLifeline.canInstantiate(obj))
        	return new ConcurrencyResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("ConcurrencyResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6f6d8778-ec92-49a1-8fc3-2f0321b656a3")
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
        ConcurrencyResourceLifeline other = (ConcurrencyResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("682e62a3-82f7-4a2d-bf09-18bd0f20bee4")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("99991236-0c8d-4869-b53c-bcc415ef8f5c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2acdc203-0859-422e-8e9e-19688126e357")
    protected ConcurrencyResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("7fcddc35-b905-4e22-93d5-1d245f717e75")
    public static final class MdaTypes {
        @objid ("8938f0dd-2538-4299-9438-2f02e5fe8233")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e83a2cb3-969c-4dcc-ada7-b34a012a86eb")
        private static Stereotype MDAASSOCDEP;

        @objid ("f4160ee0-f68a-4f82-9c15-5a4d55035098")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("30e11264-bb5e-437d-ad2a-90518ef574e1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fff86709-0cce-11df-8525-001302895b2b");
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
