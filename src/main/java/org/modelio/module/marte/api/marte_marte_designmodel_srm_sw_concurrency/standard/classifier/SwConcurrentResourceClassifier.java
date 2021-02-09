/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.classifier.SwResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SwConcurrentResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwConcurrentResourceClassifier extends SwResourceClassifier {
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Classifier";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Classifier_activateServices";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Classifier_activationCapacity";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Classifier_adressSpace";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Classifier_disableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Classifier_enableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Classifier_entryPoints";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Classifier_heapSizeElements";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Classifier_messageResources";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Classifier_mutualExclusionResources";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Classifier_notificationResources";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Classifier_periodElements";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Classifier_priorityElements";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Classifier_resumeServices";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Classifier_shareDataResources";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Classifier_stackSizeElements";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Classifier_suspendServices";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Classifier_terminateServices";

    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_TYPE_TAGTYPE = "SwConcurrentResource_Classifier_type";

    /**
     * Tells whether a {@link SwConcurrentResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SwConcurrentResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SwConcurrentResource_Classifier >> then instantiate a {@link SwConcurrentResourceClassifier} proxy.
     * 
     * @return a {@link SwConcurrentResourceClassifier} proxy on the created {@link Classifier}.
     */
    public static SwConcurrentResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceClassifier.STEREOTYPE_NAME);
        return SwConcurrentResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceClassifier} proxy from a {@link Classifier} stereotyped << SwConcurrentResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SwConcurrentResourceClassifier} proxy or <i>null</i>.
     */
    public static SwConcurrentResourceClassifier instantiate(final Classifier obj) {
        return SwConcurrentResourceClassifier.canInstantiate(obj) ? new SwConcurrentResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceClassifier} proxy from a {@link Classifier} stereotyped << SwConcurrentResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SwConcurrentResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwConcurrentResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SwConcurrentResourceClassifier.canInstantiate(obj))
        	return new SwConcurrentResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwConcurrentResourceClassifier other = (SwConcurrentResourceClassifier) obj;
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
     * Getter for List<String> property 'SwConcurrentResource_Classifier_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Classifier_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_Classifier_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Classifier_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_Classifier_type() {
        return this.elt.getTagValue(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Classifier_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Classifier_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_TYPE_TAGTYPE_ELT, value);
    }

    protected SwConcurrentResourceClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_TYPE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8804a949-10d0-11df-81d9-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccd9252d-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccd9252e-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccd9252f-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccd92530-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccdb8789-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccdb878a-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccdb878b-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccdb878c-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccdb878d-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccdb878e-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccdb878f-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccdb8790-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccdb8791-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccdb8792-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccdb8793-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccdb8794-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccdb8795-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ccdb8796-172b-11df-b92a-0014222a9f79");
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
