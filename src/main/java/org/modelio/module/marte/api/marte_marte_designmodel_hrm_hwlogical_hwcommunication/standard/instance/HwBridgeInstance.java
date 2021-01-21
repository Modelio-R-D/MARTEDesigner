/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwBridge_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1791ed7c-700c-4dc1-aa7c-0ad105fdf33b")
public class HwBridgeInstance extends HwMediaInstance {
    @objid ("65e3d983-cbe5-4a5c-88e0-417dc0ce140d")
    public static final String STEREOTYPE_NAME = "HwBridge_Instance";

    @objid ("c5021913-7d2c-4025-82d4-1d0656b295e2")
    public static final String HWBRIDGE_INSTANCE_SIDES_TAGTYPE = "HwBridge_Instance_sides";

    /**
     * Tells whether a {@link HwBridgeInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwBridge_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("015b0f87-2ebc-43b3-82dc-54c788052d2a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwBridge_Instance >> then instantiate a {@link HwBridgeInstance} proxy.
     * 
     * @return a {@link HwBridgeInstance} proxy on the created {@link Instance}.
     */
    @objid ("5abd0072-b992-4172-9340-e3dd1767683b")
    public static HwBridgeInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeInstance.STEREOTYPE_NAME);
        return HwBridgeInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwBridgeInstance} proxy from a {@link Instance} stereotyped << HwBridge_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwBridgeInstance} proxy or <i>null</i>.
     */
    @objid ("b8e798ed-1eef-46f0-87c1-78c39ef9d0ec")
    public static HwBridgeInstance instantiate(final Instance obj) {
        return HwBridgeInstance.canInstantiate(obj) ? new HwBridgeInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBridgeInstance} proxy from a {@link Instance} stereotyped << HwBridge_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwBridgeInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c92af81f-fae9-4a48-ac66-5ef3c8505ca3")
    public static HwBridgeInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwBridgeInstance.canInstantiate(obj))
        	return new HwBridgeInstance(obj);
        else
        	throw new IllegalArgumentException("HwBridgeInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e5c97f38-c8df-4890-bd59-436f3ff32c8e")
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
        HwBridgeInstance other = (HwBridgeInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("db644380-eec2-4c51-b533-214267f2b9c9")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwBridge_Instance_sides'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("998b13d8-6106-422d-b3e7-d9104dcbd077")
    public List<String> getHwBridge_Instance_sides() {
        return this.elt.getTagValues(HwBridgeInstance.MdaTypes.HWBRIDGE_INSTANCE_SIDES_TAGTYPE_ELT);
    }

    @objid ("93db1979-4d11-4fb6-9038-a2b5a068ccde")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwBridge_Instance_sides'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b3770d8b-45c7-419e-9c9a-93015d35d91a")
    public void setHwBridge_Instance_sides(final List<String> values) {
        this.elt.putTagValues(HwBridgeInstance.MdaTypes.HWBRIDGE_INSTANCE_SIDES_TAGTYPE_ELT, values);
    }

    @objid ("5c38d132-af7f-4a4c-9dcf-45f944469cbf")
    protected HwBridgeInstance(final Instance elt) {
        super(elt);
    }

    @objid ("015ed03a-c4df-4622-af5a-cd0628cd84a2")
    public static final class MdaTypes {
        @objid ("9cce62b7-a953-431f-ab8d-d2371bfa7cb5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4dbdbfb7-1016-4906-ae2f-4116a3920f55")
        public static TagType HWBRIDGE_INSTANCE_SIDES_TAGTYPE_ELT;

        @objid ("9dc49bce-e0e7-4407-ba05-b74968544aa4")
        private static Stereotype MDAASSOCDEP;

        @objid ("8ab5a1a6-397e-4a96-ad92-c1a478b4aa94")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f16cd56e-2328-408f-aebc-764a0f7b705c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "011da471-0ccf-11df-8525-001302895b2b");
            HWBRIDGE_INSTANCE_SIDES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c01c592b-1726-11df-b92a-0014222a9f79");
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
