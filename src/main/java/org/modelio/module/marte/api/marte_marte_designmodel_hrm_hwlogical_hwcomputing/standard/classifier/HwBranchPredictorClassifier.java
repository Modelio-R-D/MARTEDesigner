/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.classifier.HwResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwBranchPredictor_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b355e5db-0d9c-46f4-97e7-fe61508e9cb0")
public class HwBranchPredictorClassifier extends HwResourceClassifier {
    @objid ("8f6e18c7-23da-4d81-8c10-f7f242fce769")
    public static final String STEREOTYPE_NAME = "HwBranchPredictor_Classifier";

    /**
     * Tells whether a {@link HwBranchPredictorClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwBranchPredictor_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5b9c958b-ae92-47f1-b7e8-77b70a03822d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwBranchPredictor_Classifier >> then instantiate a {@link HwBranchPredictorClassifier} proxy.
     * 
     * @return a {@link HwBranchPredictorClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("66512d72-8054-46fd-ba7c-4e181552ed5e")
    public static HwBranchPredictorClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorClassifier.STEREOTYPE_NAME);
        return HwBranchPredictorClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorClassifier} proxy from a {@link Classifier} stereotyped << HwBranchPredictor_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwBranchPredictorClassifier} proxy or <i>null</i>.
     */
    @objid ("c5b857d2-4485-4b3a-80a1-057278da6d0c")
    public static HwBranchPredictorClassifier instantiate(final Classifier obj) {
        return HwBranchPredictorClassifier.canInstantiate(obj) ? new HwBranchPredictorClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorClassifier} proxy from a {@link Classifier} stereotyped << HwBranchPredictor_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwBranchPredictorClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bb73b303-e559-4343-bbf9-faacbc8e5fe0")
    public static HwBranchPredictorClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwBranchPredictorClassifier.canInstantiate(obj))
        	return new HwBranchPredictorClassifier(obj);
        else
        	throw new IllegalArgumentException("HwBranchPredictorClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3d70035a-af2d-4e5a-8863-c7b49b831d71")
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
        HwBranchPredictorClassifier other = (HwBranchPredictorClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("b4dd6f66-508e-4be6-9fb3-5474348642d5")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("f2974c43-ad0c-48ab-a682-f6ac24111b1c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0d2b9ce3-83fe-4b6d-92ab-6676d34ff5bf")
    protected HwBranchPredictorClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("c65730f5-9ed1-409c-b26d-7e20cb817eed")
    public static final class MdaTypes {
        @objid ("e7ef3e95-9dd3-4a66-a6b5-14ffb7c5d4e8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ebf50254-9e54-4511-ba69-c1009c560037")
        private static Stereotype MDAASSOCDEP;

        @objid ("8ae1e53c-949f-4402-8007-25da87cdaac5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("85f8fd61-32a6-406a-abd1-5451ea8a8cf1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "87368b16-10a7-11df-81d9-0014222a9f79");
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
