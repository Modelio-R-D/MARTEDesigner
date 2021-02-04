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
 * Proxy class to handle a {@link Classifier} with << HwSupport_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d96c583b-febd-433d-953a-4bfed908c7d0")
public class HwSupportClassifier extends HwDeviceClassifier {
    @objid ("8f96b4b6-a5c1-4751-8560-8e9c0e7acc39")
    public static final String STEREOTYPE_NAME = "HwSupport_Classifier";

    /**
     * Tells whether a {@link HwSupportClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwSupport_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5fbe2555-3c11-4f4f-930d-6a5ff8a7329e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwSupport_Classifier >> then instantiate a {@link HwSupportClassifier} proxy.
     * 
     * @return a {@link HwSupportClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("c1962dfa-e847-4532-adc1-4f1867e936e7")
    public static HwSupportClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportClassifier.STEREOTYPE_NAME);
        return HwSupportClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwSupportClassifier} proxy from a {@link Classifier} stereotyped << HwSupport_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwSupportClassifier} proxy or <i>null</i>.
     */
    @objid ("873e0e08-5b61-40a6-a6f5-371d14682941")
    public static HwSupportClassifier instantiate(final Classifier obj) {
        return HwSupportClassifier.canInstantiate(obj) ? new HwSupportClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSupportClassifier} proxy from a {@link Classifier} stereotyped << HwSupport_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwSupportClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("794b2275-c399-49ae-bb2e-6074df2ce4c8")
    public static HwSupportClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwSupportClassifier.canInstantiate(obj))
        	return new HwSupportClassifier(obj);
        else
        	throw new IllegalArgumentException("HwSupportClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("428699d1-8d75-4060-a814-66b4daa513fc")
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
        HwSupportClassifier other = (HwSupportClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("1e848a4d-d16b-4417-884c-f5fc4e892814")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("6851d3f1-3b74-421f-ab8d-8339351916fd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("79a682c3-e241-463d-9154-49134a1fe39e")
    protected HwSupportClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("a36475f2-8998-4d91-ada3-578f64c98349")
    public static final class MdaTypes {
        @objid ("b8957413-34bb-435d-b99e-6e75381d1ef6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d06adc49-01d8-48cb-91c0-083b6269978d")
        private static Stereotype MDAASSOCDEP;

        @objid ("659d6b96-e057-40fc-9028-4d2d9067c07e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0c657b64-41e7-430b-bdcc-0c27a09cf70e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "791c2674-10b0-11df-81d9-0014222a9f79");
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
