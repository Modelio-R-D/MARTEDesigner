/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement;

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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaStepModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << PaResPassStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9b050f1f-3cdc-4705-9db6-46ac69ae8afe")
public class PaResPassStepModelElement extends GaStepModelElement {
    @objid ("35322e04-e578-4249-824c-72c4463879e2")
    public static final String STEREOTYPE_NAME = "PaResPassStep_ModelElement";

    @objid ("ca6028bf-5fb3-4237-847b-e294c0b77fd1")
    public static final String PARESPASSSTEP_MODELELEMENT_RESUNITS_TAGTYPE = "PaResPassStep_ModelElement_resUnits";

    @objid ("69100da4-7a94-49d4-b94f-3f622267619d")
    public static final String PARESPASSSTEP_MODELELEMENT_RESOURCE_TAGTYPE = "PaResPassStep_ModelElement_resource";

    /**
     * Tells whether a {@link PaResPassStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PaResPassStep_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("da363a2b-abaa-4445-aa6f-54af3468d81e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaResPassStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PaResPassStep_ModelElement >> then instantiate a {@link PaResPassStepModelElement} proxy.
     * 
     * @return a {@link PaResPassStepModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("16abe48f-d9b0-4cff-a777-d67b5f5a2b7a")
    public static PaResPassStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaResPassStepModelElement.STEREOTYPE_NAME);
        return PaResPassStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PaResPassStepModelElement} proxy from a {@link ModelElement} stereotyped << PaResPassStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PaResPassStepModelElement} proxy or <i>null</i>.
     */
    @objid ("25c1208f-f568-498f-9042-b7609ce185d3")
    public static PaResPassStepModelElement instantiate(final ModelElement obj) {
        return PaResPassStepModelElement.canInstantiate(obj) ? new PaResPassStepModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaResPassStepModelElement} proxy from a {@link ModelElement} stereotyped << PaResPassStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PaResPassStepModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fea66dd5-de8c-413f-8d49-e99e5f3ee5ef")
    public static PaResPassStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PaResPassStepModelElement.canInstantiate(obj))
        	return new PaResPassStepModelElement(obj);
        else
        	throw new IllegalArgumentException("PaResPassStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2de7e850-521a-4804-98e1-cb9542fea80b")
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
        PaResPassStepModelElement other = (PaResPassStepModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("f7ccc525-c43e-43a5-94f2-afef1d2d0c39")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'PaResPassStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2431cbb5-b4db-44ac-8cf4-6593970b1c14")
    public String getPaResPassStep_ModelElement_resUnits() {
        return this.elt.getTagValue(PaResPassStepModelElement.MdaTypes.PARESPASSSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaResPassStep_ModelElement_resource'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7f729029-e0f3-4f9c-ae9c-bd09d4b9f210")
    public String getPaResPassStep_ModelElement_resource() {
        return this.elt.getTagValue(PaResPassStepModelElement.MdaTypes.PARESPASSSTEP_MODELELEMENT_RESOURCE_TAGTYPE_ELT);
    }

    @objid ("e844974c-57d4-4176-8dc7-605848b5b256")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaResPassStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("27a71f58-e116-4f37-be80-bfc3b536ca5a")
    public void setPaResPassStep_ModelElement_resUnits(final String value) {
        this.elt.putTagValue(PaResPassStepModelElement.MdaTypes.PARESPASSSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaResPassStep_ModelElement_resource'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d88bddf5-8f73-40fb-babe-9c3ce006da6a")
    public void setPaResPassStep_ModelElement_resource(final String value) {
        this.elt.putTagValue(PaResPassStepModelElement.MdaTypes.PARESPASSSTEP_MODELELEMENT_RESOURCE_TAGTYPE_ELT, value);
    }

    @objid ("a9f9096f-7411-4e02-9b1a-418b1f592232")
    protected PaResPassStepModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("787c56f8-0750-4b50-aeb8-10c406e27ca2")
    public static final class MdaTypes {
        @objid ("c39fc2c5-8ce4-4eb5-b24f-d027a24842a0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6dee61a1-f64f-46a3-9f02-c144ccaea3bc")
        public static TagType PARESPASSSTEP_MODELELEMENT_RESOURCE_TAGTYPE_ELT;

        @objid ("c20336db-1097-4d29-a4bc-4b0f03fdeac4")
        public static TagType PARESPASSSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT;

        @objid ("573eb156-72c8-40e7-9856-45b9d0cc177b")
        private static Stereotype MDAASSOCDEP;

        @objid ("b23e06d6-6876-4985-83de-6f6b05d7ab1b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("73280350-7f06-4f2a-a092-a5e5e3700226")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "06480ffa-14b2-11df-9d54-0014222a9f79");
            PARESPASSSTEP_MODELELEMENT_RESOURCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "06480ffb-14b2-11df-9d54-0014222a9f79");
            PARESPASSSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "06480ffc-14b2-11df-9d54-0014222a9f79");
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
