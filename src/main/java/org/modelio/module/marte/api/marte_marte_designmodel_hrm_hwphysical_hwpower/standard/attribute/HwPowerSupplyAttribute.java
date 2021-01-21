/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.attribute.HwComponentAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwPowerSupply_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6978154b-2181-4a30-9673-9e6507b668cf")
public class HwPowerSupplyAttribute extends HwComponentAttribute {
    @objid ("d65a6f0c-a5aa-4706-9f8a-8ecde2468ea5")
    public static final String STEREOTYPE_NAME = "HwPowerSupply_Attribute";

    @objid ("2bc52d85-e278-47cc-93ea-c2d687451741")
    public static final String HWPOWERSUPPLY_ATTRIBUTE_CAPACITY_TAGTYPE = "HwPowerSupply_Attribute_capacity";

    @objid ("c9340a4c-8b26-4599-b721-fcdad925a65e")
    public static final String HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER_TAGTYPE = "HwPowerSupply_Attribute_suppliedPower";

    /**
     * Tells whether a {@link HwPowerSupplyAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwPowerSupply_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7867d1b7-f3e1-4c57-b62a-a6f343f27dbc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwPowerSupply_Attribute >> then instantiate a {@link HwPowerSupplyAttribute} proxy.
     * 
     * @return a {@link HwPowerSupplyAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("0fdca407-ec72-4c6c-b0b3-d8d776741b88")
    public static HwPowerSupplyAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyAttribute.STEREOTYPE_NAME);
        return HwPowerSupplyAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyAttribute} proxy from a {@link Attribute} stereotyped << HwPowerSupply_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwPowerSupplyAttribute} proxy or <i>null</i>.
     */
    @objid ("926d1e5f-9c5e-4166-bae1-44a6c7a972cf")
    public static HwPowerSupplyAttribute instantiate(final Attribute obj) {
        return HwPowerSupplyAttribute.canInstantiate(obj) ? new HwPowerSupplyAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyAttribute} proxy from a {@link Attribute} stereotyped << HwPowerSupply_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwPowerSupplyAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("044bd926-b223-4962-9512-c5ea4daf9c15")
    public static HwPowerSupplyAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwPowerSupplyAttribute.canInstantiate(obj))
        	return new HwPowerSupplyAttribute(obj);
        else
        	throw new IllegalArgumentException("HwPowerSupplyAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8e625552-9b36-4a31-81a6-9f1436344091")
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
        HwPowerSupplyAttribute other = (HwPowerSupplyAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("b1076b8a-c581-4d89-81d1-eac2f7299211")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwPowerSupply_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4ad47f17-c675-4d00-a8db-08910236cb04")
    public String getHwPowerSupply_Attribute_capacity() {
        return this.elt.getTagValue(HwPowerSupplyAttribute.MdaTypes.HWPOWERSUPPLY_ATTRIBUTE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPowerSupply_Attribute_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c94bdbd5-fd93-40a9-a270-47905810d660")
    public String getHwPowerSupply_Attribute_suppliedPower() {
        return this.elt.getTagValue(HwPowerSupplyAttribute.MdaTypes.HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER_TAGTYPE_ELT);
    }

    @objid ("3751eea9-6c37-4c31-844d-99fc060410a0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwPowerSupply_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("62ac605d-31f6-4d1c-b07c-4dfd873b8c96")
    public void setHwPowerSupply_Attribute_capacity(final String value) {
        this.elt.putTagValue(HwPowerSupplyAttribute.MdaTypes.HWPOWERSUPPLY_ATTRIBUTE_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPowerSupply_Attribute_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a6c16a12-8fe2-491a-88f2-20c2a5b18243")
    public void setHwPowerSupply_Attribute_suppliedPower(final String value) {
        this.elt.putTagValue(HwPowerSupplyAttribute.MdaTypes.HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER_TAGTYPE_ELT, value);
    }

    @objid ("4a5b7f04-4fce-4730-a805-58e27e026a9a")
    protected HwPowerSupplyAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("1f82028e-057b-45b4-b7a5-6830c8e5d5a2")
    public static final class MdaTypes {
        @objid ("d3f858e5-96af-4d20-9237-fe2c1062f23e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c37f0d1e-e16f-4919-8818-303da4901f7c")
        public static TagType HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER_TAGTYPE_ELT;

        @objid ("81c90664-9ac5-424d-b012-0530a5da0f26")
        public static TagType HWPOWERSUPPLY_ATTRIBUTE_CAPACITY_TAGTYPE_ELT;

        @objid ("1df76706-d184-473f-bd4f-901b7579b9f1")
        private static Stereotype MDAASSOCDEP;

        @objid ("dd79ac45-c5d4-4add-b435-87fa347e3e1d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("472d7976-d508-4ae8-a931-961e3744126b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01927621-0ccf-11df-8525-001302895b2b");
            HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01927628-0ccf-11df-8525-001302895b2b");
            HWPOWERSUPPLY_ATTRIBUTE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0192762f-0ccf-11df-8525-001302895b2b");
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
