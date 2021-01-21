/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("98901c54-2af1-472a-ad6c-cdca310a7798")
    public static final String STEREOTYPE_NAME = "HwEndPoint_Classifier";

    @objid ("2f48c326-a244-4e8a-8438-481782bb18da")
    public static final String HWENDPOINT_CLASSIFIER_CONNECTEDTO_TAGTYPE = "HwEndPoint_Classifier_connectedTo";

    @objid ("3e8ddccb-c639-40f6-8d68-c7ebc0bb06c2")
    public static final String HWENDPOINT_CLASSIFIER_DESCRIPTION_TAGTYPE = "HwEndPoint_Classifier_description";

    @objid ("f7cd9af8-422e-4dc8-8fc9-613d2524899c")
    public static final String HWENDPOINT_CLASSIFIER_FREQUENCY_TAGTYPE = "HwEndPoint_Classifier_frequency";

    @objid ("ebf6812e-c75d-490f-93bd-e186aae0de6f")
    public static final String HWENDPOINT_CLASSIFIER_OWNEDHW_TAGTYPE = "HwEndPoint_Classifier_ownedHW";

    @objid ("0c8fdbb8-981f-4589-b0ee-f386f99ddd5e")
    public static final String HWENDPOINT_CLASSIFIER_P_HW_SERVICES_TAGTYPE = "HwEndPoint_Classifier_p_HW_Services";

    @objid ("bef69a08-38d8-4000-a089-5e77b89ef89d")
    public static final String HWENDPOINT_CLASSIFIER_R_HW_SERVICES_TAGTYPE = "HwEndPoint_Classifier_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwEndPoint_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ac39ce50-81d5-460b-9150-ed3423e1f6ce")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwEndPoint_Classifier >> then instantiate a {@link HwEndPointClassifier} proxy.
     * 
     * @return a {@link HwEndPointClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("b8003c6a-804a-4e5e-90d6-1e5f3a05b1e5")
    public static HwEndPointClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointClassifier.STEREOTYPE_NAME);
        return HwEndPointClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointClassifier} proxy from a {@link Classifier} stereotyped << HwEndPoint_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwEndPointClassifier} proxy or <i>null</i>.
     */
    @objid ("8016aebe-c33a-4d7f-82b7-1ae35766fd38")
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
    @objid ("c7b665c1-110f-4817-8234-1f280c216f2d")
    public static HwEndPointClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwEndPointClassifier.canInstantiate(obj))
        	return new HwEndPointClassifier(obj);
        else
        	throw new IllegalArgumentException("HwEndPointClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7f84849a-dd55-4b1a-bc72-d81d1fb11728")
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
    @objid ("91bdd1ea-5ccc-4b12-be5d-e00af2e0c2b1")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Classifier_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2a066215-bd84-491d-b7c0-7cb5a33e3ed8")
    public List<String> getHwEndPoint_Classifier_connectedTo() {
        return this.elt.getTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5e8f8252-c566-443d-8e18-05f4127713cf")
    public String getHwEndPoint_Classifier_description() {
        return this.elt.getTagValue(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3adbc0dc-5fec-42a6-8e3c-cdd074b0d0d6")
    public String getHwEndPoint_Classifier_frequency() {
        return this.elt.getTagValue(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Classifier_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e27e2cfe-236c-4f22-9a6a-9cca6e8159e5")
    public List<String> getHwEndPoint_Classifier_ownedHW() {
        return this.elt.getTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Classifier_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("72b3014f-208b-4280-a85e-f1419e4e9979")
    public List<String> getHwEndPoint_Classifier_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Classifier_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a93fd5bb-2594-4b0f-9f3f-a456b85efa84")
    public List<String> getHwEndPoint_Classifier_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("34dc1a36-f289-4088-aff6-3e71fdea6ef0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Classifier_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c5927073-25e4-40bb-b5d3-e7bb2d8b162a")
    public void setHwEndPoint_Classifier_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5fc1c374-29ac-4584-9c65-5b640f240d0c")
    public void setHwEndPoint_Classifier_description(final String value) {
        this.elt.putTagValue(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea393511-54c8-4498-88e1-8a9157c78b2e")
    public void setHwEndPoint_Classifier_frequency(final String value) {
        this.elt.putTagValue(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Classifier_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c6508e8-d5f1-4246-a18a-e5f875af4a1f")
    public void setHwEndPoint_Classifier_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Classifier_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b112d30e-5f35-41ef-ac8d-e3f867e890a6")
    public void setHwEndPoint_Classifier_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Classifier_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2647b734-a53f-46df-a568-3baf01cbdfe2")
    public void setHwEndPoint_Classifier_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("19f6dc1a-13c4-4155-9fc0-01f1d9b51ba1")
    protected HwEndPointClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("39916c6e-7ce0-4dd5-bea4-87c973f374ea")
    public static final class MdaTypes {
        @objid ("92153eaf-e9fd-4229-b1aa-bd07f0ec49ec")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5f688514-bf3f-4dc3-b30f-d4c088a10609")
        public static TagType HWENDPOINT_CLASSIFIER_CONNECTEDTO_TAGTYPE_ELT;

        @objid ("89b1c076-2eb3-4763-82fc-be26f7af4901")
        public static TagType HWENDPOINT_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("a8841bad-4e92-4fa2-90d3-44f65a0b3b7d")
        public static TagType HWENDPOINT_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("c8de858a-dbc3-4f86-bff7-dd897ffae4a4")
        public static TagType HWENDPOINT_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("bc087e80-7d64-4d4c-88b5-86ead28d6dc5")
        public static TagType HWENDPOINT_CLASSIFIER_OWNEDHW_TAGTYPE_ELT;

        @objid ("f5f64fe3-e0a2-4ced-90bd-aed690af4ab4")
        public static TagType HWENDPOINT_CLASSIFIER_FREQUENCY_TAGTYPE_ELT;

        @objid ("840c8101-53ec-4788-b2e9-dedd1c1d282b")
        private static Stereotype MDAASSOCDEP;

        @objid ("0571491a-98b2-4bdb-a4de-2f75f5d587fe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4290a8b0-3043-42f8-aa8a-6bf2667176e5")
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
