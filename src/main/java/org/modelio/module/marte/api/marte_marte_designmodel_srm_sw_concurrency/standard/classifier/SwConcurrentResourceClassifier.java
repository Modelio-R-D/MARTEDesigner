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
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.classifier.SwResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SwConcurrentResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("78fc3b80-24fa-454a-b6cf-2b9c70515a39")
public class SwConcurrentResourceClassifier extends SwResourceClassifier {
    @objid ("7e1eec20-e5cf-417d-8695-6dbe146a1ffb")
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Classifier";

    @objid ("c8607de9-2e23-41de-b31d-9fe170f66e0c")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Classifier_activateServices";

    @objid ("552e29ea-891b-4263-8b40-d41b45d7aeb4")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Classifier_activationCapacity";

    @objid ("978b1b82-644c-4152-b700-3d68fae51044")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Classifier_adressSpace";

    @objid ("caf4cc62-5a4d-47ee-99c3-9e5aac0ba0cc")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Classifier_disableConcurrencyServices";

    @objid ("84952ed4-49e2-420d-bc77-778580be8048")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Classifier_enableConcurrencyServices";

    @objid ("4be7903e-cc8f-46d1-a804-dcdacbd93ee8")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Classifier_entryPoints";

    @objid ("2667ceb9-debe-4fe1-932d-303dd2736bcc")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Classifier_heapSizeElements";

    @objid ("56e26be7-cce4-471e-8210-889f97d26d58")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Classifier_messageResources";

    @objid ("75dd3714-da39-4ed6-9565-7deb153312e5")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Classifier_mutualExclusionResources";

    @objid ("126ed6ad-9918-4a7f-846b-cf2ab3390a35")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Classifier_notificationResources";

    @objid ("7bcadc6d-7e5b-4411-84b9-33950cfba785")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Classifier_periodElements";

    @objid ("80ec448e-f5f4-44a0-8382-17578a0cedc2")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Classifier_priorityElements";

    @objid ("6ee44006-4131-4f00-bbc5-47f1448f0425")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Classifier_resumeServices";

    @objid ("d5674da5-57dd-46e3-966b-69e90e6bb797")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Classifier_shareDataResources";

    @objid ("e84c38d4-2a46-4617-a41d-cbd55aeeb731")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Classifier_stackSizeElements";

    @objid ("09d44fd8-dca3-4712-82b1-2d86d525f3ce")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Classifier_suspendServices";

    @objid ("22369bd6-1efa-43ca-b422-8515a0adb0ab")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Classifier_terminateServices";

    @objid ("3eef4e62-e40a-4aad-b44f-eb78b2d70a83")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_TYPE_TAGTYPE = "SwConcurrentResource_Classifier_type";

    /**
     * Tells whether a {@link SwConcurrentResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SwConcurrentResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d11a0164-2906-4cf6-8454-7ed0df7044fc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SwConcurrentResource_Classifier >> then instantiate a {@link SwConcurrentResourceClassifier} proxy.
     * 
     * @return a {@link SwConcurrentResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("1defdd25-72d7-408e-9fe6-7f4ad0cb9b95")
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
    @objid ("1b069cb7-0f99-40a1-b842-1a0ab89ce43d")
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
    @objid ("a67e96e9-c213-447f-9aba-9d125291acf1")
    public static SwConcurrentResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SwConcurrentResourceClassifier.canInstantiate(obj))
        	return new SwConcurrentResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d6c1151b-2de1-4e05-871e-9bbd59dba44d")
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
    @objid ("2bd2bad0-aca5-47da-a70d-ef7a2fca531b")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1fd66d22-98c4-42e4-9629-52d895c0164c")
    public List<String> getSwConcurrentResource_Classifier_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Classifier_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fac3bea3-4c60-423e-be02-07c0efaba845")
    public String getSwConcurrentResource_Classifier_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f496f9ec-d7fb-4bf0-a55e-df48ebb86ea2")
    public List<String> getSwConcurrentResource_Classifier_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("47f2b69d-6006-4bf2-8d9e-47f8c34c2ee5")
    public List<String> getSwConcurrentResource_Classifier_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("86d352ff-5b67-4b3b-8da3-871922799bca")
    public List<String> getSwConcurrentResource_Classifier_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5a27996a-c46f-47fc-b871-e3b63f8ab1a3")
    public List<String> getSwConcurrentResource_Classifier_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5c241c2f-a895-4186-9a6b-b20c2c55e706")
    public List<String> getSwConcurrentResource_Classifier_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cde216db-90d3-49ec-b780-02b30d2012dd")
    public List<String> getSwConcurrentResource_Classifier_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("84ec5364-7bba-4776-a5bf-8908dfea1750")
    public List<String> getSwConcurrentResource_Classifier_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("51027054-ab2e-4070-a439-54e1be943148")
    public List<String> getSwConcurrentResource_Classifier_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3ee23673-9f7a-4901-bec1-fccd61f617e7")
    public List<String> getSwConcurrentResource_Classifier_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("60dbe34f-d54c-41bf-a982-ff093f22cdf6")
    public List<String> getSwConcurrentResource_Classifier_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0a3cd732-1e6a-451b-87be-8a79b9d24bf8")
    public List<String> getSwConcurrentResource_Classifier_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9255e46c-e013-48fa-b4ff-73ac82081f73")
    public List<String> getSwConcurrentResource_Classifier_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2c5c7657-0d0f-4dbf-b11a-15a9574eee7a")
    public List<String> getSwConcurrentResource_Classifier_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("541e6f3d-e807-4d2c-b764-64185d9588f8")
    public List<String> getSwConcurrentResource_Classifier_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a2894187-8ddd-4658-b1f9-adb363518e96")
    public List<String> getSwConcurrentResource_Classifier_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a779094a-3591-498b-b175-d15ae39943d4")
    public String getSwConcurrentResource_Classifier_type() {
        return this.elt.getTagValue(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_TYPE_TAGTYPE_ELT);
    }

    @objid ("934a5b7e-c97a-4037-bb57-62d2565e528b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1c0942f-7cc6-456c-91ca-38220cda3684")
    public void setSwConcurrentResource_Classifier_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Classifier_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6897ec8-c8c4-493e-b25d-d0c76fd6bd93")
    public void setSwConcurrentResource_Classifier_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("787b8413-aaf3-4fd7-ace7-4b64f372d0a7")
    public void setSwConcurrentResource_Classifier_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ccbb9ac5-1169-4de5-9738-0d173b2b8ef8")
    public void setSwConcurrentResource_Classifier_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("026fa5fc-5ca1-436d-80b2-14bb213633e4")
    public void setSwConcurrentResource_Classifier_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a5be3c2c-01d3-4d57-8edb-92fc03eba606")
    public void setSwConcurrentResource_Classifier_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bc595d1a-7987-4804-8fe2-4cca2edbb86f")
    public void setSwConcurrentResource_Classifier_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d5361aa-997b-4aa1-a702-2887c177acb7")
    public void setSwConcurrentResource_Classifier_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eed03009-cad7-408e-aaaf-c49cc19b5618")
    public void setSwConcurrentResource_Classifier_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8187bcb-dad6-48f5-86f8-69b5cb991ced")
    public void setSwConcurrentResource_Classifier_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5038f27f-c7af-4b90-9bc9-63202a4f9c38")
    public void setSwConcurrentResource_Classifier_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1c6c4704-9068-4d4d-a908-e7c96126e273")
    public void setSwConcurrentResource_Classifier_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5dd1c3e6-e44f-45fc-bea5-332d8a8e239e")
    public void setSwConcurrentResource_Classifier_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("99582167-0a2e-45de-9720-ab4d648d7e7c")
    public void setSwConcurrentResource_Classifier_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("603dd130-ac43-48b8-8e8d-6921f2039245")
    public void setSwConcurrentResource_Classifier_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("93d0112b-6155-45e9-832e-a431d6859ae0")
    public void setSwConcurrentResource_Classifier_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("67b19893-f825-4399-bee5-f13f7ac17611")
    public void setSwConcurrentResource_Classifier_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e70fcc39-96d3-484d-933c-03962a27a135")
    public void setSwConcurrentResource_Classifier_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("6d0115b2-43f9-4e52-a4c1-f672161a6fa6")
    protected SwConcurrentResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("2fdf8a5f-209d-4cfa-85dc-1497e9a84832")
    public static final class MdaTypes {
        @objid ("35785fca-38f6-4b52-be8b-5e84001c2492")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("efe43103-9d63-459a-bed7-2fcf1527bc55")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_TYPE_TAGTYPE_ELT;

        @objid ("3b9f8b8e-7c82-4fb6-a18c-bc222b86a3b8")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        @objid ("27511a23-1023-4050-a0f6-5b0a0e591d4b")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS_TAGTYPE_ELT;

        @objid ("c97363f8-105f-47a6-8185-d9b6babbf6c6")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE_TAGTYPE_ELT;

        @objid ("bf1d01f7-b5cd-47c9-ac80-dd342e3d4cb3")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS_TAGTYPE_ELT;

        @objid ("d4cffaac-6a9d-4846-bd49-2859bf6e4dd0")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS_TAGTYPE_ELT;

        @objid ("95fda4b8-5b85-4043-95a7-c18c0e975180")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("6809e04f-1928-4dcc-bb57-9f64219bf960")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES_TAGTYPE_ELT;

        @objid ("1023aeb4-c93a-40db-8d44-dce7a936b144")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("a4ce9a8e-43a5-4551-81ac-9fcf95c56b0b")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES_TAGTYPE_ELT;

        @objid ("35b67255-5804-45ce-a288-cc601ad9680f")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES_TAGTYPE_ELT;

        @objid ("37bd29c8-2044-4a93-a10e-61ecfb985e84")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES_TAGTYPE_ELT;

        @objid ("6e761c33-5d76-4ec6-8ddb-81d9e950accc")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("022f5b26-5dda-4fc9-a22f-af2963c19a35")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES_TAGTYPE_ELT;

        @objid ("9b91e998-b76d-44b8-a4fc-15101b1b2df7")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES_TAGTYPE_ELT;

        @objid ("73d83b84-c5f5-46f7-b754-7afda9c6a107")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        @objid ("d7a6288c-1185-4aab-ae54-d30145ef5d78")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        @objid ("eb55a0fa-9d5b-4fb1-aaac-449c068b77b9")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("65ddb0e0-d65b-4d06-be97-34a920445044")
        private static Stereotype MDAASSOCDEP;

        @objid ("5f25f2f0-fe8a-426f-b8da-b4d8bfae9c2d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ff726bd5-539a-433f-9e16-1dfa5b0c021f")
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
