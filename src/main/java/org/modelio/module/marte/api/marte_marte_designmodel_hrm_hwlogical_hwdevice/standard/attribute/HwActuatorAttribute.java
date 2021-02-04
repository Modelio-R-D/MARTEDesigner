/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << HwActuator_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("328cac1d-5c9a-44ae-928c-9c22115fa52a")
public class HwActuatorAttribute extends HwIOAttribute {
    @objid ("f9678287-2dfb-4099-add8-95baa85bc103")
    public static final String STEREOTYPE_NAME = "HwActuator_Attribute";

    /**
     * Tells whether a {@link HwActuatorAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwActuator_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1c075422-dbb8-40aa-9646-a70509b7aaf6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwActuator_Attribute >> then instantiate a {@link HwActuatorAttribute} proxy.
     * 
     * @return a {@link HwActuatorAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("57f4c70c-81ae-4af0-97c9-723853292cf7")
    public static HwActuatorAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorAttribute.STEREOTYPE_NAME);
        return HwActuatorAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwActuatorAttribute} proxy from a {@link Attribute} stereotyped << HwActuator_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwActuatorAttribute} proxy or <i>null</i>.
     */
    @objid ("59f765cf-b7ff-42b1-a4ea-ccfd013de4d5")
    public static HwActuatorAttribute instantiate(final Attribute obj) {
        return HwActuatorAttribute.canInstantiate(obj) ? new HwActuatorAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwActuatorAttribute} proxy from a {@link Attribute} stereotyped << HwActuator_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwActuatorAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fbefb07a-7e27-495b-b82d-3e438e0a2ef6")
    public static HwActuatorAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwActuatorAttribute.canInstantiate(obj))
        	return new HwActuatorAttribute(obj);
        else
        	throw new IllegalArgumentException("HwActuatorAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d069c029-1373-4812-9053-20866d5b1f7e")
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
        HwActuatorAttribute other = (HwActuatorAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("4ce6917e-8e5c-4ca5-813e-cd57664ec624")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("c457b152-eb98-4bbe-898d-0e914d782baa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a29636ec-87ef-43da-b293-b1498b7bcfc0")
    protected HwActuatorAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("5ccc30e1-5957-4bc4-8b4a-18e05e91f882")
    public static final class MdaTypes {
        @objid ("26277570-9f12-4d9b-a1af-c8c755dec813")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("99843a74-e6ac-4607-a906-cf66e947ae1f")
        private static Stereotype MDAASSOCDEP;

        @objid ("36b4d118-fcb7-42ae-9ed9-97a89460249b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("696513f4-d966-499c-80c5-117404e6899b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "88a37411-c7ac-11df-ad39-001302895b2b");
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
