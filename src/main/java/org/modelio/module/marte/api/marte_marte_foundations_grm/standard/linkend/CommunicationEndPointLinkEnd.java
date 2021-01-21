/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.linkend;

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
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link LinkEnd} with << CommunicationEndPoint_LinkEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2434f78e-1895-4caf-a0a9-c3aa604a393a")
public class CommunicationEndPointLinkEnd extends ResourceLinkEnd {
    @objid ("b0fa2709-cf86-4079-a536-1a185380a6e9")
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_LinkEnd";

    @objid ("74c2e255-f2a1-41ad-a645-9460ebdaa878")
    public static final String COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_LinkEnd_packetSize";

    /**
     * Tells whether a {@link CommunicationEndPointLinkEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link LinkEnd} stereotyped << CommunicationEndPoint_LinkEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e91db829-5199-4f1c-8a2a-48ddd02d58e9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof LinkEnd) && ((LinkEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointLinkEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link LinkEnd} stereotyped << CommunicationEndPoint_LinkEnd >> then instantiate a {@link CommunicationEndPointLinkEnd} proxy.
     * 
     * @return a {@link CommunicationEndPointLinkEnd} proxy on the created {@link LinkEnd}.
     */
    @objid ("4a820543-30b1-4188-a226-4154c4d4f79f")
    public static CommunicationEndPointLinkEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("LinkEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointLinkEnd.STEREOTYPE_NAME);
        return CommunicationEndPointLinkEnd.instantiate((LinkEnd)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointLinkEnd} proxy from a {@link LinkEnd} stereotyped << CommunicationEndPoint_LinkEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a LinkEnd
     * @return a {@link CommunicationEndPointLinkEnd} proxy or <i>null</i>.
     */
    @objid ("0327393d-9fec-48d2-a847-42077f5d4688")
    public static CommunicationEndPointLinkEnd instantiate(final LinkEnd obj) {
        return CommunicationEndPointLinkEnd.canInstantiate(obj) ? new CommunicationEndPointLinkEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointLinkEnd} proxy from a {@link LinkEnd} stereotyped << CommunicationEndPoint_LinkEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link LinkEnd}
     * @return a {@link CommunicationEndPointLinkEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("68eddc00-0029-4f9c-ba01-4ee3d1d5e638")
    public static CommunicationEndPointLinkEnd safeInstantiate(final LinkEnd obj) throws IllegalArgumentException {
        if (CommunicationEndPointLinkEnd.canInstantiate(obj))
        	return new CommunicationEndPointLinkEnd(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointLinkEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4cebbec6-f684-4169-a52b-14fe2a6aa271")
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
        CommunicationEndPointLinkEnd other = (CommunicationEndPointLinkEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'CommunicationEndPoint_LinkEnd_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d02451a8-b642-4eb8-a085-b9584197a2c5")
    public String getCommunicationEndPoint_LinkEnd_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointLinkEnd.MdaTypes.COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link LinkEnd}. 
     * @return the LinkEnd represented by this proxy, never null.
     */
    @objid ("a86a59fa-71d3-46d7-a4a4-943ede0f14b7")
    @Override
    public LinkEnd getElement() {
        return (LinkEnd)super.getElement();
    }

    @objid ("3c116a3f-b1b6-41cf-ae4c-b34b91e9cfbd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_LinkEnd_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("645e77b1-8417-4fb6-8736-d980c86b51ef")
    public void setCommunicationEndPoint_LinkEnd_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointLinkEnd.MdaTypes.COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE_TAGTYPE_ELT, value);
    }

    @objid ("ec2840ff-ddcb-4e49-9823-af11ce4a6f40")
    protected CommunicationEndPointLinkEnd(final LinkEnd elt) {
        super(elt);
    }

    @objid ("309e91ad-fce5-4b1c-8ad2-e04e72094d59")
    public static final class MdaTypes {
        @objid ("91556dd1-5f4b-474e-9e03-225ae03077c9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("937779ea-bdab-4ffe-b533-2c098615c8cb")
        public static TagType COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE_TAGTYPE_ELT;

        @objid ("4db40f22-85ac-4192-8236-11ae084cb552")
        private static Stereotype MDAASSOCDEP;

        @objid ("7878d6a1-3ce9-442c-acb2-7e5b65ef17f8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("78312aa4-faeb-4d04-a42e-c0258bdf69e8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cb6bf7aa-26ce-11df-8c53-0014224f9977");
            COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c18a1941-26d2-11df-8c53-0014224f9977");
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
