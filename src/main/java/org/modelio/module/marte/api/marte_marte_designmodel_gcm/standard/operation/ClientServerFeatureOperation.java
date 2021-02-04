/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("23ef2ca0-2a4d-4a05-b20a-29fe92d77feb")
    public static final String STEREOTYPE_NAME = "ClientServerFeature_Operation";

    @objid ("dfbbd6d0-00e4-4653-8da0-c593451a3e48")
    public static final String CLIENTSERVERFEATURE_OPERATION_KIND_TAGTYPE = "ClientServerFeature_Operation_kind";

    /**
     * The underlying {@link Operation} represented by this proxy, never null.
     */
    @objid ("02d8b8b1-4ed0-4a51-9bf5-8a03eccab0eb")
    protected final Operation elt;

    /**
     * Tells whether a {@link ClientServerFeatureOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << ClientServerFeature_Operation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f8b26bcf-4227-418f-8c8f-ed73ed4be5b4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClientServerFeatureOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << ClientServerFeature_Operation >> then instantiate a {@link ClientServerFeatureOperation} proxy.
     * 
     * @return a {@link ClientServerFeatureOperation} proxy on the created {@link Operation}.
     */
    @objid ("fa4af94e-0acc-443e-b9cc-b708647222cf")
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
    @objid ("ae4ddfa0-e503-44f6-8c47-03ecf504ab50")
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
    @objid ("af5f7182-f31f-4856-ae2b-df0f80b74f59")
    public static ClientServerFeatureOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (ClientServerFeatureOperation.canInstantiate(obj))
        	return new ClientServerFeatureOperation(obj);
        else
        	throw new IllegalArgumentException("ClientServerFeatureOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b4312557-294f-4a01-ad35-576290158003")
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
    @objid ("01a6aae6-e2b0-4cd3-821a-12665ff2675f")
    public String getClientServerFeature_Operation_kind() {
        return this.elt.getTagValue(ClientServerFeatureOperation.MdaTypes.CLIENTSERVERFEATURE_OPERATION_KIND_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    @objid ("b7522632-8e68-4248-9122-5e2b98e8fc23")
    public Operation getElement() {
        return this.elt;
    }

    @objid ("b41d1610-96c3-4911-9587-25411c91caba")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ClientServerFeature_Operation_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("47d18ef5-672c-4e9f-8cfa-933f313203cd")
    public void setClientServerFeature_Operation_kind(final String value) {
        this.elt.putTagValue(ClientServerFeatureOperation.MdaTypes.CLIENTSERVERFEATURE_OPERATION_KIND_TAGTYPE_ELT, value);
    }

    @objid ("a9af30e2-ad4d-4e85-8b13-8c524e0f80a2")
    protected ClientServerFeatureOperation(final Operation elt) {
        this.elt = elt;
    }

    @objid ("9103f2f3-073f-41a3-8893-1cb89e9fb97a")
    public static final class MdaTypes {
        @objid ("38b6e3cf-7ca0-4ea6-8fe9-c2a7463c4b48")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cb482320-0ef9-447f-8152-22256b697264")
        public static TagType CLIENTSERVERFEATURE_OPERATION_KIND_TAGTYPE_ELT;

        @objid ("5b810f5b-dda6-4620-9c94-b2f7e5ce7590")
        private static Stereotype MDAASSOCDEP;

        @objid ("d1cc1fe6-966a-472f-9565-9f56e9bf73b4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d494cf26-a15e-4bbd-b274-8ab7f4c131b1")
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
