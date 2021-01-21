/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwBridge_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1d52da64-24a5-4408-8c26-85331f7003b6")
public class HwBridgeAttribute extends HwMediaAttribute {
    @objid ("6080ffc7-6ab5-471b-a13b-8ec8471f0f25")
    public static final String STEREOTYPE_NAME = "HwBridge_Attribute";

    @objid ("53c3795f-cb28-45f6-a8ca-db9048a4b74a")
    public static final String HWBRIDGE_ATTRIBUTE_SIDES_TAGTYPE = "HwBridge_Attribute_sides";

    /**
     * Tells whether a {@link HwBridgeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwBridge_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ae6753bb-56bc-4d14-a6cd-c8f024004bbd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwBridge_Attribute >> then instantiate a {@link HwBridgeAttribute} proxy.
     * 
     * @return a {@link HwBridgeAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("cdb2f18a-b8c7-46f4-ad6e-84ecdcbc29d3")
    public static HwBridgeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeAttribute.STEREOTYPE_NAME);
        return HwBridgeAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwBridgeAttribute} proxy from a {@link Attribute} stereotyped << HwBridge_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwBridgeAttribute} proxy or <i>null</i>.
     */
    @objid ("bf770ee4-7979-4077-b548-a70890ae9c0c")
    public static HwBridgeAttribute instantiate(final Attribute obj) {
        return HwBridgeAttribute.canInstantiate(obj) ? new HwBridgeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBridgeAttribute} proxy from a {@link Attribute} stereotyped << HwBridge_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwBridgeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("25b54645-f392-4fe8-a5b4-94d41f881405")
    public static HwBridgeAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwBridgeAttribute.canInstantiate(obj))
        	return new HwBridgeAttribute(obj);
        else
        	throw new IllegalArgumentException("HwBridgeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("68901ac4-bc50-47b5-8057-48f4d2d8b199")
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
        HwBridgeAttribute other = (HwBridgeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("52a0ed88-bc8d-41cd-ab7c-1ba184fa4d86")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwBridge_Attribute_sides'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e30f7b60-691b-48d4-9860-03536f47035b")
    public List<String> getHwBridge_Attribute_sides() {
        return this.elt.getTagValues(HwBridgeAttribute.MdaTypes.HWBRIDGE_ATTRIBUTE_SIDES_TAGTYPE_ELT);
    }

    @objid ("630ed41a-ca5b-41b4-a583-3559773112d2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwBridge_Attribute_sides'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9f633a79-077a-44c4-b600-74aaf2bfd8bf")
    public void setHwBridge_Attribute_sides(final List<String> values) {
        this.elt.putTagValues(HwBridgeAttribute.MdaTypes.HWBRIDGE_ATTRIBUTE_SIDES_TAGTYPE_ELT, values);
    }

    @objid ("a3c64b31-f353-496a-99a6-30d63277f5d5")
    protected HwBridgeAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("4a8f7e27-3a73-4b77-a16a-2479351c5193")
    public static final class MdaTypes {
        @objid ("05b82de6-c3bd-4ce3-abbb-227ada3972d9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("03dcac8f-e9df-4576-a6dd-01e771b9a3d1")
        public static TagType HWBRIDGE_ATTRIBUTE_SIDES_TAGTYPE_ELT;

        @objid ("f877f5fc-bc4b-45b1-939d-5a2ce4794a5c")
        private static Stereotype MDAASSOCDEP;

        @objid ("7c1a535f-a886-4fcf-a5e9-45113b837f19")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("23313b91-7abd-4fe1-89b6-4f270281e3ea")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "011da46f-0ccf-11df-8525-001302895b2b");
            HWBRIDGE_ATTRIBUTE_SIDES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bbcc7a34-1726-11df-b92a-0014222a9f79");
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
