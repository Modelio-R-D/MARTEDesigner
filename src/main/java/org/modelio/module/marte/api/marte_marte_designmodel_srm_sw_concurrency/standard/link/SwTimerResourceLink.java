/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.TimerResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << SwTimerResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("36459587-a2a6-43ea-af95-4e9da45e9a75")
public class SwTimerResourceLink extends TimerResourceLink {
    @objid ("74b5ab08-367a-401d-83a2-05f78407ba01")
    public static final String STEREOTYPE_NAME = "SwTimerResource_Link";

    /**
     * Tells whether a {@link SwTimerResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwTimerResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5b94daf7-30b9-4ca3-96d6-eaa8ce52ddb9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwTimerResource_Link >> then instantiate a {@link SwTimerResourceLink} proxy.
     * 
     * @return a {@link SwTimerResourceLink} proxy on the created {@link Link}.
     */
    @objid ("cdc52612-cf5d-4fa8-bc1c-7a8a68dc924b")
    public static SwTimerResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceLink.STEREOTYPE_NAME);
        return SwTimerResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceLink} proxy from a {@link Link} stereotyped << SwTimerResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SwTimerResourceLink} proxy or <i>null</i>.
     */
    @objid ("7fa6e89b-c55d-4d51-9977-ed86647ad33d")
    public static SwTimerResourceLink instantiate(final Link obj) {
        return SwTimerResourceLink.canInstantiate(obj) ? new SwTimerResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceLink} proxy from a {@link Link} stereotyped << SwTimerResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SwTimerResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fdebf05a-1642-4629-be34-7b1b389c7ede")
    public static SwTimerResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwTimerResourceLink.canInstantiate(obj))
        	return new SwTimerResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwTimerResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4612e749-b411-47ad-a1e6-a2b37d6c8731")
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
        SwTimerResourceLink other = (SwTimerResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("f557e419-a4a0-4492-9de0-593225d93faa")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("85e07534-5ff3-48f7-89ff-61f954bbb4a4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f3c5e79a-9e98-4092-a147-e3d04b9bbbdb")
    protected SwTimerResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("edf0116a-5833-4185-bb3f-0d38809a5982")
    public static final class MdaTypes {
        @objid ("69a93a8e-0a08-45ae-ba98-102fde3df741")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("191bde71-2907-44ad-9f9f-ddc2b0b78c3d")
        private static Stereotype MDAASSOCDEP;

        @objid ("9aefcf77-5e99-4d86-bdb9-8489d93dbeb8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4f0f8359-91c2-4a2e-a162-2822be2886c6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01dec063-0ccf-11df-8525-001302895b2b");
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
