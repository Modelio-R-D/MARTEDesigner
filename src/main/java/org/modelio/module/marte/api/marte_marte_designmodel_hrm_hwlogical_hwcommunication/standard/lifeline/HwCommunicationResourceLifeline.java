/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.lifeline.HwResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwCommunicationResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwCommunicationResourceLifeline extends HwResourceLifeline {
    public static final String STEREOTYPE_NAME = "HwCommunicationResource_Lifeline";

    /**
     * Tells whether a {@link HwCommunicationResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwCommunicationResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwCommunicationResource_Lifeline >> then instantiate a {@link HwCommunicationResourceLifeline} proxy.
     * 
     * @return a {@link HwCommunicationResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static HwCommunicationResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceLifeline.STEREOTYPE_NAME);
        return HwCommunicationResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceLifeline} proxy from a {@link Lifeline} stereotyped << HwCommunicationResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwCommunicationResourceLifeline} proxy or <i>null</i>.
     */
    public static HwCommunicationResourceLifeline instantiate(final Lifeline obj) {
        return HwCommunicationResourceLifeline.canInstantiate(obj) ? new HwCommunicationResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceLifeline} proxy from a {@link Lifeline} stereotyped << HwCommunicationResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwCommunicationResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwCommunicationResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwCommunicationResourceLifeline.canInstantiate(obj))
        	return new HwCommunicationResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("HwCommunicationResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        HwCommunicationResourceLifeline other = (HwCommunicationResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected HwCommunicationResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1875c34c-10ad-11df-81d9-0014222a9f79");
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
