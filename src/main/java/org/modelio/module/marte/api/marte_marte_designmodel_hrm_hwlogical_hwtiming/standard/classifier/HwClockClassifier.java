/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << HwClock_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ad30bd53-485f-4ff0-918c-aef9c7279c90")
public class HwClockClassifier extends HwTimingResourceClassifier {
    @objid ("5ffd6273-7e9b-491b-afac-7383d5c5f207")
    public static final String STEREOTYPE_NAME = "HwClock_Classifier";

    @objid ("72d0832d-b6b3-4c83-938f-492c3591ae04")
    public static final String HWCLOCK_CLASSIFIER_FREQUENCY_TAGTYPE = "HwClock_Classifier_frequency";

    /**
     * Tells whether a {@link HwClockClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwClock_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e049fb9c-1a4f-4444-bedf-30a9bd142f09")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwClockClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwClock_Classifier >> then instantiate a {@link HwClockClassifier} proxy.
     * 
     * @return a {@link HwClockClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("a4b24bfc-968a-4fe0-80a0-f3a0bb8e47a0")
    public static HwClockClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwClockClassifier.STEREOTYPE_NAME);
        return HwClockClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwClockClassifier} proxy from a {@link Classifier} stereotyped << HwClock_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwClockClassifier} proxy or <i>null</i>.
     */
    @objid ("8606f212-d7b2-4a64-9300-b3dadca2aed2")
    public static HwClockClassifier instantiate(final Classifier obj) {
        return HwClockClassifier.canInstantiate(obj) ? new HwClockClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwClockClassifier} proxy from a {@link Classifier} stereotyped << HwClock_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwClockClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("50904775-b0b9-434d-aef4-ea7bd8cd9e64")
    public static HwClockClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwClockClassifier.canInstantiate(obj))
        	return new HwClockClassifier(obj);
        else
        	throw new IllegalArgumentException("HwClockClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e6799aa4-bec3-45af-84e5-f525e3954bad")
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
        HwClockClassifier other = (HwClockClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("d9fed0a0-20f5-40f8-ac1d-6f6050a9b762")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwClock_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d420fc1e-5c7c-4f5c-931c-19b89e39d45e")
    public String getHwClock_Classifier_frequency() {
        return this.elt.getTagValue(HwClockClassifier.MdaTypes.HWCLOCK_CLASSIFIER_FREQUENCY_TAGTYPE_ELT);
    }

    @objid ("80087db0-0ed6-4c07-b8fe-ab77f27f8baa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwClock_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76bc6848-4d52-4d8a-8995-47dd934e64cb")
    public void setHwClock_Classifier_frequency(final String value) {
        this.elt.putTagValue(HwClockClassifier.MdaTypes.HWCLOCK_CLASSIFIER_FREQUENCY_TAGTYPE_ELT, value);
    }

    @objid ("f799daf5-12db-4f34-891a-86fda7e72e6d")
    protected HwClockClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("1e311ee8-d980-4c18-a1e6-bf446e3c618b")
    public static final class MdaTypes {
        @objid ("c71aadbd-1034-4ed5-998f-4068b325f9f8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fb7cc61f-1921-4123-96d0-04c2b68a4009")
        public static TagType HWCLOCK_CLASSIFIER_FREQUENCY_TAGTYPE_ELT;

        @objid ("9a0b6e83-5530-4065-a3e9-f229ca5575c1")
        private static Stereotype MDAASSOCDEP;

        @objid ("f9a9cd59-16b0-4bc1-ba43-3bd4029bfe52")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0dec85d0-fe8e-46df-b69c-047b67e95da9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "61661f75-10ae-11df-81d9-0014222a9f79");
            HWCLOCK_CLASSIFIER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fc0dbedd-123c-11df-8f55-0014222a9f79");
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
