/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("718d287a-bffa-46d0-91af-d28cecf4703a")
    public static final String STEREOTYPE_NAME = "GaCommHost_AssociationEnd";

    @objid ("d449f5e2-f088-41c1-9466-401280ac975f")
    public static final String GACOMMHOST_ASSOCIATIONEND_HOST_TAGTYPE = "GaCommHost_AssociationEnd_host";

    @objid ("8f5a3b46-d9f7-4f53-9370-659ea1cc763a")
    public static final String GACOMMHOST_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_AssociationEnd_isPreemptible";

    @objid ("a7518372-3c4e-4704-ba60-010b43a6c07f")
    public static final String GACOMMHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_AssociationEnd_otherSchedPolicy";

    @objid ("c78c5e1a-9368-4598-8d28-0d593ccfc26b")
    public static final String GACOMMHOST_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE = "GaCommHost_AssociationEnd_processingUnits";

    @objid ("ea3fa791-9aec-45e8-bd82-7858058eb2cc")
    public static final String GACOMMHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_AssociationEnd_protectedSharedResources";

    @objid ("77d73785-6db8-4df1-820e-91f43743b1f3")
    public static final String GACOMMHOST_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE = "GaCommHost_AssociationEnd_schedPolicy";

    @objid ("7911c6e0-15b9-48e5-884e-d98bc597bc66")
    public static final String GACOMMHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_AssociationEnd_schedulableResources";

    @objid ("53191967-e3a5-493b-9b2d-e81385087491")
    public static final String GACOMMHOST_ASSOCIATIONEND_SCHEDULE_TAGTYPE = "GaCommHost_AssociationEnd_schedule";

    @objid ("1cbfa340-082c-4753-9688-3bdb69186f1f")
    public static final String GACOMMHOST_ASSOCIATIONEND_THROUGHPUT_TAGTYPE = "GaCommHost_AssociationEnd_throughput";

    @objid ("d6b9a435-15b3-4393-8347-743969e03c86")
    public static final String GACOMMHOST_ASSOCIATIONEND_UTILIZATION_TAGTYPE = "GaCommHost_AssociationEnd_utilization";

    /**
     * Tells whether a {@link GaCommHostAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << GaCommHost_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9ce42435-7931-4bd2-a1ca-3550a2909738")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << GaCommHost_AssociationEnd >> then instantiate a {@link GaCommHostAssociationEnd} proxy.
     * 
     * @return a {@link GaCommHostAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("73c6177b-e377-492a-b9e0-6e540387a56d")
    public static GaCommHostAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostAssociationEnd.STEREOTYPE_NAME);
        return GaCommHostAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << GaCommHost_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link GaCommHostAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("15f9d4b1-e370-4908-846c-c691d8838bba")
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
    @objid ("e3758fff-2289-42ff-b9f3-ffaf5b769e62")
    public static GaCommHostAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (GaCommHostAssociationEnd.canInstantiate(obj))
        	return new GaCommHostAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("GaCommHostAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2f8b2f37-55e6-4860-a529-61ed3700b47d")
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
    @objid ("4aee8650-a6da-46c1-8d6d-02f9e334f986")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'GaCommHost_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3b726187-9e4e-4541-88a6-2a6ed97b8414")
    public String getGaCommHost_AssociationEnd_host() {
        return this.elt.getTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_AssociationEnd_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5f7a076c-ad3a-493e-9551-32c64acc2de9")
    public String getGaCommHost_AssociationEnd_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_AssociationEnd_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4bea6c0c-87f1-44f0-92e7-5b93cf8c2d09")
    public List<String> getGaCommHost_AssociationEnd_processingUnits() {
        return this.elt.getTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_AssociationEnd_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b0e6008d-542a-444c-a0c1-08c6f0cdc434")
    public List<String> getGaCommHost_AssociationEnd_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_AssociationEnd_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("81c63c38-309d-442a-85b9-0514a2ae0974")
    public String getGaCommHost_AssociationEnd_schedPolicy() {
        return this.elt.getTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_AssociationEnd_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8b68e159-1799-4f32-ba07-73938731b346")
    public List<String> getGaCommHost_AssociationEnd_schedulableResources() {
        return this.elt.getTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_AssociationEnd_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b30260ed-f589-4fa8-afec-ce18d8bd1375")
    public String getGaCommHost_AssociationEnd_schedule() {
        return this.elt.getTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_AssociationEnd_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5619091e-81ec-4371-8903-85582fd8eb9e")
    public List<String> getGaCommHost_AssociationEnd_throughput() {
        return this.elt.getTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_AssociationEnd_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b2857361-6312-4cb1-a5d2-b98294b28bb5")
    public List<String> getGaCommHost_AssociationEnd_utilization() {
        return this.elt.getTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("badf3d75-2b38-46dd-ac21-d0473612a3c5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_AssociationEnd_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("50e11f6b-450f-45e9-9815-569e95076f22")
    public boolean isGaCommHost_AssociationEnd_isPreemptible() {
        return this.elt.isTagged(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ecb27b73-35b7-4fb2-8da0-0f22b9405b08")
    public void setGaCommHost_AssociationEnd_host(final String value) {
        this.elt.putTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_AssociationEnd_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b88b2617-4bdc-4fb0-83c5-a3e16ab84d1b")
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
    @objid ("3896707d-f5cf-4d20-8584-bf69aeeed1b1")
    public void setGaCommHost_AssociationEnd_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_AssociationEnd_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9237c0da-f599-4438-89e1-ab3ad8930cb0")
    public void setGaCommHost_AssociationEnd_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_AssociationEnd_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a98ec58d-995e-4ded-9d45-c1423c6e21e9")
    public void setGaCommHost_AssociationEnd_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_AssociationEnd_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("54b6d7f4-9804-4b2a-8fee-990843994e8b")
    public void setGaCommHost_AssociationEnd_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_AssociationEnd_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8e6e7e2b-58e1-43d3-87ef-7cdca9a80908")
    public void setGaCommHost_AssociationEnd_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_AssociationEnd_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2e4fc7e6-ca4e-4fab-9d40-5629b6767f4d")
    public void setGaCommHost_AssociationEnd_schedule(final String value) {
        this.elt.putTagValue(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_AssociationEnd_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b24c4d23-f4ee-4f7f-8544-1a335b68a29d")
    public void setGaCommHost_AssociationEnd_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_AssociationEnd_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a4f2e929-a672-4790-81a0-a8195d93cff5")
    public void setGaCommHost_AssociationEnd_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociationEnd.MdaTypes.GACOMMHOST_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("e3e7e652-4e98-4048-820e-85b39fe0835d")
    protected GaCommHostAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("6527e515-b6a0-4c79-8f30-0a5dfbe652ca")
    public static final class MdaTypes {
        @objid ("eca72c73-3020-43d6-af56-9465f41a8ad8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bfca9ec4-2705-4046-8f52-bc6f1b4f066d")
        public static TagType GACOMMHOST_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT;

        @objid ("a8b433f1-e528-4d38-810e-2adc6ffdac6b")
        public static TagType GACOMMHOST_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT;

        @objid ("382b5ebb-5b0e-4589-bf90-11503cbb9bfb")
        public static TagType GACOMMHOST_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("317ec974-a590-45eb-aea9-dc87deb97fae")
        public static TagType GACOMMHOST_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("c123295d-3aa8-4ea3-85fb-fb6129d6179b")
        public static TagType GACOMMHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("a2e9a5b2-74e8-4954-8f75-76926203091d")
        public static TagType GACOMMHOST_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT;

        @objid ("9b3c2779-226b-4af2-9216-0bb256c8820e")
        public static TagType GACOMMHOST_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("b5450436-0df5-4354-a81c-9bfbcf6d8bfe")
        public static TagType GACOMMHOST_ASSOCIATIONEND_HOST_TAGTYPE_ELT;

        @objid ("76bd1667-e656-4bc0-87cd-4f2469f51104")
        public static TagType GACOMMHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("6bc95cd5-fdc2-44c3-86d1-f3b228451c13")
        public static TagType GACOMMHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("4fd2b300-0336-4078-9f37-e3a4bbd190c3")
        private static Stereotype MDAASSOCDEP;

        @objid ("093b2d8d-cb47-4834-b635-c74657c58247")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b7ab9bf7-7f2e-4215-bd6a-15fd9aae7100")
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
