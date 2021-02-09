/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class PaResPassStepModelElement extends GaStepModelElement {
    public static final String STEREOTYPE_NAME = "PaResPassStep_ModelElement";

    public static final String PARESPASSSTEP_MODELELEMENT_RESUNITS_TAGTYPE = "PaResPassStep_ModelElement_resUnits";

    public static final String PARESPASSSTEP_MODELELEMENT_RESOURCE_TAGTYPE = "PaResPassStep_ModelElement_resource";

    /**
     * Tells whether a {@link PaResPassStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PaResPassStep_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaResPassStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PaResPassStep_ModelElement >> then instantiate a {@link PaResPassStepModelElement} proxy.
     * 
     * @return a {@link PaResPassStepModelElement} proxy on the created {@link ModelElement}.
     */
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
    public static PaResPassStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PaResPassStepModelElement.canInstantiate(obj))
        	return new PaResPassStepModelElement(obj);
        else
        	throw new IllegalArgumentException("PaResPassStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        PaResPassStepModelElement other = (PaResPassStepModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'PaResPassStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaResPassStep_ModelElement_resUnits() {
        return this.elt.getTagValue(PaResPassStepModelElement.MdaTypes.PARESPASSSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaResPassStep_ModelElement_resource'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaResPassStep_ModelElement_resource() {
        return this.elt.getTagValue(PaResPassStepModelElement.MdaTypes.PARESPASSSTEP_MODELELEMENT_RESOURCE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaResPassStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaResPassStep_ModelElement_resUnits(final String value) {
        this.elt.putTagValue(PaResPassStepModelElement.MdaTypes.PARESPASSSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaResPassStep_ModelElement_resource'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaResPassStep_ModelElement_resource(final String value) {
        this.elt.putTagValue(PaResPassStepModelElement.MdaTypes.PARESPASSSTEP_MODELELEMENT_RESOURCE_TAGTYPE_ELT, value);
    }

    protected PaResPassStepModelElement(final ModelElement elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType PARESPASSSTEP_MODELELEMENT_RESOURCE_TAGTYPE_ELT;

        public static TagType PARESPASSSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
