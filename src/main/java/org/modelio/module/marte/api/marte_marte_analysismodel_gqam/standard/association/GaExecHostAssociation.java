/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ComputingResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << GaExecHost_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6ac892b6-d87c-4bc8-9e93-94fa637f7c16")
public class GaExecHostAssociation extends ComputingResourceAssociation {
    @objid ("60a4f373-4a02-4540-93ef-f36098a68576")
    public static final String STEREOTYPE_NAME = "GaExecHost_Association";

    @objid ("240909a4-f972-45f0-a2cc-fdd6e0409dda")
    public static final String GAEXECHOST_ASSOCIATION_CLOCKOVH_TAGTYPE = "GaExecHost_Association_clockOvh";

    @objid ("8e1b4b2e-0697-4378-aab9-1990c73b0db8")
    public static final String GAEXECHOST_ASSOCIATION_CNTXTSWT_TAGTYPE = "GaExecHost_Association_cntxtSwT";

    @objid ("8a865dc2-40d1-411b-8256-52f14591b1cf")
    public static final String GAEXECHOST_ASSOCIATION_COMMRCVOVH_TAGTYPE = "GaExecHost_Association_commRcvOvh";

    @objid ("72c2a540-c462-4420-bfc5-5dc1c4136059")
    public static final String GAEXECHOST_ASSOCIATION_COMMTXOVH_TAGTYPE = "GaExecHost_Association_commTxOvh";

    @objid ("e8026202-01d9-497b-9325-9593d650a307")
    public static final String GAEXECHOST_ASSOCIATION_HOST_TAGTYPE = "GaExecHost_Association_host";

    @objid ("5ada8b42-fb4a-4293-8030-f52c75b81772")
    public static final String GAEXECHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE = "GaExecHost_Association_isPreemptible";

    @objid ("dbd24f10-46c2-49c9-a593-1300118a3fef")
    public static final String GAEXECHOST_ASSOCIATION_MEMSIZE_TAGTYPE = "GaExecHost_Association_memSize";

    @objid ("3c61cb52-9f56-4238-a0bf-14219c472b43")
    public static final String GAEXECHOST_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE = "GaExecHost_Association_otherSchedPolicy";

    @objid ("73f7aafd-fcfa-4364-acbf-38a5590f4ae0")
    public static final String GAEXECHOST_ASSOCIATION_PROCESSINGUNITS_TAGTYPE = "GaExecHost_Association_processingUnits";

    @objid ("4997a78b-06a3-44f4-9d35-2574c21af2d0")
    public static final String GAEXECHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaExecHost_Association_protectedSharedResources";

    @objid ("5a57de95-2cc3-4fa7-86d0-c9a120c74229")
    public static final String GAEXECHOST_ASSOCIATION_SCHEDPOLICY_TAGTYPE = "GaExecHost_Association_schedPolicy";

    @objid ("69a8ed75-44d4-480c-9042-2aca32dc4cbb")
    public static final String GAEXECHOST_ASSOCIATION_SCHEDPRIRANGE_TAGTYPE = "GaExecHost_Association_schedPriRange";

    @objid ("37e11620-e8dc-4f67-987a-5e3751eb5cc4")
    public static final String GAEXECHOST_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE = "GaExecHost_Association_schedulableResources";

    @objid ("415a0552-4082-4c3b-ae98-5dc3d55ad89f")
    public static final String GAEXECHOST_ASSOCIATION_SCHEDULE_TAGTYPE = "GaExecHost_Association_schedule";

    @objid ("fb8c092e-ad59-46b4-92b6-88922a582ca1")
    public static final String GAEXECHOST_ASSOCIATION_THROUGHPUT_TAGTYPE = "GaExecHost_Association_throughput";

    @objid ("77ce84e8-f8e9-4a25-be80-40a71f82f5d3")
    public static final String GAEXECHOST_ASSOCIATION_UTILIZATION_TAGTYPE = "GaExecHost_Association_utilization";

    /**
     * Tells whether a {@link GaExecHostAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << GaExecHost_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("06af7f02-059c-466f-be26-625cf6d44de1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << GaExecHost_Association >> then instantiate a {@link GaExecHostAssociation} proxy.
     * 
     * @return a {@link GaExecHostAssociation} proxy on the created {@link Association}.
     */
    @objid ("31a4375f-3875-41c2-95e7-ee1fefccc75f")
    public static GaExecHostAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostAssociation.STEREOTYPE_NAME);
        return GaExecHostAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link GaExecHostAssociation} proxy from a {@link Association} stereotyped << GaExecHost_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link GaExecHostAssociation} proxy or <i>null</i>.
     */
    @objid ("049c76cb-a542-4368-a5ef-ba5f22f7cd90")
    public static GaExecHostAssociation instantiate(final Association obj) {
        return GaExecHostAssociation.canInstantiate(obj) ? new GaExecHostAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaExecHostAssociation} proxy from a {@link Association} stereotyped << GaExecHost_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link GaExecHostAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b620591d-0bbe-43ef-a225-ca17b446e6ab")
    public static GaExecHostAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (GaExecHostAssociation.canInstantiate(obj))
        	return new GaExecHostAssociation(obj);
        else
        	throw new IllegalArgumentException("GaExecHostAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("54fb5295-6b7c-44c3-8921-46ea8657d2aa")
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
        GaExecHostAssociation other = (GaExecHostAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("b1dc976b-4d16-4afe-bc5c-d3c623e5706c")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'GaExecHost_Association_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a366a45e-8cb8-404a-b84d-029032dc7a7b")
    public String getGaExecHost_Association_clockOvh() {
        return this.elt.getTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_CLOCKOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Association_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24e014a3-3556-406e-aa55-f7cd6cb1f8f4")
    public String getGaExecHost_Association_cntxtSwT() {
        return this.elt.getTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_CNTXTSWT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Association_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aed2032b-c77d-45c9-8535-390acf624d02")
    public String getGaExecHost_Association_commRcvOvh() {
        return this.elt.getTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_COMMRCVOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Association_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d853ed9b-abb5-4fb6-ba58-e5f9779c2710")
    public String getGaExecHost_Association_commTxOvh() {
        return this.elt.getTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_COMMTXOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6c0b6892-4878-47d2-bcfa-ffec1ebf4c64")
    public String getGaExecHost_Association_host() {
        return this.elt.getTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Association_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f4c7cd5b-f601-482a-bb58-5838889a0932")
    public String getGaExecHost_Association_memSize() {
        return this.elt.getTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_MEMSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Association_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0cf49685-d177-4cd8-8d55-d722f72e7ef2")
    public String getGaExecHost_Association_otherSchedPolicy() {
        return this.elt.getTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Association_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cb00b221-5192-4397-88ca-b4fe9358c74e")
    public List<String> getGaExecHost_Association_processingUnits() {
        return this.elt.getTagValues(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Association_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("31568747-3b74-4b5a-98b6-bad4cc3da293")
    public List<String> getGaExecHost_Association_protectedSharedResources() {
        return this.elt.getTagValues(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Association_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1a0c1079-28cb-4cad-8af6-ab299a4cfa69")
    public String getGaExecHost_Association_schedPolicy() {
        return this.elt.getTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Association_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2ffad00-dd57-4701-acf7-06ec1c09e327")
    public String getGaExecHost_Association_schedPriRange() {
        return this.elt.getTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_SCHEDPRIRANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Association_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a9c41e6f-301f-4911-b8df-b6076ad0ca8b")
    public List<String> getGaExecHost_Association_schedulableResources() {
        return this.elt.getTagValues(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Association_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("421309e3-3bf2-466d-b183-5fd7899a9e02")
    public String getGaExecHost_Association_schedule() {
        return this.elt.getTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Association_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1cdf4030-777b-4b2a-9efc-dac7be838098")
    public List<String> getGaExecHost_Association_throughput() {
        return this.elt.getTagValues(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Association_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ce0e8d57-6d83-4929-8a34-64cec82d06ff")
    public List<String> getGaExecHost_Association_utilization() {
        return this.elt.getTagValues(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("effafbf9-b2fc-4923-92e7-0228dcc77097")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaExecHost_Association_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("81d18f6a-bf22-4b8b-a34d-7a7f750d65c1")
    public boolean isGaExecHost_Association_isPreemptible() {
        return this.elt.isTagged(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Association_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f81ef3dc-cace-4b40-a6fe-b0fb16ba7694")
    public void setGaExecHost_Association_clockOvh(final String value) {
        this.elt.putTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_CLOCKOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Association_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2cbb1614-f69e-45ff-90e7-62b5ef68115a")
    public void setGaExecHost_Association_cntxtSwT(final String value) {
        this.elt.putTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_CNTXTSWT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Association_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("de84fdfb-d2c6-416a-8f2d-e48c520e0440")
    public void setGaExecHost_Association_commRcvOvh(final String value) {
        this.elt.putTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_COMMRCVOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Association_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09145315-11fb-4cef-84d5-fed5f7e5c1dd")
    public void setGaExecHost_Association_commTxOvh(final String value) {
        this.elt.putTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_COMMTXOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9ba89b09-9eac-4cc4-8da7-bc09b8681ca0")
    public void setGaExecHost_Association_host(final String value) {
        this.elt.putTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaExecHost_Association_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b2601185-d787-4a49-b363-9993ea817c61")
    public void setGaExecHost_Association_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Association_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e6bb2d7a-fd71-47fb-825a-babe8a00cb04")
    public void setGaExecHost_Association_memSize(final String value) {
        this.elt.putTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_MEMSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Association_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cc72fb89-65ae-4583-8415-4de201430f61")
    public void setGaExecHost_Association_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Association_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e03892a4-dc3e-42c7-bcc6-7b52732e0cea")
    public void setGaExecHost_Association_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Association_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76cd5aff-c5b0-4ec3-b292-4188ff049043")
    public void setGaExecHost_Association_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Association_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2d21297d-ad34-4866-9560-f96c8ee160f6")
    public void setGaExecHost_Association_schedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Association_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d89e33a3-630a-4d74-87c1-58162d3072cf")
    public void setGaExecHost_Association_schedPriRange(final String value) {
        this.elt.putTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_SCHEDPRIRANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Association_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("56e10540-91f2-43be-8c83-1ff44d7d3674")
    public void setGaExecHost_Association_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Association_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("61df6c41-222b-4a3a-8462-3f013aa16cff")
    public void setGaExecHost_Association_schedule(final String value) {
        this.elt.putTagValue(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Association_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ccfefd00-3db9-419b-8f58-5990052ba0df")
    public void setGaExecHost_Association_throughput(final List<String> values) {
        this.elt.putTagValues(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Association_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("30c58c37-7ca4-4faf-8372-ab9643e1e92e")
    public void setGaExecHost_Association_utilization(final List<String> values) {
        this.elt.putTagValues(GaExecHostAssociation.MdaTypes.GAEXECHOST_ASSOCIATION_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("62cc2a57-c125-405e-857f-6ef77a343744")
    protected GaExecHostAssociation(final Association elt) {
        super(elt);
    }

    @objid ("7a9ea0a4-5350-475c-91ed-dea5eb1493b5")
    public static final class MdaTypes {
        @objid ("cb21e833-eb23-4bc8-a98a-91700617e6b5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a35da654-4a6a-4c20-8dfb-56ebc8bd5729")
        public static TagType GAEXECHOST_ASSOCIATION_COMMTXOVH_TAGTYPE_ELT;

        @objid ("9775a198-4063-449a-b55c-e5520c1b6cd2")
        public static TagType GAEXECHOST_ASSOCIATION_COMMRCVOVH_TAGTYPE_ELT;

        @objid ("49df162b-b6ad-43a6-ac9b-96590073b30d")
        public static TagType GAEXECHOST_ASSOCIATION_CNTXTSWT_TAGTYPE_ELT;

        @objid ("b06463e9-741e-4ce3-8464-1481436d33bf")
        public static TagType GAEXECHOST_ASSOCIATION_CLOCKOVH_TAGTYPE_ELT;

        @objid ("98ce4700-141f-446e-a2bc-204c48fb8a7c")
        public static TagType GAEXECHOST_ASSOCIATION_SCHEDPRIRANGE_TAGTYPE_ELT;

        @objid ("61663955-0938-403b-bea9-f755f5082312")
        public static TagType GAEXECHOST_ASSOCIATION_MEMSIZE_TAGTYPE_ELT;

        @objid ("e0006c48-4287-4466-a086-d8d635c57a46")
        public static TagType GAEXECHOST_ASSOCIATION_UTILIZATION_TAGTYPE_ELT;

        @objid ("b40782db-e8c7-49f0-8f34-ccedf7698eb7")
        public static TagType GAEXECHOST_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT;

        @objid ("9aa52eff-a799-488f-a79f-7a4b1d7c01bd")
        public static TagType GAEXECHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("d73a6e13-4817-4841-84ed-67b242066bea")
        public static TagType GAEXECHOST_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("63304d43-fe76-4729-86e3-8dd831dfd4ac")
        public static TagType GAEXECHOST_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("1a0211a7-06fc-4045-b496-431e14890bee")
        public static TagType GAEXECHOST_ASSOCIATION_SCHEDULE_TAGTYPE_ELT;

        @objid ("7a4d342f-76ee-4ac9-b410-a0b116bbe31a")
        public static TagType GAEXECHOST_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("26b71420-2c97-448c-89e9-c38620fdd52c")
        public static TagType GAEXECHOST_ASSOCIATION_HOST_TAGTYPE_ELT;

        @objid ("95e09441-abfb-4655-83a9-92e3f1324dd7")
        public static TagType GAEXECHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("bc0350e5-33ad-4efe-8742-ddd92d39bf38")
        public static TagType GAEXECHOST_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("91fc6e09-3b22-4776-bdd7-6035b4f72374")
        private static Stereotype MDAASSOCDEP;

        @objid ("9cf8e1ae-0968-46b5-8026-56da80299c7f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("562236e8-3932-4383-a21d-252f015ce08a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "36176210-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_ASSOCIATION_COMMTXOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "36176211-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_ASSOCIATION_COMMRCVOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "36176212-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_ASSOCIATION_CNTXTSWT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "36176213-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_ASSOCIATION_CLOCKOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "36176214-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_ASSOCIATION_SCHEDPRIRANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "36176215-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_ASSOCIATION_MEMSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "36176216-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_ASSOCIATION_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "36176217-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "36176218-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1eaa65f2-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1eaa65f3-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1eaa65f4-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ASSOCIATION_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1eaa65f5-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1eaa65f6-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ASSOCIATION_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1eaa65f7-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1eaa65f8-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1eaa65f9-16ea-11df-b92a-0014222a9f79");
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
