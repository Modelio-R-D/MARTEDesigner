/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.lifeline.HwResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwBranchPredictor_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7bf8a2c2-a8b0-4c8f-a7ae-3d9180bbc8a1")
public class HwBranchPredictorLifeline extends HwResourceLifeline {
    @objid ("f16feed0-ef60-4d20-bef3-0fbc8db8d730")
    public static final String STEREOTYPE_NAME = "HwBranchPredictor_Lifeline";

    /**
     * Tells whether a {@link HwBranchPredictorLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwBranchPredictor_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("91deb034-adcd-412c-a33d-677e2f43d6a9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwBranchPredictor_Lifeline >> then instantiate a {@link HwBranchPredictorLifeline} proxy.
     * 
     * @return a {@link HwBranchPredictorLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("17374bc6-a3e7-4561-aefb-f8fb10b7915c")
    public static HwBranchPredictorLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorLifeline.STEREOTYPE_NAME);
        return HwBranchPredictorLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorLifeline} proxy from a {@link Lifeline} stereotyped << HwBranchPredictor_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwBranchPredictorLifeline} proxy or <i>null</i>.
     */
    @objid ("b0077f61-7dae-4e1b-8b06-d644d6d3a579")
    public static HwBranchPredictorLifeline instantiate(final Lifeline obj) {
        return HwBranchPredictorLifeline.canInstantiate(obj) ? new HwBranchPredictorLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorLifeline} proxy from a {@link Lifeline} stereotyped << HwBranchPredictor_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwBranchPredictorLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("889f0d4d-09dd-4b19-898f-a8f6022258d6")
    public static HwBranchPredictorLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwBranchPredictorLifeline.canInstantiate(obj))
        	return new HwBranchPredictorLifeline(obj);
        else
        	throw new IllegalArgumentException("HwBranchPredictorLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("65c8fb86-4c5d-4b0b-88ad-a52cdfa23538")
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
        HwBranchPredictorLifeline other = (HwBranchPredictorLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("a9708142-4cab-4e3a-99bf-7a0762b0f243")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("7e188d8c-646e-454e-a7fa-bf2d3205e6d7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("8fcde734-b70b-4095-89ad-a9ba0c64d112")
    protected HwBranchPredictorLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("95560a36-c09a-4173-96cd-3a21ad827378")
    public static final class MdaTypes {
        @objid ("1437a61f-8f05-45af-9b2b-aafff9a508e3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("69f27764-42fa-4ff5-8d60-19cd01923eae")
        private static Stereotype MDAASSOCDEP;

        @objid ("909c70d8-5d0d-4f33-a50a-c993c3c50e3b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("115be6de-73db-4598-b73e-395515d4b814")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "86d26684-10a7-11df-81d9-0014222a9f79");
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
