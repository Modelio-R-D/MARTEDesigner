/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ComputingResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwComputingResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e3c66269-523b-4b55-84f2-f7148271c9b5")
public class HwComputingResourceClassifier extends ComputingResourceClassifier {
    @objid ("df4e89ec-c4ba-406d-a546-dc44e2039c1f")
    public static final String STEREOTYPE_NAME = "HwComputingResource_Classifier";

    @objid ("06982541-95ab-48f3-8d09-98170c17286e")
    public static final String HWCOMPUTINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE = "HwComputingResource_Classifier_description";

    @objid ("46bba4aa-e70b-43c8-9d43-ed3f6eea9ba3")
    public static final String HWCOMPUTINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE = "HwComputingResource_Classifier_endPoints";

    @objid ("d93c554e-969a-4521-9a61-1f9b38b97510")
    public static final String HWCOMPUTINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE = "HwComputingResource_Classifier_frequency";

    @objid ("f085518f-bedb-4fd0-b048-40f1f820ae60")
    public static final String HWCOMPUTINGRESOURCE_CLASSIFIER_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_Classifier_op_Frequencies";

    @objid ("10c43499-c575-44a2-aea4-3bc3f1eaa7dd")
    public static final String HWCOMPUTINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE = "HwComputingResource_Classifier_ownedHW";

    @objid ("9a980e37-3d1f-4409-8404-d65d0d795636")
    public static final String HWCOMPUTINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE = "HwComputingResource_Classifier_p_HW_Services";

    @objid ("2c3488c7-8343-411e-b022-791b82dedd7e")
    public static final String HWCOMPUTINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE = "HwComputingResource_Classifier_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwComputingResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7b8d276c-de01-4ddf-ae7e-7869f32eef10")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwComputingResource_Classifier >> then instantiate a {@link HwComputingResourceClassifier} proxy.
     * 
     * @return a {@link HwComputingResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("e259edda-3c50-4287-bf96-372bbcacc139")
    public static HwComputingResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceClassifier.STEREOTYPE_NAME);
        return HwComputingResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceClassifier} proxy from a {@link Classifier} stereotyped << HwComputingResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwComputingResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("cd798303-d2ac-45f5-91a8-363ecaa9c5d9")
    public static HwComputingResourceClassifier instantiate(final Classifier obj) {
        return HwComputingResourceClassifier.canInstantiate(obj) ? new HwComputingResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceClassifier} proxy from a {@link Classifier} stereotyped << HwComputingResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwComputingResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1246c0fb-81b0-4f98-8000-73b07e5bf48a")
    public static HwComputingResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwComputingResourceClassifier.canInstantiate(obj))
        	return new HwComputingResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5bf93104-1f8d-422c-857b-7ebdac34ec09")
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
        HwComputingResourceClassifier other = (HwComputingResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("2d27793f-e5cc-474e-9847-36f9758a1614")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwComputingResource_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3e412560-597d-48d9-bd22-709c3dee375c")
    public String getHwComputingResource_Classifier_description() {
        return this.elt.getTagValue(HwComputingResourceClassifier.MdaTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Classifier_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0f989a2d-d171-4e45-bd4a-f7cb74866a4a")
    public List<String> getHwComputingResource_Classifier_endPoints() {
        return this.elt.getTagValues(HwComputingResourceClassifier.MdaTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("505dc30b-ea65-41cb-8841-a947f5432471")
    public String getHwComputingResource_Classifier_frequency() {
        return this.elt.getTagValue(HwComputingResourceClassifier.MdaTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Classifier_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bf31eb4c-a262-437f-ae0d-c459c6861a35")
    public String getHwComputingResource_Classifier_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceClassifier.MdaTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Classifier_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8750499a-1e58-4805-aee5-eefdbae9729d")
    public List<String> getHwComputingResource_Classifier_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceClassifier.MdaTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Classifier_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1eed5c73-2dcf-478c-9780-9d36300587ea")
    public List<String> getHwComputingResource_Classifier_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceClassifier.MdaTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Classifier_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("acad5ad7-8419-4a85-975e-ea7a07254537")
    public List<String> getHwComputingResource_Classifier_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceClassifier.MdaTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("b49b1db6-8088-4e28-99bb-9d82d149ac23")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4e43dc96-879b-41c3-9762-f3d3820a6ca6")
    public void setHwComputingResource_Classifier_description(final String value) {
        this.elt.putTagValue(HwComputingResourceClassifier.MdaTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Classifier_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f7aad42-096f-416f-9552-bf1d3454685f")
    public void setHwComputingResource_Classifier_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceClassifier.MdaTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1d06bf2a-f28c-41b7-99a0-2fae57b110aa")
    public void setHwComputingResource_Classifier_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceClassifier.MdaTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_Classifier_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f7e0e601-8849-4ce9-a55e-504f06a8a645")
    public void setHwComputingResource_Classifier_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceClassifier.MdaTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Classifier_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a6711dc5-34ce-49a0-a6f0-e4a43bdc0b0a")
    public void setHwComputingResource_Classifier_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceClassifier.MdaTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Classifier_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("95a6c18a-9b4d-4f63-b1cc-9288b101eaa4")
    public void setHwComputingResource_Classifier_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceClassifier.MdaTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Classifier_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3ea373c5-2eed-4f24-b836-5d8e291071ce")
    public void setHwComputingResource_Classifier_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceClassifier.MdaTypes.HWCOMPUTINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("7bc70f25-b88f-4610-9e9a-acb4bf395a19")
    protected HwComputingResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("1a9b452f-b8b9-4d53-8303-7a4440e100d8")
    public static final class MdaTypes {
        @objid ("3f3e6ff5-fe21-4e32-839a-6eef220a7156")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("af3b6301-2fff-41aa-a603-ef66cd1482eb")
        public static TagType HWCOMPUTINGRESOURCE_CLASSIFIER_OP_FREQUENCIES_TAGTYPE_ELT;

        @objid ("6c5ddf32-6448-4875-a417-0647a89d6460")
        public static TagType HWCOMPUTINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("6e7c6a8d-f0b2-40c7-accb-a5519d795087")
        public static TagType HWCOMPUTINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("89c653b1-6f7d-410a-8831-b55a24c2f990")
        public static TagType HWCOMPUTINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("8bd6a80d-2216-45f1-b983-2756bca78379")
        public static TagType HWCOMPUTINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT;

        @objid ("c508c053-5ccc-4e50-8f08-3043d0b936ab")
        public static TagType HWCOMPUTINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT;

        @objid ("42706bc0-b1f0-47b7-8b35-7afca1a84efa")
        public static TagType HWCOMPUTINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT;

        @objid ("9966c940-3f24-4918-9c2a-c9b56196f65c")
        private static Stereotype MDAASSOCDEP;

        @objid ("f0e2d561-cf36-48b0-8073-0a0aa00d1341")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4c3e18b0-4bca-4681-97b2-69c0e068cfc4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6f4c2f7f-10a4-11df-81d9-0014222a9f79");
            HWCOMPUTINGRESOURCE_CLASSIFIER_OP_FREQUENCIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6f4c2f80-10a4-11df-81d9-0014222a9f79");
            HWCOMPUTINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "38b0a33d-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "38b0a33e-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "38b0a33f-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "38b0a340-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "38b0a341-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "38b0a342-1623-11df-b9be-0014222a9f79");
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
