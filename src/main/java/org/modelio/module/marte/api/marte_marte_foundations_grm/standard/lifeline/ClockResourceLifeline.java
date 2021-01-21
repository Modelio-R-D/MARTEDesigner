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
 * Proxy class to handle a {@link Lifeline} with << ClockResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("bff3b7b4-78d3-4bd4-b152-2af36aab46e5")
public class ClockResourceLifeline extends TimingResourceLifeline {
    @objid ("a0d09a6a-bd13-4d63-9e3b-1eae5dc9204d")
    public static final String STEREOTYPE_NAME = "ClockResource_Lifeline";

    /**
     * Tells whether a {@link ClockResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << ClockResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a3d075b8-b6d8-409a-8b14-e6cf1c6cad40")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << ClockResource_Lifeline >> then instantiate a {@link ClockResourceLifeline} proxy.
     * 
     * @return a {@link ClockResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("17b46dbf-feda-4018-b2f1-71271ba861d4")
    public static ClockResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceLifeline.STEREOTYPE_NAME);
        return ClockResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link ClockResourceLifeline} proxy from a {@link Lifeline} stereotyped << ClockResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link ClockResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("dea5b31f-3f51-4f88-982f-890733eaa1fc")
    public static ClockResourceLifeline instantiate(final Lifeline obj) {
        return ClockResourceLifeline.canInstantiate(obj) ? new ClockResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockResourceLifeline} proxy from a {@link Lifeline} stereotyped << ClockResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link ClockResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9092d67b-036b-42f1-8077-9b83f89f5ba4")
    public static ClockResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (ClockResourceLifeline.canInstantiate(obj))
        	return new ClockResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("ClockResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("509bca6f-4a07-4099-8cae-bd7f8a28981b")
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
        ClockResourceLifeline other = (ClockResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("728e21ad-95eb-4c84-8247-012509cff00f")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("5f9650a7-56e8-4e00-a733-ca2e05a3115a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2abab049-fe68-4b75-876e-e330d90deaba")
    protected ClockResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("5e5c5d1e-d9dc-4704-8ab4-4bcc311b75d3")
    public static final class MdaTypes {
        @objid ("82a527d1-634c-451d-8d5e-e1be20357b1d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1e4c4463-2f90-4df1-a438-1ca1abfe49b8")
        private static Stereotype MDAASSOCDEP;

        @objid ("48ba7925-6584-4c83-b105-356b0c9f0ead")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f698e696-d208-42c3-8a60-4bdeb8647c37")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009f4975-0ccf-11df-8525-001302895b2b");
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
