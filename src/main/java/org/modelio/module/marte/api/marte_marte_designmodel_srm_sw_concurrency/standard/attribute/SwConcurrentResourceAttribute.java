/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.attribute.SwResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SwConcurrentResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwConcurrentResourceAttribute extends SwResourceAttribute {
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Attribute";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Attribute_activateServices";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Attribute_activationCapacity";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Attribute_adressSpace";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Attribute_disableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Attribute_enableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Attribute_entryPoints";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Attribute_heapSizeElements";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Attribute_messageResources";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Attribute_mutualExclusionResources";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Attribute_notificationResources";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Attribute_periodElements";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Attribute_priorityElements";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Attribute_resumeServices";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Attribute_shareDataResources";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Attribute_stackSizeElements";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Attribute_suspendServices";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Attribute_terminateServices";

    public static final String SWCONCURRENTRESOURCE_ATTRIBUTE_TYPE_TAGTYPE = "SwConcurrentResource_Attribute_type";

    /**
     * Tells whether a {@link SwConcurrentResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwConcurrentResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwConcurrentResource_Attribute >> then instantiate a {@link SwConcurrentResourceAttribute} proxy.
     * 
     * @return a {@link SwConcurrentResourceAttribute} proxy on the created {@link Attribute}.
     */
    public static SwConcurrentResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceAttribute.STEREOTYPE_NAME);
        return SwConcurrentResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceAttribute} proxy from a {@link Attribute} stereotyped << SwConcurrentResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwConcurrentResourceAttribute} proxy or <i>null</i>.
     */
    public static SwConcurrentResourceAttribute instantiate(final Attribute obj) {
        return SwConcurrentResourceAttribute.canInstantiate(obj) ? new SwConcurrentResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceAttribute} proxy from a {@link Attribute} stereotyped << SwConcurrentResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SwConcurrentResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwConcurrentResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwConcurrentResourceAttribute.canInstantiate(obj))
        	return new SwConcurrentResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwConcurrentResourceAttribute other = (SwConcurrentResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Attribute_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_Attribute_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Attribute_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Attribute_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_Attribute_type() {
        return this.elt.getTagValue(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Attribute_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Attribute_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Attribute_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceAttribute.MdaTypes.SWCONCURRENTRESOURCE_ATTRIBUTE_TYPE_TAGTYPE_ELT, value);
    }

    protected SwConcurrentResourceAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_TYPE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_ENTRYPOINTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_ADRESSSPACE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_PERIODELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_PRIORITYELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_STACKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_RESUMESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_SUSPENDSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_TERMINATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_SHAREDATARESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_MESSAGERESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ATTRIBUTE_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01b3d69c-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_ATTRIBUTE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba797d-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATIONCAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba797e-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_ENTRYPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba797f-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_ADRESSSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7980-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_PERIODELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7981-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_PRIORITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7982-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_STACKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7983-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_ACTIVATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7984-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7985-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_RESUMESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7986-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_SUSPENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7987-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_TERMINATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7988-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba7989-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_SHAREDATARESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba798a-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_MESSAGERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba798b-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba798c-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_NOTIFICATIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba798d-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ATTRIBUTE_HEAPSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d1ba798e-172b-11df-b92a-0014222a9f79");
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
