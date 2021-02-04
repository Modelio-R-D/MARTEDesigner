/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.CommunicationEndPointClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwEndPoint_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("174d2766-f4f5-464e-bc46-ac52a0f718c4")
public class HwEndPointClassifier extends CommunicationEndPointClassifier {
    @objid ("0799304e-2e3d-4856-9e7e-c0a36bcf61f5")
    public static final String STEREOTYPE_NAME = "HwEndPoint_Classifier";

    @objid ("4c8e33a5-81cc-4a68-b8c3-db6a3952e630")
    public static final String HWENDPOINT_CLASSIFIER_CONNECTEDTO_TAGTYPE = "HwEndPoint_Classifier_connectedTo";

    @objid ("7fafd9a8-233a-4b0b-b4d7-81e23e0572cd")
    public static final String HWENDPOINT_CLASSIFIER_DESCRIPTION_TAGTYPE = "HwEndPoint_Classifier_description";

    @objid ("41690f12-bb01-4b2e-a711-154dd079a440")
    public static final String HWENDPOINT_CLASSIFIER_FREQUENCY_TAGTYPE = "HwEndPoint_Classifier_frequency";

    @objid ("90a7c03d-1428-4560-9364-279e409e3157")
    public static final String HWENDPOINT_CLASSIFIER_OWNEDHW_TAGTYPE = "HwEndPoint_Classifier_ownedHW";

    @objid ("1944a37c-3bf7-4fe0-bfa7-69a4e2e75843")
    public static final String HWENDPOINT_CLASSIFIER_P_HW_SERVICES_TAGTYPE = "HwEndPoint_Classifier_p_HW_Services";

    @objid ("2316d8c1-7a10-4ba8-9d67-a5f1679393ef")
    public static final String HWENDPOINT_CLASSIFIER_R_HW_SERVICES_TAGTYPE = "HwEndPoint_Classifier_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwEndPoint_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e7226296-dc9d-4c64-9f5f-093b5c7348af")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwEndPoint_Classifier >> then instantiate a {@link HwEndPointClassifier} proxy.
     * 
     * @return a {@link HwEndPointClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("1c3679a0-4b73-47b6-89b8-848a6107b20d")
    public static HwEndPointClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointClassifier.STEREOTYPE_NAME);
        return HwEndPointClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointClassifier} proxy from a {@link Classifier} stereotyped << HwEndPoint_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwEndPointClassifier} proxy or <i>null</i>.
     */
    @objid ("3b1d1a9a-c99e-42e7-9d18-c0d87497a69a")
    public static HwEndPointClassifier instantiate(final Classifier obj) {
        return HwEndPointClassifier.canInstantiate(obj) ? new HwEndPointClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwEndPointClassifier} proxy from a {@link Classifier} stereotyped << HwEndPoint_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwEndPointClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c15a23f1-a922-4360-ab48-871fb10148ad")
    public static HwEndPointClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwEndPointClassifier.canInstantiate(obj))
        	return new HwEndPointClassifier(obj);
        else
        	throw new IllegalArgumentException("HwEndPointClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("80981b6f-00b9-433a-ac9a-872c4e19b38d")
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
        HwEndPointClassifier other = (HwEndPointClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("2630e93c-6cdc-44b0-a711-46fc14a5a005")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Classifier_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fc33926d-5b36-4b84-af3b-347de6fdbc5b")
    public List<String> getHwEndPoint_Classifier_connectedTo() {
        return this.elt.getTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("58b8d22a-2048-4d00-994a-62ebd18495e0")
    public String getHwEndPoint_Classifier_description() {
        return this.elt.getTagValue(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a4d04201-5a66-4953-a01b-119372e5bf96")
    public String getHwEndPoint_Classifier_frequency() {
        return this.elt.getTagValue(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Classifier_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("429fc7e8-b855-43aa-9bd0-c28c6af870cf")
    public List<String> getHwEndPoint_Classifier_ownedHW() {
        return this.elt.getTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Classifier_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c2d2c228-8d4b-4a8f-9b2c-dfd42ff9f145")
    public List<String> getHwEndPoint_Classifier_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Classifier_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e3d9c7d9-4dee-4e00-a81e-98b905c8753e")
    public List<String> getHwEndPoint_Classifier_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("7294ede5-6e68-4b14-b7e5-bc7a8bb38c35")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Classifier_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90eb1da5-3e57-42ba-8e30-f0d9efc475df")
    public void setHwEndPoint_Classifier_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14c1b67c-2181-40af-a133-7f167528b6aa")
    public void setHwEndPoint_Classifier_description(final String value) {
        this.elt.putTagValue(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c60b4c4e-cb0b-4d08-8192-5f649e311bbd")
    public void setHwEndPoint_Classifier_frequency(final String value) {
        this.elt.putTagValue(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Classifier_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d17e4594-0692-4bfb-9c42-26bb4d142ac4")
    public void setHwEndPoint_Classifier_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Classifier_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4a0de4e5-7069-440f-9fc5-c109de46d901")
    public void setHwEndPoint_Classifier_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Classifier_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a07f053-92bb-4813-bea7-df73e9e49d3b")
    public void setHwEndPoint_Classifier_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("03d42d00-bd37-4a3d-b6a0-de1f88e5c848")
    protected HwEndPointClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("39916c6e-7ce0-4dd5-bea4-87c973f374ea")
    public static final class MdaTypes {
        @objid ("9ec729eb-e099-4db9-b214-dda6ee89119e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("952f7202-f519-433c-8bf1-8b154d4e4e88")
        public static TagType HWENDPOINT_CLASSIFIER_CONNECTEDTO_TAGTYPE_ELT;

        @objid ("8387bca9-47a1-43ed-9bfb-3566145f1f21")
        public static TagType HWENDPOINT_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("127d3d2a-8c2d-4933-b424-a710712a759f")
        public static TagType HWENDPOINT_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("e78e3489-02b9-4797-a687-63d4549c87b2")
        public static TagType HWENDPOINT_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("2ce18ba9-36af-4536-831c-f39b6af4092f")
        public static TagType HWENDPOINT_CLASSIFIER_OWNEDHW_TAGTYPE_ELT;

        @objid ("3f568198-d87b-433e-9615-f1d717423b90")
        public static TagType HWENDPOINT_CLASSIFIER_FREQUENCY_TAGTYPE_ELT;

        @objid ("82ba5e0f-12c0-474b-b8de-06fee1478c72")
        private static Stereotype MDAASSOCDEP;

        @objid ("be202f23-b569-4e1f-9373-719e1c7658ec")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1d77157d-b821-4751-9a86-7a0631d886f8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b35a9ebf-155d-11df-947b-001302895b2b");
            HWENDPOINT_CLASSIFIER_CONNECTEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e5264782-1726-11df-b92a-0014222a9f79");
            HWENDPOINT_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4baa8abe-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4baa8abf-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4baa8ac0-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_CLASSIFIER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4baab1cf-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_CLASSIFIER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4baab1d0-92a9-11e0-a69d-0027103f347c");
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
