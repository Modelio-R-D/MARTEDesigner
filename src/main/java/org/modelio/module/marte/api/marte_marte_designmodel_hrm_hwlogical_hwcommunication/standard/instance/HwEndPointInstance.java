/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ClockResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwEndPoint_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwEndPointInstance extends ClockResourceInstance {
    public static final String STEREOTYPE_NAME = "HwEndPoint_Instance";

    public static final String HWENDPOINT_INSTANCE_CONNECTEDTO_TAGTYPE = "HwEndPoint_Instance_connectedTo";

    public static final String HWENDPOINT_INSTANCE_DESCRIPTION_TAGTYPE = "HwEndPoint_Instance_description";

    public static final String HWENDPOINT_INSTANCE_FREQUENCY_TAGTYPE = "HwEndPoint_Instance_frequency";

    public static final String HWENDPOINT_INSTANCE_OWNEDHW_TAGTYPE = "HwEndPoint_Instance_ownedHW";

    public static final String HWENDPOINT_INSTANCE_P_HW_SERVICES_TAGTYPE = "HwEndPoint_Instance_p_HW_Services";

    public static final String HWENDPOINT_INSTANCE_R_HW_SERVICES_TAGTYPE = "HwEndPoint_Instance_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwEndPoint_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwEndPoint_Instance >> then instantiate a {@link HwEndPointInstance} proxy.
     * 
     * @return a {@link HwEndPointInstance} proxy on the created {@link Instance}.
     */
    public static HwEndPointInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointInstance.STEREOTYPE_NAME);
        return HwEndPointInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointInstance} proxy from a {@link Instance} stereotyped << HwEndPoint_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwEndPointInstance} proxy or <i>null</i>.
     */
    public static HwEndPointInstance instantiate(final Instance obj) {
        return HwEndPointInstance.canInstantiate(obj) ? new HwEndPointInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwEndPointInstance} proxy from a {@link Instance} stereotyped << HwEndPoint_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwEndPointInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwEndPointInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwEndPointInstance.canInstantiate(obj))
        	return new HwEndPointInstance(obj);
        else
        	throw new IllegalArgumentException("HwEndPointInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwEndPointInstance other = (HwEndPointInstance) obj;
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
     * Getter for List<String> property 'HwEndPoint_Instance_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_Instance_connectedTo() {
        return this.elt.getTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwEndPoint_Instance_description() {
        return this.elt.getTagValue(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwEndPoint_Instance_frequency() {
        return this.elt.getTagValue(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Instance_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_Instance_ownedHW() {
        return this.elt.getTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Instance_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_Instance_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Instance_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_Instance_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Instance_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Instance_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Instance_description(final String value) {
        this.elt.putTagValue(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Instance_frequency(final String value) {
        this.elt.putTagValue(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Instance_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Instance_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Instance_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Instance_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Instance_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Instance_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointInstance.MdaTypes.HWENDPOINT_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwEndPointInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWENDPOINT_INSTANCE_CONNECTEDTO_TAGTYPE_ELT;

        public static TagType HWENDPOINT_INSTANCE_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWENDPOINT_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWENDPOINT_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWENDPOINT_INSTANCE_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWENDPOINT_INSTANCE_FREQUENCY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "010cf433-0ccf-11df-8525-001302895b2b");
            HWENDPOINT_INSTANCE_CONNECTEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e7758faa-1726-11df-b92a-0014222a9f79");
            HWENDPOINT_INSTANCE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4c94f0be-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4c94f0bf-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4c94f0c0-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_INSTANCE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4c94f0c1-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_INSTANCE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4c94f0c2-92a9-11e0-a69d-0027103f347c");
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
