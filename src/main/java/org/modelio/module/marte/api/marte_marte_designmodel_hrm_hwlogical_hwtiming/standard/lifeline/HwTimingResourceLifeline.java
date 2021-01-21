/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.lifeline;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.TimingResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwTimingResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e4daac30-3570-46ef-b47d-252c53105bdd")
public class HwTimingResourceLifeline extends TimingResourceLifeline {
    @objid ("d4a33e3c-27c3-4eac-bbf8-6d86f01e8a3a")
    public static final String STEREOTYPE_NAME = "HwTimingResource_Lifeline";

    @objid ("55ad3a37-f797-4001-a0dc-d901fe9815f2")
    public static final String HWTIMINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE = "HwTimingResource_Lifeline_description";

    @objid ("a5c72c07-bfcb-47f6-b1d6-9bf3295cbec2")
    public static final String HWTIMINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE = "HwTimingResource_Lifeline_endPoints";

    @objid ("e4e18c6a-ad6d-4af2-a555-0e431c6d0486")
    public static final String HWTIMINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE = "HwTimingResource_Lifeline_frequency";

    @objid ("49f6c76a-4a67-4d9d-b639-d4dc2e21fe78")
    public static final String HWTIMINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE = "HwTimingResource_Lifeline_ownedHW";

    @objid ("96e60c90-b98b-4ba7-ada5-9ebb2510bb63")
    public static final String HWTIMINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE = "HwTimingResource_Lifeline_p_HW_Services";

    @objid ("c22715a6-6942-462a-8b5f-a559c72c7a39")
    public static final String HWTIMINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE = "HwTimingResource_Lifeline_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwTimingResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2bd371d9-73a9-40ed-aa7d-c76b117b02c0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwTimingResource_Lifeline >> then instantiate a {@link HwTimingResourceLifeline} proxy.
     * 
     * @return a {@link HwTimingResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("b6c5ec95-37fd-42df-857f-ca0044c25b25")
    public static HwTimingResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceLifeline.STEREOTYPE_NAME);
        return HwTimingResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceLifeline} proxy from a {@link Lifeline} stereotyped << HwTimingResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwTimingResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("7d0c779c-0ce7-46ed-b352-d9486bdecb23")
    public static HwTimingResourceLifeline instantiate(final Lifeline obj) {
        return HwTimingResourceLifeline.canInstantiate(obj) ? new HwTimingResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceLifeline} proxy from a {@link Lifeline} stereotyped << HwTimingResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwTimingResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d9e2c487-1e6e-43e3-87e5-e36d2501347a")
    public static HwTimingResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwTimingResourceLifeline.canInstantiate(obj))
        	return new HwTimingResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("59a2dc52-2201-4ed7-9107-7c3fae8dae4c")
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
        HwTimingResourceLifeline other = (HwTimingResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("15e024bc-6f07-4021-b4d5-ef0c2be3b86e")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwTimingResource_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6485d3d-5614-4710-b5c2-30e6b401205e")
    public String getHwTimingResource_Lifeline_description() {
        return this.elt.getTagValue(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Lifeline_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("81ee3d0d-c947-468b-a6d0-3e3b92663c87")
    public List<String> getHwTimingResource_Lifeline_endPoints() {
        return this.elt.getTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c25e2019-10a0-4de8-9192-605b5248ec21")
    public String getHwTimingResource_Lifeline_frequency() {
        return this.elt.getTagValue(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Lifeline_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ae1d193b-da41-4cd4-850b-cde592b8f647")
    public List<String> getHwTimingResource_Lifeline_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Lifeline_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("28597c50-4e3c-4c03-b2a8-904af453003a")
    public List<String> getHwTimingResource_Lifeline_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Lifeline_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bc370b8a-4a35-4bbe-a1aa-6ebef6cce361")
    public List<String> getHwTimingResource_Lifeline_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("553f9835-f8e6-42e7-8a17-c8fab5439a94")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("37ef1278-e91a-497f-9dee-0d6bb8e8e756")
    public void setHwTimingResource_Lifeline_description(final String value) {
        this.elt.putTagValue(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Lifeline_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba5d2d23-2008-459f-a0ce-430ec2367f33")
    public void setHwTimingResource_Lifeline_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a75e2c8c-6d6d-4582-b38d-ebd5f2fa3c1b")
    public void setHwTimingResource_Lifeline_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Lifeline_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c769a91c-ca4f-4dbf-991d-b0625379b912")
    public void setHwTimingResource_Lifeline_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Lifeline_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fea943d0-5733-4c46-bfa0-5f3d88c6946d")
    public void setHwTimingResource_Lifeline_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Lifeline_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f0fd6eb-145d-4253-b759-0b05ef6de538")
    public void setHwTimingResource_Lifeline_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("90afc9a7-aa77-4e11-9972-39959093d823")
    protected HwTimingResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("8a60c478-dbff-4fc6-86d1-cdb761c353cd")
    public static final class MdaTypes {
        @objid ("61b0875e-b39c-4d28-970d-06da1a2b8a69")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a73f1dfa-f36e-415b-9637-5afb340f9084")
        public static TagType HWTIMINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("0de2b6e0-089e-4e56-9f3b-c036660df17b")
        public static TagType HWTIMINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("9be97e69-29d0-42d8-ae3c-e43c9324d53b")
        public static TagType HWTIMINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("517c3169-097f-4d04-b166-7c7a7e8269f0")
        public static TagType HWTIMINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT;

        @objid ("a99c0afd-3fc9-4407-8294-fcd2c82159ff")
        public static TagType HWTIMINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("b2aec272-e792-49d2-a5de-a22004a4fcfa")
        public static TagType HWTIMINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT;

        @objid ("728019b7-0c52-4695-9e70-ecb1894318d4")
        private static Stereotype MDAASSOCDEP;

        @objid ("50916669-7003-476d-86e6-24ec713c0b37")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("52dc61bf-7add-4ebd-abec-54531c39cba2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8a7f9a24-10ae-11df-81d9-0014222a9f79");
            HWTIMINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "462c55c1-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "462c55c2-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "462c55c3-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "462c55c4-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bc3c73ea-1709-11df-b92a-0014222a9f79");
            HWTIMINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6e5561b1-8dfb-11e0-8741-0027103f347c");
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
