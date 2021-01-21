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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.CommunicationMediaLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << GaCommHost_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b1918dd2-a0b7-49fe-9c04-960a725823bc")
public class GaCommHostLink extends CommunicationMediaLink {
    @objid ("5cb989a7-a3d4-4b35-8fcc-2262a89a5127")
    public static final String STEREOTYPE_NAME = "GaCommHost_Link";

    @objid ("4f57a031-56e9-4c7e-928b-1f30fc5b9fe0")
    public static final String GACOMMHOST_LINK_HOST_TAGTYPE = "GaCommHost_Link_host";

    @objid ("f714841e-61bf-43c8-8e86-bfbb8c84fc2f")
    public static final String GACOMMHOST_LINK_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_Link_isPreemptible";

    @objid ("ae3d3e82-528a-459f-a18f-b1ebebd15645")
    public static final String GACOMMHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_Link_otherSchedPolicy";

    @objid ("2a5221f9-1877-4ebb-9b16-0bad0c142a66")
    public static final String GACOMMHOST_LINK_PROCESSINGUNITS_TAGTYPE = "GaCommHost_Link_processingUnits";

    @objid ("fa1e1e84-fb03-4f70-af6f-39ad7f00a30c")
    public static final String GACOMMHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_Link_protectedSharedResources";

    @objid ("f5bf33b0-b649-4c82-a06e-641df2220649")
    public static final String GACOMMHOST_LINK_SCHEDPOLICY_TAGTYPE = "GaCommHost_Link_schedPolicy";

    @objid ("4e83b9ea-efd8-4223-9f9c-8684a3fd7fe4")
    public static final String GACOMMHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_Link_schedulableResources";

    @objid ("5db6dca8-9f2a-461d-877c-721ae60507c8")
    public static final String GACOMMHOST_LINK_SCHEDULE_TAGTYPE = "GaCommHost_Link_schedule";

    @objid ("a96f0169-3e34-428b-87da-cf6aa7c19b1d")
    public static final String GACOMMHOST_LINK_THROUGHPUT_TAGTYPE = "GaCommHost_Link_throughput";

    @objid ("6c499898-8243-41df-b5ec-9004b71103d7")
    public static final String GACOMMHOST_LINK_UTILIZATION_TAGTYPE = "GaCommHost_Link_utilization";

    /**
     * Tells whether a {@link GaCommHostLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << GaCommHost_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1fbcfba8-dcea-4b05-b400-0a28dd0ba2ab")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << GaCommHost_Link >> then instantiate a {@link GaCommHostLink} proxy.
     * 
     * @return a {@link GaCommHostLink} proxy on the created {@link Link}.
     */
    @objid ("8e1126f0-155d-49bd-b9ce-53ba5644ca44")
    public static GaCommHostLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostLink.STEREOTYPE_NAME);
        return GaCommHostLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostLink} proxy from a {@link Link} stereotyped << GaCommHost_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link GaCommHostLink} proxy or <i>null</i>.
     */
    @objid ("89058ac0-9950-4baa-b348-9830e41af8e8")
    public static GaCommHostLink instantiate(final Link obj) {
        return GaCommHostLink.canInstantiate(obj) ? new GaCommHostLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommHostLink} proxy from a {@link Link} stereotyped << GaCommHost_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link GaCommHostLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9b35ab5a-5630-4282-b27e-a4627414ca07")
    public static GaCommHostLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (GaCommHostLink.canInstantiate(obj))
        	return new GaCommHostLink(obj);
        else
        	throw new IllegalArgumentException("GaCommHostLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("275da0a9-7374-4aca-9f76-b7888a202fc8")
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
        GaCommHostLink other = (GaCommHostLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("1311394c-82aa-461f-8548-f6ce386e8e71")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'GaCommHost_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ca80784b-cfec-4c5c-bdaa-63b79c753901")
    public String getGaCommHost_Link_host() {
        return this.elt.getTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Link_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f6bfabb1-dc89-4fae-b179-cf19a7112b4c")
    public String getGaCommHost_Link_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Link_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9c495e5f-1eac-4748-a828-05e3c5239a6e")
    public List<String> getGaCommHost_Link_processingUnits() {
        return this.elt.getTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Link_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3bc264a9-0aa1-4549-921b-55197241e19e")
    public List<String> getGaCommHost_Link_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1009d31a-a339-46e7-978e-ffadcdda7bef")
    public String getGaCommHost_Link_schedPolicy() {
        return this.elt.getTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Link_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("23691596-2354-4f58-8385-be4904bb28c7")
    public List<String> getGaCommHost_Link_schedulableResources() {
        return this.elt.getTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("04835ed5-513e-488c-a7a2-9d0754493431")
    public String getGaCommHost_Link_schedule() {
        return this.elt.getTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Link_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("738158e2-070b-4654-86b0-1d1be64cb28e")
    public List<String> getGaCommHost_Link_throughput() {
        return this.elt.getTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Link_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c373de78-f7c5-4763-8305-3760bb252481")
    public List<String> getGaCommHost_Link_utilization() {
        return this.elt.getTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("b2a9c665-01d6-46b5-b344-1198d45152f6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3339212c-70d1-4b70-9c64-8d3b8006aa0c")
    public boolean isGaCommHost_Link_isPreemptible() {
        return this.elt.isTagged(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Link_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("87cd759b-d1f2-46e1-b34b-ba1557b558a3")
    public void setGaCommHost_Link_host(final String value) {
        this.elt.putTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_Link_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60e5241f-2c65-4090-bd45-fccd03a9dfe6")
    public void setGaCommHost_Link_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Link_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("43bd069a-be99-4820-b5ad-c1a16ae13b37")
    public void setGaCommHost_Link_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Link_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("34ad6b60-5e9a-490e-93a9-a67ce9158294")
    public void setGaCommHost_Link_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Link_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be6a4685-2779-4560-93cc-9b01c2a204e6")
    public void setGaCommHost_Link_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Link_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d7b7634-fc38-431f-b136-33db1ba0cded")
    public void setGaCommHost_Link_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Link_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7b1e414e-4151-4a48-827f-4314fce5e4a1")
    public void setGaCommHost_Link_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Link_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aa40c59b-35a9-4349-a3ce-2559470bb3d7")
    public void setGaCommHost_Link_schedule(final String value) {
        this.elt.putTagValue(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Link_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7fbb3c94-7109-41b6-a55a-7b9e2f77bacc")
    public void setGaCommHost_Link_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Link_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aa84eacb-de12-406e-a9c8-bd1bd40f5b8d")
    public void setGaCommHost_Link_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostLink.MdaTypes.GACOMMHOST_LINK_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("a4f2aeed-d774-416a-939e-d693bcc42c97")
    protected GaCommHostLink(final Link elt) {
        super(elt);
    }

    @objid ("bf1751c1-8ca2-4b8d-ab41-5ea40e086cfe")
    public static final class MdaTypes {
        @objid ("fc01d3ed-eeeb-48d4-ad1a-8fb4600a6c74")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a1a2fd9f-7f56-40fa-bd87-7a46c5eae9ef")
        public static TagType GACOMMHOST_LINK_THROUGHPUT_TAGTYPE_ELT;

        @objid ("b9e3961f-f366-47b4-ad54-603994cb3e01")
        public static TagType GACOMMHOST_LINK_UTILIZATION_TAGTYPE_ELT;

        @objid ("3ed5a791-5020-49a6-8c0d-10ff45ff4c40")
        public static TagType GACOMMHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("fbdf5368-9ac6-4a09-aa38-24952b7b1acd")
        public static TagType GACOMMHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("437bfe76-63d7-4d39-b68d-51a72cac221f")
        public static TagType GACOMMHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("56963a72-6ad8-4d8d-9f7d-ed5abc7215da")
        public static TagType GACOMMHOST_LINK_SCHEDULE_TAGTYPE_ELT;

        @objid ("fee2d901-e19d-4212-b4be-ee3fb30c7cfe")
        public static TagType GACOMMHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("9b5796fb-98dd-49ff-b1b6-bcd326fe9f7e")
        public static TagType GACOMMHOST_LINK_HOST_TAGTYPE_ELT;

        @objid ("c80b1ab2-fed3-445a-87b9-77f26c40bcac")
        public static TagType GACOMMHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("0ea5cccb-6181-414b-821f-7f1da8d83ffa")
        public static TagType GACOMMHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("22cb0dc7-90e4-4b06-8318-e507442b8ab8")
        private static Stereotype MDAASSOCDEP;

        @objid ("186c976a-1d28-4224-b826-122967eb685c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c51970e9-0c99-47ae-ba30-9e395180d277")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03681f3d-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_LINK_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036ce3de-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_LINK_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036ce3e5-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_LINK_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d71c6e8-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LINK_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d71c6e9-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LINK_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d71c6ea-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LINK_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d71c6eb-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LINK_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d71c6ec-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LINK_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d742943-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LINK_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d742944-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_LINK_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9d742945-1669-11df-b9be-0014222a9f79");
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
