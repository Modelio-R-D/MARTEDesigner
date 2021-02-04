/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("7b611a1c-c8aa-41ae-84ef-14ce4cc9a117")
    public static final String STEREOTYPE_NAME = "HwPowerSupply_Attribute";

    @objid ("1697739f-7a5d-4333-8a3f-e165cd66f5f8")
    public static final String HWPOWERSUPPLY_ATTRIBUTE_CAPACITY_TAGTYPE = "HwPowerSupply_Attribute_capacity";

    @objid ("52e6ed73-1782-4136-9062-76c89d8dc09b")
    public static final String HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER_TAGTYPE = "HwPowerSupply_Attribute_suppliedPower";

    /**
     * Tells whether a {@link HwPowerSupplyAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwPowerSupply_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3d9c4382-86d5-4018-a08e-f8c66fbc251e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwPowerSupply_Attribute >> then instantiate a {@link HwPowerSupplyAttribute} proxy.
     * 
     * @return a {@link HwPowerSupplyAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("9bc9f4f1-ab12-4eaa-8997-c4ba08e14885")
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
    @objid ("9aa26e39-ec4e-4ac5-9902-b4a998da225d")
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
    @objid ("dd77af92-4f50-4c08-846a-4e7b5105b311")
    public static HwPowerSupplyAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwPowerSupplyAttribute.canInstantiate(obj))
        	return new HwPowerSupplyAttribute(obj);
        else
        	throw new IllegalArgumentException("HwPowerSupplyAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("38f61993-7166-41f4-ac6d-231df7992242")
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
    @objid ("3c280429-90e9-4b94-8e01-bb8f0af35711")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwPowerSupply_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e3e035b4-55b3-445a-8255-3030f073bb23")
    public String getHwPowerSupply_Attribute_capacity() {
        return this.elt.getTagValue(HwPowerSupplyAttribute.MdaTypes.HWPOWERSUPPLY_ATTRIBUTE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPowerSupply_Attribute_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8606700e-fe89-431f-9b66-2c7f51386373")
    public String getHwPowerSupply_Attribute_suppliedPower() {
        return this.elt.getTagValue(HwPowerSupplyAttribute.MdaTypes.HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER_TAGTYPE_ELT);
    }

    @objid ("ad78bd79-c125-4d74-b310-3cb7e8524de3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwPowerSupply_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5ecf3d83-733f-4c0e-810f-50841f8681d3")
    public void setHwPowerSupply_Attribute_capacity(final String value) {
        this.elt.putTagValue(HwPowerSupplyAttribute.MdaTypes.HWPOWERSUPPLY_ATTRIBUTE_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPowerSupply_Attribute_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ce7f48df-00b0-4c9d-8f00-075f1c5a84df")
    public void setHwPowerSupply_Attribute_suppliedPower(final String value) {
        this.elt.putTagValue(HwPowerSupplyAttribute.MdaTypes.HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER_TAGTYPE_ELT, value);
    }

    @objid ("383c5600-ea93-400a-bd77-dea7c5c4b14e")
    protected HwPowerSupplyAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("1f82028e-057b-45b4-b7a5-6830c8e5d5a2")
    public static final class MdaTypes {
        @objid ("5ffe662f-f6e6-4d8e-a0ae-5f2a0717d636")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4c16350d-0a6e-440a-b2e3-2906a9dc585b")
        public static TagType HWPOWERSUPPLY_ATTRIBUTE_SUPPLIEDPOWER_TAGTYPE_ELT;

        @objid ("7694aa5f-df34-4a19-9d5f-b12002cd992e")
        public static TagType HWPOWERSUPPLY_ATTRIBUTE_CAPACITY_TAGTYPE_ELT;

        @objid ("e7eb0152-531c-4555-a6c6-5aa6b0b9e878")
        private static Stereotype MDAASSOCDEP;

        @objid ("5c718515-db18-405f-97cd-0cba6b342055")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b235e6b6-a69b-41c1-b800-0aca87644c76")
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
