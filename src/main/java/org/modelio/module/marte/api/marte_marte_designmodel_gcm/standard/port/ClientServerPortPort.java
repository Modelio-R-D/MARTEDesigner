/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public class ClientServerPortPort {
    public static final String STEREOTYPE_NAME = "ClientServerPort_Port";

    public static final String CLIENTSERVERPORT_PORT_FEATURESSPEC_TAGTYPE = "ClientServerPort_Port_featuresSpec";

    public static final String CLIENTSERVERPORT_PORT_KIND_TAGTYPE = "ClientServerPort_Port_kind";

    public static final String CLIENTSERVERPORT_PORT_PROVINTERFACE_TAGTYPE = "ClientServerPort_Port_provInterface";

    public static final String CLIENTSERVERPORT_PORT_REQINTERFACE_TAGTYPE = "ClientServerPort_Port_reqInterface";

    public static final String CLIENTSERVERPORT_PORT_SPECIFICATIONKIND_TAGTYPE = "ClientServerPort_Port_specificationKind";

    /**
     * The underlying {@link Port} represented by this proxy, never null.
     */
    protected final Port elt;

    /**
     * Tells whether a {@link ClientServerPortPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << ClientServerPort_Port >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClientServerPortPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << ClientServerPort_Port >> then instantiate a {@link ClientServerPortPort} proxy.
     * 
     * @return a {@link ClientServerPortPort} proxy on the created {@link Port}.
     */
    public static ClientServerPortPort create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClientServerPortPort.STEREOTYPE_NAME);
        return ClientServerPortPort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link ClientServerPortPort} proxy from a {@link Port} stereotyped << ClientServerPort_Port >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link ClientServerPortPort} proxy or <i>null</i>.
     */
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
    public static ClientServerPortPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (ClientServerPortPort.canInstantiate(obj))
        	return new ClientServerPortPort(obj);
        else
        	throw new IllegalArgumentException("ClientServerPortPort: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ClientServerPortPort other = (ClientServerPortPort) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'ClientServerPort_Port_featuresSpec'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClientServerPort_Port_featuresSpec() {
        return this.elt.getTagValue(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_FEATURESSPEC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClientServerPort_Port_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClientServerPort_Port_kind() {
        return this.elt.getTagValue(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'ClientServerPort_Port_provInterface'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getClientServerPort_Port_provInterface() {
        return this.elt.getTagValues(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_PROVINTERFACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'ClientServerPort_Port_reqInterface'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getClientServerPort_Port_reqInterface() {
        return this.elt.getTagValues(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_REQINTERFACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClientServerPort_Port_specificationKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClientServerPort_Port_specificationKind() {
        return this.elt.getTagValue(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_SPECIFICATIONKIND_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
    public Port getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ClientServerPort_Port_featuresSpec'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClientServerPort_Port_featuresSpec(final String value) {
        this.elt.putTagValue(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_FEATURESSPEC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ClientServerPort_Port_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClientServerPort_Port_kind(final String value) {
        this.elt.putTagValue(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'ClientServerPort_Port_provInterface'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClientServerPort_Port_provInterface(final List<String> values) {
        this.elt.putTagValues(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_PROVINTERFACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'ClientServerPort_Port_reqInterface'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClientServerPort_Port_reqInterface(final List<String> values) {
        this.elt.putTagValues(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_REQINTERFACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'ClientServerPort_Port_specificationKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClientServerPort_Port_specificationKind(final String value) {
        this.elt.putTagValue(ClientServerPortPort.MdaTypes.CLIENTSERVERPORT_PORT_SPECIFICATIONKIND_TAGTYPE_ELT, value);
    }

    protected ClientServerPortPort(final Port elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType CLIENTSERVERPORT_PORT_SPECIFICATIONKIND_TAGTYPE_ELT;

        public static TagType CLIENTSERVERPORT_PORT_KIND_TAGTYPE_ELT;

        public static TagType CLIENTSERVERPORT_PORT_PROVINTERFACE_TAGTYPE_ELT;

        public static TagType CLIENTSERVERPORT_PORT_REQINTERFACE_TAGTYPE_ELT;

        public static TagType CLIENTSERVERPORT_PORT_FEATURESSPEC_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
