/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << PaLogicalResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class PaLogicalResourceClassifier extends ResourceClassifier {
    public static final String STEREOTYPE_NAME = "PaLogicalResource_Classifier";

    public static final String PALOGICALRESOURCE_CLASSIFIER_POOLSIZE_TAGTYPE = "PaLogicalResource_Classifier_poolSize";

    public static final String PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT_TAGTYPE = "PaLogicalResource_Classifier_throughput";

    public static final String PALOGICALRESOURCE_CLASSIFIER_UTILIZATION_TAGTYPE = "PaLogicalResource_Classifier_utilization";

    /**
     * Tells whether a {@link PaLogicalResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << PaLogicalResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << PaLogicalResource_Classifier >> then instantiate a {@link PaLogicalResourceClassifier} proxy.
     * 
     * @return a {@link PaLogicalResourceClassifier} proxy on the created {@link Classifier}.
     */
    public static PaLogicalResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceClassifier.STEREOTYPE_NAME);
        return PaLogicalResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceClassifier} proxy from a {@link Classifier} stereotyped << PaLogicalResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link PaLogicalResourceClassifier} proxy or <i>null</i>.
     */
    public static PaLogicalResourceClassifier instantiate(final Classifier obj) {
        return PaLogicalResourceClassifier.canInstantiate(obj) ? new PaLogicalResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceClassifier} proxy from a {@link Classifier} stereotyped << PaLogicalResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link PaLogicalResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static PaLogicalResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (PaLogicalResourceClassifier.canInstantiate(obj))
        	return new PaLogicalResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("PaLogicalResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        PaLogicalResourceClassifier other = (PaLogicalResourceClassifier) obj;
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
     * Getter for string property 'PaLogicalResource_Classifier_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaLogicalResource_Classifier_poolSize() {
        return this.elt.getTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Classifier_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaLogicalResource_Classifier_throughput() {
        return this.elt.getTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Classifier_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaLogicalResource_Classifier_utilization() {
        return this.elt.getTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaLogicalResource_Classifier_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaLogicalResource_Classifier_poolSize(final String value) {
        this.elt.putTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Classifier_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaLogicalResource_Classifier_throughput(final String value) {
        this.elt.putTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Classifier_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaLogicalResource_Classifier_utilization(final String value) {
        this.elt.putTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_UTILIZATION_TAGTYPE_ELT, value);
    }

    protected PaLogicalResourceClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType PALOGICALRESOURCE_CLASSIFIER_UTILIZATION_TAGTYPE_ELT;

        public static TagType PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT;

        public static TagType PALOGICALRESOURCE_CLASSIFIER_POOLSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "310c5859-14b2-11df-9d54-0014222a9f79");
            PALOGICALRESOURCE_CLASSIFIER_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "310c585a-14b2-11df-9d54-0014222a9f79");
            PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "310c585c-14b2-11df-9d54-0014222a9f79");
            PALOGICALRESOURCE_CLASSIFIER_POOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "310c585b-14b2-11df-9d54-0014222a9f79");
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
