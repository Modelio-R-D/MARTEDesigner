/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.infrastructure.modelelement;

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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaStepModelElement;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << SaStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaStepModelElement extends GaStepModelElement {
    public static final String STEREOTYPE_NAME = "SaStep_ModelElement";

    public static final String SASTEP_MODELELEMENT_DEADLINE_TAGTYPE = "SaStep_ModelElement_deadline";

    public static final String SASTEP_MODELELEMENT_NONPREEMPTIONBLOCKING_TAGTYPE = "SaStep_ModelElement_nonpreemptionBlocking";

    public static final String SASTEP_MODELELEMENT_NUMBERSELFSUSPENSIONS_TAGTYPE = "SaStep_ModelElement_numberSelfSuspensions";

    public static final String SASTEP_MODELELEMENT_PREEMPTT_TAGTYPE = "SaStep_ModelElement_preemptT";

    public static final String SASTEP_MODELELEMENT_READYT_TAGTYPE = "SaStep_ModelElement_readyT";

    public static final String SASTEP_MODELELEMENT_SCHSLACK_TAGTYPE = "SaStep_ModelElement_schSlack";

    public static final String SASTEP_MODELELEMENT_SELFSUSPENSIONBLOCKING_TAGTYPE = "SaStep_ModelElement_selfSuspensionBlocking";

    public static final String SASTEP_MODELELEMENT_SHAREDRES_TAGTYPE = "SaStep_ModelElement_sharedRes";

    public static final String SASTEP_MODELELEMENT_SPARECAP_TAGTYPE = "SaStep_ModelElement_spareCap";

    /**
     * Tells whether a {@link SaStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << SaStep_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << SaStep_ModelElement >> then instantiate a {@link SaStepModelElement} proxy.
     * 
     * @return a {@link SaStepModelElement} proxy on the created {@link ModelElement}.
     */
    public static SaStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaStepModelElement.STEREOTYPE_NAME);
        return SaStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link SaStepModelElement} proxy from a {@link ModelElement} stereotyped << SaStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link SaStepModelElement} proxy or <i>null</i>.
     */
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
    public static SaStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (SaStepModelElement.canInstantiate(obj))
        	return new SaStepModelElement(obj);
        else
        	throw new IllegalArgumentException("SaStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaStepModelElement other = (SaStepModelElement) obj;
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
     * Getter for string property 'SaStep_ModelElement_deadline'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaStep_ModelElement_deadline() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_DEADLINE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaStep_ModelElement_nonpreemptionBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaStep_ModelElement_nonpreemptionBlocking() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_NONPREEMPTIONBLOCKING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaStep_ModelElement_numberSelfSuspensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaStep_ModelElement_numberSelfSuspensions() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_NUMBERSELFSUSPENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaStep_ModelElement_preemptT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaStep_ModelElement_preemptT() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_PREEMPTT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaStep_ModelElement_readyT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaStep_ModelElement_readyT() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_READYT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaStep_ModelElement_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaStep_ModelElement_schSlack() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaStep_ModelElement_selfSuspensionBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaStep_ModelElement_selfSuspensionBlocking() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SELFSUSPENSIONBLOCKING_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaStep_ModelElement_sharedRes'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaStep_ModelElement_sharedRes() {
        return this.elt.getTagValues(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SHAREDRES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaStep_ModelElement_spareCap'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaStep_ModelElement_spareCap() {
        return this.elt.getTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SPARECAP_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SaStep_ModelElement_deadline'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaStep_ModelElement_deadline(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_DEADLINE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaStep_ModelElement_nonpreemptionBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaStep_ModelElement_nonpreemptionBlocking(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_NONPREEMPTIONBLOCKING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaStep_ModelElement_numberSelfSuspensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaStep_ModelElement_numberSelfSuspensions(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_NUMBERSELFSUSPENSIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaStep_ModelElement_preemptT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaStep_ModelElement_preemptT(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_PREEMPTT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaStep_ModelElement_readyT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaStep_ModelElement_readyT(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_READYT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaStep_ModelElement_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaStep_ModelElement_schSlack(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaStep_ModelElement_selfSuspensionBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaStep_ModelElement_selfSuspensionBlocking(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SELFSUSPENSIONBLOCKING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SaStep_ModelElement_sharedRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaStep_ModelElement_sharedRes(final List<String> values) {
        this.elt.putTagValues(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SHAREDRES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaStep_ModelElement_spareCap'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaStep_ModelElement_spareCap(final String value) {
        this.elt.putTagValue(SaStepModelElement.MdaTypes.SASTEP_MODELELEMENT_SPARECAP_TAGTYPE_ELT, value);
    }

    protected SaStepModelElement(final ModelElement elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SASTEP_MODELELEMENT_DEADLINE_TAGTYPE_ELT;

        public static TagType SASTEP_MODELELEMENT_SPARECAP_TAGTYPE_ELT;

        public static TagType SASTEP_MODELELEMENT_SCHSLACK_TAGTYPE_ELT;

        public static TagType SASTEP_MODELELEMENT_PREEMPTT_TAGTYPE_ELT;

        public static TagType SASTEP_MODELELEMENT_READYT_TAGTYPE_ELT;

        public static TagType SASTEP_MODELELEMENT_NONPREEMPTIONBLOCKING_TAGTYPE_ELT;

        public static TagType SASTEP_MODELELEMENT_SHAREDRES_TAGTYPE_ELT;

        public static TagType SASTEP_MODELELEMENT_SELFSUSPENSIONBLOCKING_TAGTYPE_ELT;

        public static TagType SASTEP_MODELELEMENT_NUMBERSELFSUSPENSIONS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
