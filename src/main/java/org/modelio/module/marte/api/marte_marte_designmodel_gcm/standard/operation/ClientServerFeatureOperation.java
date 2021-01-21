/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.operation;

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
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Operation} with << ClientServerFeature_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("08123102-6889-4cfd-b4c9-a20fda81d25f")
public class ClientServerFeatureOperation {
    @objid ("ab36ce7e-0445-4cb8-80ac-8f656fa03c10")
    public static final String STEREOTYPE_NAME = "ClientServerFeature_Operation";

    @objid ("61530287-1955-47f7-9854-224cec23af5a")
    public static final String CLIENTSERVERFEATURE_OPERATION_KIND_TAGTYPE = "ClientServerFeature_Operation_kind";

    /**
     * The underlying {@link Operation} represented by this proxy, never null.
     */
    @objid ("675284d0-d8a5-4c6b-aea3-fe384b0126af")
    protected final Operation elt;

    /**
     * Tells whether a {@link ClientServerFeatureOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << ClientServerFeature_Operation >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c6bf2677-5d0d-4d29-9523-98d7475aa325")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClientServerFeatureOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << ClientServerFeature_Operation >> then instantiate a {@link ClientServerFeatureOperation} proxy.
     * 
     * @return a {@link ClientServerFeatureOperation} proxy on the created {@link Operation}.
     */
    @objid ("3c756f98-ba1b-480c-b6dc-9a6479b9ab2c")
    public static ClientServerFeatureOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClientServerFeatureOperation.STEREOTYPE_NAME);
        return ClientServerFeatureOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link ClientServerFeatureOperation} proxy from a {@link Operation} stereotyped << ClientServerFeature_Operation >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link ClientServerFeatureOperation} proxy or <i>null</i>.
     */
    @objid ("457e8d3a-146c-49eb-8bce-68cf8aa70536")
    public static ClientServerFeatureOperation instantiate(final Operation obj) {
        return ClientServerFeatureOperation.canInstantiate(obj) ? new ClientServerFeatureOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClientServerFeatureOperation} proxy from a {@link Operation} stereotyped << ClientServerFeature_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link ClientServerFeatureOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3ad96bb1-a6e1-41ad-92e5-d9e14ddb6ab0")
    public static ClientServerFeatureOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (ClientServerFeatureOperation.canInstantiate(obj))
        	return new ClientServerFeatureOperation(obj);
        else
        	throw new IllegalArgumentException("ClientServerFeatureOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("841f59ac-6579-4b4d-a191-9882d4ed192c")
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
        ClientServerFeatureOperation other = (ClientServerFeatureOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'ClientServerFeature_Operation_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("77f9a74c-d99d-4eb7-a7e5-1ce6695518a6")
    public String getClientServerFeature_Operation_kind() {
        return this.elt.getTagValue(ClientServerFeatureOperation.MdaTypes.CLIENTSERVERFEATURE_OPERATION_KIND_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    @objid ("bc6c5d89-6eba-452e-943d-1e060db930b7")
    public Operation getElement() {
        return this.elt;
    }

    @objid ("f00111b3-4f3b-46af-bc4c-5e01e2a7e93d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ClientServerFeature_Operation_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6736bc14-149c-4121-8ae3-060106ff89bf")
    public void setClientServerFeature_Operation_kind(final String value) {
        this.elt.putTagValue(ClientServerFeatureOperation.MdaTypes.CLIENTSERVERFEATURE_OPERATION_KIND_TAGTYPE_ELT, value);
    }

    @objid ("6c14dd1b-f917-4b41-b1d0-34656da61905")
    protected ClientServerFeatureOperation(final Operation elt) {
        this.elt = elt;
    }

    @objid ("9103f2f3-073f-41a3-8893-1cb89e9fb97a")
    public static final class MdaTypes {
        @objid ("758310b0-7c89-4703-a66a-86e4964d6f35")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("33b5fe1d-ad25-4cb0-b71b-949a12d4021b")
        public static TagType CLIENTSERVERFEATURE_OPERATION_KIND_TAGTYPE_ELT;

        @objid ("07fd7ff6-83bd-4916-9b6b-0948a1beb46a")
        private static Stereotype MDAASSOCDEP;

        @objid ("5048ea05-69dc-4dc8-a322-397a104296f3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("694f3038-d0bc-401d-b7aa-e1aad791312c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0255f477-0ccf-11df-8525-001302895b2b");
            CLIENTSERVERFEATURE_OPERATION_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0255f478-0ccf-11df-8525-001302895b2b");
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
