/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.instance;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.instance.HwResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwDevice_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d8c82611-e425-41fa-b66f-7ecf921dba6b")
public class HwDeviceInstance extends HwResourceInstance {
    @objid ("3f13d450-3a07-43be-b380-25993c1b6706")
    public static final String STEREOTYPE_NAME = "HwDevice_Instance";

    @objid ("647ef7ba-83dd-4dcb-a294-60ea062ccef7")
    public static final String HWDEVICE_INSTANCE_MAINSCHEDULER_TAGTYPE = "HwDevice_Instance_mainScheduler";

    @objid ("553216ab-ac03-4a1a-9165-e8c33e9c7ac5")
    public static final String HWDEVICE_INSTANCE_SPEEDFACTOR_TAGTYPE = "HwDevice_Instance_speedFactor";

    /**
     * Tells whether a {@link HwDeviceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwDevice_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bb3e5e13-bbf4-4146-a492-23ab2f1ec041")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwDevice_Instance >> then instantiate a {@link HwDeviceInstance} proxy.
     * 
     * @return a {@link HwDeviceInstance} proxy on the created {@link Instance}.
     */
    @objid ("d45c593d-f4e2-4c7f-b130-3bb7ca277c07")
    public static HwDeviceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceInstance.STEREOTYPE_NAME);
        return HwDeviceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwDeviceInstance} proxy from a {@link Instance} stereotyped << HwDevice_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwDeviceInstance} proxy or <i>null</i>.
     */
    @objid ("bfd22934-2c05-4b28-8f07-a284a845d44e")
    public static HwDeviceInstance instantiate(final Instance obj) {
        return HwDeviceInstance.canInstantiate(obj) ? new HwDeviceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDeviceInstance} proxy from a {@link Instance} stereotyped << HwDevice_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwDeviceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8e9ee82c-83c3-489c-a5f5-ee15f13bd526")
    public static HwDeviceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwDeviceInstance.canInstantiate(obj))
        	return new HwDeviceInstance(obj);
        else
        	throw new IllegalArgumentException("HwDeviceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b50d483c-91ed-487f-89d3-5b907a881d10")
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
        HwDeviceInstance other = (HwDeviceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("ee470cca-d891-4ee9-9876-917e8eab3533")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwDevice_Instance_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c9cb349d-2948-448a-8b22-61e2f62d59fb")
    public String getHwDevice_Instance_mainScheduler() {
        return this.elt.getTagValue(HwDeviceInstance.MdaTypes.HWDEVICE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDevice_Instance_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("67092397-274f-4186-90c6-df2247d71cf9")
    public String getHwDevice_Instance_speedFactor() {
        return this.elt.getTagValue(HwDeviceInstance.MdaTypes.HWDEVICE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("4811ee54-989f-421c-9386-8e9e7b863090")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDevice_Instance_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d02fcfe-810d-47bc-9250-bd5786400741")
    public void setHwDevice_Instance_mainScheduler(final String value) {
        this.elt.putTagValue(HwDeviceInstance.MdaTypes.HWDEVICE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDevice_Instance_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2cbab18a-9ae7-420d-9c19-712128896017")
    public void setHwDevice_Instance_speedFactor(final String value) {
        this.elt.putTagValue(HwDeviceInstance.MdaTypes.HWDEVICE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("4dbc9053-3f34-4726-89ff-c7c70ad0f5c9")
    protected HwDeviceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("a4025c3c-06f1-4a23-b920-3f677485ba6e")
    public static final class MdaTypes {
        @objid ("7c5dabe9-b10a-4632-b4b7-5169943f2acc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f5aa3f01-af3c-40ae-b562-70b0189e1ea8")
        public static TagType HWDEVICE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("12c7d052-c7a4-47ec-844d-1009d9c59ac4")
        public static TagType HWDEVICE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("6afd6081-3f27-4275-926a-f01aaf389d3c")
        private static Stereotype MDAASSOCDEP;

        @objid ("90a6be09-e75f-4f27-bf10-b3c2f192fd42")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a67e9cc1-cb7e-4d53-be16-70e4a898f651")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0130b702-0ccf-11df-8525-001302895b2b");
            HWDEVICE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "527fbec0-92ab-11e0-a69d-0027103f347c");
            HWDEVICE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "527fbec1-92ab-11e0-a69d-0027103f347c");
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
