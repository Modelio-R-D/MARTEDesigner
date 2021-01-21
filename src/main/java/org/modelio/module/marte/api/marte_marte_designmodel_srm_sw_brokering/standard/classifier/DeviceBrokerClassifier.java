/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.classifier.SwResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << DeviceBroker_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9f0b7206-da60-495b-917a-e70ec0f6f2a0")
public class DeviceBrokerClassifier extends SwResourceClassifier {
    @objid ("bd7a648b-b5e5-4d42-9e1e-c3a37bcc32b2")
    public static final String STEREOTYPE_NAME = "DeviceBroker_Classifier";

    @objid ("260d33ab-dd2f-411b-9bd6-cad9e5413b34")
    public static final String DEVICEBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Classifier_accessPolicy";

    @objid ("6c5e3997-a0a0-4e4e-a258-757c139cf0ee")
    public static final String DEVICEBROKER_CLASSIFIER_CLOSESERVICES_TAGTYPE = "DeviceBroker_Classifier_closeServices";

    @objid ("79ef9e62-f8b2-4554-9644-c32c194bf973")
    public static final String DEVICEBROKER_CLASSIFIER_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Classifier_controlServices";

    @objid ("350e85dd-ae93-43bc-b275-470a550cc6a1")
    public static final String DEVICEBROKER_CLASSIFIER_DEVICES_TAGTYPE = "DeviceBroker_Classifier_devices";

    @objid ("e523e838-d3a6-45ab-8cc3-b0c3d6dfa29c")
    public static final String DEVICEBROKER_CLASSIFIER_ISBUFFERED_TAGTYPE = "DeviceBroker_Classifier_isBuffered";

    @objid ("964d72b1-3668-4a1c-93a6-cba8561f37ce")
    public static final String DEVICEBROKER_CLASSIFIER_OPENSERVICES_TAGTYPE = "DeviceBroker_Classifier_openServices";

    @objid ("22eedac5-40ed-4022-ba61-75d766d6cfe1")
    public static final String DEVICEBROKER_CLASSIFIER_READSERVICES_TAGTYPE = "DeviceBroker_Classifier_readServices";

    @objid ("0b4a2c80-de10-455f-847b-1c176eb27a6c")
    public static final String DEVICEBROKER_CLASSIFIER_WRITESERVICES_TAGTYPE = "DeviceBroker_Classifier_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << DeviceBroker_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ee69fa74-9bda-48c0-bc3d-4d857396d90f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << DeviceBroker_Classifier >> then instantiate a {@link DeviceBrokerClassifier} proxy.
     * 
     * @return a {@link DeviceBrokerClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("31ea4aaa-1de7-4043-9b56-473bc8a78ab3")
    public static DeviceBrokerClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerClassifier.STEREOTYPE_NAME);
        return DeviceBrokerClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerClassifier} proxy from a {@link Classifier} stereotyped << DeviceBroker_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link DeviceBrokerClassifier} proxy or <i>null</i>.
     */
    @objid ("a918551e-0373-4284-8664-65470f9a279a")
    public static DeviceBrokerClassifier instantiate(final Classifier obj) {
        return DeviceBrokerClassifier.canInstantiate(obj) ? new DeviceBrokerClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerClassifier} proxy from a {@link Classifier} stereotyped << DeviceBroker_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link DeviceBrokerClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6cd0ceab-a29d-4f3f-a5ed-c9f950225032")
    public static DeviceBrokerClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (DeviceBrokerClassifier.canInstantiate(obj))
        	return new DeviceBrokerClassifier(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0f7ce0d8-5b9f-441c-b203-7eb9e546a4c7")
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
        DeviceBrokerClassifier other = (DeviceBrokerClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DeviceBroker_Classifier_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3bf77283-79c6-478e-b242-9f09adf6ae60")
    public String getDeviceBroker_Classifier_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Classifier_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b928c425-c16d-45f8-b2ad-0168b46b365a")
    public List<String> getDeviceBroker_Classifier_closeServices() {
        return this.elt.getTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Classifier_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6f5a5765-f9e5-4ece-acd5-c3901eeb5afa")
    public List<String> getDeviceBroker_Classifier_controlServices() {
        return this.elt.getTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Classifier_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d8569a53-73f0-4568-9e50-16b0f47abee7")
    public List<String> getDeviceBroker_Classifier_devices() {
        return this.elt.getTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Classifier_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b653f9e5-a19a-47ea-9497-ea845e363e12")
    public List<String> getDeviceBroker_Classifier_openServices() {
        return this.elt.getTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Classifier_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1526c2a6-9856-42e8-93de-3cdf82c51ae1")
    public List<String> getDeviceBroker_Classifier_readServices() {
        return this.elt.getTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Classifier_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3fbd39ee-b5b4-4163-a559-6b964fbbc1b2")
    public List<String> getDeviceBroker_Classifier_writeServices() {
        return this.elt.getTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("754fa393-1e4b-413a-8f6c-aad678273051")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("4032e6b7-b9ed-4b5a-a9e1-3927c77944fb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Classifier_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1b73639-80bb-415a-96fa-afdece0b7533")
    public boolean isDeviceBroker_Classifier_isBuffered() {
        return this.elt.isTagged(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Classifier_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("23d4977f-e72f-47ea-858f-2a5a636b22cc")
    public void setDeviceBroker_Classifier_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Classifier_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9f62610d-4430-4aa3-a491-9f48f49deef3")
    public void setDeviceBroker_Classifier_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Classifier_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("686029a7-88c7-41cd-987a-3aa44be97bbf")
    public void setDeviceBroker_Classifier_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Classifier_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a0158463-64a7-412a-8002-dc9074d02b35")
    public void setDeviceBroker_Classifier_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Classifier_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea3d5003-326d-4aa1-abf5-8e25fdb80506")
    public void setDeviceBroker_Classifier_isBuffered(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_ISBUFFERED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Classifier_openServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b78fff82-5bd8-4454-a669-bb565bf17a1f")
    public void setDeviceBroker_Classifier_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Classifier_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("61e66acd-7c4e-44c9-ad39-940703dae769")
    public void setDeviceBroker_Classifier_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Classifier_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5ce760c1-5270-43ea-b7b8-919a0e45f234")
    public void setDeviceBroker_Classifier_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("355cc480-7d97-4451-84a8-2ee4dca115b4")
    protected DeviceBrokerClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("3fa11e4a-bf28-4f9f-a2a8-ee64d658fb19")
    public static final class MdaTypes {
        @objid ("f619afa9-63db-4bfa-b582-7c0e00728671")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("58d7e966-aa4d-44f5-a864-6b5d3a7e3078")
        public static TagType DEVICEBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("c3feb3e2-6e00-40ae-9f42-aafeaca8baa3")
        public static TagType DEVICEBROKER_CLASSIFIER_ISBUFFERED_TAGTYPE_ELT;

        @objid ("dd23c9c7-5f65-4695-9052-6087860449e4")
        public static TagType DEVICEBROKER_CLASSIFIER_DEVICES_TAGTYPE_ELT;

        @objid ("92af0f98-eecf-48b6-b5e2-da3b87b52b9b")
        public static TagType DEVICEBROKER_CLASSIFIER_CLOSESERVICES_TAGTYPE_ELT;

        @objid ("0f8a2e5a-c49b-445b-bbdf-c3fabdac1e23")
        public static TagType DEVICEBROKER_CLASSIFIER_CONTROLSERVICES_TAGTYPE_ELT;

        @objid ("631daf57-03bd-4f52-84eb-913a88365900")
        public static TagType DEVICEBROKER_CLASSIFIER_OPENSERVICES_TAGTYPE_ELT;

        @objid ("8dc68cfb-1005-46ea-b404-0e0574f7b2fd")
        public static TagType DEVICEBROKER_CLASSIFIER_READSERVICES_TAGTYPE_ELT;

        @objid ("d9b247c4-e208-4001-b649-9132c5d01c2f")
        public static TagType DEVICEBROKER_CLASSIFIER_WRITESERVICES_TAGTYPE_ELT;

        @objid ("bb9970f7-6f76-419b-bcdf-62e4a72ccbc3")
        private static Stereotype MDAASSOCDEP;

        @objid ("c0f09494-9713-44bc-a389-db432577f10b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cbf5ef67-3c7e-4c3b-ae75-fe46665d9465")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "09d838f0-10d2-11df-81d9-0014222a9f79");
            DEVICEBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0999ae05-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_CLASSIFIER_ISBUFFERED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0999ae06-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_CLASSIFIER_DEVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0999ae07-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_CLASSIFIER_CLOSESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0999ae08-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_CLASSIFIER_CONTROLSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0999ae09-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_CLASSIFIER_OPENSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0999ae0a-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_CLASSIFIER_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0999ae0b-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_CLASSIFIER_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0999ae0c-172e-11df-b92a-0014222a9f79");
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
