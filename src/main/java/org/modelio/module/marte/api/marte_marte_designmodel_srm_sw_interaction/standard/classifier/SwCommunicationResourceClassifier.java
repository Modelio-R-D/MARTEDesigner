/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SwCommunicationResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwCommunicationResourceClassifier extends SwInteractionResourceClassifier {
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Classifier";

    public static final String SWCOMMUNICATIONRESOURCE_CLASSIFIER_BLOCKT_TAGTYPE = "SwCommunicationResource_Classifier_blockT";

    public static final String SWCOMMUNICATIONRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE = "SwCommunicationResource_Classifier_capacity";

    public static final String SWCOMMUNICATIONRESOURCE_CLASSIFIER_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Classifier_elementSize";

    public static final String SWCOMMUNICATIONRESOURCE_CLASSIFIER_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Classifier_mainScheduler";

    public static final String SWCOMMUNICATIONRESOURCE_CLASSIFIER_PACKETT_TAGTYPE = "SwCommunicationResource_Classifier_packetT";

    public static final String SWCOMMUNICATIONRESOURCE_CLASSIFIER_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Classifier_speedFactor";

    public static final String SWCOMMUNICATIONRESOURCE_CLASSIFIER_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Classifier_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SwCommunicationResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SwCommunicationResource_Classifier >> then instantiate a {@link SwCommunicationResourceClassifier} proxy.
     * 
     * @return a {@link SwCommunicationResourceClassifier} proxy on the created {@link Classifier}.
     */
    public static SwCommunicationResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceClassifier.STEREOTYPE_NAME);
        return SwCommunicationResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceClassifier} proxy from a {@link Classifier} stereotyped << SwCommunicationResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SwCommunicationResourceClassifier} proxy or <i>null</i>.
     */
    public static SwCommunicationResourceClassifier instantiate(final Classifier obj) {
        return SwCommunicationResourceClassifier.canInstantiate(obj) ? new SwCommunicationResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceClassifier} proxy from a {@link Classifier} stereotyped << SwCommunicationResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SwCommunicationResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwCommunicationResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SwCommunicationResourceClassifier.canInstantiate(obj))
        	return new SwCommunicationResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwCommunicationResourceClassifier other = (SwCommunicationResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Classifier_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Classifier_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Classifier_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Classifier_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Classifier_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Classifier_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Classifier_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Classifier_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwCommunicationResource_Classifier_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Classifier_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Classifier_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Classifier_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwCommunicationResource_Classifier_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Classifier_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Classifier_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Classifier_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Classifier_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Classifier_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Classifier_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Classifier_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Classifier_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Classifier_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Classifier_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Classifier_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Classifier_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwCommunicationResource_Classifier_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT, value);
    }

    protected SwCommunicationResourceClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_CLASSIFIER_BLOCKT_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_CLASSIFIER_PACKETT_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT;

        public static TagType SWCOMMUNICATIONRESOURCE_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "59980f9a-10d8-11df-81d9-0014222a9f79");
            SWCOMMUNICATIONRESOURCE_CLASSIFIER_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "86cac50c-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_CLASSIFIER_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "86cac50b-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "86cac50a-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "86cac509-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "86cac508-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b1ab965e-97f8-11e0-a4c3-0027103f347c");
            SWCOMMUNICATIONRESOURCE_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a98ac6ba-60ca-11e3-a828-0027103f347d");
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
