/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.infrastructure.modelelement.ResourceUsageModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << GaScenario_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d17ad2f3-81c6-4a90-affd-83cb444059ba")
public class GaScenarioModelElement extends ResourceUsageModelElement {
    @objid ("e3fd21c8-ef6e-4083-be23-d3f12cf68f4d")
    public static final String STEREOTYPE_NAME = "GaScenario_ModelElement";

    @objid ("48f81ae8-9761-4f2f-94ab-316d2fbf602d")
    public static final String GASCENARIO_MODELELEMENT_ALLOCATEDMEMORY_TAGTYPE = "GaScenario_ModelElement_allocatedMemory";

    @objid ("e4a0225a-8865-4c25-bf1b-17863ec11e50")
    public static final String GASCENARIO_MODELELEMENT_CAUSE_TAGTYPE = "GaScenario_ModelElement_cause";

    @objid ("9199eec7-3db8-4276-b180-90d8fedcd109")
    public static final String GASCENARIO_MODELELEMENT_DURATION_TAGTYPE = "GaScenario_ModelElement_duration";

    @objid ("ae93b864-c28d-4e63-a3a2-bbd9cfca1129")
    public static final String GASCENARIO_MODELELEMENT_ENERGY_TAGTYPE = "GaScenario_ModelElement_energy";

    @objid ("18b6c84b-5205-446d-931c-697b68afde84")
    public static final String GASCENARIO_MODELELEMENT_EXECTIME_TAGTYPE = "GaScenario_ModelElement_execTime";

    @objid ("ec8b1f92-11e0-46be-abfc-061cef03af5a")
    public static final String GASCENARIO_MODELELEMENT_FINISH_TAGTYPE = "GaScenario_ModelElement_finish";

    @objid ("a93a551d-62c8-40ee-9990-fe876247ac4b")
    public static final String GASCENARIO_MODELELEMENT_HOSTDEMAND_TAGTYPE = "GaScenario_ModelElement_hostDemand";

    @objid ("40435943-0fae-4fbe-a4d5-83d45f8d5342")
    public static final String GASCENARIO_MODELELEMENT_HOSTDEMANDOPS_TAGTYPE = "GaScenario_ModelElement_hostDemandOps";

    @objid ("4ebccb37-257d-4607-8404-784d72557811")
    public static final String GASCENARIO_MODELELEMENT_INTEROCCT_TAGTYPE = "GaScenario_ModelElement_interOccT";

    @objid ("6f94dffd-c301-46fb-9194-305092f9a66c")
    public static final String GASCENARIO_MODELELEMENT_MSGSIZE_TAGTYPE = "GaScenario_ModelElement_msgSize";

    @objid ("9be0096e-9587-45ba-8b00-67bd4450dbda")
    public static final String GASCENARIO_MODELELEMENT_ON_TAGTYPE = "GaScenario_ModelElement_on";

    @objid ("da60165e-2da2-476e-a901-7aad0aea694b")
    public static final String GASCENARIO_MODELELEMENT_PARENTSTEP_TAGTYPE = "GaScenario_ModelElement_parentStep";

    @objid ("954d0dfb-a78b-4513-9dd2-8a38939cadbd")
    public static final String GASCENARIO_MODELELEMENT_POWERPEAK_TAGTYPE = "GaScenario_ModelElement_powerPeak";

    @objid ("45bae294-8b73-44fa-a769-fde450ce08c8")
    public static final String GASCENARIO_MODELELEMENT_RESPT_TAGTYPE = "GaScenario_ModelElement_respT";

    @objid ("9f4f5c1e-78cb-46d8-96f5-c6ae7b838dd6")
    public static final String GASCENARIO_MODELELEMENT_ROOT_TAGTYPE = "GaScenario_ModelElement_root";

    @objid ("5e9d5d04-7275-407d-a55f-31a63f0abeae")
    public static final String GASCENARIO_MODELELEMENT_START_TAGTYPE = "GaScenario_ModelElement_start";

    @objid ("02912438-1d4f-4772-ab85-52ae9526ec48")
    public static final String GASCENARIO_MODELELEMENT_STEPS_TAGTYPE = "GaScenario_ModelElement_steps";

    @objid ("86e06406-ab71-48e2-8807-5997a15426f4")
    public static final String GASCENARIO_MODELELEMENT_SUBUSAGE_TAGTYPE = "GaScenario_ModelElement_subUsage";

    @objid ("7aca902c-0739-4040-aa3a-a13c6842608f")
    public static final String GASCENARIO_MODELELEMENT_THROUGHPUT_TAGTYPE = "GaScenario_ModelElement_throughput";

    @objid ("5d91de1a-53ca-4f85-aeef-cb3c84c28736")
    public static final String GASCENARIO_MODELELEMENT_TIMING_TAGTYPE = "GaScenario_ModelElement_timing";

    @objid ("d5717a28-4fb1-4eab-b080-c205162ac7d5")
    public static final String GASCENARIO_MODELELEMENT_USEDMEMORY_TAGTYPE = "GaScenario_ModelElement_usedMemory";

    @objid ("826aa840-89e4-465a-9a33-f140401aefeb")
    public static final String GASCENARIO_MODELELEMENT_USEDRESOURCES_TAGTYPE = "GaScenario_ModelElement_usedResources";

    @objid ("cc20b5d3-38fb-408b-842d-9a2ba359fafe")
    public static final String GASCENARIO_MODELELEMENT_UTILIZATION_TAGTYPE = "GaScenario_ModelElement_utilization";

    @objid ("d6d9154e-078b-4f90-ae9d-cfe81cb1bd43")
    public static final String GASCENARIO_MODELELEMENT_UTILIZATIONONHOST_TAGTYPE = "GaScenario_ModelElement_utilizationOnHost";

    /**
     * Tells whether a {@link GaScenarioModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaScenario_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2019c879-dc07-41f0-9e63-12c4b6f704ed")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaScenarioModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaScenario_ModelElement >> then instantiate a {@link GaScenarioModelElement} proxy.
     * 
     * @return a {@link GaScenarioModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("90c267b9-9b30-4db6-a9fe-0167476eb27a")
    public static GaScenarioModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaScenarioModelElement.STEREOTYPE_NAME);
        return GaScenarioModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaScenarioModelElement} proxy from a {@link ModelElement} stereotyped << GaScenario_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaScenarioModelElement} proxy or <i>null</i>.
     */
    @objid ("4fa2ad52-6664-4ab9-84be-5e6c7b0a503e")
    public static GaScenarioModelElement instantiate(final ModelElement obj) {
        return GaScenarioModelElement.canInstantiate(obj) ? new GaScenarioModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaScenarioModelElement} proxy from a {@link ModelElement} stereotyped << GaScenario_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link GaScenarioModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4f46c99a-eae7-412c-a066-7743d8852b6e")
    public static GaScenarioModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaScenarioModelElement.canInstantiate(obj))
        	return new GaScenarioModelElement(obj);
        else
        	throw new IllegalArgumentException("GaScenarioModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e78698e8-465f-47bb-bbe9-f1b1ee2e806e")
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
        GaScenarioModelElement other = (GaScenarioModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("667a12ed-e337-4793-9036-0d7d595c7f36")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_allocatedMemory'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f442e383-56c9-48d2-a626-f5db4fe156bb")
    public List<String> getGaScenario_ModelElement_allocatedMemory() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ALLOCATEDMEMORY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaScenario_ModelElement_cause'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21569fb0-0153-49af-8757-67e4d5500161")
    public String getGaScenario_ModelElement_cause() {
        return this.elt.getTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_CAUSE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaScenario_ModelElement_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6c6015ac-2799-4d62-bde4-bddb2fb20383")
    public String getGaScenario_ModelElement_duration() {
        return this.elt.getTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_DURATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_energy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("567aa7bf-af49-48bd-aae4-1bf363df1c07")
    public List<String> getGaScenario_ModelElement_energy() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ENERGY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_execTime'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("24621043-2e92-4869-b018-50e5d6ec4a42")
    public List<String> getGaScenario_ModelElement_execTime() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_EXECTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaScenario_ModelElement_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("06cdb5ce-fce7-43a1-b5d8-e6ca5babd46b")
    public String getGaScenario_ModelElement_finish() {
        return this.elt.getTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_FINISH_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_hostDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fa40cbaf-b7b0-4a8e-9335-d35b25d18748")
    public List<String> getGaScenario_ModelElement_hostDemand() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_HOSTDEMAND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_hostDemandOps'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("16b188ed-0d79-420e-bb4e-c5a03eed272a")
    public List<String> getGaScenario_ModelElement_hostDemandOps() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_HOSTDEMANDOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_interOccT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("123432a7-43bb-453d-8cfd-026d97a77bdb")
    public List<String> getGaScenario_ModelElement_interOccT() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_INTEROCCT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_msgSize'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dd43ccbc-94e2-43f2-930d-4021c493cd22")
    public List<String> getGaScenario_ModelElement_msgSize() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_MSGSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a76336be-e9b3-452d-b8e0-5375506ca721")
    public List<String> getGaScenario_ModelElement_on() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ON_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaScenario_ModelElement_parentStep'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c71fdf4-e512-4520-b888-71594e001ad8")
    public String getGaScenario_ModelElement_parentStep() {
        return this.elt.getTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_PARENTSTEP_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_powerPeak'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5a5adb35-faa1-4b42-93bb-7fafd58100a0")
    public List<String> getGaScenario_ModelElement_powerPeak() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_POWERPEAK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_respT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e0e56762-c958-447d-a74d-63a3f9179047")
    public List<String> getGaScenario_ModelElement_respT() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_RESPT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaScenario_ModelElement_root'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d150628f-350c-40d5-899d-a95276e85ee4")
    public String getGaScenario_ModelElement_root() {
        return this.elt.getTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ROOT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaScenario_ModelElement_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6bb36519-ea9c-4aab-a278-3c6c39cf43fa")
    public String getGaScenario_ModelElement_start() {
        return this.elt.getTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_START_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_steps'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d0e22661-6f39-4040-81fa-11a68b5f293d")
    public List<String> getGaScenario_ModelElement_steps() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_STEPS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_subUsage'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6e3de421-153a-49c8-8d48-618d6db56594")
    public List<String> getGaScenario_ModelElement_subUsage() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_SUBUSAGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ab7788e2-fa00-4347-bca2-0bcaf8411fa0")
    public List<String> getGaScenario_ModelElement_throughput() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_timing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1d77e9ff-d1e1-43d6-9512-5a414303c1ba")
    public List<String> getGaScenario_ModelElement_timing() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_TIMING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_usedMemory'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8e355320-2069-4be6-afe9-29cf34c54ccb")
    public List<String> getGaScenario_ModelElement_usedMemory() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_USEDMEMORY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_usedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d52cafdf-2205-4415-97ef-835ede57759f")
    public List<String> getGaScenario_ModelElement_usedResources() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_USEDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e082e447-4b32-4f1e-a14f-8d723152172a")
    public List<String> getGaScenario_ModelElement_utilization() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_UTILIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_utilizationOnHost'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("823ebb42-7304-4f83-9f54-0711c99f6f42")
    public List<String> getGaScenario_ModelElement_utilizationOnHost() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_UTILIZATIONONHOST_TAGTYPE_ELT);
    }

    @objid ("39886cbe-837d-4a10-a1cd-39e868486ed7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_allocatedMemory'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60b33b9b-d152-4bae-8c68-e5d8bd2deadd")
    public void setGaScenario_ModelElement_allocatedMemory(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ALLOCATEDMEMORY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaScenario_ModelElement_cause'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1529284-bdbd-4965-b850-fbc8ab26c604")
    public void setGaScenario_ModelElement_cause(final String value) {
        this.elt.putTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_CAUSE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaScenario_ModelElement_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("61d0f3cb-6d1f-4b4e-b6e8-7c8335c90bf8")
    public void setGaScenario_ModelElement_duration(final String value) {
        this.elt.putTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_energy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3292714-97ce-4de5-ae3c-ec00f6bf2265")
    public void setGaScenario_ModelElement_energy(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ENERGY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_execTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("425cc0da-92ca-49a5-ab14-de35fad55ec9")
    public void setGaScenario_ModelElement_execTime(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_EXECTIME_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaScenario_ModelElement_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("01cf0976-a8cc-4f1d-a60d-13c072ad3e0d")
    public void setGaScenario_ModelElement_finish(final String value) {
        this.elt.putTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_FINISH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_hostDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("924eaa79-80b7-4331-9ecc-d90e790c4b76")
    public void setGaScenario_ModelElement_hostDemand(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_HOSTDEMAND_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_hostDemandOps'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0f906ac8-cc9e-445c-899a-1186bfe44ea8")
    public void setGaScenario_ModelElement_hostDemandOps(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_HOSTDEMANDOPS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_interOccT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4a7bcd0b-e6f7-4185-b60c-5e88a3f47423")
    public void setGaScenario_ModelElement_interOccT(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_INTEROCCT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bb7815ee-38f7-4bcd-9d80-448514561756")
    public void setGaScenario_ModelElement_msgSize(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_MSGSIZE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("acf3196f-10a2-470b-9a9d-8c3138a82723")
    public void setGaScenario_ModelElement_on(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ON_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaScenario_ModelElement_parentStep'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e9d4df8e-28e6-4a8c-b7a1-a65c49744aab")
    public void setGaScenario_ModelElement_parentStep(final String value) {
        this.elt.putTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_PARENTSTEP_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_powerPeak'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db6618c4-3897-439a-8720-853cc9a13983")
    public void setGaScenario_ModelElement_powerPeak(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_POWERPEAK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_respT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("95ff958c-f461-4115-bc39-f976160fbb30")
    public void setGaScenario_ModelElement_respT(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_RESPT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaScenario_ModelElement_root'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("975d2cbd-72aa-4c53-9e6c-dc479354256a")
    public void setGaScenario_ModelElement_root(final String value) {
        this.elt.putTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ROOT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaScenario_ModelElement_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2adeb97e-8284-42df-af79-253f6c4bf1cb")
    public void setGaScenario_ModelElement_start(final String value) {
        this.elt.putTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_START_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_steps'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e6e7c99b-87d0-46d4-9329-ef125e625f8c")
    public void setGaScenario_ModelElement_steps(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_STEPS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_subUsage'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a535d079-ba30-4ff9-98e1-cccd19efb325")
    public void setGaScenario_ModelElement_subUsage(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_SUBUSAGE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1a07b3e5-8733-471d-8852-376eb144c0ff")
    public void setGaScenario_ModelElement_throughput(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_timing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("192bceab-5325-421e-b3e2-fa2706283571")
    public void setGaScenario_ModelElement_timing(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_TIMING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_usedMemory'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be7c7925-3c7e-409f-a25b-3604f53b59df")
    public void setGaScenario_ModelElement_usedMemory(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_USEDMEMORY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_usedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14b8770d-1b2a-45c1-baa7-e964aa5be2e4")
    public void setGaScenario_ModelElement_usedResources(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_USEDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d77305a-baa4-470c-9c75-32d9058a5bad")
    public void setGaScenario_ModelElement_utilization(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_UTILIZATION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_utilizationOnHost'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8271bccf-8481-4bb3-bb14-653a26b7d9aa")
    public void setGaScenario_ModelElement_utilizationOnHost(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_UTILIZATIONONHOST_TAGTYPE_ELT, values);
    }

    @objid ("15fe18a4-216a-4b7d-96c8-c9996187148e")
    protected GaScenarioModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("ba8cb11c-db8f-4daa-bfc3-1906a90d9522")
    public static final class MdaTypes {
        @objid ("529b58e5-bc4a-4773-8b08-7ec4e759872b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8bd6faaa-fe75-4129-9697-eab46d0bfff4")
        public static TagType GASCENARIO_MODELELEMENT_CAUSE_TAGTYPE_ELT;

        @objid ("3a9bfe3f-6bf5-4ab3-8815-02c4e4429f6d")
        public static TagType GASCENARIO_MODELELEMENT_HOSTDEMAND_TAGTYPE_ELT;

        @objid ("b6a1616c-79cf-4221-8ede-ecad73fea435")
        public static TagType GASCENARIO_MODELELEMENT_HOSTDEMANDOPS_TAGTYPE_ELT;

        @objid ("56e273d7-5d3c-413c-ab0b-99d7b4ade84c")
        public static TagType GASCENARIO_MODELELEMENT_INTEROCCT_TAGTYPE_ELT;

        @objid ("1d2c06a6-1682-4381-ba26-c24369ce3564")
        public static TagType GASCENARIO_MODELELEMENT_THROUGHPUT_TAGTYPE_ELT;

        @objid ("ef159b65-1b40-4c21-b60a-b17127d76765")
        public static TagType GASCENARIO_MODELELEMENT_RESPT_TAGTYPE_ELT;

        @objid ("4db0b25a-f801-463d-ac0e-0701021d667a")
        public static TagType GASCENARIO_MODELELEMENT_UTILIZATION_TAGTYPE_ELT;

        @objid ("b698ba69-d342-44b6-bd29-9be092ede528")
        public static TagType GASCENARIO_MODELELEMENT_UTILIZATIONONHOST_TAGTYPE_ELT;

        @objid ("1de400d9-ec7a-41d7-ba83-50344420639d")
        public static TagType GASCENARIO_MODELELEMENT_ROOT_TAGTYPE_ELT;

        @objid ("6f43b7dc-513d-4204-9332-d87d66e9d807")
        public static TagType GASCENARIO_MODELELEMENT_TIMING_TAGTYPE_ELT;

        @objid ("7cfa69a2-b615-46ec-8a38-529cde70fabf")
        public static TagType GASCENARIO_MODELELEMENT_EXECTIME_TAGTYPE_ELT;

        @objid ("8f2f9e72-f59a-4375-9d36-e8c25e5be1c9")
        public static TagType GASCENARIO_MODELELEMENT_ALLOCATEDMEMORY_TAGTYPE_ELT;

        @objid ("cf99c5b0-176b-487d-bae5-e36dcd934290")
        public static TagType GASCENARIO_MODELELEMENT_USEDMEMORY_TAGTYPE_ELT;

        @objid ("701e6a5c-aa76-48b2-8b3a-15d6adff3808")
        public static TagType GASCENARIO_MODELELEMENT_POWERPEAK_TAGTYPE_ELT;

        @objid ("d024e4c7-5575-49da-ae3e-0a6926040028")
        public static TagType GASCENARIO_MODELELEMENT_ENERGY_TAGTYPE_ELT;

        @objid ("db2e4114-476a-4a14-9109-4308a1f1232c")
        public static TagType GASCENARIO_MODELELEMENT_SUBUSAGE_TAGTYPE_ELT;

        @objid ("4ea76545-dc89-44a9-8f0a-76d82d0943c8")
        public static TagType GASCENARIO_MODELELEMENT_USEDRESOURCES_TAGTYPE_ELT;

        @objid ("dfe511f9-05b4-49dc-93a2-a1d59868b856")
        public static TagType GASCENARIO_MODELELEMENT_MSGSIZE_TAGTYPE_ELT;

        @objid ("cbe5c75b-a108-4009-91ce-c4ceaae95e05")
        public static TagType GASCENARIO_MODELELEMENT_DURATION_TAGTYPE_ELT;

        @objid ("4dec7f72-5e8a-43cb-a4ca-cf739a774746")
        public static TagType GASCENARIO_MODELELEMENT_START_TAGTYPE_ELT;

        @objid ("0ab16a23-c75b-4ea3-b70c-a52c8d20baa9")
        public static TagType GASCENARIO_MODELELEMENT_FINISH_TAGTYPE_ELT;

        @objid ("8c1dfb84-db86-4662-a61a-b8c0a20ca97d")
        public static TagType GASCENARIO_MODELELEMENT_ON_TAGTYPE_ELT;

        @objid ("cdf81be7-a7f7-4162-bdc2-9005df7771b4")
        public static TagType GASCENARIO_MODELELEMENT_PARENTSTEP_TAGTYPE_ELT;

        @objid ("dc57c94e-22bc-45ea-a854-278d3a05f920")
        public static TagType GASCENARIO_MODELELEMENT_STEPS_TAGTYPE_ELT;

        @objid ("2321f1ba-5e77-4a93-958d-35855e0660f6")
        private static Stereotype MDAASSOCDEP;

        @objid ("0b520d7c-1e49-4489-8008-0009e901ca12")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2d926bf7-b13d-4e18-86a2-cdf4dd567ed4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fa3140da-14a7-11df-9d54-0014222a9f79");
            GASCENARIO_MODELELEMENT_CAUSE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fa3140db-14a7-11df-9d54-0014222a9f79");
            GASCENARIO_MODELELEMENT_HOSTDEMAND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fa3140dc-14a7-11df-9d54-0014222a9f79");
            GASCENARIO_MODELELEMENT_HOSTDEMANDOPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fa3140dd-14a7-11df-9d54-0014222a9f79");
            GASCENARIO_MODELELEMENT_INTEROCCT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fa3140de-14a7-11df-9d54-0014222a9f79");
            GASCENARIO_MODELELEMENT_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fa3140df-14a7-11df-9d54-0014222a9f79");
            GASCENARIO_MODELELEMENT_RESPT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fa3140e0-14a7-11df-9d54-0014222a9f79");
            GASCENARIO_MODELELEMENT_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fa3140e1-14a7-11df-9d54-0014222a9f79");
            GASCENARIO_MODELELEMENT_UTILIZATIONONHOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fa3140e2-14a7-11df-9d54-0014222a9f79");
            GASCENARIO_MODELELEMENT_ROOT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fa3140e3-14a7-11df-9d54-0014222a9f79");
            GASCENARIO_MODELELEMENT_TIMING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fa3140e4-14a7-11df-9d54-0014222a9f79");
            GASCENARIO_MODELELEMENT_EXECTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8879a328-16ea-11df-b92a-0014222a9f79");
            GASCENARIO_MODELELEMENT_ALLOCATEDMEMORY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8879a329-16ea-11df-b92a-0014222a9f79");
            GASCENARIO_MODELELEMENT_USEDMEMORY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8879a32a-16ea-11df-b92a-0014222a9f79");
            GASCENARIO_MODELELEMENT_POWERPEAK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8879a32b-16ea-11df-b92a-0014222a9f79");
            GASCENARIO_MODELELEMENT_ENERGY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8879a32c-16ea-11df-b92a-0014222a9f79");
            GASCENARIO_MODELELEMENT_SUBUSAGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8879a32d-16ea-11df-b92a-0014222a9f79");
            GASCENARIO_MODELELEMENT_USEDRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8879a32e-16ea-11df-b92a-0014222a9f79");
            GASCENARIO_MODELELEMENT_MSGSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8879a32f-16ea-11df-b92a-0014222a9f79");
            GASCENARIO_MODELELEMENT_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "40fdea8d-1d79-11df-9f97-001302895b2b");
            GASCENARIO_MODELELEMENT_START_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "40fdea8e-1d79-11df-9f97-001302895b2b");
            GASCENARIO_MODELELEMENT_FINISH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "40fdea8f-1d79-11df-9f97-001302895b2b");
            GASCENARIO_MODELELEMENT_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "40fdea90-1d79-11df-9f97-001302895b2b");
            GASCENARIO_MODELELEMENT_PARENTSTEP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f92b9a3b-9e88-11e1-8c5f-0027103f347d");
            GASCENARIO_MODELELEMENT_STEPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f9c2fc1b-9e88-11e1-8c5f-0027103f347d");
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
