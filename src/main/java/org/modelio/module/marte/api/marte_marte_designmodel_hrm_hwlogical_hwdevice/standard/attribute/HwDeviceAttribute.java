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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.attribute.HwResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwDevice_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b692c93e-aa0c-4e6c-aff2-8a7b2b0aec3b")
public class HwDeviceAttribute extends HwResourceAttribute {
    @objid ("05b8e50f-97a4-4e0c-bc82-20763405b373")
    public static final String STEREOTYPE_NAME = "HwDevice_Attribute";

    @objid ("2196a5c1-0fa1-4991-9f70-e71420979929")
    public static final String HWDEVICE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE = "HwDevice_Attribute_mainScheduler";

    @objid ("8e4ca946-8a85-40c4-97b7-7b56589d41c0")
    public static final String HWDEVICE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE = "HwDevice_Attribute_speedFactor";

    /**
     * Tells whether a {@link HwDeviceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwDevice_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d9840943-e9c3-47f5-9e34-9bcdd2e3ba01")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwDevice_Attribute >> then instantiate a {@link HwDeviceAttribute} proxy.
     * 
     * @return a {@link HwDeviceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("b7dce503-c7ab-44e5-afde-fa4ed3fd8452")
    public static HwDeviceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceAttribute.STEREOTYPE_NAME);
        return HwDeviceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwDeviceAttribute} proxy from a {@link Attribute} stereotyped << HwDevice_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwDeviceAttribute} proxy or <i>null</i>.
     */
    @objid ("691b450b-c30e-4d7b-aeb7-d32f420b37c9")
    public static HwDeviceAttribute instantiate(final Attribute obj) {
        return HwDeviceAttribute.canInstantiate(obj) ? new HwDeviceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDeviceAttribute} proxy from a {@link Attribute} stereotyped << HwDevice_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwDeviceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("40535596-f389-4cb0-9a43-088c52c6ee6f")
    public static HwDeviceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwDeviceAttribute.canInstantiate(obj))
        	return new HwDeviceAttribute(obj);
        else
        	throw new IllegalArgumentException("HwDeviceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("819c7d22-8874-4534-bb62-0988f956c131")
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
        HwDeviceAttribute other = (HwDeviceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("eab2fcdf-6513-4967-b287-0405fe26487c")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwDevice_Attribute_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7dede164-7ee2-4d84-9e8d-a947986e7559")
    public String getHwDevice_Attribute_mainScheduler() {
        return this.elt.getTagValue(HwDeviceAttribute.MdaTypes.HWDEVICE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDevice_Attribute_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d633b5f0-4285-4d51-9ab7-9093ceb94609")
    public String getHwDevice_Attribute_speedFactor() {
        return this.elt.getTagValue(HwDeviceAttribute.MdaTypes.HWDEVICE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("6dd64de9-dffa-47f0-85c6-2a620ede5d6f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDevice_Attribute_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d148a711-c1cd-46cb-bef0-c7377698acf7")
    public void setHwDevice_Attribute_mainScheduler(final String value) {
        this.elt.putTagValue(HwDeviceAttribute.MdaTypes.HWDEVICE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDevice_Attribute_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2596fef-649a-47a4-8d51-a7fd194bc685")
    public void setHwDevice_Attribute_speedFactor(final String value) {
        this.elt.putTagValue(HwDeviceAttribute.MdaTypes.HWDEVICE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("73ef827d-1ff8-4613-80a8-4ce227c04116")
    protected HwDeviceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("5ad8343e-a472-4581-ad0f-9448a8bd01e2")
    public static final class MdaTypes {
        @objid ("b0ba2c3e-2e38-4aa4-a210-61657fbe9b49")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e2c1c376-3c10-4e83-be31-998c9b513b91")
        public static TagType HWDEVICE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("8c597d6f-6217-4aef-957e-6f71353c5fa2")
        public static TagType HWDEVICE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("dde6e0f7-bce5-4f20-a5e3-9588c6b3ad1b")
        private static Stereotype MDAASSOCDEP;

        @objid ("5cc74dc3-6afe-428e-86e9-0988ec5990d5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("43b57457-e16f-4573-8aed-2286edd2eb7a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0130b6ff-0ccf-11df-8525-001302895b2b");
            HWDEVICE_ATTRIBUTE_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "50e16d75-92ab-11e0-a69d-0027103f347c");
            HWDEVICE_ATTRIBUTE_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "50e16d76-92ab-11e0-a69d-0027103f347c");
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
