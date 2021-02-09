/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ComputingResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwComputingResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwComputingResourceLifeline extends ComputingResourceLifeline {
    public static final String STEREOTYPE_NAME = "HwComputingResource_Lifeline";

    public static final String HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE = "HwComputingResource_Lifeline_description";

    public static final String HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE = "HwComputingResource_Lifeline_endPoints";

    public static final String HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE = "HwComputingResource_Lifeline_frequency";

    public static final String HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_Lifeline_op_Frequencies";

    public static final String HWCOMPUTINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE = "HwComputingResource_Lifeline_ownedHW";

    public static final String HWCOMPUTINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE = "HwComputingResource_Lifeline_p_HW_Services";

    public static final String HWCOMPUTINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE = "HwComputingResource_Lifeline_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwComputingResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwComputingResource_Lifeline >> then instantiate a {@link HwComputingResourceLifeline} proxy.
     * 
     * @return a {@link HwComputingResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static HwComputingResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceLifeline.STEREOTYPE_NAME);
        return HwComputingResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceLifeline} proxy from a {@link Lifeline} stereotyped << HwComputingResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwComputingResourceLifeline} proxy or <i>null</i>.
     */
    public static HwComputingResourceLifeline instantiate(final Lifeline obj) {
        return HwComputingResourceLifeline.canInstantiate(obj) ? new HwComputingResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceLifeline} proxy from a {@link Lifeline} stereotyped << HwComputingResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwComputingResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwComputingResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwComputingResourceLifeline.canInstantiate(obj))
        	return new HwComputingResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwComputingResourceLifeline other = (HwComputingResourceLifeline) obj;
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
     * Getter for string property 'HwComputingResource_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComputingResource_Lifeline_description() {
        return this.elt.getTagValue(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Lifeline_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Lifeline_endPoints() {
        return this.elt.getTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComputingResource_Lifeline_frequency() {
        return this.elt.getTagValue(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Lifeline_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComputingResource_Lifeline_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Lifeline_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Lifeline_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Lifeline_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Lifeline_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Lifeline_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Lifeline_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Lifeline_description(final String value) {
        this.elt.putTagValue(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Lifeline_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Lifeline_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Lifeline_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_Lifeline_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Lifeline_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Lifeline_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Lifeline_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Lifeline_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Lifeline_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Lifeline_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Lifeline_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwComputingResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6eba8626-10a4-11df-81d9-0014222a9f79");
            HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6eba8627-10a4-11df-81d9-0014222a9f79");
            HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "492d89cb-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "492d89cc-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "492d89cd-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "492d89ce-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "492d89cf-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "492d89d0-1623-11df-b9be-0014222a9f79");
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
