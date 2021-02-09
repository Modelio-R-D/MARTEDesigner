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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << SaEndtoEndFlow_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaEndtoEndFlowModelElement {
    public static final String STEREOTYPE_NAME = "SaEndtoEndFlow_ModelElement";

    public static final String SAENDTOENDFLOW_MODELELEMENT_ENDTOENDD_TAGTYPE = "SaEndtoEndFlow_ModelElement_endToEndD";

    public static final String SAENDTOENDFLOW_MODELELEMENT_ENDTOENDT_TAGTYPE = "SaEndtoEndFlow_ModelElement_endToEndT";

    public static final String SAENDTOENDFLOW_MODELELEMENT_ISSCHED_TAGTYPE = "SaEndtoEndFlow_ModelElement_isSched";

    public static final String SAENDTOENDFLOW_MODELELEMENT_SCHSLACK_TAGTYPE = "SaEndtoEndFlow_ModelElement_schSlack";

    public static final String SAENDTOENDFLOW_MODELELEMENT_TIMING_TAGTYPE = "SaEndtoEndFlow_ModelElement_timing";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    protected final ModelElement elt;

    /**
     * Tells whether a {@link SaEndtoEndFlowModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << SaEndtoEndFlow_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaEndtoEndFlowModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << SaEndtoEndFlow_ModelElement >> then instantiate a {@link SaEndtoEndFlowModelElement} proxy.
     * 
     * @return a {@link SaEndtoEndFlowModelElement} proxy on the created {@link ModelElement}.
     */
    public static SaEndtoEndFlowModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaEndtoEndFlowModelElement.STEREOTYPE_NAME);
        return SaEndtoEndFlowModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link SaEndtoEndFlowModelElement} proxy from a {@link ModelElement} stereotyped << SaEndtoEndFlow_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link SaEndtoEndFlowModelElement} proxy or <i>null</i>.
     */
    public static SaEndtoEndFlowModelElement instantiate(final ModelElement obj) {
        return SaEndtoEndFlowModelElement.canInstantiate(obj) ? new SaEndtoEndFlowModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaEndtoEndFlowModelElement} proxy from a {@link ModelElement} stereotyped << SaEndtoEndFlow_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link SaEndtoEndFlowModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaEndtoEndFlowModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (SaEndtoEndFlowModelElement.canInstantiate(obj))
        	return new SaEndtoEndFlowModelElement(obj);
        else
        	throw new IllegalArgumentException("SaEndtoEndFlowModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaEndtoEndFlowModelElement other = (SaEndtoEndFlowModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for List<String> property 'SaEndtoEndFlow_ModelElement_endToEndD'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaEndtoEndFlow_ModelElement_endToEndD() {
        return this.elt.getTagValues(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_ENDTOENDD_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaEndtoEndFlow_ModelElement_endToEndT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaEndtoEndFlow_ModelElement_endToEndT() {
        return this.elt.getTagValues(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_ENDTOENDT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaEndtoEndFlow_ModelElement_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaEndtoEndFlow_ModelElement_schSlack() {
        return this.elt.getTagValue(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaEndtoEndFlow_ModelElement_timing'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaEndtoEndFlow_ModelElement_timing() {
        return this.elt.getTagValues(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_TIMING_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaEndtoEndFlow_ModelElement_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaEndtoEndFlow_ModelElement_isSched() {
        return this.elt.isTagged(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaEndtoEndFlow_ModelElement_endToEndD'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaEndtoEndFlow_ModelElement_endToEndD(final List<String> values) {
        this.elt.putTagValues(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_ENDTOENDD_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SaEndtoEndFlow_ModelElement_endToEndT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaEndtoEndFlow_ModelElement_endToEndT(final List<String> values) {
        this.elt.putTagValues(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_ENDTOENDT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'SaEndtoEndFlow_ModelElement_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaEndtoEndFlow_ModelElement_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaEndtoEndFlow_ModelElement_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaEndtoEndFlow_ModelElement_schSlack(final String value) {
        this.elt.putTagValue(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SaEndtoEndFlow_ModelElement_timing'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaEndtoEndFlow_ModelElement_timing(final List<String> values) {
        this.elt.putTagValues(SaEndtoEndFlowModelElement.MdaTypes.SAENDTOENDFLOW_MODELELEMENT_TIMING_TAGTYPE_ELT, values);
    }

    protected SaEndtoEndFlowModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SAENDTOENDFLOW_MODELELEMENT_ISSCHED_TAGTYPE_ELT;

        public static TagType SAENDTOENDFLOW_MODELELEMENT_SCHSLACK_TAGTYPE_ELT;

        public static TagType SAENDTOENDFLOW_MODELELEMENT_ENDTOENDT_TAGTYPE_ELT;

        public static TagType SAENDTOENDFLOW_MODELELEMENT_ENDTOENDD_TAGTYPE_ELT;

        public static TagType SAENDTOENDFLOW_MODELELEMENT_TIMING_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0384bb16-0ccf-11df-8525-001302895b2b");
            SAENDTOENDFLOW_MODELELEMENT_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb17-0ccf-11df-8525-001302895b2b");
            SAENDTOENDFLOW_MODELELEMENT_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb18-0ccf-11df-8525-001302895b2b");
            SAENDTOENDFLOW_MODELELEMENT_ENDTOENDT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb19-0ccf-11df-8525-001302895b2b");
            SAENDTOENDFLOW_MODELELEMENT_ENDTOENDD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb1a-0ccf-11df-8525-001302895b2b");
            SAENDTOENDFLOW_MODELELEMENT_TIMING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb1b-0ccf-11df-8525-001302895b2b");
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
