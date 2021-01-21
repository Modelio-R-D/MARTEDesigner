/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.classifier;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwActuator_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("111a6d27-b266-4467-8866-ad95a015601f")
public class HwActuatorClassifier extends HwIOClassifier {
    @objid ("4587cd65-40c1-4f52-9a77-3cfac6e2bd65")
    public static final String STEREOTYPE_NAME = "HwActuator_Classifier";

    /**
     * Tells whether a {@link HwActuatorClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwActuator_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("fe971135-abbc-4c08-adc4-4ec42df94103")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwActuator_Classifier >> then instantiate a {@link HwActuatorClassifier} proxy.
     * 
     * @return a {@link HwActuatorClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("eddf579f-af9d-4258-967c-9a7ec2b87867")
    public static HwActuatorClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorClassifier.STEREOTYPE_NAME);
        return HwActuatorClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwActuatorClassifier} proxy from a {@link Classifier} stereotyped << HwActuator_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwActuatorClassifier} proxy or <i>null</i>.
     */
    @objid ("583ef4da-ff55-4544-98ac-ee31547d7d0d")
    public static HwActuatorClassifier instantiate(final Classifier obj) {
        return HwActuatorClassifier.canInstantiate(obj) ? new HwActuatorClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwActuatorClassifier} proxy from a {@link Classifier} stereotyped << HwActuator_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwActuatorClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ceb906f5-3b5c-4595-b1a1-3c5d08d2b1dc")
    public static HwActuatorClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwActuatorClassifier.canInstantiate(obj))
        	return new HwActuatorClassifier(obj);
        else
        	throw new IllegalArgumentException("HwActuatorClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c1d8a39a-1607-4057-afa9-fa77252731d4")
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
        HwActuatorClassifier other = (HwActuatorClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("e76b69e7-85ff-498a-95d4-1450a345725d")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("a688a525-0412-40a4-a114-4670e9ed620b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("108e21e8-bdf2-47ab-8b21-1c6782a8285c")
    protected HwActuatorClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("639459ea-639c-4d65-bacf-34e91d147d85")
    public static final class MdaTypes {
        @objid ("ef4bafc3-1678-40ce-a41c-f6aa8619aa92")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("805ddb90-6154-4c08-b8d1-00d3e22cc26e")
        private static Stereotype MDAASSOCDEP;

        @objid ("9d5c3afb-4109-4b0b-a52a-4d523c4ffcd9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3dd5b439-9613-4ce7-a780-b415d680e653")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "88a37412-c7ac-11df-ad39-001302895b2b");
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
