/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.StorageResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwMemory_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwMemoryLifeline extends StorageResourceLifeline {
    public static final String STEREOTYPE_NAME = "HwMemory_Lifeline";

    public static final String HWMEMORY_LIFELINE_ADRESSSIZE_TAGTYPE = "HwMemory_Lifeline_adressSize";

    public static final String HWMEMORY_LIFELINE_DESCRIPTION_TAGTYPE = "HwMemory_Lifeline_description";

    public static final String HWMEMORY_LIFELINE_ENDPOINTS_TAGTYPE = "HwMemory_Lifeline_endPoints";

    public static final String HWMEMORY_LIFELINE_FREQUENCY_TAGTYPE = "HwMemory_Lifeline_frequency";

    public static final String HWMEMORY_LIFELINE_MEMORYSIZE_TAGTYPE = "HwMemory_Lifeline_memorySize";

    public static final String HWMEMORY_LIFELINE_OWNEDHW_TAGTYPE = "HwMemory_Lifeline_ownedHW";

    public static final String HWMEMORY_LIFELINE_P_HW_SERVICES_TAGTYPE = "HwMemory_Lifeline_p_HW_Services";

    public static final String HWMEMORY_LIFELINE_R_HW_SERVICES_TAGTYPE = "HwMemory_Lifeline_r_HW_Services";

    public static final String HWMEMORY_LIFELINE_THROUGHPUT_TAGTYPE = "HwMemory_Lifeline_throughput";

    public static final String HWMEMORY_LIFELINE_TIMINGS_TAGTYPE = "HwMemory_Lifeline_timings";

    /**
     * Tells whether a {@link HwMemoryLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwMemory_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwMemory_Lifeline >> then instantiate a {@link HwMemoryLifeline} proxy.
     * 
     * @return a {@link HwMemoryLifeline} proxy on the created {@link Lifeline}.
     */
    public static HwMemoryLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryLifeline.STEREOTYPE_NAME);
        return HwMemoryLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwMemoryLifeline} proxy from a {@link Lifeline} stereotyped << HwMemory_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwMemoryLifeline} proxy or <i>null</i>.
     */
    public static HwMemoryLifeline instantiate(final Lifeline obj) {
        return HwMemoryLifeline.canInstantiate(obj) ? new HwMemoryLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMemoryLifeline} proxy from a {@link Lifeline} stereotyped << HwMemory_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwMemoryLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwMemoryLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwMemoryLifeline.canInstantiate(obj))
        	return new HwMemoryLifeline(obj);
        else
        	throw new IllegalArgumentException("HwMemoryLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwMemoryLifeline other = (HwMemoryLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwMemory_Lifeline_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Lifeline_adressSize() {
        return this.elt.getTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_ADRESSSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Lifeline_description() {
        return this.elt.getTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Lifeline_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Lifeline_endPoints() {
        return this.elt.getTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Lifeline_frequency() {
        return this.elt.getTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Lifeline_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Lifeline_memorySize() {
        return this.elt.getTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Lifeline_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Lifeline_ownedHW() {
        return this.elt.getTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Lifeline_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Lifeline_p_HW_Services() {
        return this.elt.getTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Lifeline_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Lifeline_r_HW_Services() {
        return this.elt.getTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Lifeline_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Lifeline_throughput() {
        return this.elt.getTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Lifeline_timings'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Lifeline_timings() {
        return this.elt.getTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_TIMINGS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwMemory_Lifeline_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Lifeline_adressSize(final String value) {
        this.elt.putTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_ADRESSSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Lifeline_description(final String value) {
        this.elt.putTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Lifeline_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Lifeline_endPoints(final List<String> values) {
        this.elt.putTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Lifeline_frequency(final String value) {
        this.elt.putTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Lifeline_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Lifeline_memorySize(final String value) {
        this.elt.putTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Lifeline_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Lifeline_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Lifeline_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Lifeline_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Lifeline_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Lifeline_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Lifeline_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Lifeline_throughput(final String value) {
        this.elt.putTagValue(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Lifeline_timings'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Lifeline_timings(final List<String> values) {
        this.elt.putTagValues(HwMemoryLifeline.MdaTypes.HWMEMORY_LIFELINE_TIMINGS_TAGTYPE_ELT, values);
    }

    protected HwMemoryLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMEMORY_LIFELINE_MEMORYSIZE_TAGTYPE_ELT;

        public static TagType HWMEMORY_LIFELINE_ADRESSSIZE_TAGTYPE_ELT;

        public static TagType HWMEMORY_LIFELINE_TIMINGS_TAGTYPE_ELT;

        public static TagType HWMEMORY_LIFELINE_THROUGHPUT_TAGTYPE_ELT;

        public static TagType HWMEMORY_LIFELINE_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWMEMORY_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWMEMORY_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWMEMORY_LIFELINE_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWMEMORY_LIFELINE_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWMEMORY_LIFELINE_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e6d65fc3-1004-11df-86fe-0014222a9f79");
            HWMEMORY_LIFELINE_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "04c2e8fc-1005-11df-86fe-0014222a9f79");
            HWMEMORY_LIFELINE_ADRESSSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "04c2e8fd-1005-11df-86fe-0014222a9f79");
            HWMEMORY_LIFELINE_TIMINGS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "04c2e8fe-1005-11df-86fe-0014222a9f79");
            HWMEMORY_LIFELINE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "04c2e8ff-1005-11df-86fe-0014222a9f79");
            HWMEMORY_LIFELINE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b4d97ed6-162d-11df-b9be-0014222a9f79");
            HWMEMORY_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b4d97ed7-162d-11df-b9be-0014222a9f79");
            HWMEMORY_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b4d97ed8-162d-11df-b9be-0014222a9f79");
            HWMEMORY_LIFELINE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b4d97ed9-162d-11df-b9be-0014222a9f79");
            HWMEMORY_LIFELINE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b4d97eda-162d-11df-b9be-0014222a9f79");
            HWMEMORY_LIFELINE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "08c7ef91-170f-11df-b92a-0014222a9f79");
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
