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
 * Proxy class to handle a {@link Classifier} with << HwSensor_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("75da2604-7d5e-4bc3-ad05-becea95943f9")
public class HwSensorClassifier extends HwIOClassifier {
    @objid ("43319900-65fe-4f38-a437-face5da3248c")
    public static final String STEREOTYPE_NAME = "HwSensor_Classifier";

    /**
     * Tells whether a {@link HwSensorClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwSensor_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("19921654-70e8-4b42-9311-9a74c8b660b0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwSensor_Classifier >> then instantiate a {@link HwSensorClassifier} proxy.
     * 
     * @return a {@link HwSensorClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("c79a086e-2bcd-4a26-80e3-4e49535ad851")
    public static HwSensorClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorClassifier.STEREOTYPE_NAME);
        return HwSensorClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwSensorClassifier} proxy from a {@link Classifier} stereotyped << HwSensor_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwSensorClassifier} proxy or <i>null</i>.
     */
    @objid ("b1d8bf1d-a821-4534-94fe-8abd12742e86")
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
    @objid ("f85b5581-4642-44e5-a0f7-7e15020a0752")
    public static HwSensorClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwSensorClassifier.canInstantiate(obj))
        	return new HwSensorClassifier(obj);
        else
        	throw new IllegalArgumentException("HwSensorClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e70c1597-36c3-4f0a-a2c3-54de96a491bd")
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
    @objid ("06e91685-7b4b-4793-8ea4-cf53245dc6fb")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("e397ec68-887e-40bc-a553-c2bd285f48e2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fe4855a0-d792-45c5-b64c-6b2ab0d04949")
    protected HwSensorClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("e1aa22fe-18a8-46d9-a4ad-6d5f76af8c5e")
    public static final class MdaTypes {
        @objid ("757b1459-cab2-4de8-a699-22179d9ef58f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a5d14b2e-44b5-46da-b52d-91575390287a")
        private static Stereotype MDAASSOCDEP;

        @objid ("d3391def-77fa-43cd-a0c2-85e85e70a5fe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b12e074b-43b1-4ae4-9e24-537211c44fb4")
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
