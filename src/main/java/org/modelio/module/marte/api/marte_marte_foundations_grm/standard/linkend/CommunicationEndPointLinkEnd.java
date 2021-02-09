/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.linkend;

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
public class CommunicationEndPointLinkEnd extends ResourceLinkEnd {
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_LinkEnd";

    public static final String COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_LinkEnd_packetSize";

    /**
     * Tells whether a {@link CommunicationEndPointLinkEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link LinkEnd} stereotyped << CommunicationEndPoint_LinkEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof LinkEnd) && ((LinkEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointLinkEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link LinkEnd} stereotyped << CommunicationEndPoint_LinkEnd >> then instantiate a {@link CommunicationEndPointLinkEnd} proxy.
     * 
     * @return a {@link CommunicationEndPointLinkEnd} proxy on the created {@link LinkEnd}.
     */
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
    public static CommunicationEndPointLinkEnd safeInstantiate(final LinkEnd obj) throws IllegalArgumentException {
        if (CommunicationEndPointLinkEnd.canInstantiate(obj))
        	return new CommunicationEndPointLinkEnd(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointLinkEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        CommunicationEndPointLinkEnd other = (CommunicationEndPointLinkEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'CommunicationEndPoint_LinkEnd_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCommunicationEndPoint_LinkEnd_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointLinkEnd.MdaTypes.COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link LinkEnd}. 
     * @return the LinkEnd represented by this proxy, never null.
     */
    @Override
    public LinkEnd getElement() {
        return (LinkEnd)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_LinkEnd_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationEndPoint_LinkEnd_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointLinkEnd.MdaTypes.COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE_TAGTYPE_ELT, value);
    }

    protected CommunicationEndPointLinkEnd(final LinkEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
