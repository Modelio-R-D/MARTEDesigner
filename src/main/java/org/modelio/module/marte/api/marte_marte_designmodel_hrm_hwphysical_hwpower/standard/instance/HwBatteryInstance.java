/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.instance;

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
 * Proxy class to handle a {@link Instance} with << HwBattery_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2be2e61d-0947-4510-95c6-f0bd229e0068")
public class HwBatteryInstance extends HwPowerSupplyInstance {
    @objid ("f4792611-4211-48f0-b49f-09f3a2776099")
    public static final String STEREOTYPE_NAME = "HwBattery_Instance";

    @objid ("12f9ab83-3f9a-451a-b70a-8b460c6af111")
    public static final String HWBATTERY_INSTANCE_CAPACITY_TAGTYPE = "HwBattery_Instance_capacity";

    /**
     * Tells whether a {@link HwBatteryInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwBattery_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1155b0a2-915f-4426-a928-f2034657f40f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwBattery_Instance >> then instantiate a {@link HwBatteryInstance} proxy.
     * 
     * @return a {@link HwBatteryInstance} proxy on the created {@link Instance}.
     */
    @objid ("1b302fef-06f8-49fb-a25c-33d351136760")
    public static HwBatteryInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryInstance.STEREOTYPE_NAME);
        return HwBatteryInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwBatteryInstance} proxy from a {@link Instance} stereotyped << HwBattery_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwBatteryInstance} proxy or <i>null</i>.
     */
    @objid ("e2953f68-2e41-4e18-9c99-01e821e1a1c3")
    public static HwBatteryInstance instantiate(final Instance obj) {
        return HwBatteryInstance.canInstantiate(obj) ? new HwBatteryInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBatteryInstance} proxy from a {@link Instance} stereotyped << HwBattery_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwBatteryInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("90a6ec13-98aa-4d38-b693-410fe27e53c8")
    public static HwBatteryInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwBatteryInstance.canInstantiate(obj))
        	return new HwBatteryInstance(obj);
        else
        	throw new IllegalArgumentException("HwBatteryInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("31c2bbae-c2d2-4235-9699-0ff708930299")
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
        HwBatteryInstance other = (HwBatteryInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("a8ce87d0-474a-4a3f-a1fd-d596225887b0")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwBattery_Instance_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d444c0c-f007-4f00-a903-8d37fa3565b9")
    public String getHwBattery_Instance_capacity() {
        return this.elt.getTagValue(HwBatteryInstance.MdaTypes.HWBATTERY_INSTANCE_CAPACITY_TAGTYPE_ELT);
    }

    @objid ("21f483bf-c93b-4104-9ece-8385c747996b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwBattery_Instance_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f612418f-7dc3-4ec1-a504-ef9fc6fd3c0e")
    public void setHwBattery_Instance_capacity(final String value) {
        this.elt.putTagValue(HwBatteryInstance.MdaTypes.HWBATTERY_INSTANCE_CAPACITY_TAGTYPE_ELT, value);
    }

    @objid ("c0f3f64b-0760-4c0c-809d-2ce3e8935457")
    protected HwBatteryInstance(final Instance elt) {
        super(elt);
    }

    @objid ("2427df4b-314c-48fc-91a8-b09a72168b7c")
    public static final class MdaTypes {
        @objid ("1280cd96-6484-4386-9e07-fb53729f48b1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3efc5f5b-e1cc-4c25-bc1f-c7403b882394")
        public static TagType HWBATTERY_INSTANCE_CAPACITY_TAGTYPE_ELT;

        @objid ("da048ad9-87e9-490d-bad3-cea224e3f31b")
        private static Stereotype MDAASSOCDEP;

        @objid ("76ac9ded-6539-4238-bb30-a624438678ab")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9125762e-e762-4ab0-8466-af84d3e7c9ff")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "563acf1f-c7b2-11df-ad39-001302895b2b");
            HWBATTERY_INSTANCE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "563acf2c-c7b2-11df-ad39-001302895b2b");
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
