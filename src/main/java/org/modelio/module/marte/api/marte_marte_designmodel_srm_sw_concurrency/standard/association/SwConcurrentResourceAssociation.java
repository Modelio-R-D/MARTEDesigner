/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.association.SwResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SwConcurrentResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwConcurrentResourceAssociation extends SwResourceAssociation {
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Association";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Association_activateServices";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Association_activationCapacity";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Association_adressSpace";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Association_disableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Association_enableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Association_entryPoints";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Association_heapSizeElements";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Association_messageResources";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Association_mutualExclusionResources";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Association_notificationResources";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Association_periodElements";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Association_priorityElements";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Association_resumeServices";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Association_shareDataResources";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Association_stackSizeElements";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Association_suspendServices";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Association_terminateServices";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATION_TYPE_TAGTYPE = "SwConcurrentResource_Association_type";

    /**
     * Tells whether a {@link SwConcurrentResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwConcurrentResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwConcurrentResource_Association >> then instantiate a {@link SwConcurrentResourceAssociation} proxy.
     * 
     * @return a {@link SwConcurrentResourceAssociation} proxy on the created {@link Association}.
     */
    public static SwConcurrentResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceAssociation.STEREOTYPE_NAME);
        return SwConcurrentResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceAssociation} proxy from a {@link Association} stereotyped << SwConcurrentResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwConcurrentResourceAssociation} proxy or <i>null</i>.
     */
    public static SwConcurrentResourceAssociation instantiate(final Association obj) {
        return SwConcurrentResourceAssociation.canInstantiate(obj) ? new SwConcurrentResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceAssociation} proxy from a {@link Association} stereotyped << SwConcurrentResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SwConcurrentResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwConcurrentResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwConcurrentResourceAssociation.canInstantiate(obj))
        	return new SwConcurrentResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwConcurrentResourceAssociation other = (SwConcurrentResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Association_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_Association_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Association_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_Association_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_Association_type() {
        return this.elt.getTagValue(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Association_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Association_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_Association_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceAssociation.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATION_TYPE_TAGTYPE_ELT, value);
    }

    protected SwConcurrentResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_TYPE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_ENTRYPOINTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_ADRESSSPACE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_PERIODELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_PRIORITYELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_STACKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_RESUMESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_SUSPENDSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_TERMINATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_SHAREDATARESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_MESSAGERESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATION_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "87b85da9-10d0-11df-81d9-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf867d-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATIONCAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf867e-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_ENTRYPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf867f-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_ADRESSSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8680-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_PERIODELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8681-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_PRIORITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8682-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_STACKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8683-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_ACTIVATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8684-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8685-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_RESUMESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8686-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_SUSPENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8687-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_TERMINATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8688-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf8689-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_SHAREDATARESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf868a-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_MESSAGERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf868b-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf868c-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_NOTIFICATIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf868d-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATION_HEAPSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cebf868e-172b-11df-b92a-0014222a9f79");
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
