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
 * Proxy class to handle a {@link Classifier} with << HwTimer_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ba3433e2-7340-43e8-bb0e-1f5dca7f84f4")
public class HwTimerClassifier extends HwTimingResourceClassifier {
    @objid ("11c58f22-cce7-4c78-b948-5a049ac31de0")
    public static final String STEREOTYPE_NAME = "HwTimer_Classifier";

    @objid ("f88a8206-d497-4e32-a6fc-f02701c1d98b")
    public static final String HWTIMER_CLASSIFIER_COUNTERWIDTH_TAGTYPE = "HwTimer_Classifier_counterWidth";

    @objid ("e644c9e5-7917-4c02-ba78-0f87bba8a013")
    public static final String HWTIMER_CLASSIFIER_INPUTCLOCK_TAGTYPE = "HwTimer_Classifier_inputClock";

    @objid ("003052ff-1558-4d8b-961b-dfc8dd378772")
    public static final String HWTIMER_CLASSIFIER_NBCOUNTERS_TAGTYPE = "HwTimer_Classifier_nbCounters";

    /**
     * Tells whether a {@link HwTimerClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwTimer_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6af00c86-d655-419a-b72d-c4c6289e41ea")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwTimer_Classifier >> then instantiate a {@link HwTimerClassifier} proxy.
     * 
     * @return a {@link HwTimerClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("2073c15b-4fec-4e0c-9dfe-f2a7258a4842")
    public static HwTimerClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimerClassifier.STEREOTYPE_NAME);
        return HwTimerClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwTimerClassifier} proxy from a {@link Classifier} stereotyped << HwTimer_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwTimerClassifier} proxy or <i>null</i>.
     */
    @objid ("8431e207-927a-4a5f-8cda-b3f9dbf0147f")
    public static HwTimerClassifier instantiate(final Classifier obj) {
        return HwTimerClassifier.canInstantiate(obj) ? new HwTimerClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimerClassifier} proxy from a {@link Classifier} stereotyped << HwTimer_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwTimerClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("eeaf7376-020d-4b06-a2e8-4eae4c8a17a5")
    public static HwTimerClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwTimerClassifier.canInstantiate(obj))
        	return new HwTimerClassifier(obj);
        else
        	throw new IllegalArgumentException("HwTimerClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c1b69b5a-3f1b-4b1c-9fe4-6d2a29cc270f")
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
        HwTimerClassifier other = (HwTimerClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("402a6ae4-226e-444f-87e4-755b2a66ddfd")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwTimer_Classifier_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("12e6f73b-48e6-4c52-ae7c-eb15e26be39d")
    public String getHwTimer_Classifier_counterWidth() {
        return this.elt.getTagValue(HwTimerClassifier.MdaTypes.HWTIMER_CLASSIFIER_COUNTERWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Classifier_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e561d18d-1c3b-49d9-b7ab-6d7070b517b7")
    public String getHwTimer_Classifier_inputClock() {
        return this.elt.getTagValue(HwTimerClassifier.MdaTypes.HWTIMER_CLASSIFIER_INPUTCLOCK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimer_Classifier_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c276732d-ffb8-4531-b4bc-2395fdc54a58")
    public String getHwTimer_Classifier_nbCounters() {
        return this.elt.getTagValue(HwTimerClassifier.MdaTypes.HWTIMER_CLASSIFIER_NBCOUNTERS_TAGTYPE_ELT);
    }

    @objid ("67c22271-68dc-459c-b0bb-a8fdec72ae56")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimer_Classifier_counterWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d24038a-0213-455d-bc2d-680d719cd1f4")
    public void setHwTimer_Classifier_counterWidth(final String value) {
        this.elt.putTagValue(HwTimerClassifier.MdaTypes.HWTIMER_CLASSIFIER_COUNTERWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Classifier_inputClock'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("97b636bb-01e6-4119-aa0d-9d211d644cbc")
    public void setHwTimer_Classifier_inputClock(final String value) {
        this.elt.putTagValue(HwTimerClassifier.MdaTypes.HWTIMER_CLASSIFIER_INPUTCLOCK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwTimer_Classifier_nbCounters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b52f3b30-7b07-4e35-b7b2-80c468258215")
    public void setHwTimer_Classifier_nbCounters(final String value) {
        this.elt.putTagValue(HwTimerClassifier.MdaTypes.HWTIMER_CLASSIFIER_NBCOUNTERS_TAGTYPE_ELT, value);
    }

    @objid ("3076e15f-5c7c-4670-8b9f-d1be94dac5b2")
    protected HwTimerClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("7fd0f5c0-b1bd-4ac1-8c23-1fc4277ce5c1")
    public static final class MdaTypes {
        @objid ("7021e734-0c21-4515-be92-63a3d3dfd631")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("69044f9d-3465-4373-b190-3ef497b282a2")
        public static TagType HWTIMER_CLASSIFIER_NBCOUNTERS_TAGTYPE_ELT;

        @objid ("8819314a-20f3-49e8-b2bd-af2d4c38dd6b")
        public static TagType HWTIMER_CLASSIFIER_COUNTERWIDTH_TAGTYPE_ELT;

        @objid ("95151bc7-44da-4627-a6fe-ee292fdf4a81")
        public static TagType HWTIMER_CLASSIFIER_INPUTCLOCK_TAGTYPE_ELT;

        @objid ("648f7103-4f72-4a5f-b755-c270c68b0c44")
        private static Stereotype MDAASSOCDEP;

        @objid ("e9d8470c-a89c-41bd-9959-a127551705a5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("deb930c8-c375-44f4-9b97-f97053decc39")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4e9be547-10af-11df-81d9-0014222a9f79");
            HWTIMER_CLASSIFIER_NBCOUNTERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e9be549-10af-11df-81d9-0014222a9f79");
            HWTIMER_CLASSIFIER_COUNTERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e9be548-10af-11df-81d9-0014222a9f79");
            HWTIMER_CLASSIFIER_INPUTCLOCK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e9be54a-10af-11df-81d9-0014222a9f79");
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
