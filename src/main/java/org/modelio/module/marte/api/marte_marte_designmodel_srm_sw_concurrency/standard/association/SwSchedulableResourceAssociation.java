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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SwSchedulableResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwSchedulableResourceAssociation extends SwConcurrentResourceAssociation {
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_Association";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_Association_deadlineElements";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_Association_deadlineTypeElements";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_Association_delayServices";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_Association_dependentScheduler";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE = "SwSchedulableResource_Association_host";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_Association_isPreemptable";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_Association_isStaticSchedulingFeature";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_JOINSERVICES_TAGTYPE = "SwSchedulableResource_Association_joinServices";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_Association_schedParams";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDULERS_TAGTYPE = "SwSchedulableResource_Association_schedulers";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_Association_timeSliceElements";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATION_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_Association_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwSchedulableResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwSchedulableResource_Association >> then instantiate a {@link SwSchedulableResourceAssociation} proxy.
     * 
     * @return a {@link SwSchedulableResourceAssociation} proxy on the created {@link Association}.
     */
    public static SwSchedulableResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceAssociation.STEREOTYPE_NAME);
        return SwSchedulableResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceAssociation} proxy from a {@link Association} stereotyped << SwSchedulableResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwSchedulableResourceAssociation} proxy or <i>null</i>.
     */
    public static SwSchedulableResourceAssociation instantiate(final Association obj) {
        return SwSchedulableResourceAssociation.canInstantiate(obj) ? new SwSchedulableResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceAssociation} proxy from a {@link Association} stereotyped << SwSchedulableResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SwSchedulableResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwSchedulableResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwSchedulableResourceAssociation.canInstantiate(obj))
        	return new SwSchedulableResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwSchedulableResourceAssociation other = (SwSchedulableResourceAssociation) obj;
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
     * Getter for List<String> property 'SwSchedulableResource_Association_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Association_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Association_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Association_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Association_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Association_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Association_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Association_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Association_host() {
        return this.elt.getTagValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Association_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Association_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Association_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Association_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_Association_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_Association_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Association_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Association_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_Association_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_Association_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_YIELDSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Association_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_Association_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_Association_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_Association_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Association_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Association_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Association_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Association_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Association_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Association_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Association_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Association_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Association_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Association_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Association_isPreemptable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_ISPREEMPTABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_Association_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Association_isStaticSchedulingFeature(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Association_joinServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Association_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Association_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Association_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_Association_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Association_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Association_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Association_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_Association_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_Association_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociation.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    protected SwSchedulableResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_ISPREEMPTABLE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDULERS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_TIMESLICEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_DELAYSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_JOINSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_YIELDSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ad90c0a6-10ce-11df-81d9-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13aad-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_ISPREEMPTABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13aae-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDULERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13aaf-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13ab0-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINETYPEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13ab1-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_TIMESLICEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13ab2-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_DELAYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13ab3-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_JOINSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13ab4-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_YIELDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dbc13ab5-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "812cc1db-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_ASSOCIATION_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "812cc1dc-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "812cc1dd-92ac-11e0-a69d-0027103f347c");
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
