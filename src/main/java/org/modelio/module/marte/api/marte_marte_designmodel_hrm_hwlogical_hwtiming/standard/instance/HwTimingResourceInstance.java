/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.TimingResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwTimingResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ea6dc649-edac-4a9d-b8de-084281740d1c")
public class HwTimingResourceInstance extends TimingResourceInstance {
    @objid ("581430f8-cf8d-42db-84cc-187076ea2157")
    public static final String STEREOTYPE_NAME = "HwTimingResource_Instance";

    @objid ("6df576ed-f5d7-4272-8848-b50e8d02720d")
    public static final String HWTIMINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE = "HwTimingResource_Instance_description";

    @objid ("00565b45-40aa-44ac-bc4e-bb13ff7ea794")
    public static final String HWTIMINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE = "HwTimingResource_Instance_endPoints";

    @objid ("a215f682-0a43-426b-818c-a8ff9587c695")
    public static final String HWTIMINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE = "HwTimingResource_Instance_frequency";

    @objid ("bd5364e2-7dfc-4d58-b202-0b5ea63b5925")
    public static final String HWTIMINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE = "HwTimingResource_Instance_ownedHW";

    @objid ("0ca597bb-38b6-450a-a853-4e3c97b6f4e4")
    public static final String HWTIMINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE = "HwTimingResource_Instance_p_HW_Services";

    @objid ("03296602-e376-4c3a-a978-d61c6ecefc32")
    public static final String HWTIMINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE = "HwTimingResource_Instance_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwTimingResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a8bc2c31-10ae-40f8-ada9-47fe1806dad5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwTimingResource_Instance >> then instantiate a {@link HwTimingResourceInstance} proxy.
     * 
     * @return a {@link HwTimingResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("6bb37291-2a0b-4e58-b991-a51f2404b5e6")
    public static HwTimingResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceInstance.STEREOTYPE_NAME);
        return HwTimingResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceInstance} proxy from a {@link Instance} stereotyped << HwTimingResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwTimingResourceInstance} proxy or <i>null</i>.
     */
    @objid ("8d7ce6bb-0914-44ee-b8a1-de17aacab09d")
    public static HwTimingResourceInstance instantiate(final Instance obj) {
        return HwTimingResourceInstance.canInstantiate(obj) ? new HwTimingResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceInstance} proxy from a {@link Instance} stereotyped << HwTimingResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwTimingResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cd0cfd88-9fd1-41ef-9ade-5bf2149566f3")
    public static HwTimingResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwTimingResourceInstance.canInstantiate(obj))
        	return new HwTimingResourceInstance(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2efe216e-1f8f-40ae-9b26-d365b01d6fc6")
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
        HwTimingResourceInstance other = (HwTimingResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("515a3590-133d-430e-82d2-b1a7dbc0fefd")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwTimingResource_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("240020a3-98e1-431c-90be-5b70b15c36e3")
    public String getHwTimingResource_Instance_description() {
        return this.elt.getTagValue(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Instance_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6e5cbc2a-ced4-42f1-8492-993a3287dac5")
    public List<String> getHwTimingResource_Instance_endPoints() {
        return this.elt.getTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ded8685f-5b3a-454d-9dd9-da59d965f728")
    public String getHwTimingResource_Instance_frequency() {
        return this.elt.getTagValue(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Instance_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("05b071ba-6dae-43e9-a249-5346b4ce8179")
    public List<String> getHwTimingResource_Instance_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Instance_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("67c1b401-bf47-4e41-ad47-8cf8a72df8b7")
    public List<String> getHwTimingResource_Instance_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Instance_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a0cc94bc-8347-4bbd-88b4-237472b3e406")
    public List<String> getHwTimingResource_Instance_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("e684601d-75cf-48ed-96f0-860e0dcc006d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7a40def8-a254-47ea-bd7a-ab615ee5b038")
    public void setHwTimingResource_Instance_description(final String value) {
        this.elt.putTagValue(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Instance_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac784889-1d7d-4ff9-9df1-4e17b6d99044")
    public void setHwTimingResource_Instance_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8dfeff19-287a-40f3-9551-01dee20a750f")
    public void setHwTimingResource_Instance_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Instance_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b52ebf78-ce78-4ae5-aed9-241ac665f329")
    public void setHwTimingResource_Instance_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Instance_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a34e1f91-d209-43e0-8df7-7a210ca27320")
    public void setHwTimingResource_Instance_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Instance_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("23b17b7c-a6b2-4de2-b345-540b69021086")
    public void setHwTimingResource_Instance_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("852a8182-1224-426d-b3b8-f47a753da67e")
    protected HwTimingResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("5cbe70b1-fa4f-4ba3-aa7a-1cf8e10deb43")
    public static final class MdaTypes {
        @objid ("1b143479-0a57-4da1-a897-ea70d974798a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("86ceec84-bfd7-4266-a635-976e91188201")
        public static TagType HWTIMINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("86d15650-0cb3-4cf6-aa87-bd23e259658a")
        public static TagType HWTIMINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("cb84f8cd-6694-4900-b968-ed54513feaac")
        public static TagType HWTIMINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("6a1ef05a-1dcd-4180-85e1-9d5d705d284d")
        public static TagType HWTIMINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT;

        @objid ("9a539bd6-5df2-4237-a2b6-d196a0110137")
        public static TagType HWTIMINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("fce2f6e3-b2ce-4b8b-bb75-7b8ea47f9a55")
        public static TagType HWTIMINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT;

        @objid ("4cdbd953-6f9a-4aff-9138-00c0db43ce04")
        private static Stereotype MDAASSOCDEP;

        @objid ("7d33d98b-7317-4e77-9cb3-cd3822f8b925")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b0913c66-5caf-43e7-b600-64ce491709d5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01226916-0ccf-11df-8525-001302895b2b");
            HWTIMINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4739bd46-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4739bd47-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4739bd48-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4739bd49-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bd3df176-1709-11df-b92a-0014222a9f79");
            HWTIMINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6d35e095-8dfb-11e0-8741-0027103f347c");
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
