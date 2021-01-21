/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("ffce2a49-77f8-4bd5-9cae-bfe48a40adf5")
    public static final String STEREOTYPE_NAME = "HwMedia_Link";

    @objid ("ba5f6cc4-85be-4767-b8c4-aecea0714f13")
    public static final String HWMEDIA_LINK_ARBITERS_TAGTYPE = "HwMedia_Link_arbiters";

    @objid ("c1d15445-bd7f-4260-9240-ba2f7bb0f2e2")
    public static final String HWMEDIA_LINK_BANDWIDTH_TAGTYPE = "HwMedia_Link_bandwidth";

    /**
     * Tells whether a {@link HwMediaLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwMedia_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1f2699e0-45f9-4e1f-9375-a3b1f04a2cca")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwMedia_Link >> then instantiate a {@link HwMediaLink} proxy.
     * 
     * @return a {@link HwMediaLink} proxy on the created {@link Link}.
     */
    @objid ("ac908bbc-63e4-4057-83e3-5378329bd554")
    public static HwMediaLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaLink.STEREOTYPE_NAME);
        return HwMediaLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwMediaLink} proxy from a {@link Link} stereotyped << HwMedia_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwMediaLink} proxy or <i>null</i>.
     */
    @objid ("e6492bb1-d651-4f28-b45b-b142a68215f7")
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
    @objid ("14f7ec85-e60b-4cf1-bc1e-42c08cab2298")
    public static HwMediaLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwMediaLink.canInstantiate(obj))
        	return new HwMediaLink(obj);
        else
        	throw new IllegalArgumentException("HwMediaLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b1db0be5-5ed0-4942-af76-dc103394f485")
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
    @objid ("d02a151d-899d-4fc1-be28-da33a5aadc3d")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwMedia_Link_arbiters'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("11127826-bd82-47d7-8f89-e26dec1cd725")
    public List<String> getHwMedia_Link_arbiters() {
        return this.elt.getTagValues(HwMediaLink.MdaTypes.HWMEDIA_LINK_ARBITERS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMedia_Link_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4727a340-9053-459c-8a88-432bd661185d")
    public String getHwMedia_Link_bandwidth() {
        return this.elt.getTagValue(HwMediaLink.MdaTypes.HWMEDIA_LINK_BANDWIDTH_TAGTYPE_ELT);
    }

    @objid ("6b87467e-c128-4ba7-a6cc-5e3022f71a4b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwMedia_Link_arbiters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("622cde2c-1f76-4ad5-9d83-6a99952f0d67")
    public void setHwMedia_Link_arbiters(final List<String> values) {
        this.elt.putTagValues(HwMediaLink.MdaTypes.HWMEDIA_LINK_ARBITERS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMedia_Link_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bc52bc22-d0a8-4b29-bc24-c0af0c8c49d1")
    public void setHwMedia_Link_bandwidth(final String value) {
        this.elt.putTagValue(HwMediaLink.MdaTypes.HWMEDIA_LINK_BANDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("087626d6-92e5-4aae-9c06-c0c7245689dc")
    protected HwMediaLink(final Link elt) {
        super(elt);
    }

    @objid ("5e8b1c09-95ad-496f-a206-dd200c8c790f")
    public static final class MdaTypes {
        @objid ("95761283-693c-400c-a3fb-1dc4f118ea68")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("04fc7f41-2c1d-4d67-a68f-65e8010fd8fe")
        public static TagType HWMEDIA_LINK_ARBITERS_TAGTYPE_ELT;

        @objid ("06b2f7ce-546e-4178-b281-30ea1571424c")
        public static TagType HWMEDIA_LINK_BANDWIDTH_TAGTYPE_ELT;

        @objid ("9e2f1994-92a7-45bc-98e8-aeb311138720")
        private static Stereotype MDAASSOCDEP;

        @objid ("1087daee-84da-4cf6-8552-97e3c44b74e6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2a87b244-0fc4-4b52-9659-c234827e62d2")
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
