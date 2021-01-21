/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.TimerResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SwTimerResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("efa1fef5-74a7-44fd-9c7b-ab5c6744067a")
public class SwTimerResourceLifeline extends TimerResourceLifeline {
    @objid ("3c0b995b-94dc-433b-bac1-55dd7153f668")
    public static final String STEREOTYPE_NAME = "SwTimerResource_Lifeline";

    /**
     * Tells whether a {@link SwTimerResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwTimerResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2694692b-9aba-4c36-90aa-3ae750bfb925")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwTimerResource_Lifeline >> then instantiate a {@link SwTimerResourceLifeline} proxy.
     * 
     * @return a {@link SwTimerResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("3a5ce843-6530-4bef-b60c-7d262fd9f5b6")
    public static SwTimerResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceLifeline.STEREOTYPE_NAME);
        return SwTimerResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwTimerResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwTimerResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("7b3ec003-7045-497b-b53c-9085bdfb107c")
    public static SwTimerResourceLifeline instantiate(final Lifeline obj) {
        return SwTimerResourceLifeline.canInstantiate(obj) ? new SwTimerResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwTimerResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SwTimerResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c9244f79-d707-490c-ad3c-aa05da1bfe94")
    public static SwTimerResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwTimerResourceLifeline.canInstantiate(obj))
        	return new SwTimerResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwTimerResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d0247366-8ced-4815-be3d-8644627d8018")
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
        SwTimerResourceLifeline other = (SwTimerResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("8fc8b855-ea49-49c6-a432-f4cc4222a633")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("9a7f8c95-594b-4ca8-9941-813bf6e62c24")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4a97418c-821c-41a0-9898-3b919e939a25")
    protected SwTimerResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("b6cb82a9-c6b5-42ef-900f-3d5aeae8f471")
    public static final class MdaTypes {
        @objid ("bc72ecb0-e6cf-4b4b-8ec6-67e716343a1c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2d4ccfb4-22e3-4cd5-bb1c-2d124047abf3")
        private static Stereotype MDAASSOCDEP;

        @objid ("4e0d6a50-d4a4-4439-b934-69fd5b5836ca")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2a43f76d-d93c-4a27-8cdc-5b09caa60d10")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "acc314eb-10cf-11df-81d9-0014222a9f79");
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
