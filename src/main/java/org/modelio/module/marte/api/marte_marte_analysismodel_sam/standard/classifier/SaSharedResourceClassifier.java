/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.MutualExclusionResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SaSharedResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaSharedResourceClassifier extends MutualExclusionResourceClassifier {
    public static final String STEREOTYPE_NAME = "SaSharedResource_Classifier";

    public static final String SASHAREDRESOURCE_CLASSIFIER_ACQUIST_TAGTYPE = "SaSharedResource_Classifier_acquisT";

    public static final String SASHAREDRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE = "SaSharedResource_Classifier_capacity";

    public static final String SASHAREDRESOURCE_CLASSIFIER_ISCONSUM_TAGTYPE = "SaSharedResource_Classifier_isConsum";

    public static final String SASHAREDRESOURCE_CLASSIFIER_ISPREEMP_TAGTYPE = "SaSharedResource_Classifier_isPreemp";

    public static final String SASHAREDRESOURCE_CLASSIFIER_RELEASET_TAGTYPE = "SaSharedResource_Classifier_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SaSharedResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SaSharedResource_Classifier >> then instantiate a {@link SaSharedResourceClassifier} proxy.
     * 
     * @return a {@link SaSharedResourceClassifier} proxy on the created {@link Classifier}.
     */
    public static SaSharedResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceClassifier.STEREOTYPE_NAME);
        return SaSharedResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceClassifier} proxy from a {@link Classifier} stereotyped << SaSharedResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SaSharedResourceClassifier} proxy or <i>null</i>.
     */
    public static SaSharedResourceClassifier instantiate(final Classifier obj) {
        return SaSharedResourceClassifier.canInstantiate(obj) ? new SaSharedResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceClassifier} proxy from a {@link Classifier} stereotyped << SaSharedResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SaSharedResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaSharedResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SaSharedResourceClassifier.canInstantiate(obj))
        	return new SaSharedResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaSharedResourceClassifier other = (SaSharedResourceClassifier) obj;
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
     * Getter for List<String> property 'SaSharedResource_Classifier_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_Classifier_acquisT() {
        return this.elt.getTagValues(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Classifier_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaSharedResource_Classifier_capacity() {
        return this.elt.getTagValue(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Classifier_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_Classifier_releaseT() {
        return this.elt.getTagValues(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_RELEASET_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Classifier_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_Classifier_isConsum() {
        return this.elt.isTagged(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Classifier_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_Classifier_isPreemp() {
        return this.elt.isTagged(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Classifier_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Classifier_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Classifier_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Classifier_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Classifier_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Classifier_isConsum(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_ISCONSUM_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Classifier_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Classifier_isPreemp(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_ISPREEMP_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Classifier_releaseT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Classifier_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_RELEASET_TAGTYPE_ELT, values);
    }

    protected SaSharedResourceClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SASHAREDRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_CLASSIFIER_ISPREEMP_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_CLASSIFIER_ISCONSUM_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_CLASSIFIER_ACQUIST_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_CLASSIFIER_RELEASET_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7850ad1d-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7850ad20-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_CLASSIFIER_ISPREEMP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7850ad21-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_CLASSIFIER_ISCONSUM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7850ad22-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_CLASSIFIER_ACQUIST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7850ad23-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_CLASSIFIER_RELEASET_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7850ad1e-14ad-11df-9d54-0014222a9f79");
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
