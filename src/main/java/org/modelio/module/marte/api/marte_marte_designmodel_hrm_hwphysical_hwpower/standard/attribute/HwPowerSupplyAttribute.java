/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.attribute;

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
public class HwPowerSupplyAttribute extends HwComponentAttribute {
    public static final String STEREOTYPE_NAME = "HwPowerSupply_Attribute";

    public static final String HWPOWERSUPPLY_ATTRIBUTE_CAPACITY_TAGTYPE = "HwPowerSupply_Attribute_capacity";

    public static final String HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER_TAGTYPE = "HwPowerSupply_Attribute_suppliedPower";

    /**
     * Tells whether a {@link HwPowerSupplyAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwPowerSupply_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwPowerSupply_Attribute >> then instantiate a {@link HwPowerSupplyAttribute} proxy.
     * 
     * @return a {@link HwPowerSupplyAttribute} proxy on the created {@link Attribute}.
     */
    public static HwPowerSupplyAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyAttribute.STEREOTYPE_NAME);
        return HwPowerSupplyAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyAttribute} proxy from a {@link Attribute} stereotyped << HwPowerSupply_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwPowerSupplyAttribute} proxy or <i>null</i>.
     */
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
    public static HwPowerSupplyAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwPowerSupplyAttribute.canInstantiate(obj))
        	return new HwPowerSupplyAttribute(obj);
        else
        	throw new IllegalArgumentException("HwPowerSupplyAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwPowerSupplyAttribute other = (HwPowerSupplyAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwPowerSupply_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPowerSupply_Attribute_capacity() {
        return this.elt.getTagValue(HwPowerSupplyAttribute.MdaTypes.HWPOWERSUPPLY_ATTRIBUTE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPowerSupply_Attribute_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwPowerSupply_Attribute_suppliedPower() {
        return this.elt.getTagValue(HwPowerSupplyAttribute.MdaTypes.HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwPowerSupply_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPowerSupply_Attribute_capacity(final String value) {
        this.elt.putTagValue(HwPowerSupplyAttribute.MdaTypes.HWPOWERSUPPLY_ATTRIBUTE_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPowerSupply_Attribute_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwPowerSupply_Attribute_suppliedPower(final String value) {
        this.elt.putTagValue(HwPowerSupplyAttribute.MdaTypes.HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER_TAGTYPE_ELT, value);
    }

    protected HwPowerSupplyAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER_TAGTYPE_ELT;

        public static TagType HWPOWERSUPPLY_ATTRIBUTE_CAPACITY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
