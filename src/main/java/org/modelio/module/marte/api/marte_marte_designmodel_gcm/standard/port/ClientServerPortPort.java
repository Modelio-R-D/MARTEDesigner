/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Port} with << ClientServerPort_Port >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("118520fb-122a-45c3-9844-6ba034b84bfb")
public class ClientServerPortPort {
    @objid ("e28b1345-5281-4d42-8163-8757fe3b72e3")
    public static final String STEREOTYPE_NAME = "ClientServerPort_Port";

    @objid ("a5f876c1-2b83-4f98-a82d-c6f418309fc1")
    public static final String CLIENTSERVERPORT_PORT_FEATURESSPEC_TAGTYPE = "ClientServerPort_Port_featuresSpec";

    @objid ("557d4a3e-9a05-4f20-8acb-e6629e9dfc43")
    public static final String CLIENTSERVERPORT_PORT_KIND_TAGTYPE = "ClientServerPort_Port_kind";

    @objid ("2578361b-cb6d-4769-b701-5ed7dcc9cb42")
    public static final String CLIENTSERVERPORT_PORT_PROVINTERFACE_TAGTYPE = "ClientServerPort_Port_provInterface";

    @objid ("f7b031ad-64a3-4afa-b5bb-6ec84b71f402")
    public static final String CLIENTSERVERPORT_PORT_REQINTERFACE_TAGTYPE = "ClientServerPort_Port_reqInterface";

    @objid ("dbcc3092-8433-4249-9a27-ee83e84fe3f4")
    public static final String CLIENTSERVERPORT_PORT_SPECIFICATIONKIND_TAGTYPE = "ClientServerPort_Port_specificationKind";

    /**
     * The underlying {@link Port} represented by this proxy, never null.
     */
    @objid ("500308b8-2407-446d-9df3-ec67ee1943f4")
    protected final Port elt;

    /**
     * Tells whether a {@link ClientServerPortPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << ClientServerPort_Port >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7f72ee2b-60f7-4c53-a3d6-6ae9882a57c1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClientServerPortPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << ClientServerPort_Port >> then instantiate a {@link ClientServerPortPort} proxy.
     * 
     * @return a {@link ClientServerPortPort} proxy on the created {@link Port}.
     */
    @objid ("3a82ca66-e992-4e3f-b447-05c9a2231815")
    public static ClientServerPortPort create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Port");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClientServerPortPort.STEREOTYPE_NAME);
        return ClientServerPortPort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link ClientServerPortPort} proxy from a {@link Port} stereotyped << ClientServerPort_Port >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link ClientServerPortPort} proxy or <i>null</i>.
     */
    @objid ("e54acc6b-3b58-4667-b581-38d1b58ab978")
    public static ClientServerPortPort instantiate(final Port obj) {
        return ClientServerPortPort.canInstantiate(obj) ? new ClientServerPortPort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClientServerPortPort} proxy from a {@link Port} stereotyped << ClientServerPort_Port >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Port}
     * @return a {@link ClientServerPortPort} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e97ef9a4-819c-4dd7-ad93-a5a55e08d9db")
    public static ClientServerPortPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (ClientServerPortPort.canInstantiate(obj))
        	return new ClientServerPortPort(obj);
        else
        	throw new IllegalArgumentException("ClientServerPortPort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("031b31fe-8569-4891-a23c-22722afba3a3")
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
        ClientServerPortPort other = (ClientServerPortPort) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'ClientServerPort_Port_featuresSpec'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2d6e27b4-aa6f-47c6-843d-2b3c337c5f0d")
    public String getClientServerPort_Port_featuresSpec() {
        return this.elt.getTagValue(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_FEATURESSPEC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClientServerPort_Port_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a87abbb1-1c4c-4da7-8bed-4994dd9d39fc")
    public String getClientServerPort_Port_kind() {
        return this.elt.getTagValue(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'ClientServerPort_Port_provInterface'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4a11f56d-4180-4506-b8b4-0a3de2f10fc9")
    public List<String> getClientServerPort_Port_provInterface() {
        return this.elt.getTagValues(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_PROVINTERFACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'ClientServerPort_Port_reqInterface'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4f4f02a4-4e79-4066-8d9b-f3d996d52e45")
    public List<String> getClientServerPort_Port_reqInterface() {
        return this.elt.getTagValues(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_REQINTERFACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClientServerPort_Port_specificationKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f610e08b-1457-44de-a313-63fb3c4252c8")
    public String getClientServerPort_Port_specificationKind() {
        return this.elt.getTagValue(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_SPECIFICATIONKIND_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
    @objid ("321068e4-b606-4d4f-aa43-66f7b7ceb7c7")
    public Port getElement() {
        return this.elt;
    }

    @objid ("a9d7e258-778c-4089-9363-ee711b2d7e0a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ClientServerPort_Port_featuresSpec'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("51fef037-940d-4fcf-a037-58ff2fa12725")
    public void setClientServerPort_Port_featuresSpec(final String value) {
        this.elt.putTagValue(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_FEATURESSPEC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ClientServerPort_Port_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("866727a2-3743-4b3d-8e31-725360db9f66")
    public void setClientServerPort_Port_kind(final String value) {
        this.elt.putTagValue(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'ClientServerPort_Port_provInterface'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("652ab3a6-ef48-4b5e-a626-b41d5e72aec9")
    public void setClientServerPort_Port_provInterface(final List<String> values) {
        this.elt.putTagValues(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_PROVINTERFACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'ClientServerPort_Port_reqInterface'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("acaae2ea-c63b-4078-8925-57e2e99a75ed")
    public void setClientServerPort_Port_reqInterface(final List<String> values) {
        this.elt.putTagValues(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_REQINTERFACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'ClientServerPort_Port_specificationKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b7b243e7-af22-4370-b49d-9f56c35ad4f2")
    public void setClientServerPort_Port_specificationKind(final String value) {
        this.elt.putTagValue(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_SPECIFICATIONKIND_TAGTYPE_ELT, value);
    }

    @objid ("6a279ac9-be09-4576-bb99-c97d3c0813d0")
    protected ClientServerPortPort(final Port elt) {
        this.elt = elt;
    }

    @objid ("f0a648a8-e852-43e6-80e9-dfcb198762d1")
    public static final class MdaTypes {
        @objid ("35500a43-4a61-43e5-afda-ead084161dee")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("79d4d31d-f42e-4939-a4bd-851cd886c16d")
        public static TagType CLIENTSERVERPORT_PORT_SPECIFICATIONKIND_TAGTYPE_ELT;

        @objid ("bb1ae50e-70f1-4f69-b930-a75968d42fc2")
        public static TagType CLIENTSERVERPORT_PORT_KIND_TAGTYPE_ELT;

        @objid ("0d7c2eb6-2693-44b5-a48e-3d31f05e8077")
        public static TagType CLIENTSERVERPORT_PORT_PROVINTERFACE_TAGTYPE_ELT;

        @objid ("051d118d-5a16-4651-93a6-b7e6fe38292e")
        public static TagType CLIENTSERVERPORT_PORT_REQINTERFACE_TAGTYPE_ELT;

        @objid ("ee4784e8-9ef0-4123-878f-56d31026c108")
        public static TagType CLIENTSERVERPORT_PORT_FEATURESSPEC_TAGTYPE_ELT;

        @objid ("fa4099d6-1c1c-4ffa-9b29-a5f326aeffab")
        private static Stereotype MDAASSOCDEP;

        @objid ("03a04682-35cf-4ef2-9f48-39a5a11ab126")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("00e9decd-fe65-4ccf-a245-0ef64a9aa443")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0247a680-0ccf-11df-8525-001302895b2b");
            CLIENTSERVERPORT_PORT_SPECIFICATIONKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0255f463-0ccf-11df-8525-001302895b2b");
            CLIENTSERVERPORT_PORT_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0255f469-0ccf-11df-8525-001302895b2b");
            CLIENTSERVERPORT_PORT_PROVINTERFACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0255f46c-0ccf-11df-8525-001302895b2b");
            CLIENTSERVERPORT_PORT_REQINTERFACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0255f46f-0ccf-11df-8525-001302895b2b");
            CLIENTSERVERPORT_PORT_FEATURESSPEC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0255f472-0ccf-11df-8525-001302895b2b");
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
