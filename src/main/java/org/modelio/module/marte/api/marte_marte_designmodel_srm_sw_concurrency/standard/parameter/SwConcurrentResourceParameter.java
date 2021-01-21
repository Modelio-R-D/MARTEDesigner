/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.parameter.SwResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SwConcurrentResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6a20daef-c49b-46c7-9d74-c78ee66c922c")
public class SwConcurrentResourceParameter extends SwResourceParameter {
    @objid ("88fe3f0c-366c-4825-96a9-f7bdfdf7d64d")
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Parameter";

    @objid ("64ec2e5e-eac3-4601-a197-28f259ce4cd8")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Parameter_activateServices";

    @objid ("3b3404f4-d128-4e8d-a14c-d5c24f6d89cd")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Parameter_activationCapacity";

    @objid ("e18b4eac-d33e-47ae-8961-9c2ae3f724f6")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Parameter_adressSpace";

    @objid ("57e12185-1535-4536-ba11-bd4151607a7a")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Parameter_disableConcurrencyServices";

    @objid ("8142fdba-4aa1-4d97-b2fc-b89a253127fb")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Parameter_enableConcurrencyServices";

    @objid ("cd085882-d7c8-4ef2-af72-17392c6e01a5")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Parameter_entryPoints";

    @objid ("e88072b1-52fe-4b57-ad48-aa6f2d6b9dd3")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Parameter_heapSizeElements";

    @objid ("0e26a765-2d06-44e0-ae0b-222d8b320d14")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Parameter_messageResources";

    @objid ("dc248e39-f5be-4ff2-9705-73f290df724b")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Parameter_mutualExclusionResources";

    @objid ("af768155-6001-47d5-8c2b-3d24d548bd66")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Parameter_notificationResources";

    @objid ("93cd506f-4194-4757-99f6-f921f719c12d")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Parameter_periodElements";

    @objid ("c24f6725-1ce6-467a-8c79-305e5e2ffa2e")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Parameter_priorityElements";

    @objid ("715b279c-f243-4a9c-9c5b-c0f9afab6000")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Parameter_resumeServices";

    @objid ("24d9b6d5-75a8-411e-926d-a4e5951db9ce")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Parameter_shareDataResources";

    @objid ("046a7ce7-075d-4b4a-aa58-868ccbf6125b")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Parameter_stackSizeElements";

    @objid ("45bdf6f4-ab82-4ed7-92a8-7c3c39ea5b53")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Parameter_suspendServices";

    @objid ("775ebebe-481c-4cfc-bf4d-4325f6063b11")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Parameter_terminateServices";

    @objid ("b4061206-af43-4e1f-b3aa-7212369ae4ad")
    public static final String SWCONCURRENTRESOURCE_PARAMETER_TYPE_TAGTYPE = "SwConcurrentResource_Parameter_type";

    /**
     * Tells whether a {@link SwConcurrentResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SwConcurrentResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e27bfdf7-2480-4e0d-9a95-1c082070fb58")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SwConcurrentResource_Parameter >> then instantiate a {@link SwConcurrentResourceParameter} proxy.
     * 
     * @return a {@link SwConcurrentResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("7354cfeb-0f30-43be-9d1e-02819bf9f41a")
    public static SwConcurrentResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceParameter.STEREOTYPE_NAME);
        return SwConcurrentResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceParameter} proxy from a {@link Parameter} stereotyped << SwConcurrentResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SwConcurrentResourceParameter} proxy or <i>null</i>.
     */
    @objid ("871ee7cb-ad18-4511-9781-cd61530a3bb0")
    public static SwConcurrentResourceParameter instantiate(final Parameter obj) {
        return SwConcurrentResourceParameter.canInstantiate(obj) ? new SwConcurrentResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceParameter} proxy from a {@link Parameter} stereotyped << SwConcurrentResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SwConcurrentResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3d081f9b-5e2d-4701-8c4e-05e27fdff5cb")
    public static SwConcurrentResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SwConcurrentResourceParameter.canInstantiate(obj))
        	return new SwConcurrentResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fde7e2cc-f345-4cc6-a2b1-e813f1f449c3")
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
        SwConcurrentResourceParameter other = (SwConcurrentResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("59549b62-4237-49df-9ceb-84aa784c9fba")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8d33f663-30fd-4738-bc41-2825a89f1bf9")
    public List<String> getSwConcurrentResource_Parameter_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Parameter_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("874d6afc-7d5b-42fb-a8eb-4e061ed690b8")
    public String getSwConcurrentResource_Parameter_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("af67e918-a81d-43c2-be75-21c4963ad09c")
    public List<String> getSwConcurrentResource_Parameter_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c740bd2f-2b39-4ce7-8c9c-8fb5f852ce2d")
    public List<String> getSwConcurrentResource_Parameter_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("16850e79-8bc3-4f1c-9db4-af40267a9f3a")
    public List<String> getSwConcurrentResource_Parameter_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e10614e0-e97f-4697-ab08-8b2fb7b944d7")
    public List<String> getSwConcurrentResource_Parameter_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bcbc034d-991d-48e6-b386-bd63bbd1c0cd")
    public List<String> getSwConcurrentResource_Parameter_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ae74012c-9ec0-44a8-9696-95a95dbf6f0e")
    public List<String> getSwConcurrentResource_Parameter_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c2833632-2e5d-438e-bb7b-c529ee7ac60a")
    public List<String> getSwConcurrentResource_Parameter_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("042a1d01-772d-4b46-a4f3-671357643466")
    public List<String> getSwConcurrentResource_Parameter_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b68bfde4-6f3b-43c3-b831-dc86980e6956")
    public List<String> getSwConcurrentResource_Parameter_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ef9cbdf7-e23e-4aa7-8b8d-4315ade1bc5e")
    public List<String> getSwConcurrentResource_Parameter_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c2ba177d-ad44-4a1d-9fb0-b40aac74dd48")
    public List<String> getSwConcurrentResource_Parameter_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1d1dcf00-05b2-4fec-b807-607cf642d6c9")
    public List<String> getSwConcurrentResource_Parameter_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3fcc4376-6483-4104-908c-b4c2461a4794")
    public List<String> getSwConcurrentResource_Parameter_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f413b199-26a3-4e85-b2db-f1a5ca6c6041")
    public List<String> getSwConcurrentResource_Parameter_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("15659bbe-f37b-4d06-a952-2c98deba374d")
    public List<String> getSwConcurrentResource_Parameter_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b61ea4e-16c7-480e-9ba0-299e01a9b837")
    public String getSwConcurrentResource_Parameter_type() {
        return this.elt.getTagValue(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_TYPE_TAGTYPE_ELT);
    }

    @objid ("290e925a-1485-499d-a205-cca3c144fb51")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("733dd28f-eb23-4d33-9482-de6c06421d34")
    public void setSwConcurrentResource_Parameter_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Parameter_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f7ee4735-8a5f-4845-887e-3d3c5fbdcdb5")
    public void setSwConcurrentResource_Parameter_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b6fee7dd-75fe-4b40-8f2c-6b07278c0631")
    public void setSwConcurrentResource_Parameter_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4a799176-8df5-4579-b404-62d39d185c31")
    public void setSwConcurrentResource_Parameter_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("52b11c0e-e9f1-4a96-87dc-9db8dc7946c9")
    public void setSwConcurrentResource_Parameter_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("22e71daa-b082-49f8-b154-1c3e8ce7b399")
    public void setSwConcurrentResource_Parameter_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0fa92c35-4890-4a1e-bf1d-be8a4c7f2bca")
    public void setSwConcurrentResource_Parameter_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1342b891-42fc-49ad-9244-257975c390fa")
    public void setSwConcurrentResource_Parameter_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bdbed4f8-1a9f-444e-a10e-5d9112fac5ca")
    public void setSwConcurrentResource_Parameter_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3163884a-d674-475c-9e3a-3843dfeb7e45")
    public void setSwConcurrentResource_Parameter_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76309b7d-aad2-4ffd-8997-3866f0b20346")
    public void setSwConcurrentResource_Parameter_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69385394-0a0d-4365-b863-7e12db953d65")
    public void setSwConcurrentResource_Parameter_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a435aab5-0f89-4191-864e-279f0faa097f")
    public void setSwConcurrentResource_Parameter_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("62b8df2b-803a-4a75-972e-b6bcb506db2c")
    public void setSwConcurrentResource_Parameter_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("71d9891d-96c5-4c16-ba3e-cc4d761f6f33")
    public void setSwConcurrentResource_Parameter_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a5a8930e-980d-481d-8546-3ef6dc5797a5")
    public void setSwConcurrentResource_Parameter_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2802c2ea-ec8d-4972-8da8-5d3a3440a1d3")
    public void setSwConcurrentResource_Parameter_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ae4cd22f-ae27-4530-8f34-ff2b05a8fc20")
    public void setSwConcurrentResource_Parameter_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("83d4799f-ac76-4aa2-9b53-ee8dc156d0bf")
    protected SwConcurrentResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("5befcbc1-e52e-4131-94d7-dcd2faf2d83c")
    public static final class MdaTypes {
        @objid ("69bada59-e457-48f6-a4b9-5bdbabeaf98d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6ce0ecf9-1b82-4f3d-a705-9d3203f7f707")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_TYPE_TAGTYPE_ELT;

        @objid ("062cbfec-8957-4d5c-914f-f702569b7fde")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        @objid ("b13d8383-7680-4696-8675-50a85253c815")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_ENTRYPOINTS_TAGTYPE_ELT;

        @objid ("26bccaf3-dc1e-4aa0-95cc-bde29025225e")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_ADRESSSPACE_TAGTYPE_ELT;

        @objid ("71477291-bfef-4033-8896-ac0cf2e3609f")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_PERIODELEMENTS_TAGTYPE_ELT;

        @objid ("0f5c6cd3-735b-4c6b-8798-a49d1ccf26a9")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_PRIORITYELEMENTS_TAGTYPE_ELT;

        @objid ("91d54277-9604-4ddf-943e-60281444e0b4")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_STACKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("21d940b0-b52e-4f5f-9d2c-f36a609a65d6")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_ACTIVATESERVICES_TAGTYPE_ELT;

        @objid ("86cf79ee-a253-41bc-9722-1337954b4206")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("422b351a-ff84-4494-96b1-2da824835f31")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_RESUMESERVICES_TAGTYPE_ELT;

        @objid ("b44bad61-e6ac-494c-8c73-25dbac5cc6ed")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_SUSPENDSERVICES_TAGTYPE_ELT;

        @objid ("de689e2d-cfc2-47a1-a6ee-85c598411923")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_TERMINATESERVICES_TAGTYPE_ELT;

        @objid ("d7adf6da-7e5d-4a6b-bc18-fef4f12916fa")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("07cc9d1a-d234-4d46-9fba-f236f19af5d7")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_SHAREDATARESOURCES_TAGTYPE_ELT;

        @objid ("5861a22f-3611-42fe-ba94-aa6e51dcb44e")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_MESSAGERESOURCES_TAGTYPE_ELT;

        @objid ("507d12d2-f64f-4d24-b04e-699386e50b1c")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        @objid ("862ea762-d50a-44b8-8c24-f62b613dd23f")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        @objid ("22d7dab2-2d47-4b3c-bc4a-333b9ca67542")
        public static TagType SWCONCURRENTRESOURCE_PARAMETER_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("bb5755b1-16c3-4f0a-8e14-0b0e2982d513")
        private static Stereotype MDAASSOCDEP;

        @objid ("3d7e52c0-0d43-49ee-b9e8-80f4522e5147")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("636a63f9-ce20-4ec6-abb0-8323a675077e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01aa4d57-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01b3d6a0-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_ACTIVATIONCAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01b3d6a7-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_ENTRYPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01b3d6ae-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_ADRESSSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01b3d6b5-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_PERIODELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01b3d6bc-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_PRIORITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01b3d6c3-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_STACKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01b638f2-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_ACTIVATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01b638f9-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01b63900-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_RESUMESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01b63907-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_SUSPENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01b89b42-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_TERMINATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01b89b49-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01b89b50-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_SHAREDATARESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01bafd93-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_MESSAGERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01bafd9a-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01bafda1-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_NOTIFICATIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01bd5fe2-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_PARAMETER_HEAPSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01bd5fe9-0ccf-11df-8525-001302895b2b");
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
