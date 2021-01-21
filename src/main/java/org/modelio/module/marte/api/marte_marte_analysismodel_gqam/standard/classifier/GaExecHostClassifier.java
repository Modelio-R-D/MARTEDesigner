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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ComputingResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << GaExecHost_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("cead776b-df3b-4476-8e8e-f6060dfc48f5")
public class GaExecHostClassifier extends ComputingResourceClassifier {
    @objid ("70715873-d575-4863-afd4-64c7ecec437e")
    public static final String STEREOTYPE_NAME = "GaExecHost_Classifier";

    @objid ("a67695a9-a739-430f-92a3-6cf64b9bb640")
    public static final String GAEXECHOST_CLASSIFIER_CLOCKOVH_TAGTYPE = "GaExecHost_Classifier_clockOvh";

    @objid ("f13347cb-5572-4e82-8ee8-b40704b7e7ed")
    public static final String GAEXECHOST_CLASSIFIER_CNTXTSWT_TAGTYPE = "GaExecHost_Classifier_cntxtSwT";

    @objid ("a43c84bb-2c2d-4b82-88dd-a80bf090977b")
    public static final String GAEXECHOST_CLASSIFIER_COMMRCVOVH_TAGTYPE = "GaExecHost_Classifier_commRcvOvh";

    @objid ("8be5eecb-a050-4bed-a66d-bfc56722d94a")
    public static final String GAEXECHOST_CLASSIFIER_COMMTXOVH_TAGTYPE = "GaExecHost_Classifier_commTxOvh";

    @objid ("d24e3490-7c3d-494e-86bc-98afbcffba54")
    public static final String GAEXECHOST_CLASSIFIER_HOST_TAGTYPE = "GaExecHost_Classifier_host";

    @objid ("47a3aae4-9a68-400b-ba5f-ec59341e8aac")
    public static final String GAEXECHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE = "GaExecHost_Classifier_isPreemptible";

    @objid ("1fac1c3a-7979-4ff7-a972-559721c48e32")
    public static final String GAEXECHOST_CLASSIFIER_MEMSIZE_TAGTYPE = "GaExecHost_Classifier_memSize";

    @objid ("f2f8a245-9f1f-4ee0-b7e9-00a835fd125e")
    public static final String GAEXECHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE = "GaExecHost_Classifier_otherSchedPolicy";

    @objid ("d1138bf8-4295-477b-9920-8f79d4422f5a")
    public static final String GAEXECHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE = "GaExecHost_Classifier_processingUnits";

    @objid ("a37d86cc-1db1-466b-b3c0-fb1c88fdad41")
    public static final String GAEXECHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaExecHost_Classifier_protectedSharedResources";

    @objid ("fa00892d-9d59-493c-91a0-17bb2b1440c2")
    public static final String GAEXECHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE = "GaExecHost_Classifier_schedPolicy";

    @objid ("a82ba749-ffa3-4521-8ed6-f707b183a3c3")
    public static final String GAEXECHOST_CLASSIFIER_SCHEDPRIRANGE_TAGTYPE = "GaExecHost_Classifier_schedPriRange";

    @objid ("831ef2e8-76a9-4bb6-ba08-f60ea7a90f6d")
    public static final String GAEXECHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE = "GaExecHost_Classifier_schedulableResources";

    @objid ("dbe7332f-9011-46fa-b173-753356001204")
    public static final String GAEXECHOST_CLASSIFIER_SCHEDULE_TAGTYPE = "GaExecHost_Classifier_schedule";

    @objid ("f9925e9a-e9dc-4860-886a-bafc66c29d21")
    public static final String GAEXECHOST_CLASSIFIER_THROUGHPUT_TAGTYPE = "GaExecHost_Classifier_throughput";

    @objid ("f6ff1cc6-665c-4a79-90f5-ae5167b108c5")
    public static final String GAEXECHOST_CLASSIFIER_UTILIZATION_TAGTYPE = "GaExecHost_Classifier_utilization";

    /**
     * Tells whether a {@link GaExecHostClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << GaExecHost_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("fa5747ef-9976-4537-bdc5-32fef36e71cf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << GaExecHost_Classifier >> then instantiate a {@link GaExecHostClassifier} proxy.
     * 
     * @return a {@link GaExecHostClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("07be5390-787f-46f7-bc9e-dc920309d56a")
    public static GaExecHostClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostClassifier.STEREOTYPE_NAME);
        return GaExecHostClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link GaExecHostClassifier} proxy from a {@link Classifier} stereotyped << GaExecHost_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link GaExecHostClassifier} proxy or <i>null</i>.
     */
    @objid ("e1274613-fbbe-48dd-bbc2-6474f10c9a8e")
    public static GaExecHostClassifier instantiate(final Classifier obj) {
        return GaExecHostClassifier.canInstantiate(obj) ? new GaExecHostClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaExecHostClassifier} proxy from a {@link Classifier} stereotyped << GaExecHost_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link GaExecHostClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4a041275-fedc-4fb5-b270-dabec4580293")
    public static GaExecHostClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (GaExecHostClassifier.canInstantiate(obj))
        	return new GaExecHostClassifier(obj);
        else
        	throw new IllegalArgumentException("GaExecHostClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("957f2973-ff4d-4bea-ac93-48c420f2c48f")
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
        GaExecHostClassifier other = (GaExecHostClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("6a19b665-76dd-4c9f-84a1-bac68cc6d09b")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e1aca342-d281-40c1-b98e-f71030b65c34")
    public String getGaExecHost_Classifier_clockOvh() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_CLOCKOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8cb922d0-7327-4dda-958e-bdbe685c34c9")
    public String getGaExecHost_Classifier_cntxtSwT() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_CNTXTSWT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("07c6882b-edae-4639-b716-29cc485a11f6")
    public String getGaExecHost_Classifier_commRcvOvh() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_COMMRCVOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d75b8746-c317-4bc3-8704-98ec5a1338f0")
    public String getGaExecHost_Classifier_commTxOvh() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_COMMTXOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa4ab5c5-7078-48c2-b05e-9f983a6400cc")
    public String getGaExecHost_Classifier_host() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("82a50fb0-10fb-4e46-8b7e-1d55cb866088")
    public String getGaExecHost_Classifier_memSize() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_MEMSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d665d6df-9a15-4ac5-914d-07d468d8f03f")
    public String getGaExecHost_Classifier_otherSchedPolicy() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Classifier_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("681c6c2e-7af9-4dba-9caa-2c6be89099ac")
    public List<String> getGaExecHost_Classifier_processingUnits() {
        return this.elt.getTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Classifier_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b58c5c3d-bee4-4fc0-b7cb-555ce777c5a9")
    public List<String> getGaExecHost_Classifier_protectedSharedResources() {
        return this.elt.getTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("27f54cd9-e891-4e08-a492-60e6548db298")
    public String getGaExecHost_Classifier_schedPolicy() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("574179ee-eea0-4570-94b5-99237004214c")
    public String getGaExecHost_Classifier_schedPriRange() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDPRIRANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Classifier_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6cd95cf7-6b26-4657-922b-7ac17ea7a63a")
    public List<String> getGaExecHost_Classifier_schedulableResources() {
        return this.elt.getTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Classifier_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e5280199-22e8-4dad-ba3e-93892553e284")
    public String getGaExecHost_Classifier_schedule() {
        return this.elt.getTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Classifier_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0fd9bfcc-ddcf-4b2d-8463-9558de4a629c")
    public List<String> getGaExecHost_Classifier_throughput() {
        return this.elt.getTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Classifier_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5b32283d-2840-4ba2-9ebd-ea7462297413")
    public List<String> getGaExecHost_Classifier_utilization() {
        return this.elt.getTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("50072547-fef0-42c6-bffe-89a5dcc2bcb2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaExecHost_Classifier_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2e3de7fc-332b-4ed7-a321-de4d9aaf0e02")
    public boolean isGaExecHost_Classifier_isPreemptible() {
        return this.elt.isTagged(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8c0f99c-362d-423c-bdf6-276556eed84a")
    public void setGaExecHost_Classifier_clockOvh(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_CLOCKOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("27e0bc0f-a881-47b7-a9b4-b787963b0f31")
    public void setGaExecHost_Classifier_cntxtSwT(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_CNTXTSWT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7871027c-1f61-406a-a84a-791b2f014954")
    public void setGaExecHost_Classifier_commRcvOvh(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_COMMRCVOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8fd6c1a-5192-4f47-9d74-10ceb20740cb")
    public void setGaExecHost_Classifier_commTxOvh(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_COMMTXOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("41c802ed-bc1c-497c-a78e-0ed75c8af0a7")
    public void setGaExecHost_Classifier_host(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaExecHost_Classifier_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ad278ac1-e6ae-4d66-a734-a2dcef394510")
    public void setGaExecHost_Classifier_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("629cf649-331f-4790-ad8e-8c34d1b8bda0")
    public void setGaExecHost_Classifier_memSize(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_MEMSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f425ff7b-317b-4f5f-9958-755902998739")
    public void setGaExecHost_Classifier_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Classifier_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9917b3f4-cc3b-44fb-a3b6-0fb69b6a785b")
    public void setGaExecHost_Classifier_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Classifier_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("65d8159b-3dfd-4c0b-8943-30a0693eaf2e")
    public void setGaExecHost_Classifier_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5928e4db-1b1b-487e-905e-599906bd34ee")
    public void setGaExecHost_Classifier_schedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eda84dec-8518-4705-bbfb-cee565950168")
    public void setGaExecHost_Classifier_schedPriRange(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDPRIRANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Classifier_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("13a0fa18-b2c4-4dc3-8484-f2e0ec7f8013")
    public void setGaExecHost_Classifier_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Classifier_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cb5f387f-15cf-4f61-aec1-8bba2ce5e8c7")
    public void setGaExecHost_Classifier_schedule(final String value) {
        this.elt.putTagValue(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Classifier_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0386e433-b990-470d-b7c3-2344c2e933eb")
    public void setGaExecHost_Classifier_throughput(final List<String> values) {
        this.elt.putTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Classifier_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a261ce7-a48d-4ba4-a1d2-545409093e79")
    public void setGaExecHost_Classifier_utilization(final List<String> values) {
        this.elt.putTagValues(GaExecHostClassifier.MdaTypes.GAEXECHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("1a7829d1-1dce-4bc7-b09a-ce7ce790ccfe")
    protected GaExecHostClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("4816860b-aa22-46a8-96b7-7c29db4b0163")
    public static final class MdaTypes {
        @objid ("95a109a4-fd81-41c0-bef8-d0b5bbf757e3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e9dcc480-2716-4ae2-b3e0-50d2dedfefa0")
        public static TagType GAEXECHOST_CLASSIFIER_COMMTXOVH_TAGTYPE_ELT;

        @objid ("b0e01516-0c7a-4a99-8542-ea99ebc971fd")
        public static TagType GAEXECHOST_CLASSIFIER_COMMRCVOVH_TAGTYPE_ELT;

        @objid ("ccce8353-a86f-45d5-a79b-d3cc9188d13f")
        public static TagType GAEXECHOST_CLASSIFIER_CNTXTSWT_TAGTYPE_ELT;

        @objid ("c8afa990-acc7-4f5a-8850-809438e58507")
        public static TagType GAEXECHOST_CLASSIFIER_CLOCKOVH_TAGTYPE_ELT;

        @objid ("6e55d690-0604-48ee-a41f-197fc907f2d6")
        public static TagType GAEXECHOST_CLASSIFIER_SCHEDPRIRANGE_TAGTYPE_ELT;

        @objid ("cbb0277b-dae3-4959-93da-7ff6e123ee52")
        public static TagType GAEXECHOST_CLASSIFIER_MEMSIZE_TAGTYPE_ELT;

        @objid ("9d229e3f-bef3-4f4f-9ea4-3ef3329f6247")
        public static TagType GAEXECHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT;

        @objid ("3f701cfb-16d4-4fca-81fc-82677ff50874")
        public static TagType GAEXECHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT;

        @objid ("2cd5366c-6b2d-42a3-997a-1db05f9473b9")
        public static TagType GAEXECHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("02744763-8cfa-4412-9187-fdd1825ee6ae")
        public static TagType GAEXECHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("1dc27939-c040-45be-ab55-63ed01aa390d")
        public static TagType GAEXECHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("eebae579-7173-4315-ae7c-f64c465994b0")
        public static TagType GAEXECHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT;

        @objid ("5138ef9d-7caa-427a-9f37-71662cbb7a7c")
        public static TagType GAEXECHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("ff4c643e-279d-4c70-8edf-e4dec1bf0645")
        public static TagType GAEXECHOST_CLASSIFIER_HOST_TAGTYPE_ELT;

        @objid ("8ce8f745-3eec-4d79-9644-cb354c24525b")
        public static TagType GAEXECHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("c00478d7-e217-423a-9574-00582cdb84fb")
        public static TagType GAEXECHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("46e5d1a7-7620-4f52-9e8e-11593e1ead8a")
        private static Stereotype MDAASSOCDEP;

        @objid ("2557388d-07b0-4f2f-a9fa-1cc5c41be6df")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0f271e28-cabe-4a70-a092-dfd0e82ce8b4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3663ad70-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_COMMTXOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad71-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_COMMRCVOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad72-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_CNTXTSWT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad73-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_CLOCKOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad74-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_SCHEDPRIRANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad75-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_MEMSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad76-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad77-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3663ad78-14a7-11df-9d54-0014222a9f79");
            GAEXECHOST_CLASSIFIER_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c718266-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_CLASSIFIER_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c718267-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_CLASSIFIER_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c718268-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_CLASSIFIER_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c718269-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_CLASSIFIER_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c71826a-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_CLASSIFIER_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c71826b-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_CLASSIFIER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c71826c-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_CLASSIFIER_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c71826d-16ea-11df-b92a-0014222a9f79");
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
