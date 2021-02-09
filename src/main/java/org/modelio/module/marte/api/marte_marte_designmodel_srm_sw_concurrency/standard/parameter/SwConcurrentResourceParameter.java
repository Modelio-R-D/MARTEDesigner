/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter;

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
public class SwConcurrentResourceParameter extends SwResourceParameter {
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Parameter";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Parameter_activateServices";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Parameter_activationCapacity";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Parameter_adressSpace";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Parameter_disableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Parameter_enableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Parameter_entryPoints";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Parameter_heapSizeElements";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Parameter_messageResources";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Parameter_mutualExclusionResources";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Parameter_notificationResources";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Parameter_periodElements";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Parameter_priorityElements";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Parameter_resumeServices";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Parameter_shareDataResources";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Parameter_stackSizeElements";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Parameter_suspendServices";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Parameter_terminateServices";

    public static final String SWCONCURRENTRESOURCE_PARAMETER_TYPE_TAGTYPE = "SwConcurrentResource_Parameter_type";

    /**
     * Tells whether a {@link SwConcurrentResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SwConcurrentResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SwConcurrentResource_Parameter >> then instantiate a {@link SwConcurrentResourceParameter} proxy.
     * 
     * @return a {@link SwConcurrentResourceParameter} proxy on the created {@link Parameter}.
     */
    public static SwConcurrentResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceParameter.STEREOTYPE_NAME);
        return SwConcurrentResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceParameter} proxy from a {@link Parameter} stereotyped << SwConcurrentResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SwConcurrentResourceParameter} proxy or <i>null</i>.
     */
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
    public static SwConcurrentResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SwConcurrentResourceParameter.canInstantiate(obj))
        	return new SwConcurrentResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwConcurrentResourceParameter other = (SwConcurrentResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Parameter_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_Parameter_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Parameter_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Parameter_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_Parameter_type() {
        return this.elt.getTagValue(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Parameter_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Parameter_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Parameter_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Parameter_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceParameter.MdaTypes.SWCONCURRENTRESOURCE_PARAMETER_TYPE_TAGTYPE_ELT, value);
    }

    protected SwConcurrentResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_TYPE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_ENTRYPOINTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_ADRESSSPACE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_PERIODELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_PRIORITYELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_STACKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_ACTIVATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_RESUMESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_SUSPENDSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_TERMINATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_SHAREDATARESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_MESSAGERESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_PARAMETER_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
