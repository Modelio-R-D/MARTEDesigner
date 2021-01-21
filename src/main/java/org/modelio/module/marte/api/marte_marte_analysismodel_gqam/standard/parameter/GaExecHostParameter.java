/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ComputingResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << GaExecHost_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d2c9f5f5-bb7c-4f2c-b257-d30558c4c9dd")
public class GaExecHostParameter extends ComputingResourceParameter {
    @objid ("b8c20a20-0e23-4352-abfa-aed6e965fa87")
    public static final String STEREOTYPE_NAME = "GaExecHost_Parameter";

    @objid ("eb0f3a4b-e6ac-4e1a-97df-e3545155c5e6")
    public static final String GAEXECHOST_PARAMETER_CLOCKOVH_TAGTYPE = "GaExecHost_Parameter_clockOvh";

    @objid ("014a3f6b-6123-4bf4-96b0-a2856e22a42a")
    public static final String GAEXECHOST_PARAMETER_CNTXTSWT_TAGTYPE = "GaExecHost_Parameter_cntxtSwT";

    @objid ("df51a1fc-f5e7-4d03-85c8-45252ebd4dc2")
    public static final String GAEXECHOST_PARAMETER_COMMRCVOVH_TAGTYPE = "GaExecHost_Parameter_commRcvOvh";

    @objid ("5a94a48d-e8f7-474c-889e-cbcebfc90359")
    public static final String GAEXECHOST_PARAMETER_COMMTXOVH_TAGTYPE = "GaExecHost_Parameter_commTxOvh";

    @objid ("d914f917-b94e-4d01-88a2-2fe4266c70c9")
    public static final String GAEXECHOST_PARAMETER_HOST_TAGTYPE = "GaExecHost_Parameter_host";

    @objid ("3733b926-f2ed-4a5a-aef2-ae0005500ad5")
    public static final String GAEXECHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE = "GaExecHost_Parameter_isPreemptible";

    @objid ("b67e2ca2-ee1a-4f5a-b654-ca92e6cf9d42")
    public static final String GAEXECHOST_PARAMETER_MEMSIZE_TAGTYPE = "GaExecHost_Parameter_memSize";

    @objid ("342155e2-2e52-4931-8f90-3b179e14a695")
    public static final String GAEXECHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE = "GaExecHost_Parameter_otherSchedPolicy";

    @objid ("a22420ac-9d0d-4d4b-9fb0-cc52f97455d6")
    public static final String GAEXECHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE = "GaExecHost_Parameter_processingUnits";

    @objid ("bec7061d-baa9-4f07-bd79-6094824eca6d")
    public static final String GAEXECHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE = "GaExecHost_Parameter_protectedSharedResources";

    @objid ("d2b6a16a-363d-4b43-86b0-a93cf0164c5b")
    public static final String GAEXECHOST_PARAMETER_SCHEDPOLICY_TAGTYPE = "GaExecHost_Parameter_schedPolicy";

    @objid ("56ef1853-f3d8-4aa4-a311-8ae6bafc50f7")
    public static final String GAEXECHOST_PARAMETER_SCHEDPRIRANGE_TAGTYPE = "GaExecHost_Parameter_schedPriRange";

    @objid ("890c2322-c9b5-4b70-8038-bc2bc74d813a")
    public static final String GAEXECHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE = "GaExecHost_Parameter_schedulableResources";

    @objid ("2bc26a90-a97e-45e2-a413-99d6c6955970")
    public static final String GAEXECHOST_PARAMETER_SCHEDULE_TAGTYPE = "GaExecHost_Parameter_schedule";

    @objid ("3a0e9077-794f-4941-b2d9-8903593e3630")
    public static final String GAEXECHOST_PARAMETER_THROUGHPUT_TAGTYPE = "GaExecHost_Parameter_throughput";

    @objid ("32b053ba-ff46-4b13-ae74-caf1dd81e4a9")
    public static final String GAEXECHOST_PARAMETER_UTILIZATION_TAGTYPE = "GaExecHost_Parameter_utilization";

    /**
     * Tells whether a {@link GaExecHostParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << GaExecHost_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("123f50d4-b3b0-425d-8b23-fd7854a622c3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << GaExecHost_Parameter >> then instantiate a {@link GaExecHostParameter} proxy.
     * 
     * @return a {@link GaExecHostParameter} proxy on the created {@link Parameter}.
     */
    @objid ("3c194914-7361-4970-b7d8-dfe364bb6b87")
    public static GaExecHostParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaExecHostParameter.STEREOTYPE_NAME);
        return GaExecHostParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link GaExecHostParameter} proxy from a {@link Parameter} stereotyped << GaExecHost_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link GaExecHostParameter} proxy or <i>null</i>.
     */
    @objid ("8ca28fb3-112c-4219-846c-7a69c1351811")
    public static GaExecHostParameter instantiate(final Parameter obj) {
        return GaExecHostParameter.canInstantiate(obj) ? new GaExecHostParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaExecHostParameter} proxy from a {@link Parameter} stereotyped << GaExecHost_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link GaExecHostParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b2254a81-029e-4ef8-a5d8-18b9014a1870")
    public static GaExecHostParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (GaExecHostParameter.canInstantiate(obj))
        	return new GaExecHostParameter(obj);
        else
        	throw new IllegalArgumentException("GaExecHostParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("450ce553-5e85-4e5d-ac5d-e9b1817ad415")
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
        GaExecHostParameter other = (GaExecHostParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("2c14af4e-1fdd-4de0-aad5-57a2936c55c1")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1bee74d5-25a2-4551-a8ec-fbfc2c156250")
    public String getGaExecHost_Parameter_clockOvh() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_CLOCKOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8f39e2e9-bb66-45d5-ba9a-b96c57ef95d3")
    public String getGaExecHost_Parameter_cntxtSwT() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_CNTXTSWT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("faa00dcc-db57-4e7f-8dc6-fd6cb4b816ce")
    public String getGaExecHost_Parameter_commRcvOvh() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_COMMRCVOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7fa7d599-7fe8-4e1d-af30-84aa2dd3355f")
    public String getGaExecHost_Parameter_commTxOvh() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_COMMTXOVH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e97b8c48-f690-4a11-a0c5-59b1f16add3b")
    public String getGaExecHost_Parameter_host() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1d15656-c958-4c61-958f-33c06919e925")
    public String getGaExecHost_Parameter_memSize() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_MEMSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("51b1b340-8a42-4209-88fe-0894983acd01")
    public String getGaExecHost_Parameter_otherSchedPolicy() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Parameter_processingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("787b6232-24e5-4a58-9302-1e765e35b235")
    public List<String> getGaExecHost_Parameter_processingUnits() {
        return this.elt.getTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Parameter_protectedSharedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ca85262a-f8d9-4f21-9a52-27999181a180")
    public List<String> getGaExecHost_Parameter_protectedSharedResources() {
        return this.elt.getTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e4989538-eb5c-4e21-a21a-375c4116845f")
    public String getGaExecHost_Parameter_schedPolicy() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5a91fc2f-349b-46b3-bbf4-26b9cdbc5b77")
    public String getGaExecHost_Parameter_schedPriRange() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDPRIRANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Parameter_schedulableResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("69046fd6-4244-4228-9983-0f360e1b7e7d")
    public List<String> getGaExecHost_Parameter_schedulableResources() {
        return this.elt.getTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaExecHost_Parameter_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c802230e-433c-4498-aba5-01400e4beb7f")
    public String getGaExecHost_Parameter_schedule() {
        return this.elt.getTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDULE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Parameter_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("874661b1-db91-4256-a18e-e9fcf620a44a")
    public List<String> getGaExecHost_Parameter_throughput() {
        return this.elt.getTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaExecHost_Parameter_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7f69d217-5ed4-463e-b9f5-5eceeaceaf12")
    public List<String> getGaExecHost_Parameter_utilization() {
        return this.elt.getTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("b4189d71-bf47-4ec3-bc1b-2945877eab5a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaExecHost_Parameter_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f4629ef3-b9f4-4389-8d8a-8389935ed96c")
    public boolean isGaExecHost_Parameter_isPreemptible() {
        return this.elt.isTagged(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_clockOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("07d2cdf8-450e-4257-b1c1-6bec36ec9348")
    public void setGaExecHost_Parameter_clockOvh(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_CLOCKOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_cntxtSwT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("05a4903e-c2a5-40da-9287-b2c346665257")
    public void setGaExecHost_Parameter_cntxtSwT(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_CNTXTSWT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_commRcvOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1730774b-c824-4682-ae71-00e878f329e8")
    public void setGaExecHost_Parameter_commRcvOvh(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_COMMRCVOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_commTxOvh'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d834578c-6cb0-46e4-b66d-ea3e76d1f44e")
    public void setGaExecHost_Parameter_commTxOvh(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_COMMTXOVH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a9d10ea4-f0e7-4adb-b66c-8eb6f3c72209")
    public void setGaExecHost_Parameter_host(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaExecHost_Parameter_isPreemptible'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ddb13c5-1ce7-41f7-bb34-1d8c838aadf1")
    public void setGaExecHost_Parameter_isPreemptible(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_memSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0f58fb3f-b5dd-46cb-8019-b41dacc13796")
    public void setGaExecHost_Parameter_memSize(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_MEMSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_otherSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6a69c4da-6c0a-407e-a699-7b42ff7b9b99")
    public void setGaExecHost_Parameter_otherSchedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Parameter_processingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3a563e3b-d1a6-4bbc-aae2-deab111af7bf")
    public void setGaExecHost_Parameter_processingUnits(final List<String> values) {
        this.elt.putTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Parameter_protectedSharedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("99ababef-cf63-4295-86a3-b72e3dcf1374")
    public void setGaExecHost_Parameter_protectedSharedResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_schedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ebe280e2-6cec-4fab-9967-d065f40d7e89")
    public void setGaExecHost_Parameter_schedPolicy(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_schedPriRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9343bfcb-3311-4e33-ac34-5fe9bc4e31d6")
    public void setGaExecHost_Parameter_schedPriRange(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDPRIRANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Parameter_schedulableResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d64eec78-4f4f-44e1-b1f1-c4770666f5bf")
    public void setGaExecHost_Parameter_schedulableResources(final List<String> values) {
        this.elt.putTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaExecHost_Parameter_schedule'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da1f4968-3601-4814-ac74-f1bd2467dd13")
    public void setGaExecHost_Parameter_schedule(final String value) {
        this.elt.putTagValue(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_SCHEDULE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Parameter_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2b17f7e5-2a8a-41b2-be25-6f37c48ab59e")
    public void setGaExecHost_Parameter_throughput(final List<String> values) {
        this.elt.putTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaExecHost_Parameter_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b1387cc-4f09-42c2-9565-95b2be9c8220")
    public void setGaExecHost_Parameter_utilization(final List<String> values) {
        this.elt.putTagValues(GaExecHostParameter.MdaTypes.GAEXECHOST_PARAMETER_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("b16d58c0-6e63-4590-b950-67de31255d33")
    protected GaExecHostParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("9d83f306-e6ba-49e0-b4d2-51e9a6d41713")
    public static final class MdaTypes {
        @objid ("45d04cbe-2f6e-4aa2-85a2-2210f0c4d4cb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1c3d0597-c465-4b83-af6f-068a1de570e4")
        public static TagType GAEXECHOST_PARAMETER_COMMTXOVH_TAGTYPE_ELT;

        @objid ("1bdd3dc6-cfe7-49ed-bd0b-8ebd9aedc698")
        public static TagType GAEXECHOST_PARAMETER_COMMRCVOVH_TAGTYPE_ELT;

        @objid ("cd76cc7a-56d3-4349-97f0-0727b9c0344b")
        public static TagType GAEXECHOST_PARAMETER_CNTXTSWT_TAGTYPE_ELT;

        @objid ("8d80d92b-8717-4a94-ac7f-fbf2d5cba06d")
        public static TagType GAEXECHOST_PARAMETER_CLOCKOVH_TAGTYPE_ELT;

        @objid ("a7a395e8-be49-4a1e-a8c2-e98f085c8241")
        public static TagType GAEXECHOST_PARAMETER_SCHEDPRIRANGE_TAGTYPE_ELT;

        @objid ("05cd9fa3-e8f5-4b51-9af3-83fe93c32ac2")
        public static TagType GAEXECHOST_PARAMETER_MEMSIZE_TAGTYPE_ELT;

        @objid ("46f66fe9-264b-41aa-8053-620e025bf8af")
        public static TagType GAEXECHOST_PARAMETER_UTILIZATION_TAGTYPE_ELT;

        @objid ("b65aa9d9-636f-4abd-addc-059c2f14f5e7")
        public static TagType GAEXECHOST_PARAMETER_THROUGHPUT_TAGTYPE_ELT;

        @objid ("4683692f-5f2c-4d2d-ad49-c4f7c16876ee")
        public static TagType GAEXECHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT;

        @objid ("e9c027bb-ed25-454c-b476-6e2dacb8bdc8")
        public static TagType GAEXECHOST_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT;

        @objid ("7daea96f-c15a-4023-9685-79955d0a10ee")
        public static TagType GAEXECHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT;

        @objid ("39b2d941-564b-4937-b965-7dccecd6aa46")
        public static TagType GAEXECHOST_PARAMETER_SCHEDULE_TAGTYPE_ELT;

        @objid ("4894d102-42bd-40c1-9259-b2135752e8c9")
        public static TagType GAEXECHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("e219b903-7059-4bae-9e06-5b67b3ca666f")
        public static TagType GAEXECHOST_PARAMETER_HOST_TAGTYPE_ELT;

        @objid ("c758b9c8-93e4-44f5-9112-9eb327a7c69e")
        public static TagType GAEXECHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT;

        @objid ("9f44f5ac-9480-4bc1-86ae-6214f02f5cab")
        public static TagType GAEXECHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT;

        @objid ("9c41ca39-964b-4505-85e3-d3727cb980e5")
        private static Stereotype MDAASSOCDEP;

        @objid ("b222356b-b7ed-411a-8f97-e578cd50f310")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c7a59c60-1751-45fb-9762-278fed6e6fb0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0360f842-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_COMMTXOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635a94-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_COMMRCVOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635a9b-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_CNTXTSWT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03635aa2-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_CLOCKOVH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bce8-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_SCHEDPRIRANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcef-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_MEMSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcf6-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bcfd-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0365bd04-0ccf-11df-8525-001302895b2b");
            GAEXECHOST_PARAMETER_ISPREEMPTIBLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "197239fd-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_PARAMETER_SCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "197239fe-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_PARAMETER_OTHERSCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "197239ff-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_PARAMETER_SCHEDULE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "19723a00-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_PARAMETER_PROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "19723a01-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_PARAMETER_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "19723a02-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_PARAMETER_PROTECTEDSHAREDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "19723a03-16ea-11df-b92a-0014222a9f79");
            GAEXECHOST_PARAMETER_SCHEDULABLERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "19723a04-16ea-11df-b92a-0014222a9f79");
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
