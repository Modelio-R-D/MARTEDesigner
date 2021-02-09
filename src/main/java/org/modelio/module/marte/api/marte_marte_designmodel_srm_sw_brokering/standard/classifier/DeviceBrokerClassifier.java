/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.classifier;

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
public class DeviceBrokerClassifier extends SwResourceClassifier {
    public static final String STEREOTYPE_NAME = "DeviceBroker_Classifier";

    public static final String DEVICEBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Classifier_accessPolicy";

    public static final String DEVICEBROKER_CLASSIFIER_CLOSESERVICES_TAGTYPE = "DeviceBroker_Classifier_closeServices";

    public static final String DEVICEBROKER_CLASSIFIER_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Classifier_controlServices";

    public static final String DEVICEBROKER_CLASSIFIER_DEVICES_TAGTYPE = "DeviceBroker_Classifier_devices";

    public static final String DEVICEBROKER_CLASSIFIER_ISBUFFERED_TAGTYPE = "DeviceBroker_Classifier_isBuffered";

    public static final String DEVICEBROKER_CLASSIFIER_OPENSERVICES_TAGTYPE = "DeviceBroker_Classifier_openServices";

    public static final String DEVICEBROKER_CLASSIFIER_READSERVICES_TAGTYPE = "DeviceBroker_Classifier_readServices";

    public static final String DEVICEBROKER_CLASSIFIER_WRITESERVICES_TAGTYPE = "DeviceBroker_Classifier_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << DeviceBroker_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << DeviceBroker_Classifier >> then instantiate a {@link DeviceBrokerClassifier} proxy.
     * 
     * @return a {@link DeviceBrokerClassifier} proxy on the created {@link Classifier}.
     */
    public static DeviceBrokerClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerClassifier.STEREOTYPE_NAME);
        return DeviceBrokerClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerClassifier} proxy from a {@link Classifier} stereotyped << DeviceBroker_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link DeviceBrokerClassifier} proxy or <i>null</i>.
     */
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
    public static DeviceBrokerClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (DeviceBrokerClassifier.canInstantiate(obj))
        	return new DeviceBrokerClassifier(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        DeviceBrokerClassifier other = (DeviceBrokerClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DeviceBroker_Classifier_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDeviceBroker_Classifier_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Classifier_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Classifier_closeServices() {
        return this.elt.getTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Classifier_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Classifier_controlServices() {
        return this.elt.getTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Classifier_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Classifier_devices() {
        return this.elt.getTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Classifier_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Classifier_openServices() {
        return this.elt.getTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Classifier_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Classifier_readServices() {
        return this.elt.getTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Classifier_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Classifier_writeServices() {
        return this.elt.getTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Classifier_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isDeviceBroker_Classifier_isBuffered() {
        return this.elt.isTagged(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Classifier_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Classifier_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Classifier_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Classifier_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Classifier_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Classifier_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Classifier_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Classifier_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Classifier_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setDeviceBroker_Classifier_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Classifier_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Classifier_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Classifier_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Classifier_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerClassifier.MdaTypes.DEVICEBROKER_CLASSIFIER_WRITESERVICES_TAGTYPE_ELT, values);
    }

    protected DeviceBrokerClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType DEVICEBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_CLASSIFIER_ISBUFFERED_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_CLASSIFIER_DEVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_CLASSIFIER_CLOSESERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_CLASSIFIER_CONTROLSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_CLASSIFIER_OPENSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_CLASSIFIER_READSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_CLASSIFIER_WRITESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
