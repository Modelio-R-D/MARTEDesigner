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
public class SwResourceClassifier extends ResourceClassifier {
    public static final String STEREOTYPE_NAME = "SwResource_Classifier";

    public static final String SWRESOURCE_CLASSIFIER_CREATESERVICES_TAGTYPE = "SwResource_Classifier_createServices";

    public static final String SWRESOURCE_CLASSIFIER_DELETESERVICES_TAGTYPE = "SwResource_Classifier_deleteServices";

    public static final String SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_Classifier_identifierElements";

    public static final String SWRESOURCE_CLASSIFIER_INITIALIZESERVICES_TAGTYPE = "SwResource_Classifier_initializeServices";

    public static final String SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_Classifier_memorySizeFootprint";

    public static final String SWRESOURCE_CLASSIFIER_STATEELEMENTS_TAGTYPE = "SwResource_Classifier_stateElements";

    /**
     * Tells whether a {@link SwResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SwResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SwResource_Classifier >> then instantiate a {@link SwResourceClassifier} proxy.
     * 
     * @return a {@link SwResourceClassifier} proxy on the created {@link Classifier}.
     */
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
    public static SwResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SwResourceClassifier.canInstantiate(obj))
        	return new SwResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SwResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwResourceClassifier other = (SwResourceClassifier) obj;
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
     * Getter for List<String> property 'SwResource_Classifier_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Classifier_createServices() {
        return this.elt.getTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Classifier_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Classifier_deleteServices() {
        return this.elt.getTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Classifier_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Classifier_identifierElements() {
        return this.elt.getTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Classifier_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Classifier_initializeServices() {
        return this.elt.getTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_Classifier_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwResource_Classifier_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Classifier_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Classifier_stateElements() {
        return this.elt.getTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_STATEELEMENTS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_Classifier_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Classifier_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Classifier_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Classifier_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Classifier_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Classifier_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Classifier_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Classifier_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_Classifier_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Classifier_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_Classifier_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Classifier_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceClassifier.MdaTypes.SWRESOURCE_CLASSIFIER_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    protected SwResourceClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_CLASSIFIER_STATEELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        public static TagType SWRESOURCE_CLASSIFIER_CREATESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_CLASSIFIER_DELETESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_CLASSIFIER_INITIALIZESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
