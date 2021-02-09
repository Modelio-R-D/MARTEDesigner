/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.instance;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwResourceInstance {
    public static final String STEREOTYPE_NAME = "HwResource_Instance";

    public static final String HWRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE = "HwResource_Instance_description";

    public static final String HWRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE = "HwResource_Instance_endPoints";

    public static final String HWRESOURCE_INSTANCE_FREQUENCY_TAGTYPE = "HwResource_Instance_frequency";

    public static final String HWRESOURCE_INSTANCE_OWNEDHW_TAGTYPE = "HwResource_Instance_ownedHW";

    public static final String HWRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE = "HwResource_Instance_p_HW_Services";

    public static final String HWRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE = "HwResource_Instance_r_HW_Services";

    /**
     * The underlying {@link Instance} represented by this proxy, never null.
     */
    protected final Instance elt;

    /**
     * Tells whether a {@link HwResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwResource_Instance >> then instantiate a {@link HwResourceInstance} proxy.
     * 
     * @return a {@link HwResourceInstance} proxy on the created {@link Instance}.
     */
    public static HwResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceInstance.STEREOTYPE_NAME);
        return HwResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceInstance} proxy from a {@link Instance} stereotyped << HwResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwResourceInstance} proxy or <i>null</i>.
     */
    public static HwResourceInstance instantiate(final Instance obj) {
        return HwResourceInstance.canInstantiate(obj) ? new HwResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceInstance} proxy from a {@link Instance} stereotyped << HwResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwResourceInstance.canInstantiate(obj))
        	return new HwResourceInstance(obj);
        else
        	throw new IllegalArgumentException("HwResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwResourceInstance other = (HwResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    public Instance getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'HwResource_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwResource_Instance_description() {
        return this.elt.getTagValue(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Instance_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwResource_Instance_endPoints() {
        return this.elt.getTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResource_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwResource_Instance_frequency() {
        return this.elt.getTagValue(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Instance_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwResource_Instance_ownedHW() {
        return this.elt.getTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Instance_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwResource_Instance_p_HW_Services() {
        return this.elt.getTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Instance_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwResource_Instance_r_HW_Services() {
        return this.elt.getTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResource_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Instance_description(final String value) {
        this.elt.putTagValue(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Instance_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Instance_endPoints(final List<String> values) {
        this.elt.putTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwResource_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Instance_frequency(final String value) {
        this.elt.putTagValue(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Instance_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Instance_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Instance_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Instance_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Instance_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Instance_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwResourceInstance(final Instance elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00dae379-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff69-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff70-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff77-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff7e-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d134d0fe-1013-11df-86fe-0014222a9f79");
            HWRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "305cf54d-1709-11df-b92a-0014222a9f79");
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
