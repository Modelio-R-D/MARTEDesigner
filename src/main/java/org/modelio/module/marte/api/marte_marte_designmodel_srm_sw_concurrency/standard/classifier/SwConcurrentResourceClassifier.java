/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("dc604ac1-bbc6-43b8-aefd-4843e94c3cea")
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Classifier";

    @objid ("c9997e00-d673-44ab-9681-c3ffa8c535a6")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Classifier_activateServices";

    @objid ("b92ad02f-3360-40c5-a111-083014eb96a9")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Classifier_activationCapacity";

    @objid ("ce690832-af71-4509-83bc-0fcc54bb406e")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Classifier_adressSpace";

    @objid ("2e62af31-8170-4e6b-8569-7284faba49eb")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Classifier_disableConcurrencyServices";

    @objid ("4a1990df-f2c3-4318-9c2a-96db9c4b7d36")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Classifier_enableConcurrencyServices";

    @objid ("83a20e51-83ba-4a0c-b29d-46d27d9fd3b5")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Classifier_entryPoints";

    @objid ("f807a2ea-551a-438a-87b1-a4a823a37733")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Classifier_heapSizeElements";

    @objid ("97af6b2d-a770-490d-9027-33696d9ddcce")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Classifier_messageResources";

    @objid ("459a1bd2-71a5-462e-b30b-0a6a8c97628e")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Classifier_mutualExclusionResources";

    @objid ("f1fd84fb-bdbd-4ca0-b9ae-1452262e20e1")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Classifier_notificationResources";

    @objid ("866c7497-83d0-4853-9d6f-92c35d354ef3")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Classifier_periodElements";

    @objid ("20c05f46-1cc7-459b-ad1b-a7e0f77ee41c")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Classifier_priorityElements";

    @objid ("784c0194-b2ed-4df5-aee4-33bae572761b")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Classifier_resumeServices";

    @objid ("fc3fc1e0-2683-4820-84c7-b8b312373b02")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Classifier_shareDataResources";

    @objid ("83cb7705-925f-4117-a075-94892303c998")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Classifier_stackSizeElements";

    @objid ("d0bc0cf9-536a-44a0-84c8-986fe3691d8c")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Classifier_suspendServices";

    @objid ("b3936dd1-75df-415b-a848-be30c4f561ac")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Classifier_terminateServices";

    @objid ("0e5beace-0a83-4dde-9366-acb6098c6dbf")
    public static final String SWCONCURRENTRESOURCE_CLASSIFIER_TYPE_TAGTYPE = "SwConcurrentResource_Classifier_type";

    /**
     * Tells whether a {@link SwConcurrentResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SwConcurrentResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b6e25cd7-d5c7-4770-b072-c705a913cbb6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SwConcurrentResource_Classifier >> then instantiate a {@link SwConcurrentResourceClassifier} proxy.
     * 
     * @return a {@link SwConcurrentResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("d3a64cf1-be9b-4176-b766-010d54cff599")
    public static SwConcurrentResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceClassifier.STEREOTYPE_NAME);
        return SwConcurrentResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceClassifier} proxy from a {@link Classifier} stereotyped << SwConcurrentResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SwConcurrentResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("539a495a-ed52-479b-91b6-26faedb7f1df")
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
    @objid ("787e07a7-f036-48b9-b624-7c13a30cc005")
    public static SwConcurrentResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SwConcurrentResourceClassifier.canInstantiate(obj))
        	return new SwConcurrentResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cb433ca2-5cb9-4c57-9350-aaa265438914")
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
    @objid ("5ddddf30-7b88-4687-b5d1-03e867e7adcc")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("79df3a79-6ef4-4f00-a786-a9d04c2bf6e6")
    public List<String> getSwConcurrentResource_Classifier_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Classifier_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("248f6b73-1968-4933-8409-6786d66d008f")
    public String getSwConcurrentResource_Classifier_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1d706f38-0889-46fd-9891-a7dc8333fc05")
    public List<String> getSwConcurrentResource_Classifier_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c3ba3cfa-c602-4242-993a-bf3d35f98a2f")
    public List<String> getSwConcurrentResource_Classifier_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("46b43db2-4df2-4245-a59d-a86b295580a5")
    public List<String> getSwConcurrentResource_Classifier_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("976d38bf-b8c6-4639-a670-5608afb9c067")
    public List<String> getSwConcurrentResource_Classifier_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9816a7aa-28a9-4280-9411-3d476da27106")
    public List<String> getSwConcurrentResource_Classifier_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("11d08828-cd70-49c3-9801-8a1d853f7f60")
    public List<String> getSwConcurrentResource_Classifier_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("17855474-3c09-4080-a74e-478ebbc785c0")
    public List<String> getSwConcurrentResource_Classifier_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("84966a5e-bea1-48d1-8983-1c5230441289")
    public List<String> getSwConcurrentResource_Classifier_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("484b9df5-f9bc-47fa-9954-c31c7625c6da")
    public List<String> getSwConcurrentResource_Classifier_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cdc50b57-5d37-4247-9ecc-625ac353a9e9")
    public List<String> getSwConcurrentResource_Classifier_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d1b5cbd9-1471-445d-853d-e77d023c3e12")
    public List<String> getSwConcurrentResource_Classifier_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bccc4b0e-229e-43d5-8fbf-b466c3ee165b")
    public List<String> getSwConcurrentResource_Classifier_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cc34be23-aecb-40b4-b319-c41aaff585be")
    public List<String> getSwConcurrentResource_Classifier_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("86e89fa6-aeeb-4fc2-9ff5-a04a8c06ffd6")
    public List<String> getSwConcurrentResource_Classifier_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Classifier_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2f0f014a-2937-4a66-9c53-a26987e66a2b")
    public List<String> getSwConcurrentResource_Classifier_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("278117e9-bc73-452e-bc63-4290c9d4f795")
    public String getSwConcurrentResource_Classifier_type() {
        return this.elt.getTagValue(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_TYPE_TAGTYPE_ELT);
    }

    @objid ("909bf128-8ff9-4e4a-9e2d-090cd28752f8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f5c57d62-645f-4e27-a570-fc402874ea0d")
    public void setSwConcurrentResource_Classifier_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Classifier_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8140cb47-edb7-430f-909f-1ff199ea271a")
    public void setSwConcurrentResource_Classifier_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3fcb2b6f-f1fe-4040-8b2a-f310747cb0d3")
    public void setSwConcurrentResource_Classifier_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5df30031-3ebd-4d30-98d1-e74ff38ba1eb")
    public void setSwConcurrentResource_Classifier_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a306253-d40b-4bc0-b303-da48d543f341")
    public void setSwConcurrentResource_Classifier_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("270b704c-47d5-4c65-8aa4-c09138057737")
    public void setSwConcurrentResource_Classifier_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5bc80e22-71d3-4a99-aa91-0d933efb44df")
    public void setSwConcurrentResource_Classifier_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dddb8f69-8e8c-45ab-ab17-80b6c0a98e6f")
    public void setSwConcurrentResource_Classifier_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("148e54f3-c725-47f8-ad3f-0a901ea0cde7")
    public void setSwConcurrentResource_Classifier_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("26a25a02-46bf-42c6-b546-a03029fa0ca4")
    public void setSwConcurrentResource_Classifier_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("91f8aea2-8918-41ce-981b-c52c9879d9c8")
    public void setSwConcurrentResource_Classifier_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("73ed634a-4655-4eab-b459-cd73b405ad88")
    public void setSwConcurrentResource_Classifier_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e010616d-05af-455b-bba2-719eeb2104ff")
    public void setSwConcurrentResource_Classifier_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("20e34ff0-4347-41aa-8f74-bac408ce90ae")
    public void setSwConcurrentResource_Classifier_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b92b70e5-9694-4cee-93bf-b2caac0f630c")
    public void setSwConcurrentResource_Classifier_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb5283d7-5907-4891-bf81-b408b909fd81")
    public void setSwConcurrentResource_Classifier_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Classifier_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8f8c1c3a-68cd-483a-8c57-fcfa7df512b2")
    public void setSwConcurrentResource_Classifier_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da782c6b-cfb6-40da-8dea-16a5bab70a02")
    public void setSwConcurrentResource_Classifier_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceClassifier.MdaTypes.SWCONCURRENTRESOURCE_CLASSIFIER_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("c43f59e3-621a-4f41-9437-159c49062ced")
    protected SwConcurrentResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("2fdf8a5f-209d-4cfa-85dc-1497e9a84832")
    public static final class MdaTypes {
        @objid ("a7f2c889-78bd-4425-93f6-51b0a3fdec57")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d65bb8d5-7579-4ae6-8fb3-49840e524af2")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_TYPE_TAGTYPE_ELT;

        @objid ("532a80d2-8a61-47b7-abae-679880cab3c4")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        @objid ("a46a9769-7bde-4763-b497-d1034d9eb966")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS_TAGTYPE_ELT;

        @objid ("6f025022-dbd8-422a-852e-51a15d11f9c5")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE_TAGTYPE_ELT;

        @objid ("b7252073-21b5-4b3a-9d11-3f22c1523542")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS_TAGTYPE_ELT;

        @objid ("5f7da130-2404-4ea5-81b3-3f20d6c16c77")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS_TAGTYPE_ELT;

        @objid ("123f1e3a-b57d-42c8-812e-60673920ad14")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("0ee7d995-4e41-4724-95bc-06dff29496f2")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES_TAGTYPE_ELT;

        @objid ("004d8879-5193-4b0f-9414-cacea90987b6")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("3ac57161-bc71-412f-be0a-ecd9a434e942")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES_TAGTYPE_ELT;

        @objid ("e1e0ec0f-c11e-498d-b9d3-b9fb6f293623")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES_TAGTYPE_ELT;

        @objid ("3e2e90f3-cb10-40d1-81ff-a0a5f05e423d")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES_TAGTYPE_ELT;

        @objid ("df1c7a73-56bd-4160-93a2-4e3cd0015039")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("9013e159-04c4-4be4-bd3a-c9966ff44a3d")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES_TAGTYPE_ELT;

        @objid ("3a69055a-734c-427d-a444-1de113d7dfd9")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES_TAGTYPE_ELT;

        @objid ("0ca7b18f-c72a-410f-ac4e-fe491da37bac")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        @objid ("a4c928d5-b266-45bf-b31e-517d0c31b4f6")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        @objid ("ed38ae98-fe93-4e6b-9bf4-63827ea94aee")
        public static TagType SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("e0e335dd-7d15-4c48-8156-03b0836f8783")
        private static Stereotype MDAASSOCDEP;

        @objid ("a0b9b803-efdf-40e9-b1ea-de7a2c47b9b4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3a9aa757-bd69-4f81-a5b7-d65590c58de2")
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
