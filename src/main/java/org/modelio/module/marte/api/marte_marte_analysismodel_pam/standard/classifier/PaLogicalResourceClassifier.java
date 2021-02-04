/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("5bf36c9f-abf6-4be3-8bc1-2430b2c472d0")
    public static final String STEREOTYPE_NAME = "PaLogicalResource_Classifier";

    @objid ("9f173009-d60d-4b5e-9335-c6dc1a58d83f")
    public static final String PALOGICALRESOURCE_CLASSIFIER_POOLSIZE_TAGTYPE = "PaLogicalResource_Classifier_poolSize";

    @objid ("e45802c5-e8e9-4e1f-b190-1a5afb4c878b")
    public static final String PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT_TAGTYPE = "PaLogicalResource_Classifier_throughput";

    @objid ("d0093e27-f1d3-435b-adf8-932c9e9868af")
    public static final String PALOGICALRESOURCE_CLASSIFIER_UTILIZATION_TAGTYPE = "PaLogicalResource_Classifier_utilization";

    /**
     * Tells whether a {@link PaLogicalResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << PaLogicalResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("54e971af-efa7-4fba-8bb2-62802c7c8b73")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << PaLogicalResource_Classifier >> then instantiate a {@link PaLogicalResourceClassifier} proxy.
     * 
     * @return a {@link PaLogicalResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("c196c61e-aa40-4e1d-a167-618a2e212140")
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
    @objid ("a8a0b310-e655-4ae3-95fc-952e787ad876")
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
    @objid ("da571c82-4bdb-4f9b-9333-f62fdbec3bc3")
    public static PaLogicalResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (PaLogicalResourceClassifier.canInstantiate(obj))
        	return new PaLogicalResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("PaLogicalResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e4bc30cc-4b5a-4c72-a68e-9e5c7088a0bd")
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
    @objid ("864c0173-ca1a-4cb6-827f-f6df2bccb670")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'PaLogicalResource_Classifier_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b4fda12-caa3-4ebe-8cb0-694ba591b3e3")
    public String getPaLogicalResource_Classifier_poolSize() {
        return this.elt.getTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Classifier_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("131db2cf-038a-4b38-b26a-ffd2697923b4")
    public String getPaLogicalResource_Classifier_throughput() {
        return this.elt.getTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Classifier_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("17e76f7e-0353-41a6-943d-055f08bc8cb8")
    public String getPaLogicalResource_Classifier_utilization() {
        return this.elt.getTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("62f496f9-4f33-4334-b1d7-6628646e5b8b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaLogicalResource_Classifier_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("df86e95e-a278-4a88-b455-950cac7509c8")
    public void setPaLogicalResource_Classifier_poolSize(final String value) {
        this.elt.putTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Classifier_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dc6453fd-1fba-4adc-a5e4-0dd0316933a4")
    public void setPaLogicalResource_Classifier_throughput(final String value) {
        this.elt.putTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Classifier_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4f6263b9-5f98-4e48-ad1b-83c7f6122f44")
    public void setPaLogicalResource_Classifier_utilization(final String value) {
        this.elt.putTagValue(PaLogicalResourceClassifier.MdaTypes.PALOGICALRESOURCE_CLASSIFIER_UTILIZATION_TAGTYPE_ELT, value);
    }

    @objid ("c857bef1-81e5-4be1-be14-3ec6cf3a51de")
    protected PaLogicalResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("6303e5ce-50e6-4f6d-a11d-2748cee99dc8")
    public static final class MdaTypes {
        @objid ("a0660a70-f58a-463a-812e-0290f5ed6273")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0e8e5b48-b51f-4cb5-8300-30698e51c618")
        public static TagType PALOGICALRESOURCE_CLASSIFIER_UTILIZATION_TAGTYPE_ELT;

        @objid ("455d5ed7-cc55-4057-b0d9-89e51a0f3c8d")
        public static TagType PALOGICALRESOURCE_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT;

        @objid ("116edb13-6f99-49d0-8965-12f76e41413e")
        public static TagType PALOGICALRESOURCE_CLASSIFIER_POOLSIZE_TAGTYPE_ELT;

        @objid ("0cfa942d-609d-4571-854f-f37b7ed78b05")
        private static Stereotype MDAASSOCDEP;

        @objid ("0523a736-7b83-4c9d-8d4a-a9105c49802a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("49480fb3-f7a2-4fdd-a14a-5cff245abb9f")
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
