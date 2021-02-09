/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SwSchedulableResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwSchedulableResourceAssociationEnd extends SwConcurrentResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "SwSchedulableResource_AssociationEnd";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINEELEMENTS_TAGTYPE = "SwSchedulableResource_AssociationEnd_deadlineElements";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINETYPEELEMENTS_TAGTYPE = "SwSchedulableResource_AssociationEnd_deadlineTypeElements";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DELAYSERVICES_TAGTYPE = "SwSchedulableResource_AssociationEnd_delayServices";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER_TAGTYPE = "SwSchedulableResource_AssociationEnd_dependentScheduler";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_HOST_TAGTYPE = "SwSchedulableResource_AssociationEnd_host";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISPREEMPTABLE_TAGTYPE = "SwSchedulableResource_AssociationEnd_isPreemptable";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISSTATICSCHEDULINGFEATURE_TAGTYPE = "SwSchedulableResource_AssociationEnd_isStaticSchedulingFeature";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_JOINSERVICES_TAGTYPE = "SwSchedulableResource_AssociationEnd_joinServices";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS_TAGTYPE = "SwSchedulableResource_AssociationEnd_schedParams";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULERS_TAGTYPE = "SwSchedulableResource_AssociationEnd_schedulers";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_TIMESLICEELEMENTS_TAGTYPE = "SwSchedulableResource_AssociationEnd_timeSliceElements";

    public static final String SWSCHEDULABLERESOURCE_ASSOCIATIONEND_YIELDSERVICES_TAGTYPE = "SwSchedulableResource_AssociationEnd_yieldServices";

    /**
     * Tells whether a {@link SwSchedulableResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwSchedulableResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwSchedulableResource_AssociationEnd >> then instantiate a {@link SwSchedulableResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwSchedulableResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static SwSchedulableResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSchedulableResourceAssociationEnd.STEREOTYPE_NAME);
        return SwSchedulableResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwSchedulableResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwSchedulableResourceAssociationEnd} proxy or <i>null</i>.
     */
    public static SwSchedulableResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SwSchedulableResourceAssociationEnd.canInstantiate(obj) ? new SwSchedulableResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSchedulableResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwSchedulableResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SwSchedulableResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwSchedulableResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwSchedulableResourceAssociationEnd.canInstantiate(obj))
        	return new SwSchedulableResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwSchedulableResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwSchedulableResourceAssociationEnd other = (SwSchedulableResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_AssociationEnd_deadlineElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_AssociationEnd_deadlineElements() {
        return this.elt.getTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_AssociationEnd_deadlineTypeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_AssociationEnd_deadlineTypeElements() {
        return this.elt.getTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINETYPEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_AssociationEnd_delayServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_AssociationEnd_delayServices() {
        return this.elt.getTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DELAYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_AssociationEnd_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_AssociationEnd_dependentScheduler() {
        return this.elt.getTagValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_AssociationEnd_host() {
        return this.elt.getTagValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_AssociationEnd_joinServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_AssociationEnd_joinServices() {
        return this.elt.getTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_JOINSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_AssociationEnd_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_AssociationEnd_schedParams() {
        return this.elt.getTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwSchedulableResource_AssociationEnd_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwSchedulableResource_AssociationEnd_schedulers() {
        return this.elt.getTagValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULERS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_AssociationEnd_timeSliceElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_AssociationEnd_timeSliceElements() {
        return this.elt.getTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_TIMESLICEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwSchedulableResource_AssociationEnd_yieldServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwSchedulableResource_AssociationEnd_yieldServices() {
        return this.elt.getTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_YIELDSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_AssociationEnd_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_AssociationEnd_isPreemptable() {
        return this.elt.isTagged(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SwSchedulableResource_AssociationEnd_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwSchedulableResource_AssociationEnd_isStaticSchedulingFeature() {
        return this.elt.isTagged(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_AssociationEnd_deadlineElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_AssociationEnd_deadlineElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_AssociationEnd_deadlineTypeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_AssociationEnd_deadlineTypeElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINETYPEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_AssociationEnd_delayServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_AssociationEnd_delayServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DELAYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_AssociationEnd_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_AssociationEnd_dependentScheduler(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwSchedulableResource_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_AssociationEnd_host(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_AssociationEnd_isPreemptable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_AssociationEnd_isPreemptable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISPREEMPTABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISPREEMPTABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwSchedulableResource_AssociationEnd_isStaticSchedulingFeature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_AssociationEnd_isStaticSchedulingFeature(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_AssociationEnd_joinServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_AssociationEnd_joinServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_JOINSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_AssociationEnd_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_AssociationEnd_schedParams(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwSchedulableResource_AssociationEnd_schedulers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_AssociationEnd_schedulers(final String value) {
        this.elt.putTagValue(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULERS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_AssociationEnd_timeSliceElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_AssociationEnd_timeSliceElements(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_TIMESLICEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwSchedulableResource_AssociationEnd_yieldServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwSchedulableResource_AssociationEnd_yieldServices(final List<String> values) {
        this.elt.putTagValues(SwSchedulableResourceAssociationEnd.MdaTypes.SWSCHEDULABLERESOURCE_ASSOCIATIONEND_YIELDSERVICES_TAGTYPE_ELT, values);
    }

    protected SwSchedulableResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISPREEMPTABLE_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULERS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINETYPEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_TIMESLICEELEMENTS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DELAYSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_JOINSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_YIELDSERVICES_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_HOST_TAGTYPE_ELT;

        public static TagType SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01d79968-0ccf-11df-8525-001302895b2b");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISSTATICSCHEDULINGFEATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee305-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_ISPREEMPTABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee306-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee307-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee308-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEADLINETYPEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee309-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_TIMESLICEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee30a-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DELAYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee30b-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_JOINSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee30c-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_YIELDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3bee30d-172c-11df-b92a-0014222a9f79");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "90b8ccd1-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "90b8ccd0-92ac-11e0-a69d-0027103f347c");
            SWSCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "90b8cccf-92ac-11e0-a69d-0027103f347c");
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
