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
 * Proxy class to handle a {@link Classifier} with << HwCoolingSupply_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f8fa326d-a38d-4a88-9191-a464043b06d8")
public class HwCoolingSupplyClassifier extends HwComponentClassifier {
    @objid ("42e41172-5ece-43c5-b056-6e2b4eccd3e9")
    public static final String STEREOTYPE_NAME = "HwCoolingSupply_Classifier";

    @objid ("f4782193-f8ed-4b47-a83f-609242ddf033")
    public static final String HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER_TAGTYPE = "HwCoolingSupply_Classifier_coolingPower";

    /**
     * Tells whether a {@link HwCoolingSupplyClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwCoolingSupply_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0fc5194a-1b5a-45b3-8f10-b3dfbafdb496")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwCoolingSupply_Classifier >> then instantiate a {@link HwCoolingSupplyClassifier} proxy.
     * 
     * @return a {@link HwCoolingSupplyClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("78445319-8df4-42a4-9d43-b81c0be3e15b")
    public static HwCoolingSupplyClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyClassifier.STEREOTYPE_NAME);
        return HwCoolingSupplyClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyClassifier} proxy from a {@link Classifier} stereotyped << HwCoolingSupply_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwCoolingSupplyClassifier} proxy or <i>null</i>.
     */
    @objid ("a9cd990a-09ec-4e11-895f-19d16f69a42d")
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
    @objid ("5f65759e-f499-44a6-b711-42b3103e2039")
    public static HwCoolingSupplyClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwCoolingSupplyClassifier.canInstantiate(obj))
        	return new HwCoolingSupplyClassifier(obj);
        else
        	throw new IllegalArgumentException("HwCoolingSupplyClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("211b33be-e393-4ad9-8ae5-8c64375493c7")
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
    @objid ("1844526d-099d-43c0-83c0-f0f76428a28d")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwCoolingSupply_Classifier_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1acd475-0649-48d8-951b-3044f8779e66")
    public String getHwCoolingSupply_Classifier_coolingPower() {
        return this.elt.getTagValue(HwCoolingSupplyClassifier.MdaTypes.HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER_TAGTYPE_ELT);
    }

    @objid ("385f486d-65c4-4301-a15d-1cbf02476991")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCoolingSupply_Classifier_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7927d968-14f4-4c83-9f85-b77c55fa0fb7")
    public void setHwCoolingSupply_Classifier_coolingPower(final String value) {
        this.elt.putTagValue(HwCoolingSupplyClassifier.MdaTypes.HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER_TAGTYPE_ELT, value);
    }

    @objid ("5f8add82-5983-4933-94c8-43e0c3d3f1d7")
    protected HwCoolingSupplyClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("6968b736-0356-47a9-8295-c61fb2ccd393")
    public static final class MdaTypes {
        @objid ("d8095504-0fe4-4d19-9795-6bbf73b0299f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f78112d1-6bc7-45a6-a263-08f4abc0ef91")
        public static TagType HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER_TAGTYPE_ELT;

        @objid ("58f07717-9a11-4b64-b70e-6243cc0b3051")
        private static Stereotype MDAASSOCDEP;

        @objid ("303d4007-91c4-4575-b6aa-e904ddc7fd01")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6b950a4a-e2e3-48e8-9964-9edf5600d474")
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
