/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_vsl_variables.infrastructure.modelelement;

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
 * Proxy class to handle a {@link ModelElement} with << ExpressionContext_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1074d795-071f-4774-beb1-d71fd57083bf")
public class ExpressionContextModelElement {
    @objid ("b5b83c5c-3106-497a-a085-bcbadbb0bd97")
    public static final String STEREOTYPE_NAME = "ExpressionContext_ModelElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("005c7d4d-a63c-4438-bfcf-085d7e492a30")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ExpressionContextModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ExpressionContext_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("dd3d823e-b639-463f-9229-a5f1a7283055")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ExpressionContextModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ExpressionContext_ModelElement >> then instantiate a {@link ExpressionContextModelElement} proxy.
     * 
     * @return a {@link ExpressionContextModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("a4e9cc4c-6819-4eb3-9b66-0c92a3aee5cf")
    public static ExpressionContextModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ExpressionContextModelElement.STEREOTYPE_NAME);
        return ExpressionContextModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link ExpressionContextModelElement} proxy from a {@link ModelElement} stereotyped << ExpressionContext_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link ExpressionContextModelElement} proxy or <i>null</i>.
     */
    @objid ("d9485ced-f911-4b7e-a6df-984f2e8ecf1d")
    public static ExpressionContextModelElement instantiate(final ModelElement obj) {
        return ExpressionContextModelElement.canInstantiate(obj) ? new ExpressionContextModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ExpressionContextModelElement} proxy from a {@link ModelElement} stereotyped << ExpressionContext_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ExpressionContextModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e8c90a1e-b14c-4a38-9c62-9b39cab8a093")
    public static ExpressionContextModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ExpressionContextModelElement.canInstantiate(obj))
        	return new ExpressionContextModelElement(obj);
        else
        	throw new IllegalArgumentException("ExpressionContextModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b3fe402a-bd7a-4ae2-b0de-c19a8667ae52")
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
        ExpressionContextModelElement other = (ExpressionContextModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("e22ba910-f50e-4d0b-8e87-42345ba74b8d")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("24186af2-aa91-4755-bb79-7adeb4d1f7ba")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("65dd2489-4148-4495-b626-bf9632b7c1b5")
    protected ExpressionContextModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("71416312-33d6-42df-a37e-5c67e406ead2")
    public static final class MdaTypes {
        @objid ("b06ec2ba-24c3-437e-9d0f-4a40bd2283ab")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fa43722e-650b-4a30-8d87-604c3225717d")
        private static Stereotype MDAASSOCDEP;

        @objid ("6f79a177-627e-4e3d-aac4-00b6a12071c4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f8def3a2-d050-4f71-91ab-c679004fdab1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "037ff66d-0ccf-11df-8525-001302895b2b");
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
