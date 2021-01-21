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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << GaStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c5c91900-8b82-4cc3-8cf0-25f4510ed5d1")
public class GaStepModelElement extends GaScenarioModelElement {
    @objid ("3ea8803f-f276-434f-91a7-abbc9cf897ea")
    public static final String STEREOTYPE_NAME = "GaStep_ModelElement";

    @objid ("efb17262-c0ce-4819-9ad2-60664f256f69")
    public static final String GASTEP_MODELELEMENT_BLOCKT_TAGTYPE = "GaStep_ModelElement_blockT";

    @objid ("58da7fb8-ef2d-4e2e-badf-911bc4de6be3")
    public static final String GASTEP_MODELELEMENT_CHILDSCENARIO_TAGTYPE = "GaStep_ModelElement_childScenario";

    @objid ("86140b61-511a-4509-830c-c38491150a8e")
    public static final String GASTEP_MODELELEMENT_CONCURRES_TAGTYPE = "GaStep_ModelElement_concurRes";

    @objid ("3914b643-8aa4-48cb-9325-fbef6fb71a99")
    public static final String GASTEP_MODELELEMENT_HOST_TAGTYPE = "GaStep_ModelElement_host";

    @objid ("16dcf3ec-4fb5-4efa-9624-efea5f17f66c")
    public static final String GASTEP_MODELELEMENT_ISATOMIC_TAGTYPE = "GaStep_ModelElement_isAtomic";

    @objid ("554e4b40-999f-43e0-b7bf-5512b2e71358")
    public static final String GASTEP_MODELELEMENT_PRIORITY_TAGTYPE = "GaStep_ModelElement_priority";

    @objid ("1f1263bd-78c0-4973-89c7-6bc2525e547d")
    public static final String GASTEP_MODELELEMENT_PROB_TAGTYPE = "GaStep_ModelElement_prob";

    @objid ("8d989bca-ce2f-4885-bafa-9832bdf09243")
    public static final String GASTEP_MODELELEMENT_REP_TAGTYPE = "GaStep_ModelElement_rep";

    @objid ("7151ee20-7db1-4969-a7fa-8497cb77ea7c")
    public static final String GASTEP_MODELELEMENT_SCENARIO_TAGTYPE = "GaStep_ModelElement_scenario";

    @objid ("710639e6-7f56-4435-8d59-7cdc1f026db5")
    public static final String GASTEP_MODELELEMENT_SERVCOUNT_TAGTYPE = "GaStep_ModelElement_servCount";

    @objid ("412864de-0158-468c-b2d9-dbb55869240d")
    public static final String GASTEP_MODELELEMENT_SERVDEMAND_TAGTYPE = "GaStep_ModelElement_servDemand";

    /**
     * Tells whether a {@link GaStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaStep_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("16db91f2-ec3f-4efe-89ad-9eaa0b4030c0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaStep_ModelElement >> then instantiate a {@link GaStepModelElement} proxy.
     * 
     * @return a {@link GaStepModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("3677baeb-f6f0-4d8b-b5e1-07af0b847473")
    public static GaStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaStepModelElement.STEREOTYPE_NAME);
        return GaStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaStepModelElement} proxy from a {@link ModelElement} stereotyped << GaStep_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaStepModelElement} proxy or <i>null</i>.
     */
    @objid ("091d66ca-09d3-42bb-a6db-3f45ff078bfb")
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
    @objid ("473f5ad8-bab3-40d0-b519-026500072501")
    public static GaStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaStepModelElement.canInstantiate(obj))
        	return new GaStepModelElement(obj);
        else
        	throw new IllegalArgumentException("GaStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("37d52189-aa98-4dd3-ade3-131766a14d77")
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
    @objid ("552eb544-f5de-4455-8797-671b43c8d6ed")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'GaStep_ModelElement_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("190e3d1d-c5ec-480b-8502-657274e70aca")
    public String getGaStep_ModelElement_blockT() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_childScenario'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a1fe28b6-4bc4-42ab-ae58-fca81fc43ae3")
    public String getGaStep_ModelElement_childScenario() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_CHILDSCENARIO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_concurRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c9f2a9a-ffcf-46bf-b857-05dc8853ce91")
    public String getGaStep_ModelElement_concurRes() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_CONCURRES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b4c87a64-39c7-4beb-bfcf-89ca6e3bad7f")
    public String getGaStep_ModelElement_host() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_priority'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("634bd44c-04e4-4960-9f37-965ca2cc5150")
    public String getGaStep_ModelElement_priority() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_PRIORITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_prob'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dd72e89b-7f57-4e3d-9aba-ab3c8aad1c51")
    public String getGaStep_ModelElement_prob() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_PROB_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_rep'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("57e5327c-2d05-460f-90a6-c6d59dcf52bf")
    public String getGaStep_ModelElement_rep() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_REP_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_scenario'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d72c9093-cca0-4eec-a50c-ad57208fa194")
    public String getGaStep_ModelElement_scenario() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SCENARIO_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaStep_ModelElement_servCount'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c60eddc0-7d4e-444b-a994-098e464234ee")
    public List<String> getGaStep_ModelElement_servCount() {
        return this.elt.getTagValues(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SERVCOUNT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaStep_ModelElement_servDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a8d3c978-a3b0-405b-b04b-d08c46033b48")
    public List<String> getGaStep_ModelElement_servDemand() {
        return this.elt.getTagValues(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SERVDEMAND_TAGTYPE_ELT);
    }

    @objid ("d6d9fef7-9f6f-4adc-ad90-1e0628a585eb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaStep_ModelElement_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("30de2353-cc7d-4d60-897e-fe182f09db43")
    public boolean isGaStep_ModelElement_isAtomic() {
        return this.elt.isTagged(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("75e85946-adf3-4214-9e26-7693ac15e27a")
    public void setGaStep_ModelElement_blockT(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_BLOCKT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_childScenario'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ec4f954f-b63c-4b08-9634-cc5f767c8921")
    public void setGaStep_ModelElement_childScenario(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_CHILDSCENARIO_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_concurRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be3479c3-5c3b-4fd9-8617-704e8ccf35e2")
    public void setGaStep_ModelElement_concurRes(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_CONCURRES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4f7d7ffa-1aeb-421b-9806-d376a83273e2")
    public void setGaStep_ModelElement_host(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaStep_ModelElement_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a961269a-7ed1-4de2-a7ce-ee59ca3d3e2e")
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
    @objid ("ba7a6ab8-5673-4de4-914c-a58e9d99b63c")
    public void setGaStep_ModelElement_priority(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_PRIORITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_prob'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2291f243-d49b-402b-a313-e2a432688940")
    public void setGaStep_ModelElement_prob(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_PROB_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_rep'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ecb117c1-b683-4a11-be81-5f4be9210e5d")
    public void setGaStep_ModelElement_rep(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_REP_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_scenario'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("418bc0eb-fee5-4c44-8202-d9a235493213")
    public void setGaStep_ModelElement_scenario(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SCENARIO_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaStep_ModelElement_servCount'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("63cbd6d1-34d6-48cc-ad34-44555b0c999b")
    public void setGaStep_ModelElement_servCount(final List<String> values) {
        this.elt.putTagValues(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SERVCOUNT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaStep_ModelElement_servDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("719efb2f-6407-4f9b-8c71-313754e03134")
    public void setGaStep_ModelElement_servDemand(final List<String> values) {
        this.elt.putTagValues(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SERVDEMAND_TAGTYPE_ELT, values);
    }

    @objid ("472154b3-a9a8-414a-8203-b3eeaf27523d")
    protected GaStepModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("0a8808a5-7014-4618-8888-d81436ebbd5a")
    public static final class MdaTypes {
        @objid ("f8674a24-5afc-4b44-bc2f-4549a700b277")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3fd9e90a-2642-4dd4-9f86-f37a7cb27b78")
        public static TagType GASTEP_MODELELEMENT_ISATOMIC_TAGTYPE_ELT;

        @objid ("e8055d0a-b077-4d9b-90ab-6885d8e1fbe2")
        public static TagType GASTEP_MODELELEMENT_BLOCKT_TAGTYPE_ELT;

        @objid ("75cf99b1-ce48-499c-9e1a-6c23fec86e0a")
        public static TagType GASTEP_MODELELEMENT_REP_TAGTYPE_ELT;

        @objid ("94c79d5c-7dbd-4f1d-8322-20e1be1efb43")
        public static TagType GASTEP_MODELELEMENT_PROB_TAGTYPE_ELT;

        @objid ("ac0faf61-c684-4ad9-b779-36410e76d8db")
        public static TagType GASTEP_MODELELEMENT_PRIORITY_TAGTYPE_ELT;

        @objid ("388bf612-25d0-4d84-8410-53ca5c41a798")
        public static TagType GASTEP_MODELELEMENT_CONCURRES_TAGTYPE_ELT;

        @objid ("c1e61078-3970-4228-9b2d-aa03d20d399b")
        public static TagType GASTEP_MODELELEMENT_HOST_TAGTYPE_ELT;

        @objid ("90d667ca-dd48-49cd-a55e-c7ac179aca95")
        public static TagType GASTEP_MODELELEMENT_SERVDEMAND_TAGTYPE_ELT;

        @objid ("016a208c-eaa3-4b41-a33b-2a719ce67076")
        public static TagType GASTEP_MODELELEMENT_SERVCOUNT_TAGTYPE_ELT;

        @objid ("3c7dcc3b-0dd1-4475-accb-a5bb901bb649")
        public static TagType GASTEP_MODELELEMENT_CHILDSCENARIO_TAGTYPE_ELT;

        @objid ("f63319a8-80b2-4dee-934a-b80604428828")
        public static TagType GASTEP_MODELELEMENT_SCENARIO_TAGTYPE_ELT;

        @objid ("fc03cdaf-9dc7-4f85-9a2b-f49c2f7ee235")
        private static Stereotype MDAASSOCDEP;

        @objid ("f3177adf-bf25-4d61-a9e5-c9ff1a43fa16")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e01230a0-700b-4119-853c-0e54ea61044f")
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
