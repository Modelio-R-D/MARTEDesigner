/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ComputingResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << GaExecHost_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4f42c6f2-10db-41cf-816a-7f224225fe63")
public class GaExecHostInstance extends ComputingResourceInstance {
    @objid ("792ac968-8ca9-4554-9a9e-c951c8706f25")
    public static final String STEREOTYPE_NAME = "GaExecHost_Instance";

    @objid ("3c7ec565-1d86-4d8c-88f3-d0e203945eff")
    public static final String GAEXECHOST_INSTANCE_CLOCKOVH_TAGTYPE = "GaExecHost_Instance_clockOvh";

    @objid ("2ce8ccac-d7a0-48a5-8755-fde029bad269")
    public static final String GAEXECHOST_INSTANCE_CNTXTSWT_TAGTYPE = "GaExecHost_Instance_cntxtSwT";

    @objid ("93fca424-14e0-4c06-ae62-29107e8e6a01")
    public static final String GAEXECHOST_INSTANCE_COMMRCVOVH_TAGTYPE = "GaExecHost_Instance_commRcvOvh";

    @objid ("588c8d8f-66f2-4a6d-8943-ec4118028442")
    public static final String GAEXECHOST_INSTANCE_COMMTXOVH_TAGTYPE = "GaExecHost_Instance_commTxOvh";

    @objid ("7db14ba1-8470-47a1-9e2b-06b23ac322d4")
    public static final String GAEXECHOST_INSTANCE_HOST_TAGTYPE = "GaExecHost_Instance_host";

    @objid ("b4b4c9cb-cc12-4c92-8aee-f596267be945")
    public static final String GAEXECHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE = "GaExecHost_Instance_isPreemptible";

    @objid ("38dd0c89-9851-458e-b077-111c376e4954")
    public static final String GAEXECHOST_INSTANCE_MEMSIZE_TAGTYPE = "GaExecHost_Instance_memSize";

    @objid ("6c80a939-a756-4721-a7ab-9d3d5f94921d")
    public static final String GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE = "GaExecHost_Instance_otherSchedPolicy";

    @objid ("95ab87fe-111c-4591-991b-66ea367ee2ff")
    public static final String GAEXECHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE = "GaExecHost_Instance_processingUnits";

    @objid ("d5ff2058-d6ca-4d95-9190-b362fca4c053")
    public static final String GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaExecHost_Instance_protectedSharedResources";

    @objid ("4a29fe79-8a1b-466e-b508-302220798211")
    public static final String GAEXECHOST_INSTANCE_SCHEDPOLICY_TAGTYPE = "GaExecHost_Instance_schedPolicy";

    @objid ("993944b3-c231-4530-8d5a-9ca34aaa48b9")
    public static final String GAEXECHOST_INSTANCE_SCHEDPRIRANGE_TAGTYPE = "GaExecHost_Instance_schedPriRange";

    @objid ("3b75d38b-21ff-4171-a1cf-c0aeb4a6245f")
    public static final String GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE = "GaExecHost_Instance_schedulableResources";

    @objid ("894f1cf8-c3f7-497e-a92a-d15d4ef1aef9")
    public static final String GAEXECHOST_INSTANCE_SCHEDULE_TAGTYPE = "GaExecHost_Instance_schedule";

    @objid ("bbb6d2d5-f80f-4cbc-b0c9-b7a58a6650f5")
    public static final String GAEXECHOST_INSTANCE_THROUGHPUT_TAGTYPE = "GaExecHost_Instance_throughput";

    @objid ("8c40d612-dd73-43df-9ea5-77012e0ecf57")
    public static final String GAEXECHOST_INSTANCE_UTILIZATION_TAGTYPE = "GaExecHost_Instance_utilization";

    /**
     * Tells whether a {@link GaExecHostInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << GaExecHost_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("715b6e07-cd24-44ba-b827-fd296fc68775")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << GaExecHost_Instance >> then instantiate a {@link GaExecHostInstance} proxy.
     * 
     * @return a {@link GaExecHostInstance} proxy on the created {@link Instance}.
     */
    @objid ("2a9380a4-4ead-4c36-b773-6aa5cfd45f4b")
    public static GaExecHostInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostInstance.STEREOTYPE_NAME);
        return GaExecHostInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link GaExecHostInstance} proxy from a {@link Instance} stereotyped << GaExecHost_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link GaExecHostInstance} proxy or <i>null</i>.
     */
    @objid ("3cb15c91-06a2-44e1-a40a-d9a9225d2ddf")
    public static GaExecHostInstance instantiate(final Instance obj) {
        return GaExecHostInstance.canInstantiate(obj) ? new GaExecHostInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaExecHostInstance} proxy from a {@link Instance} stereotyped << GaExecHost_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link GaExecHostInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("00c1971f-e947-4293-bd9d-447024599573")
    public static GaExecHostInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (GaExecHostInstance.canInstantiate(obj))
        	return new GaExecHostInstance(obj);
        else
        	throw new IllegalArgumentException("GaExecHostInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6fc21a14-3276-40b6-b84e-40933ab2e01a")
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
        GaExecHostInstance other = (GaExecHostInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("d31bd6b8-3c14-4bd3-b6f1-4036c48ee749")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'GaExecHost_Instance_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f63add37-2aa2-4266-b30d-b3b1a3dd9019")
    public String getGaExecHost_Instance_clockOvh() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_CLOCKOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("29874fc3-ad56-4da4-9450-25aa766c01c6")
    public String getGaExecHost_Instance_cntxtSwT() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_CNTXTSWT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ac5f914-3f65-41c4-9fb1-ccc3143262cd")
    public String getGaExecHost_Instance_commRcvOvh() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_COMMRCVOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5e3d8217-14d7-4eb7-b0be-f4a4a7f52efe")
    public String getGaExecHost_Instance_commTxOvh() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_COMMTXOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ca6bb727-25a6-47e3-89ed-be8435be2a9f")
    public String getGaExecHost_Instance_host() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db7dd65f-d97c-41d5-92d2-bda4b8cf5f52")
    public String getGaExecHost_Instance_memSize() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_MEMSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4c6f0a9d-bf37-4aaa-86e6-9e72043a87ec")
    public String getGaExecHost_Instance_otherSchedPolicy() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Instance_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b136c53f-5268-4984-975d-916a8c991acc")
    public List<String> getGaExecHost_Instance_processingUnits() {
        return this.elt.getTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Instance_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6573e39a-2d4c-4a76-a585-d7e424e6a090")
    public List<String> getGaExecHost_Instance_protectedSharedResources() {
        return this.elt.getTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("81c6ddc7-bb2f-4e05-8bf0-33f81ca13e94")
    public String getGaExecHost_Instance_schedPolicy() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d0a7fb23-8e9a-4685-a027-fe4af1e904fa")
    public String getGaExecHost_Instance_schedPriRange() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDPRIRANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Instance_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dc3f7b69-69f0-4c75-b8c9-61541f5eb998")
    public List<String> getGaExecHost_Instance_schedulableResources() {
        return this.elt.getTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Instance_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1028416a-0588-4caf-a81e-134ef83b6a65")
    public String getGaExecHost_Instance_schedule() {
        return this.elt.getTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Instance_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a2179e1c-c507-434b-a42d-f358c3d8b91b")
    public List<String> getGaExecHost_Instance_throughput() {
        return this.elt.getTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Instance_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d35b4015-3f7a-4835-b254-73634be2611c")
    public List<String> getGaExecHost_Instance_utilization() {
        return this.elt.getTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("8c356db3-9f73-4232-987c-5e2849d81aaf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaExecHost_Instance_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("59174b6e-a189-49e9-9c29-714a917abd7d")
    public boolean isGaExecHost_Instance_isPreemptible() {
        return this.elt.isTagged(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("88c5f6ad-945c-48c6-9e34-23b696af7fb7")
    public void setGaExecHost_Instance_clockOvh(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_CLOCKOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a041b4d7-886b-475a-89b8-6cd660d1a574")
    public void setGaExecHost_Instance_cntxtSwT(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_CNTXTSWT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a26e4961-62e2-41b8-a5b5-49e5b990b568")
    public void setGaExecHost_Instance_commRcvOvh(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_COMMRCVOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1885f0c-db61-4e23-b5f5-8ec5f3f62db2")
    public void setGaExecHost_Instance_commTxOvh(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_COMMTXOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0bbb2b20-6561-42f9-949b-98a332084af8")
    public void setGaExecHost_Instance_host(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaExecHost_Instance_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("78265956-4244-4b21-810d-774d15046feb")
    public void setGaExecHost_Instance_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c0047f1f-8e95-4a0b-a8ff-e58889c1499c")
    public void setGaExecHost_Instance_memSize(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_MEMSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("330d6364-95f8-4381-9afb-eda0c166c79c")
    public void setGaExecHost_Instance_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Instance_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("78778b29-0ad9-4641-a07f-76ddfb6dbf03")
    public void setGaExecHost_Instance_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Instance_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a68482c7-cb4d-4c18-a386-935d785b5794")
    public void setGaExecHost_Instance_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4a232e25-d4eb-4d63-aa40-f3d2112647ea")
    public void setGaExecHost_Instance_schedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8582075-df2c-4aea-8366-36d82481763e")
    public void setGaExecHost_Instance_schedPriRange(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDPRIRANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Instance_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09051bbf-380c-46c5-bc87-3b3ce8d32c4c")
    public void setGaExecHost_Instance_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Instance_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("53cea40d-f3c4-4b28-8767-b841026eee6e")
    public void setGaExecHost_Instance_schedule(final String value) {
        this.elt.putTagValue(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Instance_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6638f94f-f367-4959-93a3-fe01e429f81d")
    public void setGaExecHost_Instance_throughput(final List<String> values) {
        this.elt.putTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Instance_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("28c1c4c6-98e9-4f04-8df9-36e36b2ce050")
    public void setGaExecHost_Instance_utilization(final List<String> values) {
        this.elt.putTagValues(GaExecHostInstance.MdaTypes.GAEXECHOST_INSTANCE_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("1a4a5e19-e949-483a-be27-9f112abc168f")
    protected GaExecHostInstance(final Instance elt) {
        super(elt);
    }

    @objid ("d474ab25-446b-4320-8959-05f5b36b667c")
    public static final class MdaTypes {
        @objid ("b16589c9-45ba-4c7a-b8b4-8cbda2f4f199")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1a417cbd-628a-4efb-8cb7-6e18ea94b928")
        public static TagType GAEXECHOST_INSTANCE_COMMTXOVH_TAGTYPE_ELT;

        @objid ("c19ce8ab-14b4-48a0-ace2-c00a1ed5b637")
        public static TagType GAEXECHOST_INSTANCE_COMMRCVOVH_TAGTYPE_ELT;

        @objid ("b249b913-0d97-4202-80a6-4dfc377d84bf")
        public static TagType GAEXECHOST_INSTANCE_CNTXTSWT_TAGTYPE_ELT;

        @objid ("183241ee-2ed8-493f-b800-2b14250ec914")
        public static TagType GAEXECHOST_INSTANCE_CLOCKOVH_TAGTYPE_ELT;

        @objid ("2807b441-7e1b-4618-8c85-2a3fd7932fe3")
        public static TagType GAEXECHOST_INSTANCE_SCHEDPRIRANGE_TAGTYPE_ELT;

        @objid ("76ffc672-d224-42c5-b06b-56c2552186f3")
        public static TagType GAEXECHOST_INSTANCE_MEMSIZE_TAGTYPE_ELT;

        @objid ("fbc8131a-c7a4-45bd-9872-b742326c01da")
        public static TagType GAEXECHOST_INSTANCE_UTILIZATION_TAGTYPE_ELT;

        @objid ("1280ae00-87b3-44ff-b5e4-a683f3f555e3")
        public static TagType GAEXECHOST_INSTANCE_THROUGHPUT_TAGTYPE_ELT;

        @objid ("63e84850-38f1-4912-b9ba-286ccdb07fef")
        public static TagType GAEXECHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("cbbb32c4-8fe2-426f-962c-e7a4e5a780d8")
        public static TagType GAEXECHOST_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("499f82b8-edf3-4b00-bc1f-35f63e96cf64")
        public static TagType GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("6cf492a2-3282-4d90-a725-987e7100cd07")
        public static TagType GAEXECHOST_INSTANCE_SCHEDULE_TAGTYPE_ELT;

        @objid ("7469af8e-c694-4b72-bc9e-933f91a950f4")
        public static TagType GAEXECHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("8c990fbf-0b0d-4a7e-b280-0bbe47ccb9cf")
        public static TagType GAEXECHOST_INSTANCE_HOST_TAGTYPE_ELT;

        @objid ("a3b7b72d-1182-4511-843a-9cff74c1f016")
        public static TagType GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("1b00f61b-4ea3-4564-9c96-a7d8b2bf1364")
        public static TagType GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("5dd4889e-1ef0-495f-841a-5eafa66ea4c9")
        private static Stereotype MDAASSOCDEP;

        @objid ("e26c74c3-0629-4792-85fa-df4c1652a77c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0b959eef-2c91-4bc2-bfe1-9599d787d0c6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0360f848-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_COMMTXOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635a9a-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_COMMRCVOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635aa1-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_CNTXTSWT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bce7-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_CLOCKOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcee-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_SCHEDPRIRANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcf5-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_MEMSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcfc-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bd03-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bd0a-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_INSTANCE_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c0-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_INSTANCE_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c1-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c2-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_INSTANCE_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c3-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_INSTANCE_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c4-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_INSTANCE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c5-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c6-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1faa28c7-16ea-11df-b92a-0014222a9f79");
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
