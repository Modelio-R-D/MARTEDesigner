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
@objid ("5e64799c-e761-49fb-bd06-35fff557c642")
public class DeviceBrokerAssociation extends SwResourceAssociation {
    @objid ("2d510e03-17cf-495a-8265-c30cf1be2a17")
    public static final String STEREOTYPE_NAME = "DeviceBroker_Association";

    @objid ("df08439a-3b2d-40dd-8672-f549d60602db")
    public static final String DEVICEBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Association_accessPolicy";

    @objid ("bf5d4239-b041-4ef5-a89d-e02cb5166d20")
    public static final String DEVICEBROKER_ASSOCIATION_CLOSESERVICES_TAGTYPE = "DeviceBroker_Association_closeServices";

    @objid ("691a33c7-31f5-43cd-9a57-74106f0641de")
    public static final String DEVICEBROKER_ASSOCIATION_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Association_controlServices";

    @objid ("c34a4832-ab9d-48a1-8a40-39c2997e5135")
    public static final String DEVICEBROKER_ASSOCIATION_DEVICES_TAGTYPE = "DeviceBroker_Association_devices";

    @objid ("12803b87-bad8-4f3a-88bf-a9a06540b8a5")
    public static final String DEVICEBROKER_ASSOCIATION_ISBUFFERED_TAGTYPE = "DeviceBroker_Association_isBuffered";

    @objid ("6ec800e2-5dcb-4553-bd89-18512e7bbfa4")
    public static final String DEVICEBROKER_ASSOCIATION_OPENSERVICES_TAGTYPE = "DeviceBroker_Association_openServices";

    @objid ("e5d25d0b-25a1-436c-98dd-695bf9ddb5b0")
    public static final String DEVICEBROKER_ASSOCIATION_READSERVICES_TAGTYPE = "DeviceBroker_Association_readServices";

    @objid ("869f21b6-8b15-47a0-89a6-b5af9e66dd97")
    public static final String DEVICEBROKER_ASSOCIATION_WRITESERVICES_TAGTYPE = "DeviceBroker_Association_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << DeviceBroker_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8c1a2ff9-c52f-4bcd-9b8b-8baefe926192")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << DeviceBroker_Association >> then instantiate a {@link DeviceBrokerAssociation} proxy.
     * 
     * @return a {@link DeviceBrokerAssociation} proxy on the created {@link Association}.
     */
    @objid ("9cfb4726-9480-4da4-9439-e63791e514f6")
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
    @objid ("7981cb13-1583-4202-8d6a-c30ae7a78421")
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
    @objid ("1a31dbbd-ed79-4abe-b808-58273436b205")
    public static DeviceBrokerAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (DeviceBrokerAssociation.canInstantiate(obj))
        	return new DeviceBrokerAssociation(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("93e0aac4-7d12-4843-b5ec-5448629c2810")
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
    @objid ("e6d8f03a-4f1e-46fb-b403-94458e8fcca9")
    public String getDeviceBroker_Association_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a19bfb84-3044-487e-b540-bd4b88e433a4")
    public List<String> getDeviceBroker_Association_closeServices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3f2ecdba-a172-4a01-8bcf-2f0fe2185633")
    public List<String> getDeviceBroker_Association_controlServices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ff3b690e-2eff-478c-a1bb-3dc7dc685701")
    public List<String> getDeviceBroker_Association_devices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("630baead-58ab-4ab0-ae7a-9e774b266448")
    public List<String> getDeviceBroker_Association_openServices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("30cd17c3-c019-4313-af48-5b5a7a20cd87")
    public List<String> getDeviceBroker_Association_readServices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1fade1f3-0c0c-4939-b99b-449828ea38e9")
    public List<String> getDeviceBroker_Association_writeServices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("2d57bd3e-03cf-438d-907b-c4a7075d7476")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("bce234bf-06f6-4aa9-92f5-27fd7c3e0b22")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Association_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7167da90-bf07-4e76-8026-5db12871c0b9")
    public boolean isDeviceBroker_Association_isBuffered() {
        return this.elt.isTagged(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Association_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3019558a-a83d-4d94-a085-57f780827036")
    public void setDeviceBroker_Association_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f1c765f-8131-4bca-910a-1afa29dbc483")
    public void setDeviceBroker_Association_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a30c00d-f0c7-4a05-8193-25a5433229f5")
    public void setDeviceBroker_Association_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c375d4d2-27eb-4ccc-8631-ae992a5f3350")
    public void setDeviceBroker_Association_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Association_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f3f6960-1e2f-42b5-8b3d-8826028aa098")
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
    @objid ("cd01ecd9-5c66-4ff8-97c6-09fa9e24070e")
    public void setDeviceBroker_Association_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ed619827-6ce0-4562-9d14-acaf45649a1e")
    public void setDeviceBroker_Association_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5cbad0b4-839a-42dd-af58-e292e3084f8c")
    public void setDeviceBroker_Association_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("e3ee389a-ab0e-4f1f-8c1e-3f8c066083bd")
    protected DeviceBrokerAssociation(final Association elt) {
        super(elt);
    }

    @objid ("866e6bf9-9c3e-4b18-a3b9-8fc3f54650d4")
    public static final class MdaTypes {
        @objid ("ea572302-8315-40d2-b7af-02713dfd0e48")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("220a5e93-6455-48db-b5f3-47cd6a718a8a")
        public static TagType DEVICEBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("d508b579-5c4c-45ee-a87c-621527d657e4")
        public static TagType DEVICEBROKER_ASSOCIATION_ISBUFFERED_TAGTYPE_ELT;

        @objid ("ced1f15d-231b-402c-9df9-2226b1204790")
        public static TagType DEVICEBROKER_ASSOCIATION_DEVICES_TAGTYPE_ELT;

        @objid ("417984bc-6fd1-4300-a8a4-b0469a333344")
        public static TagType DEVICEBROKER_ASSOCIATION_CLOSESERVICES_TAGTYPE_ELT;

        @objid ("cd57c0e4-bdea-471b-be07-86afdaa26317")
        public static TagType DEVICEBROKER_ASSOCIATION_CONTROLSERVICES_TAGTYPE_ELT;

        @objid ("c8ec7973-b273-471c-8ad6-dce68d212de3")
        public static TagType DEVICEBROKER_ASSOCIATION_OPENSERVICES_TAGTYPE_ELT;

        @objid ("ef520f5e-4dc5-4ce8-ac49-22c9a3fd13e6")
        public static TagType DEVICEBROKER_ASSOCIATION_READSERVICES_TAGTYPE_ELT;

        @objid ("71f4a601-c874-41cc-b651-44eef7c7aade")
        public static TagType DEVICEBROKER_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT;

        @objid ("bb86a3cf-4f7e-44d7-bf45-2105773da5ff")
        private static Stereotype MDAASSOCDEP;

        @objid ("b289bcbc-02aa-4476-af3b-2b82bf5c653b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("aa0ba81d-1cd7-44f8-b150-034987a8b804")
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
