/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.SchedulableResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << GaCommChannel_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("03b946c8-0d2b-4b44-9768-5ea76730bf0c")
public class GaCommChannelLink extends SchedulableResourceLink {
    @objid ("3673ac5f-3d7a-4b58-a1cf-2db4905959bf")
    public static final String STEREOTYPE_NAME = "GaCommChannel_Link";

    @objid ("fe28823f-12e5-4a30-9c79-5890c6230203")
    public static final String GACOMMCHANNEL_LINK_PACKETSIZE_TAGTYPE = "GaCommChannel_Link_packetSize";

    @objid ("acea610e-82d5-483c-9066-dc0935143f47")
    public static final String GACOMMCHANNEL_LINK_UTILIZATION_TAGTYPE = "GaCommChannel_Link_utilization";

    /**
     * Tells whether a {@link GaCommChannelLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << GaCommChannel_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b83dea56-aa3e-4e6f-8cdc-5da4fd4615ab")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << GaCommChannel_Link >> then instantiate a {@link GaCommChannelLink} proxy.
     * 
     * @return a {@link GaCommChannelLink} proxy on the created {@link Link}.
     */
    @objid ("f3237ef7-ed33-4871-b605-d969cf659901")
    public static GaCommChannelLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelLink.STEREOTYPE_NAME);
        return GaCommChannelLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link GaCommChannelLink} proxy from a {@link Link} stereotyped << GaCommChannel_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link GaCommChannelLink} proxy or <i>null</i>.
     */
    @objid ("c773a3b9-aa41-42cc-bd11-c1f3ef6a1108")
    public static GaCommChannelLink instantiate(final Link obj) {
        return GaCommChannelLink.canInstantiate(obj) ? new GaCommChannelLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommChannelLink} proxy from a {@link Link} stereotyped << GaCommChannel_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link GaCommChannelLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0e1df6b5-d610-40b6-8af5-ea93e79e5c12")
    public static GaCommChannelLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (GaCommChannelLink.canInstantiate(obj))
        	return new GaCommChannelLink(obj);
        else
        	throw new IllegalArgumentException("GaCommChannelLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c45f5d30-65fb-4601-9326-0d610b097221")
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
        GaCommChannelLink other = (GaCommChannelLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("91d40371-aebf-4cec-9d67-7ff273ba92bb")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'GaCommChannel_Link_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a9deed66-0a3e-4bda-9cc8-145461e4e56b")
    public String getGaCommChannel_Link_packetSize() {
        return this.elt.getTagValue(GaCommChannelLink.MdaTypes.GACOMMCHANNEL_LINK_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommChannel_Link_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ece0f9d0-8263-44a4-b777-581d887b16d2")
    public List<String> getGaCommChannel_Link_utilization() {
        return this.elt.getTagValues(GaCommChannelLink.MdaTypes.GACOMMCHANNEL_LINK_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("27c028e8-e246-416d-af51-a47ac32c55dd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaCommChannel_Link_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bfab7831-1bf4-4ceb-8760-644243c042c1")
    public void setGaCommChannel_Link_packetSize(final String value) {
        this.elt.putTagValue(GaCommChannelLink.MdaTypes.GACOMMCHANNEL_LINK_PACKETSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommChannel_Link_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("41417310-b8f8-4e0d-a539-42f550dbf2a1")
    public void setGaCommChannel_Link_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommChannelLink.MdaTypes.GACOMMCHANNEL_LINK_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("e295bc13-37a6-49e4-a2c5-4818cddfa7cd")
    protected GaCommChannelLink(final Link elt) {
        super(elt);
    }

    @objid ("a7ac0d9e-8f99-4cfc-81ae-aec243007346")
    public static final class MdaTypes {
        @objid ("c56591d7-4780-4cc3-a8b5-18c36a36cde2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a755e592-9c76-4ada-9b6d-76445c881875")
        public static TagType GACOMMCHANNEL_LINK_PACKETSIZE_TAGTYPE_ELT;

        @objid ("d4a755f8-28ab-417e-abb8-ecb38d235f6b")
        public static TagType GACOMMCHANNEL_LINK_UTILIZATION_TAGTYPE_ELT;

        @objid ("bf865efc-6ebe-4f94-9251-89d0150fdeec")
        private static Stereotype MDAASSOCDEP;

        @objid ("ad60f517-5300-4286-af41-b9a93287ce6b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("17d5dda7-3f1f-4566-ae78-24b32323a1b5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "036f462e-0ccf-11df-8525-001302895b2b");
            GACOMMCHANNEL_LINK_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036f4635-0ccf-11df-8525-001302895b2b");
            GACOMMCHANNEL_LINK_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036f463c-0ccf-11df-8525-001302895b2b");
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
