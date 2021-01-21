/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("37b3b65d-c48e-43af-a294-dda7afbd1689")
public class HwComputingResourceLifeline extends ComputingResourceLifeline {
    @objid ("153c1869-5d73-406a-8100-7c4513016aa6")
    public static final String STEREOTYPE_NAME = "HwComputingResource_Lifeline";

    @objid ("22b0d135-74c6-4c60-bbab-61415f49a371")
    public static final String HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE = "HwComputingResource_Lifeline_description";

    @objid ("c4f0ce2f-cc1d-4cea-a7de-736c54ed9e25")
    public static final String HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE = "HwComputingResource_Lifeline_endPoints";

    @objid ("5dd37d57-f9c6-4c93-a07c-9f6a8d1507dd")
    public static final String HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE = "HwComputingResource_Lifeline_frequency";

    @objid ("527a663d-aa62-4987-b1f9-c9cfe83bc6a1")
    public static final String HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_Lifeline_op_Frequencies";

    @objid ("246d46ce-d518-4b41-80bd-6ea7571930bf")
    public static final String HWCOMPUTINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE = "HwComputingResource_Lifeline_ownedHW";

    @objid ("a384f008-f251-44b5-8561-e6ab1524c544")
    public static final String HWCOMPUTINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE = "HwComputingResource_Lifeline_p_HW_Services";

    @objid ("af1d2833-0346-4f14-b237-62f9e72c51f0")
    public static final String HWCOMPUTINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE = "HwComputingResource_Lifeline_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwComputingResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2975b67a-75b2-4064-bfd6-dfebaf22143e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwComputingResource_Lifeline >> then instantiate a {@link HwComputingResourceLifeline} proxy.
     * 
     * @return a {@link HwComputingResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("73afe7dd-ef98-466d-9bea-0ab1f7156ac2")
    public static HwComputingResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceLifeline.STEREOTYPE_NAME);
        return HwComputingResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceLifeline} proxy from a {@link Lifeline} stereotyped << HwComputingResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwComputingResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("24809225-7cf3-4359-8abc-e453f06d1c43")
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
    @objid ("50fc715a-aabe-40f4-8671-508aafea1c94")
    public static HwComputingResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwComputingResourceLifeline.canInstantiate(obj))
        	return new HwComputingResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("361a1c14-5801-4694-83d8-33ea791e4e4e")
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
    @objid ("9f17d65f-60a1-4bb5-8032-13d37a2049cc")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwComputingResource_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d176abf0-54c2-41fc-826b-0dc1a849cee6")
    public String getHwComputingResource_Lifeline_description() {
        return this.elt.getTagValue(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Lifeline_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7e5f219a-2027-416b-b132-29026e97370a")
    public List<String> getHwComputingResource_Lifeline_endPoints() {
        return this.elt.getTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7d7f5d8f-e2b6-4bc2-b641-d714256b8172")
    public String getHwComputingResource_Lifeline_frequency() {
        return this.elt.getTagValue(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Lifeline_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6e29d973-97d0-4687-a5eb-5d4c1f09b268")
    public String getHwComputingResource_Lifeline_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Lifeline_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2a4bff5c-82b7-4f20-8761-21d251568f0f")
    public List<String> getHwComputingResource_Lifeline_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Lifeline_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fdacd442-b187-495d-a66d-31fa52135af9")
    public List<String> getHwComputingResource_Lifeline_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Lifeline_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("01bbc59f-8e33-4673-b359-606ff2feb35a")
    public List<String> getHwComputingResource_Lifeline_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("92579844-0796-49b5-810f-c1c601d5123b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b3ba90da-d069-453d-85f6-a2b7fc33a381")
    public void setHwComputingResource_Lifeline_description(final String value) {
        this.elt.putTagValue(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Lifeline_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("624ae284-0857-47de-805a-f2c1632cda90")
    public void setHwComputingResource_Lifeline_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("760274c4-63c2-416c-8a6b-51d4c598a452")
    public void setHwComputingResource_Lifeline_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_Lifeline_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1e6a89e4-e0dc-429e-bb9c-b5dc8614b5cd")
    public void setHwComputingResource_Lifeline_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Lifeline_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dfe3a4f3-32b8-41b6-98c0-41c2adc0912e")
    public void setHwComputingResource_Lifeline_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Lifeline_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9a0fbcd1-bd86-4e1a-a819-47b858ce3583")
    public void setHwComputingResource_Lifeline_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Lifeline_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ef2fac69-aa1e-442f-987f-d6bf0b1e468f")
    public void setHwComputingResource_Lifeline_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLifeline.MdaTypes.HWCOMPUTINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("a446e5d6-a0fa-48c5-95b6-3241aeb6ca0a")
    protected HwComputingResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("1b648d09-1e05-49cc-a345-28ccd417d39b")
    public static final class MdaTypes {
        @objid ("39e77242-c074-4719-97e3-4745951a6f5d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("48140a3e-186f-4ff1-8de7-53ec465c8d35")
        public static TagType HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES_TAGTYPE_ELT;

        @objid ("912093ee-aa1a-4615-94fa-565005109bc2")
        public static TagType HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("5fba215c-91cb-4245-a521-9e6812e7c3b8")
        public static TagType HWCOMPUTINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("d8a3772a-bc92-4f8f-b27d-5fa5cb3d23e3")
        public static TagType HWCOMPUTINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("94c43c99-1bbf-4ca6-b6ed-d4283d003dde")
        public static TagType HWCOMPUTINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT;

        @objid ("a96bec00-5270-4009-b39f-1d22fac4ac7a")
        public static TagType HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT;

        @objid ("7a830876-8514-48a0-8dcd-17c77741a5ce")
        public static TagType HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("e9e62ef8-93ae-4a68-a342-e229ae48adef")
        private static Stereotype MDAASSOCDEP;

        @objid ("d813c749-b0d8-4e6b-9632-f535e85a23fe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a0f2b54e-6727-465c-863d-c423381bbd60")
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
