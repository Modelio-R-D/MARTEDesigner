/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.link.HwResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwCommunicationResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8b6a32a7-6ba7-4aac-a420-33073cc60b62")
public class HwCommunicationResourceLink extends HwResourceLink {
    @objid ("e4b4bea7-241a-4de2-8433-e7598b540126")
    public static final String STEREOTYPE_NAME = "HwCommunicationResource_Link";

    /**
     * Tells whether a {@link HwCommunicationResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwCommunicationResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0e442b32-2fe4-4ec3-bf3e-a38d9a3a03d2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwCommunicationResource_Link >> then instantiate a {@link HwCommunicationResourceLink} proxy.
     * 
     * @return a {@link HwCommunicationResourceLink} proxy on the created {@link Link}.
     */
    @objid ("abe84bb5-b5b9-45a7-a737-78127b3d6885")
    public static HwCommunicationResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceLink.STEREOTYPE_NAME);
        return HwCommunicationResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceLink} proxy from a {@link Link} stereotyped << HwCommunicationResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwCommunicationResourceLink} proxy or <i>null</i>.
     */
    @objid ("6ea2a9fd-06f8-4ca5-b2c6-2743d9204be7")
    public static HwCommunicationResourceLink instantiate(final Link obj) {
        return HwCommunicationResourceLink.canInstantiate(obj) ? new HwCommunicationResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceLink} proxy from a {@link Link} stereotyped << HwCommunicationResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwCommunicationResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("843f812c-b3fa-4a62-8f72-ef784cea3331")
    public static HwCommunicationResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwCommunicationResourceLink.canInstantiate(obj))
        	return new HwCommunicationResourceLink(obj);
        else
        	throw new IllegalArgumentException("HwCommunicationResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("28db68ef-782b-486b-baff-34f34ad73798")
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
        HwCommunicationResourceLink other = (HwCommunicationResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("08dad797-846c-4c52-ba56-c4b9de554789")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("7e426a71-b72b-49da-af45-60930db9cf8e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("265112a1-b5d7-4697-b815-433b29487e6c")
    protected HwCommunicationResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("7afcfb60-8fbc-44bd-9854-0367ea63cc75")
    public static final class MdaTypes {
        @objid ("ea15636d-a042-4690-9b3a-c4e1b1e65ae1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("689ceab8-0893-40a1-8ad6-3cfd5460a930")
        private static Stereotype MDAASSOCDEP;

        @objid ("5c4679e5-1730-44ec-b824-e05801766ef9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b365aa3b-1ea3-49c7-a828-f3d9119c3166")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00fea647-0ccf-11df-8525-001302895b2b");
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
