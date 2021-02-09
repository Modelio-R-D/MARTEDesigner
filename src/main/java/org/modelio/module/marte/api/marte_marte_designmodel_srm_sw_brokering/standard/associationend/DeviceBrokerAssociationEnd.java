/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.associationend;

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
public class DeviceBrokerAssociationEnd extends SwResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "DeviceBroker_AssociationEnd";

    public static final String DEVICEBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE = "DeviceBroker_AssociationEnd_accessPolicy";

    public static final String DEVICEBROKER_ASSOCIATIONEND_CLOSESERVICES_TAGTYPE = "DeviceBroker_AssociationEnd_closeServices";

    public static final String DEVICEBROKER_ASSOCIATIONEND_CONTROLSERVICES_TAGTYPE = "DeviceBroker_AssociationEnd_controlServices";

    public static final String DEVICEBROKER_ASSOCIATIONEND_DEVICES_TAGTYPE = "DeviceBroker_AssociationEnd_devices";

    public static final String DEVICEBROKER_ASSOCIATIONEND_ISBUFFERED_TAGTYPE = "DeviceBroker_AssociationEnd_isBuffered";

    public static final String DEVICEBROKER_ASSOCIATIONEND_OPENSERVICES_TAGTYPE = "DeviceBroker_AssociationEnd_openServices";

    public static final String DEVICEBROKER_ASSOCIATIONEND_READSERVICES_TAGTYPE = "DeviceBroker_AssociationEnd_readServices";

    public static final String DEVICEBROKER_ASSOCIATIONEND_WRITESERVICES_TAGTYPE = "DeviceBroker_AssociationEnd_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << DeviceBroker_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << DeviceBroker_AssociationEnd >> then instantiate a {@link DeviceBrokerAssociationEnd} proxy.
     * 
     * @return a {@link DeviceBrokerAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static DeviceBrokerAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerAssociationEnd.STEREOTYPE_NAME);
        return DeviceBrokerAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << DeviceBroker_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link DeviceBrokerAssociationEnd} proxy or <i>null</i>.
     */
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
    public static DeviceBrokerAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (DeviceBrokerAssociationEnd.canInstantiate(obj))
        	return new DeviceBrokerAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        DeviceBrokerAssociationEnd other = (DeviceBrokerAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DeviceBroker_AssociationEnd_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDeviceBroker_AssociationEnd_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_AssociationEnd_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_AssociationEnd_closeServices() {
        return this.elt.getTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_AssociationEnd_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_AssociationEnd_controlServices() {
        return this.elt.getTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_AssociationEnd_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_AssociationEnd_devices() {
        return this.elt.getTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_AssociationEnd_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_AssociationEnd_openServices() {
        return this.elt.getTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_AssociationEnd_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_AssociationEnd_readServices() {
        return this.elt.getTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_AssociationEnd_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDeviceBroker_AssociationEnd_writeServices() {
        return this.elt.getTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_AssociationEnd_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isDeviceBroker_AssociationEnd_isBuffered() {
        return this.elt.isTagged(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_AssociationEnd_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_AssociationEnd_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_AssociationEnd_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_AssociationEnd_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_AssociationEnd_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_AssociationEnd_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_AssociationEnd_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_AssociationEnd_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_AssociationEnd_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setDeviceBroker_AssociationEnd_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_AssociationEnd_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_AssociationEnd_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_AssociationEnd_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDeviceBroker_AssociationEnd_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociationEnd.MdaTypes.DEVICEBROKER_ASSOCIATIONEND_WRITESERVICES_TAGTYPE_ELT, values);
    }

    protected DeviceBrokerAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATIONEND_ACCESSPOLICY_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATIONEND_ISBUFFERED_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATIONEND_DEVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATIONEND_CLOSESERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATIONEND_CONTROLSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATIONEND_OPENSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATIONEND_READSERVICES_TAGTYPE_ELT;

        public static TagType DEVICEBROKER_ASSOCIATIONEND_WRITESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
