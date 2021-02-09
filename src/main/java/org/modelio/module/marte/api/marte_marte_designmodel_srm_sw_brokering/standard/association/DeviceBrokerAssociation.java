/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.association.SwResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << DeviceBroker_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class DeviceBrokerAssociation extends SwResourceAssociation {
    public static final String STEREOTYPE_NAME = "DeviceBroker_Association";

    public static final String DEVICEBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Association_accessPolicy";

    public static final String DEVICEBROKER_ASSOCIATION_CLOSESERVICES_TAGTYPE = "DeviceBroker_Association_closeServices";

    public static final String DEVICEBROKER_ASSOCIATION_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Association_controlServices";

    public static final String DEVICEBROKER_ASSOCIATION_DEVICES_TAGTYPE = "DeviceBroker_Association_devices";

    public static final String DEVICEBROKER_ASSOCIATION_ISBUFFERED_TAGTYPE = "DeviceBroker_Association_isBuffered";

    public static final String DEVICEBROKER_ASSOCIATION_OPENSERVICES_TAGTYPE = "DeviceBroker_Association_openServices";

    public static final String DEVICEBROKER_ASSOCIATION_READSERVICES_TAGTYPE = "DeviceBroker_Association_readServices";

    public static final String DEVICEBROKER_ASSOCIATION_WRITESERVICES_TAGTYPE = "DeviceBroker_Association_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << DeviceBroker_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << DeviceBroker_Association >> then instantiate a {@link DeviceBrokerAssociation} proxy.
     * 
     * @return a {@link DeviceBrokerAssociation} proxy on the created {@link Association}.
     */
    public static DeviceBrokerAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerAssociation.STEREOTYPE_NAME);
        return DeviceBrokerAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerAssociation} proxy from a {@link Association} stereotyped << DeviceBroker_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link DeviceBrokerAssociation} proxy or <i>null</i>.
     */
    public static DeviceBrokerAssociation instantiate(final Association obj) {
        return DeviceBrokerAssociation.canInstantiate(obj) ? new DeviceBrokerAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerAssociation} proxy from a {@link Association} stereotyped << DeviceBroker_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link DeviceBrokerAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static DeviceBrokerAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (DeviceBrokerAssociation.canInstantiate(obj))
        	return new DeviceBrokerAssociation(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        DeviceBrokerAssociation other = (DeviceBrokerAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DeviceBroker_Association_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDeviceBroker_Association_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Association_closeServices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Association_controlServices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Association_devices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Association_openServices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Association_readServices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_Association_writeServices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Association_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isDeviceBroker_Association_isBuffered() {
        return this.elt.isTagged(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Association_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Association_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Association_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Association_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Association_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Association_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Association_isBuffered(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_ISBUFFERED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_openServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Association_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Association_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_Association_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT, values);
    }

    protected DeviceBrokerAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATION_ISBUFFERED_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATION_DEVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATION_CLOSESERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATION_CONTROLSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATION_OPENSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATION_READSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "099c9ddb-10d2-11df-81d9-0014222a9f79");
            DEVICEBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0b2a3a65-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ASSOCIATION_ISBUFFERED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0b2a3a66-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ASSOCIATION_DEVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0b2a3a67-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ASSOCIATION_CLOSESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0b2a3a68-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ASSOCIATION_CONTROLSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0b2a3a69-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ASSOCIATION_OPENSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0b2a3a6a-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ASSOCIATION_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0b2a3a6b-172e-11df-b92a-0014222a9f79");
            DEVICEBROKER_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0b2a3a6c-172e-11df-b92a-0014222a9f79");
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
