/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.classifier;

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
@objid ("f6d5bc1e-8ebf-4379-beb4-086cb4329c73")
public class PaLogicalResourceClassifier extends ResourceClassifier {
    @objid ("c8fe10f7-2bdc-4f7f-86ea-5f34b239acca")
    public static final String STEREOTYPE_NAME = "PaLogicalResource_Classifier";

    @objid ("d4d0266f-07d6-469b-b71c-16c602c0ace8")
    public static final String PALOGICALRESOURCE_CLASSIFIER_POOLSIZE_TAGTYPE = "PaLogicalResource_Classifier_poolSize";

    @objid ("b9630604-6c19-4b7f-a276-15282aebe44f")
    public static final String PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT_TAGTYPE = "PaLogicalResource_Classifier_throughput";

    @objid ("55234327-b701-496f-a273-fca9b4cd70b3")
    public static final String PALOGICALRESOURCE_CLASSIFIER_UTILIZATION_TAGTYPE = "PaLogicalResource_Classifier_utilization";

    /**
     * Tells whether a {@link PaLogicalResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << PaLogicalResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7f279fdc-6f88-4e61-b455-deb6d62343e4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << PaLogicalResource_Classifier >> then instantiate a {@link PaLogicalResourceClassifier} proxy.
     * 
     * @return a {@link PaLogicalResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("99a74ac1-ae87-4918-8450-42cbf04d8774")
    public static PaLogicalResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceClassifier.STEREOTYPE_NAME);
        return PaLogicalResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceClassifier} proxy from a {@link Classifier} stereotyped << PaLogicalResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link PaLogicalResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("ed3bd025-88f7-4ac9-81ef-3f4ce005f630")
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
    @objid ("76012eb7-cc40-4830-b3a8-8df9fdb92237")
    public static PaLogicalResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (PaLogicalResourceClassifier.canInstantiate(obj))
        	return new PaLogicalResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("PaLogicalResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c6e04899-77f2-4a97-922f-68997774b18e")
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
    @objid ("cd9307d3-7da9-42bb-98cd-51c77949751d")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'PaLogicalResource_Classifier_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aea36d5e-ae4f-429e-8c64-5571b0057774")
    public String getPaLogicalResource_Classifier_poolSize() {
        return this.elt.getTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Classifier_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f5e47cec-ff93-40fe-b2c5-6f4858fe1c21")
    public String getPaLogicalResource_Classifier_throughput() {
        return this.elt.getTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Classifier_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c57b7c20-605c-4db6-a76d-51e33e657c6b")
    public String getPaLogicalResource_Classifier_utilization() {
        return this.elt.getTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("69596a28-579e-4ba1-bd9e-798a3a2be748")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaLogicalResource_Classifier_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6ad7a126-5c0f-48b4-8cbc-cea046f1f011")
    public void setPaLogicalResource_Classifier_poolSize(final String value) {
        this.elt.putTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Classifier_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("449123d6-e68a-4667-9657-d5f804810d51")
    public void setPaLogicalResource_Classifier_throughput(final String value) {
        this.elt.putTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Classifier_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7dd65e00-642c-4a83-8eaa-ee7f3a2b00f7")
    public void setPaLogicalResource_Classifier_utilization(final String value) {
        this.elt.putTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_UTILIZATION_TAGTYPE_ELT, value);
    }

    @objid ("8e25002f-1bad-4f8f-b58d-dfe4820768f4")
    protected PaLogicalResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("6303e5ce-50e6-4f6d-a11d-2748cee99dc8")
    public static final class MdaTypes {
        @objid ("a8e4a76f-6c88-4543-92e3-51b9aef7c6b7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a2cddb23-6829-461b-965e-29781ddff92d")
        public static TagType PALOGICALRESOURCE_CLASSIFIER_UTILIZATION_TAGTYPE_ELT;

        @objid ("96d72d06-b03f-4f5e-a627-a4619d9e9709")
        public static TagType PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT;

        @objid ("de5eda4e-3c14-4daf-970a-2cae1c3bba8e")
        public static TagType PALOGICALRESOURCE_CLASSIFIER_POOLSIZE_TAGTYPE_ELT;

        @objid ("a73f9050-26f6-4a26-be8f-88ee86d91597")
        private static Stereotype MDAASSOCDEP;

        @objid ("9f114b55-6dee-4808-ba13-c1fa72fad460")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("97f6b31f-f452-4392-b5bc-28b66c8d3286")
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
