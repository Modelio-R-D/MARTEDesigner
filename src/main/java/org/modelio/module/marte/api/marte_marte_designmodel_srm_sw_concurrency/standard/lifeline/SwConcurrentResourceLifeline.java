/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class SwConcurrentResourceLifeline extends SwResourceLifeline {
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Lifeline";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Lifeline_activateServices";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Lifeline_activationCapacity";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Lifeline_adressSpace";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Lifeline_disableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Lifeline_enableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Lifeline_entryPoints";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Lifeline_heapSizeElements";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Lifeline_messageResources";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Lifeline_mutualExclusionResources";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Lifeline_notificationResources";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Lifeline_periodElements";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Lifeline_priorityElements";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Lifeline_resumeServices";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Lifeline_shareDataResources";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Lifeline_stackSizeElements";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Lifeline_suspendServices";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Lifeline_terminateServices";

    public static final String SWCONCURRENTRESOURCE_LIFELINE_TYPE_TAGTYPE = "SwConcurrentResource_Lifeline_type";

    /**
     * Tells whether a {@link SwConcurrentResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwConcurrentResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwConcurrentResource_Lifeline >> then instantiate a {@link SwConcurrentResourceLifeline} proxy.
     * 
     * @return a {@link SwConcurrentResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static SwConcurrentResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceLifeline.STEREOTYPE_NAME);
        return SwConcurrentResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwConcurrentResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwConcurrentResourceLifeline} proxy or <i>null</i>.
     */
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
    public static SwConcurrentResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwConcurrentResourceLifeline.canInstantiate(obj))
        	return new SwConcurrentResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwConcurrentResourceLifeline other = (SwConcurrentResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Lifeline_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_Lifeline_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Lifeline_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Lifeline_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Lifeline_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_Lifeline_type() {
        return this.elt.getTagValue(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Lifeline_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Lifeline_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Lifeline_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Lifeline_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceLifeline.MdaTypes.SWCONCURRENTRESOURCE_LIFELINE_TYPE_TAGTYPE_ELT, value);
    }

    protected SwConcurrentResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_TYPE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_ENTRYPOINTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_ADRESSSPACE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_PERIODELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_PRIORITYELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_STACKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_ACTIVATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_RESUMESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_SUSPENDSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_TERMINATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_SHAREDATARESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_MESSAGERESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LIFELINE_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
