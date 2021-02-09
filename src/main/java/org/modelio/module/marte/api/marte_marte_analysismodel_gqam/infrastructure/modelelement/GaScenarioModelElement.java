/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class GaScenarioModelElement extends ResourceUsageModelElement {
    public static final String STEREOTYPE_NAME = "GaScenario_ModelElement";

    public static final String GASCENARIO_MODELELEMENT_ALLOCATEDMEMORY_TAGTYPE = "GaScenario_ModelElement_allocatedMemory";

    public static final String GASCENARIO_MODELELEMENT_CAUSE_TAGTYPE = "GaScenario_ModelElement_cause";

    public static final String GASCENARIO_MODELELEMENT_DURATION_TAGTYPE = "GaScenario_ModelElement_duration";

    public static final String GASCENARIO_MODELELEMENT_ENERGY_TAGTYPE = "GaScenario_ModelElement_energy";

    public static final String GASCENARIO_MODELELEMENT_EXECTIME_TAGTYPE = "GaScenario_ModelElement_execTime";

    public static final String GASCENARIO_MODELELEMENT_FINISH_TAGTYPE = "GaScenario_ModelElement_finish";

    public static final String GASCENARIO_MODELELEMENT_HOSTDEMAND_TAGTYPE = "GaScenario_ModelElement_hostDemand";

    public static final String GASCENARIO_MODELELEMENT_HOSTDEMANDOPS_TAGTYPE = "GaScenario_ModelElement_hostDemandOps";

    public static final String GASCENARIO_MODELELEMENT_INTEROCCT_TAGTYPE = "GaScenario_ModelElement_interOccT";

    public static final String GASCENARIO_MODELELEMENT_MSGSIZE_TAGTYPE = "GaScenario_ModelElement_msgSize";

    public static final String GASCENARIO_MODELELEMENT_ON_TAGTYPE = "GaScenario_ModelElement_on";

    public static final String GASCENARIO_MODELELEMENT_PARENTSTEP_TAGTYPE = "GaScenario_ModelElement_parentStep";

    public static final String GASCENARIO_MODELELEMENT_POWERPEAK_TAGTYPE = "GaScenario_ModelElement_powerPeak";

    public static final String GASCENARIO_MODELELEMENT_RESPT_TAGTYPE = "GaScenario_ModelElement_respT";

    public static final String GASCENARIO_MODELELEMENT_ROOT_TAGTYPE = "GaScenario_ModelElement_root";

    public static final String GASCENARIO_MODELELEMENT_START_TAGTYPE = "GaScenario_ModelElement_start";

    public static final String GASCENARIO_MODELELEMENT_STEPS_TAGTYPE = "GaScenario_ModelElement_steps";

    public static final String GASCENARIO_MODELELEMENT_SUBUSAGE_TAGTYPE = "GaScenario_ModelElement_subUsage";

    public static final String GASCENARIO_MODELELEMENT_THROUGHPUT_TAGTYPE = "GaScenario_ModelElement_throughput";

    public static final String GASCENARIO_MODELELEMENT_TIMING_TAGTYPE = "GaScenario_ModelElement_timing";

    public static final String GASCENARIO_MODELELEMENT_USEDMEMORY_TAGTYPE = "GaScenario_ModelElement_usedMemory";

    public static final String GASCENARIO_MODELELEMENT_USEDRESOURCES_TAGTYPE = "GaScenario_ModelElement_usedResources";

    public static final String GASCENARIO_MODELELEMENT_UTILIZATION_TAGTYPE = "GaScenario_ModelElement_utilization";

    public static final String GASCENARIO_MODELELEMENT_UTILIZATIONONHOST_TAGTYPE = "GaScenario_ModelElement_utilizationOnHost";

    /**
     * Tells whether a {@link GaScenarioModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaScenario_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaScenarioModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaScenario_ModelElement >> then instantiate a {@link GaScenarioModelElement} proxy.
     * 
     * @return a {@link GaScenarioModelElement} proxy on the created {@link ModelElement}.
     */
    public static GaScenarioModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaScenarioModelElement.STEREOTYPE_NAME);
        return GaScenarioModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaScenarioModelElement} proxy from a {@link ModelElement} stereotyped << GaScenario_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaScenarioModelElement} proxy or <i>null</i>.
     */
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
    public static GaScenarioModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaScenarioModelElement.canInstantiate(obj))
        	return new GaScenarioModelElement(obj);
        else
        	throw new IllegalArgumentException("GaScenarioModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_allocatedMemory'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_allocatedMemory() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ALLOCATEDMEMORY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaScenario_ModelElement_cause'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaScenario_ModelElement_cause() {
        return this.elt.getTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_CAUSE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaScenario_ModelElement_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaScenario_ModelElement_duration() {
        return this.elt.getTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_DURATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_energy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_energy() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ENERGY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_execTime'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_execTime() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_EXECTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaScenario_ModelElement_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaScenario_ModelElement_finish() {
        return this.elt.getTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_FINISH_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_hostDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_hostDemand() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_HOSTDEMAND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_hostDemandOps'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_hostDemandOps() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_HOSTDEMANDOPS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_interOccT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_interOccT() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_INTEROCCT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_msgSize'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_msgSize() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_MSGSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_on() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ON_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaScenario_ModelElement_parentStep'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaScenario_ModelElement_parentStep() {
        return this.elt.getTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_PARENTSTEP_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_powerPeak'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_powerPeak() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_POWERPEAK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_respT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_respT() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_RESPT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaScenario_ModelElement_root'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaScenario_ModelElement_root() {
        return this.elt.getTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ROOT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaScenario_ModelElement_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaScenario_ModelElement_start() {
        return this.elt.getTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_START_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_steps'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_steps() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_STEPS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_subUsage'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_subUsage() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_SUBUSAGE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_throughput'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_throughput() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_timing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_timing() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_TIMING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_usedMemory'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_usedMemory() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_USEDMEMORY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_usedResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_usedResources() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_USEDRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_utilization() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_UTILIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaScenario_ModelElement_utilizationOnHost'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaScenario_ModelElement_utilizationOnHost() {
        return this.elt.getTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_UTILIZATIONONHOST_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_allocatedMemory'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_allocatedMemory(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ALLOCATEDMEMORY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaScenario_ModelElement_cause'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_cause(final String value) {
        this.elt.putTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_CAUSE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaScenario_ModelElement_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_duration(final String value) {
        this.elt.putTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_energy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_energy(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ENERGY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_execTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_execTime(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_EXECTIME_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaScenario_ModelElement_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_finish(final String value) {
        this.elt.putTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_FINISH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_hostDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_hostDemand(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_HOSTDEMAND_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_hostDemandOps'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_hostDemandOps(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_HOSTDEMANDOPS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_interOccT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_interOccT(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_INTEROCCT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_msgSize(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_MSGSIZE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_on(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ON_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaScenario_ModelElement_parentStep'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_parentStep(final String value) {
        this.elt.putTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_PARENTSTEP_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_powerPeak'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_powerPeak(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_POWERPEAK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_respT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_respT(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_RESPT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaScenario_ModelElement_root'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_root(final String value) {
        this.elt.putTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_ROOT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaScenario_ModelElement_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_start(final String value) {
        this.elt.putTagValue(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_START_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_steps'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_steps(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_STEPS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_subUsage'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_subUsage(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_SUBUSAGE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_throughput(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_THROUGHPUT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_timing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_timing(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_TIMING_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_usedMemory'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_usedMemory(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_USEDMEMORY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_usedResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_usedResources(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_USEDRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_utilization(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_UTILIZATION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaScenario_ModelElement_utilizationOnHost'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaScenario_ModelElement_utilizationOnHost(final List<String> values) {
        this.elt.putTagValues(GaScenarioModelElement.MdaTypes.GASCENARIO_MODELELEMENT_UTILIZATIONONHOST_TAGTYPE_ELT, values);
    }

    protected GaScenarioModelElement(final ModelElement elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_CAUSE_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_HOSTDEMAND_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_HOSTDEMANDOPS_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_INTEROCCT_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_THROUGHPUT_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_RESPT_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_UTILIZATION_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_UTILIZATIONONHOST_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_ROOT_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_TIMING_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_EXECTIME_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_ALLOCATEDMEMORY_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_USEDMEMORY_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_POWERPEAK_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_ENERGY_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_SUBUSAGE_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_USEDRESOURCES_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_MSGSIZE_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_DURATION_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_START_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_FINISH_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_ON_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_PARENTSTEP_TAGTYPE_ELT;

        public static TagType GASCENARIO_MODELELEMENT_STEPS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
