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
@objid ("78ee2546-81d9-4ca8-9836-3eb5186d9b14")
public class DeviceBrokerAttribute extends SwResourceAttribute {
    @objid ("bccbf9c4-fbdb-48f5-a054-b57f0f562fcf")
    public static final String STEREOTYPE_NAME = "DeviceBroker_Attribute";

    @objid ("2173f5a7-124b-4671-a1a3-7e8bd7520fe9")
    public static final String DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Attribute_accessPolicy";

    @objid ("066da80a-956a-44be-a491-b136144303b0")
    public static final String DEVICEBROKER_ATTRIBUTE_CLOSESERVICES_TAGTYPE = "DeviceBroker_Attribute_closeServices";

    @objid ("e60a5ba5-c7a3-4a29-b0a0-436af4453d7d")
    public static final String DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Attribute_controlServices";

    @objid ("b25ff745-0920-4482-b6a5-41388b2a188a")
    public static final String DEVICEBROKER_ATTRIBUTE_DEVICES_TAGTYPE = "DeviceBroker_Attribute_devices";

    @objid ("198a0e4b-1d55-4004-af9a-41e94da0cb1b")
    public static final String DEVICEBROKER_ATTRIBUTE_ISBUFFERED_TAGTYPE = "DeviceBroker_Attribute_isBuffered";

    @objid ("c142b2ad-dd26-4c94-ad7f-cc0f8af98f1c")
    public static final String DEVICEBROKER_ATTRIBUTE_OPENSERVICES_TAGTYPE = "DeviceBroker_Attribute_openServices";

    @objid ("dc301d1d-ded6-47b0-bae4-b8ab98d6b4d0")
    public static final String DEVICEBROKER_ATTRIBUTE_READSERVICES_TAGTYPE = "DeviceBroker_Attribute_readServices";

    @objid ("d27b4a10-077a-410c-8e28-98d69b3b0dcb")
    public static final String DEVICEBROKER_ATTRIBUTE_WRITESERVICES_TAGTYPE = "DeviceBroker_Attribute_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << DeviceBroker_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2b0bc8d7-ed21-43b2-99ca-02ff539f26e8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << DeviceBroker_Attribute >> then instantiate a {@link DeviceBrokerAttribute} proxy.
     * 
     * @return a {@link DeviceBrokerAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("078b8e3b-e15b-407e-8b92-a49509754791")
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
    @objid ("65c2aa6a-d849-420a-a932-c9826c11c821")
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
    @objid ("e967b5f6-84b2-4a55-af6b-216ed11db8d1")
    public static DeviceBrokerAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (DeviceBrokerAttribute.canInstantiate(obj))
        	return new DeviceBrokerAttribute(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8f874f76-11ff-4666-9861-ab024c63b4fd")
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
    @objid ("a626f109-0d5e-419b-a9f4-0dd80584b430")
    public String getDeviceBroker_Attribute_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dc2d1ff5-401f-42b8-b662-6f818e0f51a3")
    public List<String> getDeviceBroker_Attribute_closeServices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0348b102-0aaa-4698-8c45-3feab71fc86f")
    public List<String> getDeviceBroker_Attribute_controlServices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dce0c8eb-af8d-45f3-bd0a-e59a1542296b")
    public List<String> getDeviceBroker_Attribute_devices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bb7c7afc-43b1-4df5-b7a8-95e38d75fc61")
    public List<String> getDeviceBroker_Attribute_openServices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9a97718d-a7f4-4a4d-8d8c-1b779a79ede9")
    public List<String> getDeviceBroker_Attribute_readServices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("65df4581-f08e-4df7-ad66-6ad025bd6109")
    public List<String> getDeviceBroker_Attribute_writeServices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("a7df0ea9-827d-4b6d-813e-471ee09f19a4")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("c373af08-0c73-4dc5-a3af-2e7dbff82ea4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Attribute_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("20e0044a-d5c9-4966-ab76-c225e27a4cff")
    public boolean isDeviceBroker_Attribute_isBuffered() {
        return this.elt.isTagged(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Attribute_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("32b05187-3ec4-4854-8270-d3e83d872428")
    public void setDeviceBroker_Attribute_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3312130c-5395-4956-9ca3-dc76fdde3fb4")
    public void setDeviceBroker_Attribute_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("19c65487-3ebc-4fae-ad89-7588f07de3da")
    public void setDeviceBroker_Attribute_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("77f0c88e-6623-4836-8d77-df8ffa057005")
    public void setDeviceBroker_Attribute_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Attribute_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("477f63d5-0407-4b75-b408-7f02e1e155e2")
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
    @objid ("1a86775a-02e1-47bf-9618-6c36a50fdc73")
    public void setDeviceBroker_Attribute_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("594726f5-9a1f-41db-a763-f37619aa7090")
    public void setDeviceBroker_Attribute_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("325b76c2-a2d3-4b75-8a23-5b01a7c68eeb")
    public void setDeviceBroker_Attribute_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("c60f5f00-dac5-41ad-a0b4-9c02f6a5efba")
    protected DeviceBrokerAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("6a3cf3ec-cb65-4db4-b877-7befb1519ea2")
    public static final class MdaTypes {
        @objid ("e968e21c-fe6d-4752-a660-73a35b4dbbdc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a60aee56-3214-42e9-abe5-a65bd9103f91")
        public static TagType DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("0e3e4077-d5f3-42b2-b2ac-fd022b5185f2")
        public static TagType DEVICEBROKER_ATTRIBUTE_ISBUFFERED_TAGTYPE_ELT;

        @objid ("3cd7caac-f604-4acb-953b-84c532dcb6fc")
        public static TagType DEVICEBROKER_ATTRIBUTE_DEVICES_TAGTYPE_ELT;

        @objid ("76f90bb5-8dfa-4ef7-b0db-1476f7cc681e")
        public static TagType DEVICEBROKER_ATTRIBUTE_CLOSESERVICES_TAGTYPE_ELT;

        @objid ("1f57ab1c-8e45-452e-9ed1-eb5be19bb99f")
        public static TagType DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES_TAGTYPE_ELT;

        @objid ("c2c54b71-84c3-4f07-808f-dd6de16f4f0b")
        public static TagType DEVICEBROKER_ATTRIBUTE_OPENSERVICES_TAGTYPE_ELT;

        @objid ("f20e31b9-ec32-4055-98e0-1ca231ad7221")
        public static TagType DEVICEBROKER_ATTRIBUTE_READSERVICES_TAGTYPE_ELT;

        @objid ("ac9e383d-4a46-45aa-8424-c239378a18bc")
        public static TagType DEVICEBROKER_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT;

        @objid ("8d796b6b-4a71-43a5-a1b7-82e9bf00b6ba")
        private static Stereotype MDAASSOCDEP;

        @objid ("9dd0da62-2e76-430e-ad12-43c8f499e05b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1886880f-823c-4210-9d74-6ec8666ef233")
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
