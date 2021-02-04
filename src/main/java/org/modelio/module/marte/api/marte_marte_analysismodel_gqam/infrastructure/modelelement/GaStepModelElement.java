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
    @objid ("de0dcd15-4c01-4f6c-b475-b49d8c3e19a1")
    public static final String STEREOTYPE_NAME = "GaStep_ModelElement";

    @objid ("5e5468b1-579d-48ba-b8f6-907e0d4e52e8")
    public static final String GASTEP_MODELELEMENT_BLOCKT_TAGTYPE = "GaStep_ModelElement_blockT";

    @objid ("7a1b03af-729a-40f6-a67d-46ef05ff0a7a")
    public static final String GASTEP_MODELELEMENT_CHILDSCENARIO_TAGTYPE = "GaStep_ModelElement_childScenario";

    @objid ("ce152147-03e8-4845-9220-99365e15d487")
    public static final String GASTEP_MODELELEMENT_CONCURRES_TAGTYPE = "GaStep_ModelElement_concurRes";

    @objid ("2a945889-7386-4996-8411-23fbbf4d26a8")
    public static final String GASTEP_MODELELEMENT_HOST_TAGTYPE = "GaStep_ModelElement_host";

    @objid ("f1ef003a-1926-4f56-95ab-fecff8119927")
    public static final String GASTEP_MODELELEMENT_ISATOMIC_TAGTYPE = "GaStep_ModelElement_isAtomic";

    @objid ("7a087a0b-7b89-4c62-9254-b8dd877f2357")
    public static final String GASTEP_MODELELEMENT_PRIORITY_TAGTYPE = "GaStep_ModelElement_priority";

    @objid ("dbdd5464-3545-4b80-aeca-3f588f06d31b")
    public static final String GASTEP_MODELELEMENT_PROB_TAGTYPE = "GaStep_ModelElement_prob";

    @objid ("7f752656-1e8d-4831-85c9-74f92167dbbc")
    public static final String GASTEP_MODELELEMENT_REP_TAGTYPE = "GaStep_ModelElement_rep";

    @objid ("482dd273-81a7-4824-a754-5f1087ea946f")
    public static final String GASTEP_MODELELEMENT_SCENARIO_TAGTYPE = "GaStep_ModelElement_scenario";

    @objid ("641bce17-163e-44c6-9bfa-d9cea0bd48f4")
    public static final String GASTEP_MODELELEMENT_SERVCOUNT_TAGTYPE = "GaStep_ModelElement_servCount";

    @objid ("9701016b-7fb9-4254-ac35-21ae5e932f30")
    public static final String GASTEP_MODELELEMENT_SERVDEMAND_TAGTYPE = "GaStep_ModelElement_servDemand";

    /**
     * Tells whether a {@link GaStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaStep_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8193d5d2-bf1d-4baf-a769-a943dfb1a352")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaStep_ModelElement >> then instantiate a {@link GaStepModelElement} proxy.
     * 
     * @return a {@link GaStepModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("2310473a-c8ed-4a8a-b3ef-24975e2fc914")
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
    @objid ("94366bd6-4ea5-4fde-84a8-54d4e3f06eb0")
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
    @objid ("74976baf-5247-40e9-93b7-6b88342ac6db")
    public static GaStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaStepModelElement.canInstantiate(obj))
        	return new GaStepModelElement(obj);
        else
        	throw new IllegalArgumentException("GaStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5b91d95f-702d-4a14-b22d-6d94bee1dc47")
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
    @objid ("5bc35518-f8de-43f4-b1c3-fd4840173392")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'GaStep_ModelElement_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a042c6aa-f643-43e1-9699-dd2e8d7c4d58")
    public String getGaStep_ModelElement_blockT() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_childScenario'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bf578a60-a9c2-4c9b-bd50-ebb5e48a2970")
    public String getGaStep_ModelElement_childScenario() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_CHILDSCENARIO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_concurRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0f59fb95-ba47-44e4-bce0-957d0fc27ef8")
    public String getGaStep_ModelElement_concurRes() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_CONCURRES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2075bcb1-99ad-45b5-b149-1f1aa3245786")
    public String getGaStep_ModelElement_host() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_priority'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7d65ffa3-82f2-4b7b-98b6-27b2b632f8bd")
    public String getGaStep_ModelElement_priority() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_PRIORITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_prob'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8810f043-f043-4798-b4f0-db78ebbb7af1")
    public String getGaStep_ModelElement_prob() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_PROB_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_rep'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("83b6cb73-2548-4d54-93db-a028a70a9cf9")
    public String getGaStep_ModelElement_rep() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_REP_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaStep_ModelElement_scenario'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("62193ba0-7a83-4d33-8bfb-f1e283f754a0")
    public String getGaStep_ModelElement_scenario() {
        return this.elt.getTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SCENARIO_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaStep_ModelElement_servCount'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e8119c9b-2778-457d-a6c2-0d47e11897c2")
    public List<String> getGaStep_ModelElement_servCount() {
        return this.elt.getTagValues(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SERVCOUNT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaStep_ModelElement_servDemand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4546d5cc-b451-44a8-85cd-e592e9bafe96")
    public List<String> getGaStep_ModelElement_servDemand() {
        return this.elt.getTagValues(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SERVDEMAND_TAGTYPE_ELT);
    }

    @objid ("99b534a7-8e61-4e9b-8be9-75644aec7f8b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'GaStep_ModelElement_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6eaf8095-f091-4dfe-a4b4-6e21facc8519")
    public boolean isGaStep_ModelElement_isAtomic() {
        return this.elt.isTagged(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c22543c4-61ae-441f-9444-82fb33b71f66")
    public void setGaStep_ModelElement_blockT(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_BLOCKT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_childScenario'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aae82f1a-e442-4053-93a7-0d27558c12fe")
    public void setGaStep_ModelElement_childScenario(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_CHILDSCENARIO_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_concurRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("46fb6e85-bad0-42b0-a7cf-6f7051e7d179")
    public void setGaStep_ModelElement_concurRes(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_CONCURRES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0298b6bf-6758-48d3-a337-e10c51fc55a0")
    public void setGaStep_ModelElement_host(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'GaStep_ModelElement_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("343954d6-d5b7-4702-8835-c39e4a4e6b5e")
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
    @objid ("4ddb5f98-b2ec-4a5a-b2c2-3801129262b3")
    public void setGaStep_ModelElement_priority(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_PRIORITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_prob'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bfd92519-87f5-426a-a521-d8e8b0b23917")
    public void setGaStep_ModelElement_prob(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_PROB_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_rep'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6ffffe5d-49d6-49f5-ac73-2f74a755c270")
    public void setGaStep_ModelElement_rep(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_REP_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaStep_ModelElement_scenario'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("99e6d3c4-a907-45f1-802b-04b39bd06835")
    public void setGaStep_ModelElement_scenario(final String value) {
        this.elt.putTagValue(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SCENARIO_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaStep_ModelElement_servCount'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c4483f30-3dae-49ee-a173-d4b7442379d6")
    public void setGaStep_ModelElement_servCount(final List<String> values) {
        this.elt.putTagValues(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SERVCOUNT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaStep_ModelElement_servDemand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("64274d12-46db-4218-a4a4-36d8f83279cf")
    public void setGaStep_ModelElement_servDemand(final List<String> values) {
        this.elt.putTagValues(GaStepModelElement.MdaTypes.GASTEP_MODELELEMENT_SERVDEMAND_TAGTYPE_ELT, values);
    }

    @objid ("f3ac5131-ad13-4b94-b03b-6e599f5d8a84")
    protected GaStepModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("0a8808a5-7014-4618-8888-d81436ebbd5a")
    public static final class MdaTypes {
        @objid ("aeb94cda-ff10-4ad1-9bef-799f7d407eca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a93c50bb-b4a0-4ae4-a2bf-187b3f8cd743")
        public static TagType GASTEP_MODELELEMENT_ISATOMIC_TAGTYPE_ELT;

        @objid ("5fe9ee3b-c7bf-4df0-abb6-02305bf48123")
        public static TagType GASTEP_MODELELEMENT_BLOCKT_TAGTYPE_ELT;

        @objid ("63050f50-477d-4e81-9298-778bce42a16f")
        public static TagType GASTEP_MODELELEMENT_REP_TAGTYPE_ELT;

        @objid ("6bc786b0-df31-431e-affd-8689d937f8fa")
        public static TagType GASTEP_MODELELEMENT_PROB_TAGTYPE_ELT;

        @objid ("6814cb5f-e582-49c4-9bef-ae224362a951")
        public static TagType GASTEP_MODELELEMENT_PRIORITY_TAGTYPE_ELT;

        @objid ("21291544-2a45-444c-ade8-ee4125dc9d89")
        public static TagType GASTEP_MODELELEMENT_CONCURRES_TAGTYPE_ELT;

        @objid ("e0bc5e16-8568-43aa-a5f4-d4fe76d2d161")
        public static TagType GASTEP_MODELELEMENT_HOST_TAGTYPE_ELT;

        @objid ("8087ace8-0a4e-4ad0-ae3d-27f701e08616")
        public static TagType GASTEP_MODELELEMENT_SERVDEMAND_TAGTYPE_ELT;

        @objid ("cdfcb8d0-cbc1-48cd-9287-9bb7443516a9")
        public static TagType GASTEP_MODELELEMENT_SERVCOUNT_TAGTYPE_ELT;

        @objid ("3ad0d650-d540-4693-b55c-8c19dcfe339a")
        public static TagType GASTEP_MODELELEMENT_CHILDSCENARIO_TAGTYPE_ELT;

        @objid ("e15e783e-f2e7-42e7-b4ac-4d242ad6b432")
        public static TagType GASTEP_MODELELEMENT_SCENARIO_TAGTYPE_ELT;

        @objid ("121c85b4-2f70-42a6-8154-49ce75f9b418")
        private static Stereotype MDAASSOCDEP;

        @objid ("64051a52-8cc4-483b-baec-18703fb311f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("16b17f3d-abac-4a2f-879b-cabf7762dfa1")
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
