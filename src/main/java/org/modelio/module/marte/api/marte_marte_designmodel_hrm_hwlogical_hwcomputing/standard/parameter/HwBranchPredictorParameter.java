/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.parameter.HwResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwBranchPredictor_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3445cec9-736d-4e4e-9617-a64a11439c4c")
public class HwBranchPredictorParameter extends HwResourceParameter {
    @objid ("a4bf1c35-45c7-4a77-8a14-6a5151c2a15c")
    public static final String STEREOTYPE_NAME = "HwBranchPredictor_Parameter";

    /**
     * Tells whether a {@link HwBranchPredictorParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwBranchPredictor_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("906914df-0312-4663-80fd-d9dff18f20ea")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwBranchPredictor_Parameter >> then instantiate a {@link HwBranchPredictorParameter} proxy.
     * 
     * @return a {@link HwBranchPredictorParameter} proxy on the created {@link Parameter}.
     */
    @objid ("3a707290-4493-45f5-b11d-0e855a1f8c34")
    public static HwBranchPredictorParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorParameter.STEREOTYPE_NAME);
        return HwBranchPredictorParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorParameter} proxy from a {@link Parameter} stereotyped << HwBranchPredictor_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwBranchPredictorParameter} proxy or <i>null</i>.
     */
    @objid ("9b55e932-a78e-414b-a1e4-a2232b12b263")
    public static HwBranchPredictorParameter instantiate(final Parameter obj) {
        return HwBranchPredictorParameter.canInstantiate(obj) ? new HwBranchPredictorParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorParameter} proxy from a {@link Parameter} stereotyped << HwBranchPredictor_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwBranchPredictorParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("40333c56-c1d5-4884-bbf4-0720fc4b26ed")
    public static HwBranchPredictorParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwBranchPredictorParameter.canInstantiate(obj))
        	return new HwBranchPredictorParameter(obj);
        else
        	throw new IllegalArgumentException("HwBranchPredictorParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3c5478d9-7e7c-4f0b-9821-3ef8849bf07e")
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
        HwBranchPredictorParameter other = (HwBranchPredictorParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("24dac2b1-6761-4a18-9716-6e96294b98d9")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("8d3151ac-523a-4f58-9a41-748bd181c7ab")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b12aef67-9768-4bdd-8a3e-7f86b8ef853f")
    protected HwBranchPredictorParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("b0f7bac3-e77b-4edc-8bba-3f0df885c75a")
    public static final class MdaTypes {
        @objid ("114cbdd9-06b4-4a5f-b808-4cb54e04c072")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b559cb55-d0ef-4e03-b15f-9edfd446aa3f")
        private static Stereotype MDAASSOCDEP;

        @objid ("dbe3fab7-2f60-4e8e-8f2f-37b0a837f6f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1bb6a7a6-a4fd-4519-af8b-29229d8f2875")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00fc43f0-0ccf-11df-8525-001302895b2b");
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
