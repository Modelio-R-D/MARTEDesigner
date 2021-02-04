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
 * Proxy class to handle a {@link Attribute} with << HwI_O_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("629b2c5f-b37e-4d0f-b5b2-6963dfccf5fa")
public class HwIOAttribute extends HwDeviceAttribute {
    @objid ("abdca9de-3054-40ce-a9f8-03d433bb5027")
    public static final String STEREOTYPE_NAME = "HwI_O_Attribute";

    /**
     * Tells whether a {@link HwIOAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwI_O_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c84ca2c8-b63d-43ab-b2b8-8913b928ed30")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwIOAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwI_O_Attribute >> then instantiate a {@link HwIOAttribute} proxy.
     * 
     * @return a {@link HwIOAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("ca7adc24-55ad-4d92-9875-3e7035673201")
    public static HwIOAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwIOAttribute.STEREOTYPE_NAME);
        return HwIOAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwIOAttribute} proxy from a {@link Attribute} stereotyped << HwI_O_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwIOAttribute} proxy or <i>null</i>.
     */
    @objid ("488fbe44-d9ba-47d7-99b9-cb669e419275")
    public static HwIOAttribute instantiate(final Attribute obj) {
        return HwIOAttribute.canInstantiate(obj) ? new HwIOAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwIOAttribute} proxy from a {@link Attribute} stereotyped << HwI_O_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwIOAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d2f95cf1-cf47-4ad8-9e37-5280f0741bc8")
    public static HwIOAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwIOAttribute.canInstantiate(obj))
        	return new HwIOAttribute(obj);
        else
        	throw new IllegalArgumentException("HwIOAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("873763b3-90fc-4b4c-9cc5-3f5a23b914a8")
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
        HwIOAttribute other = (HwIOAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("06076f20-d14b-4f7a-84ab-11fc56933a81")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("38216395-883e-4d83-8b1a-afeff2a0a2c1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d395d1d2-6839-4be6-81e7-71f550c2634c")
    protected HwIOAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("2e17f25b-e585-4a34-86ea-845f3cd6510e")
    public static final class MdaTypes {
        @objid ("19b72344-75d9-4ae3-b8f7-618903cfcb39")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e454592d-ce04-488a-9037-a48069e841a4")
        private static Stereotype MDAASSOCDEP;

        @objid ("4c93cca7-6f62-4d6e-bb5e-8bafb7c1feb9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("456cfb86-2fd3-4be2-9881-eb1c5dcd3473")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0137ddf5-0ccf-11df-8525-001302895b2b");
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
