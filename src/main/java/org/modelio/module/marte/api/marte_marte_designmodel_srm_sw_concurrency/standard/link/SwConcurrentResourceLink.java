/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.link.SwResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << SwConcurrentResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwConcurrentResourceLink extends SwResourceLink {
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Link";

    public static final String SWCONCURRENTRESOURCE_LINK_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Link_activateServices";

    public static final String SWCONCURRENTRESOURCE_LINK_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Link_activationCapacity";

    public static final String SWCONCURRENTRESOURCE_LINK_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Link_adressSpace";

    public static final String SWCONCURRENTRESOURCE_LINK_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Link_disableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_LINK_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Link_enableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_LINK_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Link_entryPoints";

    public static final String SWCONCURRENTRESOURCE_LINK_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Link_heapSizeElements";

    public static final String SWCONCURRENTRESOURCE_LINK_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Link_messageResources";

    public static final String SWCONCURRENTRESOURCE_LINK_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Link_mutualExclusionResources";

    public static final String SWCONCURRENTRESOURCE_LINK_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Link_notificationResources";

    public static final String SWCONCURRENTRESOURCE_LINK_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Link_periodElements";

    public static final String SWCONCURRENTRESOURCE_LINK_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Link_priorityElements";

    public static final String SWCONCURRENTRESOURCE_LINK_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Link_resumeServices";

    public static final String SWCONCURRENTRESOURCE_LINK_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Link_shareDataResources";

    public static final String SWCONCURRENTRESOURCE_LINK_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Link_stackSizeElements";

    public static final String SWCONCURRENTRESOURCE_LINK_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Link_suspendServices";

    public static final String SWCONCURRENTRESOURCE_LINK_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Link_terminateServices";

    public static final String SWCONCURRENTRESOURCE_LINK_TYPE_TAGTYPE = "SwConcurrentResource_Link_type";

    /**
     * Tells whether a {@link SwConcurrentResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwConcurrentResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwConcurrentResource_Link >> then instantiate a {@link SwConcurrentResourceLink} proxy.
     * 
     * @return a {@link SwConcurrentResourceLink} proxy on the created {@link Link}.
     */
    public static SwConcurrentResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceLink.STEREOTYPE_NAME);
        return SwConcurrentResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceLink} proxy from a {@link Link} stereotyped << SwConcurrentResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SwConcurrentResourceLink} proxy or <i>null</i>.
     */
    public static SwConcurrentResourceLink instantiate(final Link obj) {
        return SwConcurrentResourceLink.canInstantiate(obj) ? new SwConcurrentResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceLink} proxy from a {@link Link} stereotyped << SwConcurrentResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SwConcurrentResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwConcurrentResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwConcurrentResourceLink.canInstantiate(obj))
        	return new SwConcurrentResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwConcurrentResourceLink other = (SwConcurrentResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Link_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_Link_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Link_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_Link_type() {
        return this.elt.getTagValue(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Link_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Link_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_TYPE_TAGTYPE_ELT, value);
    }

    protected SwConcurrentResourceLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_TYPE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_ENTRYPOINTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_ADRESSSPACE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_PERIODELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_PRIORITYELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_STACKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_ACTIVATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_RESUMESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_SUSPENDSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_TERMINATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_SHAREDATARESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_MESSAGERESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_LINK_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01b3d69e-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_LINK_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435f5-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_ACTIVATIONCAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435f6-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_ENTRYPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435f7-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_ADRESSSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435f8-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_PERIODELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435f9-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_PRIORITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435fa-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_STACKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435fb-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_ACTIVATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435fc-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435fd-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_RESUMESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435fe-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_SUSPENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435ff-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_TERMINATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b43600-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b43601-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_SHAREDATARESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b43602-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_MESSAGERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b43603-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b43604-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_NOTIFICATIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b43605-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_HEAPSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b43606-172b-11df-b92a-0014222a9f79");
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
