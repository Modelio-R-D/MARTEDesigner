/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.lifeline;

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
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.lifeline.SwResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << DeviceBroker_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class DeviceBrokerLifeline extends SwResourceLifeline {
    public static final String STEREOTYPE_NAME = "DeviceBroker_Lifeline";

    public static final String DEVICEBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Lifeline_accessPolicy";

    public static final String DEVICEBROKER_LIFELINE_CLOSESERVICES_TAGTYPE = "DeviceBroker_Lifeline_closeServices";

    public static final String DEVICEBROKER_LIFELINE_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Lifeline_controlServices";

    public static final String DEVICEBROKER_LIFELINE_DEVICES_TAGTYPE = "DeviceBroker_Lifeline_devices";

    public static final String DEVICEBROKER_LIFELINE_ISBUFFERED_TAGTYPE = "DeviceBroker_Lifeline_isBuffered";

    public static final String DEVICEBROKER_LIFELINE_OPENSERVICES_TAGTYPE = "DeviceBroker_Lifeline_openServices";

    public static final String DEVICEBROKER_LIFELINE_READSERVICES_TAGTYPE = "DeviceBroker_Lifeline_readServices";

    public static final String DEVICEBROKER_LIFELINE_WRITESERVICES_TAGTYPE = "DeviceBroker_Lifeline_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << DeviceBroker_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << DeviceBroker_Lifeline >> then instantiate a {@link DeviceBrokerLifeline} proxy.
     * 
     * @return a {@link DeviceBrokerLifeline} proxy on the created {@link Lifeline}.
     */
    public static DeviceBrokerLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerLifeline.STEREOTYPE_NAME);
        return DeviceBrokerLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerLifeline} proxy from a {@link Lifeline} stereotyped << DeviceBroker_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link DeviceBrokerLifeline} proxy or <i>null</i>.
     */
    public static DeviceBrokerLifeline instantiate(final Lifeline obj) {
        return DeviceBrokerLifeline.canInstantiate(obj) ? new DeviceBrokerLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerLifeline} proxy from a {@link Lifeline} stereotyped << DeviceBroker_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link DeviceBrokerLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static DeviceBrokerLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (DeviceBrokerLifeline.canInstantiate(obj))
        	return new DeviceBrokerLifeline(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        DeviceBrokerLifeline other = (DeviceBrokerLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DeviceBroker_Lifeline_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDeviceBroker_Lifeline_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Lifeline_closeServices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Lifeline_controlServices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Lifeline_devices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Lifeline_openServices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Lifeline_readServices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Lifeline_writeServices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Lifeline_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isDeviceBroker_Lifeline_isBuffered() {
        return this.elt.isTagged(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Lifeline_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Lifeline_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Lifeline_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Lifeline_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Lifeline_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Lifeline_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Lifeline_isBuffered(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_ISBUFFERED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_openServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Lifeline_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Lifeline_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Lifeline_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_WRITESERVICES_TAGTYPE_ELT, values);
    }

    protected DeviceBrokerLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType DEVICEBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_LIFELINE_ISBUFFERED_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_LIFELINE_DEVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_LIFELINE_CLOSESERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_LIFELINE_CONTROLSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_LIFELINE_OPENSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_LIFELINE_READSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_LIFELINE_WRITESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "09bb9c94-10d2-11df-81d9-0014222a9f79");
            DEVICEBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f435-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LIFELINE_ISBUFFERED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f436-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LIFELINE_DEVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f437-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LIFELINE_CLOSESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f438-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LIFELINE_CONTROLSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f439-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LIFELINE_OPENSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f43a-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LIFELINE_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f43b-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LIFELINE_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a61f43c-172e-11df-b92a-0014222a9f79");
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
