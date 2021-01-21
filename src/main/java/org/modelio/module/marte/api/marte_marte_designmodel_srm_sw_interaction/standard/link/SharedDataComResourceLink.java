/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link;

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
 * Proxy class to handle a {@link Link} with << SharedDataComResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("335143b7-373b-436c-a115-efb37cfdc7a4")
public class SharedDataComResourceLink extends SwCommunicationResourceLink {
    @objid ("8a753a09-a39d-47f5-85c5-cc3bbbd8b85a")
    public static final String STEREOTYPE_NAME = "SharedDataComResource_Link";

    @objid ("cfe01d13-a441-44e9-b3aa-a501f55d324f")
    public static final String SHAREDDATACOMRESOURCE_LINK_READSERVICES_TAGTYPE = "SharedDataComResource_Link_readServices";

    @objid ("b6e59a62-03dd-40f9-90e8-0baacb4c7312")
    public static final String SHAREDDATACOMRESOURCE_LINK_WRITESERVICES_TAGTYPE = "SharedDataComResource_Link_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SharedDataComResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("38b6d07d-4c3c-4a07-990f-dd48f807b275")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SharedDataComResource_Link >> then instantiate a {@link SharedDataComResourceLink} proxy.
     * 
     * @return a {@link SharedDataComResourceLink} proxy on the created {@link Link}.
     */
    @objid ("c58a6a72-d4e9-41af-a4ea-bc355546a199")
    public static SharedDataComResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceLink.STEREOTYPE_NAME);
        return SharedDataComResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceLink} proxy from a {@link Link} stereotyped << SharedDataComResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SharedDataComResourceLink} proxy or <i>null</i>.
     */
    @objid ("a0ea7557-1fa6-4662-97fe-da82f2f5d309")
    public static SharedDataComResourceLink instantiate(final Link obj) {
        return SharedDataComResourceLink.canInstantiate(obj) ? new SharedDataComResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceLink} proxy from a {@link Link} stereotyped << SharedDataComResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SharedDataComResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("48b25284-d467-4172-bf83-41665a6d5727")
    public static SharedDataComResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SharedDataComResourceLink.canInstantiate(obj))
        	return new SharedDataComResourceLink(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ab99428b-129a-44d3-ae15-b1e571672204")
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
        SharedDataComResourceLink other = (SharedDataComResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("e652aa13-8f5c-41c1-b21d-790eaf0b47ab")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Link_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("aa94cc62-666d-4e62-841c-e92e22bd17f1")
    public List<String> getSharedDataComResource_Link_readServices() {
        return this.elt.getTagValues(SharedDataComResourceLink.MdaTypes.SHAREDDATACOMRESOURCE_LINK_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Link_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("20f49c80-6a6f-4b34-a386-2b48a5824cd6")
    public List<String> getSharedDataComResource_Link_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceLink.MdaTypes.SHAREDDATACOMRESOURCE_LINK_WRITESERVICES_TAGTYPE_ELT);
    }

    @objid ("4aae4699-6a4e-4ae8-8886-7410e0809d3d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Link_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2ae56d3-0fc9-4cb3-b90d-01ba61b0694c")
    public void setSharedDataComResource_Link_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceLink.MdaTypes.SHAREDDATACOMRESOURCE_LINK_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Link_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7f046ec4-46c6-4174-856e-391fee223b42")
    public void setSharedDataComResource_Link_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceLink.MdaTypes.SHAREDDATACOMRESOURCE_LINK_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("920906ba-65ce-4d17-93d8-f606b319152b")
    protected SharedDataComResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("f4725241-a696-4401-ad44-75d99eb1342f")
    public static final class MdaTypes {
        @objid ("0482e726-e92f-441d-ad17-cd2703c1695d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b71c37ce-acd1-41b7-8541-4a2e5d493b55")
        public static TagType SHAREDDATACOMRESOURCE_LINK_READSERVICES_TAGTYPE_ELT;

        @objid ("18fcde48-71a1-40b8-adef-2c8c58988a35")
        public static TagType SHAREDDATACOMRESOURCE_LINK_WRITESERVICES_TAGTYPE_ELT;

        @objid ("5b76c5d1-0908-4a8b-865d-f49bcea12e5d")
        private static Stereotype MDAASSOCDEP;

        @objid ("a87dabb9-15d1-4122-a978-7eabbc657b29")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("055c4e82-9158-42c4-be55-891e08dfefa9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0221815a-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_LINK_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02218161-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_LINK_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02218168-0ccf-11df-8525-001302895b2b");
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
