/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.instance.SwResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SwConcurrentResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("02f84874-8ed9-4106-a046-f407caece724")
public class SwConcurrentResourceInstance extends SwResourceInstance {
    @objid ("3c45fc1c-3564-4f01-8b8a-47ce8f9382a0")
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Instance";

    @objid ("6865ce6b-0639-411a-881e-0b7c8c22450f")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Instance_activateServices";

    @objid ("57774f4f-c9d5-4bfe-8a73-f6ffcbd77c43")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Instance_activationCapacity";

    @objid ("4a0f1d55-a413-473d-b897-ecd71d25f650")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Instance_adressSpace";

    @objid ("1d970623-6df0-44d5-bf29-4b361d5a8068")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Instance_disableConcurrencyServices";

    @objid ("25c6bdfe-e122-4d4f-9620-8dd6881799c4")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Instance_enableConcurrencyServices";

    @objid ("90c65655-1606-476b-96ff-1c91b095726c")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Instance_entryPoints";

    @objid ("4a82bee2-1685-4d7c-940e-109204a65375")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Instance_heapSizeElements";

    @objid ("30fa1e02-65ba-4c6b-af67-db1cc2e84aa0")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Instance_messageResources";

    @objid ("93fd3e23-528e-4988-a2b9-3a09bf5be075")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Instance_mutualExclusionResources";

    @objid ("7785a63e-9e95-4a05-932e-c29539fb36fd")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Instance_notificationResources";

    @objid ("a44fad8c-798b-475e-b0d0-4a917114d336")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Instance_periodElements";

    @objid ("50ca2303-1873-47c5-844b-1debddb8ebe0")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Instance_priorityElements";

    @objid ("b9ff077c-67f3-4788-b859-0ada46c9095b")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Instance_resumeServices";

    @objid ("088d2a96-6a53-47e9-828e-ba6e81cc9c4a")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Instance_shareDataResources";

    @objid ("9e98f1d6-efc3-43c8-9263-f08dd47bc49a")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Instance_stackSizeElements";

    @objid ("106a7d3d-2714-4407-a3c0-a226a35fd050")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Instance_suspendServices";

    @objid ("e6eec9f0-8670-4b24-9b9f-d092e3f5dcc2")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Instance_terminateServices";

    @objid ("4f7f7569-eefc-4674-882a-493133987a13")
    public static final String SWCONCURRENTRESOURCE_INSTANCE_TYPE_TAGTYPE = "SwConcurrentResource_Instance_type";

    /**
     * Tells whether a {@link SwConcurrentResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwConcurrentResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d90574e8-3d68-4887-9018-72e96f1d7b2f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwConcurrentResource_Instance >> then instantiate a {@link SwConcurrentResourceInstance} proxy.
     * 
     * @return a {@link SwConcurrentResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("7ca384d6-226c-4807-8463-3b9725e68551")
    public static SwConcurrentResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceInstance.STEREOTYPE_NAME);
        return SwConcurrentResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceInstance} proxy from a {@link Instance} stereotyped << SwConcurrentResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SwConcurrentResourceInstance} proxy or <i>null</i>.
     */
    @objid ("c34d55e2-f414-4b80-b251-a4430ccd9e6b")
    public static SwConcurrentResourceInstance instantiate(final Instance obj) {
        return SwConcurrentResourceInstance.canInstantiate(obj) ? new SwConcurrentResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceInstance} proxy from a {@link Instance} stereotyped << SwConcurrentResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SwConcurrentResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("413e80b4-9fdb-4eab-83a8-eca2c91173e8")
    public static SwConcurrentResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwConcurrentResourceInstance.canInstantiate(obj))
        	return new SwConcurrentResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d7114d82-d5e8-4e61-b045-8afaae499a2d")
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
        SwConcurrentResourceInstance other = (SwConcurrentResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("cd452c88-5c3d-400f-9efc-2e170491b99a")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e454146f-08d0-4011-8d25-3a0b21f14fe6")
    public List<String> getSwConcurrentResource_Instance_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Instance_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c98c622f-3e02-48aa-b124-291b62fbe0ee")
    public String getSwConcurrentResource_Instance_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8944c633-93a1-4bc8-854a-b57d52f43e76")
    public List<String> getSwConcurrentResource_Instance_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("966223c8-76da-4335-9d6c-dbb9f5863fd9")
    public List<String> getSwConcurrentResource_Instance_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3c133b3b-32d3-43e1-8ad3-82c79fd6a457")
    public List<String> getSwConcurrentResource_Instance_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8b491300-a8ec-4778-aa37-272ae689d6b2")
    public List<String> getSwConcurrentResource_Instance_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("232ac6af-2508-4c2f-a76d-3b177c84caef")
    public List<String> getSwConcurrentResource_Instance_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bcd906ff-3e5e-4e99-8ee4-f37082c0d406")
    public List<String> getSwConcurrentResource_Instance_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d962cea4-5924-4e2e-a178-53fd118ad068")
    public List<String> getSwConcurrentResource_Instance_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("62ca2957-9d07-4684-bc87-b67be06c5b83")
    public List<String> getSwConcurrentResource_Instance_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fc938299-087f-4df1-879d-ad202b5fd414")
    public List<String> getSwConcurrentResource_Instance_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("40b1d9d0-3fab-4b1a-abb6-87fec62445fa")
    public List<String> getSwConcurrentResource_Instance_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2e5632a1-0ba3-4f4a-b517-8d50d1d3295c")
    public List<String> getSwConcurrentResource_Instance_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1374e07d-a103-4c30-99af-f11373ed80ff")
    public List<String> getSwConcurrentResource_Instance_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c556a50a-5401-48f4-a493-9fddaed4192a")
    public List<String> getSwConcurrentResource_Instance_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e91365cf-c0be-4fde-8712-611996e0b6d1")
    public List<String> getSwConcurrentResource_Instance_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("986de94a-ddcd-45b5-877c-7be723fa720c")
    public List<String> getSwConcurrentResource_Instance_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e8692456-8323-43f6-9a4c-20cc3f7ce251")
    public String getSwConcurrentResource_Instance_type() {
        return this.elt.getTagValue(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_TYPE_TAGTYPE_ELT);
    }

    @objid ("672407da-fc56-490f-bcdd-44b0d9b1bedc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1a17d814-7714-4696-9af5-d9cc9e7d8435")
    public void setSwConcurrentResource_Instance_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Instance_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a5a3e91d-ce1a-4619-8597-77af171eb479")
    public void setSwConcurrentResource_Instance_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("73cf4587-17b0-4a9d-be52-f26cb4c686e9")
    public void setSwConcurrentResource_Instance_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("13c3fcd5-19db-48ca-a2a4-65c9c349439c")
    public void setSwConcurrentResource_Instance_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2985c485-38bc-4d1e-99d8-00658ba669e0")
    public void setSwConcurrentResource_Instance_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6a01a2e-9134-4e8c-a147-0b6831502dbe")
    public void setSwConcurrentResource_Instance_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("38ec9b85-67c9-4ce7-8146-5e0005233d27")
    public void setSwConcurrentResource_Instance_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("66e7cbd2-ff53-4c0f-9c13-72f5dc4c342f")
    public void setSwConcurrentResource_Instance_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4abcd5fd-7b9c-4a9d-9ec9-1991ba72debb")
    public void setSwConcurrentResource_Instance_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b296cd41-80f5-4117-956c-eeb212f56b2f")
    public void setSwConcurrentResource_Instance_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c9f6123e-3cb4-4094-ba13-abcbaeca6508")
    public void setSwConcurrentResource_Instance_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90c63553-8815-4768-a1b1-c1c165fbf618")
    public void setSwConcurrentResource_Instance_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("258d5378-e4bd-4979-98d0-a69b9256323c")
    public void setSwConcurrentResource_Instance_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("42e42df1-858a-4995-8c45-0f0a5d9c450d")
    public void setSwConcurrentResource_Instance_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9caae842-da38-4467-a88c-15e46c56833e")
    public void setSwConcurrentResource_Instance_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0dc29963-266a-4a37-9547-da7517292ab7")
    public void setSwConcurrentResource_Instance_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6073145-5f8a-4b87-8fd4-892d2a324a0a")
    public void setSwConcurrentResource_Instance_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("157d148a-5575-4d4a-a912-bb0c902c0594")
    public void setSwConcurrentResource_Instance_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("54d8adda-6a90-42b7-9b5e-b30f33a8d136")
    protected SwConcurrentResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("7a522e32-454b-4194-ba68-3d4817041475")
    public static final class MdaTypes {
        @objid ("46956d99-f49a-444d-a0bd-9b8c9419f92d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d935cc9a-a35f-4d05-a36b-4be930a51ab3")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_TYPE_TAGTYPE_ELT;

        @objid ("573c81b4-65f5-4e2f-930d-240a7d703115")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        @objid ("f4b061b5-aaf0-4b24-8b5a-bf5e63e76a07")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_ENTRYPOINTS_TAGTYPE_ELT;

        @objid ("d976e5ca-69f0-49e6-8b6f-43df4eb9979c")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_ADRESSSPACE_TAGTYPE_ELT;

        @objid ("74b119c8-dda5-48a5-b4f1-b189c118a767")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_PERIODELEMENTS_TAGTYPE_ELT;

        @objid ("e4706ea3-a914-4ba7-afae-b91bccb48a07")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_PRIORITYELEMENTS_TAGTYPE_ELT;

        @objid ("28529b36-62f3-4c6e-b8c2-0a3c265bdd9a")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_STACKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("89d0e435-007b-4f46-a863-c365f6bf0f68")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_ACTIVATESERVICES_TAGTYPE_ELT;

        @objid ("345efbb7-703e-4349-af2e-045559d1a746")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("9416d8eb-6fce-4974-9f5a-a37907763ebf")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_RESUMESERVICES_TAGTYPE_ELT;

        @objid ("23a27061-3e24-46b1-8d19-e29e5c4756e6")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_SUSPENDSERVICES_TAGTYPE_ELT;

        @objid ("1a77056d-20c9-4607-b2d0-3c67897ea13f")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_TERMINATESERVICES_TAGTYPE_ELT;

        @objid ("e25bec5a-cdbc-46b6-b2c4-6df78dadbc21")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("8c4b7340-dc32-4981-8751-b16ff08d6a29")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_SHAREDATARESOURCES_TAGTYPE_ELT;

        @objid ("657ae174-7053-4604-9b12-97d0aab0bb80")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_MESSAGERESOURCES_TAGTYPE_ELT;

        @objid ("b36f4bd9-2742-49e5-817d-d5050a126de7")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        @objid ("9509be73-95b0-4f0e-a75b-605594b3861d")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        @objid ("68c78b4b-96f4-4527-8efd-faa787139e0c")
        public static TagType SWCONCURRENTRESOURCE_INSTANCE_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("527f87a9-cdb6-450b-b190-bf92b06750cb")
        private static Stereotype MDAASSOCDEP;

        @objid ("648e9d1c-5e48-4030-a525-97493636dff8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4ab34780-3437-4e8d-b264-a02a63e430c1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01b3d69f-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_INSTANCE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc4095-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_ACTIVATIONCAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc4096-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_ENTRYPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc4097-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_ADRESSSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc4098-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_PERIODELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc4099-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_PRIORITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc409a-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_STACKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc409b-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_ACTIVATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc409c-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc409d-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_RESUMESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc409e-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_SUSPENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc409f-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_TERMINATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc40a0-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc40a1-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_SHAREDATARESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc40a2-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_MESSAGERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc40a3-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc40a4-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_NOTIFICATIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc40a5-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_INSTANCE_HEAPSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc40a6-172b-11df-b92a-0014222a9f79");
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
