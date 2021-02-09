/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.StorageResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwMemory_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwMemoryClassifier extends StorageResourceClassifier {
    public static final String STEREOTYPE_NAME = "HwMemory_Classifier";

    public static final String HWMEMORY_CLASSIFIER_ADRESSSIZE_TAGTYPE = "HwMemory_Classifier_adressSize";

    public static final String HWMEMORY_CLASSIFIER_DESCRIPTION_TAGTYPE = "HwMemory_Classifier_description";

    public static final String HWMEMORY_CLASSIFIER_ENDPOINTS_TAGTYPE = "HwMemory_Classifier_endPoints";

    public static final String HWMEMORY_CLASSIFIER_FREQUENCY_TAGTYPE = "HwMemory_Classifier_frequency";

    public static final String HWMEMORY_CLASSIFIER_MEMORYSIZE_TAGTYPE = "HwMemory_Classifier_memorySize";

    public static final String HWMEMORY_CLASSIFIER_OWNEDHW_TAGTYPE = "HwMemory_Classifier_ownedHW";

    public static final String HWMEMORY_CLASSIFIER_P_HW_SERVICES_TAGTYPE = "HwMemory_Classifier_p_HW_Services";

    public static final String HWMEMORY_CLASSIFIER_R_HW_SERVICES_TAGTYPE = "HwMemory_Classifier_r_HW_Services";

    public static final String HWMEMORY_CLASSIFIER_THROUGHPUT_TAGTYPE = "HwMemory_Classifier_throughput";

    public static final String HWMEMORY_CLASSIFIER_TIMINGS_TAGTYPE = "HwMemory_Classifier_timings";

    /**
     * Tells whether a {@link HwMemoryClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwMemory_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwMemory_Classifier >> then instantiate a {@link HwMemoryClassifier} proxy.
     * 
     * @return a {@link HwMemoryClassifier} proxy on the created {@link Classifier}.
     */
    public static HwMemoryClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryClassifier.STEREOTYPE_NAME);
        return HwMemoryClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwMemoryClassifier} proxy from a {@link Classifier} stereotyped << HwMemory_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwMemoryClassifier} proxy or <i>null</i>.
     */
    public static HwMemoryClassifier instantiate(final Classifier obj) {
        return HwMemoryClassifier.canInstantiate(obj) ? new HwMemoryClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMemoryClassifier} proxy from a {@link Classifier} stereotyped << HwMemory_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwMemoryClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwMemoryClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwMemoryClassifier.canInstantiate(obj))
        	return new HwMemoryClassifier(obj);
        else
        	throw new IllegalArgumentException("HwMemoryClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwMemoryClassifier other = (HwMemoryClassifier) obj;
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
     * Getter for string property 'HwMemory_Classifier_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Classifier_adressSize() {
        return this.elt.getTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_ADRESSSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Classifier_description() {
        return this.elt.getTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Classifier_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Classifier_endPoints() {
        return this.elt.getTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Classifier_frequency() {
        return this.elt.getTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Classifier_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Classifier_memorySize() {
        return this.elt.getTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Classifier_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Classifier_ownedHW() {
        return this.elt.getTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Classifier_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Classifier_p_HW_Services() {
        return this.elt.getTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Classifier_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Classifier_r_HW_Services() {
        return this.elt.getTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Classifier_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Classifier_throughput() {
        return this.elt.getTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Classifier_timings'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Classifier_timings() {
        return this.elt.getTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_TIMINGS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwMemory_Classifier_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Classifier_adressSize(final String value) {
        this.elt.putTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_ADRESSSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Classifier_description(final String value) {
        this.elt.putTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Classifier_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Classifier_endPoints(final List<String> values) {
        this.elt.putTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Classifier_frequency(final String value) {
        this.elt.putTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Classifier_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Classifier_memorySize(final String value) {
        this.elt.putTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Classifier_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Classifier_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Classifier_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Classifier_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Classifier_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Classifier_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Classifier_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Classifier_throughput(final String value) {
        this.elt.putTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Classifier_timings'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Classifier_timings(final List<String> values) {
        this.elt.putTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_TIMINGS_TAGTYPE_ELT, values);
    }

    protected HwMemoryClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMEMORY_CLASSIFIER_MEMORYSIZE_TAGTYPE_ELT;

        public static TagType HWMEMORY_CLASSIFIER_ADRESSSIZE_TAGTYPE_ELT;

        public static TagType HWMEMORY_CLASSIFIER_TIMINGS_TAGTYPE_ELT;

        public static TagType HWMEMORY_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT;

        public static TagType HWMEMORY_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWMEMORY_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWMEMORY_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWMEMORY_CLASSIFIER_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWMEMORY_CLASSIFIER_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWMEMORY_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f46f5a27-1004-11df-86fe-0014222a9f79");
            HWMEMORY_CLASSIFIER_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "065cff78-1005-11df-86fe-0014222a9f79");
            HWMEMORY_CLASSIFIER_ADRESSSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "065cff79-1005-11df-86fe-0014222a9f79");
            HWMEMORY_CLASSIFIER_TIMINGS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "065cff7a-1005-11df-86fe-0014222a9f79");
            HWMEMORY_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "065cff7b-1005-11df-86fe-0014222a9f79");
            HWMEMORY_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b7c15ef6-162d-11df-b9be-0014222a9f79");
            HWMEMORY_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b7c15ef7-162d-11df-b9be-0014222a9f79");
            HWMEMORY_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b7c15ef8-162d-11df-b9be-0014222a9f79");
            HWMEMORY_CLASSIFIER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b7c15ef9-162d-11df-b9be-0014222a9f79");
            HWMEMORY_CLASSIFIER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b7c15efa-162d-11df-b9be-0014222a9f79");
            HWMEMORY_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0bdaba29-170f-11df-b92a-0014222a9f79");
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
