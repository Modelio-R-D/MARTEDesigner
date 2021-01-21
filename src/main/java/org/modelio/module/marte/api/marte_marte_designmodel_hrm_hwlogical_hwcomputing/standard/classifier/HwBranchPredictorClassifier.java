/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("82040072-9e64-4e29-9ae7-fa5852d12700")
    public static final String STEREOTYPE_NAME = "HwBranchPredictor_Classifier";

    /**
     * Tells whether a {@link HwBranchPredictorClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwBranchPredictor_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8bf40d26-f41a-4bca-938a-a8cda325e897")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwBranchPredictor_Classifier >> then instantiate a {@link HwBranchPredictorClassifier} proxy.
     * 
     * @return a {@link HwBranchPredictorClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("9f74964b-1fe6-4810-a0f5-de00c201a2ad")
    public static HwBranchPredictorClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorClassifier.STEREOTYPE_NAME);
        return HwBranchPredictorClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorClassifier} proxy from a {@link Classifier} stereotyped << HwBranchPredictor_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwBranchPredictorClassifier} proxy or <i>null</i>.
     */
    @objid ("11299654-79c8-4555-b981-fdea4e211052")
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
    @objid ("1644576b-9372-43ce-9486-ecf833982c1e")
    public static HwBranchPredictorClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwBranchPredictorClassifier.canInstantiate(obj))
        	return new HwBranchPredictorClassifier(obj);
        else
        	throw new IllegalArgumentException("HwBranchPredictorClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6e6cd3e0-1463-4ccf-abbc-99b53d0772f5")
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
    @objid ("a50235cf-945c-4d33-8d5a-fca34b3045f7")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("81c15faf-a7a4-4072-be61-33994bb1fecc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0ad11b7f-a106-4397-a487-3e600ba4ea25")
    protected HwBranchPredictorClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("c65730f5-9ed1-409c-b26d-7e20cb817eed")
    public static final class MdaTypes {
        @objid ("ca217f8b-5dc5-4b93-9549-c3d5644eeb48")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a6af4d97-2483-4a36-b19b-b78e97951874")
        private static Stereotype MDAASSOCDEP;

        @objid ("e0f42e93-2195-4286-a493-e84f88cfe0c3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("abbf190d-2570-47d0-aaba-527002e131d2")
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
