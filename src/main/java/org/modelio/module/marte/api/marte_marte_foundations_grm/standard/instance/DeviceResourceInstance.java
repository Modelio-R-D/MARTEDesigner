/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << DeviceResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6544457c-0805-4a0d-9372-758d7cea16a1")
public class DeviceResourceInstance extends ProcessingResourceInstance {
    @objid ("dd31e980-5729-4380-ac25-3199da7b1d06")
    public static final String STEREOTYPE_NAME = "DeviceResource_Instance";

    /**
     * Tells whether a {@link DeviceResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << DeviceResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("13212263-c328-4c3b-a515-8bafbf70c76d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << DeviceResource_Instance >> then instantiate a {@link DeviceResourceInstance} proxy.
     * 
     * @return a {@link DeviceResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("7c1dda79-0fe6-492e-a5df-44016f78236f")
    public static DeviceResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceInstance.STEREOTYPE_NAME);
        return DeviceResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link DeviceResourceInstance} proxy from a {@link Instance} stereotyped << DeviceResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link DeviceResourceInstance} proxy or <i>null</i>.
     */
    @objid ("894d43bd-4693-4807-8583-0d177e1e033f")
    public static DeviceResourceInstance instantiate(final Instance obj) {
        return DeviceResourceInstance.canInstantiate(obj) ? new DeviceResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceResourceInstance} proxy from a {@link Instance} stereotyped << DeviceResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link DeviceResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4d28647f-1bc4-46a5-a2e8-59a83b74fb0f")
    public static DeviceResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (DeviceResourceInstance.canInstantiate(obj))
        	return new DeviceResourceInstance(obj);
        else
        	throw new IllegalArgumentException("DeviceResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("abd5dadc-c565-40e8-b712-1cc76a108399")
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
        DeviceResourceInstance other = (DeviceResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("6d998d49-c318-47f6-bce1-086576ff88a8")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("58fcebf7-7261-43dc-9d44-d5348429983c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2ee3970a-7fc9-4fe1-9c8a-46d26749b145")
    protected DeviceResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("b9d3e7db-d5a2-473e-9496-31e577e3574e")
    public static final class MdaTypes {
        @objid ("48d6f87d-29fa-42bf-a45e-3a48aeb3cfec")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("573fd4e0-2488-43cf-b255-df51d525e488")
        private static Stereotype MDAASSOCDEP;

        @objid ("7be1a7cd-049c-4af5-b581-c6973120e44f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("eb4a2043-6e7e-445c-a9da-23263a3a20a2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009a84db-0ccf-11df-8525-001302895b2b");
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
