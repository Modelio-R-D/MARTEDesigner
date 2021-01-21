/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ComputingResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << GaExecHost_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("de375656-246a-4517-bed9-b87b730fb348")
public class GaExecHostLink extends ComputingResourceLink {
    @objid ("b6add2cc-0fe3-4523-9b92-7a4b187f1cb1")
    public static final String STEREOTYPE_NAME = "GaExecHost_Link";

    @objid ("d509a6ab-2fd6-4a6b-afe6-f32bcf75dd2d")
    public static final String GAEXECHOST_LINK_CLOCKOVH_TAGTYPE = "GaExecHost_Link_clockOvh";

    @objid ("869bbafc-e7ec-4be2-97ca-3dc904a8694d")
    public static final String GAEXECHOST_LINK_CNTXTSWT_TAGTYPE = "GaExecHost_Link_cntxtSwT";

    @objid ("70fb7476-1501-4eec-8c8b-d1761fbf97ea")
    public static final String GAEXECHOST_LINK_COMMRCVOVH_TAGTYPE = "GaExecHost_Link_commRcvOvh";

    @objid ("c9a113ff-f720-4e20-8623-8b572a4e10d6")
    public static final String GAEXECHOST_LINK_COMMTXOVH_TAGTYPE = "GaExecHost_Link_commTxOvh";

    @objid ("0cfe18b0-655d-4725-b1d8-173cd379f89d")
    public static final String GAEXECHOST_LINK_HOST_TAGTYPE = "GaExecHost_Link_host";

    @objid ("85c0c3d2-aaa7-4dec-bfaf-f3c638787a86")
    public static final String GAEXECHOST_LINK_ISPREEMPTIBLE_TAGTYPE = "GaExecHost_Link_isPreemptible";

    @objid ("86da86bd-0ab8-4608-b99e-d0febd93a726")
    public static final String GAEXECHOST_LINK_MEMSIZE_TAGTYPE = "GaExecHost_Link_memSize";

    @objid ("80c22848-8b88-43d0-a26d-dff0ca73c596")
    public static final String GAEXECHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE = "GaExecHost_Link_otherSchedPolicy";

    @objid ("0c406166-96d2-4d23-9fdb-e6cac0aaaaf9")
    public static final String GAEXECHOST_LINK_PROCESSINGUNITS_TAGTYPE = "GaExecHost_Link_processingUnits";

    @objid ("aa9bb4b0-6388-45a7-aaa6-2d113284cac6")
    public static final String GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaExecHost_Link_protectedSharedResources";

    @objid ("9d9a7892-ba9f-472c-80d0-c78ce24d5ab5")
    public static final String GAEXECHOST_LINK_SCHEDPOLICY_TAGTYPE = "GaExecHost_Link_schedPolicy";

    @objid ("8d5ef251-154b-443d-b651-dc4ab5a74c50")
    public static final String GAEXECHOST_LINK_SCHEDPRIRANGE_TAGTYPE = "GaExecHost_Link_schedPriRange";

    @objid ("d2a464e5-486b-4e21-980f-d8f193e1593d")
    public static final String GAEXECHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE = "GaExecHost_Link_schedulableResources";

    @objid ("121a7d1d-e460-47a2-bb38-1122d7f82a16")
    public static final String GAEXECHOST_LINK_SCHEDULE_TAGTYPE = "GaExecHost_Link_schedule";

    @objid ("16a58d8b-b90b-4837-8c95-12b2ae02f9c7")
    public static final String GAEXECHOST_LINK_THROUGHPUT_TAGTYPE = "GaExecHost_Link_throughput";

    @objid ("63b9557c-5949-4180-a5eb-881081202e36")
    public static final String GAEXECHOST_LINK_UTILIZATION_TAGTYPE = "GaExecHost_Link_utilization";

    /**
     * Tells whether a {@link GaExecHostLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << GaExecHost_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8ccffc75-914c-40bb-a7b1-9c981981cb44")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << GaExecHost_Link >> then instantiate a {@link GaExecHostLink} proxy.
     * 
     * @return a {@link GaExecHostLink} proxy on the created {@link Link}.
     */
    @objid ("88cfd118-4f23-4b35-9c9b-7c1168db16af")
    public static GaExecHostLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostLink.STEREOTYPE_NAME);
        return GaExecHostLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link GaExecHostLink} proxy from a {@link Link} stereotyped << GaExecHost_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link GaExecHostLink} proxy or <i>null</i>.
     */
    @objid ("eebbb733-cddd-4998-a75d-38adc8c15774")
    public static GaExecHostLink instantiate(final Link obj) {
        return GaExecHostLink.canInstantiate(obj) ? new GaExecHostLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaExecHostLink} proxy from a {@link Link} stereotyped << GaExecHost_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link GaExecHostLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6681899b-1de4-48cb-9582-79d725c91bec")
    public static GaExecHostLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (GaExecHostLink.canInstantiate(obj))
        	return new GaExecHostLink(obj);
        else
        	throw new IllegalArgumentException("GaExecHostLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7b189548-747a-4d83-b53c-841dda5375e5")
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
        GaExecHostLink other = (GaExecHostLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("646c6a04-a0cb-49a4-a4b1-71f1d5fc9e12")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'GaExecHost_Link_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("850dd06e-2f82-4af2-b707-29bd78cdbaac")
    public String getGaExecHost_Link_clockOvh() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_CLOCKOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("80cf1136-ad44-47fe-8f6c-188d4757d74d")
    public String getGaExecHost_Link_cntxtSwT() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_CNTXTSWT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dee83d61-8c49-45f0-b813-67c63758e8ed")
    public String getGaExecHost_Link_commRcvOvh() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_COMMRCVOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e5b54ee8-e71c-4973-becf-257f1dc28caa")
    public String getGaExecHost_Link_commTxOvh() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_COMMTXOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d7f8798f-0576-4cdd-b2db-b71f38d9f0d8")
    public String getGaExecHost_Link_host() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("512185d0-638c-4121-8332-21b7afb05f03")
    public String getGaExecHost_Link_memSize() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_MEMSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("edec179e-12a3-44de-b9e2-2f2b0f35f68e")
    public String getGaExecHost_Link_otherSchedPolicy() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Link_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6acecf3b-9607-4b3c-b9aa-c8207b418f2f")
    public List<String> getGaExecHost_Link_processingUnits() {
        return this.elt.getTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Link_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e51ea816-5cc6-440e-baf3-dc9da6589218")
    public List<String> getGaExecHost_Link_protectedSharedResources() {
        return this.elt.getTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aa2ba788-d50f-4ab5-bf22-a7a4b510194e")
    public String getGaExecHost_Link_schedPolicy() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9ee4db3d-ce47-46f4-9249-110d5ee36d0f")
    public String getGaExecHost_Link_schedPriRange() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDPRIRANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Link_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d023ca74-d17e-482f-ade6-a84fbb968cb4")
    public List<String> getGaExecHost_Link_schedulableResources() {
        return this.elt.getTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("630765ec-5236-468b-852c-8e77eeb884bd")
    public String getGaExecHost_Link_schedule() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Link_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3f8069d9-ad04-4a70-a610-b96c42e35dbf")
    public List<String> getGaExecHost_Link_throughput() {
        return this.elt.getTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Link_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4f858751-683e-4104-8302-b3001f1e8466")
    public List<String> getGaExecHost_Link_utilization() {
        return this.elt.getTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("a70e2b70-9399-4cfb-9575-cc742e6e521c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaExecHost_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5f8dc650-bf8f-4f5a-b71a-220188338759")
    public boolean isGaExecHost_Link_isPreemptible() {
        return this.elt.isTagged(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Link_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7db04500-327b-40e2-a2c0-47952abf960b")
    public void setGaExecHost_Link_clockOvh(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_CLOCKOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe849b1e-a5ae-4015-9280-20c6be919dbb")
    public void setGaExecHost_Link_cntxtSwT(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_CNTXTSWT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ec2679e3-cf0d-4bb5-80f9-551db05c279a")
    public void setGaExecHost_Link_commRcvOvh(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_COMMRCVOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e1092255-7dfa-425e-9434-5a1480747394")
    public void setGaExecHost_Link_commTxOvh(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_COMMTXOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ab283655-0ee0-4a9f-961e-d447996c5828")
    public void setGaExecHost_Link_host(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaExecHost_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("48a6a29c-f8ba-468d-bdd4-1396559bec6f")
    public void setGaExecHost_Link_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Link_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bfc17b07-4b28-4f69-b0f0-33b93ea7b06e")
    public void setGaExecHost_Link_memSize(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_MEMSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0549f024-cad2-438c-a1fa-b610fc926056")
    public void setGaExecHost_Link_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Link_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be632fdb-d1bc-4ca9-8dee-c86cc0eac749")
    public void setGaExecHost_Link_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Link_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e7ba303b-a2af-45c2-a51e-95804a44fc95")
    public void setGaExecHost_Link_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f916f1ff-f638-423b-9598-fb00ed0cfc1e")
    public void setGaExecHost_Link_schedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d53d6fd-a045-4abf-a406-d27dd0cac4de")
    public void setGaExecHost_Link_schedPriRange(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDPRIRANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Link_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("651666d8-a289-48e4-b855-d942a6d12973")
    public void setGaExecHost_Link_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7847e2d4-98f8-4cd6-9980-2233ff4b40f8")
    public void setGaExecHost_Link_schedule(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Link_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7e487dfe-730b-462d-89ec-4bba1691284e")
    public void setGaExecHost_Link_throughput(final List<String> values) {
        this.elt.putTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Link_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("361673e2-f376-4b9d-86ac-e8a7569ee4eb")
    public void setGaExecHost_Link_utilization(final List<String> values) {
        this.elt.putTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("8e73702b-b2d3-476c-8a5e-92feea977530")
    protected GaExecHostLink(final Link elt) {
        super(elt);
    }

    @objid ("ddf61e28-be06-4649-891a-483ecdca48c2")
    public static final class MdaTypes {
        @objid ("be722b0a-38a5-452b-a009-dc9714949af0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d83b60bb-3216-4098-a474-1996b04a4bb2")
        public static TagType GAEXECHOST_LINK_COMMTXOVH_TAGTYPE_ELT;

        @objid ("cd916293-7150-4596-949b-f346188b2962")
        public static TagType GAEXECHOST_LINK_COMMRCVOVH_TAGTYPE_ELT;

        @objid ("7745a3ab-1272-4566-986d-3e881976a9b4")
        public static TagType GAEXECHOST_LINK_CNTXTSWT_TAGTYPE_ELT;

        @objid ("7a248537-2f96-43e7-abc7-0910d4e40abd")
        public static TagType GAEXECHOST_LINK_CLOCKOVH_TAGTYPE_ELT;

        @objid ("01c836a8-ed4b-43b3-adec-567075952df3")
        public static TagType GAEXECHOST_LINK_SCHEDPRIRANGE_TAGTYPE_ELT;

        @objid ("4959ee0c-0e2d-4dd0-9603-cc75af1b6512")
        public static TagType GAEXECHOST_LINK_MEMSIZE_TAGTYPE_ELT;

        @objid ("0adf0dfd-b9a7-4316-aee6-6a704dda9110")
        public static TagType GAEXECHOST_LINK_UTILIZATION_TAGTYPE_ELT;

        @objid ("079fd34b-85bb-4c49-afee-b00ae897bd4e")
        public static TagType GAEXECHOST_LINK_THROUGHPUT_TAGTYPE_ELT;

        @objid ("8a120b80-adfa-4aee-8f19-6b98ee3dbed4")
        public static TagType GAEXECHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("cb3fd15c-32c5-42f5-b4e1-83932e180206")
        public static TagType GAEXECHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("53306e8c-73cc-46d9-b65b-b8ab2c505186")
        public static TagType GAEXECHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("a8ada7ce-bfbe-448b-82a2-89895f585d51")
        public static TagType GAEXECHOST_LINK_SCHEDULE_TAGTYPE_ELT;

        @objid ("201acbee-2c34-4ebf-87df-35ab81c1948b")
        public static TagType GAEXECHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("9c5a60c4-0c0d-4915-8852-8a206eae6fbc")
        public static TagType GAEXECHOST_LINK_HOST_TAGTYPE_ELT;

        @objid ("3c82ee8e-2a16-45a3-8fb4-5c77d3573fcb")
        public static TagType GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("059cc4fe-335c-496a-a09b-fb0c0451b207")
        public static TagType GAEXECHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("198dc596-3838-4a97-a8d9-470e5be7d82b")
        private static Stereotype MDAASSOCDEP;

        @objid ("e3bb2da5-ae4a-49f0-a7bd-d8b5a9613516")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("77270f71-e2fc-4eac-9dc3-11255c8c126d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0360f847-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_COMMTXOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635a99-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_COMMRCVOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635aa0-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_CNTXTSWT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bce6-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_CLOCKOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bced-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_SCHEDPRIRANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcf4-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_MEMSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcfb-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bd02-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bd09-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787a4-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787a5-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787a6-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LINK_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787a7-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787a8-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LINK_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787a9-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787aa-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "20a787ab-16ea-11df-b92a-0014222a9f79");
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
