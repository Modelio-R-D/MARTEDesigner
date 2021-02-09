/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << CommunicationMedia_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class CommunicationMediaClassifier extends ProcessingResourceClassifier {
    public static final String STEREOTYPE_NAME = "CommunicationMedia_Classifier";

    public static final String COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT_TAGTYPE = "CommunicationMedia_Classifier_blockT";

    public static final String COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY_TAGTYPE = "CommunicationMedia_Classifier_capacity";

    public static final String COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_Classifier_elementSize";

    public static final String COMMUNICATIONMEDIA_CLASSIFIER_PACKETT_TAGTYPE = "CommunicationMedia_Classifier_packetT";

    public static final String COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE_TAGTYPE = "CommunicationMedia_Classifier_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << CommunicationMedia_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << CommunicationMedia_Classifier >> then instantiate a {@link CommunicationMediaClassifier} proxy.
     * 
     * @return a {@link CommunicationMediaClassifier} proxy on the created {@link Classifier}.
     */
    public static CommunicationMediaClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaClassifier.STEREOTYPE_NAME);
        return CommunicationMediaClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaClassifier} proxy from a {@link Classifier} stereotyped << CommunicationMedia_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link CommunicationMediaClassifier} proxy or <i>null</i>.
     */
    public static CommunicationMediaClassifier instantiate(final Classifier obj) {
        return CommunicationMediaClassifier.canInstantiate(obj) ? new CommunicationMediaClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaClassifier} proxy from a {@link Classifier} stereotyped << CommunicationMedia_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link CommunicationMediaClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static CommunicationMediaClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (CommunicationMediaClassifier.canInstantiate(obj))
        	return new CommunicationMediaClassifier(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        CommunicationMediaClassifier other = (CommunicationMediaClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Classifier_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getCommunicationMedia_Classifier_blockT() {
        return this.elt.getTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Classifier_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getCommunicationMedia_Classifier_capacity() {
        return this.elt.getTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCommunicationMedia_Classifier_elementSize() {
        return this.elt.getTagValue(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Classifier_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getCommunicationMedia_Classifier_packetT() {
        return this.elt.getTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Classifier_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCommunicationMedia_Classifier_transmMode() {
        return this.elt.getTagValue(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Classifier_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Classifier_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Classifier_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Classifier_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Classifier_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Classifier_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Classifier_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Classifier_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationMedia_Classifier_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT, value);
    }

    protected CommunicationMediaClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_CLASSIFIER_PACKETT_TAGTYPE_ELT;

        public static TagType COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e136b5f3-0fdc-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f8da5102-0fdc-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f8da5103-0fdc-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f8da5104-0fdc-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_CLASSIFIER_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f8da5105-0fdc-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f8da5106-0fdc-11df-86ac-0014222a9f79");
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
