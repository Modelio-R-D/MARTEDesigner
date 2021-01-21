/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("b4844f7e-04d1-4350-b635-d60d6180ba35")
    public static final String STEREOTYPE_NAME = "DeviceBroker_Association";

    @objid ("5c74533b-4057-4049-a7ab-d65ca8e8b5b8")
    public static final String DEVICEBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE = "DeviceBroker_Association_accessPolicy";

    @objid ("2095ed49-6fe5-45ab-82a7-8855bb46329c")
    public static final String DEVICEBROKER_ASSOCIATION_CLOSESERVICES_TAGTYPE = "DeviceBroker_Association_closeServices";

    @objid ("333e7637-7aa6-42a4-b1f8-37e723b9f0c9")
    public static final String DEVICEBROKER_ASSOCIATION_CONTROLSERVICES_TAGTYPE = "DeviceBroker_Association_controlServices";

    @objid ("9f144539-3d33-4efe-b0f3-5d6190bdfae3")
    public static final String DEVICEBROKER_ASSOCIATION_DEVICES_TAGTYPE = "DeviceBroker_Association_devices";

    @objid ("d9252d23-0c9b-4e66-834f-c950dfa1c7f9")
    public static final String DEVICEBROKER_ASSOCIATION_ISBUFFERED_TAGTYPE = "DeviceBroker_Association_isBuffered";

    @objid ("32a2f76c-6df1-4c38-bd5e-6549a04970f9")
    public static final String DEVICEBROKER_ASSOCIATION_OPENSERVICES_TAGTYPE = "DeviceBroker_Association_openServices";

    @objid ("a2f9e790-03ea-47f8-bed7-ec0f1da75257")
    public static final String DEVICEBROKER_ASSOCIATION_READSERVICES_TAGTYPE = "DeviceBroker_Association_readServices";

    @objid ("151cb023-c8d2-43f8-8152-9d1cc739fb5f")
    public static final String DEVICEBROKER_ASSOCIATION_WRITESERVICES_TAGTYPE = "DeviceBroker_Association_writeServices";

    /**
     * Tells whether a {@link DeviceBrokerAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << DeviceBroker_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2247551d-5d2e-450a-b177-0f44a9c406be")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << DeviceBroker_Association >> then instantiate a {@link DeviceBrokerAssociation} proxy.
     * 
     * @return a {@link DeviceBrokerAssociation} proxy on the created {@link Association}.
     */
    @objid ("52261982-a7e9-41dd-a604-95a561d5eaa7")
    public static DeviceBrokerAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceBrokerAssociation.STEREOTYPE_NAME);
        return DeviceBrokerAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link DeviceBrokerAssociation} proxy from a {@link Association} stereotyped << DeviceBroker_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link DeviceBrokerAssociation} proxy or <i>null</i>.
     */
    @objid ("592acd76-5164-4252-a51c-dadd4af4aee7")
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
    @objid ("b64ebba9-d312-4071-950b-1f70cdb708d9")
    public static DeviceBrokerAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (DeviceBrokerAssociation.canInstantiate(obj))
        	return new DeviceBrokerAssociation(obj);
        else
        	throw new IllegalArgumentException("DeviceBrokerAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bec50f4e-6651-4526-91b5-6b1c4957ba74")
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
    @objid ("bab8f605-7b60-44a3-ba24-a2fd1ae759d3")
    public String getDeviceBroker_Association_accessPolicy() {
        return this.elt.getTagValue(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_closeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f53e4578-20a0-4afe-8bb3-04573f9243e9")
    public List<String> getDeviceBroker_Association_closeServices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_CLOSESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_controlServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a900df5c-c112-4e81-bb3c-72c24fcb58d1")
    public List<String> getDeviceBroker_Association_controlServices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_CONTROLSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_devices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("75db7694-d1ab-49fc-8bcf-ae3e2e2f2113")
    public List<String> getDeviceBroker_Association_devices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_DEVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_openServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3d7a08fe-ae1a-4a91-8764-b8ebd3ba7697")
    public List<String> getDeviceBroker_Association_openServices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_OPENSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("985637b4-acb0-4ef8-a665-6ec9442b3fe4")
    public List<String> getDeviceBroker_Association_readServices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'DeviceBroker_Association_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c8a1021d-2de8-4e9f-887d-7b8232f884d2")
    public List<String> getDeviceBroker_Association_writeServices() {
        return this.elt.getTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("83a589c4-68bc-48af-936a-3aa91e1d8e10")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("f5522065-12a3-4148-9594-4fb145de8f58")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'DeviceBroker_Association_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("adf2fa05-0755-499d-be73-7efb588d0e17")
    public boolean isDeviceBroker_Association_isBuffered() {
        return this.elt.isTagged(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_ISBUFFERED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'DeviceBroker_Association_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f783362e-635c-4a54-9a8e-40d6ad3ab7fc")
    public void setDeviceBroker_Association_accessPolicy(final String value) {
        this.elt.putTagValue(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_closeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7f9ebdd6-3731-4198-ab96-90759a15ece1")
    public void setDeviceBroker_Association_closeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_CLOSESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_controlServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("63316af7-31fc-4388-9b5b-2242a7b6ac63")
    public void setDeviceBroker_Association_controlServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_CONTROLSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_devices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("71aaa84c-9cfc-4bfb-83bc-ccf615bdfdd5")
    public void setDeviceBroker_Association_devices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_DEVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for boolean property 'DeviceBroker_Association_isBuffered'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f4de5c1-c6aa-4c52-a736-33ab08034e65")
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
    @objid ("0b533854-1a88-4257-b7bf-09014e4b7ae1")
    public void setDeviceBroker_Association_openServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_OPENSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09a0077f-2105-4f43-bc3d-57b21b0be80c")
    public void setDeviceBroker_Association_readServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'DeviceBroker_Association_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1b11af0-7930-4d3b-8cbf-73a5fc01a3cc")
    public void setDeviceBroker_Association_writeServices(final List<String> values) {
        this.elt.putTagValues(DeviceBrokerAssociation.MdaTypes.DEVICEBROKER_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("dda0e59e-2f48-4b52-8450-b5dcb1a77bc4")
    protected DeviceBrokerAssociation(final Association elt) {
        super(elt);
    }

    @objid ("866e6bf9-9c3e-4b18-a3b9-8fc3f54650d4")
    public static final class MdaTypes {
        @objid ("7b9b1aba-f5a2-4566-b6b3-b0a7ae6007a8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b9b3ca12-6be8-432c-8d75-49cec6eed70b")
        public static TagType DEVICEBROKER_ASSOCIATION_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("02d2170d-4b1c-49df-a19f-df607aed1fa1")
        public static TagType DEVICEBROKER_ASSOCIATION_ISBUFFERED_TAGTYPE_ELT;

        @objid ("d1bc20ff-8e0c-4b6a-9776-57b9a1d309de")
        public static TagType DEVICEBROKER_ASSOCIATION_DEVICES_TAGTYPE_ELT;

        @objid ("fee500e5-bf21-40de-a513-bf246132d380")
        public static TagType DEVICEBROKER_ASSOCIATION_CLOSESERVICES_TAGTYPE_ELT;

        @objid ("ae5a3ddc-dea1-48f1-b6cf-01074c8e90ba")
        public static TagType DEVICEBROKER_ASSOCIATION_CONTROLSERVICES_TAGTYPE_ELT;

        @objid ("34040a04-0e19-464c-8115-7cb8ae9bad5f")
        public static TagType DEVICEBROKER_ASSOCIATION_OPENSERVICES_TAGTYPE_ELT;

        @objid ("e28132fb-e2b9-4f3a-b32e-34b90f99d169")
        public static TagType DEVICEBROKER_ASSOCIATION_READSERVICES_TAGTYPE_ELT;

        @objid ("0bb87c79-4942-4bf8-aa30-741e4a7cd28f")
        public static TagType DEVICEBROKER_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT;

        @objid ("4a3f98bf-6cea-4fce-8a72-c62e66d49db7")
        private static Stereotype MDAASSOCDEP;

        @objid ("23702890-c91a-4d25-822e-b0514e577a80")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a4c3a3e4-db50-46f4-8273-d305dbe06988")
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
