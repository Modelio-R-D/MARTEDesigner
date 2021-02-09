/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.instance;

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
public class HwTimingResourceInstance extends TimingResourceInstance {
    public static final String STEREOTYPE_NAME = "HwTimingResource_Instance";

    public static final String HWTIMINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE = "HwTimingResource_Instance_description";

    public static final String HWTIMINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE = "HwTimingResource_Instance_endPoints";

    public static final String HWTIMINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE = "HwTimingResource_Instance_frequency";

    public static final String HWTIMINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE = "HwTimingResource_Instance_ownedHW";

    public static final String HWTIMINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE = "HwTimingResource_Instance_p_HW_Services";

    public static final String HWTIMINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE = "HwTimingResource_Instance_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwTimingResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwTimingResource_Instance >> then instantiate a {@link HwTimingResourceInstance} proxy.
     * 
     * @return a {@link HwTimingResourceInstance} proxy on the created {@link Instance}.
     */
    public static HwTimingResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceInstance.STEREOTYPE_NAME);
        return HwTimingResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceInstance} proxy from a {@link Instance} stereotyped << HwTimingResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwTimingResourceInstance} proxy or <i>null</i>.
     */
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
    public static HwTimingResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwTimingResourceInstance.canInstantiate(obj))
        	return new HwTimingResourceInstance(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwTimingResourceInstance other = (HwTimingResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwTimingResource_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwTimingResource_Instance_description() {
        return this.elt.getTagValue(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Instance_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Instance_endPoints() {
        return this.elt.getTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwTimingResource_Instance_frequency() {
        return this.elt.getTagValue(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Instance_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Instance_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Instance_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Instance_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Instance_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Instance_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Instance_description(final String value) {
        this.elt.putTagValue(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Instance_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Instance_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Instance_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Instance_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Instance_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Instance_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Instance_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Instance_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Instance_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceInstance.MdaTypes.HWTIMINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwTimingResourceInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
