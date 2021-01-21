/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.link;

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
 * Proxy class to handle a {@link Link} with << HwSupport_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a3894f99-5264-473f-96c1-de5ea052ad03")
public class HwSupportLink extends HwDeviceLink {
    @objid ("07912297-c962-4086-a5ee-cccee88d70f5")
    public static final String STEREOTYPE_NAME = "HwSupport_Link";

    /**
     * Tells whether a {@link HwSupportLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwSupport_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("22046711-8322-4b1e-996b-ddacb1be9caf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwSupport_Link >> then instantiate a {@link HwSupportLink} proxy.
     * 
     * @return a {@link HwSupportLink} proxy on the created {@link Link}.
     */
    @objid ("102ec1cd-ec71-4bcc-8c2f-d415726aa395")
    public static HwSupportLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportLink.STEREOTYPE_NAME);
        return HwSupportLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwSupportLink} proxy from a {@link Link} stereotyped << HwSupport_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwSupportLink} proxy or <i>null</i>.
     */
    @objid ("1aa14bf9-fda5-436d-a504-d857e8b23370")
    public static HwSupportLink instantiate(final Link obj) {
        return HwSupportLink.canInstantiate(obj) ? new HwSupportLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSupportLink} proxy from a {@link Link} stereotyped << HwSupport_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwSupportLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("353ad00f-e48b-4f55-930e-e38df53e0bc1")
    public static HwSupportLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwSupportLink.canInstantiate(obj))
        	return new HwSupportLink(obj);
        else
        	throw new IllegalArgumentException("HwSupportLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fc271d5c-ea6d-4203-a562-fd017b4bab5f")
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
        HwSupportLink other = (HwSupportLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("8675a020-3c0a-4486-9500-15c2b948a683")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("20c6de18-8cd1-421a-afce-5fe8b3083473")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("201e71d0-00b8-46de-be9a-fbe53eb26767")
    protected HwSupportLink(final Link elt) {
        super(elt);
    }

    @objid ("b0d88575-b1fa-41d2-9448-ea5eaf594a78")
    public static final class MdaTypes {
        @objid ("6d7e7a8b-946e-440e-b208-cf7e6d13d9bb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c64bf3c2-a380-4180-a29d-c81a27fce8f4")
        private static Stereotype MDAASSOCDEP;

        @objid ("6e53bf28-f9a0-4c17-8824-b3ad3829df7b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("30597f57-9962-46dc-95bb-869a6d7ed252")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "013ca29b-0ccf-11df-8525-001302895b2b");
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
