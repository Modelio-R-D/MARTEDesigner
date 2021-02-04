/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("d709e497-81bd-42d7-a923-f459830fcec2")
    public static final String STEREOTYPE_NAME = "ConcurrencyResource_Lifeline";

    /**
     * Tells whether a {@link ConcurrencyResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << ConcurrencyResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("83219940-e961-4921-bc88-14f78a785223")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << ConcurrencyResource_Lifeline >> then instantiate a {@link ConcurrencyResourceLifeline} proxy.
     * 
     * @return a {@link ConcurrencyResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("5d1b8ae9-a4d8-4749-9998-c0b274eeb159")
    public static ConcurrencyResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceLifeline.STEREOTYPE_NAME);
        return ConcurrencyResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceLifeline} proxy from a {@link Lifeline} stereotyped << ConcurrencyResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link ConcurrencyResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("b0a58873-57f8-4731-a380-ac3263b87a8c")
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
    @objid ("d6072ceb-90ff-4841-8c85-083e77ee3215")
    public static ConcurrencyResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (ConcurrencyResourceLifeline.canInstantiate(obj))
        	return new ConcurrencyResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("ConcurrencyResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e4037bf1-c3f5-4b25-ab5c-220baaffa9c8")
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
    @objid ("ed4e0bfc-f177-47b5-bc24-96d1627a0779")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("f40acccf-e83c-4c37-adbc-92a007914fff")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9bc41805-6d46-4731-a609-f88a53b7ace3")
    protected ConcurrencyResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("7fcddc35-b905-4e22-93d5-1d245f717e75")
    public static final class MdaTypes {
        @objid ("21b700a8-4ed6-465e-bb06-4ec30c668022")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("39b4ebfa-486a-4661-bc15-1e640ec9ec69")
        private static Stereotype MDAASSOCDEP;

        @objid ("297c717c-2085-4e93-8ab5-698a7ce7cafd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b147558f-95e0-4879-9aef-e3d389c856d1")
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
