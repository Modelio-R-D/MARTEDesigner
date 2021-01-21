/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.parameter;

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
@objid ("865b5d88-8439-4530-a9f4-22e17745aa70")
public class DeviceBrokerParameter extends SwResourceParameter {
    @objid ("40323ebb-8f00-4161-8979-93a144e220ac")
    public static final String STEREOTYPE_NAME = "DeviceBroker_Parameter";

    @objid ("f482fd28-b15f-45f5-afb1-7040826ba41f")
    public static final String DEVICEBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Parameter_accessPolicy";

    @objid ("4f79d42d-7e01-4653-9302-92da9afca2a9")
    public static final String DEVICEBROKER_PARAMETER_CLOSESERVICES_TAGTYPE = "DeviceBroker_Parameter_closeServices";

    @objid ("d9cb7e4b-80ac-4069-9d4a-330353bbb32f")
    public static final String DEVICEBROKER_PARAMETER_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Parameter_controlServices";

    @objid ("4c947bbb-1dcb-4f4b-8207-4c8a4ab45ff7")
    public static final String DEVICEBROKER_PARAMETER_DEVICES_TAGTYPE = "DeviceBroker_Parameter_devices";

    @objid ("be8bc65e-e6a4-4e44-bb40-28465b72d6d5")
    public static final String DEVICEBROKER_PARAMETER_ISBUFFERED_TAGTYPE = "DeviceBroker_Parameter_isBuffered";

    @objid ("c46ae495-b248-4d43-9412-e7298c736e85")
    public static final String DEVICEBROKER_PARAMETER_OPENSERVICES_TAGTYPE = "DeviceBroker_Parameter_openServices";

    @objid ("76b2daa2-5491-467b-9fa3-297ffc5df095")
    public static final String DEVICEBROKER_PARAMETER_READSERVICES_TAGTYPE = "DeviceBroker_Parameter_readServices";

    @objid ("542f4f90-112b-47d8-b9e6-66e016791916")
    public static final String DEVICEBROKER_PARAMETER_WRITESERVICES_TAGTYPE = "DeviceBroker_Parameter_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << DeviceBroker_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b032e5b6-c1e2-4b0f-ade1-b9a4533c5184")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << DeviceBroker_Parameter >> then instantiate a {@link DeviceBrokerParameter} proxy.
     * 
     * @return a {@link DeviceBrokerParameter} proxy on the created {@link Parameter}.
     */
    @objid ("dca477ec-9124-4be0-b6d3-d780561b160c")
    public static DeviceBrokerParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerParameter.STEREOTYPE_NAME);
        return DeviceBrokerParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerParameter} proxy from a {@link Parameter} stereotyped << DeviceBroker_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link DeviceBrokerParameter} proxy or <i>null</i>.
     */
    @objid ("1aff1b60-e156-4325-bfa7-904ad5eeb69c")
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
    @objid ("136ccfce-d4cf-424c-9756-831c1ed9c6e8")
    public static DeviceBrokerParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (DeviceBrokerParameter.canInstantiate(obj))
        	return new DeviceBrokerParameter(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1e856fdd-77a1-4d05-8aac-028fb90c9702")
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
    @objid ("e6a17688-7519-46aa-a704-bb16e8a4c142")
    public String getDeviceBroker_Parameter_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Parameter_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("10e5e4b8-5685-4521-af62-a51686dc45d2")
    public List<String> getDeviceBroker_Parameter_closeServices() {
        return this.elt.getTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Parameter_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e8133105-1a00-4039-b787-7dd60d991e9b")
    public List<String> getDeviceBroker_Parameter_controlServices() {
        return this.elt.getTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Parameter_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9c0453bb-8f63-43ba-945d-d2bcab5f091c")
    public List<String> getDeviceBroker_Parameter_devices() {
        return this.elt.getTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Parameter_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c5039749-f3ee-4639-a1a4-5edd2d1c364d")
    public List<String> getDeviceBroker_Parameter_openServices() {
        return this.elt.getTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Parameter_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("71185922-8942-4b00-9666-9e8072e9153a")
    public List<String> getDeviceBroker_Parameter_readServices() {
        return this.elt.getTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Parameter_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8f6dd82a-bfc3-42bd-a38b-2ab2322e4652")
    public List<String> getDeviceBroker_Parameter_writeServices() {
        return this.elt.getTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("808e3a4c-6635-4f53-ad2c-84f564e39199")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("1c7da44d-8663-4688-ab93-2e3ff6ca4de3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Parameter_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1d1ab01a-1aaa-4c36-aeb4-1354e023b347")
    public boolean isDeviceBroker_Parameter_isBuffered() {
        return this.elt.isTagged(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Parameter_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a6c96ebc-e08e-4956-86b2-09066b1eb899")
    public void setDeviceBroker_Parameter_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Parameter_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0371cfd6-3428-4da4-a2fb-1be199b06812")
    public void setDeviceBroker_Parameter_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Parameter_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a0158761-0ad5-4c99-94c1-0b39049a185e")
    public void setDeviceBroker_Parameter_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Parameter_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a5c5fed6-b4ac-4526-ac4f-d9835ecc8072")
    public void setDeviceBroker_Parameter_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Parameter_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("16625e1a-4f55-4956-90aa-9f8a0579157f")
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
    @objid ("0433167a-d95e-4e7d-9654-a57795d943e5")
    public void setDeviceBroker_Parameter_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Parameter_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5e7588e9-0baa-4083-b44f-0f125f332b2d")
    public void setDeviceBroker_Parameter_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Parameter_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1dff811b-cb60-41ca-ac70-fa583c425507")
    public void setDeviceBroker_Parameter_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerParameter.MdaTypes.DEVICEBROKER_PARAMETER_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("103a7af9-a9b9-4638-9070-a4abac80391f")
    protected DeviceBrokerParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("65c1bbd7-ad38-4352-9a4e-f53edaba6415")
    public static final class MdaTypes {
        @objid ("d68f0767-144b-4729-a1fc-ab56839b748e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5a4a2b28-42d2-4afd-b20e-38ccb4e0b199")
        public static TagType DEVICEBROKER_PARAMETER_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("c946276a-c339-4a7b-a2fd-28c4a2a095d5")
        public static TagType DEVICEBROKER_PARAMETER_ISBUFFERED_TAGTYPE_ELT;

        @objid ("379e7e2b-9a15-4b99-aa41-b1e3225af940")
        public static TagType DEVICEBROKER_PARAMETER_DEVICES_TAGTYPE_ELT;

        @objid ("6b6f0cb6-03e8-43da-927d-521c6a437801")
        public static TagType DEVICEBROKER_PARAMETER_CLOSESERVICES_TAGTYPE_ELT;

        @objid ("dec5b3da-bbc0-4897-91be-6429c4919fb3")
        public static TagType DEVICEBROKER_PARAMETER_CONTROLSERVICES_TAGTYPE_ELT;

        @objid ("fa3e0ca9-3ea3-4d4f-a003-46aa243afce4")
        public static TagType DEVICEBROKER_PARAMETER_OPENSERVICES_TAGTYPE_ELT;

        @objid ("f2ec7350-5294-480e-a9da-acf4934a83e1")
        public static TagType DEVICEBROKER_PARAMETER_READSERVICES_TAGTYPE_ELT;

        @objid ("4f29f380-32c7-4c98-83a4-a3139989576c")
        public static TagType DEVICEBROKER_PARAMETER_WRITESERVICES_TAGTYPE_ELT;

        @objid ("ceed6c87-9cba-4849-8397-d14f8f7434e9")
        private static Stereotype MDAASSOCDEP;

        @objid ("91479eab-482d-4c56-a590-c48cbb970066")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b88c67a6-87bf-42be-bb74-a05dc3cc3a0d")
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
