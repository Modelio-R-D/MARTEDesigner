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
 * Proxy class to handle a {@link ModelElement} with << GaWorkloadEvent_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaWorkloadEventModelElement {
    public static final String STEREOTYPE_NAME = "GaWorkloadEvent_ModelElement";

    public static final String GAWORKLOADEVENT_MODELELEMENT_EFFECT_TAGTYPE = "GaWorkloadEvent_ModelElement_effect";

    public static final String GAWORKLOADEVENT_MODELELEMENT_GENERATOR_TAGTYPE = "GaWorkloadEvent_ModelElement_generator";

    public static final String GAWORKLOADEVENT_MODELELEMENT_PATTERN_TAGTYPE = "GaWorkloadEvent_ModelElement_pattern";

    public static final String GAWORKLOADEVENT_MODELELEMENT_TIMEDEVENT_TAGTYPE = "GaWorkloadEvent_ModelElement_timedEvent";

    public static final String GAWORKLOADEVENT_MODELELEMENT_TRACE_TAGTYPE = "GaWorkloadEvent_ModelElement_trace";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    protected final ModelElement elt;

    /**
     * Tells whether a {@link GaWorkloadEventModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaWorkloadEvent_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaWorkloadEventModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaWorkloadEvent_ModelElement >> then instantiate a {@link GaWorkloadEventModelElement} proxy.
     * 
     * @return a {@link GaWorkloadEventModelElement} proxy on the created {@link ModelElement}.
     */
    public static GaWorkloadEventModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaWorkloadEventModelElement.STEREOTYPE_NAME);
        return GaWorkloadEventModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaWorkloadEventModelElement} proxy from a {@link ModelElement} stereotyped << GaWorkloadEvent_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaWorkloadEventModelElement} proxy or <i>null</i>.
     */
    public static GaWorkloadEventModelElement instantiate(final ModelElement obj) {
        return GaWorkloadEventModelElement.canInstantiate(obj) ? new GaWorkloadEventModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaWorkloadEventModelElement} proxy from a {@link ModelElement} stereotyped << GaWorkloadEvent_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link GaWorkloadEventModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaWorkloadEventModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaWorkloadEventModelElement.canInstantiate(obj))
        	return new GaWorkloadEventModelElement(obj);
        else
        	throw new IllegalArgumentException("GaWorkloadEventModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaWorkloadEventModelElement other = (GaWorkloadEventModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GaWorkloadEvent_ModelElement_effect'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaWorkloadEvent_ModelElement_effect() {
        return this.elt.getTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_EFFECT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaWorkloadEvent_ModelElement_generator'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaWorkloadEvent_ModelElement_generator() {
        return this.elt.getTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_GENERATOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaWorkloadEvent_ModelElement_pattern'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaWorkloadEvent_ModelElement_pattern() {
        return this.elt.getTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_PATTERN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaWorkloadEvent_ModelElement_timedEvent'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaWorkloadEvent_ModelElement_timedEvent() {
        return this.elt.getTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_TIMEDEVENT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaWorkloadEvent_ModelElement_trace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaWorkloadEvent_ModelElement_trace() {
        return this.elt.getTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_TRACE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaWorkloadEvent_ModelElement_effect'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaWorkloadEvent_ModelElement_effect(final String value) {
        this.elt.putTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_EFFECT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaWorkloadEvent_ModelElement_generator'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaWorkloadEvent_ModelElement_generator(final String value) {
        this.elt.putTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_GENERATOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaWorkloadEvent_ModelElement_pattern'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaWorkloadEvent_ModelElement_pattern(final String value) {
        this.elt.putTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_PATTERN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaWorkloadEvent_ModelElement_timedEvent'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaWorkloadEvent_ModelElement_timedEvent(final String value) {
        this.elt.putTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_TIMEDEVENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaWorkloadEvent_ModelElement_trace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaWorkloadEvent_ModelElement_trace(final String value) {
        this.elt.putTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_TRACE_TAGTYPE_ELT, value);
    }

    protected GaWorkloadEventModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GAWORKLOADEVENT_MODELELEMENT_PATTERN_TAGTYPE_ELT;

        public static TagType GAWORKLOADEVENT_MODELELEMENT_GENERATOR_TAGTYPE_ELT;

        public static TagType GAWORKLOADEVENT_MODELELEMENT_TRACE_TAGTYPE_ELT;

        public static TagType GAWORKLOADEVENT_MODELELEMENT_EFFECT_TAGTYPE_ELT;

        public static TagType GAWORKLOADEVENT_MODELELEMENT_TIMEDEVENT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0288051c-0ccf-11df-8525-001302895b2b");
            GAWORKLOADEVENT_MODELELEMENT_PATTERN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "029fdc50-0ccf-11df-8525-001302895b2b");
            GAWORKLOADEVENT_MODELELEMENT_GENERATOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "029fdc51-0ccf-11df-8525-001302895b2b");
            GAWORKLOADEVENT_MODELELEMENT_TRACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "029fdc52-0ccf-11df-8525-001302895b2b");
            GAWORKLOADEVENT_MODELELEMENT_EFFECT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "029fdc53-0ccf-11df-8525-001302895b2b");
            GAWORKLOADEVENT_MODELELEMENT_TIMEDEVENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "029fdc54-0ccf-11df-8525-001302895b2b");
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
