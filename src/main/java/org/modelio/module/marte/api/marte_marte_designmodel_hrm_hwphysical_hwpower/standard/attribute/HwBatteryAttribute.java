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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwBattery_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c6d99704-5394-48fa-9d36-7fca4c55f45a")
public class HwBatteryAttribute extends HwPowerSupplyAttribute {
    @objid ("76502186-a4e6-40b5-a5d0-4e4f2d575832")
    public static final String STEREOTYPE_NAME = "HwBattery_Attribute";

    @objid ("ef0b518d-d551-4611-9087-346135efac88")
    public static final String HWBATTERY_ATTRIBUTE_CAPACITY_TAGTYPE = "HwBattery_Attribute_capacity";

    /**
     * Tells whether a {@link HwBatteryAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwBattery_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5a48295b-43f1-4496-87e0-3ebf320b5105")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwBattery_Attribute >> then instantiate a {@link HwBatteryAttribute} proxy.
     * 
     * @return a {@link HwBatteryAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("fc6da355-8d3b-4e94-836c-8fff58f445c6")
    public static HwBatteryAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryAttribute.STEREOTYPE_NAME);
        return HwBatteryAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwBatteryAttribute} proxy from a {@link Attribute} stereotyped << HwBattery_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwBatteryAttribute} proxy or <i>null</i>.
     */
    @objid ("4ad7d0f9-c332-42e8-a4d4-8ae24bbc3be3")
    public static HwBatteryAttribute instantiate(final Attribute obj) {
        return HwBatteryAttribute.canInstantiate(obj) ? new HwBatteryAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBatteryAttribute} proxy from a {@link Attribute} stereotyped << HwBattery_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwBatteryAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("25fc9d5f-ef72-44ae-8f7b-81bc3ddaae66")
    public static HwBatteryAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwBatteryAttribute.canInstantiate(obj))
        	return new HwBatteryAttribute(obj);
        else
        	throw new IllegalArgumentException("HwBatteryAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5e816804-81cf-4aec-ac03-3d44ceb84c32")
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
        HwBatteryAttribute other = (HwBatteryAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("a347b92f-a4bf-4eb0-b170-a81d98df0893")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwBattery_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("180c93fa-2198-4f3e-ac47-f45eb1ef4195")
    public String getHwBattery_Attribute_capacity() {
        return this.elt.getTagValue(HwBatteryAttribute.MdaTypes.HWBATTERY_ATTRIBUTE_CAPACITY_TAGTYPE_ELT);
    }

    @objid ("136d2a47-9d3f-47f2-9739-ecf97b8147ba")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwBattery_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fafe7755-e225-4454-8edf-9d11e4376fd7")
    public void setHwBattery_Attribute_capacity(final String value) {
        this.elt.putTagValue(HwBatteryAttribute.MdaTypes.HWBATTERY_ATTRIBUTE_CAPACITY_TAGTYPE_ELT, value);
    }

    @objid ("06adff82-fbae-4c67-a37b-bd7ea8b3c008")
    protected HwBatteryAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("554f4d34-e907-4dd3-b956-9847224d9de8")
    public static final class MdaTypes {
        @objid ("ed3d8f95-407e-49a3-a07c-8e44c3cd5af1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("712ae1ef-f722-46d4-8301-6d12628b1230")
        public static TagType HWBATTERY_ATTRIBUTE_CAPACITY_TAGTYPE_ELT;

        @objid ("318d6bc2-0200-473c-af0a-23fae1bf69d5")
        private static Stereotype MDAASSOCDEP;

        @objid ("15710996-4618-4347-b3c4-30540a417493")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4f351aee-71d7-4ea0-9de2-9cd7252371a5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "563acf1c-c7b2-11df-ad39-001302895b2b");
            HWBATTERY_ATTRIBUTE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "563acf26-c7b2-11df-ad39-001302895b2b");
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
