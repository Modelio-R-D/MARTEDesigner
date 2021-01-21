/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.instance.SwResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << DeviceBroker_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7d323296-8b82-4926-918d-6597976d1184")
public class DeviceBrokerInstance extends SwResourceInstance {
    @objid ("6bf13244-6f3e-4c8f-9df1-8fa255cbca9b")
    public static final String STEREOTYPE_NAME = "DeviceBroker_Instance";

    @objid ("f1d04df6-9db7-46da-88e8-1e7b2c00c8f8")
    public static final String DEVICEBROKER_INSTANCE_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Instance_accessPolicy";

    @objid ("0c0cfa03-701f-4e1e-a76a-639d5685f799")
    public static final String DEVICEBROKER_INSTANCE_CLOSESERVICES_TAGTYPE = "DeviceBroker_Instance_closeServices";

    @objid ("bed2b573-5230-4625-beec-93ce8b26840a")
    public static final String DEVICEBROKER_INSTANCE_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Instance_controlServices";

    @objid ("03bac3bf-6275-4bf9-969b-134cdf583b5f")
    public static final String DEVICEBROKER_INSTANCE_DEVICES_TAGTYPE = "DeviceBroker_Instance_devices";

    @objid ("b72f7195-144e-47e2-b9d0-6572f8a1871e")
    public static final String DEVICEBROKER_INSTANCE_ISBUFFERED_TAGTYPE = "DeviceBroker_Instance_isBuffered";

    @objid ("5426bf2d-2127-4dbc-9986-7b54ea0e32dd")
    public static final String DEVICEBROKER_INSTANCE_OPENSERVICES_TAGTYPE = "DeviceBroker_Instance_openServices";

    @objid ("00e56ee9-880d-4476-bf6e-cbbf743e908b")
    public static final String DEVICEBROKER_INSTANCE_READSERVICES_TAGTYPE = "DeviceBroker_Instance_readServices";

    @objid ("77c04e9c-8fd5-4761-bfb8-ea04b9c3ce8d")
    public static final String DEVICEBROKER_INSTANCE_WRITESERVICES_TAGTYPE = "DeviceBroker_Instance_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << DeviceBroker_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b79aa420-b122-4239-8921-336d98e5fc17")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << DeviceBroker_Instance >> then instantiate a {@link DeviceBrokerInstance} proxy.
     * 
     * @return a {@link DeviceBrokerInstance} proxy on the created {@link Instance}.
     */
    @objid ("5283f78b-8872-4b9d-ac0f-90bc36233194")
    public static DeviceBrokerInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerInstance.STEREOTYPE_NAME);
        return DeviceBrokerInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerInstance} proxy from a {@link Instance} stereotyped << DeviceBroker_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link DeviceBrokerInstance} proxy or <i>null</i>.
     */
    @objid ("7b8caf44-bc5e-4c88-830e-91c8dd09ed02")
    public static DeviceBrokerInstance instantiate(final Instance obj) {
        return DeviceBrokerInstance.canInstantiate(obj) ? new DeviceBrokerInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerInstance} proxy from a {@link Instance} stereotyped << DeviceBroker_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link DeviceBrokerInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0774f773-4ac5-4b8e-a6db-a6b09a5020bf")
    public static DeviceBrokerInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (DeviceBrokerInstance.canInstantiate(obj))
        	return new DeviceBrokerInstance(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c2722cb6-40d1-438e-9f7e-60126f4ef5a0")
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
        DeviceBrokerInstance other = (DeviceBrokerInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DeviceBroker_Instance_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fad05a23-ce98-47f4-a784-fca4e8ec33f7")
    public String getDeviceBroker_Instance_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Instance_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6e30c358-93f9-4209-b5bf-d3a6345eb995")
    public List<String> getDeviceBroker_Instance_closeServices() {
        return this.elt.getTagValues(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Instance_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1aa6dc9b-fa27-4b3e-81d6-34944a744650")
    public List<String> getDeviceBroker_Instance_controlServices() {
        return this.elt.getTagValues(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Instance_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("df27519d-958f-409c-90c5-2806af3bbc3c")
    public List<String> getDeviceBroker_Instance_devices() {
        return this.elt.getTagValues(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Instance_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("98d8f995-87bb-45f3-8c39-4fdb39cd2d25")
    public List<String> getDeviceBroker_Instance_openServices() {
        return this.elt.getTagValues(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Instance_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c9b946f9-ee05-499a-b854-816a2b70fc94")
    public List<String> getDeviceBroker_Instance_readServices() {
        return this.elt.getTagValues(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Instance_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("df5c40eb-0059-4a61-a707-6e4cf0ba14e4")
    public List<String> getDeviceBroker_Instance_writeServices() {
        return this.elt.getTagValues(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("66e5bcb3-811b-4b50-b291-0c3f5d07e85c")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("835f099f-9567-43ce-b404-85a77f7d484d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Instance_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e02e7f0e-e050-4be5-b862-ef58a089b359")
    public boolean isDeviceBroker_Instance_isBuffered() {
        return this.elt.isTagged(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Instance_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("afdf83b1-a0db-4d11-bfb7-c7651eccfd4a")
    public void setDeviceBroker_Instance_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Instance_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("57182f2d-84b6-4ad6-9c72-665c5ed499e9")
    public void setDeviceBroker_Instance_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Instance_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3c4e0566-c12c-49ce-a5df-1249db9486a6")
    public void setDeviceBroker_Instance_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Instance_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2efc28da-b7ab-4b5d-864b-39428b45d1ff")
    public void setDeviceBroker_Instance_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Instance_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1562850-f4be-4799-8a8b-c72511df9e2b")
    public void setDeviceBroker_Instance_isBuffered(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_ISBUFFERED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Instance_openServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e43c397a-97d2-4482-9f0f-7b74ef7f1dbf")
    public void setDeviceBroker_Instance_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Instance_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("92c69859-46d7-4d3e-8fa9-0f2b1f69e305")
    public void setDeviceBroker_Instance_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Instance_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b3d2d1d9-823c-41f6-a3c4-36e0882298ea")
    public void setDeviceBroker_Instance_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerInstance.MdaTypes.DEVICEBROKER_INSTANCE_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("fc02b3fc-1719-4eb3-bfc2-c90d8aef17a4")
    protected DeviceBrokerInstance(final Instance elt) {
        super(elt);
    }

    @objid ("715b92b9-4f05-4733-8ab3-d032354e312d")
    public static final class MdaTypes {
        @objid ("a639e71b-088e-46b3-ae5e-5056ab4692d3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e9422f5a-e4ae-44ac-81df-a06f5ac1b8cd")
        public static TagType DEVICEBROKER_INSTANCE_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("8313d6a5-c8c9-4f92-833f-da8daffa468a")
        public static TagType DEVICEBROKER_INSTANCE_ISBUFFERED_TAGTYPE_ELT;

        @objid ("f47f021c-d236-4585-aa42-ac9aab1321eb")
        public static TagType DEVICEBROKER_INSTANCE_DEVICES_TAGTYPE_ELT;

        @objid ("ab4f0648-68e5-4f5f-a9e7-867691c6a456")
        public static TagType DEVICEBROKER_INSTANCE_CLOSESERVICES_TAGTYPE_ELT;

        @objid ("ec4c217e-c125-46c3-b217-eb13c9da6320")
        public static TagType DEVICEBROKER_INSTANCE_CONTROLSERVICES_TAGTYPE_ELT;

        @objid ("98e87897-4416-4e2f-8beb-b1866ad0edc5")
        public static TagType DEVICEBROKER_INSTANCE_OPENSERVICES_TAGTYPE_ELT;

        @objid ("ad34aafb-661a-4ede-b0b5-4d1bf885e337")
        public static TagType DEVICEBROKER_INSTANCE_READSERVICES_TAGTYPE_ELT;

        @objid ("7a131576-567a-4425-b629-0672c76103cf")
        public static TagType DEVICEBROKER_INSTANCE_WRITESERVICES_TAGTYPE_ELT;

        @objid ("0b2bf9ac-2d4d-4a00-a83e-4585e20a4383")
        private static Stereotype MDAASSOCDEP;

        @objid ("96c30ce4-708d-4d07-94c2-5de6c22e01e1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f18d28ff-1fd5-4c24-864a-b6037bf3f5fe")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01fb5c3b-0ccf-11df-8525-001302895b2b");
            DEVICEBROKER_INSTANCE_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0bf9a7a9-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_INSTANCE_ISBUFFERED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0bf9a7aa-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_INSTANCE_DEVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0bf9a7ab-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_INSTANCE_CLOSESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0bf9a7ac-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_INSTANCE_CONTROLSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0bf9a7ad-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_INSTANCE_OPENSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0bf9a7ae-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_INSTANCE_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0bf9a7af-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_INSTANCE_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0bf9a7b0-172e-11df-b92a-0014222a9f79");
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
