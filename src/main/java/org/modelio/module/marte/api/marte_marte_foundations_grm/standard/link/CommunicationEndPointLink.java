/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << CommunicationEndPoint_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class CommunicationEndPointLink extends ResourceLink {
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_Link";

    public static final String COMMUNICATIONENDPOINT_LINK_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_Link_packetSize";

    /**
     * Tells whether a {@link CommunicationEndPointLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << CommunicationEndPoint_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << CommunicationEndPoint_Link >> then instantiate a {@link CommunicationEndPointLink} proxy.
     * 
     * @return a {@link CommunicationEndPointLink} proxy on the created {@link Link}.
     */
    public static CommunicationEndPointLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointLink.STEREOTYPE_NAME);
        return CommunicationEndPointLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointLink} proxy from a {@link Link} stereotyped << CommunicationEndPoint_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link CommunicationEndPointLink} proxy or <i>null</i>.
     */
    public static CommunicationEndPointLink instantiate(final Link obj) {
        return CommunicationEndPointLink.canInstantiate(obj) ? new CommunicationEndPointLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointLink} proxy from a {@link Link} stereotyped << CommunicationEndPoint_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link CommunicationEndPointLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static CommunicationEndPointLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (CommunicationEndPointLink.canInstantiate(obj))
        	return new CommunicationEndPointLink(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        CommunicationEndPointLink other = (CommunicationEndPointLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'CommunicationEndPoint_Link_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCommunicationEndPoint_Link_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointLink.MdaTypes.COMMUNICATIONENDPOINT_LINK_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_Link_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCommunicationEndPoint_Link_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointLink.MdaTypes.COMMUNICATIONENDPOINT_LINK_PACKETSIZE_TAGTYPE_ELT, value);
    }

    protected CommunicationEndPointLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType COMMUNICATIONENDPOINT_LINK_PACKETSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "99e0a8e3-0f46-11df-8c52-0014222a9f79");
            COMMUNICATIONENDPOINT_LINK_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7bc05155-0f47-11df-8c52-0014222a9f79");
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
