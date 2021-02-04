/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.associationend;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.CommunicationMediaAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << GaCommHost_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("47684fb7-1139-47d9-8e8b-8ab7c728f46b")
public class GaCommHostAssociationEnd extends CommunicationMediaAssociationEnd {
    @objid ("ad7fecc7-34c9-4a26-ae87-a4effc150f3b")
    public static final String STEREOTYPE_NAME = "GaCommHost_AssociationEnd";

    @objid ("b247d192-a93a-4349-959e-7c5eb5c5abd2")
    public static final String GACOMMHOST_ASSOCIATIONEND_HOST_TAGTYPE = "GaCommHost_AssociationEnd_host";

    @objid ("3a1a314c-4835-4e76-a769-7f64c69fd516")
    public static final String GACOMMHOST_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_AssociationEnd_isPreemptible";

    @objid ("07aa6f90-e8a1-436a-ade9-ea81f6de5a7c")
    public static final String GACOMMHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_AssociationEnd_otherSchedPolicy";

    @objid ("bc5c38db-0631-40c1-89ac-5a7a240b0332")
    public static final String GACOMMHOST_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE = "GaCommHost_AssociationEnd_processingUnits";

    @objid ("f5b7a441-9583-4800-8573-70ba45848e7f")
    public static final String GACOMMHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_AssociationEnd_protectedSharedResources";

    @objid ("462c5a5a-3ba0-4d1d-a899-a5ab7d362b19")
    public static final String GACOMMHOST_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE = "GaCommHost_AssociationEnd_schedPolicy";

    @objid ("15d58d70-fab6-4a04-9ff1-81c5627d3580")
    public static final String GACOMMHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_AssociationEnd_schedulableResources";

    @objid ("1948bb0d-e5d3-4663-909d-85865637f1ab")
    public static final String GACOMMHOST_ASSOCIATIONEND_SCHEDULE_TAGTYPE = "GaCommHost_AssociationEnd_schedule";

    @objid ("e249a814-a57d-48d8-b79d-73e7eff06457")
    public static final String GACOMMHOST_ASSOCIATIONEND_THROUGHPUT_TAGTYPE = "GaCommHost_AssociationEnd_throughput";

    @objid ("371fa0fd-953d-4ece-9732-6140ffa7b2af")
    public static final String GACOMMHOST_ASSOCIATIONEND_UTILIZATION_TAGTYPE = "GaCommHost_AssociationEnd_utilization";

    /**
     * Tells whether a {@link GaCommHostAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << GaCommHost_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ce77020d-fef6-46f3-b500-9e88028de423")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << GaCommHost_AssociationEnd >> then instantiate a {@link GaCommHostAssociationEnd} proxy.
     * 
     * @return a {@link GaCommHostAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("273a8caf-9962-4db7-b558-9ca06bc3d725")
    public static GaCommHostAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostAssociationEnd.STEREOTYPE_NAME);
        return GaCommHostAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << GaCommHost_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link GaCommHostAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("95f58806-2353-4384-9b09-9945f7b5d227")
    public static GaCommHostAssociationEnd instantiate(final AssociationEnd obj) {
        return GaCommHostAssociationEnd.canInstantiate(obj) ? new GaCommHostAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommHostAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << GaCommHost_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link GaCommHostAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("25496036-b13b-4f43-8949-872f66153afd")
    public static GaCommHostAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (GaCommHostAssociationEnd.canInstantiate(obj))
        	return new GaCommHostAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("GaCommHostAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("eb59a519-88d3-445d-927a-839f66b1d8dc")
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
        GaCommHostAssociationEnd other = (GaCommHostAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("c1152975-1180-4111-9e19-41ea35412ceb")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'GaCommHost_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("38f614a7-caa1-43c2-bddb-1dcd151dffaa")
    public String getGaCommHost_AssociationEnd_host() {
        return this.elt.getTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_AssociationEnd_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("66019b20-64a7-4598-83b8-3a8c025e662d")
    public String getGaCommHost_AssociationEnd_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_AssociationEnd_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8c0e5c56-8ae0-487e-aed3-a2ee5d2b0b77")
    public List<String> getGaCommHost_AssociationEnd_processingUnits() {
        return this.elt.getTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_AssociationEnd_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a4d1b099-da77-4825-b270-23be1b8f7e4c")
    public List<String> getGaCommHost_AssociationEnd_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_AssociationEnd_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4fe7ecf5-608f-44bc-9f8c-c86007f2b128")
    public String getGaCommHost_AssociationEnd_schedPolicy() {
        return this.elt.getTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_AssociationEnd_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("933f2dad-9874-4277-9384-78e1fffd6f1b")
    public List<String> getGaCommHost_AssociationEnd_schedulableResources() {
        return this.elt.getTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_AssociationEnd_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7da0e6a3-d6c6-4b4a-9b2b-3f03ba81a515")
    public String getGaCommHost_AssociationEnd_schedule() {
        return this.elt.getTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_AssociationEnd_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("34730b6f-73e9-4402-9f8a-122cc793d884")
    public List<String> getGaCommHost_AssociationEnd_throughput() {
        return this.elt.getTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_AssociationEnd_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1405209d-290d-41f4-a888-52a5fad45ad2")
    public List<String> getGaCommHost_AssociationEnd_utilization() {
        return this.elt.getTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("4af5f222-c365-43e3-8800-d40f189d0f1c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_AssociationEnd_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("50afdc7f-c24e-4924-a949-53891e988ed3")
    public boolean isGaCommHost_AssociationEnd_isPreemptible() {
        return this.elt.isTagged(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("123318b1-b821-43cb-be72-d0656fc5634a")
    public void setGaCommHost_AssociationEnd_host(final String value) {
        this.elt.putTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_AssociationEnd_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("deabb01d-7a9e-48d3-9e6b-c2bd26491558")
    public void setGaCommHost_AssociationEnd_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_AssociationEnd_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("609464c4-adde-453a-a335-12fa9e6f8413")
    public void setGaCommHost_AssociationEnd_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_AssociationEnd_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("51a0c31d-358d-4fed-bc58-4d4fac1b0b19")
    public void setGaCommHost_AssociationEnd_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_AssociationEnd_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("47c0b9f3-db95-406c-87ae-59e6fad25e99")
    public void setGaCommHost_AssociationEnd_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_AssociationEnd_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("460efab2-ce42-4327-97ee-ab95d719c4a6")
    public void setGaCommHost_AssociationEnd_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_AssociationEnd_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1aad5f78-febb-4343-bfa9-53faf4f011c1")
    public void setGaCommHost_AssociationEnd_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_AssociationEnd_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("67b52c9a-4c15-46b4-b810-c277ff50a937")
    public void setGaCommHost_AssociationEnd_schedule(final String value) {
        this.elt.putTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_AssociationEnd_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("991b7c7b-dc5a-427b-90d8-ae27b9be4306")
    public void setGaCommHost_AssociationEnd_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_AssociationEnd_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f6a1d6df-5c2e-4236-9b32-b8735f456401")
    public void setGaCommHost_AssociationEnd_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("92e3440a-b0ed-4b5a-a1d8-65e513347786")
    protected GaCommHostAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("6527e515-b6a0-4c79-8f30-0a5dfbe652ca")
    public static final class MdaTypes {
        @objid ("130c8001-510e-4cf7-8191-ccf887bbb88c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fe828931-7b21-46e9-9404-deaf1820d8c5")
        public static TagType GACOMMHOST_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT;

        @objid ("4d40e68d-4a68-468c-a405-1ddd948470f0")
        public static TagType GACOMMHOST_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT;

        @objid ("97b0dd7e-3f96-4430-a5cc-32ba9543f608")
        public static TagType GACOMMHOST_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("d9c48281-183d-4add-9c2d-249eec1b6016")
        public static TagType GACOMMHOST_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("d1d83320-a632-47e8-a720-0a718ec339a5")
        public static TagType GACOMMHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("91ea0b2f-8796-4628-8c0d-8fb3b8084c51")
        public static TagType GACOMMHOST_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT;

        @objid ("4fbe277a-c929-45e3-abda-2c411fbf9aef")
        public static TagType GACOMMHOST_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("cae3a491-ad59-45a8-9b3b-11d54a9d26fd")
        public static TagType GACOMMHOST_ASSOCIATIONEND_HOST_TAGTYPE_ELT;

        @objid ("4d22c8b9-114c-4d37-9a09-e05c82ead2bb")
        public static TagType GACOMMHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("b496e309-5be0-4d1a-867b-f768fc078ae2")
        public static TagType GACOMMHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("3173d0e0-d618-40a6-8da0-48051cf0d3d6")
        private static Stereotype MDAASSOCDEP;

        @objid ("f76844b6-73f3-412c-b75c-8bac2999debb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("82fc9062-2d06-4796-ac42-5e428a61ce4c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03681f39-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036a818b-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036ce3e1-0ccf-11df-8525-001302895b2b");
            GACOMMHOST_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a0b43f52-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a0b43f53-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a0b43f54-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a0b43f55-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a0b43f56-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATIONEND_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a0b43f57-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a0b43f58-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a0b43f59-1669-11df-b9be-0014222a9f79");
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
