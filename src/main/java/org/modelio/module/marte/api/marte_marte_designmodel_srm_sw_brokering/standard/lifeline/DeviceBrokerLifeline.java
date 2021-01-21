/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.lifeline;

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
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.lifeline.SwResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << DeviceBroker_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f1b93c96-40db-42e8-ab0a-e75030513208")
public class DeviceBrokerLifeline extends SwResourceLifeline {
    @objid ("1970c6ca-6cf8-4048-aa9e-5b9e5e2b00d7")
    public static final String STEREOTYPE_NAME = "DeviceBroker_Lifeline";

    @objid ("f9550ab1-ee9f-49d2-b7cb-491783e6c9eb")
    public static final String DEVICEBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Lifeline_accessPolicy";

    @objid ("29eef2ef-8ebc-4e68-a1a5-648376ed2e8a")
    public static final String DEVICEBROKER_LIFELINE_CLOSESERVICES_TAGTYPE = "DeviceBroker_Lifeline_closeServices";

    @objid ("5944f750-8e2b-4727-bf17-a68b5a04b667")
    public static final String DEVICEBROKER_LIFELINE_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Lifeline_controlServices";

    @objid ("702206d9-977c-4dc4-a733-6786be7eedcd")
    public static final String DEVICEBROKER_LIFELINE_DEVICES_TAGTYPE = "DeviceBroker_Lifeline_devices";

    @objid ("7903dd3f-d45e-4074-b782-720ce9e27251")
    public static final String DEVICEBROKER_LIFELINE_ISBUFFERED_TAGTYPE = "DeviceBroker_Lifeline_isBuffered";

    @objid ("9952ebd6-bbb6-4b4f-95d8-9c3dbc61ec36")
    public static final String DEVICEBROKER_LIFELINE_OPENSERVICES_TAGTYPE = "DeviceBroker_Lifeline_openServices";

    @objid ("e4140e09-f629-4905-843f-beba0442eca2")
    public static final String DEVICEBROKER_LIFELINE_READSERVICES_TAGTYPE = "DeviceBroker_Lifeline_readServices";

    @objid ("4bab3b01-d2bb-4842-be11-c31667437f59")
    public static final String DEVICEBROKER_LIFELINE_WRITESERVICES_TAGTYPE = "DeviceBroker_Lifeline_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << DeviceBroker_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0a48148c-c5f0-4d23-8bca-0bf5ded36313")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << DeviceBroker_Lifeline >> then instantiate a {@link DeviceBrokerLifeline} proxy.
     * 
     * @return a {@link DeviceBrokerLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("278d506c-0e67-49b2-bd1b-1e0a67ad2372")
    public static DeviceBrokerLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerLifeline.STEREOTYPE_NAME);
        return DeviceBrokerLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerLifeline} proxy from a {@link Lifeline} stereotyped << DeviceBroker_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link DeviceBrokerLifeline} proxy or <i>null</i>.
     */
    @objid ("e2d6b26f-2568-47a3-ab41-abd3c46c47da")
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
    @objid ("060a059d-9305-4bb1-85bb-6ea1138eb725")
    public static DeviceBrokerLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (DeviceBrokerLifeline.canInstantiate(obj))
        	return new DeviceBrokerLifeline(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e6601067-957a-4f79-a4a9-9d6a798f9cfd")
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
    @objid ("fb0f3cf6-a024-4386-a1ec-a44daf3a9a3e")
    public String getDeviceBroker_Lifeline_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1baad0c1-11e0-49c8-82e3-2042f2d9697e")
    public List<String> getDeviceBroker_Lifeline_closeServices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c131a07d-3170-4c24-bd71-9f8398aa38ce")
    public List<String> getDeviceBroker_Lifeline_controlServices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fe27ee40-edf0-4851-b824-3e9117bc8d4d")
    public List<String> getDeviceBroker_Lifeline_devices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3e11068f-0154-4fb7-827c-c1bd6d058d2d")
    public List<String> getDeviceBroker_Lifeline_openServices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("aa9e84c8-5e01-437c-aa49-41c6030cbe12")
    public List<String> getDeviceBroker_Lifeline_readServices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Lifeline_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6bdb94bf-8a85-494f-8e29-12dae24f5e74")
    public List<String> getDeviceBroker_Lifeline_writeServices() {
        return this.elt.getTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("53214985-533b-44c1-8970-d56844c38056")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("9b9ec189-4400-4649-a96a-d45c3499ffbe")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Lifeline_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a7c5e96-6871-4c42-ba8b-4be910d8e61e")
    public boolean isDeviceBroker_Lifeline_isBuffered() {
        return this.elt.isTagged(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Lifeline_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("52ccad44-2931-485d-b104-e5fa80153b45")
    public void setDeviceBroker_Lifeline_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("788376d2-a25f-4072-bd5b-98b5e25895db")
    public void setDeviceBroker_Lifeline_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("87617aba-904e-4a9a-9e07-43a5fc8c03d5")
    public void setDeviceBroker_Lifeline_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8dd3b0b1-9876-4857-a8c2-acebdfbfb5f6")
    public void setDeviceBroker_Lifeline_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Lifeline_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6616e5fb-9c65-4bae-b534-f1ea845b1dc5")
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
    @objid ("73b60b09-d56f-40d9-8e06-0369d4e0d311")
    public void setDeviceBroker_Lifeline_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("83f97576-d930-4a6b-9527-d015d77f45dc")
    public void setDeviceBroker_Lifeline_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Lifeline_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("861bbb84-bf4a-4c7d-82ea-7d12cb2b3ef5")
    public void setDeviceBroker_Lifeline_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLifeline.MdaTypes.DEVICEBROKER_LIFELINE_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("44e35705-8554-4833-9bd9-91b5c4c51fa4")
    protected DeviceBrokerLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("cd7036a9-27fc-4bcf-b862-0d1d15a265dd")
    public static final class MdaTypes {
        @objid ("b02b3b1d-e320-4157-8a89-1b6801365dc6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7bd49562-5a8e-4826-a3f6-57f9ca53fa8e")
        public static TagType DEVICEBROKER_LIFELINE_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("6f4320e3-9036-4040-a6e2-af7c8cbc7a8a")
        public static TagType DEVICEBROKER_LIFELINE_ISBUFFERED_TAGTYPE_ELT;

        @objid ("dee03958-2294-4833-b42a-be3a056257cd")
        public static TagType DEVICEBROKER_LIFELINE_DEVICES_TAGTYPE_ELT;

        @objid ("c8ee4463-642a-4501-809c-e03dce91d3fc")
        public static TagType DEVICEBROKER_LIFELINE_CLOSESERVICES_TAGTYPE_ELT;

        @objid ("8ab76ad6-7f39-473a-988a-19cd7bfbeabc")
        public static TagType DEVICEBROKER_LIFELINE_CONTROLSERVICES_TAGTYPE_ELT;

        @objid ("d3c76cef-4b0d-403b-853c-ba42559bb830")
        public static TagType DEVICEBROKER_LIFELINE_OPENSERVICES_TAGTYPE_ELT;

        @objid ("1e1d37d5-6d54-4ca4-93ea-e438e10a9499")
        public static TagType DEVICEBROKER_LIFELINE_READSERVICES_TAGTYPE_ELT;

        @objid ("61940b5f-9dc3-4a88-89d4-f896065e4ad5")
        public static TagType DEVICEBROKER_LIFELINE_WRITESERVICES_TAGTYPE_ELT;

        @objid ("43b9177b-93df-4137-aadd-3df69436f543")
        private static Stereotype MDAASSOCDEP;

        @objid ("f50ba363-c001-4eb4-99ed-d4f3c29e7303")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c0d428a7-bedf-4980-bf07-bf95c1ef100c")
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
