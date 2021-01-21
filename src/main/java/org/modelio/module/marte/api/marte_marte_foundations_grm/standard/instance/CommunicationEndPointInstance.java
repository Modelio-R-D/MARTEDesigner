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
 * Proxy class to handle a {@link Instance} with << CommunicationEndPoint_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2b6cf12d-81cd-4a74-bb10-c553a29800c4")
public class CommunicationEndPointInstance extends ResourceInstance {
    @objid ("392d4bdf-49d5-49b6-88e4-c994fbe9d811")
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_Instance";

    @objid ("d3cd25ab-bb81-464a-92b8-2aae3b1b5108")
    public static final String COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_Instance_packetSize";

    /**
     * Tells whether a {@link CommunicationEndPointInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << CommunicationEndPoint_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e97e84a3-69f8-4cf5-b750-e0d1b55f5584")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << CommunicationEndPoint_Instance >> then instantiate a {@link CommunicationEndPointInstance} proxy.
     * 
     * @return a {@link CommunicationEndPointInstance} proxy on the created {@link Instance}.
     */
    @objid ("a375e7b0-be3b-486f-a79d-8ddb0bda660e")
    public static CommunicationEndPointInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointInstance.STEREOTYPE_NAME);
        return CommunicationEndPointInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointInstance} proxy from a {@link Instance} stereotyped << CommunicationEndPoint_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link CommunicationEndPointInstance} proxy or <i>null</i>.
     */
    @objid ("172bf5d9-068d-4510-abcf-7278966e59ce")
    public static CommunicationEndPointInstance instantiate(final Instance obj) {
        return CommunicationEndPointInstance.canInstantiate(obj) ? new CommunicationEndPointInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointInstance} proxy from a {@link Instance} stereotyped << CommunicationEndPoint_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link CommunicationEndPointInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("92bba901-7100-4f03-b6dc-3bf563c99b88")
    public static CommunicationEndPointInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (CommunicationEndPointInstance.canInstantiate(obj))
        	return new CommunicationEndPointInstance(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("250bcaeb-6426-495b-a7f1-15f9a4f1fe43")
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
        CommunicationEndPointInstance other = (CommunicationEndPointInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'CommunicationEndPoint_Instance_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("408c7271-480d-4023-b333-4ffcab62f80d")
    public String getCommunicationEndPoint_Instance_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointInstance.MdaTypes.COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("94bf4558-9d8d-43b5-a581-dca1569d5cd8")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("eaec76aa-6b6e-4f35-bc89-6851eaf4b650")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_Instance_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("960e8924-7b4e-4a83-b622-81e0467898af")
    public void setCommunicationEndPoint_Instance_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointInstance.MdaTypes.COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE_TAGTYPE_ELT, value);
    }

    @objid ("202c15cd-b14d-49cf-befe-01cc6b2d9008")
    protected CommunicationEndPointInstance(final Instance elt) {
        super(elt);
    }

    @objid ("c4a7c29f-cc33-4c5a-bd3a-fbd956bb4469")
    public static final class MdaTypes {
        @objid ("25bfd3c5-ec79-4ed9-97b8-0d606fa24635")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7eef818f-14ba-491d-8d45-47b9bfba8154")
        public static TagType COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE_TAGTYPE_ELT;

        @objid ("6186b395-2a26-444d-a238-1e51b106f7dd")
        private static Stereotype MDAASSOCDEP;

        @objid ("a1bc9345-52eb-4258-ba07-4bbc6032a1d7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ab533115-c2f4-44f5-ac33-5578f59117a7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "921053ed-0f46-11df-8c52-0014222a9f79");
            COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7adb6f95-0f47-11df-8c52-0014222a9f79");
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
