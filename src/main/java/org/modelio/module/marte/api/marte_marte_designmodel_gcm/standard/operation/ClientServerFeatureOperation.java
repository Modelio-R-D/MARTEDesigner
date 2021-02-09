/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class ClientServerFeatureOperation {
    public static final String STEREOTYPE_NAME = "ClientServerFeature_Operation";

    public static final String CLIENTSERVERFEATURE_OPERATION_KIND_TAGTYPE = "ClientServerFeature_Operation_kind";

    /**
     * The underlying {@link Operation} represented by this proxy, never null.
     */
    protected final Operation elt;

    /**
     * Tells whether a {@link ClientServerFeatureOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << ClientServerFeature_Operation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClientServerFeatureOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << ClientServerFeature_Operation >> then instantiate a {@link ClientServerFeatureOperation} proxy.
     * 
     * @return a {@link ClientServerFeatureOperation} proxy on the created {@link Operation}.
     */
    public static ClientServerFeatureOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClientServerFeatureOperation.STEREOTYPE_NAME);
        return ClientServerFeatureOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link ClientServerFeatureOperation} proxy from a {@link Operation} stereotyped << ClientServerFeature_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link ClientServerFeatureOperation} proxy or <i>null</i>.
     */
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
    public static ClientServerFeatureOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (ClientServerFeatureOperation.canInstantiate(obj))
        	return new ClientServerFeatureOperation(obj);
        else
        	throw new IllegalArgumentException("ClientServerFeatureOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    public String getClientServerFeature_Operation_kind() {
        return this.elt.getTagValue(ClientServerFeatureOperation.MdaTypes.CLIENTSERVERFEATURE_OPERATION_KIND_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    public Operation getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ClientServerFeature_Operation_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClientServerFeature_Operation_kind(final String value) {
        this.elt.putTagValue(ClientServerFeatureOperation.MdaTypes.CLIENTSERVERFEATURE_OPERATION_KIND_TAGTYPE_ELT, value);
    }

    protected ClientServerFeatureOperation(final Operation elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType CLIENTSERVERFEATURE_OPERATION_KIND_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
