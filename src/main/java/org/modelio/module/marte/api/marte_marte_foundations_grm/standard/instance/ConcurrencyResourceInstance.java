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
 * Proxy class to handle a {@link Instance} with << ConcurrencyResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7f87e6ca-968c-45d4-bd8a-d1edf858d5db")
public class ConcurrencyResourceInstance extends ResourceInstance {
    @objid ("404bc497-75d1-4e17-88f8-47cd49e35d0b")
    public static final String STEREOTYPE_NAME = "ConcurrencyResource_Instance";

    /**
     * Tells whether a {@link ConcurrencyResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ConcurrencyResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("735b6e9a-c055-491c-b96b-2a9e269e25de")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ConcurrencyResource_Instance >> then instantiate a {@link ConcurrencyResourceInstance} proxy.
     * 
     * @return a {@link ConcurrencyResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("9217ecfc-e8e3-415f-84f8-448471dd3669")
    public static ConcurrencyResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceInstance.STEREOTYPE_NAME);
        return ConcurrencyResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceInstance} proxy from a {@link Instance} stereotyped << ConcurrencyResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link ConcurrencyResourceInstance} proxy or <i>null</i>.
     */
    @objid ("129e0894-b181-4d05-81be-287b15c307f3")
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
    @objid ("52372df4-0e5a-4d19-b30a-9924d643d4a7")
    public static ConcurrencyResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ConcurrencyResourceInstance.canInstantiate(obj))
        	return new ConcurrencyResourceInstance(obj);
        else
        	throw new IllegalArgumentException("ConcurrencyResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("86929cc4-d532-4e94-b607-2e9a17a453ca")
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
    @objid ("a4c57d96-9278-4000-a0ca-020759f8286c")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("18df904d-3a7a-4f7e-a58d-e867830480d9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("bcba1cf7-fdcf-4c3d-947a-741d9a980a9e")
    protected ConcurrencyResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("63bded10-f64c-40d0-8152-19de593af8ca")
    public static final class MdaTypes {
        @objid ("75951b22-4646-4427-bc09-9bece887349a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("34d1a1f7-91fd-4d2b-8277-18b1f332f70b")
        private static Stereotype MDAASSOCDEP;

        @objid ("ea9ce032-e3f1-475a-955b-8d203b680ff1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ed0a6e48-adff-48ff-a1ea-fde1e7d1e0f8")
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
