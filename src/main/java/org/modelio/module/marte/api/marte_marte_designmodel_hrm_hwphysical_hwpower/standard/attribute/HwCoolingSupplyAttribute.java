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
 * Proxy class to handle a {@link Attribute} with << HwCoolingSupply_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4c1d19ce-b58f-4403-9b15-414f72ec0757")
public class HwCoolingSupplyAttribute extends HwComponentAttribute {
    @objid ("d32984c5-8602-4da5-af29-24267ea70161")
    public static final String STEREOTYPE_NAME = "HwCoolingSupply_Attribute";

    @objid ("d1f05319-6e49-4e41-b898-1b59ab04e748")
    public static final String HWCOOLINGSUPPLY_ATTRIBUTE_COOLINGPOWER_TAGTYPE = "HwCoolingSupply_Attribute_coolingPower";

    /**
     * Tells whether a {@link HwCoolingSupplyAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwCoolingSupply_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2af7d7d6-c9ba-4195-9cfa-74ddc6e0106c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwCoolingSupply_Attribute >> then instantiate a {@link HwCoolingSupplyAttribute} proxy.
     * 
     * @return a {@link HwCoolingSupplyAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("bf5bfb16-88b3-4e4e-b62d-8c90057c8464")
    public static HwCoolingSupplyAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyAttribute.STEREOTYPE_NAME);
        return HwCoolingSupplyAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyAttribute} proxy from a {@link Attribute} stereotyped << HwCoolingSupply_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwCoolingSupplyAttribute} proxy or <i>null</i>.
     */
    @objid ("2095c94a-55a0-4b46-9b4a-fbd18f3eb6c3")
    public static HwCoolingSupplyAttribute instantiate(final Attribute obj) {
        return HwCoolingSupplyAttribute.canInstantiate(obj) ? new HwCoolingSupplyAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyAttribute} proxy from a {@link Attribute} stereotyped << HwCoolingSupply_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwCoolingSupplyAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5d3c71b3-dc57-4547-b4dd-053efaadd676")
    public static HwCoolingSupplyAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwCoolingSupplyAttribute.canInstantiate(obj))
        	return new HwCoolingSupplyAttribute(obj);
        else
        	throw new IllegalArgumentException("HwCoolingSupplyAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("84efa3aa-f826-4a46-9ad3-9f409029b591")
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
        HwCoolingSupplyAttribute other = (HwCoolingSupplyAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("3e58044d-f2c5-4fe7-a47a-9b3951e86f18")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwCoolingSupply_Attribute_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0649857b-a859-4fd7-9c8a-cd953c642674")
    public String getHwCoolingSupply_Attribute_coolingPower() {
        return this.elt.getTagValue(HwCoolingSupplyAttribute.MdaTypes.HWCOOLINGSUPPLY_ATTRIBUTE_COOLINGPOWER_TAGTYPE_ELT);
    }

    @objid ("9a344544-484d-47ae-95b3-8624375ac940")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCoolingSupply_Attribute_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5dc9b2c4-3bfd-4c8e-814c-c1fcf804db1e")
    public void setHwCoolingSupply_Attribute_coolingPower(final String value) {
        this.elt.putTagValue(HwCoolingSupplyAttribute.MdaTypes.HWCOOLINGSUPPLY_ATTRIBUTE_COOLINGPOWER_TAGTYPE_ELT, value);
    }

    @objid ("e79d0806-38b7-4f45-a0d5-36f481593a7f")
    protected HwCoolingSupplyAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("8deb0881-b357-4213-8b05-ca10a4a538d2")
    public static final class MdaTypes {
        @objid ("b71fd8f2-6087-4bbf-91d2-a07b4e3b49d6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3aaa2212-3f0d-438b-8b7a-efd384a4b522")
        public static TagType HWCOOLINGSUPPLY_ATTRIBUTE_COOLINGPOWER_TAGTYPE_ELT;

        @objid ("7819462e-33a5-4b0f-9eaa-c42e97aa71b7")
        private static Stereotype MDAASSOCDEP;

        @objid ("08d3e76d-a790-4360-be11-8cdae486de90")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("46021cc1-6180-4f68-89bf-338a48fe17bc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01973ac5-0ccf-11df-8525-001302895b2b");
            HWCOOLINGSUPPLY_ATTRIBUTE_COOLINGPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01973acc-0ccf-11df-8525-001302895b2b");
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
