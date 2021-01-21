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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.instance.HwComponentInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwPowerSupply_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("03be8d93-445e-4f83-8b6f-17a253006cb3")
public class HwPowerSupplyInstance extends HwComponentInstance {
    @objid ("bbc3f842-9404-4766-9639-9588343208b3")
    public static final String STEREOTYPE_NAME = "HwPowerSupply_Instance";

    @objid ("e5c26e7a-a27f-4bcc-b7c9-305e0971ecbf")
    public static final String HWPOWERSUPPLY_INSTANCE_CAPACITY_TAGTYPE = "HwPowerSupply_Instance_capacity";

    @objid ("81952285-e4fb-4255-8b86-e635388a5425")
    public static final String HWPOWERSUPPLY_INSTANCE_SUPPLIEDPOWER_TAGTYPE = "HwPowerSupply_Instance_suppliedPower";

    /**
     * Tells whether a {@link HwPowerSupplyInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwPowerSupply_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("daf55de9-bb28-4137-8bab-5dacaf5d5c15")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwPowerSupply_Instance >> then instantiate a {@link HwPowerSupplyInstance} proxy.
     * 
     * @return a {@link HwPowerSupplyInstance} proxy on the created {@link Instance}.
     */
    @objid ("41aeefb4-12c1-4bf4-9c43-00e9c69bab7c")
    public static HwPowerSupplyInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyInstance.STEREOTYPE_NAME);
        return HwPowerSupplyInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyInstance} proxy from a {@link Instance} stereotyped << HwPowerSupply_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwPowerSupplyInstance} proxy or <i>null</i>.
     */
    @objid ("cff8a693-234f-4ffb-aed1-7d395f5775d9")
    public static HwPowerSupplyInstance instantiate(final Instance obj) {
        return HwPowerSupplyInstance.canInstantiate(obj) ? new HwPowerSupplyInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyInstance} proxy from a {@link Instance} stereotyped << HwPowerSupply_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwPowerSupplyInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5db7a347-9dd7-41fd-aa1e-e691b1817aa5")
    public static HwPowerSupplyInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwPowerSupplyInstance.canInstantiate(obj))
        	return new HwPowerSupplyInstance(obj);
        else
        	throw new IllegalArgumentException("HwPowerSupplyInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2d11f268-5d2d-4197-a4de-b71dce88122e")
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
        HwPowerSupplyInstance other = (HwPowerSupplyInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("f3074bb3-9740-4317-b1f7-09182145d5ea")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwPowerSupply_Instance_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("03d9f3ed-7855-4e62-9be7-b3f8a777a8a5")
    public String getHwPowerSupply_Instance_capacity() {
        return this.elt.getTagValue(HwPowerSupplyInstance.MdaTypes.HWPOWERSUPPLY_INSTANCE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPowerSupply_Instance_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9ec0bb06-24dc-48c6-b0cb-a2964335d47d")
    public String getHwPowerSupply_Instance_suppliedPower() {
        return this.elt.getTagValue(HwPowerSupplyInstance.MdaTypes.HWPOWERSUPPLY_INSTANCE_SUPPLIEDPOWER_TAGTYPE_ELT);
    }

    @objid ("54de40fe-b26e-49ef-b8ba-03e7f7af3509")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwPowerSupply_Instance_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("22742ef4-ae78-463c-9379-d89f1db371d2")
    public void setHwPowerSupply_Instance_capacity(final String value) {
        this.elt.putTagValue(HwPowerSupplyInstance.MdaTypes.HWPOWERSUPPLY_INSTANCE_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPowerSupply_Instance_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ca7751f8-693b-44df-a982-f39c8f2832c2")
    public void setHwPowerSupply_Instance_suppliedPower(final String value) {
        this.elt.putTagValue(HwPowerSupplyInstance.MdaTypes.HWPOWERSUPPLY_INSTANCE_SUPPLIEDPOWER_TAGTYPE_ELT, value);
    }

    @objid ("7d8b7ee0-e34b-4c6f-af3d-8ab297b02a40")
    protected HwPowerSupplyInstance(final Instance elt) {
        super(elt);
    }

    @objid ("b5f56d59-8345-450f-b500-cf092aea7764")
    public static final class MdaTypes {
        @objid ("73bbf491-279b-4cf1-b806-bc4293be2845")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3cc5345a-3d17-46b5-9bf0-3458f142a3ef")
        public static TagType HWPOWERSUPPLY_INSTANCE_SUPPLIEDPOWER_TAGTYPE_ELT;

        @objid ("ab584b55-8f47-4887-89ef-fd24845b8a36")
        public static TagType HWPOWERSUPPLY_INSTANCE_CAPACITY_TAGTYPE_ELT;

        @objid ("9625a1fd-3aab-4dc3-a46e-6bcb3e480150")
        private static Stereotype MDAASSOCDEP;

        @objid ("83b6f4ed-f4b8-4f3e-b390-05bb6041bd37")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("edb0432b-88f5-4bf8-bf89-fc93890c62d7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01927624-0ccf-11df-8525-001302895b2b");
            HWPOWERSUPPLY_INSTANCE_SUPPLIEDPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0192762b-0ccf-11df-8525-001302895b2b");
            HWPOWERSUPPLY_INSTANCE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01927632-0ccf-11df-8525-001302895b2b");
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
