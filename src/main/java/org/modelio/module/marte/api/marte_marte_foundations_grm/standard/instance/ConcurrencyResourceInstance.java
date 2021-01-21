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
 * Proxy class to handle a {@link Instance} with << ConcurrencyResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7f87e6ca-968c-45d4-bd8a-d1edf858d5db")
public class ConcurrencyResourceInstance extends ResourceInstance {
    @objid ("effcf4f1-417d-4ad7-b721-d9bcf8ded3fb")
    public static final String STEREOTYPE_NAME = "ConcurrencyResource_Instance";

    /**
     * Tells whether a {@link ConcurrencyResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ConcurrencyResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("17b24415-fac8-456b-8cfc-6e9fc72e92c6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ConcurrencyResource_Instance >> then instantiate a {@link ConcurrencyResourceInstance} proxy.
     * 
     * @return a {@link ConcurrencyResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("6f8965a4-4053-4784-8297-1b9201204708")
    public static ConcurrencyResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceInstance.STEREOTYPE_NAME);
        return ConcurrencyResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceInstance} proxy from a {@link Instance} stereotyped << ConcurrencyResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link ConcurrencyResourceInstance} proxy or <i>null</i>.
     */
    @objid ("7970ec7e-5b38-4f8b-b062-9d58d2c60317")
    public static ConcurrencyResourceInstance instantiate(final Instance obj) {
        return ConcurrencyResourceInstance.canInstantiate(obj) ? new ConcurrencyResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceInstance} proxy from a {@link Instance} stereotyped << ConcurrencyResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link ConcurrencyResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6434536f-0f06-4263-a7c1-b7e33125f895")
    public static ConcurrencyResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ConcurrencyResourceInstance.canInstantiate(obj))
        	return new ConcurrencyResourceInstance(obj);
        else
        	throw new IllegalArgumentException("ConcurrencyResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ed2e3023-6488-402c-b266-f8317b4a80a0")
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
        ConcurrencyResourceInstance other = (ConcurrencyResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("8d9f9121-ef37-4b91-ae45-f47c2661754f")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("1105a195-9480-4b90-a12e-9ea693934c1a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("06d0a385-12ad-4e04-9b93-8ed8cac20a98")
    protected ConcurrencyResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("63bded10-f64c-40d0-8152-19de593af8ca")
    public static final class MdaTypes {
        @objid ("562b416f-44d8-45e7-8c84-9dcfd01fe0d9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("03ce4d0e-34ce-422b-93d6-c00091db6ea0")
        private static Stereotype MDAASSOCDEP;

        @objid ("eae6cf15-1f6d-465d-b7a2-e4816b288df6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7ebd24c3-99f7-40a7-9d02-2acb18d478d1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7ae7b6ff-0f3e-11df-8c52-0014222a9f79");
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
