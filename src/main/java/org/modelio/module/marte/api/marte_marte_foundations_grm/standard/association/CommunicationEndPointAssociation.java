/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << CommunicationEndPoint_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f055055b-bd7e-4082-99aa-6eb94d9c676c")
public class CommunicationEndPointAssociation extends ResourceAssociation {
    @objid ("8a8b5f7e-88b1-42db-a0d8-5ff4be897f07")
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_Association";

    @objid ("be9e1fa7-fc5b-4b0b-9048-2dd9084f048a")
    public static final String COMMUNICATIONENDPOINT_ASSOCIATION_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_Association_packetSize";

    /**
     * Tells whether a {@link CommunicationEndPointAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << CommunicationEndPoint_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b9d0fe2e-f503-44ea-95a2-c391827f2277")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << CommunicationEndPoint_Association >> then instantiate a {@link CommunicationEndPointAssociation} proxy.
     * 
     * @return a {@link CommunicationEndPointAssociation} proxy on the created {@link Association}.
     */
    @objid ("931bd8c4-269f-413e-84f7-529e2d6cf374")
    public static CommunicationEndPointAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointAssociation.STEREOTYPE_NAME);
        return CommunicationEndPointAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointAssociation} proxy from a {@link Association} stereotyped << CommunicationEndPoint_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link CommunicationEndPointAssociation} proxy or <i>null</i>.
     */
    @objid ("f1394bea-b9a9-4b03-97a7-ed55e0060562")
    public static CommunicationEndPointAssociation instantiate(final Association obj) {
        return CommunicationEndPointAssociation.canInstantiate(obj) ? new CommunicationEndPointAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointAssociation} proxy from a {@link Association} stereotyped << CommunicationEndPoint_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link CommunicationEndPointAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("82d85924-1d3d-4dd7-ae62-7f5f0f5aaaba")
    public static CommunicationEndPointAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (CommunicationEndPointAssociation.canInstantiate(obj))
        	return new CommunicationEndPointAssociation(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("11d6933c-7680-4c58-b9bf-567f0762d2ca")
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
        CommunicationEndPointAssociation other = (CommunicationEndPointAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'CommunicationEndPoint_Association_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6cc11d75-9a73-470e-b5bf-062faa378dcc")
    public String getCommunicationEndPoint_Association_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointAssociation.MdaTypes.COMMUNICATIONENDPOINT_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("35e31661-81bc-44e6-b8ae-c8c98f02de7a")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("c372a804-efd2-4384-8f35-7ada9f40158a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_Association_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("72c83a7f-375a-4300-97e8-108fb43667f7")
    public void setCommunicationEndPoint_Association_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointAssociation.MdaTypes.COMMUNICATIONENDPOINT_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT, value);
    }

    @objid ("4aed40ee-8df1-4f93-86e7-590849719a10")
    protected CommunicationEndPointAssociation(final Association elt) {
        super(elt);
    }

    @objid ("3d4380b0-c558-4af3-aff8-334c5bae1241")
    public static final class MdaTypes {
        @objid ("79fd3299-ecc6-4472-bcb7-34b07b48024b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b0aab049-2dd1-46b8-a8fe-7a818c5253aa")
        public static TagType COMMUNICATIONENDPOINT_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT;

        @objid ("09383ce2-0fa5-4f53-80b3-601dd3722833")
        private static Stereotype MDAASSOCDEP;

        @objid ("8ac2ef1d-3be3-4826-a3fb-cdb146049462")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4061255d-ed11-474d-a307-732465443b55")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a3e86d85-0f46-11df-8c52-0014222a9f79");
            COMMUNICATIONENDPOINT_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7cb845e5-0f47-11df-8c52-0014222a9f79");
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
