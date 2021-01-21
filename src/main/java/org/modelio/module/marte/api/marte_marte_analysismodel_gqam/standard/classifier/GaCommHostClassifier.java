/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.CommunicationMediaClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << GaCommHost_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b7b15f61-1544-4622-bb57-630c0292ff6c")
public class GaCommHostClassifier extends CommunicationMediaClassifier {
    @objid ("9b4d695b-cd4e-4bf4-841a-0c91b0277bdb")
    public static final String STEREOTYPE_NAME = "GaCommHost_Classifier";

    @objid ("71a0e2a3-7ee5-4ee1-96a8-c190b65cd87b")
    public static final String GACOMMHOST_CLASSIFIER_HOST_TAGTYPE = "GaCommHost_Classifier_host";

    @objid ("b38c8035-f2b2-4219-8e83-d3a6fcf56a52")
    public static final String GACOMMHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE = "GaCommHost_Classifier_isPreemptible";

    @objid ("c6cbfbc5-42cb-462e-a66d-e7f565f2af9e")
    public static final String GACOMMHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE = "GaCommHost_Classifier_otherSchedPolicy";

    @objid ("127395bc-3e96-4cb9-bc5a-6de80370c62b")
    public static final String GACOMMHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE = "GaCommHost_Classifier_processingUnits";

    @objid ("bedd299a-a3a4-4286-b4c5-ee25a994cb71")
    public static final String GACOMMHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaCommHost_Classifier_protectedSharedResources";

    @objid ("a8a0acee-e4dc-4a8c-8fe0-819fafb8d435")
    public static final String GACOMMHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE = "GaCommHost_Classifier_schedPolicy";

    @objid ("70efd11c-9a5d-4803-bd39-927cb3976586")
    public static final String GACOMMHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE = "GaCommHost_Classifier_schedulableResources";

    @objid ("ee597cd7-1399-4d73-89fa-6f5256776a26")
    public static final String GACOMMHOST_CLASSIFIER_SCHEDULE_TAGTYPE = "GaCommHost_Classifier_schedule";

    @objid ("f69e3d3a-f009-453b-aa2a-a8b98711e934")
    public static final String GACOMMHOST_CLASSIFIER_THROUGHPUT_TAGTYPE = "GaCommHost_Classifier_throughput";

    @objid ("b9debb87-9efc-4007-a4aa-e34753b9efda")
    public static final String GACOMMHOST_CLASSIFIER_UTILIZATION_TAGTYPE = "GaCommHost_Classifier_utilization";

    /**
     * Tells whether a {@link GaCommHostClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << GaCommHost_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8e81bcb9-f016-4115-b9b1-a8ad7ccb9ee3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << GaCommHost_Classifier >> then instantiate a {@link GaCommHostClassifier} proxy.
     * 
     * @return a {@link GaCommHostClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("9fd116c9-cf2b-4b3e-8f76-ff2418d3f76b")
    public static GaCommHostClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommHostClassifier.STEREOTYPE_NAME);
        return GaCommHostClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link GaCommHostClassifier} proxy from a {@link Classifier} stereotyped << GaCommHost_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link GaCommHostClassifier} proxy or <i>null</i>.
     */
    @objid ("39ea7426-3f86-4a6b-bdda-9e7c83de5b1c")
    public static GaCommHostClassifier instantiate(final Classifier obj) {
        return GaCommHostClassifier.canInstantiate(obj) ? new GaCommHostClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommHostClassifier} proxy from a {@link Classifier} stereotyped << GaCommHost_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link GaCommHostClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c1265079-711e-467c-8558-c8e4ec72cc10")
    public static GaCommHostClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (GaCommHostClassifier.canInstantiate(obj))
        	return new GaCommHostClassifier(obj);
        else
        	throw new IllegalArgumentException("GaCommHostClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("91990f99-8f99-475b-b1c3-cb5a3d3a403d")
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
        GaCommHostClassifier other = (GaCommHostClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("d8af8a31-1441-4959-b3a4-3183f8315496")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'GaCommHost_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b9929350-5290-461e-8002-9566a65cf6af")
    public String getGaCommHost_Classifier_host() {
        return this.elt.getTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Classifier_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14beeebc-8b27-472b-bf7a-b2a177bef5f1")
    public String getGaCommHost_Classifier_otherSchedPolicy() {
        return this.elt.getTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Classifier_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("92908c94-8835-4a01-a3bd-4919ac993f85")
    public List<String> getGaCommHost_Classifier_processingUnits() {
        return this.elt.getTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Classifier_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1bdbdca0-c666-4c2a-a181-b0ff1e58050b")
    public List<String> getGaCommHost_Classifier_protectedSharedResources() {
        return this.elt.getTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Classifier_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aa834046-9204-4016-a02c-8f3c9621b92a")
    public String getGaCommHost_Classifier_schedPolicy() {
        return this.elt.getTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Classifier_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5ad32601-ca37-4803-8fd6-b2589cac3cc2")
    public List<String> getGaCommHost_Classifier_schedulableResources() {
        return this.elt.getTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaCommHost_Classifier_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("73ebcd9d-fa84-43bf-8b03-4b5553c96c94")
    public String getGaCommHost_Classifier_schedule() {
        return this.elt.getTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Classifier_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c5a10a50-debe-4011-9fa5-1db2814bceec")
    public List<String> getGaCommHost_Classifier_throughput() {
        return this.elt.getTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommHost_Classifier_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("29b8d73a-fbae-4531-a5d3-a7869c49e290")
    public List<String> getGaCommHost_Classifier_utilization() {
        return this.elt.getTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("95c546d6-4b33-4409-b35d-43bd618be006")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaCommHost_Classifier_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c89684e-1986-4fa0-b59e-1ff5f1bbd1d2")
    public boolean isGaCommHost_Classifier_isPreemptible() {
        return this.elt.isTagged(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0fdf8b03-52b3-4334-86b4-353b60fa6a45")
    public void setGaCommHost_Classifier_host(final String value) {
        this.elt.putTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaCommHost_Classifier_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2dadfd8d-9472-4ee8-a81c-4049d884e5cc")
    public void setGaCommHost_Classifier_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaCommHost_Classifier_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e5fe6da5-9dd5-4eef-948c-4b5d4b0f3036")
    public void setGaCommHost_Classifier_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Classifier_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b76a5ad-c77a-4a1e-aa0c-467d7a7af73a")
    public void setGaCommHost_Classifier_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Classifier_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("29395a6c-ff7b-479a-b53b-e02f59ad8dc0")
    public void setGaCommHost_Classifier_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Classifier_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("53b922f7-8216-4518-aa56-9e650e8cbd89")
    public void setGaCommHost_Classifier_schedPolicy(final String value) {
        this.elt.putTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Classifier_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4045c34a-e550-463b-80b4-f829422ee8ae")
    public void setGaCommHost_Classifier_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaCommHost_Classifier_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("394d28e7-c6f0-4e0b-a209-6beeca4268f4")
    public void setGaCommHost_Classifier_schedule(final String value) {
        this.elt.putTagValue(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Classifier_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2d6c760c-b3d2-4f21-a6bc-d3c04cf27d17")
    public void setGaCommHost_Classifier_throughput(final List<String> values) {
        this.elt.putTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaCommHost_Classifier_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("22bd5162-b280-4dd9-b385-e24c5a453c90")
    public void setGaCommHost_Classifier_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommHostClassifier.MdaTypes.GACOMMHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("728eb8b4-39e6-43aa-811b-3135c08b5c3b")
    protected GaCommHostClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("061360bf-1946-4848-8041-c89c03e57d34")
    public static final class MdaTypes {
        @objid ("7b0d5574-57be-4967-a6ec-a016eb1f06cf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2fa3a840-5f6c-454c-b4f8-00d3f4fbd205")
        public static TagType GACOMMHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT;

        @objid ("e3f7c512-f971-4211-8b3a-79d9e114a110")
        public static TagType GACOMMHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT;

        @objid ("bb4b32a8-22ac-4ee2-b946-0e425080d592")
        public static TagType GACOMMHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("a7f6e074-4a2f-432a-bd6e-cb9fc22c852f")
        public static TagType GACOMMHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("6a67c1eb-a6f6-4f03-acd7-cc573b75903d")
        public static TagType GACOMMHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("8d8374f8-dcf9-41dc-a0bf-14efb8bdd99d")
        public static TagType GACOMMHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT;

        @objid ("22969128-4c61-4d62-b249-81495dc38b5e")
        public static TagType GACOMMHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("c18d6fbd-8e41-48d4-9a1e-1ea380ce8a4b")
        public static TagType GACOMMHOST_CLASSIFIER_HOST_TAGTYPE_ELT;

        @objid ("154e250c-e836-4cd2-bf40-b629c52e8221")
        public static TagType GACOMMHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("2a73684f-7135-4eba-a58d-931ddc7d0e26")
        public static TagType GACOMMHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("2bc0529c-82c5-4ba0-ab73-aecf098a2852")
        private static Stereotype MDAASSOCDEP;

        @objid ("84775162-843f-423a-bded-442c8d7e284d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c9983f8a-988c-4c58-94e8-694f6dab06a9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aece303f-14a6-11df-9d54-0014222a9f79");
            GACOMMHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "aece3040-14a6-11df-9d54-0014222a9f79");
            GACOMMHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "aece3041-14a6-11df-9d54-0014222a9f79");
            GACOMMHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b65d-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b65e-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b65f-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b660-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b661-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_CLASSIFIER_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b662-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b663-1669-11df-b9be-0014222a9f79");
            GACOMMHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "99b5b664-1669-11df-b9be-0014222a9f79");
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
