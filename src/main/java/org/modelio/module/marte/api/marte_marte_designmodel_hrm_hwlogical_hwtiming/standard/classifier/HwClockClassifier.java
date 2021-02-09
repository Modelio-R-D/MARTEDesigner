/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class HwClockClassifier extends HwTimingResourceClassifier {
    public static final String STEREOTYPE_NAME = "HwClock_Classifier";

    public static final String HWCLOCK_CLASSIFIER_FREQUENCY_TAGTYPE = "HwClock_Classifier_frequency";

    /**
     * Tells whether a {@link HwClockClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwClock_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwClockClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwClock_Classifier >> then instantiate a {@link HwClockClassifier} proxy.
     * 
     * @return a {@link HwClockClassifier} proxy on the created {@link Classifier}.
     */
    public static HwClockClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwClockClassifier.STEREOTYPE_NAME);
        return HwClockClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwClockClassifier} proxy from a {@link Classifier} stereotyped << HwClock_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwClockClassifier} proxy or <i>null</i>.
     */
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
    public static HwClockClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwClockClassifier.canInstantiate(obj))
        	return new HwClockClassifier(obj);
        else
        	throw new IllegalArgumentException("HwClockClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwClock_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwClock_Classifier_frequency() {
        return this.elt.getTagValue(HwClockClassifier.MdaTypes.HWCLOCK_CLASSIFIER_FREQUENCY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwClock_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwClock_Classifier_frequency(final String value) {
        this.elt.putTagValue(HwClockClassifier.MdaTypes.HWCLOCK_CLASSIFIER_FREQUENCY_TAGTYPE_ELT, value);
    }

    protected HwClockClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCLOCK_CLASSIFIER_FREQUENCY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
