/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Classifier} with << HwCoolingSupply_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f8fa326d-a38d-4a88-9191-a464043b06d8")
public class HwCoolingSupplyClassifier extends HwComponentClassifier {
    @objid ("081a5e43-a84d-4d12-be02-938c63b7023c")
    public static final String STEREOTYPE_NAME = "HwCoolingSupply_Classifier";

    @objid ("552089bb-eaad-4e76-b7f8-2617a29ccc58")
    public static final String HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER_TAGTYPE = "HwCoolingSupply_Classifier_coolingPower";

    /**
     * Tells whether a {@link HwCoolingSupplyClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwCoolingSupply_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b8eb4096-34bc-41b3-ac82-f183151e9d6e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwCoolingSupply_Classifier >> then instantiate a {@link HwCoolingSupplyClassifier} proxy.
     * 
     * @return a {@link HwCoolingSupplyClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("e6cedb10-f65c-411e-9a16-c666aa624e29")
    public static HwCoolingSupplyClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyClassifier.STEREOTYPE_NAME);
        return HwCoolingSupplyClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyClassifier} proxy from a {@link Classifier} stereotyped << HwCoolingSupply_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwCoolingSupplyClassifier} proxy or <i>null</i>.
     */
    @objid ("020563d5-8fb0-4bf4-9722-09f0477b474c")
    public static HwCoolingSupplyClassifier instantiate(final Classifier obj) {
        return HwCoolingSupplyClassifier.canInstantiate(obj) ? new HwCoolingSupplyClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyClassifier} proxy from a {@link Classifier} stereotyped << HwCoolingSupply_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwCoolingSupplyClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("66b34cbb-9b77-4ee2-bce1-2d19dd782a7a")
    public static HwCoolingSupplyClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwCoolingSupplyClassifier.canInstantiate(obj))
        	return new HwCoolingSupplyClassifier(obj);
        else
        	throw new IllegalArgumentException("HwCoolingSupplyClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e66a5df4-3c50-403c-a754-ca8dc5d6b7a5")
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
        HwCoolingSupplyClassifier other = (HwCoolingSupplyClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("f8d744bf-9fc4-45e0-a86d-2517994945ea")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwCoolingSupply_Classifier_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da59b50d-2105-4176-9fe0-aee83e3eedc1")
    public String getHwCoolingSupply_Classifier_coolingPower() {
        return this.elt.getTagValue(HwCoolingSupplyClassifier.MdaTypes.HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER_TAGTYPE_ELT);
    }

    @objid ("6174f5bc-19bf-464a-9a82-100e4c6ba53d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCoolingSupply_Classifier_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1b381fe2-e27a-47c6-8bcb-72076d860d60")
    public void setHwCoolingSupply_Classifier_coolingPower(final String value) {
        this.elt.putTagValue(HwCoolingSupplyClassifier.MdaTypes.HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER_TAGTYPE_ELT, value);
    }

    @objid ("2453414b-212f-4b5f-a7b8-3dd122ca9d78")
    protected HwCoolingSupplyClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("6968b736-0356-47a9-8295-c61fb2ccd393")
    public static final class MdaTypes {
        @objid ("6c97acff-cefe-4079-a5f2-3d65552df7b4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f9c4fdc0-75e5-4e22-81d6-931860f54c04")
        public static TagType HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER_TAGTYPE_ELT;

        @objid ("25d15118-e788-4c26-a5ce-790fea856a27")
        private static Stereotype MDAASSOCDEP;

        @objid ("5a0f799f-032b-402e-b77e-9d37ed416f94")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ed2584e2-0fb6-49b5-a1fa-c4e7d88575f9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f32c24d3-10bd-11df-81d9-0014222a9f79");
            HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f32c24d4-10bd-11df-81d9-0014222a9f79");
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
