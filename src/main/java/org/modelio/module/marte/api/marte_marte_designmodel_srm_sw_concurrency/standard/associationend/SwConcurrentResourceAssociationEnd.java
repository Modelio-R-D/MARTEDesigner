/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.associationend.SwResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SwConcurrentResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("141c996f-ff96-4775-9c39-1f63ca978233")
public class SwConcurrentResourceAssociationEnd extends SwResourceAssociationEnd {
    @objid ("1f802024-4def-4a6b-9e32-80f1fa5d5705")
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_AssociationEnd";

    @objid ("97a84c5e-a6c8-481b-9db0-6af942b70037")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_AssociationEnd_activateServices";

    @objid ("07e7209c-e48a-4e3f-b19d-9befc8be97bb")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_AssociationEnd_activationCapacity";

    @objid ("df238e54-c00a-423c-ab4c-a22f22969ad8")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_AssociationEnd_adressSpace";

    @objid ("77a8907d-8cea-4b94-8435-6cbc8bff00e5")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_AssociationEnd_disableConcurrencyServices";

    @objid ("5d8c8089-e800-47ef-ad1e-dd586971d673")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_AssociationEnd_enableConcurrencyServices";

    @objid ("bd12a081-4455-405f-af9a-34582bc38e01")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_AssociationEnd_entryPoints";

    @objid ("e79faff2-4b61-4901-ac46-475555883364")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_AssociationEnd_heapSizeElements";

    @objid ("00a0dc2b-151c-42b1-b60b-07a6f77b4749")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_AssociationEnd_messageResources";

    @objid ("14058734-1f98-4b2b-aba8-43fac17a4e31")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_AssociationEnd_mutualExclusionResources";

    @objid ("b5280039-abda-4d5a-8ade-9219ce88c49f")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_AssociationEnd_notificationResources";

    @objid ("c5f90fca-dd38-4548-9c77-efdd08148ea3")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_AssociationEnd_periodElements";

    @objid ("d693f5fb-f780-493c-b8dd-f023f7556c3d")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_AssociationEnd_priorityElements";

    @objid ("89af2c28-501f-43ba-9eab-04d01d77be25")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_AssociationEnd_resumeServices";

    @objid ("9d191d96-dba2-4d72-bcc8-84093e22f264")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_AssociationEnd_shareDataResources";

    @objid ("6744cdf1-e474-486e-b19b-c2dd02002a48")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_AssociationEnd_stackSizeElements";

    @objid ("9f4253d8-4d73-4008-99bd-f00c1cabb9e4")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_AssociationEnd_suspendServices";

    @objid ("b6ee12d3-d783-46f0-998d-cb15d906d66d")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_AssociationEnd_terminateServices";

    @objid ("4e4bbac8-e57b-4597-aeb4-951a43f4f043")
    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_TYPE_TAGTYPE = "SwConcurrentResource_AssociationEnd_type";

    /**
     * Tells whether a {@link SwConcurrentResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwConcurrentResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("21f50dae-f226-4c9d-aa15-8a075f809d59")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwConcurrentResource_AssociationEnd >> then instantiate a {@link SwConcurrentResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwConcurrentResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("b1439d5b-751a-4b6b-af73-7e76caed4a03")
    public static SwConcurrentResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceAssociationEnd.STEREOTYPE_NAME);
        return SwConcurrentResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwConcurrentResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwConcurrentResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("8addedd4-a808-4eed-9deb-e7c00b77a9bc")
    public static SwConcurrentResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SwConcurrentResourceAssociationEnd.canInstantiate(obj) ? new SwConcurrentResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwConcurrentResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SwConcurrentResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6909cad6-35a3-4c5e-a6a9-58484142e203")
    public static SwConcurrentResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwConcurrentResourceAssociationEnd.canInstantiate(obj))
        	return new SwConcurrentResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("90e13482-7821-4a8c-b236-a55f0d98a2f0")
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
        SwConcurrentResourceAssociationEnd other = (SwConcurrentResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("7c7cfd66-b7d9-4d3b-99b0-c5b69d85018f")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3be8b989-7ddc-4522-91b6-6224bdaddaeb")
    public List<String> getSwConcurrentResource_AssociationEnd_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_AssociationEnd_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("44cb4544-ccba-4350-921e-d1b6e8e40ad7")
    public String getSwConcurrentResource_AssociationEnd_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ec8bac31-0f09-44f6-931a-834882e0b132")
    public List<String> getSwConcurrentResource_AssociationEnd_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b8da7707-4d2d-406a-be00-b2f2319814c5")
    public List<String> getSwConcurrentResource_AssociationEnd_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e3ea0a5b-214a-419e-a9ea-001f59348085")
    public List<String> getSwConcurrentResource_AssociationEnd_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0969c48f-9167-4909-8256-f37fb1de333e")
    public List<String> getSwConcurrentResource_AssociationEnd_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a1f2daf5-82d6-4ce4-996a-335b0abe02e6")
    public List<String> getSwConcurrentResource_AssociationEnd_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("70cef7b5-70cc-4ab6-8565-bb79c832ec14")
    public List<String> getSwConcurrentResource_AssociationEnd_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3983c52a-56b4-4546-8b72-7ad7647a37b4")
    public List<String> getSwConcurrentResource_AssociationEnd_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6c0eea7c-70cf-4995-8ee8-e1593124fa8e")
    public List<String> getSwConcurrentResource_AssociationEnd_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2ed924d4-a633-4465-b0cd-dc063f5cb974")
    public List<String> getSwConcurrentResource_AssociationEnd_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9e1e57c7-7116-41d1-87e4-ca38820be225")
    public List<String> getSwConcurrentResource_AssociationEnd_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ee66d02a-fc2d-4903-8744-28c466dd3963")
    public List<String> getSwConcurrentResource_AssociationEnd_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f623f6a4-ffb1-4eda-b1e6-ca0f66fbc2a4")
    public List<String> getSwConcurrentResource_AssociationEnd_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ae8bca93-de68-4c9f-8533-0283b2129f14")
    public List<String> getSwConcurrentResource_AssociationEnd_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("42fd9e6d-26f4-4c7c-88a6-8bf2c12ce07b")
    public List<String> getSwConcurrentResource_AssociationEnd_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1f74cb0f-d614-450f-8863-317aea141293")
    public List<String> getSwConcurrentResource_AssociationEnd_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7fccdda9-de8c-47c1-976c-cf20843fb8dd")
    public String getSwConcurrentResource_AssociationEnd_type() {
        return this.elt.getTagValue(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT);
    }

    @objid ("184571ba-406f-47c8-9490-0604b9b8290f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9fdfb546-af9e-4cdf-abe3-139403605093")
    public void setSwConcurrentResource_AssociationEnd_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_AssociationEnd_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("74f801f9-520a-415f-882f-c90df63e97ad")
    public void setSwConcurrentResource_AssociationEnd_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("27f3daeb-2375-4631-84de-a803c16acdfa")
    public void setSwConcurrentResource_AssociationEnd_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e514688-4520-48e5-a9f0-8e4ab59ec82c")
    public void setSwConcurrentResource_AssociationEnd_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("651ddd78-95b8-418c-a4b4-ba68e5b90df4")
    public void setSwConcurrentResource_AssociationEnd_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1f09fbd-be2d-4fe7-8152-29078cc5a84e")
    public void setSwConcurrentResource_AssociationEnd_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d9e7235a-90dd-469b-b239-a29e21c38c7a")
    public void setSwConcurrentResource_AssociationEnd_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("62a64e1d-0010-47c2-9861-4bdbf1127548")
    public void setSwConcurrentResource_AssociationEnd_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b8954461-3f31-4a17-9741-67bdc643615f")
    public void setSwConcurrentResource_AssociationEnd_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8f214f59-66ce-4477-bb24-0acd5859b191")
    public void setSwConcurrentResource_AssociationEnd_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c202184-5727-43e5-a3aa-bf61de01043e")
    public void setSwConcurrentResource_AssociationEnd_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9b5b56ee-adde-4395-bb6e-8fe93e6a0daa")
    public void setSwConcurrentResource_AssociationEnd_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0257a920-4740-47e1-b8c0-30935f3e6780")
    public void setSwConcurrentResource_AssociationEnd_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac02a6c2-d8ae-48e6-a26c-99b0404ef427")
    public void setSwConcurrentResource_AssociationEnd_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("37c61fe6-b7ec-4f14-aef3-e7f8c0c6890f")
    public void setSwConcurrentResource_AssociationEnd_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1c9531d8-2dfb-467a-afe0-2a06a1c0bc22")
    public void setSwConcurrentResource_AssociationEnd_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d219f958-d4a2-4dbd-a093-b89204348736")
    public void setSwConcurrentResource_AssociationEnd_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b6935ad-ea6b-47b5-b2d5-839ba1ec69ab")
    public void setSwConcurrentResource_AssociationEnd_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("b5d76298-d7e1-48bf-84ad-0b1fb4f1b071")
    protected SwConcurrentResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("fee892e0-8bf7-40a2-8ede-e86f622d493f")
    public static final class MdaTypes {
        @objid ("308ce9be-73f7-4920-88e3-e228a5ea87c5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("76a603b3-491a-46be-b7db-d199748fcf2c")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT;

        @objid ("4ffccb3b-5618-402c-8197-e4780147daed")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        @objid ("41e67240-2877-4a83-9c03-956d86812ece")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENTRYPOINTS_TAGTYPE_ELT;

        @objid ("10c498d4-e0f9-42d8-80e7-0d7d3503bc49")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_ADRESSSPACE_TAGTYPE_ELT;

        @objid ("9efcbca6-3257-430d-adfd-79418d3cd719")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_PERIODELEMENTS_TAGTYPE_ELT;

        @objid ("fc3763c1-6595-4330-8c90-a5f7441227e8")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_PRIORITYELEMENTS_TAGTYPE_ELT;

        @objid ("add7086b-fd23-41be-bc88-33e6944af6ba")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_STACKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("da396e85-9864-4b50-afae-cf86f51d0d2f")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATESERVICES_TAGTYPE_ELT;

        @objid ("22e008b4-45f4-4d16-979d-f912e0667f0d")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("859c5b67-eba0-43ac-a144-b0677cefda33")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_RESUMESERVICES_TAGTYPE_ELT;

        @objid ("d6bc1549-fcfb-4a2a-89d4-f912ed3b3cb8")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_SUSPENDSERVICES_TAGTYPE_ELT;

        @objid ("cd8ccb31-664f-49bb-a74c-97a41c7f20c1")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_TERMINATESERVICES_TAGTYPE_ELT;

        @objid ("08c4bf04-3c39-4491-b760-caf27998dce9")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("9356967d-7208-44dc-9263-d0267dd061e0")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_SHAREDATARESOURCES_TAGTYPE_ELT;

        @objid ("44be8b1e-08ef-4a54-b21c-0d4e67801375")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_MESSAGERESOURCES_TAGTYPE_ELT;

        @objid ("dc67116d-ec26-451d-943b-d6390a5b4c21")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        @objid ("3450355b-9d18-46f0-81f4-22af452711ca")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        @objid ("d6f55bb8-8f63-40de-b207-65555d6d6dd3")
        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("df2685e7-410f-4121-a784-157c88a2c9c6")
        private static Stereotype MDAASSOCDEP;

        @objid ("dadc5d50-ce62-4129-8406-8a7cc1633ff4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("28a64bc2-6f26-4a51-aa0a-2796c1cedc24")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01b3d69a-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec59-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATIONCAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec5a-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENTRYPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec5b-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_ADRESSSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec5c-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_PERIODELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec5d-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_PRIORITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec5e-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_STACKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec5f-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec60-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec61-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_RESUMESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec62-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_SUSPENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec63-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_TERMINATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec64-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec65-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_SHAREDATARESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec66-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_MESSAGERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec67-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec68-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_NOTIFICATIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec69-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_HEAPSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec6a-172b-11df-b92a-0014222a9f79");
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
