/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("a14611c2-59b9-4157-b907-6064dbcc77ef")
    public static final String STEREOTYPE_NAME = "Scheduler_AssociationEnd";

    @objid ("71c2ac8b-021d-45a2-b6a5-135bec944668")
    public static final String SCHEDULER_ASSOCIATIONEND_HOST_TAGTYPE = "Scheduler_AssociationEnd_host";

    @objid ("f4959bcd-df8f-4c4f-99e9-0ce93adaa812")
    public static final String SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE = "Scheduler_AssociationEnd_isPreemptible";

    @objid ("b8870179-130a-45ee-bbd3-bf9db7952ede")
    public static final String SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE = "Scheduler_AssociationEnd_otherSchedPolicy";

    @objid ("c14e13e4-cdd0-4a8c-b07e-670ce9139466")
    public static final String SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE = "Scheduler_AssociationEnd_processingUnits";

    @objid ("992c6b48-af84-4566-ad43-216ca9ed6fcd")
    public static final String SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE = "Scheduler_AssociationEnd_protectedSharedResources";

    @objid ("93956157-f746-4425-9641-ff11574eb660")
    public static final String SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE = "Scheduler_AssociationEnd_schedPolicy";

    @objid ("da4dd6ed-df44-4a8f-8973-13462141a107")
    public static final String SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE = "Scheduler_AssociationEnd_schedulableResources";

    @objid ("8cd5d8d4-9a0b-4808-bcd2-1328da7553e2")
    public static final String SCHEDULER_ASSOCIATIONEND_SCHEDULE_TAGTYPE = "Scheduler_AssociationEnd_schedule";

    /**
     * Tells whether a {@link SchedulerAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << Scheduler_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6087192e-6322-49ac-9d8e-162d97d26161")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << Scheduler_AssociationEnd >> then instantiate a {@link SchedulerAssociationEnd} proxy.
     * 
     * @return a {@link SchedulerAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("c0690863-c386-428e-a1bd-34163098691d")
    public static SchedulerAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulerAssociationEnd.STEREOTYPE_NAME);
        return SchedulerAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SchedulerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Scheduler_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SchedulerAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("805a2fd1-9faa-41ca-adc1-ca8d5da20285")
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
    @objid ("b7448b8f-6cac-4752-919c-98ab1175a3c2")
    public static SchedulerAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SchedulerAssociationEnd.canInstantiate(obj))
        	return new SchedulerAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SchedulerAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("47ce6ece-7339-4672-9be5-94f5a3281306")
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
    @objid ("683b289e-2d45-4dae-8d72-e782ea5cdf7d")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'Scheduler_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6e811ca4-20ae-4a52-9032-1d9dda1ca4a2")
    public String getScheduler_AssociationEnd_host() {
        return this.elt.getTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_AssociationEnd_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("790051f6-2e1a-4af1-8a78-ee78ceb83ca2")
    public String getScheduler_AssociationEnd_otherSchedPolicy() {
        return this.elt.getTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_AssociationEnd_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("454714f3-f728-469e-b77f-ba2caf889691")
    public List<String> getScheduler_AssociationEnd_processingUnits() {
        return this.elt.getTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_AssociationEnd_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1aba387d-464d-446d-9656-0500fd83ead2")
    public List<String> getScheduler_AssociationEnd_protectedSharedResources() {
        return this.elt.getTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_AssociationEnd_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8f3e2e96-106e-4f6b-b54e-13da22facba0")
    public String getScheduler_AssociationEnd_schedPolicy() {
        return this.elt.getTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Scheduler_AssociationEnd_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9feb9900-fa75-4dea-9dcb-4b8067dfe172")
    public List<String> getScheduler_AssociationEnd_schedulableResources() {
        return this.elt.getTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Scheduler_AssociationEnd_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("251ddb7b-905a-4faf-ad8c-29b2df591075")
    public String getScheduler_AssociationEnd_schedule() {
        return this.elt.getTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT);
    }

    @objid ("b2e1411c-d760-4915-8a76-9c53313622e3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Scheduler_AssociationEnd_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bfdf89ea-9266-47dd-862e-d99783e5a8a8")
    public boolean isScheduler_AssociationEnd_isPreemptible() {
        return this.elt.isTagged(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Scheduler_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3473c7ca-9adc-49cb-aace-057ff79edf60")
    public void setScheduler_AssociationEnd_host(final String value) {
        this.elt.putTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'Scheduler_AssociationEnd_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ae5e072f-8bf6-46d1-834c-a4e31222dbc9")
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
    @objid ("dd0076e4-efaa-47fb-a02a-d96a6ca29267")
    public void setScheduler_AssociationEnd_otherSchedPolicy(final String value) {
        this.elt.putTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_AssociationEnd_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("53134fcc-bc31-41f6-b820-d2de52e2aecc")
    public void setScheduler_AssociationEnd_processingUnits(final List<String> values) {
        this.elt.putTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Scheduler_AssociationEnd_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e3675c7-a754-4749-a7ed-292a0e7bbcd3")
    public void setScheduler_AssociationEnd_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_AssociationEnd_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09e7fa04-0b6d-4ddf-872e-c3fbbbad59bd")
    public void setScheduler_AssociationEnd_schedPolicy(final String value) {
        this.elt.putTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Scheduler_AssociationEnd_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e0d43b0-4157-4676-b63a-d8b82729db4c")
    public void setScheduler_AssociationEnd_schedulableResources(final List<String> values) {
        this.elt.putTagValues(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Scheduler_AssociationEnd_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d0215adb-b674-4312-a96e-a32788f4cd9f")
    public void setScheduler_AssociationEnd_schedule(final String value) {
        this.elt.putTagValue(SchedulerAssociationEnd.MdaTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT, value);
    }

    @objid ("7d339ae9-f508-4c08-94b6-777735183da0")
    protected SchedulerAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("797a9eb3-d015-4ecd-898b-b5072268d6fd")
    public static final class MdaTypes {
        @objid ("d7a71737-2b88-4455-b5d6-bed1c652b7c3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2c1de132-28b0-422a-95f1-aab2fda6a060")
        public static TagType SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("61c6ad40-d603-4ace-8951-0baa607db6e1")
        public static TagType SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("71df671f-f9f3-4412-a92c-6e96316302d4")
        public static TagType SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("c4d89663-670b-4b82-b067-831a9b12bcaa")
        public static TagType SCHEDULER_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT;

        @objid ("b9cf3b69-2b16-447c-9184-17b9c74691df")
        public static TagType SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("126eab2f-7f0d-4fd3-b574-8b151d84a964")
        public static TagType SCHEDULER_ASSOCIATIONEND_HOST_TAGTYPE_ELT;

        @objid ("15f49866-4e46-4753-a951-98d3774166dd")
        public static TagType SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("4a01f09c-613b-4a1d-aa1b-820ae583e7ed")
        public static TagType SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("31683d34-36a6-46a2-83db-dad7b9a194fc")
        private static Stereotype MDAASSOCDEP;

        @objid ("d4d99435-61a5-4c27-8afe-a15b0f389838")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a8f77b97-a629-4472-aabb-06036de17d11")
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
