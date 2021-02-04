/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.TimingResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwTimingResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("507d5411-edba-41cc-815d-8613f0da0d21")
public class HwTimingResourceClassifier extends TimingResourceClassifier {
    @objid ("bad1ff33-6059-4601-a64b-c08bc3980a12")
    public static final String STEREOTYPE_NAME = "HwTimingResource_Classifier";

    @objid ("93d47c31-8c77-42bb-8e84-27a0bb257346")
    public static final String HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE = "HwTimingResource_Classifier_description";

    @objid ("003c40bd-dd9e-4c8b-af1c-e12942feaf6f")
    public static final String HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE = "HwTimingResource_Classifier_endPoints";

    @objid ("93c999c5-61df-4f2e-b47f-c59b1ce542de")
    public static final String HWTIMINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE = "HwTimingResource_Classifier_frequency";

    @objid ("7d253b49-42bb-4718-9e16-98ff568df1b4")
    public static final String HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE = "HwTimingResource_Classifier_ownedHW";

    @objid ("434cb081-964e-4c53-b9ac-a1e650107164")
    public static final String HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE = "HwTimingResource_Classifier_p_HW_Services";

    @objid ("13d0389f-8b4e-4f29-b72f-b3d45bad5cf5")
    public static final String HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE = "HwTimingResource_Classifier_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwTimingResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9a2f59de-5e93-4219-ac33-6d7b0c4d6c19")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwTimingResource_Classifier >> then instantiate a {@link HwTimingResourceClassifier} proxy.
     * 
     * @return a {@link HwTimingResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("9e4c86d0-1db0-422a-bde0-38835e56d350")
    public static HwTimingResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceClassifier.STEREOTYPE_NAME);
        return HwTimingResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceClassifier} proxy from a {@link Classifier} stereotyped << HwTimingResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwTimingResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("639d474c-5390-46ca-afe8-9663fddc29ab")
    public static HwTimingResourceClassifier instantiate(final Classifier obj) {
        return HwTimingResourceClassifier.canInstantiate(obj) ? new HwTimingResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceClassifier} proxy from a {@link Classifier} stereotyped << HwTimingResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwTimingResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("29418a04-139e-4cdb-a0be-34890f16be0e")
    public static HwTimingResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwTimingResourceClassifier.canInstantiate(obj))
        	return new HwTimingResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6885a9c6-186f-44df-b771-96d8ff18ee48")
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
        HwTimingResourceClassifier other = (HwTimingResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("86cac39e-cc82-4124-9dc9-73ed3dae0262")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwTimingResource_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9fdf4a98-b27f-48e5-94ff-18866fd4dce5")
    public String getHwTimingResource_Classifier_description() {
        return this.elt.getTagValue(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Classifier_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c564e396-98e8-4eac-84c6-c25761584a54")
    public List<String> getHwTimingResource_Classifier_endPoints() {
        return this.elt.getTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("883ff967-297a-4dea-8527-f26a46f01ec5")
    public String getHwTimingResource_Classifier_frequency() {
        return this.elt.getTagValue(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Classifier_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9ec8fd8f-5e7c-4920-b47a-035d862becbb")
    public List<String> getHwTimingResource_Classifier_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Classifier_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2b821178-7952-469f-b0a5-625bc9b8a6f3")
    public List<String> getHwTimingResource_Classifier_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Classifier_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("47ffcdd3-c4c0-488d-9dec-583d54b971dd")
    public List<String> getHwTimingResource_Classifier_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("03f664a9-b121-44ec-8de5-5ac06f58a1cd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("13267b7c-e004-4022-9b97-328d5f0266f6")
    public void setHwTimingResource_Classifier_description(final String value) {
        this.elt.putTagValue(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Classifier_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6cf82c0e-5ea2-4351-ae66-72edfd7d9e36")
    public void setHwTimingResource_Classifier_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("757d96e3-f238-4d25-846a-33f6cba3b04a")
    public void setHwTimingResource_Classifier_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Classifier_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9f2cecdc-e197-4b0e-80c9-7b897dfad1a0")
    public void setHwTimingResource_Classifier_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Classifier_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3bcd7ce-8ff5-4c6f-8e60-804d758a4d20")
    public void setHwTimingResource_Classifier_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Classifier_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0f741bd4-719e-4eee-ba98-039d9087983b")
    public void setHwTimingResource_Classifier_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("e6f6f599-f6e6-4ce5-8f94-470df9abb428")
    protected HwTimingResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("ce9eb92d-6782-47a0-ba87-9ba96dd315ae")
    public static final class MdaTypes {
        @objid ("d66a402b-1fe7-4380-9cf4-1db9d6e9c314")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("52b6c8ae-f91c-442b-a190-0b426f8bb49c")
        public static TagType HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("68a808c5-f8bf-433e-874e-4280634e8aff")
        public static TagType HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("7f8964e1-2ec4-4809-af40-ea5b4a1ce063")
        public static TagType HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("f6f4b572-243c-44bc-b639-87d903f6bb2b")
        public static TagType HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT;

        @objid ("aa6a2a49-15b0-4675-8496-b57813e6b618")
        public static TagType HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT;

        @objid ("b14e78f8-8765-4baa-95ff-bac15770eb8f")
        public static TagType HWTIMINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT;

        @objid ("d45a86e2-de62-4d95-bb06-875ed0e51c7f")
        private static Stereotype MDAASSOCDEP;

        @objid ("a6a01221-f396-4105-8cd4-fa36cdc230f5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6d06803a-5531-41ca-8462-aa264f9e03b4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8a99d40d-10ae-11df-81d9-0014222a9f79");
            HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4277759b-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4277759c-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4277759d-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4277759e-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bf113d9a-1709-11df-b92a-0014222a9f79");
            HWTIMINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6c37a3f3-8dfb-11e0-8741-0027103f347c");
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
