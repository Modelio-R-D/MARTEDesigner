/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.interface_;

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
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Interface} with << ClientServerSpecification_Interface >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b0df5245-e949-4b10-83dc-c8d5fa8e7af2")
public class ClientServerSpecificationInterface {
    @objid ("b1a5f3c6-c1ad-4c2c-bf4b-a8ca641dbeb6")
    public static final String STEREOTYPE_NAME = "ClientServerSpecification_Interface";

    /**
     * The underlying {@link Interface} represented by this proxy, never null.
     */
    @objid ("86089cd2-e0ef-4252-9909-30e0e2685041")
    protected final Interface elt;

    /**
     * Tells whether a {@link ClientServerSpecificationInterface proxy} can be instantiated from a {@link MObject} checking it is a {@link Interface} stereotyped << ClientServerSpecification_Interface >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6d87f9a4-35d4-4de9-9747-c5b22207a407")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Interface) && ((Interface) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClientServerSpecificationInterface.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Interface} stereotyped << ClientServerSpecification_Interface >> then instantiate a {@link ClientServerSpecificationInterface} proxy.
     * 
     * @return a {@link ClientServerSpecificationInterface} proxy on the created {@link Interface}.
     */
    @objid ("82a90079-2bbb-4e41-b50b-fbd3bd047f66")
    public static ClientServerSpecificationInterface create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Interface");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClientServerSpecificationInterface.STEREOTYPE_NAME);
        return ClientServerSpecificationInterface.instantiate((Interface)e);
    }

    /**
     * Tries to instantiate a {@link ClientServerSpecificationInterface} proxy from a {@link Interface} stereotyped << ClientServerSpecification_Interface >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Interface
     * @return a {@link ClientServerSpecificationInterface} proxy or <i>null</i>.
     */
    @objid ("f8d334e9-0fdb-45ba-adee-7e8314d8361c")
    public static ClientServerSpecificationInterface instantiate(final Interface obj) {
        return ClientServerSpecificationInterface.canInstantiate(obj) ? new ClientServerSpecificationInterface(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClientServerSpecificationInterface} proxy from a {@link Interface} stereotyped << ClientServerSpecification_Interface >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Interface}
     * @return a {@link ClientServerSpecificationInterface} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dbd75a00-84c1-4216-93d2-7cd2d6cd36a1")
    public static ClientServerSpecificationInterface safeInstantiate(final Interface obj) throws IllegalArgumentException {
        if (ClientServerSpecificationInterface.canInstantiate(obj))
        	return new ClientServerSpecificationInterface(obj);
        else
        	throw new IllegalArgumentException("ClientServerSpecificationInterface: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e85694bb-5fba-4b24-9d31-799f713d6a4c")
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
        ClientServerSpecificationInterface other = (ClientServerSpecificationInterface) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Interface}. 
     * @return the Interface represented by this proxy, never null.
     */
    @objid ("14f6e387-e0fc-41ab-bcb7-c0bb3df7ddc0")
    public Interface getElement() {
        return this.elt;
    }

    @objid ("c1e708f3-e19d-483f-9b54-84d60ec330e8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4c5bacac-6846-467d-a56c-934ae1a1c0a5")
    protected ClientServerSpecificationInterface(final Interface elt) {
        this.elt = elt;
    }

    @objid ("1709d28e-defc-4491-860a-3d263044cb15")
    public static final class MdaTypes {
        @objid ("46899804-f631-4fa5-addb-2baed780d936")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4c700166-7f2e-44b7-9ed9-8a1a9a1c6b85")
        private static Stereotype MDAASSOCDEP;

        @objid ("bdca7a97-5759-46e5-bc29-ee6d869b8dea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("31391eba-f31f-4be5-a96b-ff07ee797dfd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0255f476-0ccf-11df-8525-001302895b2b");
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
