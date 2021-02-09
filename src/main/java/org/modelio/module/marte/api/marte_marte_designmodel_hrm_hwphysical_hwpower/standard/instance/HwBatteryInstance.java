/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
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
public class HwBatteryInstance extends HwPowerSupplyInstance {
    public static final String STEREOTYPE_NAME = "HwBattery_Instance";

    public static final String HWBATTERY_INSTANCE_CAPACITY_TAGTYPE = "HwBattery_Instance_capacity";

    /**
     * Tells whether a {@link HwBatteryInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwBattery_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwBattery_Instance >> then instantiate a {@link HwBatteryInstance} proxy.
     * 
     * @return a {@link HwBatteryInstance} proxy on the created {@link Instance}.
     */
    public static HwBatteryInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryInstance.STEREOTYPE_NAME);
        return HwBatteryInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwBatteryInstance} proxy from a {@link Instance} stereotyped << HwBattery_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwBatteryInstance} proxy or <i>null</i>.
     */
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
    public static HwBatteryInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwBatteryInstance.canInstantiate(obj))
        	return new HwBatteryInstance(obj);
        else
        	throw new IllegalArgumentException("HwBatteryInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwBatteryInstance other = (HwBatteryInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwBattery_Instance_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwBattery_Instance_capacity() {
        return this.elt.getTagValue(HwBatteryInstance.MdaTypes.HWBATTERY_INSTANCE_CAPACITY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwBattery_Instance_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBattery_Instance_capacity(final String value) {
        this.elt.putTagValue(HwBatteryInstance.MdaTypes.HWBATTERY_INSTANCE_CAPACITY_TAGTYPE_ELT, value);
    }

    protected HwBatteryInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWBATTERY_INSTANCE_CAPACITY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
