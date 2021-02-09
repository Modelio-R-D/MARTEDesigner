/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwMedia_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwMediaLink extends HwCommunicationResourceLink {
    public static final String STEREOTYPE_NAME = "HwMedia_Link";

    public static final String HWMEDIA_LINK_ARBITERS_TAGTYPE = "HwMedia_Link_arbiters";

    public static final String HWMEDIA_LINK_BANDWIDTH_TAGTYPE = "HwMedia_Link_bandwidth";

    /**
     * Tells whether a {@link HwMediaLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwMedia_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwMedia_Link >> then instantiate a {@link HwMediaLink} proxy.
     * 
     * @return a {@link HwMediaLink} proxy on the created {@link Link}.
     */
    public static HwMediaLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaLink.STEREOTYPE_NAME);
        return HwMediaLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwMediaLink} proxy from a {@link Link} stereotyped << HwMedia_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwMediaLink} proxy or <i>null</i>.
     */
    public static HwMediaLink instantiate(final Link obj) {
        return HwMediaLink.canInstantiate(obj) ? new HwMediaLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMediaLink} proxy from a {@link Link} stereotyped << HwMedia_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwMediaLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwMediaLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwMediaLink.canInstantiate(obj))
        	return new HwMediaLink(obj);
        else
        	throw new IllegalArgumentException("HwMediaLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwMediaLink other = (HwMediaLink) obj;
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
     * Getter for List<String> property 'HwMedia_Link_arbiters'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMedia_Link_arbiters() {
        return this.elt.getTagValues(HwMediaLink.MdaTypes.HWMEDIA_LINK_ARBITERS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMedia_Link_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMedia_Link_bandwidth() {
        return this.elt.getTagValue(HwMediaLink.MdaTypes.HWMEDIA_LINK_BANDWIDTH_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwMedia_Link_arbiters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMedia_Link_arbiters(final List<String> values) {
        this.elt.putTagValues(HwMediaLink.MdaTypes.HWMEDIA_LINK_ARBITERS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMedia_Link_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMedia_Link_bandwidth(final String value) {
        this.elt.putTagValue(HwMediaLink.MdaTypes.HWMEDIA_LINK_BANDWIDTH_TAGTYPE_ELT, value);
    }

    protected HwMediaLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMEDIA_LINK_ARBITERS_TAGTYPE_ELT;

        public static TagType HWMEDIA_LINK_BANDWIDTH_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0105cd3c-0ccf-11df-8525-001302895b2b");
            HWMEDIA_LINK_ARBITERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0b25d1d2-1727-11df-b92a-0014222a9f79");
            HWMEDIA_LINK_BANDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a49e181b-5d9c-11df-9e91-0014222a9f79");
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
