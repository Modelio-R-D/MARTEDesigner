/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwBus_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4346028a-d724-46b5-a64e-f439efd16dc4")
public class HwBusInstance extends HwMediaInstance {
    @objid ("6fd72406-ec7e-4d01-95a4-7be9df69fc5a")
    public static final String STEREOTYPE_NAME = "HwBus_Instance";

    @objid ("21437a8b-356d-4102-9d3d-d3cce9d4d1cd")
    public static final String HWBUS_INSTANCE_ADRESSWIDTH_TAGTYPE = "HwBus_Instance_adressWidth";

    @objid ("b1fb0943-64f4-4fcc-b9a9-522d29f24eda")
    public static final String HWBUS_INSTANCE_ISSERIAL_TAGTYPE = "HwBus_Instance_isSerial";

    @objid ("5d6ad9bc-7399-44d3-af91-ac702acb2dac")
    public static final String HWBUS_INSTANCE_ISSYNCHRONOUS_TAGTYPE = "HwBus_Instance_isSynchronous";

    @objid ("22d5f20e-8a5b-43bd-b163-6ddf9bd4a2ad")
    public static final String HWBUS_INSTANCE_WORDWIDTH_TAGTYPE = "HwBus_Instance_wordWidth";

    /**
     * Tells whether a {@link HwBusInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwBus_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("80f75acc-2cad-4152-bcdb-ba531e5f0bfa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBusInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwBus_Instance >> then instantiate a {@link HwBusInstance} proxy.
     * 
     * @return a {@link HwBusInstance} proxy on the created {@link Instance}.
     */
    @objid ("e6601b06-699c-43fb-a555-28da9ab561d5")
    public static HwBusInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBusInstance.STEREOTYPE_NAME);
        return HwBusInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwBusInstance} proxy from a {@link Instance} stereotyped << HwBus_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwBusInstance} proxy or <i>null</i>.
     */
    @objid ("37cb02f6-4839-4dcb-93b9-5c08dad5192c")
    public static HwBusInstance instantiate(final Instance obj) {
        return HwBusInstance.canInstantiate(obj) ? new HwBusInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBusInstance} proxy from a {@link Instance} stereotyped << HwBus_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwBusInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("569b642d-a2df-41d5-8f22-0b23ec696688")
    public static HwBusInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwBusInstance.canInstantiate(obj))
        	return new HwBusInstance(obj);
        else
        	throw new IllegalArgumentException("HwBusInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a1bf5fd8-e401-4843-b031-03638d19888b")
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
        HwBusInstance other = (HwBusInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("6a26c29e-7dab-403b-afa9-b236ae3a600e")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwBus_Instance_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60c009e5-4ccc-44cd-97c9-b0ef8d9bbec8")
    public String getHwBus_Instance_adressWidth() {
        return this.elt.getTagValue(HwBusInstance.MdaTypes.HWBUS_INSTANCE_ADRESSWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwBus_Instance_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("50d3efed-eb5e-4f20-a4e3-c4ab83143d76")
    public String getHwBus_Instance_wordWidth() {
        return this.elt.getTagValue(HwBusInstance.MdaTypes.HWBUS_INSTANCE_WORDWIDTH_TAGTYPE_ELT);
    }

    @objid ("ccc23b85-b00d-4bc2-bd4d-238a3cf72676")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwBus_Instance_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("79466428-e719-417e-a332-1b3f0782c7c0")
    public boolean isHwBus_Instance_isSerial() {
        return this.elt.isTagged(HwBusInstance.MdaTypes.HWBUS_INSTANCE_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwBus_Instance_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("54d0128e-6ca4-4000-ac12-77af0b012dd6")
    public boolean isHwBus_Instance_isSynchronous() {
        return this.elt.isTagged(HwBusInstance.MdaTypes.HWBUS_INSTANCE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Instance_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("df46187e-5a98-43d3-b01b-81a8465eca5b")
    public void setHwBus_Instance_adressWidth(final String value) {
        this.elt.putTagValue(HwBusInstance.MdaTypes.HWBUS_INSTANCE_ADRESSWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'HwBus_Instance_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("52dac38a-f908-4979-9202-2f986a1b92af")
    public void setHwBus_Instance_isSerial(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusInstance.MdaTypes.HWBUS_INSTANCE_ISSERIAL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusInstance.MdaTypes.HWBUS_INSTANCE_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwBus_Instance_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6e997f0f-bbf4-4bd2-a509-c0f935efb35b")
    public void setHwBus_Instance_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusInstance.MdaTypes.HWBUS_INSTANCE_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusInstance.MdaTypes.HWBUS_INSTANCE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Instance_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("218cd459-e128-43ba-8d77-82b50221ad03")
    public void setHwBus_Instance_wordWidth(final String value) {
        this.elt.putTagValue(HwBusInstance.MdaTypes.HWBUS_INSTANCE_WORDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("229613ee-9392-47ba-b1f3-deb2bc80a987")
    protected HwBusInstance(final Instance elt) {
        super(elt);
    }

    @objid ("cba34ec1-ce87-4731-9ae2-4d07e766a73e")
    public static final class MdaTypes {
        @objid ("3b387162-c3fc-427e-a865-954366273b01")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("01082163-1797-44d9-bc7c-703e5806d341")
        public static TagType HWBUS_INSTANCE_ADRESSWIDTH_TAGTYPE_ELT;

        @objid ("d31c8084-3cec-43c4-97a7-43d426b2a0bd")
        public static TagType HWBUS_INSTANCE_WORDWIDTH_TAGTYPE_ELT;

        @objid ("63157141-788b-49ec-8e93-3b3156cdce14")
        public static TagType HWBUS_INSTANCE_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("da6f7489-cdc4-4590-9080-9274a2538281")
        public static TagType HWBUS_INSTANCE_ISSERIAL_TAGTYPE_ELT;

        @objid ("753ebc31-7685-49a4-a133-f30d156b51fa")
        private static Stereotype MDAASSOCDEP;

        @objid ("56bbc3da-15c6-4009-94ac-d2090f3dc53c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d14717d5-e056-41a2-864e-2048aae79711")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01167d7c-0ccf-11df-8525-001302895b2b");
            HWBUS_INSTANCE_ADRESSWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d83-0ccf-11df-8525-001302895b2b");
            HWBUS_INSTANCE_WORDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d8a-0ccf-11df-8525-001302895b2b");
            HWBUS_INSTANCE_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a50b293d-1707-11df-b92a-0014222a9f79");
            HWBUS_INSTANCE_ISSERIAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a50b293e-1707-11df-b92a-0014222a9f79");
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
