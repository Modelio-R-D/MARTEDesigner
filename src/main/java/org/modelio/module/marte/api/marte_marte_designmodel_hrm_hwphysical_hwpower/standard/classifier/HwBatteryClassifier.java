/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << HwBattery_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("92a63f9e-9416-4181-84eb-e040b91dd4f6")
public class HwBatteryClassifier extends HwPowerSupplyClassifier {
    @objid ("c6d736c3-c254-4935-9fc1-4e1599fffb38")
    public static final String STEREOTYPE_NAME = "HwBattery_Classifier";

    @objid ("c49c253a-6eb9-406f-a532-d69a4f3a7405")
    public static final String HWBATTERY_CLASSIFIER_CAPACITY_TAGTYPE = "HwBattery_Classifier_capacity";

    /**
     * Tells whether a {@link HwBatteryClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwBattery_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("975f7515-de1c-4525-97f3-a0e7868cdf04")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwBattery_Classifier >> then instantiate a {@link HwBatteryClassifier} proxy.
     * 
     * @return a {@link HwBatteryClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("fbbe8445-4e58-444b-836f-d17fd3dbc855")
    public static HwBatteryClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryClassifier.STEREOTYPE_NAME);
        return HwBatteryClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwBatteryClassifier} proxy from a {@link Classifier} stereotyped << HwBattery_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwBatteryClassifier} proxy or <i>null</i>.
     */
    @objid ("701c2873-7bc1-433f-85c6-f88a02d98e60")
    public static HwBatteryClassifier instantiate(final Classifier obj) {
        return HwBatteryClassifier.canInstantiate(obj) ? new HwBatteryClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBatteryClassifier} proxy from a {@link Classifier} stereotyped << HwBattery_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwBatteryClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("44519f69-7d8f-4d58-bd74-2dfd63319053")
    public static HwBatteryClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwBatteryClassifier.canInstantiate(obj))
        	return new HwBatteryClassifier(obj);
        else
        	throw new IllegalArgumentException("HwBatteryClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cf9f1a47-08cc-4762-9fd2-102eefac1dcc")
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
        HwBatteryClassifier other = (HwBatteryClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("0635e5fd-0adb-42cc-8af7-ba09d0d4c532")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwBattery_Classifier_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e0b62b69-1feb-4ff8-beed-ca65b94eb946")
    public String getHwBattery_Classifier_capacity() {
        return this.elt.getTagValue(HwBatteryClassifier.MdaTypes.HWBATTERY_CLASSIFIER_CAPACITY_TAGTYPE_ELT);
    }

    @objid ("c5e8c419-5f2c-4ffd-940b-20796940a463")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwBattery_Classifier_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e6a68c3d-dd60-49d8-bca6-8cccac87ce75")
    public void setHwBattery_Classifier_capacity(final String value) {
        this.elt.putTagValue(HwBatteryClassifier.MdaTypes.HWBATTERY_CLASSIFIER_CAPACITY_TAGTYPE_ELT, value);
    }

    @objid ("4a1a3d4d-2947-4605-86de-98b5a954b8fe")
    protected HwBatteryClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("0ec59dde-36b6-4c22-be81-55c1bbd89f9f")
    public static final class MdaTypes {
        @objid ("fe087184-f369-4234-9af5-157856d51432")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8586c8b2-4b27-443d-b63c-20aff7fea800")
        public static TagType HWBATTERY_CLASSIFIER_CAPACITY_TAGTYPE_ELT;

        @objid ("a6b15864-6a3c-4d38-8e48-c7191906f5a8")
        private static Stereotype MDAASSOCDEP;

        @objid ("4938035c-f56d-4d0f-90a6-5442f4ba7312")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e1a050d8-38c6-4f29-a68c-16f093d51eda")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "563acf1d-c7b2-11df-ad39-001302895b2b");
            HWBATTERY_CLASSIFIER_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "563acf28-c7b2-11df-ad39-001302895b2b");
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
