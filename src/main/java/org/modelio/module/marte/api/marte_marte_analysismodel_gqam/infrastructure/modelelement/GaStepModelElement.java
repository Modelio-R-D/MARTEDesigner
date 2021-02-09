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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << GaStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaStepModelElement extends GaScenarioModelElement {
    public static final String STEREOTYPE_NAME = "GaStep_ModelElement";

    public static final String GASTEP_MODELELEMENT_BLOCKT_TAGTYPE = "GaStep_ModelElement_blockT";

    public static final String GASTEP_MODELELEMENT_CHILDSCENARIO_TAGTYPE = "GaStep_ModelElement_childScenario";

    public static final String GASTEP_MODELELEMENT_CONCURRES_TAGTYPE = "GaStep_ModelElement_concurRes";

    public static final String GASTEP_MODELELEMENT_HOST_TAGTYPE = "GaStep_ModelElement_host";

    public static final String GASTEP_MODELELEMENT_ISATOMIC_TAGTYPE = "GaStep_ModelElement_isAtomic";

    public static final String GASTEP_MODELELEMENT_PRIORITY_TAGTYPE = "GaStep_ModelElement_priority";

    public static final String GASTEP_MODELELEMENT_PROB_TAGTYPE = "GaStep_ModelElement_prob";

    public static final String GASTEP_MODELELEMENT_REP_TAGTYPE = "GaStep_ModelElement_rep";

    public static final String GASTEP_MODELELEMENT_SCENARIO_TAGTYPE = "GaStep_ModelElement_scenario";

    public static final String GASTEP_MODELELEMENT_SERVCOUNT_TAGTYPE = "GaStep_ModelElement_servCount";

    public static final String GASTEP_MODELELEMENT_SERVDEMAND_TAGTYPE = "GaStep_ModelElement_servDemand";

    /**
     * Tells whether a {@link GaStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaStep_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaStep_ModelElement >> then instantiate a {@link GaStepModelElement} proxy.
     * 
     * @return a {@link GaStepModelElement} proxy on the created {@link ModelElement}.
     */
    public static GaStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaStepModelElement.STEREOTYPE_NAME);
        return GaStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaStepModelElement} proxy from a {@link ModelElement} stereotyped << GaStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaStepModelElement} proxy or <i>null</i>.
     */
    public static GaStepModelElement instantiate(final ModelElement obj) {
        return GaStepModelElement.canInstantiate(obj) ? new GaStepModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaStepModelElement} proxy from a {@link ModelElement} stereotyped << GaStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link GaStepModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaStepModelElement.canInstantiate(obj))
        	return new GaStepModelElement(obj);
        else
        	throw new IllegalArgumentException("GaStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaStepModelElement other = (GaStepModelElement) obj;
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
     * Getter for string property 'GaStep_ModelElement_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaStep_ModelElement_blockT() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_childScenario'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaStep_ModelElement_childScenario() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_CHILDSCENARIO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_concurRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaStep_ModelElement_concurRes() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_CONCURRES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaStep_ModelElement_host() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_priority'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaStep_ModelElement_priority() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_PRIORITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_prob'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaStep_ModelElement_prob() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_PROB_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_rep'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaStep_ModelElement_rep() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_REP_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_scenario'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaStep_ModelElement_scenario() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SCENARIO_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaStep_ModelElement_servCount'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaStep_ModelElement_servCount() {
        return this.elt.getTagValues(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SERVCOUNT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaStep_ModelElement_servDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaStep_ModelElement_servDemand() {
        return this.elt.getTagValues(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SERVDEMAND_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaStep_ModelElement_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isGaStep_ModelElement_isAtomic() {
        return this.elt.isTagged(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaStep_ModelElement_blockT(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_BLOCKT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_childScenario'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaStep_ModelElement_childScenario(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_CHILDSCENARIO_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_concurRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaStep_ModelElement_concurRes(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_CONCURRES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaStep_ModelElement_host(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaStep_ModelElement_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaStep_ModelElement_isAtomic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_ISATOMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_priority'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaStep_ModelElement_priority(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_PRIORITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_prob'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaStep_ModelElement_prob(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_PROB_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_rep'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaStep_ModelElement_rep(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_REP_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_scenario'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaStep_ModelElement_scenario(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SCENARIO_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaStep_ModelElement_servCount'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaStep_ModelElement_servCount(final List<String> values) {
        this.elt.putTagValues(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SERVCOUNT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaStep_ModelElement_servDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaStep_ModelElement_servDemand(final List<String> values) {
        this.elt.putTagValues(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SERVDEMAND_TAGTYPE_ELT, values);
    }

    protected GaStepModelElement(final ModelElement elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GASTEP_MODELELEMENT_ISATOMIC_TAGTYPE_ELT;

        public static TagType GASTEP_MODELELEMENT_BLOCKT_TAGTYPE_ELT;

        public static TagType GASTEP_MODELELEMENT_REP_TAGTYPE_ELT;

        public static TagType GASTEP_MODELELEMENT_PROB_TAGTYPE_ELT;

        public static TagType GASTEP_MODELELEMENT_PRIORITY_TAGTYPE_ELT;

        public static TagType GASTEP_MODELELEMENT_CONCURRES_TAGTYPE_ELT;

        public static TagType GASTEP_MODELELEMENT_HOST_TAGTYPE_ELT;

        public static TagType GASTEP_MODELELEMENT_SERVDEMAND_TAGTYPE_ELT;

        public static TagType GASTEP_MODELELEMENT_SERVCOUNT_TAGTYPE_ELT;

        public static TagType GASTEP_MODELELEMENT_CHILDSCENARIO_TAGTYPE_ELT;

        public static TagType GASTEP_MODELELEMENT_SCENARIO_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "33653420-14a8-11df-9d54-0014222a9f79");
            GASTEP_MODELELEMENT_ISATOMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "33653421-14a8-11df-9d54-0014222a9f79");
            GASTEP_MODELELEMENT_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "33653422-14a8-11df-9d54-0014222a9f79");
            GASTEP_MODELELEMENT_REP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "33653423-14a8-11df-9d54-0014222a9f79");
            GASTEP_MODELELEMENT_PROB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "33653424-14a8-11df-9d54-0014222a9f79");
            GASTEP_MODELELEMENT_PRIORITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "33653425-14a8-11df-9d54-0014222a9f79");
            GASTEP_MODELELEMENT_CONCURRES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "33653426-14a8-11df-9d54-0014222a9f79");
            GASTEP_MODELELEMENT_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "33653427-14a8-11df-9d54-0014222a9f79");
            GASTEP_MODELELEMENT_SERVDEMAND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "33653428-14a8-11df-9d54-0014222a9f79");
            GASTEP_MODELELEMENT_SERVCOUNT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "33653429-14a8-11df-9d54-0014222a9f79");
            GASTEP_MODELELEMENT_CHILDSCENARIO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "74c7efa4-9e87-11e1-8c5f-0027103f347d");
            GASTEP_MODELELEMENT_SCENARIO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "88eeaf80-9e87-11e1-8c5f-0027103f347d");
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
