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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.classifier.HwResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwDevice_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0611a6fd-76f0-4f44-95db-c686d1cc0f00")
public class HwDeviceClassifier extends HwResourceClassifier {
    @objid ("632172ea-f350-4585-9413-b837c517c1f9")
    public static final String STEREOTYPE_NAME = "HwDevice_Classifier";

    @objid ("e4810475-d306-4eec-9bb1-4094eaf99258")
    public static final String HWDEVICE_CLASSIFIER_MAINSCHEDULER_TAGTYPE = "HwDevice_Classifier_mainScheduler";

    @objid ("d813db9c-6515-4183-b090-1513d5127134")
    public static final String HWDEVICE_CLASSIFIER_SPEEDFACTOR_TAGTYPE = "HwDevice_Classifier_speedFactor";

    /**
     * Tells whether a {@link HwDeviceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwDevice_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4781d94b-8565-48ae-ba4c-9bd8291354f9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwDevice_Classifier >> then instantiate a {@link HwDeviceClassifier} proxy.
     * 
     * @return a {@link HwDeviceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("9bd0c774-3357-4ab8-8d0f-fd692e6e8d61")
    public static HwDeviceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceClassifier.STEREOTYPE_NAME);
        return HwDeviceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwDeviceClassifier} proxy from a {@link Classifier} stereotyped << HwDevice_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwDeviceClassifier} proxy or <i>null</i>.
     */
    @objid ("b1f9f697-7488-4d57-9ec7-27fa98d7ec5f")
    public static HwDeviceClassifier instantiate(final Classifier obj) {
        return HwDeviceClassifier.canInstantiate(obj) ? new HwDeviceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDeviceClassifier} proxy from a {@link Classifier} stereotyped << HwDevice_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwDeviceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c8b4ddda-554b-403c-a679-b3273cc76e97")
    public static HwDeviceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwDeviceClassifier.canInstantiate(obj))
        	return new HwDeviceClassifier(obj);
        else
        	throw new IllegalArgumentException("HwDeviceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("28c4ae02-dc54-4168-8e7e-e567cfc7ef8a")
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
        HwDeviceClassifier other = (HwDeviceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("f520e951-2540-4f6f-b17a-9797945d6f9b")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwDevice_Classifier_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("467eda4b-3d27-4236-84d0-90849cef4ac5")
    public String getHwDevice_Classifier_mainScheduler() {
        return this.elt.getTagValue(HwDeviceClassifier.MdaTypes.HWDEVICE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDevice_Classifier_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("763897de-be81-4142-80be-730e5247c94b")
    public String getHwDevice_Classifier_speedFactor() {
        return this.elt.getTagValue(HwDeviceClassifier.MdaTypes.HWDEVICE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("67817b8d-7567-4f78-896e-388b2061c400")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDevice_Classifier_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f9999640-0df0-47f2-9e03-560fbfb8a090")
    public void setHwDevice_Classifier_mainScheduler(final String value) {
        this.elt.putTagValue(HwDeviceClassifier.MdaTypes.HWDEVICE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDevice_Classifier_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6349fd38-762b-4078-be4b-4f7d49dceecd")
    public void setHwDevice_Classifier_speedFactor(final String value) {
        this.elt.putTagValue(HwDeviceClassifier.MdaTypes.HWDEVICE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("2f61f549-1db7-46fa-8165-3d31beb2e56b")
    protected HwDeviceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("394343dd-1c47-45c2-8393-c932a09f9a0b")
    public static final class MdaTypes {
        @objid ("05fd3fdb-141b-4970-a6f5-e0ac16c331be")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a2e64b00-e198-4e7b-8436-e17b6c1fbda6")
        public static TagType HWDEVICE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("5da2aa64-0465-49da-b573-ffecb2038f15")
        public static TagType HWDEVICE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("a79a4560-8117-448e-b9eb-dae61e087c3a")
        private static Stereotype MDAASSOCDEP;

        @objid ("4a499111-19d9-4b9e-b468-9a0ae44724fc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4ee80281-ccac-4ca2-a4da-f393b195efdb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cd7ad7b9-10b0-11df-81d9-0014222a9f79");
            HWDEVICE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "51b08292-92ab-11e0-a69d-0027103f347c");
            HWDEVICE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "51b08293-92ab-11e0-a69d-0027103f347c");
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
