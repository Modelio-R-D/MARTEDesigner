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
public class HwTimingResourceClassifier extends TimingResourceClassifier {
    public static final String STEREOTYPE_NAME = "HwTimingResource_Classifier";

    public static final String HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE = "HwTimingResource_Classifier_description";

    public static final String HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE = "HwTimingResource_Classifier_endPoints";

    public static final String HWTIMINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE = "HwTimingResource_Classifier_frequency";

    public static final String HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE = "HwTimingResource_Classifier_ownedHW";

    public static final String HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE = "HwTimingResource_Classifier_p_HW_Services";

    public static final String HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE = "HwTimingResource_Classifier_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwTimingResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwTimingResource_Classifier >> then instantiate a {@link HwTimingResourceClassifier} proxy.
     * 
     * @return a {@link HwTimingResourceClassifier} proxy on the created {@link Classifier}.
     */
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
    public static HwTimingResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwTimingResourceClassifier.canInstantiate(obj))
        	return new HwTimingResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwTimingResource_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwTimingResource_Classifier_description() {
        return this.elt.getTagValue(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Classifier_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Classifier_endPoints() {
        return this.elt.getTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwTimingResource_Classifier_frequency() {
        return this.elt.getTagValue(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Classifier_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Classifier_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Classifier_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Classifier_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Classifier_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Classifier_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Classifier_description(final String value) {
        this.elt.putTagValue(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Classifier_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Classifier_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Classifier_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Classifier_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Classifier_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Classifier_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Classifier_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Classifier_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Classifier_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwTimingResourceClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
