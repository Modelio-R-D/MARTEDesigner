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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.classifier.HwComponentClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwPowerSupply_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e243fc55-5a39-4586-8158-28150be72660")
public class HwPowerSupplyClassifier extends HwComponentClassifier {
    @objid ("90788d23-4a05-42b1-a122-c2385a1a7272")
    public static final String STEREOTYPE_NAME = "HwPowerSupply_Classifier";

    @objid ("8ac726e4-0838-4113-bd01-71ae78ed2b31")
    public static final String HWPOWERSUPPLY_CLASSIFIER_CAPACITY_TAGTYPE = "HwPowerSupply_Classifier_capacity";

    @objid ("173befb4-eae7-4a79-8f32-f2d60bfc5ab0")
    public static final String HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER_TAGTYPE = "HwPowerSupply_Classifier_suppliedPower";

    /**
     * Tells whether a {@link HwPowerSupplyClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwPowerSupply_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("43f39714-1874-45e8-aedf-18b7fc31dcf4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwPowerSupply_Classifier >> then instantiate a {@link HwPowerSupplyClassifier} proxy.
     * 
     * @return a {@link HwPowerSupplyClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("8bdddcbb-336c-44ac-9bff-d7b67e7f72a7")
    public static HwPowerSupplyClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyClassifier.STEREOTYPE_NAME);
        return HwPowerSupplyClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyClassifier} proxy from a {@link Classifier} stereotyped << HwPowerSupply_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwPowerSupplyClassifier} proxy or <i>null</i>.
     */
    @objid ("eda70b2d-b5cb-4dd5-bf4b-de11e5dbd03a")
    public static HwPowerSupplyClassifier instantiate(final Classifier obj) {
        return HwPowerSupplyClassifier.canInstantiate(obj) ? new HwPowerSupplyClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyClassifier} proxy from a {@link Classifier} stereotyped << HwPowerSupply_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwPowerSupplyClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f78470a4-3d7b-4d7c-87e9-8e4b2f3c5450")
    public static HwPowerSupplyClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwPowerSupplyClassifier.canInstantiate(obj))
        	return new HwPowerSupplyClassifier(obj);
        else
        	throw new IllegalArgumentException("HwPowerSupplyClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("19aa8bb0-1058-46fb-88bf-4296ef31edf2")
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
        HwPowerSupplyClassifier other = (HwPowerSupplyClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("983906e7-fa6c-4837-a0ec-224aeb71dc67")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwPowerSupply_Classifier_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2bac88af-b4c1-4f58-b1ee-69bf8c2a9c0b")
    public String getHwPowerSupply_Classifier_capacity() {
        return this.elt.getTagValue(HwPowerSupplyClassifier.MdaTypes.HWPOWERSUPPLY_CLASSIFIER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPowerSupply_Classifier_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14b0065b-e02d-4ddd-af7a-65a2112450f7")
    public String getHwPowerSupply_Classifier_suppliedPower() {
        return this.elt.getTagValue(HwPowerSupplyClassifier.MdaTypes.HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER_TAGTYPE_ELT);
    }

    @objid ("01e6c581-fe89-460f-a1fe-f5c87ed1b6f7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwPowerSupply_Classifier_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("33e40bcb-4a2b-40e8-aabc-149b26f8f343")
    public void setHwPowerSupply_Classifier_capacity(final String value) {
        this.elt.putTagValue(HwPowerSupplyClassifier.MdaTypes.HWPOWERSUPPLY_CLASSIFIER_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPowerSupply_Classifier_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e4acaeee-59fd-4e1b-a998-6af92bf7e048")
    public void setHwPowerSupply_Classifier_suppliedPower(final String value) {
        this.elt.putTagValue(HwPowerSupplyClassifier.MdaTypes.HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER_TAGTYPE_ELT, value);
    }

    @objid ("ee2fcfd7-9425-493a-90c8-77fcb5a63d79")
    protected HwPowerSupplyClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("a6aa6337-14a4-493b-bca1-601d141f77c9")
    public static final class MdaTypes {
        @objid ("6b6625bb-b749-462b-973b-3e6064ddb113")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f31f4004-cc82-4434-bc5a-749b773cead2")
        public static TagType HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER_TAGTYPE_ELT;

        @objid ("46d77d40-ea07-4042-a901-f9fb4cd1af19")
        public static TagType HWPOWERSUPPLY_CLASSIFIER_CAPACITY_TAGTYPE_ELT;

        @objid ("6059f009-782c-45a4-ad26-ece10c44a2e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("a0a65d18-965f-46d0-90fb-c53b1013cf86")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c2760ea0-5e3a-4a1b-9a03-96aaff70badd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c11cfb2f-10bd-11df-81d9-0014222a9f79");
            HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c11cfb31-10bd-11df-81d9-0014222a9f79");
            HWPOWERSUPPLY_CLASSIFIER_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c11cfb30-10bd-11df-81d9-0014222a9f79");
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
