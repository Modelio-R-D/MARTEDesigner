/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("baee89c5-2f6a-4829-b923-52a48dcb6ff7")
    public static final String STEREOTYPE_NAME = "DeviceResource_Instance";

    /**
     * Tells whether a {@link DeviceResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << DeviceResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("da7c71c1-8547-46ff-ac04-8e36c52f103a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << DeviceResource_Instance >> then instantiate a {@link DeviceResourceInstance} proxy.
     * 
     * @return a {@link DeviceResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("bb7e11e6-38a2-47a4-a6d0-de224b16530d")
    public static DeviceResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceInstance.STEREOTYPE_NAME);
        return DeviceResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link DeviceResourceInstance} proxy from a {@link Instance} stereotyped << DeviceResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link DeviceResourceInstance} proxy or <i>null</i>.
     */
    @objid ("5411a00d-486c-49ee-87ac-89f8bddfde53")
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
    @objid ("5a5cd4b8-5443-405d-886a-bbd37f4161d8")
    public static DeviceResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (DeviceResourceInstance.canInstantiate(obj))
        	return new DeviceResourceInstance(obj);
        else
        	throw new IllegalArgumentException("DeviceResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5eb6d38a-6011-4692-9253-cefd94b0d677")
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
    @objid ("afd22c63-c89e-4ee1-92da-f1c8ac9a1682")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("a2428201-3e50-4e55-942d-f0550fa81bc8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("16db1457-52c5-4727-93d3-9c65bafa4b93")
    protected DeviceResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("b9d3e7db-d5a2-473e-9496-31e577e3574e")
    public static final class MdaTypes {
        @objid ("5a537f72-cd02-4e4b-bf89-2a2e8eebaa15")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bc5b2db8-c120-435a-af70-1b16c6bce3c5")
        private static Stereotype MDAASSOCDEP;

        @objid ("f4d66b23-1e56-4bdc-a49e-968ec3b59e95")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e04582fb-6eaf-4bc3-929e-eb6c4cc888ea")
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
