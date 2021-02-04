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
 * Proxy class to handle a {@link Instance} with << CommunicationEndPoint_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2b6cf12d-81cd-4a74-bb10-c553a29800c4")
public class CommunicationEndPointInstance extends ResourceInstance {
    @objid ("f1cf0465-3bc4-470d-a2c7-a3f9e6a1ba14")
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_Instance";

    @objid ("7ca61a2d-94f3-4c82-baaf-e31397ce07c9")
    public static final String COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_Instance_packetSize";

    /**
     * Tells whether a {@link CommunicationEndPointInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << CommunicationEndPoint_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("61c47a15-6c44-4c52-b0ae-83c338f4dbcc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << CommunicationEndPoint_Instance >> then instantiate a {@link CommunicationEndPointInstance} proxy.
     * 
     * @return a {@link CommunicationEndPointInstance} proxy on the created {@link Instance}.
     */
    @objid ("3c9d38c2-93c6-49d1-8d3c-87140cb9cde2")
    public static CommunicationEndPointInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointInstance.STEREOTYPE_NAME);
        return CommunicationEndPointInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointInstance} proxy from a {@link Instance} stereotyped << CommunicationEndPoint_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link CommunicationEndPointInstance} proxy or <i>null</i>.
     */
    @objid ("10711f4b-2109-487d-86a7-9cd837329000")
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
    @objid ("94c7982d-b9f8-4cf0-b493-f6d442885e7d")
    public static CommunicationEndPointInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (CommunicationEndPointInstance.canInstantiate(obj))
        	return new CommunicationEndPointInstance(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3c735a37-187c-4ac0-ab96-d3d33b301c2c")
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
    @objid ("127b5ee7-b26a-47b4-8b26-dc5c467be9f4")
    public String getCommunicationEndPoint_Instance_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointInstance.MdaTypes.COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("0984aec6-8373-404b-99e7-dc44fc12b5fb")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("e80d6485-ecc6-408c-9b73-d4528881fdbe")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_Instance_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("62e051f5-737b-4960-95a0-37f4497e9c45")
    public void setCommunicationEndPoint_Instance_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointInstance.MdaTypes.COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE_TAGTYPE_ELT, value);
    }

    @objid ("8a04312e-ea33-4476-b183-fd18f92c26d4")
    protected CommunicationEndPointInstance(final Instance elt) {
        super(elt);
    }

    @objid ("c4a7c29f-cc33-4c5a-bd3a-fbd956bb4469")
    public static final class MdaTypes {
        @objid ("6a8f17d8-1554-4a76-9766-4f799f1d8e91")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("45ec27c8-d4d0-435c-8b64-faa24bc6ed6d")
        public static TagType COMMUNICATIONENDPOINT_INSTANCE_PACKETSIZE_TAGTYPE_ELT;

        @objid ("8dd5f876-fc49-48b2-8f45-56b5174d178a")
        private static Stereotype MDAASSOCDEP;

        @objid ("50989d14-6168-43a6-b7b4-ae0528b9bec4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("42ae75ce-a023-4120-b44f-f077528620d9")
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
