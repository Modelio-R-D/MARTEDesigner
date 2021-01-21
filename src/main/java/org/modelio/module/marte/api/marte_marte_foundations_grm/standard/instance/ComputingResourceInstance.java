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
 * Proxy class to handle a {@link Instance} with << ComputingResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("13d958be-a4a1-4362-a949-f283d553c926")
public class ComputingResourceInstance extends ProcessingResourceInstance {
    @objid ("9de848f0-0d24-4596-93ac-9dc70ca13c93")
    public static final String STEREOTYPE_NAME = "ComputingResource_Instance";

    /**
     * Tells whether a {@link ComputingResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ComputingResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("185d1975-eef9-4966-8798-ec0feebb385d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ComputingResource_Instance >> then instantiate a {@link ComputingResourceInstance} proxy.
     * 
     * @return a {@link ComputingResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("7e992c02-1773-4641-988a-822e5844f56a")
    public static ComputingResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceInstance.STEREOTYPE_NAME);
        return ComputingResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link ComputingResourceInstance} proxy from a {@link Instance} stereotyped << ComputingResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link ComputingResourceInstance} proxy or <i>null</i>.
     */
    @objid ("5540b806-2742-436a-b29f-61cd8be58762")
    public static ComputingResourceInstance instantiate(final Instance obj) {
        return ComputingResourceInstance.canInstantiate(obj) ? new ComputingResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ComputingResourceInstance} proxy from a {@link Instance} stereotyped << ComputingResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link ComputingResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("23b7de5c-fa14-4329-abec-ff520a2b5631")
    public static ComputingResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ComputingResourceInstance.canInstantiate(obj))
        	return new ComputingResourceInstance(obj);
        else
        	throw new IllegalArgumentException("ComputingResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("becfdf89-944a-4864-99fd-8097a40a2b11")
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
        ComputingResourceInstance other = (ComputingResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("83a9c8df-f5c2-4ac6-8a9e-5790628f73e6")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("52e9333b-553e-464b-9e3c-b251f4bcdc6f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cd4161bb-591f-4fc7-a80b-824198e97322")
    protected ComputingResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("87eaa2d1-b933-4edd-b3db-c00dbe58efc4")
    public static final class MdaTypes {
        @objid ("73f58c75-5ba2-496d-b5f6-df25a85edf11")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7cdfe5e6-64a6-4126-a426-a9cb4dd109a0")
        private static Stereotype MDAASSOCDEP;

        @objid ("fff55ac1-b3d8-4a03-9d32-78403774b0d0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d2b29bb9-4552-4a35-b56c-ca1b01f804f3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009a84d4-0ccf-11df-8525-001302895b2b");
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
