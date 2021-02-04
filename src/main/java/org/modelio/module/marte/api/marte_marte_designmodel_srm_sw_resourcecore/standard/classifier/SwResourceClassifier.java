/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SwResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("be21c942-02c7-40b5-9da4-32aa17bf9a4f")
public class SwResourceClassifier extends ResourceClassifier {
    @objid ("2ea30139-3f43-4ab4-bf19-89da4b812a15")
    public static final String STEREOTYPE_NAME = "SwResource_Classifier";

    @objid ("b0854fb3-7abf-43c7-8571-94008f2aae71")
    public static final String SWRESOURCE_CLASSIFIER_CREATESERVICES_TAGTYPE = "SwResource_Classifier_createServices";

    @objid ("2456a618-525c-4bdf-b1f2-e58f10afb84f")
    public static final String SWRESOURCE_CLASSIFIER_DELETESERVICES_TAGTYPE = "SwResource_Classifier_deleteServices";

    @objid ("5b129ea6-ccbb-4b97-902d-0e6ee4948778")
    public static final String SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_Classifier_identifierElements";

    @objid ("0124d0ff-8747-432e-95fb-ff51c5acf889")
    public static final String SWRESOURCE_CLASSIFIER_INITIALIZESERVICES_TAGTYPE = "SwResource_Classifier_initializeServices";

    @objid ("0f2a54c9-dad1-4c21-878f-994e417e076a")
    public static final String SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_Classifier_memorySizeFootprint";

    @objid ("c38bc596-fc41-4d9d-8df4-ebf75a35fe1c")
    public static final String SWRESOURCE_CLASSIFIER_STATEELEMENTS_TAGTYPE = "SwResource_Classifier_stateElements";

    /**
     * Tells whether a {@link SwResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SwResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("872adbfc-132d-4ff6-9992-f64cb94032aa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SwResource_Classifier >> then instantiate a {@link SwResourceClassifier} proxy.
     * 
     * @return a {@link SwResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("80e9a1e0-5db7-4951-9cb9-75e5f5552b0d")
    public static SwResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceClassifier.STEREOTYPE_NAME);
        return SwResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceClassifier} proxy from a {@link Classifier} stereotyped << SwResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SwResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("4a74b8d1-5fbf-4ec4-b37b-97e33523bd9a")
    public static SwResourceClassifier instantiate(final Classifier obj) {
        return SwResourceClassifier.canInstantiate(obj) ? new SwResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwResourceClassifier} proxy from a {@link Classifier} stereotyped << SwResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SwResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6df3a25e-c148-4468-8611-df1109849339")
    public static SwResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SwResourceClassifier.canInstantiate(obj))
        	return new SwResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SwResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9ab8cdf1-68cd-4b77-a210-093621179818")
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
        SwResourceClassifier other = (SwResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("90a0ec38-754a-471b-aed4-e47c3c4310ac")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwResource_Classifier_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("40d1c96e-abf3-41d1-8e21-3dc8fddfd047")
    public List<String> getSwResource_Classifier_createServices() {
        return this.elt.getTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Classifier_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f3cba805-183e-4d4a-8f92-47e4c0f6a81e")
    public List<String> getSwResource_Classifier_deleteServices() {
        return this.elt.getTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Classifier_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("49a581b5-f1ed-4bb8-b2c9-80fd63b1b080")
    public List<String> getSwResource_Classifier_identifierElements() {
        return this.elt.getTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Classifier_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e3cf0a39-a883-492f-9b13-6462118b2f31")
    public List<String> getSwResource_Classifier_initializeServices() {
        return this.elt.getTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_Classifier_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ab948e27-60ab-42e8-a953-1865df7018b6")
    public String getSwResource_Classifier_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Classifier_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2f027dd4-3dc7-4dd2-b5e4-943df0fc1af9")
    public List<String> getSwResource_Classifier_stateElements() {
        return this.elt.getTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_STATEELEMENTS_TAGTYPE_ELT);
    }

    @objid ("d1176207-6648-4a1b-a871-88322390f204")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_Classifier_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1656c17b-7b2b-465e-a821-1af641705528")
    public void setSwResource_Classifier_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Classifier_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("91cbac3f-01a4-46c2-830c-4e29ae380051")
    public void setSwResource_Classifier_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Classifier_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8fe48f03-46bf-4477-933b-916bff27b6c3")
    public void setSwResource_Classifier_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Classifier_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8eaddff1-04c7-46b7-94b9-c4dfe1ec78c5")
    public void setSwResource_Classifier_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_Classifier_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8d20c1a2-faf6-41d5-b090-be8a31d585ca")
    public void setSwResource_Classifier_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_Classifier_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("35883ced-6673-4712-ab1e-cedaf7e08b2b")
    public void setSwResource_Classifier_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("4b4b6c9e-a31b-477e-a4f5-5a881a04f86f")
    protected SwResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("d357fc4f-dded-4266-b943-36d5ea0dc5b0")
    public static final class MdaTypes {
        @objid ("c033a7fe-8259-472b-9b6e-c0a23fccf5f1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8bbbb150-37a9-4c1d-a8bf-b491b4133b8d")
        public static TagType SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        @objid ("213530ea-f847-4c26-858b-d78c91d9befe")
        public static TagType SWRESOURCE_CLASSIFIER_STATEELEMENTS_TAGTYPE_ELT;

        @objid ("9f0243e9-bd78-457a-bd90-74be7ec8fff6")
        public static TagType SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        @objid ("e547d96a-3f2d-4488-9598-15e6e787d7fa")
        public static TagType SWRESOURCE_CLASSIFIER_CREATESERVICES_TAGTYPE_ELT;

        @objid ("aa80625f-ff7c-4928-a8af-b0b1c3f1a932")
        public static TagType SWRESOURCE_CLASSIFIER_DELETESERVICES_TAGTYPE_ELT;

        @objid ("0961ea15-00b4-44e6-b464-1c82db474906")
        public static TagType SWRESOURCE_CLASSIFIER_INITIALIZESERVICES_TAGTYPE_ELT;

        @objid ("31e8e97f-81f1-4f35-b90f-b8f44fd3e0e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("58ca063e-fac3-44f1-92f0-500fa1f55870")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8750d689-66c9-4e28-851d-c09653322280")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3e9ae4b8-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e9ae4bd-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_CLASSIFIER_STATEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e9ae4be-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e9ae4b9-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_CLASSIFIER_CREATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e9ae4ba-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_CLASSIFIER_DELETESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e9ae4bb-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_CLASSIFIER_INITIALIZESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e9ae4bc-10c0-11df-81d9-0014222a9f79");
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
