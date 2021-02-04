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
 * Proxy class to handle a {@link Instance} with << SynchronizationResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a8bdf0c5-0d02-4f6d-98e7-6a87560b4f59")
public class SynchronizationResourceInstance extends ResourceInstance {
    @objid ("0310cb10-0f75-43a8-945d-c6bf2bc8e932")
    public static final String STEREOTYPE_NAME = "SynchronizationResource_Instance";

    /**
     * Tells whether a {@link SynchronizationResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SynchronizationResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7b7cbb2f-f4a4-4cad-8763-c9037176fccc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SynchronizationResource_Instance >> then instantiate a {@link SynchronizationResourceInstance} proxy.
     * 
     * @return a {@link SynchronizationResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("8eddc1cf-cdd0-4495-983f-1ecb91f78d62")
    public static SynchronizationResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceInstance.STEREOTYPE_NAME);
        return SynchronizationResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceInstance} proxy from a {@link Instance} stereotyped << SynchronizationResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SynchronizationResourceInstance} proxy or <i>null</i>.
     */
    @objid ("6d5a3036-ebc7-423f-b32e-3d2bc2670363")
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
    @objid ("96f367d7-23e6-4502-9b59-7f8f2ae22972")
    public static SynchronizationResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SynchronizationResourceInstance.canInstantiate(obj))
        	return new SynchronizationResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SynchronizationResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3fd3a315-04ef-4e5a-9ac1-ab351e17d896")
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
    @objid ("53fd89e5-9ec9-48b2-869d-43de79bbb7eb")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("07a196b9-1f7c-4778-83bb-19a9b9ff1ab9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4cb78039-615f-4b50-b6ea-b8fe0c8354ec")
    protected SynchronizationResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("f6935e15-2de3-4eea-bb86-e96ebb1646e8")
    public static final class MdaTypes {
        @objid ("c668fec1-9ab8-4169-91c3-56c5b41b4de4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d3737128-eb6a-4d52-81fe-1bd900c32814")
        private static Stereotype MDAASSOCDEP;

        @objid ("5edd060c-e3fa-4c90-bd94-417708903ccc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("59c7efb6-1483-4eb0-ab0f-92eba425f500")
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
