/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("dbbe2bc5-bb14-4dc9-b9c6-d21dccbf0bcb")
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_LinkEnd";

    @objid ("c6fa4bc9-5773-43a8-b56f-84626c4fa97e")
    public static final String COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_LinkEnd_packetSize";

    /**
     * Tells whether a {@link CommunicationEndPointLinkEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link LinkEnd} stereotyped << CommunicationEndPoint_LinkEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("548a454b-7330-4846-a8be-b9ae6f2be8db")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof LinkEnd) && ((LinkEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointLinkEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link LinkEnd} stereotyped << CommunicationEndPoint_LinkEnd >> then instantiate a {@link CommunicationEndPointLinkEnd} proxy.
     * 
     * @return a {@link CommunicationEndPointLinkEnd} proxy on the created {@link LinkEnd}.
     */
    @objid ("e5c3c914-c27e-48c4-b60e-ab8936fac58c")
    public static CommunicationEndPointLinkEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.LinkEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointLinkEnd.STEREOTYPE_NAME);
        return CommunicationEndPointLinkEnd.instantiate((LinkEnd)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointLinkEnd} proxy from a {@link LinkEnd} stereotyped << CommunicationEndPoint_LinkEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a LinkEnd
     * @return a {@link CommunicationEndPointLinkEnd} proxy or <i>null</i>.
     */
    @objid ("c4536138-4f84-4a74-b10d-f2d5c7cdc1c8")
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
    @objid ("2ccdbabf-7e3e-43ba-95bf-5640df8f188b")
    public static CommunicationEndPointLinkEnd safeInstantiate(final LinkEnd obj) throws IllegalArgumentException {
        if (CommunicationEndPointLinkEnd.canInstantiate(obj))
        	return new CommunicationEndPointLinkEnd(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointLinkEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b56a881f-f295-4172-9add-49809fd761b0")
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
    @objid ("6e682ca3-2dc6-4a54-ab4b-c671636f3fb0")
    public String getCommunicationEndPoint_LinkEnd_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointLinkEnd.MdaTypes.COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link LinkEnd}. 
     * @return the LinkEnd represented by this proxy, never null.
     */
    @objid ("ac82339a-2970-4eed-b2df-79dfb9e22768")
    @Override
    public LinkEnd getElement() {
        return (LinkEnd)super.getElement();
    }

    @objid ("d45e8c8d-12fe-4a56-946d-72a641805e52")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_LinkEnd_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ff9cb8d0-643e-4fe7-be56-1862a0e4f1da")
    public void setCommunicationEndPoint_LinkEnd_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointLinkEnd.MdaTypes.COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE_TAGTYPE_ELT, value);
    }

    @objid ("4b90e085-3e5c-471f-bf5f-cb447e24d2e8")
    protected CommunicationEndPointLinkEnd(final LinkEnd elt) {
        super(elt);
    }

    @objid ("309e91ad-fce5-4b1c-8ad2-e04e72094d59")
    public static final class MdaTypes {
        @objid ("af0a0a2b-1047-45b0-a299-ff5a18aa75e7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("04affd4a-e951-47db-ad33-a92196ac9ef2")
        public static TagType COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE_TAGTYPE_ELT;

        @objid ("3dfb777b-2e66-49d1-8516-935953f84196")
        private static Stereotype MDAASSOCDEP;

        @objid ("c75af1e2-0723-4164-9f0e-4a4b0bc50934")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9632da90-4417-4a7d-8c8d-f2162c409434")
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
