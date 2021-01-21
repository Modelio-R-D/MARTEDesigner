/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("417ad2ed-875f-46dd-a2df-92153a56ce9f")
    public static final String STEREOTYPE_NAME = "HwBranchPredictor_Lifeline";

    /**
     * Tells whether a {@link HwBranchPredictorLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwBranchPredictor_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f2924228-45d3-407a-a05e-e7a44d03dacd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwBranchPredictor_Lifeline >> then instantiate a {@link HwBranchPredictorLifeline} proxy.
     * 
     * @return a {@link HwBranchPredictorLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("2b98c51e-2ade-451f-b424-599c087d3f78")
    public static HwBranchPredictorLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorLifeline.STEREOTYPE_NAME);
        return HwBranchPredictorLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorLifeline} proxy from a {@link Lifeline} stereotyped << HwBranchPredictor_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwBranchPredictorLifeline} proxy or <i>null</i>.
     */
    @objid ("9ed0655f-b864-4fde-a1d9-232dfae20df0")
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
    @objid ("9d14c031-0a33-47eb-9545-69856a097c26")
    public static HwBranchPredictorLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwBranchPredictorLifeline.canInstantiate(obj))
        	return new HwBranchPredictorLifeline(obj);
        else
        	throw new IllegalArgumentException("HwBranchPredictorLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ac9ed8c6-4ace-472f-9cf3-8ad0c544f78d")
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
    @objid ("cad55abf-4e35-4074-af26-e810f2ddcdd9")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("72c57172-c3f0-45cd-9a89-c789386203b8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fe959cbe-f46b-40be-bc59-e5941465105d")
    protected HwBranchPredictorLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("95560a36-c09a-4173-96cd-3a21ad827378")
    public static final class MdaTypes {
        @objid ("31f86e3a-2e63-469b-9f38-3a4d69f15823")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("95dac54d-e97e-4d5d-84af-1df9c51a6935")
        private static Stereotype MDAASSOCDEP;

        @objid ("417518c9-6635-41e9-886d-bc39555fe31c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f118ce24-bd67-4206-beec-da8bdd99e875")
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
