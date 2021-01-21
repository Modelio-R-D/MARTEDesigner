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
 * Proxy class to handle a {@link Instance} with << SynchronizationResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a8bdf0c5-0d02-4f6d-98e7-6a87560b4f59")
public class SynchronizationResourceInstance extends ResourceInstance {
    @objid ("0a682946-666c-4ea7-aec9-2acc25bf5ab5")
    public static final String STEREOTYPE_NAME = "SynchronizationResource_Instance";

    /**
     * Tells whether a {@link SynchronizationResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SynchronizationResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("64551d8e-447f-44c7-b4ea-e794bb5f88e5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SynchronizationResource_Instance >> then instantiate a {@link SynchronizationResourceInstance} proxy.
     * 
     * @return a {@link SynchronizationResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("8866472e-3e75-4b75-a561-d0ad971799f5")
    public static SynchronizationResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceInstance.STEREOTYPE_NAME);
        return SynchronizationResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceInstance} proxy from a {@link Instance} stereotyped << SynchronizationResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SynchronizationResourceInstance} proxy or <i>null</i>.
     */
    @objid ("e3ce1183-a34c-46ca-84a6-f8740428b03c")
    public static SynchronizationResourceInstance instantiate(final Instance obj) {
        return SynchronizationResourceInstance.canInstantiate(obj) ? new SynchronizationResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceInstance} proxy from a {@link Instance} stereotyped << SynchronizationResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SynchronizationResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7e4acfce-f1cb-4abf-a937-4d412920661e")
    public static SynchronizationResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SynchronizationResourceInstance.canInstantiate(obj))
        	return new SynchronizationResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SynchronizationResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("acc29790-5d4f-4583-bb96-d84f34c3c1ca")
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
        SynchronizationResourceInstance other = (SynchronizationResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("431e68c3-3fb4-4a1f-8c5e-d41e6824a230")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("d9777835-9d00-4fa9-ae43-d440d407c37c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("63f43546-af79-450f-ac48-3bddf58c0a6c")
    protected SynchronizationResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("f6935e15-2de3-4eea-bb86-e96ebb1646e8")
    public static final class MdaTypes {
        @objid ("79c4bd2c-2dc8-4e5b-ac20-8c6efed0284b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bb288028-1d93-4f3a-b16c-42ddd10ca15e")
        private static Stereotype MDAASSOCDEP;

        @objid ("784beafb-10e3-46fc-b863-a69f65e1ab41")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("87cce028-44eb-424f-a7f4-85af95cb5936")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ffa75827-0cce-11df-8525-001302895b2b");
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
