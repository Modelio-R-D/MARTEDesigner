/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << Scheduler_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("234f5826-535a-4773-b839-dc1d20db6dd1")
public class SchedulerAssociationEnd extends ResourceAssociationEnd {
    @objid ("33c73f28-b090-4179-ba61-f2852f0fec3e")
    public static final String STEREOTYPE_NAME = "Scheduler_AssociationEnd";

    @objid ("301d6a67-1936-44af-be7e-43bdb4da5789")
    public static final String SCHEDULER_ASSOCIATIONEND_HOST_TAGTYPE = "Scheduler_AssociationEnd_host";

    @objid ("0599427a-5078-4396-903d-296121e0e4e9")
    public static final String SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE = "Scheduler_AssociationEnd_isPreemptible";

    @objid ("e97dc337-db0e-4fb0-8ce6-2b3a850b5f02")
    public static final String SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_AssociationEnd_otherSchedPolicy";

    @objid ("39176cd2-a1e7-4802-98b9-90d1beb17506")
    public static final String SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE = "Scheduler_AssociationEnd_processingUnits";

    @objid ("617b37b4-625f-4267-b4c7-de2bc42fe21d")
    public static final String SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_AssociationEnd_protectedSharedResources";

    @objid ("44284040-3c50-4648-b22e-bb6408263efe")
    public static final String SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE = "Scheduler_AssociationEnd_schedPolicy";

    @objid ("8289f2c0-b5da-4507-bcd9-07f19ef7f062")
    public static final String SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_AssociationEnd_schedulableResources";

    @objid ("d33f54c3-1db8-48a2-872b-f5676ea43c83")
    public static final String SCHEDULER_ASSOCIATIONEND_SCHEDULE_TAGTYPE = "Scheduler_AssociationEnd_schedule";

    /**
     * Tells whether a {@link SchedulerAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << Scheduler_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4df2080d-48b9-4304-a6d6-158316e2f7d7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << Scheduler_AssociationEnd >> then instantiate a {@link SchedulerAssociationEnd} proxy.
     * 
     * @return a {@link SchedulerAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("53e41c64-e260-4685-9051-f2c68cc1b90d")
    public static SchedulerAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerAssociationEnd.STEREOTYPE_NAME);
        return SchedulerAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Scheduler_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SchedulerAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("4ca6a5a1-53da-4d6e-adbf-47927ee019cc")
    public static SchedulerAssociationEnd instantiate(final AssociationEnd obj) {
        return SchedulerAssociationEnd.canInstantiate(obj) ? new SchedulerAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Scheduler_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SchedulerAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f98300bf-8ba0-4bc9-8b90-61394cd102d6")
    public static SchedulerAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SchedulerAssociationEnd.canInstantiate(obj))
        	return new SchedulerAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SchedulerAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("49cd6d76-37e6-43d9-8fef-3bae0db759ad")
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
        SchedulerAssociationEnd other = (SchedulerAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("fc4e3373-120d-4c49-a0fc-cc6cfe14157f")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db031fc2-e75a-4919-b896-d473963dbe04")
    public String getScheduler_AssociationEnd_host() {
        return this.elt.getTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_AssociationEnd_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("35b5f770-c43b-4145-95df-1a243679ff36")
    public String getScheduler_AssociationEnd_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_AssociationEnd_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("106683f1-dec3-40ed-98b5-e0cc4b71e338")
    public List<String> getScheduler_AssociationEnd_processingUnits() {
        return this.elt.getTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_AssociationEnd_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("456032df-a2c6-422e-96ad-435dcdd52163")
    public List<String> getScheduler_AssociationEnd_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_AssociationEnd_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("66240ecc-e2ea-4940-aa62-421af4638585")
    public String getScheduler_AssociationEnd_schedPolicy() {
        return this.elt.getTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_AssociationEnd_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("52a28b3c-3fcc-4fd3-add7-b687912c3e54")
    public List<String> getScheduler_AssociationEnd_schedulableResources() {
        return this.elt.getTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_AssociationEnd_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d8fb5316-c86e-4e09-bd2f-5288c4008494")
    public String getScheduler_AssociationEnd_schedule() {
        return this.elt.getTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT);
    }

    @objid ("0b43c287-1672-4d53-b6fd-da77756825fd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_AssociationEnd_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c3f097f7-de21-45c9-8cf9-aaf46253c8fc")
    public boolean isScheduler_AssociationEnd_isPreemptible() {
        return this.elt.isTagged(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("47ecf559-d282-49b6-9ba9-b4f8dd07bc90")
    public void setScheduler_AssociationEnd_host(final String value) {
        this.elt.putTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_AssociationEnd_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("794b69b6-e53b-411e-a563-3897482018e8")
    public void setScheduler_AssociationEnd_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_AssociationEnd_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4573754f-caa2-4bc5-bc1a-5b0eabbac47a")
    public void setScheduler_AssociationEnd_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_AssociationEnd_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("675d2848-5ee3-4f54-b715-c9eb8ba20f38")
    public void setScheduler_AssociationEnd_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_AssociationEnd_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2855f1b4-5326-4547-9880-85930265b22c")
    public void setScheduler_AssociationEnd_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_AssociationEnd_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f7766265-1912-4610-b529-722b250a4e64")
    public void setScheduler_AssociationEnd_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_AssociationEnd_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3deaf8db-ee0b-497a-936e-9e0eebc7476b")
    public void setScheduler_AssociationEnd_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_AssociationEnd_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3011d34d-353a-4002-93c4-9641fdd0870d")
    public void setScheduler_AssociationEnd_schedule(final String value) {
        this.elt.putTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT, value);
    }

    @objid ("c7c57824-0426-45fb-babf-483411df29ca")
    protected SchedulerAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("797a9eb3-d015-4ecd-898b-b5072268d6fd")
    public static final class MdaTypes {
        @objid ("6830ffde-5aa2-44e9-85c6-72f67495be70")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ee7fc6a9-8803-4a7f-b76c-cae7321c954f")
        public static TagType SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("1122c154-6647-43b9-88ad-3e9a7f311cc6")
        public static TagType SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("94aa59aa-4741-45c6-ac00-3dd078b6ac27")
        public static TagType SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("07eb4e56-5636-4cd2-8247-3d886fb4bb9c")
        public static TagType SCHEDULER_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT;

        @objid ("66924761-9db5-486f-a412-4309fd836d60")
        public static TagType SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("a05760fc-1731-4ee7-8b88-6e349b01dc15")
        public static TagType SCHEDULER_ASSOCIATIONEND_HOST_TAGTYPE_ELT;

        @objid ("d9ce916e-fc7c-4616-b4d0-b27dc1386231")
        public static TagType SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("9fe91739-085e-4e50-bb69-41b413056dd6")
        public static TagType SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("7ca991ce-27e1-407d-8550-eb101d591f12")
        private static Stereotype MDAASSOCDEP;

        @objid ("36202bab-b863-48ac-96b1-c7b07de970d8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7ede931b-28b4-4574-b7c6-3a2ad943a0a3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0025b31c-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0025b323-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028156f-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281576-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028157d-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281584-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0028158b-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281592-0ccf-11df-8525-001302895b2b");
            SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00281599-0ccf-11df-8525-001302895b2b");
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
