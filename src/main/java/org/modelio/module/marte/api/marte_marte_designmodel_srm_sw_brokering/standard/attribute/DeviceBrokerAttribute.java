/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("85c1608a-6ede-4704-b0f7-8b0d721ce8bd")
    public static final String STEREOTYPE_NAME = "DeviceBroker_Attribute";

    @objid ("816d6ba3-4c35-4623-a5ca-b56b2a824b15")
    public static final String DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Attribute_accessPolicy";

    @objid ("93df89b2-4891-4f09-853a-83dcfee3d689")
    public static final String DEVICEBROKER_ATTRIBUTE_CLOSESERVICES_TAGTYPE = "DeviceBroker_Attribute_closeServices";

    @objid ("97e0cbec-13fe-487b-b0ec-0ffed7b62062")
    public static final String DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Attribute_controlServices";

    @objid ("cee243e1-89bb-4228-bea2-a68fadc976d8")
    public static final String DEVICEBROKER_ATTRIBUTE_DEVICES_TAGTYPE = "DeviceBroker_Attribute_devices";

    @objid ("a84f82c0-8860-40b2-adb7-4706980926a1")
    public static final String DEVICEBROKER_ATTRIBUTE_ISBUFFERED_TAGTYPE = "DeviceBroker_Attribute_isBuffered";

    @objid ("bc6e72ca-974a-4a17-bd38-2544e1ee4a1b")
    public static final String DEVICEBROKER_ATTRIBUTE_OPENSERVICES_TAGTYPE = "DeviceBroker_Attribute_openServices";

    @objid ("4f7fbb44-ad3e-4f7f-9cf8-0b6f6e9700c1")
    public static final String DEVICEBROKER_ATTRIBUTE_READSERVICES_TAGTYPE = "DeviceBroker_Attribute_readServices";

    @objid ("4d1faa7c-8d09-4c83-b9fe-89a65bdd1cf2")
    public static final String DEVICEBROKER_ATTRIBUTE_WRITESERVICES_TAGTYPE = "DeviceBroker_Attribute_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << DeviceBroker_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8de2b5bc-6491-4b5e-bd94-2db426acb099")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << DeviceBroker_Attribute >> then instantiate a {@link DeviceBrokerAttribute} proxy.
     * 
     * @return a {@link DeviceBrokerAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("541fed04-0af3-4c7b-8b0b-5a3c6533d205")
    public static DeviceBrokerAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerAttribute.STEREOTYPE_NAME);
        return DeviceBrokerAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerAttribute} proxy from a {@link Attribute} stereotyped << DeviceBroker_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link DeviceBrokerAttribute} proxy or <i>null</i>.
     */
    @objid ("1caec9d6-5658-407e-914a-f8710582fab4")
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
    @objid ("5abe1aa0-52ff-4f09-922c-9c8a8b6e9f87")
    public static DeviceBrokerAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (DeviceBrokerAttribute.canInstantiate(obj))
        	return new DeviceBrokerAttribute(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2b8801af-b6a7-406d-8a8e-20b0fda42fc7")
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
    @objid ("92d37b3c-df67-48e8-b288-4f4618254d57")
    public String getDeviceBroker_Attribute_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c77e5cd6-8783-41e2-82fe-a399590f831f")
    public List<String> getDeviceBroker_Attribute_closeServices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("742496db-f48c-457d-9670-1dbdb84c3aab")
    public List<String> getDeviceBroker_Attribute_controlServices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c5bd8c0e-c3f9-49a6-b993-2386ed6117a6")
    public List<String> getDeviceBroker_Attribute_devices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9ef5e5f1-e936-4ca7-8502-89c920dc556b")
    public List<String> getDeviceBroker_Attribute_openServices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4b63d22d-ff23-4433-a69a-b989bf93fa6f")
    public List<String> getDeviceBroker_Attribute_readServices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Attribute_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9b3b9bd1-ac92-4b66-9b6a-0604cbe857fe")
    public List<String> getDeviceBroker_Attribute_writeServices() {
        return this.elt.getTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("f165923e-9c49-4b6c-b20e-0786bae818a3")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("c7395fb4-8979-4f86-bc69-7d8d48c7d7a8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Attribute_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7946693e-9540-422f-a05b-feba4fbbad6e")
    public boolean isDeviceBroker_Attribute_isBuffered() {
        return this.elt.isTagged(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Attribute_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ff5ebee2-e83e-4f12-a90e-0b2a8506baf5")
    public void setDeviceBroker_Attribute_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("59c24bf0-79e4-4f55-bd84-dcf5c5ada464")
    public void setDeviceBroker_Attribute_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("595f573a-70e1-49f9-a8ad-a85490b25e21")
    public void setDeviceBroker_Attribute_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fc3efca2-011c-4e90-8f7b-d478d02b7072")
    public void setDeviceBroker_Attribute_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Attribute_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90ba7649-889e-4c4d-839c-e6020c200928")
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
    @objid ("e4e46543-261d-49e9-abfd-1d8ea93d8ff2")
    public void setDeviceBroker_Attribute_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a0d0f02-b7bc-472e-b30a-cb34ebef9ec3")
    public void setDeviceBroker_Attribute_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Attribute_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db3184b1-bf7b-4bce-8960-340f78c4f41d")
    public void setDeviceBroker_Attribute_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAttribute.MdaTypes.DEVICEBROKER_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("0c4ad897-5f8e-4c20-9d73-970cec033346")
    protected DeviceBrokerAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("6a3cf3ec-cb65-4db4-b877-7befb1519ea2")
    public static final class MdaTypes {
        @objid ("882d476e-3948-4efd-bb6d-3e1123fc1388")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("666aa3eb-6f27-40e3-88af-7f47b9d6405e")
        public static TagType DEVICEBROKER_ATTRIBUTE_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("cb399398-cbab-42d5-b740-a5bf280e7387")
        public static TagType DEVICEBROKER_ATTRIBUTE_ISBUFFERED_TAGTYPE_ELT;

        @objid ("7177832c-3056-4d45-8ae3-caf5089dde8a")
        public static TagType DEVICEBROKER_ATTRIBUTE_DEVICES_TAGTYPE_ELT;

        @objid ("3144bfe4-0937-4c0d-8995-2c27c90d868c")
        public static TagType DEVICEBROKER_ATTRIBUTE_CLOSESERVICES_TAGTYPE_ELT;

        @objid ("366166c8-04b7-4b12-9393-3ad07917d765")
        public static TagType DEVICEBROKER_ATTRIBUTE_CONTROLSERVICES_TAGTYPE_ELT;

        @objid ("5f9ce8ea-5fa5-4c29-b8b1-a6f4716bf32a")
        public static TagType DEVICEBROKER_ATTRIBUTE_OPENSERVICES_TAGTYPE_ELT;

        @objid ("9e50e3f7-f955-48ba-b861-bc5f4c09fbb4")
        public static TagType DEVICEBROKER_ATTRIBUTE_READSERVICES_TAGTYPE_ELT;

        @objid ("d78fb490-42a6-4e9e-bcea-feec026d76f5")
        public static TagType DEVICEBROKER_ATTRIBUTE_WRITESERVICES_TAGTYPE_ELT;

        @objid ("a7768bd8-60ac-4474-868e-329ab958a722")
        private static Stereotype MDAASSOCDEP;

        @objid ("c21645e9-7f96-43aa-9cd5-4588a98dc954")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("910c974f-2dd2-40eb-a5a1-7e06f7d4d724")
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
