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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ComputingResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << GaExecHost_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7d633013-7e5a-44b7-9fbc-5e9e48db4f3c")
public class GaExecHostAssociationEnd extends ComputingResourceAssociationEnd {
    @objid ("be0a850b-08f8-4a87-8a00-a9d526b448a8")
    public static final String STEREOTYPE_NAME = "GaExecHost_AssociationEnd";

    @objid ("5054cb27-7439-4755-8e0a-4707f1392d88")
    public static final String GAEXECHOST_ASSOCIATIONEND_CLOCKOVH_TAGTYPE = "GaExecHost_AssociationEnd_clockOvh";

    @objid ("a2e62e40-380e-45f3-b204-44530cf19610")
    public static final String GAEXECHOST_ASSOCIATIONEND_CNTXTSWT_TAGTYPE = "GaExecHost_AssociationEnd_cntxtSwT";

    @objid ("9463b032-6cdd-4ee3-9061-31ae87f48375")
    public static final String GAEXECHOST_ASSOCIATIONEND_COMMRCVOVH_TAGTYPE = "GaExecHost_AssociationEnd_commRcvOvh";

    @objid ("c932b83e-e315-4205-b042-7700e12003e1")
    public static final String GAEXECHOST_ASSOCIATIONEND_COMMTXOVH_TAGTYPE = "GaExecHost_AssociationEnd_commTxOvh";

    @objid ("196cf25e-7d0c-4f50-9a5c-cbd4285446c1")
    public static final String GAEXECHOST_ASSOCIATIONEND_HOST_TAGTYPE = "GaExecHost_AssociationEnd_host";

    @objid ("98b0470b-ded8-43a8-9f35-eefec6f65c87")
    public static final String GAEXECHOST_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE = "GaExecHost_AssociationEnd_isPreemptible";

    @objid ("32a7b569-20f4-467f-a9af-bdb259bca4f4")
    public static final String GAEXECHOST_ASSOCIATIONEND_MEMSIZE_TAGTYPE = "GaExecHost_AssociationEnd_memSize";

    @objid ("8edc0b8b-9915-432f-b1fa-6ac52f32193e")
    public static final String GAEXECHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE = "GaExecHost_AssociationEnd_otherSchedPolicy";

    @objid ("8522d360-557c-4a0f-85b4-fd7256fdf09b")
    public static final String GAEXECHOST_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE = "GaExecHost_AssociationEnd_processingUnits";

    @objid ("3800935e-6683-49c2-bddd-6b95fcfea03e")
    public static final String GAEXECHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaExecHost_AssociationEnd_protectedSharedResources";

    @objid ("f38d573f-0153-4aaf-a7fb-6a1d24c26123")
    public static final String GAEXECHOST_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE = "GaExecHost_AssociationEnd_schedPolicy";

    @objid ("adc22567-3685-472f-8463-2f2955a0636f")
    public static final String GAEXECHOST_ASSOCIATIONEND_SCHEDPRIRANGE_TAGTYPE = "GaExecHost_AssociationEnd_schedPriRange";

    @objid ("4a270455-b823-4038-8c18-a220ce45d498")
    public static final String GAEXECHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE = "GaExecHost_AssociationEnd_schedulableResources";

    @objid ("a43c18fb-754e-40af-bd66-f3ee617ca4c3")
    public static final String GAEXECHOST_ASSOCIATIONEND_SCHEDULE_TAGTYPE = "GaExecHost_AssociationEnd_schedule";

    @objid ("6f823ab9-7bcb-4707-938d-fd86102d1161")
    public static final String GAEXECHOST_ASSOCIATIONEND_THROUGHPUT_TAGTYPE = "GaExecHost_AssociationEnd_throughput";

    @objid ("61fd7f2b-6441-41f3-a02f-43425681701d")
    public static final String GAEXECHOST_ASSOCIATIONEND_UTILIZATION_TAGTYPE = "GaExecHost_AssociationEnd_utilization";

    /**
     * Tells whether a {@link GaExecHostAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << GaExecHost_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("35a70a25-bfda-45b5-930f-56b10b707553")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << GaExecHost_AssociationEnd >> then instantiate a {@link GaExecHostAssociationEnd} proxy.
     * 
     * @return a {@link GaExecHostAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("7680ca8c-e8f1-42b6-b41b-3e4d4c0ce58b")
    public static GaExecHostAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostAssociationEnd.STEREOTYPE_NAME);
        return GaExecHostAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link GaExecHostAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << GaExecHost_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link GaExecHostAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("192745aa-0dbb-482e-a328-44c55e5c46da")
    public static GaExecHostAssociationEnd instantiate(final AssociationEnd obj) {
        return GaExecHostAssociationEnd.canInstantiate(obj) ? new GaExecHostAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaExecHostAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << GaExecHost_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link GaExecHostAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9048d08b-9f48-4484-8591-360638eec9b3")
    public static GaExecHostAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (GaExecHostAssociationEnd.canInstantiate(obj))
        	return new GaExecHostAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("GaExecHostAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ca14c4b3-646e-428a-b2e3-3180ec4c895c")
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
        GaExecHostAssociationEnd other = (GaExecHostAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("c50f4554-d473-4b11-a277-4efbe5fd39f6")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'GaExecHost_AssociationEnd_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a0981f15-390b-4437-b9a7-dd850addc59a")
    public String getGaExecHost_AssociationEnd_clockOvh() {
        return this.elt.getTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_CLOCKOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_AssociationEnd_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d8b58fd4-a339-4c06-be0e-6a0ac93e2b55")
    public String getGaExecHost_AssociationEnd_cntxtSwT() {
        return this.elt.getTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_CNTXTSWT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_AssociationEnd_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c41d6729-54ce-46d8-8864-697ef3af2961")
    public String getGaExecHost_AssociationEnd_commRcvOvh() {
        return this.elt.getTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_COMMRCVOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_AssociationEnd_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cdbf41f5-1ab7-4d3a-87ec-4bb6d93be903")
    public String getGaExecHost_AssociationEnd_commTxOvh() {
        return this.elt.getTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_COMMTXOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0f744b00-6c87-4437-88d3-afc4462844be")
    public String getGaExecHost_AssociationEnd_host() {
        return this.elt.getTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_AssociationEnd_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("98884ce3-4b50-435e-81a0-2731c1e4f7ae")
    public String getGaExecHost_AssociationEnd_memSize() {
        return this.elt.getTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_MEMSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_AssociationEnd_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c217ad1c-514e-45f3-baf8-375d57862af0")
    public String getGaExecHost_AssociationEnd_otherSchedPolicy() {
        return this.elt.getTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_AssociationEnd_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("600a663b-4c77-4b3e-80b2-a951bc969108")
    public List<String> getGaExecHost_AssociationEnd_processingUnits() {
        return this.elt.getTagValues(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_AssociationEnd_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f50a6b24-4e19-478b-92da-c6bce4a9dc63")
    public List<String> getGaExecHost_AssociationEnd_protectedSharedResources() {
        return this.elt.getTagValues(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_AssociationEnd_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b75d9a1-f292-4eb4-a3a2-cf94f522e494")
    public String getGaExecHost_AssociationEnd_schedPolicy() {
        return this.elt.getTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_AssociationEnd_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8360e72b-e9f9-4c57-a476-6513af846a44")
    public String getGaExecHost_AssociationEnd_schedPriRange() {
        return this.elt.getTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_SCHEDPRIRANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_AssociationEnd_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3937f8a2-846c-4c2f-afec-b3e64d425f2b")
    public List<String> getGaExecHost_AssociationEnd_schedulableResources() {
        return this.elt.getTagValues(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_AssociationEnd_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e4d42d4a-70a0-4293-9c09-497b370b87a4")
    public String getGaExecHost_AssociationEnd_schedule() {
        return this.elt.getTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_AssociationEnd_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e8360f4f-c510-47ba-b1d0-676c63a3b64b")
    public List<String> getGaExecHost_AssociationEnd_throughput() {
        return this.elt.getTagValues(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_AssociationEnd_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("33114597-ccef-4803-9796-4945169c0a66")
    public List<String> getGaExecHost_AssociationEnd_utilization() {
        return this.elt.getTagValues(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("53a424c9-6a59-4d57-ac71-4f56e2108925")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaExecHost_AssociationEnd_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1baa6b5-e609-49e9-85a9-9ff18b7cd4d2")
    public boolean isGaExecHost_AssociationEnd_isPreemptible() {
        return this.elt.isTagged(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_AssociationEnd_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("57f3870e-b169-43e3-a7e8-155ba1257f81")
    public void setGaExecHost_AssociationEnd_clockOvh(final String value) {
        this.elt.putTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_CLOCKOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_AssociationEnd_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6fbd68e4-b661-443e-b68c-cde9d8b94272")
    public void setGaExecHost_AssociationEnd_cntxtSwT(final String value) {
        this.elt.putTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_CNTXTSWT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_AssociationEnd_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be83fe9b-91bc-421e-8b4d-03e3c0a8703d")
    public void setGaExecHost_AssociationEnd_commRcvOvh(final String value) {
        this.elt.putTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_COMMRCVOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_AssociationEnd_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("53462f37-82aa-433e-8257-60939da32c3e")
    public void setGaExecHost_AssociationEnd_commTxOvh(final String value) {
        this.elt.putTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_COMMTXOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("754d0a2f-a0ea-4a5d-965f-3073c2ad4015")
    public void setGaExecHost_AssociationEnd_host(final String value) {
        this.elt.putTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaExecHost_AssociationEnd_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("58269c19-2a8e-4d1c-b623-961f7c3ca3f6")
    public void setGaExecHost_AssociationEnd_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_AssociationEnd_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c600f4eb-dbda-4508-92d3-6610345275d6")
    public void setGaExecHost_AssociationEnd_memSize(final String value) {
        this.elt.putTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_MEMSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_AssociationEnd_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b325b862-c5af-4869-ace0-c02979f1f368")
    public void setGaExecHost_AssociationEnd_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_AssociationEnd_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("871ecbfc-518f-4c98-adf7-7979c110da62")
    public void setGaExecHost_AssociationEnd_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_AssociationEnd_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b5f24f2-3279-4b83-ab1d-bffe40d27f1c")
    public void setGaExecHost_AssociationEnd_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_AssociationEnd_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("43ac39b2-0602-4bcc-9150-cc5b7351dfed")
    public void setGaExecHost_AssociationEnd_schedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_AssociationEnd_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dd70e040-00b1-499f-8d64-61502a382390")
    public void setGaExecHost_AssociationEnd_schedPriRange(final String value) {
        this.elt.putTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_SCHEDPRIRANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_AssociationEnd_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("12b664c5-f5c1-41f2-9391-96dfebb8265a")
    public void setGaExecHost_AssociationEnd_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_AssociationEnd_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cba5c31a-6cc1-4818-b07a-f2fd915f898c")
    public void setGaExecHost_AssociationEnd_schedule(final String value) {
        this.elt.putTagValue(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_AssociationEnd_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ecc21900-c3b5-42ea-b17e-80f520c38ddf")
    public void setGaExecHost_AssociationEnd_throughput(final List<String> values) {
        this.elt.putTagValues(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_AssociationEnd_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("46f66aee-4450-4cc8-a845-c22bdf10717f")
    public void setGaExecHost_AssociationEnd_utilization(final List<String> values) {
        this.elt.putTagValues(GaExecHostAssociationEnd.MdaTypes.GAEXECHOST_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("2c801df9-d9ef-454d-bf45-8f2459d37796")
    protected GaExecHostAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("060ba3a2-adcc-4f39-8f53-b6b025088ab8")
    public static final class MdaTypes {
        @objid ("9c42cae3-6f78-40d4-ac65-826c81a39b55")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("048e2f14-7276-4d94-8541-8dd4835023a1")
        public static TagType GAEXECHOST_ASSOCIATIONEND_COMMTXOVH_TAGTYPE_ELT;

        @objid ("507d6e20-7428-4786-9dc0-860d328a8fc7")
        public static TagType GAEXECHOST_ASSOCIATIONEND_COMMRCVOVH_TAGTYPE_ELT;

        @objid ("30dfcda1-c15e-4432-b1aa-3bb1f1b29804")
        public static TagType GAEXECHOST_ASSOCIATIONEND_CNTXTSWT_TAGTYPE_ELT;

        @objid ("cc52f695-4eeb-458d-84bf-a332f7a6084c")
        public static TagType GAEXECHOST_ASSOCIATIONEND_CLOCKOVH_TAGTYPE_ELT;

        @objid ("e102ebde-3465-4b0c-bb8f-e632ae2aab96")
        public static TagType GAEXECHOST_ASSOCIATIONEND_SCHEDPRIRANGE_TAGTYPE_ELT;

        @objid ("b789aa8b-2239-45d4-b012-e6ed2267d442")
        public static TagType GAEXECHOST_ASSOCIATIONEND_MEMSIZE_TAGTYPE_ELT;

        @objid ("683b0abd-39b6-4091-9fb1-b2122d58d585")
        public static TagType GAEXECHOST_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT;

        @objid ("243d0060-9eba-40e7-9eda-a1556084cf18")
        public static TagType GAEXECHOST_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT;

        @objid ("8185f082-19e2-4c5b-94f3-66577947fa4c")
        public static TagType GAEXECHOST_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("1aaf55ff-81e6-4044-821a-7907a075e849")
        public static TagType GAEXECHOST_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("c2ff9026-535c-4e04-b5f2-acb6fc30b363")
        public static TagType GAEXECHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("dab66c66-8c5d-4336-b9e0-919a5666b369")
        public static TagType GAEXECHOST_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT;

        @objid ("0bf71ed3-e010-4b48-85cd-41f49403b7bf")
        public static TagType GAEXECHOST_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("718036bf-5110-42e0-ab13-74a3c8ec19c2")
        public static TagType GAEXECHOST_ASSOCIATIONEND_HOST_TAGTYPE_ELT;

        @objid ("cd23d7f9-20b8-4527-81bf-ddd705090e27")
        public static TagType GAEXECHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("e738bb63-4b7e-49c6-b500-eb9d71e00c35")
        public static TagType GAEXECHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("0adc502b-0b61-4116-a01d-df7cc565b347")
        private static Stereotype MDAASSOCDEP;

        @objid ("555d9358-e96d-41a4-91b4-3b6bef207336")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a2f4571a-ae03-4c34-9d4a-3f3551529c6a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0360f843-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ASSOCIATIONEND_COMMTXOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635a95-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ASSOCIATIONEND_COMMRCVOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635a9c-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ASSOCIATIONEND_CNTXTSWT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635aa3-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ASSOCIATIONEND_CLOCKOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bce9-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ASSOCIATIONEND_SCHEDPRIRANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcf0-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ASSOCIATIONEND_MEMSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcf7-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcfe-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bd05-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_ASSOCIATIONEND_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "24495a36-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ASSOCIATIONEND_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "24495a37-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "24495a38-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ASSOCIATIONEND_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "24495a39-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ASSOCIATIONEND_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "24495a3a-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ASSOCIATIONEND_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "24495a3b-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "24495a3c-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "24495a3d-16ea-11df-b92a-0014222a9f79");
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
