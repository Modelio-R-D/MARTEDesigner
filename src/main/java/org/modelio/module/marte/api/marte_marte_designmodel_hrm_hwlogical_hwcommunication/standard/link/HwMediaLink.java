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
 * Proxy class to handle a {@link Link} with << HwMedia_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5a84bd49-2c62-44b7-8daa-d1ce58f065b1")
public class HwMediaLink extends HwCommunicationResourceLink {
    @objid ("c9c25441-4ad8-4e77-ace6-2d5aaf648837")
    public static final String STEREOTYPE_NAME = "HwMedia_Link";

    @objid ("7a410475-3ce2-4779-928f-a8aaf192fc32")
    public static final String HWMEDIA_LINK_ARBITERS_TAGTYPE = "HwMedia_Link_arbiters";

    @objid ("9d9595b4-a854-49b5-b446-13fc6ceb4cf4")
    public static final String HWMEDIA_LINK_BANDWIDTH_TAGTYPE = "HwMedia_Link_bandwidth";

    /**
     * Tells whether a {@link HwMediaLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwMedia_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("409d7ea8-c3dc-4811-b7b8-2a493f921d21")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwMedia_Link >> then instantiate a {@link HwMediaLink} proxy.
     * 
     * @return a {@link HwMediaLink} proxy on the created {@link Link}.
     */
    @objid ("5d1934ac-2558-4def-80ac-9e74f9c70573")
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
    @objid ("8d1f07df-0cfb-4556-a7a3-16c61753294f")
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
    @objid ("3edcb878-920a-41f8-b953-784618539516")
    public static HwMediaLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwMediaLink.canInstantiate(obj))
        	return new HwMediaLink(obj);
        else
        	throw new IllegalArgumentException("HwMediaLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e41810f7-d1b8-4807-ae49-f678c3a56630")
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
    @objid ("c8b943af-8918-4b13-9646-10f315e562d6")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwMedia_Link_arbiters'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e8f9a8ee-e2cf-4274-8248-8793a3002c26")
    public List<String> getHwMedia_Link_arbiters() {
        return this.elt.getTagValues(HwMediaLink.MdaTypes.HWMEDIA_LINK_ARBITERS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMedia_Link_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4036015c-b4e4-4ee7-ba36-d443757ba1f2")
    public String getHwMedia_Link_bandwidth() {
        return this.elt.getTagValue(HwMediaLink.MdaTypes.HWMEDIA_LINK_BANDWIDTH_TAGTYPE_ELT);
    }

    @objid ("8a5f5e6d-ff87-41b0-9648-4ce4b2b825c8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwMedia_Link_arbiters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("409e60d3-b352-4ad7-b8b8-161a96f3d458")
    public void setHwMedia_Link_arbiters(final List<String> values) {
        this.elt.putTagValues(HwMediaLink.MdaTypes.HWMEDIA_LINK_ARBITERS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMedia_Link_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b3ddf0c0-70f9-4e41-a5a9-f42ad5aae0a9")
    public void setHwMedia_Link_bandwidth(final String value) {
        this.elt.putTagValue(HwMediaLink.MdaTypes.HWMEDIA_LINK_BANDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("2dc7d724-8659-4ad3-803f-a811dd40fad7")
    protected HwMediaLink(final Link elt) {
        super(elt);
    }

    @objid ("5e8b1c09-95ad-496f-a206-dd200c8c790f")
    public static final class MdaTypes {
        @objid ("03d738fb-a1d3-4d95-a5b7-f154a59b8418")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3a85ea38-90a0-4343-8936-2350b1980b48")
        public static TagType HWMEDIA_LINK_ARBITERS_TAGTYPE_ELT;

        @objid ("377b1ca6-ff35-4dc3-a701-c6890bbafa5a")
        public static TagType HWMEDIA_LINK_BANDWIDTH_TAGTYPE_ELT;

        @objid ("5acedfa1-672b-4b26-9fce-e96063a6a559")
        private static Stereotype MDAASSOCDEP;

        @objid ("2c0761f0-d8fa-40d9-b450-e27e1052b5a5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("47314296-aa73-4b6f-8326-2b6618d9aae0")
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
