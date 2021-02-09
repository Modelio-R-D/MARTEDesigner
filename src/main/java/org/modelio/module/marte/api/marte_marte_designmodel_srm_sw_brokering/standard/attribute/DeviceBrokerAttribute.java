/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.attribute.SwResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << DeviceBroker_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class DeviceBrokerAttribute extends SwResourceAttribute {
    public static final String STEREOTYPE_NAME = "DeviceBroker_Attribute";

    public static final String DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Attribute_accessPolicy";

    public static final String DEVICEBROKER_ATTRIBUTE_CLOSESERVICES_TAGTYPE = "DeviceBroker_Attribute_closeServices";

    public static final String DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Attribute_controlServices";

    public static final String DEVICEBROKER_ATTRIBUTE_DEVICES_TAGTYPE = "DeviceBroker_Attribute_devices";

    public static final String DEVICEBROKER_ATTRIBUTE_ISBUFFERED_TAGTYPE = "DeviceBroker_Attribute_isBuffered";

    public static final String DEVICEBROKER_ATTRIBUTE_OPENSERVICES_TAGTYPE = "DeviceBroker_Attribute_openServices";

    public static final String DEVICEBROKER_ATTRIBUTE_READSERVICES_TAGTYPE = "DeviceBroker_Attribute_readServices";

    public static final String DEVICEBROKER_ATTRIBUTE_WRITESERVICES_TAGTYPE = "DeviceBroker_Attribute_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << DeviceBroker_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << DeviceBroker_Attribute >> then instantiate a {@link DeviceBrokerAttribute} proxy.
     * 
     * @return a {@link DeviceBrokerAttribute} proxy on the created {@link Attribute}.
     */
    public static DeviceBrokerAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerAttribute.STEREOTYPE_NAME);
        return DeviceBrokerAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerAttribute} proxy from a {@link Attribute} stereotyped << DeviceBroker_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link DeviceBrokerAttribute} proxy or <i>null</i>.
     */
    public static DeviceBrokerAttribute instantiate(final Attribute obj) {
        return DeviceBrokerAttribute.canInstantiate(obj) ? new DeviceBrokerAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerAttribute} proxy from a {@link Attribute} stereotyped << DeviceBroker_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link DeviceBrokerAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static DeviceBrokerAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (DeviceBrokerAttribute.canInstantiate(obj))
        	return new DeviceBrokerAttribute(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        DeviceBrokerAttribute other = (DeviceBrokerAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DeviceBroker_Attribute_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDeviceBroker_Attribute_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Attribute_closeServices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Attribute_controlServices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Attribute_devices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Attribute_openServices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Attribute_readServices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Attribute_writeServices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Attribute_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isDeviceBroker_Attribute_isBuffered() {
        return this.elt.isTagged(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Attribute_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Attribute_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Attribute_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Attribute_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Attribute_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Attribute_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Attribute_isBuffered(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_ISBUFFERED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_openServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Attribute_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Attribute_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Attribute_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT, values);
    }

    protected DeviceBrokerAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ATTRIBUTE_ISBUFFERED_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ATTRIBUTE_DEVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ATTRIBUTE_CLOSESERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ATTRIBUTE_OPENSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ATTRIBUTE_READSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01fb5c38-0ccf-11df-8525-001302895b2b");
            DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0d74becd-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ATTRIBUTE_ISBUFFERED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0d74bece-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ATTRIBUTE_DEVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0d74becf-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ATTRIBUTE_CLOSESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0d74bed0-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0d74bed1-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ATTRIBUTE_OPENSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0d74bed2-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ATTRIBUTE_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0d74bed3-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0d74bed4-172e-11df-b92a-0014222a9f79");
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
