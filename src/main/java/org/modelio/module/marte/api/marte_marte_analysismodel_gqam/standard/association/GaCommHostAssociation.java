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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.CommunicationMediaAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << GaCommHost_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a6be21c5-7d18-4cb2-ac09-9269a2f57065")
public class GaCommHostAssociation extends CommunicationMediaAssociation {
    @objid ("fb895f28-8dd9-4ffc-a5b2-bfb231ddc2b1")
    public static final String STEREOTYPE_NAME = "GaCommHost_Association";

    @objid ("1a1aa28b-3b6e-4f9c-a2f4-0451eb6d8191")
    public static final String GACOMMHOST_ASSOCIATION_HOST_TAGTYPE = "GaCommHost_Association_host";

    @objid ("01065442-a1e6-4560-baea-f6e85eaf6eae")
    public static final String GACOMMHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_Association_isPreemptible";

    @objid ("a15a7deb-7d0e-4198-8bc1-da7301cf90d4")
    public static final String GACOMMHOST_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_Association_otherSchedPolicy";

    @objid ("29433768-e8ec-45f7-9862-4bf4184ee1db")
    public static final String GACOMMHOST_ASSOCIATION_PROCESSINGUNITS_TAGTYPE = "GaCommHost_Association_processingUnits";

    @objid ("17f1579f-e93d-4d93-a57c-55091cb18932")
    public static final String GACOMMHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_Association_protectedSharedResources";

    @objid ("3f990c35-149d-47c8-a3ff-4c3de8093e21")
    public static final String GACOMMHOST_ASSOCIATION_SCHEDPOLICY_TAGTYPE = "GaCommHost_Association_schedPolicy";

    @objid ("be7b3a52-51a7-437b-9dcc-a3e3abd11297")
    public static final String GACOMMHOST_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_Association_schedulableResources";

    @objid ("762fba93-08b7-49b9-8fad-6615c2eb7914")
    public static final String GACOMMHOST_ASSOCIATION_SCHEDULE_TAGTYPE = "GaCommHost_Association_schedule";

    @objid ("d8f39ed4-b2f1-45c2-841c-16b7bc8007a1")
    public static final String GACOMMHOST_ASSOCIATION_THROUGHPUT_TAGTYPE = "GaCommHost_Association_throughput";

    @objid ("36003767-b2fd-4404-ad46-082ebece3f99")
    public static final String GACOMMHOST_ASSOCIATION_UTILIZATION_TAGTYPE = "GaCommHost_Association_utilization";

    /**
     * Tells whether a {@link GaCommHostAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << GaCommHost_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a5f62635-832d-4247-9eeb-b3a86e1e0074")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << GaCommHost_Association >> then instantiate a {@link GaCommHostAssociation} proxy.
     * 
     * @return a {@link GaCommHostAssociation} proxy on the created {@link Association}.
     */
    @objid ("eed4d989-4686-4796-b729-87364c03fdc1")
    public static GaCommHostAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostAssociation.STEREOTYPE_NAME);
        return GaCommHostAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostAssociation} proxy from a {@link Association} stereotyped << GaCommHost_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link GaCommHostAssociation} proxy or <i>null</i>.
     */
    @objid ("90960f54-f0c4-4f94-92e8-fb50df6bbf6e")
    public static GaCommHostAssociation instantiate(final Association obj) {
        return GaCommHostAssociation.canInstantiate(obj) ? new GaCommHostAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommHostAssociation} proxy from a {@link Association} stereotyped << GaCommHost_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link GaCommHostAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6ed84e2b-c306-4c1d-9a0c-31775d86a078")
    public static GaCommHostAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (GaCommHostAssociation.canInstantiate(obj))
        	return new GaCommHostAssociation(obj);
        else
        	throw new IllegalArgumentException("GaCommHostAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("013ab4b0-f5b1-4ad7-a061-47584c98a05c")
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
        GaCommHostAssociation other = (GaCommHostAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("83db2931-22da-41fa-8a22-be9e3965912d")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'GaCommHost_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14c91067-375c-464e-9239-e8a23377cb9d")
    public String getGaCommHost_Association_host() {
        return this.elt.getTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Association_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ce52db58-2db8-431f-81cf-6cddfce75ec4")
    public String getGaCommHost_Association_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Association_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("00b2c599-7575-4a02-ad49-b0567beba949")
    public List<String> getGaCommHost_Association_processingUnits() {
        return this.elt.getTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Association_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f25fff71-0ae7-4f70-aa91-906195bc6ef9")
    public List<String> getGaCommHost_Association_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Association_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0db7e04a-6289-4db0-9397-99dbc75c3fa5")
    public String getGaCommHost_Association_schedPolicy() {
        return this.elt.getTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Association_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("95f90ea1-3046-485f-8363-68f10fb56ee1")
    public List<String> getGaCommHost_Association_schedulableResources() {
        return this.elt.getTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Association_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("44b37237-2f04-4f53-ad1a-c78ae7a66ea2")
    public String getGaCommHost_Association_schedule() {
        return this.elt.getTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Association_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("28c99de4-6214-4163-939d-ba4fb1869e57")
    public List<String> getGaCommHost_Association_throughput() {
        return this.elt.getTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Association_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6edf65e5-ca98-4eba-b976-4b40d79cbf1f")
    public List<String> getGaCommHost_Association_utilization() {
        return this.elt.getTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("e2438439-6779-4682-bb62-0263f1a05e11")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_Association_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("05c02a51-f9a4-4670-8f6a-886c998a3f48")
    public boolean isGaCommHost_Association_isPreemptible() {
        return this.elt.isTagged(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Association_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("226f6c04-e2be-4af2-842b-572814fe17de")
    public void setGaCommHost_Association_host(final String value) {
        this.elt.putTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_Association_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b153f802-1b2c-41bd-aa51-11c43ecabf11")
    public void setGaCommHost_Association_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Association_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b9822325-4612-4e65-9fa7-2be2cddde594")
    public void setGaCommHost_Association_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Association_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9ed847bd-7b57-4406-b7b0-fd292ad552d8")
    public void setGaCommHost_Association_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Association_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9201379d-7f33-4e0f-93ce-a62185904c7e")
    public void setGaCommHost_Association_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Association_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b53a7b6c-3f89-4cca-b622-0cf2dee6ca04")
    public void setGaCommHost_Association_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Association_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("59114876-aaba-4de6-91ba-52a0817cde75")
    public void setGaCommHost_Association_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Association_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c30769db-dc02-45d7-8298-386fe5598ae3")
    public void setGaCommHost_Association_schedule(final String value) {
        this.elt.putTagValue(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Association_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea243fbb-7167-4e8d-a6bd-8d2eb32e1bd9")
    public void setGaCommHost_Association_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Association_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("130c141d-dca8-4425-a2f1-527ad349a7ff")
    public void setGaCommHost_Association_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostAssociation.MdaTypes.GACOMMHOST_ASSOCIATION_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("1ff90f16-3a5d-46c1-bc52-ac61e07a9a54")
    protected GaCommHostAssociation(final Association elt) {
        super(elt);
    }

    @objid ("fab71e4a-3a16-4174-95a5-3faafcfcddbe")
    public static final class MdaTypes {
        @objid ("e7fac63c-9eae-48ed-963d-3ad8ac377c2e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("66eaccfd-b6b6-4336-a10c-bd597eaa83b6")
        public static TagType GACOMMHOST_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT;

        @objid ("f0b9b75a-8b83-485e-95da-f66873cc5bc2")
        public static TagType GACOMMHOST_ASSOCIATION_UTILIZATION_TAGTYPE_ELT;

        @objid ("a6ae2b5f-cee7-4729-aaca-c528dfff6ada")
        public static TagType GACOMMHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("e37bf167-28ec-42f8-87b5-c00e47078cc9")
        public static TagType GACOMMHOST_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("2b0fa54d-0cf9-47cc-a350-f08a7a833d5d")
        public static TagType GACOMMHOST_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("4991ac00-ee92-4043-bc5c-24938edf1073")
        public static TagType GACOMMHOST_ASSOCIATION_SCHEDULE_TAGTYPE_ELT;

        @objid ("afba2099-cf9f-46d9-a582-86d8d2732275")
        public static TagType GACOMMHOST_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("69b447c5-ed33-437e-a3bd-a257794bb546")
        public static TagType GACOMMHOST_ASSOCIATION_HOST_TAGTYPE_ELT;

        @objid ("ca3d8670-e6ef-4f67-98fd-dcf13c2014f9")
        public static TagType GACOMMHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("067a232f-f3b6-4adc-ad8b-bf6997c52a7e")
        public static TagType GACOMMHOST_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("6227f257-187d-4012-b515-2616e85546a0")
        private static Stereotype MDAASSOCDEP;

        @objid ("d08b3a9f-eef8-4048-a12b-2d877eebc30f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9e6bbb63-20a4-4cd5-ba47-a5dc2e31cedc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ae9032e7-14a6-11df-9d54-0014222a9f79");
            GACOMMHOST_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ae9032e8-14a6-11df-9d54-0014222a9f79");
            GACOMMHOST_ASSOCIATION_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ae9032e9-14a6-11df-9d54-0014222a9f79");
            GACOMMHOST_ASSOCIATION_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d75-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATION_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d76-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATION_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d77-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATION_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d78-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATION_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d79-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATION_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d7a-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d7b-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_ASSOCIATION_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9b928d7c-1669-11df-b9be-0014222a9f79");
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
