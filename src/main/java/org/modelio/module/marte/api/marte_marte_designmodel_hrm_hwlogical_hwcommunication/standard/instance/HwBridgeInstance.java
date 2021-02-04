/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("051ed767-4c54-4cc8-8628-a1637b5e1296")
    public static final String STEREOTYPE_NAME = "HwBridge_Instance";

    @objid ("d0c8af37-e86c-43b8-b01c-16337eadb543")
    public static final String HWBRIDGE_INSTANCE_SIDES_TAGTYPE = "HwBridge_Instance_sides";

    /**
     * Tells whether a {@link HwBridgeInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwBridge_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ca52fd2d-c5a6-4bfc-8b11-572fc6ab0ed5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwBridge_Instance >> then instantiate a {@link HwBridgeInstance} proxy.
     * 
     * @return a {@link HwBridgeInstance} proxy on the created {@link Instance}.
     */
    @objid ("2834b8ce-febe-46aa-b3e6-336e04033663")
    public static HwBridgeInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeInstance.STEREOTYPE_NAME);
        return HwBridgeInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwBridgeInstance} proxy from a {@link Instance} stereotyped << HwBridge_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwBridgeInstance} proxy or <i>null</i>.
     */
    @objid ("f8c61458-8a0f-4d2a-a192-aa86fc98af83")
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
    @objid ("6eadee72-4f24-4e44-8131-74b08fd0028b")
    public static HwBridgeInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwBridgeInstance.canInstantiate(obj))
        	return new HwBridgeInstance(obj);
        else
        	throw new IllegalArgumentException("HwBridgeInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a979f29f-1f7f-448c-b8c8-86beb504decc")
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
    @objid ("447f396b-f229-43db-960e-40c230e7a51e")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwBridge_Instance_sides'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("46728553-7932-41c7-82c4-7785c15cc9ee")
    public List<String> getHwBridge_Instance_sides() {
        return this.elt.getTagValues(HwBridgeInstance.MdaTypes.HWBRIDGE_INSTANCE_SIDES_TAGTYPE_ELT);
    }

    @objid ("ad228569-9ae6-47a2-afb3-b1e5c9f38792")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwBridge_Instance_sides'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d95b572-c48d-48df-b45c-b607b0dcf6db")
    public void setHwBridge_Instance_sides(final List<String> values) {
        this.elt.putTagValues(HwBridgeInstance.MdaTypes.HWBRIDGE_INSTANCE_SIDES_TAGTYPE_ELT, values);
    }

    @objid ("237dcad2-8804-4f82-ae9a-f82c6e624855")
    protected HwBridgeInstance(final Instance elt) {
        super(elt);
    }

    @objid ("015ed03a-c4df-4622-af5a-cd0628cd84a2")
    public static final class MdaTypes {
        @objid ("52e4665f-765f-480c-8c3a-f63a4526128d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7a60395a-e7d7-4605-b326-e1b6fa236f79")
        public static TagType HWBRIDGE_INSTANCE_SIDES_TAGTYPE_ELT;

        @objid ("3232f57c-4600-4a33-a991-3b34c02ffe7e")
        private static Stereotype MDAASSOCDEP;

        @objid ("99aaa65a-042a-4771-be6e-c2b20193afa5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9c86ac68-2699-4a04-b820-7676ad62ec73")
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
