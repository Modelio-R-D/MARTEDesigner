/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.infrastructure.modelelement;

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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaStepModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << SaStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("bedb0591-f660-43af-b988-0db723c5cf40")
public class SaStepModelElement extends GaStepModelElement {
    @objid ("1f375360-96d2-4caa-b136-11e7ae06fa6e")
    public static final String STEREOTYPE_NAME = "SaStep_ModelElement";

    @objid ("369892b2-4359-4098-99f9-539b29254df3")
    public static final String SASTEP_MODELELEMENT_DEADLINE_TAGTYPE = "SaStep_ModelElement_deadline";

    @objid ("4ecdb046-22de-4ea3-81a0-fd245bd00b61")
    public static final String SASTEP_MODELELEMENT_NONPREEMPTIONBLOCKING_TAGTYPE = "SaStep_ModelElement_nonpreemptionBlocking";

    @objid ("e4cac44c-1128-42cf-855c-93f7ee5ff90f")
    public static final String SASTEP_MODELELEMENT_NUMBERSELFSUSPENSIONS_TAGTYPE = "SaStep_ModelElement_numberSelfSuspensions";

    @objid ("e62a144c-39fe-48ee-8efa-80fd87795e3a")
    public static final String SASTEP_MODELELEMENT_PREEMPTT_TAGTYPE = "SaStep_ModelElement_preemptT";

    @objid ("f3379b5e-e2d5-4b16-ad88-3f8ebd9142a4")
    public static final String SASTEP_MODELELEMENT_READYT_TAGTYPE = "SaStep_ModelElement_readyT";

    @objid ("0ed3ac40-41cf-49ef-861a-c119a4289301")
    public static final String SASTEP_MODELELEMENT_SCHSLACK_TAGTYPE = "SaStep_ModelElement_schSlack";

    @objid ("1bebd8f4-9cfd-47a3-bdbd-fb3be4178635")
    public static final String SASTEP_MODELELEMENT_SELFSUSPENSIONBLOCKING_TAGTYPE = "SaStep_ModelElement_selfSuspensionBlocking";

    @objid ("bb2c0d2c-9d50-4294-a1dd-bc1bef9851f7")
    public static final String SASTEP_MODELELEMENT_SHAREDRES_TAGTYPE = "SaStep_ModelElement_sharedRes";

    @objid ("6819189b-861b-4359-84ac-ae2b25f712d5")
    public static final String SASTEP_MODELELEMENT_SPARECAP_TAGTYPE = "SaStep_ModelElement_spareCap";

    /**
     * Tells whether a {@link SaStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << SaStep_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("75ed7802-0b2c-49e1-ad7c-a8fedcd5d21a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << SaStep_ModelElement >> then instantiate a {@link SaStepModelElement} proxy.
     * 
     * @return a {@link SaStepModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("98a827fa-69df-4f12-8330-59bc833ce890")
    public static SaStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaStepModelElement.STEREOTYPE_NAME);
        return SaStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link SaStepModelElement} proxy from a {@link ModelElement} stereotyped << SaStep_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link SaStepModelElement} proxy or <i>null</i>.
     */
    @objid ("8104c7bd-b43c-4c15-9295-ac4351b7a4e0")
    public static SaStepModelElement instantiate(final ModelElement obj) {
        return SaStepModelElement.canInstantiate(obj) ? new SaStepModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaStepModelElement} proxy from a {@link ModelElement} stereotyped << SaStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link SaStepModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("eb8c9a03-349d-4c12-9bd5-ed3cdf1e96b5")
    public static SaStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (SaStepModelElement.canInstantiate(obj))
        	return new SaStepModelElement(obj);
        else
        	throw new IllegalArgumentException("SaStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("61331fe7-f985-4f33-91a4-2098c287979b")
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
        SaStepModelElement other = (SaStepModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("43375665-a0a3-4925-86e1-aae8667dffa3")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'SaStep_ModelElement_deadline'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8fe1a1f-0dd8-456b-907e-29469157ad27")
    public String getSaStep_ModelElement_deadline() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_DEADLINE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaStep_ModelElement_nonpreemptionBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dcbe5f27-9760-4808-b053-1d6a460c043a")
    public String getSaStep_ModelElement_nonpreemptionBlocking() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_NONPREEMPTIONBLOCKING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaStep_ModelElement_numberSelfSuspensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4c9c79e5-8a8f-4d5f-a0aa-8e4e287290d9")
    public String getSaStep_ModelElement_numberSelfSuspensions() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_NUMBERSELFSUSPENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaStep_ModelElement_preemptT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a14b4027-2ade-4053-9c36-122992e7c797")
    public String getSaStep_ModelElement_preemptT() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_PREEMPTT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaStep_ModelElement_readyT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("78125e17-812a-41c0-b4c8-4c8087717843")
    public String getSaStep_ModelElement_readyT() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_READYT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaStep_ModelElement_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d2e941dc-5a55-44ba-9e47-e536965c95a5")
    public String getSaStep_ModelElement_schSlack() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaStep_ModelElement_selfSuspensionBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6a84d5e2-19ee-4fef-acfc-16d565fae063")
    public String getSaStep_ModelElement_selfSuspensionBlocking() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SELFSUSPENSIONBLOCKING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaStep_ModelElement_sharedRes'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1eb28b85-e91e-4547-b832-03b99aca5c66")
    public List<String> getSaStep_ModelElement_sharedRes() {
        return this.elt.getTagValues(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SHAREDRES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaStep_ModelElement_spareCap'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b7db789-46a5-42d6-8cc8-35f19ced0138")
    public String getSaStep_ModelElement_spareCap() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SPARECAP_TAGTYPE_ELT);
    }

    @objid ("e22d557c-55c5-4fc1-953a-66f8a5a54841")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SaStep_ModelElement_deadline'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4a2f3bea-cd2b-4cb5-97ab-d27f62085fe0")
    public void setSaStep_ModelElement_deadline(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_DEADLINE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaStep_ModelElement_nonpreemptionBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ad43de2-a1f4-4c42-bc68-14bc6d1acbe9")
    public void setSaStep_ModelElement_nonpreemptionBlocking(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_NONPREEMPTIONBLOCKING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaStep_ModelElement_numberSelfSuspensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2fb362e3-bbb7-4dc9-8284-ceade5f970d7")
    public void setSaStep_ModelElement_numberSelfSuspensions(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_NUMBERSELFSUSPENSIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaStep_ModelElement_preemptT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9de46900-f812-4b39-8468-59bd31faa140")
    public void setSaStep_ModelElement_preemptT(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_PREEMPTT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaStep_ModelElement_readyT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dbe4e15a-96a4-4451-b846-8e361215c09f")
    public void setSaStep_ModelElement_readyT(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_READYT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaStep_ModelElement_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("767e21a0-bda1-4dfb-87a2-179851d8ab01")
    public void setSaStep_ModelElement_schSlack(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaStep_ModelElement_selfSuspensionBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("75e782d7-dd36-46c4-aa8d-21d8d1f44898")
    public void setSaStep_ModelElement_selfSuspensionBlocking(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SELFSUSPENSIONBLOCKING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SaStep_ModelElement_sharedRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f4a72573-9fef-4187-99ab-9197e1019d63")
    public void setSaStep_ModelElement_sharedRes(final List<String> values) {
        this.elt.putTagValues(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SHAREDRES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaStep_ModelElement_spareCap'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ddaef9c5-c917-4ae5-b344-c9433dc69492")
    public void setSaStep_ModelElement_spareCap(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SPARECAP_TAGTYPE_ELT, value);
    }

    @objid ("c29a0abc-69ce-4df1-8399-1092915ba213")
    protected SaStepModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("07a1fe3b-9b81-420c-a50a-eeed7a45af3a")
    public static final class MdaTypes {
        @objid ("4a88dc7b-2b26-448c-85c0-6c023ceef569")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("db249a3c-7a44-4fd3-a50e-d73251a419e3")
        public static TagType SASTEP_MODELELEMENT_DEADLINE_TAGTYPE_ELT;

        @objid ("71248bb7-c5f7-47c5-9d18-af70e1414b6d")
        public static TagType SASTEP_MODELELEMENT_SPARECAP_TAGTYPE_ELT;

        @objid ("d7105bb9-bf85-4465-b727-ceb494415140")
        public static TagType SASTEP_MODELELEMENT_SCHSLACK_TAGTYPE_ELT;

        @objid ("8539c897-f80f-443c-b32e-31aedae4fed3")
        public static TagType SASTEP_MODELELEMENT_PREEMPTT_TAGTYPE_ELT;

        @objid ("7a3a8201-0eec-441e-897e-71f241f079a3")
        public static TagType SASTEP_MODELELEMENT_READYT_TAGTYPE_ELT;

        @objid ("e86ce9f7-abbf-4a45-b709-667b3ad2c253")
        public static TagType SASTEP_MODELELEMENT_NONPREEMPTIONBLOCKING_TAGTYPE_ELT;

        @objid ("deb59d8b-97ba-4505-acb7-c94558651b3e")
        public static TagType SASTEP_MODELELEMENT_SHAREDRES_TAGTYPE_ELT;

        @objid ("c8d72c37-7399-4721-98f8-c84a7170992b")
        public static TagType SASTEP_MODELELEMENT_SELFSUSPENSIONBLOCKING_TAGTYPE_ELT;

        @objid ("8cf99b1a-690e-42c0-a99b-33d74af87c08")
        public static TagType SASTEP_MODELELEMENT_NUMBERSELFSUSPENSIONS_TAGTYPE_ELT;

        @objid ("ef87f4f3-04b0-4c7b-9c2d-969e8cd4eecd")
        private static Stereotype MDAASSOCDEP;

        @objid ("c0d35832-f141-4871-b490-77c11a144265")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2c39c468-e559-45d9-a1dd-8440595df11d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c922136d-14ab-11df-9d54-0014222a9f79");
            SASTEP_MODELELEMENT_DEADLINE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c922136e-14ab-11df-9d54-0014222a9f79");
            SASTEP_MODELELEMENT_SPARECAP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c922136f-14ab-11df-9d54-0014222a9f79");
            SASTEP_MODELELEMENT_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c9221370-14ab-11df-9d54-0014222a9f79");
            SASTEP_MODELELEMENT_PREEMPTT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c9221371-14ab-11df-9d54-0014222a9f79");
            SASTEP_MODELELEMENT_READYT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c9221372-14ab-11df-9d54-0014222a9f79");
            SASTEP_MODELELEMENT_NONPREEMPTIONBLOCKING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c9221373-14ab-11df-9d54-0014222a9f79");
            SASTEP_MODELELEMENT_SHAREDRES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c9221374-14ab-11df-9d54-0014222a9f79");
            SASTEP_MODELELEMENT_SELFSUSPENSIONBLOCKING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c9221375-14ab-11df-9d54-0014222a9f79");
            SASTEP_MODELELEMENT_NUMBERSELFSUSPENSIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c9221376-14ab-11df-9d54-0014222a9f79");
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
