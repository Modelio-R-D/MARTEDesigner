/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance;

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
public class SwConcurrentResourceInstance extends SwResourceInstance {
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Instance";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Instance_activateServices";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Instance_activationCapacity";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Instance_adressSpace";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Instance_disableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Instance_enableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Instance_entryPoints";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Instance_heapSizeElements";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Instance_messageResources";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Instance_mutualExclusionResources";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Instance_notificationResources";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Instance_periodElements";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Instance_priorityElements";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Instance_resumeServices";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Instance_shareDataResources";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Instance_stackSizeElements";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Instance_suspendServices";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Instance_terminateServices";

    public static final String SWCONCURRENTRESOURCE_INSTANCE_TYPE_TAGTYPE = "SwConcurrentResource_Instance_type";

    /**
     * Tells whether a {@link SwConcurrentResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwConcurrentResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwConcurrentResource_Instance >> then instantiate a {@link SwConcurrentResourceInstance} proxy.
     * 
     * @return a {@link SwConcurrentResourceInstance} proxy on the created {@link Instance}.
     */
    public static SwConcurrentResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceInstance.STEREOTYPE_NAME);
        return SwConcurrentResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceInstance} proxy from a {@link Instance} stereotyped << SwConcurrentResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SwConcurrentResourceInstance} proxy or <i>null</i>.
     */
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
    public static SwConcurrentResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwConcurrentResourceInstance.canInstantiate(obj))
        	return new SwConcurrentResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwConcurrentResourceInstance other = (SwConcurrentResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Instance_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_Instance_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Instance_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Instance_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_Instance_type() {
        return this.elt.getTagValue(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Instance_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Instance_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Instance_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceInstance.MdaTypes.SWCONCURRENTRESOURCE_INSTANCE_TYPE_TAGTYPE_ELT, value);
    }

    protected SwConcurrentResourceInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_TYPE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_ENTRYPOINTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_ADRESSSPACE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_PERIODELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_PRIORITYELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_STACKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_ACTIVATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_RESUMESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_SUSPENDSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_TERMINATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_SHAREDATARESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_MESSAGERESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_INSTANCE_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
