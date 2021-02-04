/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Classifier} with << HwSensor_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("75da2604-7d5e-4bc3-ad05-becea95943f9")
public class HwSensorClassifier extends HwIOClassifier {
    @objid ("2dfa9238-6f16-4157-ba3f-2caf3a444e0d")
    public static final String STEREOTYPE_NAME = "HwSensor_Classifier";

    /**
     * Tells whether a {@link HwSensorClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwSensor_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b7a40ea0-cd07-48f0-9ff0-500f68b7361b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwSensor_Classifier >> then instantiate a {@link HwSensorClassifier} proxy.
     * 
     * @return a {@link HwSensorClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("c167768e-bf81-4f34-85d3-1de0258a700a")
    public static HwSensorClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorClassifier.STEREOTYPE_NAME);
        return HwSensorClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwSensorClassifier} proxy from a {@link Classifier} stereotyped << HwSensor_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwSensorClassifier} proxy or <i>null</i>.
     */
    @objid ("e8e788c9-eee5-41eb-8dd9-bc4ed6783d19")
    public static HwSensorClassifier instantiate(final Classifier obj) {
        return HwSensorClassifier.canInstantiate(obj) ? new HwSensorClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSensorClassifier} proxy from a {@link Classifier} stereotyped << HwSensor_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwSensorClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("67c94f65-3b83-4bde-8674-29729e47515e")
    public static HwSensorClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwSensorClassifier.canInstantiate(obj))
        	return new HwSensorClassifier(obj);
        else
        	throw new IllegalArgumentException("HwSensorClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("651ba8b6-c38d-4ec0-ad92-08b2ad697989")
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
        HwSensorClassifier other = (HwSensorClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("99b5caf8-4cf0-41e5-ba24-fdd4f6a0f405")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("3af1c3dc-a6b6-4c09-ad63-36cb004016e9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ffd556a7-8fec-4457-839f-a3aa5676b7ab")
    protected HwSensorClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("e1aa22fe-18a8-46d9-a4ad-6d5f76af8c5e")
    public static final class MdaTypes {
        @objid ("eb6bd1e3-a758-47cc-a442-6420d595e1af")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("826713c2-d93a-4c22-889e-61de140cc54e")
        private static Stereotype MDAASSOCDEP;

        @objid ("7e2ed41a-7265-4935-84b5-7b9f8dc0f8e4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3646f349-fbb2-4a78-b15c-894cd853e189")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e89de84b-c7ac-11df-ad39-001302895b2b");
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
