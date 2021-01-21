/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.lifeline.SwResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SwConcurrentResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3e25e0be-c189-4c33-bf02-0410dc5628fd")
public class SwConcurrentResourceLifeline extends SwResourceLifeline {
    @objid ("90aba002-2bd4-4de5-84e9-f3e4053395d3")
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Lifeline";

    @objid ("94530dd5-0ce9-4cc9-89e4-644e1d4f9251")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Lifeline_activateServices";

    @objid ("958b6bbc-a253-43fc-9dd6-8efcb5569e54")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Lifeline_activationCapacity";

    @objid ("550d1e50-665c-424b-9626-c087fc8c74a9")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Lifeline_adressSpace";

    @objid ("4ecfff09-67fe-464a-8ada-e784af2e83a3")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Lifeline_disableConcurrencyServices";

    @objid ("b0a30018-3f2f-481f-8a01-bdf47fd7e537")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Lifeline_enableConcurrencyServices";

    @objid ("35053510-7f8a-4f0f-b57e-2a34134fab1c")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Lifeline_entryPoints";

    @objid ("3cb1731a-dd1a-494c-a9b0-4088299f8389")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Lifeline_heapSizeElements";

    @objid ("37c52722-95f8-40b5-8615-badd4ef998d8")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Lifeline_messageResources";

    @objid ("4dd4dd2b-2791-4b02-afca-b35fa46718b6")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Lifeline_mutualExclusionResources";

    @objid ("5efcf93a-dbb1-4d9e-a897-1582a6e9a483")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Lifeline_notificationResources";

    @objid ("b372f22b-7c04-4429-8387-a49eafdc212e")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Lifeline_periodElements";

    @objid ("11d98339-a33c-4290-80a5-fa47394a9247")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Lifeline_priorityElements";

    @objid ("04b07789-5d0b-45e7-8232-25cfe6b55c40")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Lifeline_resumeServices";

    @objid ("71b2930c-0a50-44ed-9294-28448f819830")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Lifeline_shareDataResources";

    @objid ("d88e44c4-6e66-4a2a-affc-732093cc8848")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Lifeline_stackSizeElements";

    @objid ("00406263-1c3e-4dd7-8e36-a6d14fd7944c")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Lifeline_suspendServices";

    @objid ("22fc1429-5354-48d7-a384-fa36f63e7228")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Lifeline_terminateServices";

    @objid ("ea040a43-eb6b-4a07-8a5d-d5e4c8eecbf0")
    public static final String SWCONCURRENTRESOURCE_LIFELINE_TYPE_TAGTYPE = "SwConcurrentResource_Lifeline_type";

    /**
     * Tells whether a {@link SwConcurrentResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwConcurrentResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a5f22261-d9a1-4d8f-8965-5a744940125e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwConcurrentResource_Lifeline >> then instantiate a {@link SwConcurrentResourceLifeline} proxy.
     * 
     * @return a {@link SwConcurrentResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("06b85519-a329-418c-8285-37c29df97c59")
    public static SwConcurrentResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceLifeline.STEREOTYPE_NAME);
        return SwConcurrentResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwConcurrentResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwConcurrentResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("37b8ff1a-f0ba-49d4-96f0-02eef4c0a1f3")
    public static SwConcurrentResourceLifeline instantiate(final Lifeline obj) {
        return SwConcurrentResourceLifeline.canInstantiate(obj) ? new SwConcurrentResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwConcurrentResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SwConcurrentResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ce267aa8-f0da-40b8-80c5-bab68a42eac0")
    public static SwConcurrentResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwConcurrentResourceLifeline.canInstantiate(obj))
        	return new SwConcurrentResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3d67bc2f-4ed7-4f69-bb8a-b34bc6bfdc03")
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
        SwConcurrentResourceLifeline other = (SwConcurrentResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("c5f8a9cc-6d41-43fa-a6c1-8046cd6710e2")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("302274ba-4a87-46c7-94e7-34a122572ed8")
    public List<String> getSwConcurrentResource_Lifeline_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Lifeline_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("487d7779-f5a3-42e6-9014-2f4244119213")
    public String getSwConcurrentResource_Lifeline_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("82ac0ff4-12df-4dcb-8c02-3de9ea98e8ca")
    public List<String> getSwConcurrentResource_Lifeline_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("afc86614-b843-46fe-b86c-988959a6e887")
    public List<String> getSwConcurrentResource_Lifeline_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8b24bcf8-d220-44d0-b947-7ba17050c05f")
    public List<String> getSwConcurrentResource_Lifeline_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b1e0ed00-16a3-460b-a976-7d15f24f7ac4")
    public List<String> getSwConcurrentResource_Lifeline_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6efe5fab-7b0f-4c80-af44-f97c0f7a1776")
    public List<String> getSwConcurrentResource_Lifeline_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2f1ccce0-0797-4666-9973-6609e725178b")
    public List<String> getSwConcurrentResource_Lifeline_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c3901119-8862-4602-8d01-d826c59ae750")
    public List<String> getSwConcurrentResource_Lifeline_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d141f155-1420-44b1-8463-4a64cde2af26")
    public List<String> getSwConcurrentResource_Lifeline_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("855e58a2-a7f7-4d40-8c75-918b8416e5b4")
    public List<String> getSwConcurrentResource_Lifeline_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("36bdee2b-a4cd-4487-90fd-70491e2c3f0a")
    public List<String> getSwConcurrentResource_Lifeline_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("02d0fece-f4b4-4c4e-9caa-416a29e702ef")
    public List<String> getSwConcurrentResource_Lifeline_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("838ab8b3-5d30-4946-9e77-dbb4bb902d3f")
    public List<String> getSwConcurrentResource_Lifeline_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("68173c30-4dea-41d6-abd6-0647a6c4667f")
    public List<String> getSwConcurrentResource_Lifeline_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("93176b25-d432-4c86-91b7-68d58853f60b")
    public List<String> getSwConcurrentResource_Lifeline_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("eddd69e8-92a8-4a3a-91f9-98370668ea58")
    public List<String> getSwConcurrentResource_Lifeline_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Lifeline_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("89739766-ba90-41dd-ba3b-a6311ecbd58b")
    public String getSwConcurrentResource_Lifeline_type() {
        return this.elt.getTagValue(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_TYPE_TAGTYPE_ELT);
    }

    @objid ("17ae262d-3095-465b-98da-d1ea14f4b09e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d5475ca3-7121-4935-8155-d00f570e4d6e")
    public void setSwConcurrentResource_Lifeline_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Lifeline_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f20a238b-1eb7-470f-a381-66011cca33f2")
    public void setSwConcurrentResource_Lifeline_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("72ed7168-9b8b-4e6d-ab09-6e5fe74facb8")
    public void setSwConcurrentResource_Lifeline_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d67a7ac5-63f7-46af-aad3-6c1c6c688dea")
    public void setSwConcurrentResource_Lifeline_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c5ce7b4c-a3ba-4f29-81bb-e25167e03cb6")
    public void setSwConcurrentResource_Lifeline_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4ea9fee4-c764-4726-acd4-6b4a3b62abe1")
    public void setSwConcurrentResource_Lifeline_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("474b0bf5-a586-4867-8bcf-3c1e7fe7fb7f")
    public void setSwConcurrentResource_Lifeline_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0156bc4d-3aa9-4c88-a1db-7bf41444e013")
    public void setSwConcurrentResource_Lifeline_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d90356c6-7824-4f68-9a4a-266727e55c0a")
    public void setSwConcurrentResource_Lifeline_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b50f3884-04a3-40e7-84dc-02e531e1b250")
    public void setSwConcurrentResource_Lifeline_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("527cd6f0-f382-41ff-bfc2-574342ef0df8")
    public void setSwConcurrentResource_Lifeline_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("06176389-22cc-49bd-8847-5b926f7434f8")
    public void setSwConcurrentResource_Lifeline_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c09275d1-fdfe-41b7-8fb1-4d31ee33f62f")
    public void setSwConcurrentResource_Lifeline_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1227873-5df6-4824-8b4e-166cf34eefd6")
    public void setSwConcurrentResource_Lifeline_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("197045fa-e6c2-44e0-95bb-de2445a838af")
    public void setSwConcurrentResource_Lifeline_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("88152633-7f05-48c4-8104-f43e902d99ed")
    public void setSwConcurrentResource_Lifeline_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d85bdac6-3f76-47d8-985d-aaa4becb2366")
    public void setSwConcurrentResource_Lifeline_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Lifeline_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b92a880a-fb16-4159-a273-528de22412d0")
    public void setSwConcurrentResource_Lifeline_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("14ce0d30-617c-478f-95c3-5532255c4f95")
    protected SwConcurrentResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("ba7eb8db-5cc8-4a69-8f0d-edca9987af5f")
    public static final class MdaTypes {
        @objid ("f87321b6-e7ba-4395-ba74-713a10824a7c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7b39a8ac-d05f-4251-afdf-4b2c3f04d139")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_TYPE_TAGTYPE_ELT;

        @objid ("afcf2182-0400-49d2-9f39-6950e4baba1b")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        @objid ("73e23008-d52f-440c-9587-0570959a0152")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_ENTRYPOINTS_TAGTYPE_ELT;

        @objid ("0adf5c8a-eb7a-4b62-8147-982ed9a9f3a4")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_ADRESSSPACE_TAGTYPE_ELT;

        @objid ("82ed4430-55bf-48b0-8876-3232687b5e4f")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_PERIODELEMENTS_TAGTYPE_ELT;

        @objid ("59041d5f-1405-4eca-9337-af6e92eb8879")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_PRIORITYELEMENTS_TAGTYPE_ELT;

        @objid ("d0396da1-24d8-48fa-9220-775844c2dc93")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_STACKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("a27c9efd-db7b-475b-b62a-11eb7f869798")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_ACTIVATESERVICES_TAGTYPE_ELT;

        @objid ("f6178671-32f7-4a02-aaf5-465a9b68837b")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("749045b1-ce35-4fdc-b967-e0568dade0c8")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_RESUMESERVICES_TAGTYPE_ELT;

        @objid ("82ed838f-1f66-400e-95ba-043c895ccabd")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_SUSPENDSERVICES_TAGTYPE_ELT;

        @objid ("22bf7098-c023-4a3b-b401-e4b20ea71fbe")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_TERMINATESERVICES_TAGTYPE_ELT;

        @objid ("c1750b36-814b-4e73-84b6-e7defbeb2aab")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("66fb0852-8ddf-4056-ac11-2d8ffbb27cf2")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_SHAREDATARESOURCES_TAGTYPE_ELT;

        @objid ("d1776f2c-c4bb-40df-ad12-366cb519488b")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_MESSAGERESOURCES_TAGTYPE_ELT;

        @objid ("cafcef61-8ce5-4e97-8097-c2d0b4773688")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        @objid ("1e50c854-41e2-41e9-be6c-13f07712065d")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        @objid ("a220d16b-9549-4bc9-b779-359571efbc81")
        public static TagType SWCONCURRENTRESOURCE_LIFELINE_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("dc94cd70-a980-4d80-a8c9-9f2b4ba045db")
        private static Stereotype MDAASSOCDEP;

        @objid ("b36e019a-4b85-4db8-9525-bb22eb8ae942")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a4466d1e-a209-4ffa-9413-ccf7048ff8c7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "87de8379-10d0-11df-81d9-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a09-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_ACTIVATIONCAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a0a-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_ENTRYPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a0b-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_ADRESSSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a0c-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_PERIODELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a0d-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_PRIORITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a0e-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_STACKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a0f-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_ACTIVATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a10-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a11-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_RESUMESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a12-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_SUSPENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a13-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_TERMINATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a14-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a15-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_SHAREDATARESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a16-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_MESSAGERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a17-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a18-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_NOTIFICATIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a19-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LIFELINE_HEAPSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cdc06a1a-172b-11df-b92a-0014222a9f79");
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
