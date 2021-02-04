/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("9c867f48-3f9a-4f25-855a-1b04d77bc65e")
    public static final String STEREOTYPE_NAME = "GaExecHost_Link";

    @objid ("320bca08-9a2c-43b1-9011-1086ec2e816d")
    public static final String GAEXECHOST_LINK_CLOCKOVH_TAGTYPE = "GaExecHost_Link_clockOvh";

    @objid ("54ee74cb-0763-4ac4-8b75-efa2241c314a")
    public static final String GAEXECHOST_LINK_CNTXTSWT_TAGTYPE = "GaExecHost_Link_cntxtSwT";

    @objid ("73f835bc-dd91-4830-a31a-44f50907c1fe")
    public static final String GAEXECHOST_LINK_COMMRCVOVH_TAGTYPE = "GaExecHost_Link_commRcvOvh";

    @objid ("1738bd19-b469-4057-b475-1ebdc663170e")
    public static final String GAEXECHOST_LINK_COMMTXOVH_TAGTYPE = "GaExecHost_Link_commTxOvh";

    @objid ("b4347b01-0c42-4a57-9caa-0ca3f8cc8cad")
    public static final String GAEXECHOST_LINK_HOST_TAGTYPE = "GaExecHost_Link_host";

    @objid ("fa1ac665-67a9-447a-96f7-75f8ebb3deaa")
    public static final String GAEXECHOST_LINK_ISPREEMPTIBLE_TAGTYPE = "GaExecHost_Link_isPreemptible";

    @objid ("5cf436c6-816e-4db5-a319-6370afd679a7")
    public static final String GAEXECHOST_LINK_MEMSIZE_TAGTYPE = "GaExecHost_Link_memSize";

    @objid ("3831087d-395e-403a-957a-f3e99bb84820")
    public static final String GAEXECHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE = "GaExecHost_Link_otherSchedPolicy";

    @objid ("02d4cdf5-d6bb-486d-9cc8-f6e35ffc1c97")
    public static final String GAEXECHOST_LINK_PROCESSINGUNITS_TAGTYPE = "GaExecHost_Link_processingUnits";

    @objid ("d1f54709-d0a0-4c9d-b5b3-111e6a874a43")
    public static final String GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaExecHost_Link_protectedSharedResources";

    @objid ("b0841fce-0136-4ad5-89c4-340f8b54b97f")
    public static final String GAEXECHOST_LINK_SCHEDPOLICY_TAGTYPE = "GaExecHost_Link_schedPolicy";

    @objid ("fb60f428-5f1d-4f48-97a5-76c2b3e7f52b")
    public static final String GAEXECHOST_LINK_SCHEDPRIRANGE_TAGTYPE = "GaExecHost_Link_schedPriRange";

    @objid ("3fd50114-6780-4344-9b4f-fd4c1155c1e1")
    public static final String GAEXECHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE = "GaExecHost_Link_schedulableResources";

    @objid ("a1fe846f-29ac-492e-84c8-5d6277e511b4")
    public static final String GAEXECHOST_LINK_SCHEDULE_TAGTYPE = "GaExecHost_Link_schedule";

    @objid ("ebfe2c67-de08-4893-bd9d-fef5b4baf00f")
    public static final String GAEXECHOST_LINK_THROUGHPUT_TAGTYPE = "GaExecHost_Link_throughput";

    @objid ("efe32b0b-9899-4899-887c-684793106092")
    public static final String GAEXECHOST_LINK_UTILIZATION_TAGTYPE = "GaExecHost_Link_utilization";

    /**
     * Tells whether a {@link GaExecHostLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << GaExecHost_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("724664da-e6fc-4e79-a5b7-9df3c97a5000")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << GaExecHost_Link >> then instantiate a {@link GaExecHostLink} proxy.
     * 
     * @return a {@link GaExecHostLink} proxy on the created {@link Link}.
     */
    @objid ("ee0f80f7-bcfa-4f9a-b187-48abcfabf6ab")
    public static GaExecHostLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostLink.STEREOTYPE_NAME);
        return GaExecHostLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link GaExecHostLink} proxy from a {@link Link} stereotyped << GaExecHost_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link GaExecHostLink} proxy or <i>null</i>.
     */
    @objid ("62174638-43f1-48ab-ac8d-b0d63f0a7ae3")
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
    @objid ("7dceb27d-9aa9-4f76-8998-421b400acfed")
    public static GaExecHostLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (GaExecHostLink.canInstantiate(obj))
        	return new GaExecHostLink(obj);
        else
        	throw new IllegalArgumentException("GaExecHostLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5ff85183-c5eb-44f7-ae12-d883dc430c37")
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
    @objid ("97b6c575-50e3-4350-9ec4-eef99f721121")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'GaExecHost_Link_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("628c1544-5ac7-4d1c-bfdc-32e76cbff160")
    public String getGaExecHost_Link_clockOvh() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_CLOCKOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24d4fc32-0c8e-4b5e-bac4-abcad6b60798")
    public String getGaExecHost_Link_cntxtSwT() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_CNTXTSWT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("131ea7f8-be28-46cb-9ee7-4598c504e37b")
    public String getGaExecHost_Link_commRcvOvh() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_COMMRCVOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d83daa81-1b72-4ef0-941c-d7a1f79f70d5")
    public String getGaExecHost_Link_commTxOvh() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_COMMTXOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("271f1d9f-c599-42b2-9a1b-d81e1e4846e5")
    public String getGaExecHost_Link_host() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa81fda5-6de0-44c1-8bf9-d9d95b0256e2")
    public String getGaExecHost_Link_memSize() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_MEMSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6c394126-d2f0-42c4-8c0f-19adf7c93dda")
    public String getGaExecHost_Link_otherSchedPolicy() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Link_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ab3f7c79-bd54-4639-bc6d-50db9ecb1ef3")
    public List<String> getGaExecHost_Link_processingUnits() {
        return this.elt.getTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Link_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4bb867fe-e1bb-4295-b40c-57fbfd7d5276")
    public List<String> getGaExecHost_Link_protectedSharedResources() {
        return this.elt.getTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f7f1ad2c-985d-4d68-9142-f8621c0bc2be")
    public String getGaExecHost_Link_schedPolicy() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8439faf-4ec9-4c43-a947-6a718ed24898")
    public String getGaExecHost_Link_schedPriRange() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDPRIRANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Link_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6a819ad9-c754-4b18-a340-89fe23618250")
    public List<String> getGaExecHost_Link_schedulableResources() {
        return this.elt.getTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6dbf6368-319c-434a-9cf9-8cffe29578f1")
    public String getGaExecHost_Link_schedule() {
        return this.elt.getTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Link_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("eeecb94d-4a57-4389-9417-a57fc8f94df6")
    public List<String> getGaExecHost_Link_throughput() {
        return this.elt.getTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Link_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4b40b2f3-0f29-4c16-8cb2-78a1f34156dd")
    public List<String> getGaExecHost_Link_utilization() {
        return this.elt.getTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("55b14f87-b76f-4267-bbe1-6191156ed3b4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaExecHost_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("08bd54d7-3f7e-44d6-aa0f-2a784f0c7d78")
    public boolean isGaExecHost_Link_isPreemptible() {
        return this.elt.isTagged(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Link_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e356bd3d-661b-4049-8795-a7f7ca48a610")
    public void setGaExecHost_Link_clockOvh(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_CLOCKOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a693e814-6558-410f-8202-3b2289e30a4e")
    public void setGaExecHost_Link_cntxtSwT(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_CNTXTSWT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0bcc504-a52d-4186-a921-04e70ea52374")
    public void setGaExecHost_Link_commRcvOvh(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_COMMRCVOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3d9abea7-8402-4f6b-9a6f-2843045e0c19")
    public void setGaExecHost_Link_commTxOvh(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_COMMTXOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("47cc88be-a971-4338-bbe5-602f2a6b5254")
    public void setGaExecHost_Link_host(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaExecHost_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6d62ce6f-8092-4599-aeaf-6ac2c649381d")
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
    @objid ("78f4d80f-a3ae-4ce8-b4cf-0d4b01b322fd")
    public void setGaExecHost_Link_memSize(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_MEMSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9721ccb3-030b-41b4-ad35-e125a70a4c19")
    public void setGaExecHost_Link_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Link_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac35df38-4e23-4662-8a51-682d21c066be")
    public void setGaExecHost_Link_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Link_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3b84e37-3f8c-408e-95c3-e0a82a0ed862")
    public void setGaExecHost_Link_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0232b509-e274-4062-933b-f5de7ddb0750")
    public void setGaExecHost_Link_schedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Link_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3067f643-ac1f-4870-ae91-2e51944ec417")
    public void setGaExecHost_Link_schedPriRange(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDPRIRANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Link_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fffa6923-4f3d-4dbb-8382-56a1fe0ddddd")
    public void setGaExecHost_Link_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fc807cd5-d891-4d5c-bbcf-9fcb7fd45ca0")
    public void setGaExecHost_Link_schedule(final String value) {
        this.elt.putTagValue(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Link_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ed588207-1be3-4004-8e0a-cf582e207973")
    public void setGaExecHost_Link_throughput(final List<String> values) {
        this.elt.putTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Link_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("98f80ff3-d1b6-4432-a9da-0b8a92213efb")
    public void setGaExecHost_Link_utilization(final List<String> values) {
        this.elt.putTagValues(GaExecHostLink.MdaTypes.GAEXECHOST_LINK_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("875b1382-4f41-4d27-8597-cd3cb36bb4c1")
    protected GaExecHostLink(final Link elt) {
        super(elt);
    }

    @objid ("ddf61e28-be06-4649-891a-483ecdca48c2")
    public static final class MdaTypes {
        @objid ("ae9cd531-9c9f-4848-99fd-c32e07d0ff34")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9fa11527-c87c-405f-b2dd-e2ec9e4e710f")
        public static TagType GAEXECHOST_LINK_COMMTXOVH_TAGTYPE_ELT;

        @objid ("2979f424-8c5e-45a9-a71c-8934d0e63cb0")
        public static TagType GAEXECHOST_LINK_COMMRCVOVH_TAGTYPE_ELT;

        @objid ("462c208f-cfd3-45bc-b9bc-67ebf4c3e66c")
        public static TagType GAEXECHOST_LINK_CNTXTSWT_TAGTYPE_ELT;

        @objid ("95d9a816-7f66-4423-945b-6fd8a6339c23")
        public static TagType GAEXECHOST_LINK_CLOCKOVH_TAGTYPE_ELT;

        @objid ("dead5fdd-9242-4236-96d2-cd01702dd133")
        public static TagType GAEXECHOST_LINK_SCHEDPRIRANGE_TAGTYPE_ELT;

        @objid ("53f46ac7-93a6-4d1f-914e-8161f1abadc4")
        public static TagType GAEXECHOST_LINK_MEMSIZE_TAGTYPE_ELT;

        @objid ("0234e13d-b5b5-4a58-9c3e-781ccd1235f1")
        public static TagType GAEXECHOST_LINK_UTILIZATION_TAGTYPE_ELT;

        @objid ("8dc4dfb8-bde4-4fd6-91e3-aeff57aa82cf")
        public static TagType GAEXECHOST_LINK_THROUGHPUT_TAGTYPE_ELT;

        @objid ("b6402abc-d67e-41f4-b972-494442c5bfec")
        public static TagType GAEXECHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("fdfc9630-6afa-42c1-8b72-8e6a40ce1da8")
        public static TagType GAEXECHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("cedcd32d-2446-49c7-ad19-d24f8b8eaa07")
        public static TagType GAEXECHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("1b5bd86c-d250-444e-8823-a8d1a95fa8f3")
        public static TagType GAEXECHOST_LINK_SCHEDULE_TAGTYPE_ELT;

        @objid ("cd1ebeab-4997-4fec-912c-8ce28db024bc")
        public static TagType GAEXECHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("73254034-81ad-4662-9624-d0805354ef1e")
        public static TagType GAEXECHOST_LINK_HOST_TAGTYPE_ELT;

        @objid ("d5bd2557-100d-41e7-ad26-546ba4f58736")
        public static TagType GAEXECHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("375800d6-3e72-4d1b-b50e-e2f05333250f")
        public static TagType GAEXECHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("cf0da735-7b47-44b9-ac49-a21b86c1c748")
        private static Stereotype MDAASSOCDEP;

        @objid ("ba0ac37f-8903-4adb-8fd2-5d06814dd4a6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ddb6b5de-5858-4d4a-81e3-b8820d5e46fb")
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
