/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("69065d69-6ecd-4739-9e77-4fefa9053787")
    public static final String STEREOTYPE_NAME = "HwTimingResource_Lifeline";

    @objid ("3a808bca-8884-4ef2-8fc6-fe1511b75fea")
    public static final String HWTIMINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE = "HwTimingResource_Lifeline_description";

    @objid ("2bf1efb6-7967-4e6f-9f6c-133d38903c48")
    public static final String HWTIMINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE = "HwTimingResource_Lifeline_endPoints";

    @objid ("08b7bc78-bada-40dc-a68c-9aae13263c17")
    public static final String HWTIMINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE = "HwTimingResource_Lifeline_frequency";

    @objid ("14ee060f-114d-48fd-aedc-bf9b83b28073")
    public static final String HWTIMINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE = "HwTimingResource_Lifeline_ownedHW";

    @objid ("d1708379-1914-4f0a-948f-b149486d9236")
    public static final String HWTIMINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE = "HwTimingResource_Lifeline_p_HW_Services";

    @objid ("2b20ffce-3c4e-4f56-ae50-f6c68a41c5fd")
    public static final String HWTIMINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE = "HwTimingResource_Lifeline_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwTimingResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8da88c50-28fa-4984-8ddc-6f3607584c3f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwTimingResource_Lifeline >> then instantiate a {@link HwTimingResourceLifeline} proxy.
     * 
     * @return a {@link HwTimingResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("078793d1-5b15-48ae-ab4c-7cf17c7a44ba")
    public static HwTimingResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceLifeline.STEREOTYPE_NAME);
        return HwTimingResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceLifeline} proxy from a {@link Lifeline} stereotyped << HwTimingResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwTimingResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("6a7e8b63-ec53-42cd-b6a0-30362cca7626")
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
    @objid ("fec363ea-0cd2-4325-a7b3-f19ea24112b6")
    public static HwTimingResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwTimingResourceLifeline.canInstantiate(obj))
        	return new HwTimingResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d2242359-b8a5-4e34-a1bf-9359cf958d21")
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
    @objid ("2d5abed1-fb49-4c4c-9dea-38d902291c81")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwTimingResource_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cb9ed337-a5c6-4833-9de6-90c6821b4813")
    public String getHwTimingResource_Lifeline_description() {
        return this.elt.getTagValue(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Lifeline_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("52c92a1d-8fd1-44a4-8ab9-d5062f23c04c")
    public List<String> getHwTimingResource_Lifeline_endPoints() {
        return this.elt.getTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8f99a449-9100-43bd-a798-d9632485eef8")
    public String getHwTimingResource_Lifeline_frequency() {
        return this.elt.getTagValue(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Lifeline_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("70e2797d-955f-42d5-8fa7-5cb97ed21898")
    public List<String> getHwTimingResource_Lifeline_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Lifeline_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9a4efa2c-a9cc-433b-88b5-83b804a79b00")
    public List<String> getHwTimingResource_Lifeline_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Lifeline_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8cb75e60-83c5-45a7-a208-53094ce497c1")
    public List<String> getHwTimingResource_Lifeline_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("3b009d4b-5ae5-4d01-8088-04f79900b1b8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2cc31c32-96cb-47b4-b6af-82d05e826e77")
    public void setHwTimingResource_Lifeline_description(final String value) {
        this.elt.putTagValue(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Lifeline_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9d1d67db-503f-4aa0-8238-466486deaad0")
    public void setHwTimingResource_Lifeline_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b811ce24-86b6-4351-8ac6-a9e7d1016db6")
    public void setHwTimingResource_Lifeline_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Lifeline_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6434a906-392e-4e35-9d6c-1c3ac90d2eff")
    public void setHwTimingResource_Lifeline_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Lifeline_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7a6733b8-aebc-49ca-a044-735fac5bcc7e")
    public void setHwTimingResource_Lifeline_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Lifeline_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ece0906a-d1cd-4a22-863c-6d04f5a8712c")
    public void setHwTimingResource_Lifeline_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceLifeline.MdaTypes.HWTIMINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("189d6438-0075-496f-8af7-92b820bf1131")
    protected HwTimingResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("8a60c478-dbff-4fc6-86d1-cdb761c353cd")
    public static final class MdaTypes {
        @objid ("ae83313d-1c1e-4800-ac73-e9a1b7794115")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f420c287-c378-487e-be5b-61fb09c5eff2")
        public static TagType HWTIMINGRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("fd974fcf-98d2-4432-a70d-fa6e0df8eb86")
        public static TagType HWTIMINGRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("4bffd922-9a31-4928-a9d7-71d2d7a4f634")
        public static TagType HWTIMINGRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("ef7a2648-8611-4f02-9140-a1d16fa360fe")
        public static TagType HWTIMINGRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT;

        @objid ("a6760dbd-25ee-4946-85f4-eb63b0ff72ba")
        public static TagType HWTIMINGRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("066cd53f-fa97-4801-9d87-9b850e2102b6")
        public static TagType HWTIMINGRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT;

        @objid ("b2d59552-d9db-4c7c-ace2-af36c8e22ce8")
        private static Stereotype MDAASSOCDEP;

        @objid ("7db45393-43b2-458f-9d69-e292b40932a9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("16cf73db-5ea5-48ac-8090-bc61c053c03c")
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
