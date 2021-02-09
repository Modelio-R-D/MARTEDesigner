/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << GaAcqStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaAcqStepModelElement extends GaStepModelElement {
    public static final String STEREOTYPE_NAME = "GaAcqStep_ModelElement";

    public static final String GAACQSTEP_MODELELEMENT_ACQRES_TAGTYPE = "GaAcqStep_ModelElement_acqRes";

    public static final String GAACQSTEP_MODELELEMENT_RESUNITS_TAGTYPE = "GaAcqStep_ModelElement_resUnits";

    /**
     * Tells whether a {@link GaAcqStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaAcqStep_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaAcqStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaAcqStep_ModelElement >> then instantiate a {@link GaAcqStepModelElement} proxy.
     * 
     * @return a {@link GaAcqStepModelElement} proxy on the created {@link ModelElement}.
     */
    public static GaAcqStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaAcqStepModelElement.STEREOTYPE_NAME);
        return GaAcqStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaAcqStepModelElement} proxy from a {@link ModelElement} stereotyped << GaAcqStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaAcqStepModelElement} proxy or <i>null</i>.
     */
    public static GaAcqStepModelElement instantiate(final ModelElement obj) {
        return GaAcqStepModelElement.canInstantiate(obj) ? new GaAcqStepModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaAcqStepModelElement} proxy from a {@link ModelElement} stereotyped << GaAcqStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link GaAcqStepModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaAcqStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaAcqStepModelElement.canInstantiate(obj))
        	return new GaAcqStepModelElement(obj);
        else
        	throw new IllegalArgumentException("GaAcqStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaAcqStepModelElement other = (GaAcqStepModelElement) obj;
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
     * Getter for string property 'GaAcqStep_ModelElement_acqRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaAcqStep_ModelElement_acqRes() {
        return this.elt.getTagValue(GaAcqStepModelElement.MdaTypes.GAACQSTEP_MODELELEMENT_ACQRES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaAcqStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaAcqStep_ModelElement_resUnits() {
        return this.elt.getTagValue(GaAcqStepModelElement.MdaTypes.GAACQSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaAcqStep_ModelElement_acqRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaAcqStep_ModelElement_acqRes(final String value) {
        this.elt.putTagValue(GaAcqStepModelElement.MdaTypes.GAACQSTEP_MODELELEMENT_ACQRES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaAcqStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaAcqStep_ModelElement_resUnits(final String value) {
        this.elt.putTagValue(GaAcqStepModelElement.MdaTypes.GAACQSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT, value);
    }

    protected GaAcqStepModelElement(final ModelElement elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GAACQSTEP_MODELELEMENT_ACQRES_TAGTYPE_ELT;

        public static TagType GAACQSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9416a01d-149e-11df-9d54-0014222a9f79");
            GAACQSTEP_MODELELEMENT_ACQRES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9416a01e-149e-11df-9d54-0014222a9f79");
            GAACQSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9416a01f-149e-11df-9d54-0014222a9f79");
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
