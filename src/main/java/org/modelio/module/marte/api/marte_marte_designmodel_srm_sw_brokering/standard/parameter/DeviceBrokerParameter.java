/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.parameter.SwResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << DeviceBroker_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class DeviceBrokerParameter extends SwResourceParameter {
    public static final String STEREOTYPE_NAME = "DeviceBroker_Parameter";

    public static final String DEVICEBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Parameter_accessPolicy";

    public static final String DEVICEBROKER_PARAMETER_CLOSESERVICES_TAGTYPE = "DeviceBroker_Parameter_closeServices";

    public static final String DEVICEBROKER_PARAMETER_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Parameter_controlServices";

    public static final String DEVICEBROKER_PARAMETER_DEVICES_TAGTYPE = "DeviceBroker_Parameter_devices";

    public static final String DEVICEBROKER_PARAMETER_ISBUFFERED_TAGTYPE = "DeviceBroker_Parameter_isBuffered";

    public static final String DEVICEBROKER_PARAMETER_OPENSERVICES_TAGTYPE = "DeviceBroker_Parameter_openServices";

    public static final String DEVICEBROKER_PARAMETER_READSERVICES_TAGTYPE = "DeviceBroker_Parameter_readServices";

    public static final String DEVICEBROKER_PARAMETER_WRITESERVICES_TAGTYPE = "DeviceBroker_Parameter_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << DeviceBroker_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << DeviceBroker_Parameter >> then instantiate a {@link DeviceBrokerParameter} proxy.
     * 
     * @return a {@link DeviceBrokerParameter} proxy on the created {@link Parameter}.
     */
    public static DeviceBrokerParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerParameter.STEREOTYPE_NAME);
        return DeviceBrokerParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerParameter} proxy from a {@link Parameter} stereotyped << DeviceBroker_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link DeviceBrokerParameter} proxy or <i>null</i>.
     */
    public static DeviceBrokerParameter instantiate(final Parameter obj) {
        return DeviceBrokerParameter.canInstantiate(obj) ? new DeviceBrokerParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerParameter} proxy from a {@link Parameter} stereotyped << DeviceBroker_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link DeviceBrokerParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static DeviceBrokerParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (DeviceBrokerParameter.canInstantiate(obj))
        	return new DeviceBrokerParameter(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        DeviceBrokerParameter other = (DeviceBrokerParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DeviceBroker_Parameter_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDeviceBroker_Parameter_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Parameter_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Parameter_closeServices() {
        return this.elt.getTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Parameter_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Parameter_controlServices() {
        return this.elt.getTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Parameter_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Parameter_devices() {
        return this.elt.getTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Parameter_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Parameter_openServices() {
        return this.elt.getTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Parameter_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Parameter_readServices() {
        return this.elt.getTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Parameter_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Parameter_writeServices() {
        return this.elt.getTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Parameter_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isDeviceBroker_Parameter_isBuffered() {
        return this.elt.isTagged(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Parameter_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Parameter_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Parameter_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Parameter_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Parameter_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Parameter_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Parameter_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Parameter_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Parameter_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Parameter_isBuffered(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_ISBUFFERED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Parameter_openServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Parameter_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Parameter_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Parameter_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Parameter_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Parameter_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_WRITESERVICES_TAGTYPE_ELT, values);
    }

    protected DeviceBrokerParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType DEVICEBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_PARAMETER_ISBUFFERED_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_PARAMETER_DEVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_PARAMETER_CLOSESERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_PARAMETER_CONTROLSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_PARAMETER_OPENSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_PARAMETER_READSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_PARAMETER_WRITESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01f43555-0ccf-11df-8525-001302895b2b");
            DEVICEBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01fb5c3c-0ccf-11df-8525-001302895b2b");
            DEVICEBROKER_PARAMETER_ISBUFFERED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01fb5c43-0ccf-11df-8525-001302895b2b");
            DEVICEBROKER_PARAMETER_DEVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01fb5c4a-0ccf-11df-8525-001302895b2b");
            DEVICEBROKER_PARAMETER_CLOSESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01fb5c51-0ccf-11df-8525-001302895b2b");
            DEVICEBROKER_PARAMETER_CONTROLSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01fdbe8b-0ccf-11df-8525-001302895b2b");
            DEVICEBROKER_PARAMETER_OPENSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01fdbe92-0ccf-11df-8525-001302895b2b");
            DEVICEBROKER_PARAMETER_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01fdbe99-0ccf-11df-8525-001302895b2b");
            DEVICEBROKER_PARAMETER_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01fdbea0-0ccf-11df-8525-001302895b2b");
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
