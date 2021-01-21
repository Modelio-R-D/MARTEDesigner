/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

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
@objid ("4407aa48-a058-4f95-8e2b-18cc2a7723de")
public class CommunicationEndPointLink extends ResourceLink {
    @objid ("dca3ad2d-2041-4b95-b5f8-35d58591ab8d")
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_Link";

    @objid ("d2735d20-e460-44ea-ada9-04397c26b8a4")
    public static final String COMMUNICATIONENDPOINT_LINK_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_Link_packetSize";

    /**
     * Tells whether a {@link CommunicationEndPointLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << CommunicationEndPoint_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("13943792-8ab3-4453-9161-32ca7350eb10")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << CommunicationEndPoint_Link >> then instantiate a {@link CommunicationEndPointLink} proxy.
     * 
     * @return a {@link CommunicationEndPointLink} proxy on the created {@link Link}.
     */
    @objid ("5b936f94-278f-4569-ae52-f8d53d559ed3")
    public static CommunicationEndPointLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointLink.STEREOTYPE_NAME);
        return CommunicationEndPointLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointLink} proxy from a {@link Link} stereotyped << CommunicationEndPoint_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link CommunicationEndPointLink} proxy or <i>null</i>.
     */
    @objid ("499f0ae4-4789-4b80-81dd-91fac9605738")
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
    @objid ("ecd3efef-89c1-41c9-80ed-6358f41a1451")
    public static CommunicationEndPointLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (CommunicationEndPointLink.canInstantiate(obj))
        	return new CommunicationEndPointLink(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a2a9ed43-a109-4fe7-948d-307226a4b228")
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
    @objid ("12a91491-ae1b-4fa1-bf74-36e89765d0b6")
    public String getCommunicationEndPoint_Link_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointLink.MdaTypes.COMMUNICATIONENDPOINT_LINK_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("3726fc59-82f6-4936-b534-73bffa9f55fd")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("2717a0fe-ce32-4e89-b1f1-2b53e8f7d3dd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_Link_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac40ae4a-7dbf-4d56-8f36-28f0324dbee7")
    public void setCommunicationEndPoint_Link_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointLink.MdaTypes.COMMUNICATIONENDPOINT_LINK_PACKETSIZE_TAGTYPE_ELT, value);
    }

    @objid ("49929dc8-9c39-46d3-84db-d4c58a0bd174")
    protected CommunicationEndPointLink(final Link elt) {
        super(elt);
    }

    @objid ("ec3c2a29-b2d4-4eda-b723-867f8abb98cf")
    public static final class MdaTypes {
        @objid ("cc26c249-7a2e-4382-b400-0064fb592e4e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1bd60e4a-7f2a-40ba-b8da-55ef36d2bc43")
        public static TagType COMMUNICATIONENDPOINT_LINK_PACKETSIZE_TAGTYPE_ELT;

        @objid ("5de6c1a4-1d15-4dc5-9204-dc8456da5e9f")
        private static Stereotype MDAASSOCDEP;

        @objid ("85a9d48c-dfb2-4165-98b5-5f8de7f282d6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("297b0b9e-eb84-464f-a716-a1498b1ce0c7")
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
