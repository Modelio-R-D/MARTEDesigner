/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.link;

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
public class GaCommChannelLink extends SchedulableResourceLink {
    public static final String STEREOTYPE_NAME = "GaCommChannel_Link";

    public static final String GACOMMCHANNEL_LINK_PACKETSIZE_TAGTYPE = "GaCommChannel_Link_packetSize";

    public static final String GACOMMCHANNEL_LINK_UTILIZATION_TAGTYPE = "GaCommChannel_Link_utilization";

    /**
     * Tells whether a {@link GaCommChannelLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << GaCommChannel_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << GaCommChannel_Link >> then instantiate a {@link GaCommChannelLink} proxy.
     * 
     * @return a {@link GaCommChannelLink} proxy on the created {@link Link}.
     */
    public static GaCommChannelLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelLink.STEREOTYPE_NAME);
        return GaCommChannelLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link GaCommChannelLink} proxy from a {@link Link} stereotyped << GaCommChannel_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link GaCommChannelLink} proxy or <i>null</i>.
     */
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
    public static GaCommChannelLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (GaCommChannelLink.canInstantiate(obj))
        	return new GaCommChannelLink(obj);
        else
        	throw new IllegalArgumentException("GaCommChannelLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaCommChannelLink other = (GaCommChannelLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'GaCommChannel_Link_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommChannel_Link_packetSize() {
        return this.elt.getTagValue(GaCommChannelLink.MdaTypes.GACOMMCHANNEL_LINK_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommChannel_Link_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommChannel_Link_utilization() {
        return this.elt.getTagValues(GaCommChannelLink.MdaTypes.GACOMMCHANNEL_LINK_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaCommChannel_Link_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommChannel_Link_packetSize(final String value) {
        this.elt.putTagValue(GaCommChannelLink.MdaTypes.GACOMMCHANNEL_LINK_PACKETSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommChannel_Link_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommChannel_Link_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommChannelLink.MdaTypes.GACOMMCHANNEL_LINK_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaCommChannelLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GACOMMCHANNEL_LINK_PACKETSIZE_TAGTYPE_ELT;

        public static TagType GACOMMCHANNEL_LINK_UTILIZATION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
