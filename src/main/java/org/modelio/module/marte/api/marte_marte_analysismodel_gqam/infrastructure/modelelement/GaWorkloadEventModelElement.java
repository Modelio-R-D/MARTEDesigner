/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement;

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
 * Proxy class to handle a {@link ModelElement} with << GaWorkloadEvent_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f135562a-b24c-44df-ab46-2971379bc7e4")
public class GaWorkloadEventModelElement {
    @objid ("c3a00c04-300b-4598-b996-7833dbf73f38")
    public static final String STEREOTYPE_NAME = "GaWorkloadEvent_ModelElement";

    @objid ("418a18f6-caea-49c4-8019-86325af715b1")
    public static final String GAWORKLOADEVENT_MODELELEMENT_EFFECT_TAGTYPE = "GaWorkloadEvent_ModelElement_effect";

    @objid ("d0ba9c94-b02e-4f37-b894-1cbd5a83654a")
    public static final String GAWORKLOADEVENT_MODELELEMENT_GENERATOR_TAGTYPE = "GaWorkloadEvent_ModelElement_generator";

    @objid ("a8a7a31a-933c-4b93-9e29-11c3db3ba92d")
    public static final String GAWORKLOADEVENT_MODELELEMENT_PATTERN_TAGTYPE = "GaWorkloadEvent_ModelElement_pattern";

    @objid ("5a0266b8-0b32-4c94-9d0a-971be1ef6f0a")
    public static final String GAWORKLOADEVENT_MODELELEMENT_TIMEDEVENT_TAGTYPE = "GaWorkloadEvent_ModelElement_timedEvent";

    @objid ("098ae175-e640-4c1d-b4ab-bc812a71d1da")
    public static final String GAWORKLOADEVENT_MODELELEMENT_TRACE_TAGTYPE = "GaWorkloadEvent_ModelElement_trace";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("356dbea9-f5e0-4b8c-bcdf-645f1c2750d6")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link GaWorkloadEventModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaWorkloadEvent_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("52d99684-7621-4519-8b09-96ab8d3a3a86")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaWorkloadEventModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaWorkloadEvent_ModelElement >> then instantiate a {@link GaWorkloadEventModelElement} proxy.
     * 
     * @return a {@link GaWorkloadEventModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("3efb0bc4-64b0-4408-98fd-9e928d623e75")
    public static GaWorkloadEventModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaWorkloadEventModelElement.STEREOTYPE_NAME);
        return GaWorkloadEventModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaWorkloadEventModelElement} proxy from a {@link ModelElement} stereotyped << GaWorkloadEvent_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaWorkloadEventModelElement} proxy or <i>null</i>.
     */
    @objid ("87792c16-4927-4636-980f-51ee9918ad54")
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
    @objid ("f8cd69ee-5c08-466e-810a-659e789a1745")
    public static GaWorkloadEventModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaWorkloadEventModelElement.canInstantiate(obj))
        	return new GaWorkloadEventModelElement(obj);
        else
        	throw new IllegalArgumentException("GaWorkloadEventModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("117c7611-2d72-4dba-93a8-008de2d69159")
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
    @objid ("ba6b62fa-a297-44a9-aa62-246435362671")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GaWorkloadEvent_ModelElement_effect'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c71233c5-4c72-4ace-9245-fe6f9f70f503")
    public String getGaWorkloadEvent_ModelElement_effect() {
        return this.elt.getTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_EFFECT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaWorkloadEvent_ModelElement_generator'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d999be3-a4ab-42e8-a5a8-437e28cfb4f7")
    public String getGaWorkloadEvent_ModelElement_generator() {
        return this.elt.getTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_GENERATOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaWorkloadEvent_ModelElement_pattern'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c5df42a3-adb9-41bd-a549-aaf36c41ca12")
    public String getGaWorkloadEvent_ModelElement_pattern() {
        return this.elt.getTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_PATTERN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaWorkloadEvent_ModelElement_timedEvent'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("74add851-54f4-4d5e-b7a6-b19f65bfbcc8")
    public String getGaWorkloadEvent_ModelElement_timedEvent() {
        return this.elt.getTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_TIMEDEVENT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaWorkloadEvent_ModelElement_trace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2aad115e-50ce-4ff7-816d-b8d04644dc54")
    public String getGaWorkloadEvent_ModelElement_trace() {
        return this.elt.getTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_TRACE_TAGTYPE_ELT);
    }

    @objid ("8727832c-2403-4616-b7fe-fbbdfeb4185f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaWorkloadEvent_ModelElement_effect'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("42b5cbca-3836-4eaa-826e-b49267003363")
    public void setGaWorkloadEvent_ModelElement_effect(final String value) {
        this.elt.putTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_EFFECT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaWorkloadEvent_ModelElement_generator'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("85f6037c-1572-4d58-a274-b2128e1b8c89")
    public void setGaWorkloadEvent_ModelElement_generator(final String value) {
        this.elt.putTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_GENERATOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaWorkloadEvent_ModelElement_pattern'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90461b95-741d-4946-a1a4-224dd02d5244")
    public void setGaWorkloadEvent_ModelElement_pattern(final String value) {
        this.elt.putTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_PATTERN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaWorkloadEvent_ModelElement_timedEvent'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69c000c0-d90b-46c0-8aba-643e54252b02")
    public void setGaWorkloadEvent_ModelElement_timedEvent(final String value) {
        this.elt.putTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_TIMEDEVENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaWorkloadEvent_ModelElement_trace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("68bc8da8-dade-4c70-8b09-c83e41fd2fbd")
    public void setGaWorkloadEvent_ModelElement_trace(final String value) {
        this.elt.putTagValue(GaWorkloadEventModelElement.MdaTypes.GAWORKLOADEVENT_MODELELEMENT_TRACE_TAGTYPE_ELT, value);
    }

    @objid ("b6e7e212-9e83-44f7-a846-64aeab965421")
    protected GaWorkloadEventModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("bbf6c163-356e-4620-aeaa-cfda18200eb1")
    public static final class MdaTypes {
        @objid ("e475bbd7-90ac-4592-bdb9-d296c17ffd58")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("efc22d94-8322-4879-a8e5-a5c7a2f089bc")
        public static TagType GAWORKLOADEVENT_MODELELEMENT_PATTERN_TAGTYPE_ELT;

        @objid ("589586ea-bd72-4611-8380-18089117c4d2")
        public static TagType GAWORKLOADEVENT_MODELELEMENT_GENERATOR_TAGTYPE_ELT;

        @objid ("94672f28-47bc-4ee4-9ae8-0a80a66cd423")
        public static TagType GAWORKLOADEVENT_MODELELEMENT_TRACE_TAGTYPE_ELT;

        @objid ("7533ecdb-a296-45f6-9021-a7150584844d")
        public static TagType GAWORKLOADEVENT_MODELELEMENT_EFFECT_TAGTYPE_ELT;

        @objid ("75e1951f-bcf2-42c2-8f73-fab9974587bb")
        public static TagType GAWORKLOADEVENT_MODELELEMENT_TIMEDEVENT_TAGTYPE_ELT;

        @objid ("672e4ae5-9f01-4359-96ed-afc4cf762054")
        private static Stereotype MDAASSOCDEP;

        @objid ("75ae2744-4329-4f3d-a8be-ff8ce18eec48")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("da885838-1b70-4d79-a7e5-5bce1d58d97a")
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
