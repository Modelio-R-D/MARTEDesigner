/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.MutualExclusionResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SaSharedResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2ea9450f-89df-474d-bd99-1c625bb5b923")
public class SaSharedResourceClassifier extends MutualExclusionResourceClassifier {
    @objid ("cabcf469-f9cc-4998-816b-85ddec49a70c")
    public static final String STEREOTYPE_NAME = "SaSharedResource_Classifier";

    @objid ("c598bdbe-60ed-4582-93c8-c3f36c6a771c")
    public static final String SASHAREDRESOURCE_CLASSIFIER_ACQUIST_TAGTYPE = "SaSharedResource_Classifier_acquisT";

    @objid ("f9cc1871-7c1f-485b-acdd-41c0d96c94ee")
    public static final String SASHAREDRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE = "SaSharedResource_Classifier_capacity";

    @objid ("94f9fb40-ee9f-4806-99e0-11c51ca06900")
    public static final String SASHAREDRESOURCE_CLASSIFIER_ISCONSUM_TAGTYPE = "SaSharedResource_Classifier_isConsum";

    @objid ("7dc95e5c-2eee-4f58-858f-f579ee5e949d")
    public static final String SASHAREDRESOURCE_CLASSIFIER_ISPREEMP_TAGTYPE = "SaSharedResource_Classifier_isPreemp";

    @objid ("7d59b1d5-336f-4ffb-ad97-b559d5077530")
    public static final String SASHAREDRESOURCE_CLASSIFIER_RELEASET_TAGTYPE = "SaSharedResource_Classifier_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SaSharedResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7ff3fc71-8589-407c-82f0-629c87fcdd9e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SaSharedResource_Classifier >> then instantiate a {@link SaSharedResourceClassifier} proxy.
     * 
     * @return a {@link SaSharedResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("9d7145e4-80bb-45f0-ae9a-f62177cfdcf4")
    public static SaSharedResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceClassifier.STEREOTYPE_NAME);
        return SaSharedResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceClassifier} proxy from a {@link Classifier} stereotyped << SaSharedResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SaSharedResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("b0c45d26-6aca-4320-893f-d37afb0e6575")
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
    @objid ("db98e592-c898-4741-ab5d-1ccebde92104")
    public static SaSharedResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SaSharedResourceClassifier.canInstantiate(obj))
        	return new SaSharedResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9b47c6d4-d791-47b0-816e-26839f8b8c6c")
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
    @objid ("4315e4b9-39b9-4c2a-823e-f5f98e9524b5")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Classifier_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cd942c01-b3fe-4453-83af-3dc3060b1395")
    public List<String> getSaSharedResource_Classifier_acquisT() {
        return this.elt.getTagValues(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Classifier_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("25ec3191-9d34-4bea-8adb-70ebd26255ed")
    public String getSaSharedResource_Classifier_capacity() {
        return this.elt.getTagValue(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Classifier_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("23896800-d860-4f35-a77e-47f0927f3c2c")
    public List<String> getSaSharedResource_Classifier_releaseT() {
        return this.elt.getTagValues(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_RELEASET_TAGTYPE_ELT);
    }

    @objid ("370fd67e-2ff4-4183-9b8a-f19bb0e93812")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Classifier_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac77d0fc-8fb0-4802-8c0f-2e9c9b9fe670")
    public boolean isSaSharedResource_Classifier_isConsum() {
        return this.elt.isTagged(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Classifier_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21212067-5c35-412a-88e1-cfd9329ab8d5")
    public boolean isSaSharedResource_Classifier_isPreemp() {
        return this.elt.isTagged(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Classifier_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("164c835e-3a48-4823-ad84-e65d02b51d64")
    public void setSaSharedResource_Classifier_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Classifier_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("124708db-d440-4eb6-a10f-410bd0b26ff0")
    public void setSaSharedResource_Classifier_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Classifier_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b6d54a6d-2291-45e0-8b57-3c9587350005")
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
    @objid ("6df1f4ca-7381-49cd-b3b5-ab1a38be6006")
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
    @objid ("3152bbd6-90c8-49e3-b15c-195d06316eb7")
    public void setSaSharedResource_Classifier_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceClassifier.MdaTypes.SASHAREDRESOURCE_CLASSIFIER_RELEASET_TAGTYPE_ELT, values);
    }

    @objid ("472e61d6-0265-4a8f-813d-845eb1bac595")
    protected SaSharedResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("992c56ed-95b0-4add-8307-23ea6d2358c0")
    public static final class MdaTypes {
        @objid ("342efaec-9188-455b-a256-224467609ef5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d0b545fe-84c9-4759-b657-c5dedb16aedc")
        public static TagType SASHAREDRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE_ELT;

        @objid ("d8064202-935e-453c-876d-3f035a14ca55")
        public static TagType SASHAREDRESOURCE_CLASSIFIER_ISPREEMP_TAGTYPE_ELT;

        @objid ("d71456fd-7b5d-498c-895e-b4b6c49d3aec")
        public static TagType SASHAREDRESOURCE_CLASSIFIER_ISCONSUM_TAGTYPE_ELT;

        @objid ("b18a9636-d002-4591-a6fc-63951d5645d5")
        public static TagType SASHAREDRESOURCE_CLASSIFIER_ACQUIST_TAGTYPE_ELT;

        @objid ("b9243ab7-f0d9-434c-931b-d0c2b1647c1c")
        public static TagType SASHAREDRESOURCE_CLASSIFIER_RELEASET_TAGTYPE_ELT;

        @objid ("99c321a7-ae7b-4d70-b0a5-5e1249d2704f")
        private static Stereotype MDAASSOCDEP;

        @objid ("363bd893-a95b-4af0-9550-bb34bf873668")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("406652e1-d37d-432e-8126-9391d5af1019")
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
