/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("630b0429-bc50-4701-90fa-0d67ec455cd0")
public class HwResourceClassifier extends ResourceClassifier {
    @objid ("d3904bf6-04e6-4654-b30c-eea416712474")
    public static final String STEREOTYPE_NAME = "HwResource_Classifier";

    @objid ("1bede8ef-af6b-44f6-8f76-03fd5c07b6b7")
    public static final String HWRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE = "HwResource_Classifier_description";

    @objid ("6b36e307-da8f-42d4-97b3-477b5fc5ed9b")
    public static final String HWRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE = "HwResource_Classifier_endPoints";

    @objid ("22ebc458-d3bd-4a34-9e3b-e9c96cf2569d")
    public static final String HWRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE = "HwResource_Classifier_frequency";

    @objid ("a7cd400d-34ce-4ac5-98e5-57d15fea20c3")
    public static final String HWRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE = "HwResource_Classifier_ownedHW";

    @objid ("b346eda6-67c1-491e-807e-0dc01e7a0660")
    public static final String HWRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE = "HwResource_Classifier_p_HW_Services";

    @objid ("effd5736-57e5-41df-9816-d2940df57355")
    public static final String HWRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE = "HwResource_Classifier_r_HW_Services";

    /**
     * Tells whether a {@link HwResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1594280c-7d8c-457d-a64b-bf5e2e3d101d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwResource_Classifier >> then instantiate a {@link HwResourceClassifier} proxy.
     * 
     * @return a {@link HwResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("07d94f32-4c84-4edc-806a-46a8c7990edf")
    public static HwResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceClassifier.STEREOTYPE_NAME);
        return HwResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceClassifier} proxy from a {@link Classifier} stereotyped << HwResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("ea21b685-cdca-4739-92f1-6886d774a840")
    public static HwResourceClassifier instantiate(final Classifier obj) {
        return HwResourceClassifier.canInstantiate(obj) ? new HwResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceClassifier} proxy from a {@link Classifier} stereotyped << HwResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("89a44b1c-040d-4614-a457-a4b24df9cdda")
    public static HwResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwResourceClassifier.canInstantiate(obj))
        	return new HwResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("HwResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("370b6bfb-f51e-4bc3-8925-0fed33bb4e4d")
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
        HwResourceClassifier other = (HwResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("4ef6e09c-c1e4-4554-8a68-15e38685b72e")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwResource_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b38041bc-cd7a-41f2-9943-219b48fb9893")
    public String getHwResource_Classifier_description() {
        return this.elt.getTagValue(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Classifier_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("092c21ee-b574-4981-a2db-b29f12941ead")
    public List<String> getHwResource_Classifier_endPoints() {
        return this.elt.getTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResource_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c084fe43-c90b-4f78-a0ed-54c506f09538")
    public String getHwResource_Classifier_frequency() {
        return this.elt.getTagValue(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Classifier_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1bb33301-f9dd-4a4e-a59d-f53ef6e39497")
    public List<String> getHwResource_Classifier_ownedHW() {
        return this.elt.getTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Classifier_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("51ef0489-f059-405b-8527-03a52aa619ff")
    public List<String> getHwResource_Classifier_p_HW_Services() {
        return this.elt.getTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Classifier_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8dff369a-748b-438b-a40e-c7d2f01c855f")
    public List<String> getHwResource_Classifier_r_HW_Services() {
        return this.elt.getTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("1b09d4fc-9391-4a84-8ef2-94744d823d4a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResource_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b3bd7748-d5e6-48d6-b31f-2851cccf6ba4")
    public void setHwResource_Classifier_description(final String value) {
        this.elt.putTagValue(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Classifier_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b1997ea-58dd-405c-b01e-c50dd4228196")
    public void setHwResource_Classifier_endPoints(final List<String> values) {
        this.elt.putTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwResource_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("97a0309c-44bb-40d2-99c8-a865c6b6b8dd")
    public void setHwResource_Classifier_frequency(final String value) {
        this.elt.putTagValue(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Classifier_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5a7c65d1-68f1-44a7-89b6-7d81ce8b9203")
    public void setHwResource_Classifier_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Classifier_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("06d8f0ab-80fb-4deb-b148-bfaddbf23ec7")
    public void setHwResource_Classifier_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Classifier_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("08a5456e-a520-44e4-8055-f764d485f782")
    public void setHwResource_Classifier_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("afc642fc-452f-43db-9d5d-e97b3e314baf")
    protected HwResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("3a568f6c-ca6a-4cd2-9c90-c1adc0afe05a")
    public static final class MdaTypes {
        @objid ("7a18787f-e1ef-4d8c-828e-f6e76a92098a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4bc3222a-29fa-4af1-8e1c-8843db37c060")
        public static TagType HWRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("e576f7af-c43e-4a1e-bf30-423101bd8461")
        public static TagType HWRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("911d06fa-2bd8-4a2b-a5e1-82b609b5aec7")
        public static TagType HWRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("d11e5093-cbc6-4331-818c-c1512a0e779b")
        public static TagType HWRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT;

        @objid ("74072ea0-7e50-4d0b-8e6c-d3d939466403")
        public static TagType HWRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT;

        @objid ("55d9c2a0-075e-4a12-832a-e405feddc74f")
        public static TagType HWRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT;

        @objid ("b4979187-677a-48a4-bf93-e0fd91c91919")
        private static Stereotype MDAASSOCDEP;

        @objid ("c220eef3-435c-4ae3-a3dc-58ec7f7e5e7a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b8eba7be-9091-491f-9b79-3df29809983b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5b789d55-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "735283b2-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "735283b3-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "735283b4-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "735283af-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "735283b1-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "329925ed-1709-11df-b92a-0014222a9f79");
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
