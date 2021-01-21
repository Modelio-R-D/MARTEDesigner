/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.associationend.SwResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << DeviceBroker_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("100226d0-8b4f-4109-ae85-bb45edd1cd58")
public class DeviceBrokerAssociationEnd extends SwResourceAssociationEnd {
    @objid ("1c9236f2-1cee-4489-892e-53ec26d69c7c")
    public static final String STEREOTYPE_NAME = "DeviceBroker_AssociationEnd";

    @objid ("8aa91ddd-4554-4b78-a265-1f9bdbc90894")
    public static final String DEVICEBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE = "DeviceBroker_AssociationEnd_accessPolicy";

    @objid ("d7a24fbf-e01d-4e9a-abd2-0dafb67114ec")
    public static final String DEVICEBROKER_ASSOCIATIONEND_CLOSESERVICES_TAGTYPE = "DeviceBroker_AssociationEnd_closeServices";

    @objid ("52e25bd1-4a69-4f5e-9fea-8d88de953b8b")
    public static final String DEVICEBROKER_ASSOCIATIONEND_CONTROLSERVICES_TAGTYPE = "DeviceBroker_AssociationEnd_controlServices";

    @objid ("74d8a886-36f2-4324-b0d0-0e1b131565f6")
    public static final String DEVICEBROKER_ASSOCIATIONEND_DEVICES_TAGTYPE = "DeviceBroker_AssociationEnd_devices";

    @objid ("3fdcb2d3-1dbf-46ad-9448-b1d9349bbfd5")
    public static final String DEVICEBROKER_ASSOCIATIONEND_ISBUFFERED_TAGTYPE = "DeviceBroker_AssociationEnd_isBuffered";

    @objid ("3d673261-4d2b-4195-9037-42d943bfbf67")
    public static final String DEVICEBROKER_ASSOCIATIONEND_OPENSERVICES_TAGTYPE = "DeviceBroker_AssociationEnd_openServices";

    @objid ("be7820ae-cc2b-4f3f-affc-c67a5d332989")
    public static final String DEVICEBROKER_ASSOCIATIONEND_READSERVICES_TAGTYPE = "DeviceBroker_AssociationEnd_readServices";

    @objid ("412881c9-b183-4166-8ba2-899289ca6620")
    public static final String DEVICEBROKER_ASSOCIATIONEND_WRITESERVICES_TAGTYPE = "DeviceBroker_AssociationEnd_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << DeviceBroker_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("cf25ded0-4e62-45fe-9dcc-1efac4bd1349")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << DeviceBroker_AssociationEnd >> then instantiate a {@link DeviceBrokerAssociationEnd} proxy.
     * 
     * @return a {@link DeviceBrokerAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("a0b9ecd9-9b75-49f3-b82d-6ab1ffeb4f14")
    public static DeviceBrokerAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerAssociationEnd.STEREOTYPE_NAME);
        return DeviceBrokerAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << DeviceBroker_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link DeviceBrokerAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("f18492c5-5622-4375-b9a2-5b88ef6297a8")
    public static DeviceBrokerAssociationEnd instantiate(final AssociationEnd obj) {
        return DeviceBrokerAssociationEnd.canInstantiate(obj) ? new DeviceBrokerAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << DeviceBroker_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link DeviceBrokerAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8d3851cb-4b19-400e-9dbf-b487e137ad3d")
    public static DeviceBrokerAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (DeviceBrokerAssociationEnd.canInstantiate(obj))
        	return new DeviceBrokerAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a5add67d-a838-4959-8a81-afa7724c3889")
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
        DeviceBrokerAssociationEnd other = (DeviceBrokerAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DeviceBroker_AssociationEnd_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9fa86a1a-3eb5-4031-a8ea-2d1ed324801f")
    public String getDeviceBroker_AssociationEnd_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_AssociationEnd_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("58fa7f53-c3b3-4b84-bc8c-7d6d470a274c")
    public List<String> getDeviceBroker_AssociationEnd_closeServices() {
        return this.elt.getTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_AssociationEnd_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("eb9fcea4-6be4-48e4-83f6-b4f60ce726ce")
    public List<String> getDeviceBroker_AssociationEnd_controlServices() {
        return this.elt.getTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_AssociationEnd_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6e231cf8-9bd6-4355-b861-14bcb7e16f21")
    public List<String> getDeviceBroker_AssociationEnd_devices() {
        return this.elt.getTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_AssociationEnd_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("438058c9-62a4-4ab4-a918-d57028799f8f")
    public List<String> getDeviceBroker_AssociationEnd_openServices() {
        return this.elt.getTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_AssociationEnd_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4e75f49a-6d45-4cb1-9eee-87700710fcd7")
    public List<String> getDeviceBroker_AssociationEnd_readServices() {
        return this.elt.getTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_AssociationEnd_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1e5708d5-d93d-4e85-ab6e-8878fcce4ee2")
    public List<String> getDeviceBroker_AssociationEnd_writeServices() {
        return this.elt.getTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("6e6fb814-2578-401d-84cd-5b0330ee9994")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("0a8e0625-8a20-4f47-b805-ffc0f7224122")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_AssociationEnd_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("56d88f20-c26a-4755-86b2-ac6a3cb28ff0")
    public boolean isDeviceBroker_AssociationEnd_isBuffered() {
        return this.elt.isTagged(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_AssociationEnd_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa03ed71-0b3b-4746-8f7e-d4d7537cfa72")
    public void setDeviceBroker_AssociationEnd_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_AssociationEnd_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ece67969-906d-4c05-b484-33b63ae80526")
    public void setDeviceBroker_AssociationEnd_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_AssociationEnd_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("34047bd0-e608-4dc0-a4c7-7b0cd9249b69")
    public void setDeviceBroker_AssociationEnd_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_AssociationEnd_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45ae7e1a-d1aa-4e83-8bf2-9429df31e339")
    public void setDeviceBroker_AssociationEnd_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_AssociationEnd_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7b494579-89fd-42d5-b34f-cec3c884db2f")
    public void setDeviceBroker_AssociationEnd_isBuffered(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_ISBUFFERED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_AssociationEnd_openServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("63384b17-7de1-4a31-bafd-9d5ef522dc25")
    public void setDeviceBroker_AssociationEnd_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_AssociationEnd_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ddb2a92-e853-4be1-8206-5bb9c57c6a6d")
    public void setDeviceBroker_AssociationEnd_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_AssociationEnd_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("55ca75d8-e140-4d3c-84ae-8bf4adcb8f91")
    public void setDeviceBroker_AssociationEnd_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("3827be61-8154-4c70-b6e8-42b62a5dab83")
    protected DeviceBrokerAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("61eaf0fc-5002-419d-8573-cf12e2f8de19")
    public static final class MdaTypes {
        @objid ("42680c3d-9fb7-4ec7-a652-e3b5c1fd7ef0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3ec48eb3-8fd5-48c5-86b7-018ca42fd5f1")
        public static TagType DEVICEBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("6cab9c76-cc1b-46dd-8059-654505ed0fe9")
        public static TagType DEVICEBROKER_ASSOCIATIONEND_ISBUFFERED_TAGTYPE_ELT;

        @objid ("3420f40a-0b0b-4dd4-bbf5-90bf9c4f9db9")
        public static TagType DEVICEBROKER_ASSOCIATIONEND_DEVICES_TAGTYPE_ELT;

        @objid ("fe2c4e31-311c-4dff-bf46-8aaa16515a70")
        public static TagType DEVICEBROKER_ASSOCIATIONEND_CLOSESERVICES_TAGTYPE_ELT;

        @objid ("b96ccf89-d563-4c4e-afd2-b076a291603a")
        public static TagType DEVICEBROKER_ASSOCIATIONEND_CONTROLSERVICES_TAGTYPE_ELT;

        @objid ("71baef68-bd2f-4a63-8fd2-e12d9c5fe43a")
        public static TagType DEVICEBROKER_ASSOCIATIONEND_OPENSERVICES_TAGTYPE_ELT;

        @objid ("dff1beda-dee7-4f1f-828a-fc19a7a9d80a")
        public static TagType DEVICEBROKER_ASSOCIATIONEND_READSERVICES_TAGTYPE_ELT;

        @objid ("afd2c7b2-7f21-4eee-a09a-c457c9350c03")
        public static TagType DEVICEBROKER_ASSOCIATIONEND_WRITESERVICES_TAGTYPE_ELT;

        @objid ("228108f6-1c7c-4803-bbae-8c83fde28bd9")
        private static Stereotype MDAASSOCDEP;

        @objid ("4beb8524-22ed-4da6-b465-9f546218799d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d5beac2c-38c8-4923-9ab1-43b6f9cac46b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01fb5c36-0ccf-11df-8525-001302895b2b");
            DEVICEBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0f008675-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ASSOCIATIONEND_ISBUFFERED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0f008676-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ASSOCIATIONEND_DEVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0f008677-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ASSOCIATIONEND_CLOSESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0f008678-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ASSOCIATIONEND_CONTROLSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0f008679-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ASSOCIATIONEND_OPENSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0f00867a-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ASSOCIATIONEND_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0f00867b-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ASSOCIATIONEND_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0f00867c-172e-11df-b92a-0014222a9f79");
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
