/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.link;

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
public class DeviceBrokerLink extends SwResourceLink {
    public static final String STEREOTYPE_NAME = "DeviceBroker_Link";

    public static final String DEVICEBROKER_LINK_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Link_accessPolicy";

    public static final String DEVICEBROKER_LINK_CLOSESERVICES_TAGTYPE = "DeviceBroker_Link_closeServices";

    public static final String DEVICEBROKER_LINK_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Link_controlServices";

    public static final String DEVICEBROKER_LINK_DEVICES_TAGTYPE = "DeviceBroker_Link_devices";

    public static final String DEVICEBROKER_LINK_ISBUFFERED_TAGTYPE = "DeviceBroker_Link_isBuffered";

    public static final String DEVICEBROKER_LINK_OPENSERVICES_TAGTYPE = "DeviceBroker_Link_openServices";

    public static final String DEVICEBROKER_LINK_READSERVICES_TAGTYPE = "DeviceBroker_Link_readServices";

    public static final String DEVICEBROKER_LINK_WRITESERVICES_TAGTYPE = "DeviceBroker_Link_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << DeviceBroker_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << DeviceBroker_Link >> then instantiate a {@link DeviceBrokerLink} proxy.
     * 
     * @return a {@link DeviceBrokerLink} proxy on the created {@link Link}.
     */
    public static DeviceBrokerLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerLink.STEREOTYPE_NAME);
        return DeviceBrokerLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerLink} proxy from a {@link Link} stereotyped << DeviceBroker_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link DeviceBrokerLink} proxy or <i>null</i>.
     */
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
    public static DeviceBrokerLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (DeviceBrokerLink.canInstantiate(obj))
        	return new DeviceBrokerLink(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        DeviceBrokerLink other = (DeviceBrokerLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DeviceBroker_Link_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDeviceBroker_Link_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Link_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Link_closeServices() {
        return this.elt.getTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Link_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Link_controlServices() {
        return this.elt.getTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Link_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Link_devices() {
        return this.elt.getTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Link_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Link_openServices() {
        return this.elt.getTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Link_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Link_readServices() {
        return this.elt.getTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Link_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Link_writeServices() {
        return this.elt.getTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Link_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isDeviceBroker_Link_isBuffered() {
        return this.elt.isTagged(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Link_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Link_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Link_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Link_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Link_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Link_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Link_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Link_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Link_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setDeviceBroker_Link_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Link_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Link_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Link_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Link_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerLink.MdaTypes.DEVICEBROKER_LINK_WRITESERVICES_TAGTYPE_ELT, values);
    }

    protected DeviceBrokerLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType DEVICEBROKER_LINK_ACCESSPOLICY_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_LINK_ISBUFFERED_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_LINK_DEVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_LINK_CLOSESERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_LINK_CONTROLSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_LINK_OPENSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_LINK_READSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_LINK_WRITESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
