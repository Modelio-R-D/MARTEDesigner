/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ComputingResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << GaExecHost_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("450b4a01-f6d1-4a4e-b90b-80fd7f8f9196")
public class GaExecHostLifeline extends ComputingResourceLifeline {
    @objid ("37730266-fc0f-48fe-865f-d0c242112205")
    public static final String STEREOTYPE_NAME = "GaExecHost_Lifeline";

    @objid ("842a0eb1-0567-4aef-bcb3-45c43ad6af68")
    public static final String GAEXECHOST_LIFELINE_CLOCKOVH_TAGTYPE = "GaExecHost_Lifeline_clockOvh";

    @objid ("373db61c-c081-4180-8caa-893716810b48")
    public static final String GAEXECHOST_LIFELINE_CNTXTSWT_TAGTYPE = "GaExecHost_Lifeline_cntxtSwT";

    @objid ("b6ceaf48-ec8f-4f23-bbec-a59bcb7932cf")
    public static final String GAEXECHOST_LIFELINE_COMMRCVOVH_TAGTYPE = "GaExecHost_Lifeline_commRcvOvh";

    @objid ("d4ea689f-12b4-4e8b-8bab-bed44b54f809")
    public static final String GAEXECHOST_LIFELINE_COMMTXOVH_TAGTYPE = "GaExecHost_Lifeline_commTxOvh";

    @objid ("c861f8e6-336d-4d03-bb1e-119e7b1ed203")
    public static final String GAEXECHOST_LIFELINE_HOST_TAGTYPE = "GaExecHost_Lifeline_host";

    @objid ("491b22b0-0c6d-459c-b646-6859c685f295")
    public static final String GAEXECHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE = "GaExecHost_Lifeline_isPreemptible";

    @objid ("707c0f43-2ba2-4e1f-9852-10ccd6f5c4f5")
    public static final String GAEXECHOST_LIFELINE_MEMSIZE_TAGTYPE = "GaExecHost_Lifeline_memSize";

    @objid ("42febfce-594a-4896-868c-f3917604d295")
    public static final String GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE = "GaExecHost_Lifeline_otherSchedPolicy";

    @objid ("bef92bbf-5e83-47be-9c2a-30a6e2fea404")
    public static final String GAEXECHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE = "GaExecHost_Lifeline_processingUnits";

    @objid ("173a3255-e4c9-4a99-8b2a-9e42cf59d999")
    public static final String GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaExecHost_Lifeline_protectedSharedResources";

    @objid ("fda8a723-e9c6-4252-a1fd-e5cc691c3a89")
    public static final String GAEXECHOST_LIFELINE_SCHEDPOLICY_TAGTYPE = "GaExecHost_Lifeline_schedPolicy";

    @objid ("fb788150-0d88-40af-8be6-0501a27e3027")
    public static final String GAEXECHOST_LIFELINE_SCHEDPRIRANGE_TAGTYPE = "GaExecHost_Lifeline_schedPriRange";

    @objid ("9c380231-0b56-48cf-b380-09330630f9e4")
    public static final String GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE = "GaExecHost_Lifeline_schedulableResources";

    @objid ("c0ff9d49-b38c-4912-b3e9-ed51e460c8bc")
    public static final String GAEXECHOST_LIFELINE_SCHEDULE_TAGTYPE = "GaExecHost_Lifeline_schedule";

    @objid ("0f7190ad-769c-40de-86cb-0dada36ab389")
    public static final String GAEXECHOST_LIFELINE_THROUGHPUT_TAGTYPE = "GaExecHost_Lifeline_throughput";

    @objid ("a08a1d1f-5e11-4c58-ab2c-3c1ae5f07dcc")
    public static final String GAEXECHOST_LIFELINE_UTILIZATION_TAGTYPE = "GaExecHost_Lifeline_utilization";

    /**
     * Tells whether a {@link GaExecHostLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << GaExecHost_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9bf29d57-dfe6-427a-827f-b4780f0fd9f7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << GaExecHost_Lifeline >> then instantiate a {@link GaExecHostLifeline} proxy.
     * 
     * @return a {@link GaExecHostLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("98856d62-0595-4ff3-b3b1-13073b3a535b")
    public static GaExecHostLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostLifeline.STEREOTYPE_NAME);
        return GaExecHostLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link GaExecHostLifeline} proxy from a {@link Lifeline} stereotyped << GaExecHost_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link GaExecHostLifeline} proxy or <i>null</i>.
     */
    @objid ("85bde176-5582-4165-ab3e-a8c0be93cfbd")
    public static GaExecHostLifeline instantiate(final Lifeline obj) {
        return GaExecHostLifeline.canInstantiate(obj) ? new GaExecHostLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaExecHostLifeline} proxy from a {@link Lifeline} stereotyped << GaExecHost_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link GaExecHostLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4501c1f6-3c5f-4e16-a3d4-0ab2212eb2d2")
    public static GaExecHostLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (GaExecHostLifeline.canInstantiate(obj))
        	return new GaExecHostLifeline(obj);
        else
        	throw new IllegalArgumentException("GaExecHostLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2e119f29-844b-42d8-b9d0-11879bf3d141")
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
        GaExecHostLifeline other = (GaExecHostLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("41700f00-22cc-418e-958a-4bffc673c180")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("673c740a-7bb0-4397-a3a2-91f57bab5822")
    public String getGaExecHost_Lifeline_clockOvh() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_CLOCKOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c8e7d9d-815e-4a30-9b1c-c5df8e41f090")
    public String getGaExecHost_Lifeline_cntxtSwT() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_CNTXTSWT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3d2f0feb-67cf-454d-8fa7-723b97425329")
    public String getGaExecHost_Lifeline_commRcvOvh() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_COMMRCVOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("554745dd-a3d6-4c2e-8caa-b893681c5c31")
    public String getGaExecHost_Lifeline_commTxOvh() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_COMMTXOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("599c11c0-408b-48cc-88d7-eaaaaf8dd421")
    public String getGaExecHost_Lifeline_host() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("933fff3a-f1bc-4579-a507-35ebfe87061c")
    public String getGaExecHost_Lifeline_memSize() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_MEMSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("02b709f9-4263-4363-a99b-f23d2c02b6c9")
    public String getGaExecHost_Lifeline_otherSchedPolicy() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Lifeline_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e65aecd7-ddf3-475f-b668-2b0f38ff034f")
    public List<String> getGaExecHost_Lifeline_processingUnits() {
        return this.elt.getTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Lifeline_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3ab102cf-3238-4143-8a92-9adc29a5d8d9")
    public List<String> getGaExecHost_Lifeline_protectedSharedResources() {
        return this.elt.getTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69819909-2a47-406a-9e02-891903c11560")
    public String getGaExecHost_Lifeline_schedPolicy() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0f47d7d9-f135-4568-8c03-eb298d6c6b76")
    public String getGaExecHost_Lifeline_schedPriRange() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDPRIRANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Lifeline_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6685051b-22e0-4a8c-bf11-9121987309d6")
    public List<String> getGaExecHost_Lifeline_schedulableResources() {
        return this.elt.getTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Lifeline_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("704c11a8-f3e4-4d5b-8123-3e1d41f72b42")
    public String getGaExecHost_Lifeline_schedule() {
        return this.elt.getTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Lifeline_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e8d37768-9c0a-41b7-8c28-68cc38e6356e")
    public List<String> getGaExecHost_Lifeline_throughput() {
        return this.elt.getTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Lifeline_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("265c36b6-835c-454a-bf41-6e62a4ca9f7f")
    public List<String> getGaExecHost_Lifeline_utilization() {
        return this.elt.getTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("7157fd96-6e06-4f24-bc45-d061f567b5b6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaExecHost_Lifeline_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f9558c15-c1fb-4e07-b5ba-6b475b4fa60c")
    public boolean isGaExecHost_Lifeline_isPreemptible() {
        return this.elt.isTagged(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("240c381d-1187-4385-8529-2903be4c6321")
    public void setGaExecHost_Lifeline_clockOvh(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_CLOCKOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bc363737-e58e-4af2-9ad0-b2f253687b37")
    public void setGaExecHost_Lifeline_cntxtSwT(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_CNTXTSWT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c6b1206-f8e0-4fac-b8d8-266d904c4d51")
    public void setGaExecHost_Lifeline_commRcvOvh(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_COMMRCVOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d09a4cb-d944-4eca-93b1-556644fe604f")
    public void setGaExecHost_Lifeline_commTxOvh(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_COMMTXOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a9cc0af9-8996-4ba5-8436-dd1a55c34e0e")
    public void setGaExecHost_Lifeline_host(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaExecHost_Lifeline_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7ddef6d8-edd4-4e46-acc2-d3d3d32f7cd4")
    public void setGaExecHost_Lifeline_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("83ff8817-052b-4664-99ba-0af795acd2dd")
    public void setGaExecHost_Lifeline_memSize(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_MEMSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a24215e2-66fa-457c-8904-71bd469b0255")
    public void setGaExecHost_Lifeline_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Lifeline_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7ff3c1c0-e862-4598-89e9-b805325ee12b")
    public void setGaExecHost_Lifeline_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Lifeline_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("989db46b-7407-4dd5-9ffd-6cdf5c82df8b")
    public void setGaExecHost_Lifeline_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("84e81986-33cd-4bb6-af48-51c518ad63ab")
    public void setGaExecHost_Lifeline_schedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b378c0cf-866c-41dd-9a7d-9089d5ff7f16")
    public void setGaExecHost_Lifeline_schedPriRange(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDPRIRANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Lifeline_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c182b920-598e-48a4-ba46-e1a69e16bc74")
    public void setGaExecHost_Lifeline_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Lifeline_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bfb84487-8d75-4d3c-9aa3-edbbdf7f4f4f")
    public void setGaExecHost_Lifeline_schedule(final String value) {
        this.elt.putTagValue(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Lifeline_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0ec52e07-db3d-4194-8cd5-986a7fdde2dd")
    public void setGaExecHost_Lifeline_throughput(final List<String> values) {
        this.elt.putTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Lifeline_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("04b66778-f0d6-4410-9271-2c2472050baa")
    public void setGaExecHost_Lifeline_utilization(final List<String> values) {
        this.elt.putTagValues(GaExecHostLifeline.MdaTypes.GAEXECHOST_LIFELINE_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("d846f70b-1d5d-4024-9394-ac4e3612a792")
    protected GaExecHostLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("f2bd50e3-8afc-421b-b40b-a69071973502")
    public static final class MdaTypes {
        @objid ("65c170c2-4fe4-4079-be47-bed43f5a40d0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6fa56cd8-250a-48f1-8757-b30b397d3554")
        public static TagType GAEXECHOST_LIFELINE_COMMTXOVH_TAGTYPE_ELT;

        @objid ("e459058c-517c-4d5a-be94-806d300242a0")
        public static TagType GAEXECHOST_LIFELINE_COMMRCVOVH_TAGTYPE_ELT;

        @objid ("36e8e2c4-be20-4f37-9562-a381fdb1dfdd")
        public static TagType GAEXECHOST_LIFELINE_CNTXTSWT_TAGTYPE_ELT;

        @objid ("d6bc73aa-37fa-4950-87cb-5baf56213af6")
        public static TagType GAEXECHOST_LIFELINE_CLOCKOVH_TAGTYPE_ELT;

        @objid ("3736acaa-a4b1-47ee-b862-eef2aabc989f")
        public static TagType GAEXECHOST_LIFELINE_SCHEDPRIRANGE_TAGTYPE_ELT;

        @objid ("348ed09a-547d-4be1-b873-af712ffced28")
        public static TagType GAEXECHOST_LIFELINE_MEMSIZE_TAGTYPE_ELT;

        @objid ("3389c278-20ae-48c0-9212-acdcad8e5cf2")
        public static TagType GAEXECHOST_LIFELINE_UTILIZATION_TAGTYPE_ELT;

        @objid ("f3a2bf16-e3c5-4365-bc91-af917b84cf2a")
        public static TagType GAEXECHOST_LIFELINE_THROUGHPUT_TAGTYPE_ELT;

        @objid ("5345ed24-c902-4f99-a9dd-be0057e752ac")
        public static TagType GAEXECHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("1046a3e9-d3aa-4211-b33b-3c8912c49316")
        public static TagType GAEXECHOST_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("fb8d6a46-2df9-4fc7-a7cb-9626e068b7d4")
        public static TagType GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("eb94273a-0e78-4ba1-a1c5-5efe7e5eb1e7")
        public static TagType GAEXECHOST_LIFELINE_SCHEDULE_TAGTYPE_ELT;

        @objid ("e05678a7-1dba-499b-a6a6-5ff779a68402")
        public static TagType GAEXECHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("d8cc03ea-1beb-4116-8357-e63543aacacb")
        public static TagType GAEXECHOST_LIFELINE_HOST_TAGTYPE_ELT;

        @objid ("53d96883-9e9f-4cfb-921d-8a06cc586e29")
        public static TagType GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("684e373a-407e-4a22-8712-bf5229f4ae7e")
        public static TagType GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("2c432498-aa65-40fb-a913-749ac91fbc53")
        private static Stereotype MDAASSOCDEP;

        @objid ("c2033072-6eee-45c3-a276-af9fafe466cf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e0491af9-633e-4da9-9ec0-49527a3279ab")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "363d87c0-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_COMMTXOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c1-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_COMMRCVOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c2-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_CNTXTSWT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c3-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_CLOCKOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c4-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_SCHEDPRIRANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c5-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_MEMSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c6-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c7-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "363d87c8-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_LIFELINE_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d82009a-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LIFELINE_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d82009b-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d82009c-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LIFELINE_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d82009d-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LIFELINE_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d82009e-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LIFELINE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d82009f-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d8200a0-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1d8200a1-16ea-11df-b92a-0014222a9f79");
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
