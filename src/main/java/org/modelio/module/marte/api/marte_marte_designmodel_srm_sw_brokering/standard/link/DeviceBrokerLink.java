/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.link.SwResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << DeviceBroker_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3753cd13-b18c-4615-bb69-bab8dd90cf37")
public class DeviceBrokerLink extends SwResourceLink {
    @objid ("c516e683-a69a-4000-986e-fd3fb4453a45")
    public static final String STEREOTYPE_NAME = "DeviceBroker_Link";

    @objid ("6d2e01af-3cd0-4bc7-b334-53eca20b2e35")
    public static final String DEVICEBROKER_LINK_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Link_accessPolicy";

    @objid ("a1c9fd9f-7be2-4aa1-bb25-7fe63c7aaf45")
    public static final String DEVICEBROKER_LINK_CLOSESERVICES_TAGTYPE = "DeviceBroker_Link_closeServices";

    @objid ("ccc94e1b-441e-4519-a2b4-3a978cc93007")
    public static final String DEVICEBROKER_LINK_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Link_controlServices";

    @objid ("60f9de67-a6f6-4af5-8e8c-2fbc4e700dbe")
    public static final String DEVICEBROKER_LINK_DEVICES_TAGTYPE = "DeviceBroker_Link_devices";

    @objid ("a9546721-96b6-4a0a-98d6-408c943168a3")
    public static final String DEVICEBROKER_LINK_ISBUFFERED_TAGTYPE = "DeviceBroker_Link_isBuffered";

    @objid ("80d4475b-1752-415b-9eea-bbbe3a505a27")
    public static final String DEVICEBROKER_LINK_OPENSERVICES_TAGTYPE = "DeviceBroker_Link_openServices";

    @objid ("d0c6df58-6586-4f5b-989f-6beff30719dc")
    public static final String DEVICEBROKER_LINK_READSERVICES_TAGTYPE = "DeviceBroker_Link_readServices";

    @objid ("a1f67092-240e-4e8b-abd3-e18d745e47cc")
    public static final String DEVICEBROKER_LINK_WRITESERVICES_TAGTYPE = "DeviceBroker_Link_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << DeviceBroker_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("beb7ca49-9d03-4864-8fbb-0c702d798d83")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << DeviceBroker_Link >> then instantiate a {@link DeviceBrokerLink} proxy.
     * 
     * @return a {@link DeviceBrokerLink} proxy on the created {@link Link}.
     */
    @objid ("25c4ce9d-1825-437a-a018-c2d1c197c6d1")
    public static DeviceBrokerLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerLink.STEREOTYPE_NAME);
        return DeviceBrokerLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerLink} proxy from a {@link Link} stereotyped << DeviceBroker_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link DeviceBrokerLink} proxy or <i>null</i>.
     */
    @objid ("44477a5c-ee5c-4d49-b8f7-c030d11e9062")
    public static DeviceBrokerLink instantiate(final Link obj) {
        return DeviceBrokerLink.canInstantiate(obj) ? new DeviceBrokerLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerLink} proxy from a {@link Link} stereotyped << DeviceBroker_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link DeviceBrokerLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6a526b3f-c4ac-4989-b309-88d14742d4bd")
    public static DeviceBrokerLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (DeviceBrokerLink.canInstantiate(obj))
        	return new DeviceBrokerLink(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("47488775-4743-4aa7-9efe-71b3f236280e")
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
        DeviceBrokerLink other = (DeviceBrokerLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DeviceBroker_Link_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c9f5b5da-c4a8-4fb4-8bce-05ceb7a9e058")
    public String getDeviceBroker_Link_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Link_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6468b589-4fbf-4ba6-800e-0aebd6301bff")
    public List<String> getDeviceBroker_Link_closeServices() {
        return this.elt.getTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Link_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8c3fa4f5-c1b8-4911-85ad-2173cd892b86")
    public List<String> getDeviceBroker_Link_controlServices() {
        return this.elt.getTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Link_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d5543554-c0c7-4194-8b35-b708538bbe35")
    public List<String> getDeviceBroker_Link_devices() {
        return this.elt.getTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Link_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("80c4774a-38e7-421f-8ab9-3c7a55d18a2b")
    public List<String> getDeviceBroker_Link_openServices() {
        return this.elt.getTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Link_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a4678446-5f5b-4830-8eb2-4ba0741a0c83")
    public List<String> getDeviceBroker_Link_readServices() {
        return this.elt.getTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Link_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2fe9e2ec-e55a-4280-b101-1f5b9800e340")
    public List<String> getDeviceBroker_Link_writeServices() {
        return this.elt.getTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("a084987d-6619-4766-a096-60d6b8e6da8b")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("64044858-5772-46e4-a08d-eff5df1495c3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Link_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("426f2574-2747-459d-a6f2-04062b5e11df")
    public boolean isDeviceBroker_Link_isBuffered() {
        return this.elt.isTagged(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Link_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d82fcfc5-cf90-4558-a197-95a5f0eb72da")
    public void setDeviceBroker_Link_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Link_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f22afbf9-a0e9-4a21-b391-057aff0a9e83")
    public void setDeviceBroker_Link_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Link_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b95da8ee-cd6e-46fc-bd5a-3f66d50870b0")
    public void setDeviceBroker_Link_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Link_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21bd6704-889b-43f5-aba4-76c9db489cd5")
    public void setDeviceBroker_Link_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Link_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f71853a-bfc9-4a15-958c-c3631fb309c9")
    public void setDeviceBroker_Link_isBuffered(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_ISBUFFERED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Link_openServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db117347-5da4-4ff2-a9de-1196d5d47389")
    public void setDeviceBroker_Link_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Link_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("877a0562-3cc5-402d-87da-49f5cfcc8495")
    public void setDeviceBroker_Link_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Link_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c02af82d-5d24-45e3-8821-1c0aafa7a108")
    public void setDeviceBroker_Link_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("5ce94f10-2620-4b0d-bdce-c724a5790bee")
    protected DeviceBrokerLink(final Link elt) {
        super(elt);
    }

    @objid ("7ac1fb9d-aee0-4f03-9889-ecf2ff7c2fc3")
    public static final class MdaTypes {
        @objid ("72b10cdb-4968-4e7d-afb8-76855c9f8530")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("67f9a8b6-c2c2-467f-8739-91fca49a6c37")
        public static TagType DEVICEBROKER_LINK_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("98d001d4-f715-4ab8-840d-8e4abeb06284")
        public static TagType DEVICEBROKER_LINK_ISBUFFERED_TAGTYPE_ELT;

        @objid ("13d25f36-95ce-4bbf-af34-6814c9298c2b")
        public static TagType DEVICEBROKER_LINK_DEVICES_TAGTYPE_ELT;

        @objid ("8859ef58-e056-4544-9d08-d154991704eb")
        public static TagType DEVICEBROKER_LINK_CLOSESERVICES_TAGTYPE_ELT;

        @objid ("bf3a454d-05ac-4648-a13d-c94a4f08ff05")
        public static TagType DEVICEBROKER_LINK_CONTROLSERVICES_TAGTYPE_ELT;

        @objid ("41359330-2a20-49c8-8f05-d27aedea189a")
        public static TagType DEVICEBROKER_LINK_OPENSERVICES_TAGTYPE_ELT;

        @objid ("6edc2654-cde5-4b4a-8c3c-4a3d44c8085b")
        public static TagType DEVICEBROKER_LINK_READSERVICES_TAGTYPE_ELT;

        @objid ("5f62272e-9da6-480d-82fe-5bfc697dbf8b")
        public static TagType DEVICEBROKER_LINK_WRITESERVICES_TAGTYPE_ELT;

        @objid ("17399f2f-f3bf-4300-9079-492877c2d7fe")
        private static Stereotype MDAASSOCDEP;

        @objid ("ed183c76-3d3a-48dd-934a-be875165d260")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0e2f6f85-2931-486a-afcd-45029c6942d8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01fb5c3a-0ccf-11df-8525-001302895b2b");
            DEVICEBROKER_LINK_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0cb86469-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LINK_ISBUFFERED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0cb8646a-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LINK_DEVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0cb8646b-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LINK_CLOSESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0cb8646c-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LINK_CONTROLSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0cb8646d-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LINK_OPENSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0cb8646e-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LINK_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0cb8646f-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_LINK_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0cb86470-172e-11df-b92a-0014222a9f79");
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
