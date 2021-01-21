/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << SwSynchronizationResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6a2679af-fe7a-43f1-ad2e-003553b04791")
public class SwSynchronizationResourceLifeline extends SwInteractionResourceLifeline {
    @objid ("96715f4c-67a9-451a-9ab8-46760b217f55")
    public static final String STEREOTYPE_NAME = "SwSynchronizationResource_Lifeline";

    /**
     * Tells whether a {@link SwSynchronizationResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwSynchronizationResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("22800bcb-171b-4960-8743-80aae2b84596")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwSynchronizationResource_Lifeline >> then instantiate a {@link SwSynchronizationResourceLifeline} proxy.
     * 
     * @return a {@link SwSynchronizationResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("0055348d-c1f2-41a9-9063-c7c30c4f5810")
    public static SwSynchronizationResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceLifeline.STEREOTYPE_NAME);
        return SwSynchronizationResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwSynchronizationResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwSynchronizationResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("e9c5debe-b435-4be8-8b9e-d1caac847c27")
    public static SwSynchronizationResourceLifeline instantiate(final Lifeline obj) {
        return SwSynchronizationResourceLifeline.canInstantiate(obj) ? new SwSynchronizationResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwSynchronizationResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SwSynchronizationResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d8c319f8-bc4d-4c64-b16b-d0ea99b3ecf9")
    public static SwSynchronizationResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwSynchronizationResourceLifeline.canInstantiate(obj))
        	return new SwSynchronizationResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwSynchronizationResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e1ae063a-7e2b-4efb-af4d-4ec93e833df2")
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
        SwSynchronizationResourceLifeline other = (SwSynchronizationResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("6068dc7a-5a7c-4a4a-9d55-2b9f0cccd0f1")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("f2a982bb-06d4-447f-9469-b21813205db6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6bdc1196-209d-4a3d-a5ce-f6c10a98e2ac")
    protected SwSynchronizationResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("6e2ad037-d588-48b7-9cfa-b23a39aaf1aa")
    public static final class MdaTypes {
        @objid ("348387fa-6fbf-4f5c-b21d-02d48956ef64")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f425094f-b314-4fa4-9219-dedad7a9b7d6")
        private static Stereotype MDAASSOCDEP;

        @objid ("ab731541-e871-4eb7-b424-cbf833be4295")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f3dab8e1-fd90-476b-8243-32e41d76c1b5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3d82f9d2-10d9-11df-81d9-0014222a9f79");
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
